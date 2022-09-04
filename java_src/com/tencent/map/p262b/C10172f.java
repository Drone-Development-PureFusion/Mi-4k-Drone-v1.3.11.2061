package com.tencent.map.p262b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import com.fimi.soul.utils.C3115ay;
import com.google.firebase.p251a.C9654a;
import com.tencent.map.p260a.p261a.C10152b;
import com.tencent.map.p260a.p261a.C10153c;
import com.tencent.map.p260a.p261a.C10154d;
import com.tencent.map.p262b.C10157b;
import com.tencent.map.p262b.C10163d;
import com.tencent.map.p262b.C10168e;
import com.tencent.map.p262b.C10178g;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.tencent.map.b.f */
/* loaded from: classes2.dex */
public final class C10172f implements C10157b.AbstractC10158a, C10163d.AbstractC10167c, C10168e.AbstractC10171c, C10178g.AbstractC10182c {

    /* renamed from: t */
    private static boolean f31429t = false;

    /* renamed from: u */
    private static C10172f f31430u = null;

    /* renamed from: c */
    private C10168e f31449c;

    /* renamed from: d */
    private C10163d f31450d;

    /* renamed from: e */
    private C10178g f31451e;

    /* renamed from: k */
    private int f31457k;

    /* renamed from: l */
    private int f31458l;

    /* renamed from: m */
    private int f31459m;

    /* renamed from: a */
    private long f31447a = 5000;

    /* renamed from: b */
    private Context f31448b = null;

    /* renamed from: f */
    private int f31452f = 1024;

    /* renamed from: g */
    private int f31453g = 4;

    /* renamed from: h */
    private C10160c f31454h = null;

    /* renamed from: i */
    private C10157b f31455i = null;

    /* renamed from: j */
    private C10152b f31456j = null;

    /* renamed from: n */
    private byte[] f31460n = new byte[0];

    /* renamed from: o */
    private byte[] f31461o = new byte[0];

    /* renamed from: p */
    private boolean f31462p = false;

    /* renamed from: q */
    private HandlerC10177c f31463q = null;

    /* renamed from: r */
    private C10176b f31464r = null;

    /* renamed from: s */
    private C10175a f31465s = null;

    /* renamed from: v */
    private long f31466v = -1;

    /* renamed from: w */
    private C10168e.C10170b f31467w = null;

    /* renamed from: x */
    private C10163d.C10166b f31468x = null;

    /* renamed from: y */
    private C10178g.C10181b f31469y = null;

    /* renamed from: z */
    private C10154d f31470z = null;

    /* renamed from: A */
    private C10154d f31431A = null;

    /* renamed from: B */
    private int f31432B = 0;

    /* renamed from: C */
    private int f31433C = 0;

    /* renamed from: D */
    private int f31434D = 1;

    /* renamed from: E */
    private String f31435E = "";

    /* renamed from: F */
    private String f31436F = "";

    /* renamed from: G */
    private String f31437G = "";

    /* renamed from: H */
    private String f31438H = "";

    /* renamed from: I */
    private String f31439I = "";

    /* renamed from: J */
    private String f31440J = "";

    /* renamed from: K */
    private boolean f31441K = false;

    /* renamed from: L */
    private boolean f31442L = false;

    /* renamed from: M */
    private long f31443M = 0;

    /* renamed from: N */
    private Handler f31444N = null;

    /* renamed from: O */
    private Runnable f31445O = new Runnable() { // from class: com.tencent.map.b.f.1
        @Override // java.lang.Runnable
        public final void run() {
            if (System.currentTimeMillis() - C10172f.this.f31443M < 8000) {
                return;
            }
            if (!C10172f.this.f31451e.m5938b() || !C10172f.this.f31451e.m5936c()) {
                C10172f.this.m5967d();
            } else {
                C10172f.this.f31451e.m5942a(0L);
            }
        }
    };

    /* renamed from: P */
    private final BroadcastReceiver f31446P = new BroadcastReceiver() { // from class: com.tencent.map.b.f.2
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent.getBooleanExtra("noConnectivity", false) || C10172f.this.f31463q == null) {
                return;
            }
            C10172f.this.f31463q.sendEmptyMessage(256);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.map.b.f$a */
    /* loaded from: classes2.dex */
    public class C10175a extends Thread {

        /* renamed from: a */
        private C10168e.C10170b f31473a;

        /* renamed from: b */
        private C10163d.C10166b f31474b;

        /* renamed from: c */
        private C10178g.C10181b f31475c;

        C10175a(C10168e.C10170b c10170b, C10163d.C10166b c10166b, C10178g.C10181b c10181b) {
            this.f31473a = null;
            this.f31474b = null;
            this.f31475c = null;
            if (c10170b != null) {
                this.f31473a = (C10168e.C10170b) c10170b.clone();
            }
            if (c10166b != null) {
                this.f31474b = (C10163d.C10166b) c10166b.clone();
            }
            if (c10181b != null) {
                this.f31475c = (C10178g.C10181b) c10181b.clone();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            if (!C10172f.f31429t) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) C10172f.this.f31448b.getSystemService("phone");
                    C10172f.this.f31435E = telephonyManager.getDeviceId();
                    C10172f.this.f31436F = telephonyManager.getSubscriberId();
                    C10172f.this.f31437G = telephonyManager.getLine1Number();
                    Pattern compile = Pattern.compile("[0-9a-zA-Z+-]*");
                    C10172f.this.f31435E = C10172f.this.f31435E == null ? "" : C10172f.this.f31435E;
                    if (compile.matcher(C10172f.this.f31435E).matches()) {
                        C10172f.this.f31435E = C10172f.this.f31435E == null ? "" : C10172f.this.f31435E;
                    } else {
                        C10172f.this.f31435E = "";
                    }
                    C10172f.this.f31436F = C10172f.this.f31436F == null ? "" : C10172f.this.f31436F;
                    if (compile.matcher(C10172f.this.f31436F).matches()) {
                        C10172f.this.f31436F = C10172f.this.f31436F == null ? "" : C10172f.this.f31436F;
                    } else {
                        C10172f.this.f31436F = "";
                    }
                    C10172f.this.f31437G = C10172f.this.f31437G == null ? "" : C10172f.this.f31437G;
                    if (compile.matcher(C10172f.this.f31437G).matches()) {
                        C10172f.this.f31437G = C10172f.this.f31437G == null ? "" : C10172f.this.f31437G;
                    } else {
                        C10172f.this.f31437G = "";
                    }
                } catch (Exception e) {
                }
                boolean unused = C10172f.f31429t = true;
                C10172f.this.f31435E = C10172f.this.f31435E == null ? "" : C10172f.this.f31435E;
                C10172f.this.f31436F = C10172f.this.f31436F == null ? "" : C10172f.this.f31436F;
                C10172f.this.f31437G = C10172f.this.f31437G == null ? "" : C10172f.this.f31437G;
                C10172f.this.f31439I = C10185j.m5916a(C10172f.this.f31435E == null ? "0123456789ABCDEF" : C10172f.this.f31435E);
            }
            String m5921a = C10172f.this.f31453g == 4 ? C10184i.m5921a(this.f31475c) : "[]";
            String m5923a = C10184i.m5923a(this.f31474b, C10172f.this.f31450d.m6019b());
            String m5919a = C10184i.m5919a(C10172f.this.f31435E, C10172f.this.f31436F, C10172f.this.f31437G, C10172f.this.f31438H, C10172f.this.f31441K);
            C10172f.this.f31463q.sendMessage(C10172f.this.f31463q.obtainMessage(16, (("{\"version\":\"1.1.8\",\"address\":" + C10172f.this.f31458l) + ",\"source\":203,\"access_token\":\"" + C10172f.this.f31439I + "\",\"app_name\":\"" + C10172f.this.f31440J + "\",\"bearing\":1") + ",\"attribute\":" + m5919a + ",\"location\":" + ((this.f31473a == null || !this.f31473a.m5997a()) ? "{}" : C10184i.m5922a(this.f31473a)) + ",\"cells\":" + m5923a + ",\"wifis\":" + m5921a + "}"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.map.b.f$b */
    /* loaded from: classes2.dex */
    public class C10176b extends Thread {

        /* renamed from: a */
        private String f31477a;

        /* renamed from: b */
        private String f31478b;

        /* renamed from: c */
        private String f31479c = null;

        public C10176b(String str) {
            this.f31477a = null;
            this.f31478b = null;
            this.f31477a = str;
            this.f31478b = (C10172f.this.f31434D == 0 ? "http://lstest.map.soso.com/loc?c=1" : "http://lbs.map.qq.com/loc?c=1") + "&mars=" + C10172f.this.f31459m;
        }

        /* renamed from: a */
        private String m5944a(byte[] bArr, String str) {
            C10172f.this.f31443M = System.currentTimeMillis();
            StringBuffer stringBuffer = new StringBuffer();
            try {
                stringBuffer.append(new String(bArr, str));
                return stringBuffer.toString();
            } catch (Exception e) {
                return null;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Message message = new Message();
            message.what = 8;
            try {
                byte[] m5915a = C10185j.m5915a(this.f31477a.getBytes());
                C10172f.this.f31462p = true;
                C10190n m6033a = C10157b.m6033a(this.f31478b, "SOSO MAP LBS SDK", m5915a);
                C10172f.this.f31462p = false;
                this.f31479c = m5944a(C10185j.m5914b(m6033a.f31534a), m6033a.f31535b);
                if (this.f31479c != null) {
                    message.arg1 = 0;
                    message.obj = this.f31479c;
                } else {
                    message.arg1 = 1;
                }
            } catch (Exception e) {
                int i = 0;
                while (true) {
                    i++;
                    if (i > 3) {
                        break;
                    }
                    try {
                        sleep(1000L);
                        byte[] m5915a2 = C10185j.m5915a(this.f31477a.getBytes());
                        C10172f.this.f31462p = true;
                        C10190n m6033a2 = C10157b.m6033a(this.f31478b, "SOSO MAP LBS SDK", m5915a2);
                        C10172f.this.f31462p = false;
                        this.f31479c = m5944a(C10185j.m5914b(m6033a2.f31534a), m6033a2.f31535b);
                        if (this.f31479c != null) {
                            message.arg1 = 0;
                            message.obj = this.f31479c;
                        } else {
                            message.arg1 = 1;
                        }
                    } catch (Exception e2) {
                    }
                }
                C10172f.this.f31462p = false;
                message.arg1 = 1;
            }
            C10172f.m5956j(C10172f.this);
            C10172f.this.f31463q.sendMessage(message);
        }
    }

    /* renamed from: com.tencent.map.b.f$c */
    /* loaded from: classes2.dex */
    class HandlerC10177c extends Handler {
        public HandlerC10177c() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    C10172f.m5984a(C10172f.this, (C10168e.C10170b) message.obj);
                    return;
                case 2:
                    C10172f.m5985a(C10172f.this, (C10163d.C10166b) message.obj);
                    return;
                case 3:
                    C10172f.m5982a(C10172f.this, (C10178g.C10181b) message.obj);
                    return;
                case 4:
                    C10172f.m5988a(C10172f.this, message.arg1);
                    return;
                case 5:
                    C10172f.m5973b(C10172f.this, message.arg1);
                    return;
                case 6:
                    C10172f.m5986a(C10172f.this, (Location) message.obj);
                    return;
                case 8:
                    if (message.arg1 == 0) {
                        C10172f.this.m5979a((String) message.obj);
                        return;
                    } else if (C10172f.this.f31467w != null && C10172f.this.f31467w.m5997a()) {
                        return;
                    } else {
                        C10172f.this.m5964e();
                        return;
                    }
                case 16:
                    if (message.obj == null) {
                        return;
                    }
                    C10172f.m5981a(C10172f.this, (String) message.obj);
                    C10172f.this.f31465s = null;
                    return;
                case 256:
                    if (C10172f.this.f31432B != 1) {
                        return;
                    }
                    C10172f.this.m5967d();
                    return;
                default:
                    return;
            }
        }
    }

    private C10172f() {
        this.f31449c = null;
        this.f31450d = null;
        this.f31451e = null;
        this.f31449c = new C10168e();
        this.f31450d = new C10163d();
        this.f31451e = new C10178g();
    }

    /* renamed from: a */
    public static synchronized C10172f m5995a() {
        C10172f c10172f;
        synchronized (C10172f.class) {
            if (f31430u == null) {
                f31430u = new C10172f();
            }
            c10172f = f31430u;
        }
        return c10172f;
    }

    /* renamed from: a */
    private static ArrayList<C10153c> m5977a(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList<C10153c> arrayList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new C10153c(jSONObject.getString("name"), jSONObject.getString("addr"), jSONObject.getString("catalog"), jSONObject.getDouble("dist"), Double.parseDouble(jSONObject.getString("latitude")), Double.parseDouble(jSONObject.getString("longitude"))));
        }
        return arrayList;
    }

    /* renamed from: a */
    static /* synthetic */ void m5988a(C10172f c10172f, int i) {
        if (i == 0) {
            c10172f.f31467w = null;
        }
        c10172f.f31452f = i == 0 ? 1 : 2;
        if (c10172f.f31456j != null) {
            c10172f.f31456j.mo5614a(c10172f.f31452f);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5986a(C10172f c10172f, Location location) {
        if (location == null || location.getLatitude() > 359.0d || location.getLongitude() > 359.0d) {
            if (c10172f.f31467w == null || !c10172f.f31467w.m5997a()) {
                c10172f.m5964e();
            } else {
                c10172f.m5971b(true);
            }
        }
        c10172f.f31470z = new C10154d();
        c10172f.f31470z.f31354z = 0;
        c10172f.f31470z.f31353y = 0;
        c10172f.f31470z.f31330b = C10184i.m5926a(location.getLatitude(), 6);
        c10172f.f31470z.f31331c = C10184i.m5926a(location.getLongitude(), 6);
        if (c10172f.f31467w != null && c10172f.f31467w.m5997a()) {
            c10172f.f31470z.f31333e = C10184i.m5926a(c10172f.f31467w.m5996b().getAccuracy(), 1);
            c10172f.f31470z.f31332d = C10184i.m5926a(c10172f.f31467w.m5996b().getAltitude(), 1);
            c10172f.f31470z.f31334f = C10184i.m5926a(c10172f.f31467w.m5996b().getSpeed(), 1);
            c10172f.f31470z.f31335g = C10184i.m5926a(c10172f.f31467w.m5996b().getBearing(), 1);
            c10172f.f31470z.f31329a = 0;
        }
        c10172f.f31470z.f31352x = true;
        if (c10172f.f31458l != 0 && c10172f.f31431A != null && c10172f.f31432B == 0) {
            if ((c10172f.f31458l == 3 || c10172f.f31458l == 4) && c10172f.f31458l == c10172f.f31431A.f31354z) {
                c10172f.f31470z.f31337i = c10172f.f31431A.f31337i;
                c10172f.f31470z.f31338j = c10172f.f31431A.f31338j;
                c10172f.f31470z.f31339k = c10172f.f31431A.f31339k;
                c10172f.f31470z.f31340l = c10172f.f31431A.f31340l;
                c10172f.f31470z.f31341m = c10172f.f31431A.f31341m;
                c10172f.f31470z.f31342n = c10172f.f31431A.f31342n;
                c10172f.f31470z.f31343o = c10172f.f31431A.f31343o;
                c10172f.f31470z.f31344p = c10172f.f31431A.f31344p;
                c10172f.f31470z.f31354z = 3;
            }
            if (c10172f.f31458l == 4 && c10172f.f31458l == c10172f.f31431A.f31354z && c10172f.f31431A.f31351w != null) {
                c10172f.f31470z.f31351w = new ArrayList<>();
                Iterator<C10153c> it2 = c10172f.f31431A.f31351w.iterator();
                while (it2.hasNext()) {
                    c10172f.f31470z.f31351w.add(new C10153c(it2.next()));
                }
                c10172f.f31470z.f31354z = 4;
            }
            if (c10172f.f31458l == 7 && c10172f.f31458l == c10172f.f31431A.f31354z) {
                c10172f.f31470z.f31354z = 7;
                c10172f.f31470z.f31336h = c10172f.f31431A.f31336h;
                c10172f.f31470z.f31337i = c10172f.f31431A.f31337i;
                if (c10172f.f31431A.f31336h == 0) {
                    c10172f.f31470z.f31338j = c10172f.f31431A.f31338j;
                    c10172f.f31470z.f31339k = c10172f.f31431A.f31339k;
                    c10172f.f31470z.f31340l = c10172f.f31431A.f31340l;
                    c10172f.f31470z.f31341m = c10172f.f31431A.f31341m;
                    c10172f.f31470z.f31342n = c10172f.f31431A.f31342n;
                    c10172f.f31470z.f31343o = c10172f.f31431A.f31343o;
                    c10172f.f31470z.f31344p = c10172f.f31431A.f31344p;
                } else {
                    c10172f.f31470z.f31345q = c10172f.f31431A.f31345q;
                    c10172f.f31470z.f31346r = c10172f.f31431A.f31346r;
                    c10172f.f31470z.f31347s = c10172f.f31431A.f31347s;
                    c10172f.f31470z.f31348t = c10172f.f31431A.f31348t;
                    c10172f.f31470z.f31349u = c10172f.f31431A.f31349u;
                    c10172f.f31470z.f31350v = c10172f.f31431A.f31350v;
                }
            }
        }
        if (c10172f.f31432B == 0 && c10172f.f31431A == null) {
            return;
        }
        if (c10172f.f31432B != 0) {
            c10172f.f31470z.f31353y = c10172f.f31432B;
        }
        if (System.currentTimeMillis() - c10172f.f31466v < c10172f.f31447a || c10172f.f31456j == null || c10172f.f31457k != 1) {
            return;
        }
        c10172f.f31456j.mo5613a(c10172f.f31470z);
        c10172f.f31466v = System.currentTimeMillis();
    }

    /* renamed from: a */
    static /* synthetic */ void m5985a(C10172f c10172f, C10163d.C10166b c10166b) {
        c10172f.f31468x = c10166b;
        if (c10172f.f31451e != null && c10172f.f31451e.m5938b() && c10172f.f31451e.m5936c()) {
            c10172f.f31451e.m5942a(0L);
            return;
        }
        if (c10172f.f31433C > 0 && !C10184i.m5925a(c10166b.f31404a, c10166b.f31405b, c10166b.f31406c, c10166b.f31407d, c10166b.f31408e)) {
            c10172f.f31433C--;
        }
        c10172f.m5967d();
    }

    /* renamed from: a */
    static /* synthetic */ void m5984a(C10172f c10172f, C10168e.C10170b c10170b) {
        if (c10170b != null) {
            c10172f.f31467w = c10170b;
            if (c10172f.f31457k != 1 || c10172f.f31467w == null || !c10172f.f31467w.m5997a()) {
                return;
            }
            if (c10172f.f31459m == 0) {
                c10172f.m5971b(false);
            } else if (c10172f.f31459m != 1 || c10172f.f31455i == null) {
            } else {
                C10157b c10157b = c10172f.f31455i;
                double latitude = c10172f.f31467w.m5996b().getLatitude();
                double longitude = c10172f.f31467w.m5996b().getLongitude();
                Context context = c10172f.f31448b;
                c10157b.m6038a(latitude, longitude, c10172f);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5982a(C10172f c10172f, C10178g.C10181b c10181b) {
        if (c10181b != null) {
            c10172f.f31469y = c10181b;
            c10172f.m5967d();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5981a(C10172f c10172f, String str) {
        byte[] bArr;
        if (!C10184i.m5917c(str)) {
            if (c10172f.f31433C > 0) {
                c10172f.f31433C--;
            } else if (c10172f.f31457k == 0 && c10172f.f31456j != null) {
                c10172f.f31456j.mo5612a(null, -1);
            } else if (c10172f.f31457k != 1 || c10172f.f31456j == null) {
            } else {
                c10172f.f31470z = new C10154d();
                c10172f.f31432B = 3;
                c10172f.f31470z.f31353y = 3;
                c10172f.f31470z.f31354z = -1;
                c10172f.f31456j.mo5613a(c10172f.f31470z);
            }
        } else if (c10172f.f31457k == 0 && c10172f.f31456j != null) {
            try {
                bArr = str.getBytes();
            } catch (Exception e) {
                bArr = null;
            }
            c10172f.f31456j.mo5612a(bArr, 0);
        } else {
            String m6026b = c10172f.f31454h == null ? null : (c10172f.f31468x == null || c10172f.f31469y == null) ? null : c10172f.f31454h.m6026b(c10172f.f31468x.f31405b, c10172f.f31468x.f31406c, c10172f.f31468x.f31407d, c10172f.f31468x.f31408e, c10172f.f31469y.m5931a());
            if (m6026b != null) {
                c10172f.m5979a(m6026b);
                return;
            }
            if (c10172f.f31454h != null && c10172f.f31468x != null && c10172f.f31469y != null) {
                c10172f.f31454h.m6031a(c10172f.f31468x.f31405b, c10172f.f31468x.f31406c, c10172f.f31468x.f31407d, c10172f.f31468x.f31408e, c10172f.f31469y.m5931a());
            }
            if (c10172f.f31462p) {
                return;
            }
            if (c10172f.f31464r != null) {
                c10172f.f31464r.interrupt();
            }
            c10172f.f31464r = null;
            c10172f.f31464r = new C10176b(str);
            c10172f.f31464r.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5979a(String str) {
        double d;
        int i = 0;
        try {
            this.f31470z = new C10154d();
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject(C9654a.C9656b.f30231p);
            this.f31470z.f31329a = 1;
            this.f31470z.f31330b = C10184i.m5926a(jSONObject2.getDouble("latitude"), 6);
            this.f31470z.f31331c = C10184i.m5926a(jSONObject2.getDouble("longitude"), 6);
            this.f31470z.f31332d = C10184i.m5926a(jSONObject2.getDouble("altitude"), 1);
            this.f31470z.f31333e = C10184i.m5926a(jSONObject2.getDouble("accuracy"), 1);
            this.f31470z.f31352x = this.f31459m == 1;
            String string = jSONObject.getString("bearing");
            int i2 = -100;
            if (string != null && string.split(Constants.ACCEPT_TIME_SEPARATOR_SP).length > 1) {
                i = Integer.parseInt(string.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1]);
            }
            if (this.f31468x != null) {
                i2 = this.f31468x.f31409f;
            }
            C10154d c10154d = this.f31470z;
            double d2 = this.f31470z.f31333e;
            if (i >= 6) {
                d = 40.0d;
            } else if (i == 5) {
                d = 60.0d;
            } else if (i == 4) {
                d = 70.0d;
            } else if (i == 3) {
                d = 90.0d;
            } else if (i == 2) {
                d = 110.0d;
            } else {
                d = (i2 < -72 || i != 0) ? d2 <= 100.0d ? ((int) (((d2 - 1.0d) / 10.0d) + 1.0d)) * 10 : (d2 <= 100.0d || d2 > 800.0d) ? ((int) ((0.8d * d2) / 10.0d)) * 10 : ((int) ((0.85d * d2) / 10.0d)) * 10 : ((int) ((0.45d * d2) / 10.0d)) * 10;
            }
            c10154d.f31333e = d;
            this.f31470z.f31354z = 0;
            if ((this.f31458l == 3 || this.f31458l == 4) && this.f31459m == 1) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("details").getJSONObject("subnation");
                this.f31470z.m6044a(jSONObject3.getString("name"));
                this.f31470z.f31341m = jSONObject3.getString("town");
                this.f31470z.f31342n = jSONObject3.getString("village");
                this.f31470z.f31343o = jSONObject3.getString("street");
                this.f31470z.f31344p = jSONObject3.getString("street_no");
                this.f31470z.f31354z = 3;
                this.f31470z.f31336h = 0;
            }
            if (this.f31458l == 4 && this.f31459m == 1) {
                this.f31470z.f31351w = m5977a(jSONObject.getJSONObject("details").getJSONArray("poilist"));
                this.f31470z.f31354z = 4;
            }
            if (this.f31458l == 7 && this.f31459m == 1) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("details");
                int i3 = jSONObject4.getInt("stat");
                JSONObject jSONObject5 = jSONObject4.getJSONObject("subnation");
                if (i3 == 0) {
                    this.f31470z.m6044a(jSONObject5.getString("name"));
                    this.f31470z.f31341m = jSONObject5.getString("town");
                    this.f31470z.f31342n = jSONObject5.getString("village");
                    this.f31470z.f31343o = jSONObject5.getString("street");
                    this.f31470z.f31344p = jSONObject5.getString("street_no");
                } else if (i3 == 1) {
                    this.f31470z.f31337i = jSONObject5.getString("nation");
                    this.f31470z.f31345q = jSONObject5.getString("admin_level_1");
                    this.f31470z.f31346r = jSONObject5.getString("admin_level_2");
                    this.f31470z.f31347s = jSONObject5.getString("admin_level_3");
                    this.f31470z.f31348t = jSONObject5.getString("locality");
                    this.f31470z.f31349u = jSONObject5.getString("sublocality");
                    this.f31470z.f31350v = jSONObject5.getString(C3115ay.f11611a);
                }
                this.f31470z.f31336h = i3;
                this.f31470z.f31354z = 7;
            }
            this.f31470z.f31353y = 0;
            this.f31431A = new C10154d(this.f31470z);
            this.f31432B = 0;
            if (this.f31454h != null) {
                this.f31454h.m6030a(str);
            }
        } catch (Exception e) {
            this.f31470z = new C10154d();
            this.f31470z.f31354z = -1;
            this.f31470z.f31353y = 2;
            this.f31432B = 2;
        }
        if (this.f31456j == null || this.f31457k != 1) {
            return;
        }
        if (this.f31467w != null && this.f31467w.m5997a()) {
            return;
        }
        this.f31456j.mo5613a(this.f31470z);
        this.f31466v = System.currentTimeMillis();
    }

    /* renamed from: b */
    static /* synthetic */ void m5973b(C10172f c10172f, int i) {
        int i2 = 3;
        if (i == 3) {
            i2 = 4;
        }
        c10172f.f31453g = i2;
        if (c10172f.f31456j != null) {
            c10172f.f31456j.mo5614a(c10172f.f31453g);
        }
    }

    /* renamed from: b */
    private void m5971b(boolean z) {
        if (this.f31467w == null || !this.f31467w.m5997a()) {
            return;
        }
        Location m5996b = this.f31467w.m5996b();
        this.f31470z = new C10154d();
        this.f31470z.f31330b = C10184i.m5926a(m5996b.getLatitude(), 6);
        this.f31470z.f31331c = C10184i.m5926a(m5996b.getLongitude(), 6);
        this.f31470z.f31332d = C10184i.m5926a(m5996b.getAltitude(), 1);
        this.f31470z.f31333e = C10184i.m5926a(m5996b.getAccuracy(), 1);
        this.f31470z.f31334f = C10184i.m5926a(m5996b.getSpeed(), 1);
        this.f31470z.f31335g = C10184i.m5926a(m5996b.getBearing(), 1);
        this.f31470z.f31329a = 0;
        this.f31470z.f31352x = false;
        if (!z) {
            this.f31470z.f31353y = 0;
        } else {
            this.f31470z.f31353y = 1;
        }
        this.f31470z.f31354z = 0;
        this.f31431A = new C10154d(this.f31470z);
        this.f31432B = 0;
        if (System.currentTimeMillis() - this.f31466v < this.f31447a || this.f31456j == null || this.f31457k != 1) {
            return;
        }
        this.f31456j.mo5613a(this.f31470z);
        this.f31466v = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m5967d() {
        if (this.f31465s != null) {
            return;
        }
        this.f31465s = new C10175a(this.f31467w, this.f31468x, this.f31469y);
        this.f31465s.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m5964e() {
        this.f31470z = new C10154d();
        this.f31432B = 1;
        this.f31470z.f31353y = 1;
        this.f31470z.f31354z = -1;
        this.f31470z.f31329a = 1;
        if (this.f31456j == null || this.f31457k != 1) {
            return;
        }
        this.f31456j.mo5613a(this.f31470z);
    }

    /* renamed from: j */
    static /* synthetic */ void m5956j(C10172f c10172f) {
    }

    @Override // com.tencent.map.p262b.C10157b.AbstractC10158a
    /* renamed from: a */
    public final void mo5994a(double d, double d2) {
        synchronized (this.f31461o) {
            Message obtainMessage = this.f31463q.obtainMessage(6);
            Location location = new Location("Deflect");
            location.setLatitude(d);
            location.setLongitude(d2);
            obtainMessage.obj = location;
            this.f31463q.sendMessage(obtainMessage);
        }
    }

    @Override // com.tencent.map.p262b.C10168e.AbstractC10171c
    /* renamed from: a */
    public final void mo5993a(int i) {
        synchronized (this.f31461o) {
            this.f31463q.sendMessage(this.f31463q.obtainMessage(4, i, 0));
        }
    }

    @Override // com.tencent.map.p262b.C10163d.AbstractC10167c
    /* renamed from: a */
    public final void mo5991a(C10163d.C10166b c10166b) {
        synchronized (this.f31461o) {
            this.f31463q.sendMessage(this.f31463q.obtainMessage(2, c10166b));
        }
    }

    @Override // com.tencent.map.p262b.C10168e.AbstractC10171c
    /* renamed from: a */
    public final void mo5990a(C10168e.C10170b c10170b) {
        synchronized (this.f31461o) {
            this.f31463q.sendMessage(this.f31463q.obtainMessage(1, c10170b));
        }
    }

    @Override // com.tencent.map.p262b.C10178g.AbstractC10182c
    /* renamed from: a */
    public final void mo5930a(C10178g.C10181b c10181b) {
        synchronized (this.f31461o) {
            this.f31463q.sendMessage(this.f31463q.obtainMessage(3, c10181b));
        }
    }

    /* renamed from: a */
    public final boolean m5992a(Context context, C10152b c10152b) {
        synchronized (this.f31460n) {
            if (context == null || c10152b == null) {
                return false;
            }
            if (!C10184i.m5920a(this.f31440J)) {
                return false;
            }
            this.f31463q = new HandlerC10177c();
            this.f31444N = new Handler(Looper.getMainLooper());
            this.f31448b = context;
            this.f31456j = c10152b;
            C10188l.m5903a().m5902a(this.f31448b.getApplicationContext());
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                    this.f31441K = connectivityManager.getActiveNetworkInfo().isRoaming();
                }
                this.f31448b.registerReceiver(this.f31446P, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e) {
            }
            this.f31457k = this.f31456j.m6048a();
            this.f31458l = this.f31456j.m6047b();
            this.f31459m = this.f31456j.m6046c();
            this.f31466v = -1L;
            if (this.f31458l == 7) {
                this.f31458l = 0;
            }
            this.f31442L = false;
            this.f31434D = 1;
            boolean m6012a = this.f31449c.m6012a(this, this.f31448b);
            boolean m6023a = this.f31450d.m6023a(this.f31448b, this);
            boolean m5941a = this.f31451e.m5941a(this.f31448b, this, 1);
            this.f31454h = C10160c.m6032a();
            this.f31455i = C10157b.m6039a();
            this.f31467w = null;
            this.f31468x = null;
            this.f31469y = null;
            this.f31470z = null;
            this.f31431A = null;
            this.f31432B = 0;
            if (this.f31454h != null) {
                this.f31454h.m6027b();
            }
            this.f31433C = 1;
            if (m6012a && this.f31459m == 0) {
                return true;
            }
            return m6023a || m5941a;
        }
    }

    /* renamed from: a */
    public final boolean m5978a(String str, String str2) {
        boolean z;
        synchronized (this.f31460n) {
            if (C10155a.m6043a().m6041a(str, str2)) {
                this.f31440J = str;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void m5975b() {
        synchronized (this.f31460n) {
            try {
                if (this.f31456j != null) {
                    this.f31456j = null;
                    this.f31444N.removeCallbacks(this.f31445O);
                    this.f31448b.unregisterReceiver(this.f31446P);
                    this.f31449c.m6013a();
                    this.f31450d.m6025a();
                    this.f31451e.m5943a();
                }
            } catch (Exception e) {
            }
        }
    }

    @Override // com.tencent.map.p262b.C10178g.AbstractC10182c
    /* renamed from: b */
    public final void mo5929b(int i) {
        synchronized (this.f31461o) {
            this.f31463q.sendMessage(this.f31463q.obtainMessage(5, i, 0));
        }
    }
}
