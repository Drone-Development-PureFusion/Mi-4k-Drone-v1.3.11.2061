package cn.sharesdk.framework.p076b;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.p076b.p077a.C0799c;
import cn.sharesdk.framework.p076b.p077a.C0800d;
import cn.sharesdk.framework.p076b.p077a.C0801e;
import cn.sharesdk.framework.p076b.p078b.AbstractC0805c;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.p255mi.live.openlivesdk.C10024b;
import java.util.ArrayList;
import java.util.HashMap;
import org.p286a.p287a.C11086e;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* renamed from: cn.sharesdk.framework.b.c */
/* loaded from: classes.dex */
public class C0811c {

    /* renamed from: a */
    private String f1590a;

    /* renamed from: b */
    private Context f1591b;

    /* renamed from: c */
    private C0801e f1592c;

    /* renamed from: d */
    private DeviceHelper f1593d;

    /* renamed from: e */
    private NetworkHelper f1594e = new NetworkHelper();

    /* renamed from: f */
    private Hashon f1595f = new Hashon();

    /* renamed from: g */
    private String f1596g;

    /* renamed from: h */
    private String f1597h;

    /* renamed from: i */
    private boolean f1598i;

    /* renamed from: j */
    private HashMap<String, String> f1599j;

    public C0811c(Context context, String str) {
        this.f1590a = str;
        this.f1591b = context.getApplicationContext();
        this.f1592c = C0801e.m37936a(this.f1591b);
        this.f1593d = DeviceHelper.getInstance(this.f1591b);
        try {
            this.f1599j = (HashMap) this.f1592c.m37914h("buffered_server_paths");
        } catch (Throwable th) {
            this.f1599j = new HashMap<>();
        }
        m37887g();
    }

    /* renamed from: d */
    private String m37890d(String str) {
        boolean m37929b = this.f1592c.m37929b();
        boolean m37925c = this.f1592c.m37925c();
        StringBuilder sb = new StringBuilder();
        sb.append(Data.urlEncode(this.f1593d.getPackageName(), "utf-8")).append("|");
        sb.append(Data.urlEncode(this.f1593d.getAppVersionName(), "utf-8")).append("|");
        sb.append(Data.urlEncode(String.valueOf(60070), "utf-8")).append("|");
        sb.append(Data.urlEncode(String.valueOf(this.f1593d.getPlatformCode()), "utf-8")).append("|");
        sb.append(Data.urlEncode(this.f1593d.getDetailNetworkTypeForStatic(), "utf-8")).append("|");
        if (m37929b) {
            sb.append(Data.urlEncode(String.valueOf(this.f1593d.getOSVersionInt()), "utf-8")).append("|");
            sb.append(Data.urlEncode(this.f1593d.getScreenSize(), "utf-8")).append("|");
            sb.append(Data.urlEncode(this.f1593d.getManufacturer(), "utf-8")).append("|");
            sb.append(Data.urlEncode(this.f1593d.getModel(), "utf-8")).append("|");
            sb.append(Data.urlEncode(this.f1593d.getCarrier(), "utf-8")).append("|");
        } else {
            sb.append("|||||");
        }
        if (m37925c) {
            sb.append(str);
        } else {
            sb.append(str.split("\\|")[0]);
            sb.append("|||||");
        }
        String sb2 = sb.toString();
        C0831d.m37772a().m6194i("shorLinkMsg ===>>>>", sb2);
        return Base64.encodeToString(Data.AES128Encode(Data.rawMD5(String.format("%s:%s", this.f1593d.getDeviceKey(), this.f1590a)), sb2), 2);
    }

    /* renamed from: g */
    private void m37887g() {
        this.f1596g = (this.f1593d.getPackageName() + "/" + this.f1593d.getAppVersionName()) + " ShareSDK/2.8.1 " + ("Android/" + this.f1593d.getOSVersionInt());
        this.f1597h = "http://api.share.mob.com:80";
        this.f1598i = true;
    }

    /* renamed from: h */
    private String m37886h() {
        return this.f1597h + "/conn";
    }

    /* renamed from: i */
    private String m37885i() {
        return (this.f1599j == null || !this.f1599j.containsKey("/date")) ? this.f1597h + "/date" : this.f1599j.get("/date") + "/date";
    }

    /* renamed from: j */
    private String m37884j() {
        return this.f1597h + "/conf5";
    }

    /* renamed from: k */
    private String m37883k() {
        return "http://up.sharesdk.cn/upload/image";
    }

    /* renamed from: l */
    private String m37882l() {
        return (this.f1599j == null || !this.f1599j.containsKey("/log4")) ? this.f1597h + "/log4" : this.f1599j.get("/log4") + "/log4";
    }

    /* renamed from: m */
    private String m37881m() {
        return "http://l.mob.com/url/ShareSdkMapping.do";
    }

    /* renamed from: n */
    private String m37880n() {
        return (this.f1599j == null || !this.f1599j.containsKey("/snsconf")) ? this.f1597h + "/snsconf" : this.f1599j.get("/snsconf") + "/snsconf";
    }

    /* renamed from: a */
    public HashMap<String, Object> m37903a() {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>(C10024b.f30903f, this.f1590a));
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>(C11086e.f35703Y, this.f1596g));
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        networkTimeOut.readTimout = 30000;
        networkTimeOut.connectionTimeout = 30000;
        String httpPost = this.f1594e.httpPost(m37886h(), arrayList, null, arrayList2, networkTimeOut);
        C0831d.m37772a().m6194i(" isConnectToServer response == %s", httpPost);
        return this.f1595f.fromJson(httpPost);
    }

    /* renamed from: a */
    public HashMap<String, Object> m37900a(String str, ArrayList<String> arrayList, int i, String str2) {
        if (!this.f1598i) {
            return null;
        }
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("key", this.f1590a));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(new KVPair<>("urls", arrayList.get(i2).toString()));
        }
        arrayList2.add(new KVPair<>("deviceid", this.f1593d.getDeviceKey()));
        arrayList2.add(new KVPair<>("snsplat", String.valueOf(i)));
        String m37890d = m37890d(str2);
        if (TextUtils.isEmpty(m37890d)) {
            return null;
        }
        arrayList2.add(new KVPair<>(C0548a.f931b, m37890d));
        ArrayList<KVPair<String>> arrayList3 = new ArrayList<>();
        arrayList3.add(new KVPair<>(C11086e.f35703Y, this.f1596g));
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        networkTimeOut.readTimout = 5000;
        networkTimeOut.connectionTimeout = 5000;
        String httpPost = this.f1594e.httpPost(m37881m(), arrayList2, null, arrayList3, networkTimeOut);
        C0831d.m37772a().m6194i("> SERVER_SHORT_LINK_URL  resp: %s", httpPost);
        if (TextUtils.isEmpty(httpPost)) {
            this.f1598i = false;
            return null;
        }
        HashMap<String, Object> fromJson = this.f1595f.fromJson(httpPost);
        if (((Integer) fromJson.get("status")).intValue() != 200) {
            return null;
        }
        return fromJson;
    }

    /* renamed from: a */
    public void m37902a(AbstractC0805c abstractC0805c) {
        C0800d.m37941a(this.f1591b, abstractC0805c.toString(), abstractC0805c.f1556e);
    }

    /* renamed from: a */
    public void m37901a(String str) {
        this.f1597h = str;
    }

    /* renamed from: a */
    public void m37898a(ArrayList<String> arrayList) {
        C0800d.m37939a(this.f1591b, arrayList);
    }

    /* renamed from: a */
    public void m37897a(HashMap<String, String> hashMap) {
        this.f1599j = hashMap;
        this.f1592c.m37932a("buffered_server_paths", this.f1599j);
    }

    /* renamed from: a */
    public boolean m37899a(String str, boolean z) {
        try {
            if ("none".equals(this.f1593d.getDetailNetworkTypeForStatic())) {
                throw new IllegalStateException("network is disconnected!");
            }
            ArrayList<KVPair<String>> arrayList = new ArrayList<>();
            arrayList.add(new KVPair<>(C0548a.f931b, str));
            arrayList.add(new KVPair<>("t", z ? "1" : "0"));
            ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
            arrayList2.add(new KVPair<>(C11086e.f35703Y, this.f1596g));
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 30000;
            networkTimeOut.connectionTimeout = 30000;
            String httpPost = this.f1594e.httpPost(m37882l(), arrayList, null, arrayList2, networkTimeOut);
            C0831d.m37772a().m6194i("> Upload All Log  resp: %s", httpPost);
            return TextUtils.isEmpty(httpPost) || ((Integer) this.f1595f.fromJson(httpPost).get("status")).intValue() == 200;
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return false;
        }
    }

    /* renamed from: b */
    public long m37896b() {
        if (!this.f1592c.m37917g()) {
            return 0L;
        }
        String str = "{}";
        try {
            str = this.f1594e.httpGet(m37885i(), null, null, null);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
        HashMap fromJson = this.f1595f.fromJson(str);
        if (!fromJson.containsKey("timestamp")) {
            return this.f1592c.m37938a();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - ResHelper.parseLong(String.valueOf(fromJson.get("timestamp")));
            this.f1592c.m37933a("service_time", Long.valueOf(currentTimeMillis));
            return currentTimeMillis;
        } catch (Throwable th2) {
            C0831d.m37772a().m6199d(th2);
            return this.f1592c.m37938a();
        }
    }

    /* renamed from: b */
    public HashMap<String, Object> m37895b(String str) {
        KVPair<String> kVPair = new KVPair<>("file", str);
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>(C11086e.f35703Y, this.f1596g));
        String httpPost = this.f1594e.httpPost(m37883k(), null, kVPair, arrayList, null);
        C0831d.m37772a().m6194i("upload file response == %s", httpPost);
        return this.f1595f.fromJson(httpPost);
    }

    /* renamed from: b */
    public void m37894b(HashMap<String, Object> hashMap) {
        this.f1592c.m37931a(this.f1590a, this.f1595f.fromHashMap(hashMap));
    }

    /* renamed from: c */
    public HashMap<String, Object> m37893c() {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>(C10024b.f30903f, this.f1590a));
        arrayList.add(new KVPair<>("device", this.f1593d.getDeviceKey()));
        arrayList.add(new KVPair<>("plat", String.valueOf(this.f1593d.getPlatformCode())));
        arrayList.add(new KVPair<>("apppkg", this.f1593d.getPackageName()));
        arrayList.add(new KVPair<>("appver", String.valueOf(this.f1593d.getAppVersion())));
        arrayList.add(new KVPair<>("sdkver", String.valueOf(60070)));
        arrayList.add(new KVPair<>("networktype", this.f1593d.getDetailNetworkTypeForStatic()));
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>(C11086e.f35703Y, this.f1596g));
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        networkTimeOut.readTimout = 10000;
        networkTimeOut.connectionTimeout = 10000;
        String httpPost = this.f1594e.httpPost(m37884j(), arrayList, null, arrayList2, networkTimeOut);
        C0831d.m37772a().m6194i(" get server config response == %s", httpPost);
        return this.f1595f.fromJson(httpPost);
    }

    /* renamed from: c */
    public HashMap<String, Object> m37892c(String str) {
        return this.f1595f.fromJson(new String(Data.AES128Decode(Data.rawMD5(this.f1590a + ":" + this.f1593d.getDeviceKey()), Base64.decode(str, 2)), "UTF-8").trim());
    }

    /* renamed from: d */
    public HashMap<String, Object> m37891d() {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>(C10024b.f30903f, this.f1590a));
        arrayList.add(new KVPair<>("device", this.f1593d.getDeviceKey()));
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>(C11086e.f35703Y, this.f1596g));
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        networkTimeOut.readTimout = 10000;
        networkTimeOut.connectionTimeout = 10000;
        return this.f1595f.fromJson(this.f1594e.httpPost(m37880n(), arrayList, null, arrayList2, networkTimeOut));
    }

    /* renamed from: e */
    public ArrayList<C0799c> m37889e() {
        ArrayList<C0799c> m37942a = C0800d.m37942a(this.f1591b);
        return m37942a == null ? new ArrayList<>() : m37942a;
    }

    /* renamed from: f */
    public HashMap<String, Object> m37888f() {
        return this.f1595f.fromJson(this.f1592c.m37920e(this.f1590a));
    }
}
