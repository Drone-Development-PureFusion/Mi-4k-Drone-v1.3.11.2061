package com.xiaomi.mistatistic.sdk.controller;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.p004v7.media.SystemMediaRouteProvider;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.utils.p219a.C3070c;
import com.google.android.gms.location.places.AbstractC8240d;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.BuildSetting;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.j */
/* loaded from: classes2.dex */
public class C10529j {

    /* renamed from: a */
    private static C10529j f32680a = new C10529j();

    /* renamed from: b */
    private HttpEventFilter f32681b;

    /* renamed from: c */
    private boolean f32682c = false;

    /* renamed from: d */
    private List f32683d = new LinkedList();

    /* renamed from: e */
    private Handler f32684e = new HandlerC10530k(this, Looper.getMainLooper());

    private C10529j() {
    }

    /* renamed from: a */
    public static C10529j m4837a() {
        return f32680a;
    }

    /* renamed from: a */
    private void m4832a(JSONObject jSONObject) {
        if (jSONObject.has(UriUtil.DATA_SCHEME)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME);
            int optInt = jSONObject2.optInt(FimiMediaMeta.IJKM_KEY_SAMPLE_RATE, 10000);
            int optInt2 = jSONObject2.optInt("delay", 300000);
            long optLong = jSONObject2.optLong("ban_time", 0L);
            C10538s.m4809b(AbstractC10508a.m4880a(), "rt_upload_rate", optInt);
            C10538s.m4808b(AbstractC10508a.m4880a(), "rt_upload_delay", optInt2);
            C10538s.m4808b(AbstractC10508a.m4880a(), "rt_ban_time", System.currentTimeMillis() + optLong);
        }
    }

    /* renamed from: e */
    private String m4827e() {
        return BuildSetting.isTest() ? "http://10.99.168.145:8097/realtime_network" : "https://data.mistat.xiaomi.com/realtime_network";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public boolean m4826f() {
        HashMap hashMap = new HashMap();
        synchronized (this.f32683d) {
            for (HttpEvent httpEvent : this.f32683d) {
                String url = httpEvent.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    if (hashMap.containsKey(url)) {
                        ((List) hashMap.get(url)).add(httpEvent);
                    } else {
                        hashMap.put(url, new ArrayList());
                        ((List) hashMap.get(url)).add(httpEvent);
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str : hashMap.keySet()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (HttpEvent httpEvent2 : (List) hashMap.get(str)) {
                        jSONArray2.put(httpEvent2.toJSON());
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put(UriUtil.DATA_SCHEME, jSONArray2);
                    jSONArray.put(jSONObject);
                }
                return m4833a(jSONArray.toString());
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m4836a(HttpEventFilter httpEventFilter) {
        this.f32681b = httpEventFilter;
    }

    /* renamed from: a */
    public void m4834a(HttpEvent httpEvent) {
        if (!httpEvent.getUrl().equals(m4827e()) || this.f32682c) {
            if (this.f32681b != null && !httpEvent.getUrl().equals(m4827e())) {
                httpEvent = this.f32681b.onEvent(httpEvent);
            }
            if (httpEvent == null || TextUtils.isEmpty(httpEvent.getUrl())) {
                return;
            }
            synchronized (this.f32683d) {
                this.f32683d.add(httpEvent);
                if (this.f32683d.size() > 100) {
                    this.f32683d.remove(0);
                }
            }
            if (this.f32684e.hasMessages(AbstractC8240d.f27013bp) || httpEvent.getUrl().equals(m4827e())) {
                return;
            }
            this.f32684e.sendEmptyMessageDelayed(AbstractC8240d.f27013bp, m4828d());
        }
    }

    /* renamed from: a */
    public boolean m4833a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("app_id", AbstractC10508a.m4878b()));
        arrayList.add(new BasicNameValuePair("app_package", AbstractC10508a.m4880a().getPackageName()));
        arrayList.add(new BasicNameValuePair("device_uuid", C10526g.m4852a(AbstractC10508a.m4880a())));
        arrayList.add(new BasicNameValuePair("device_os", SystemMediaRouteProvider.PACKAGE_NAME + Build.VERSION.SDK_INT));
        arrayList.add(new BasicNameValuePair("device_model", Build.MODEL));
        arrayList.add(new BasicNameValuePair(Constants.EXTRA_KEY_APP_VERSION, AbstractC10508a.m4875e()));
        arrayList.add(new BasicNameValuePair("app_channel", AbstractC10508a.m4876d()));
        arrayList.add(new BasicNameValuePair(C3070c.C3071a.f11505i, String.valueOf(System.currentTimeMillis())));
        arrayList.add(new BasicNameValuePair("net_value", str));
        String m4820a = AbstractC10536q.m4820a(AbstractC10508a.m4880a(), m4827e(), arrayList);
        new C10534o().m4823a("http data complete, result=" + m4820a);
        if (!TextUtils.isEmpty(m4820a)) {
            JSONObject jSONObject = new JSONObject(m4820a);
            if ("ok".equals(jSONObject.getString("status"))) {
                m4832a(jSONObject);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public List m4831b() {
        LinkedList linkedList;
        synchronized (this.f32683d) {
            linkedList = new LinkedList(this.f32683d);
        }
        return linkedList;
    }

    /* renamed from: c */
    public boolean m4829c() {
        return System.currentTimeMillis() > C10538s.m4811a(AbstractC10508a.m4880a(), "rt_ban_time", 0L) && Math.random() * 10000.0d <= ((double) C10538s.m4812a(AbstractC10508a.m4880a(), "rt_upload_rate", 10000));
    }

    /* renamed from: d */
    public long m4828d() {
        return C10538s.m4811a(AbstractC10508a.m4880a(), "rt_upload_delay", (long) MiStatInterface.MIN_UPLOAD_INTERVAL);
    }
}
