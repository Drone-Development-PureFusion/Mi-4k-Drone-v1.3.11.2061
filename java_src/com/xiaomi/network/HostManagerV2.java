package com.xiaomi.network;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.tencent.stat.DeviceInfo;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.network.AbstractC10422c;
import com.xiaomi.channel.commonutils.network.C10420a;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.network.HostManager;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class HostManagerV2 extends HostManager {

    /* renamed from: a */
    private final int f32743a;

    /* renamed from: b */
    private final int f32744b;

    /* renamed from: c */
    private int f32745c;

    /* JADX INFO: Access modifiers changed from: protected */
    public HostManagerV2(Context context, HostFilter hostFilter, HostManager.HttpGet httpGet, String str) {
        this(context, hostFilter, httpGet, str, null, null);
    }

    protected HostManagerV2(Context context, HostFilter hostFilter, HostManager.HttpGet httpGet, String str, String str2, String str3) {
        super(context, hostFilter, httpGet, str, str2, str3);
        this.f32743a = 80;
        this.f32744b = 5222;
        this.f32745c = 80;
        addReservedHost("resolver.msg.xiaomi.net", "resolver.msg.xiaomi.net:5222");
    }

    /* renamed from: a */
    static String m4751a(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                byte b = bytes[i];
                if ((b & 240) != 240) {
                    bytes[i] = (byte) (((b & 15) ^ ((byte) (((b >> 4) + length) & 15))) | (b & 240));
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    /* renamed from: a */
    protected JSONObject m4752a() {
        JSONObject jSONObject;
        synchronized (this.mHostsMapping) {
            jSONObject = new JSONObject();
            jSONObject.put(DeviceInfo.TAG_VERSION, 2);
            jSONObject.put(UriUtil.DATA_SCHEME, toJSON());
        }
        return jSONObject;
    }

    /* renamed from: b */
    protected void m4750b(String str) {
        synchronized (this.mHostsMapping) {
            this.mHostsMapping.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt(DeviceInfo.TAG_VERSION) != 2) {
                throw new JSONException("Bad version");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(UriUtil.DATA_SCHEME);
            for (int i = 0; i < optJSONArray.length(); i++) {
                Fallbacks fromJSON = new Fallbacks().fromJSON(optJSONArray.getJSONObject(i));
                this.mHostsMapping.put(fromJSON.getHost(), fromJSON);
            }
        }
    }

    @Override // com.xiaomi.network.HostManager
    protected boolean checkHostMapping() {
        synchronized (this.mHostsMapping) {
            if (!hostLoaded) {
                hostLoaded = true;
                this.mHostsMapping.clear();
                String loadHosts = loadHosts();
                if (TextUtils.isEmpty(loadHosts)) {
                    return false;
                }
                m4750b(loadHosts);
                AbstractC10404b.m5266b("loading the new hosts succeed");
                return true;
            }
            return true;
        }
    }

    @Override // com.xiaomi.network.HostManager
    protected String getHost() {
        return "resolver.msg.xiaomi.net";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.network.HostManager
    public String getRemoteFallbackJSON(ArrayList<String> arrayList, String str, String str2) {
        ArrayList<String> m4770a;
        String str3 = null;
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<AbstractC10422c> arrayList3 = new ArrayList();
        arrayList3.add(new C10420a("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new C10420a("conpt", m4751a(C10423d.m5206k(this.sAppContext))));
        }
        arrayList3.add(new C10420a("uuid", str2));
        arrayList3.add(new C10420a("list", join(arrayList, Constants.ACCEPT_TIME_SEPARATOR_SP)));
        Fallback localFallback = getLocalFallback("resolver.msg.xiaomi.net");
        String format = String.format(Locale.US, "http://%1$s/gslb/?ver=3.0", "resolver.msg.xiaomi.net:" + this.f32745c);
        if (localFallback == null) {
            arrayList2.add(format);
            synchronized (mReservedHosts) {
                Iterator<String> it2 = mReservedHosts.get("resolver.msg.xiaomi.net").iterator();
                while (it2.hasNext()) {
                    arrayList2.add(String.format(Locale.US, "http://%1$s/gslb/?ver=3.0", it2.next()));
                }
            }
            m4770a = arrayList2;
        } else {
            m4770a = localFallback.m4770a(format);
        }
        Iterator<String> it3 = m4770a.iterator();
        IOException e = null;
        while (it3.hasNext()) {
            Uri.Builder buildUpon = Uri.parse(it3.next()).buildUpon();
            for (AbstractC10422c abstractC10422c : arrayList3) {
                buildUpon.appendQueryParameter(abstractC10422c.mo5230a(), abstractC10422c.mo5229b());
            }
            try {
                str3 = this.sHttpGetter == null ? C10423d.m5225a(this.sAppContext, new URL(buildUpon.toString())) : this.sHttpGetter.mo4358a(buildUpon.toString());
                return str3;
            } catch (IOException e2) {
                e = e2;
            }
        }
        return e != null ? super.getRemoteFallbackJSON(arrayList, str, str2) : str3;
    }

    @Override // com.xiaomi.network.HostManager
    public void persist() {
        synchronized (this.mHostsMapping) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.sAppContext.openFileOutput(getProcessName(), 0)));
                String jSONObject = m4752a().toString();
                if (!TextUtils.isEmpty(jSONObject)) {
                    bufferedWriter.write(jSONObject);
                }
                bufferedWriter.close();
            } catch (Exception e) {
                AbstractC10404b.m5269a("persist bucket failure: " + e.getMessage());
            }
        }
    }

    @Override // com.xiaomi.network.HostManager
    public void purge() {
        synchronized (this.mHostsMapping) {
            for (Fallbacks fallbacks : this.mHostsMapping.values()) {
                fallbacks.purge(true);
            }
            boolean z = false;
            while (!z) {
                Iterator<String> it2 = this.mHostsMapping.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    String next = it2.next();
                    if (this.mHostsMapping.get(next).getFallbacks().isEmpty()) {
                        this.mHostsMapping.remove(next);
                        z = false;
                        break;
                    }
                }
            }
        }
    }
}
