package com.mob.commons;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.nearby.messages.Strategy;
import com.mob.commons.authorize.C10057a;
import com.mob.tools.MobLog;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.p255mi.live.openlivesdk.C10024b;
import com.xiaomi.market.sdk.C10445j;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.mob.commons.a */
/* loaded from: classes2.dex */
public class C10054a {

    /* renamed from: a */
    private static HashMap<String, Object> f31058a;

    /* renamed from: b */
    private static long f31059b;

    /* renamed from: c */
    private static long f31060c;

    /* renamed from: d */
    private static boolean f31061d;

    /* renamed from: a */
    public static long m6371a(Context context) {
        long j;
        m6351q(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            j = Long.valueOf(String.valueOf(f31058a.get("deviceTime"))).longValue();
        } catch (Throwable th) {
            j = 0;
        }
        return ((Long) ResHelper.forceCast(f31058a.get("serverTime"), 0L)).longValue() + (elapsedRealtime - j);
    }

    /* renamed from: b */
    private static void m6368b() {
        f31058a = new HashMap<>();
        f31058a.put("in", 0);
        f31058a.put("all", 0);
        f31058a.put("aspa", 2592000L);
        f31058a.put("un", 0);
        f31058a.put("rt", 0);
        f31058a.put("rtsr", 300000);
        f31058a.put("mi", 0);
        f31058a.put("ext", 0);
        f31058a.put("bs", 0);
        f31058a.put("bsgap", Integer.valueOf((int) Strategy.f28191g));
        f31058a.put("di", 0);
        f31058a.put("l", 0);
        f31058a.put("lgap", Integer.valueOf((int) Strategy.f28191g));
        f31058a.put("wi", 0);
        f31058a.put("adle", 172800);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m6366b(String str) {
        try {
            f31058a = new Hashon().fromJson(str);
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
        }
    }

    /* renamed from: b */
    public static boolean m6367b(Context context) {
        m6351q(context);
        return 1 == ((Integer) ResHelper.forceCast(f31058a.get("rt"), 0)).intValue();
    }

    /* renamed from: c */
    public static int m6365c(Context context) {
        m6351q(context);
        return ((Integer) ResHelper.forceCast(f31058a.get("rtsr"), 300)).intValue();
    }

    /* renamed from: d */
    public static boolean m6364d(Context context) {
        m6351q(context);
        return 1 == ((Integer) ResHelper.forceCast(f31058a.get("in"), 0)).intValue();
    }

    /* renamed from: e */
    public static boolean m6363e(Context context) {
        m6351q(context);
        return 1 == ((Integer) ResHelper.forceCast(f31058a.get("all"), 0)).intValue();
    }

    /* renamed from: f */
    public static boolean m6362f(Context context) {
        m6351q(context);
        return 1 == ((Integer) ResHelper.forceCast(f31058a.get("un"), 0)).intValue();
    }

    /* renamed from: g */
    public static long m6361g(Context context) {
        m6351q(context);
        return ((Long) ResHelper.forceCast(f31058a.get("aspa"), 2592000L)).longValue();
    }

    /* renamed from: h */
    public static boolean m6360h(Context context) {
        m6351q(context);
        return 1 == ((Integer) ResHelper.forceCast(f31058a.get("di"), 0)).intValue();
    }

    /* renamed from: i */
    public static boolean m6359i(Context context) {
        m6351q(context);
        return 1 == ((Integer) ResHelper.forceCast(f31058a.get("ext"), 0)).intValue();
    }

    /* renamed from: j */
    public static boolean m6358j(Context context) {
        m6351q(context);
        return 1 == ((Integer) ResHelper.forceCast(f31058a.get("bs"), 0)).intValue();
    }

    /* renamed from: k */
    public static int m6357k(Context context) {
        m6351q(context);
        return ((Integer) ResHelper.forceCast(f31058a.get("bsgap"), Integer.valueOf((int) Strategy.f28191g))).intValue();
    }

    /* renamed from: l */
    public static boolean m6356l(Context context) {
        m6351q(context);
        return 1 == ((Integer) ResHelper.forceCast(f31058a.get("l"), 0)).intValue();
    }

    /* renamed from: m */
    public static int m6355m(Context context) {
        m6351q(context);
        return ((Integer) ResHelper.forceCast(f31058a.get("lgap"), Integer.valueOf((int) Strategy.f28191g))).intValue();
    }

    /* renamed from: n */
    public static boolean m6354n(Context context) {
        m6351q(context);
        return 1 == ((Integer) ResHelper.forceCast(f31058a.get("wi"), 0)).intValue();
    }

    /* renamed from: o */
    public static long m6353o(Context context) {
        m6351q(context);
        return (((Integer) ResHelper.forceCast(f31058a.get("adle"), 172800)).intValue() * 1000) + m6371a(context);
    }

    /* renamed from: q */
    private static synchronized void m6351q(Context context) {
        synchronized (C10054a.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (f31058a == null) {
                if (m6350r(context)) {
                    f31059b = elapsedRealtime;
                }
            } else if (elapsedRealtime - f31059b >= 60000 && m6349s(context)) {
                f31059b = elapsedRealtime;
            }
        }
    }

    /* renamed from: r */
    private static boolean m6350r(Context context) {
        String m6348t = m6348t(context);
        if (TextUtils.isEmpty(m6348t)) {
            m6368b();
            return false;
        }
        m6366b(m6348t);
        C10080f.m6245d(context, new Hashon().fromHashMap(f31058a));
        return true;
    }

    /* renamed from: s */
    private static boolean m6349s(Context context) {
        String m6244e = C10080f.m6244e(context);
        if (TextUtils.isEmpty(m6244e)) {
            return m6350r(context);
        }
        m6366b(m6244e);
        if (((Long) ResHelper.forceCast(f31058a.get("timestamp"), 0L)).longValue() - f31060c >= 86400000) {
            m6347u(context);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static String m6348t(Context context) {
        HashMap fromJson;
        try {
            NetworkHelper networkHelper = new NetworkHelper();
            ArrayList<MobProduct> m6264a = C10075e.m6264a();
            if (m6264a.isEmpty()) {
                return null;
            }
            Object invokeStaticMethod = ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", context);
            ArrayList<KVPair<String>> arrayList = new ArrayList<>();
            arrayList.add(new KVPair<>(C10024b.f30903f, m6264a.get(0).getProductAppkey()));
            arrayList.add(new KVPair<>("plat", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getPlatformCode", new Object[0]))));
            arrayList.add(new KVPair<>("apppkg", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getPackageName", new Object[0]))));
            arrayList.add(new KVPair<>("appver", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getAppVersionName", new Object[0]))));
            arrayList.add(new KVPair<>("networktype", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getDetailNetworkTypeForStatic", new Object[0]))));
            String m6345a = new C10057a().m6345a(context);
            if (!TextUtils.isEmpty(m6345a)) {
                arrayList.add(new KVPair<>("duid", m6345a));
            }
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 30000;
            networkTimeOut.connectionTimeout = 30000;
            ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
            arrayList2.add(new KVPair<>("User-Identity", C10075e.m6263a(context, m6264a)));
            String httpGet = networkHelper.httpGet(m6346v(context), arrayList, arrayList2, networkTimeOut);
            Hashon hashon = new Hashon();
            HashMap fromJson2 = hashon.fromJson(httpGet);
            if (fromJson2 == null) {
                return null;
            }
            if (!"200".equals(String.valueOf(fromJson2.get("status")))) {
                C10080f.m6243e(context, null);
                C10080f.m6241f(context, null);
                throw new Throwable("response is illegal: " + httpGet);
            }
            String str = (String) ResHelper.forceCast(fromJson2.get("sr"));
            if (str != null && (fromJson = hashon.fromJson(Data.AES128Decode("FYsAXMqlWJLCDpnc", Base64.decode(str, 2)))) != null) {
                HashMap hashMap = (HashMap) ResHelper.forceCast(fromJson.get("cdata"));
                if (hashMap != null) {
                    String str2 = (String) ResHelper.forceCast(hashMap.get(C10445j.HOST));
                    int intValue = ((Integer) ResHelper.forceCast(hashMap.get("httpport"), 0)).intValue();
                    String str3 = (String) ResHelper.forceCast(hashMap.get("path"));
                    if (str2 == null || intValue == 0 || str3 == null) {
                        C10080f.m6243e(context, null);
                    } else {
                        C10080f.m6243e(context, "http://" + str2 + ":" + intValue + str3);
                    }
                } else {
                    C10080f.m6243e(context, null);
                }
                HashMap hashMap2 = (HashMap) ResHelper.forceCast(fromJson.get("cconf"));
                if (hashMap2 != null) {
                    String str4 = (String) ResHelper.forceCast(hashMap2.get(C10445j.HOST));
                    int intValue2 = ((Integer) ResHelper.forceCast(hashMap2.get("httpport"), 0)).intValue();
                    String str5 = (String) ResHelper.forceCast(hashMap2.get("path"));
                    if (str4 == null || intValue2 == 0 || str5 == null) {
                        C10080f.m6241f(context, null);
                    } else {
                        C10080f.m6241f(context, "http://" + str4 + ":" + intValue2 + str5);
                    }
                } else {
                    C10080f.m6241f(context, null);
                }
            }
            String str6 = (String) ResHelper.forceCast(fromJson2.get("sc"));
            if (str6 == null) {
                throw new Throwable("response is illegal: " + httpGet);
            }
            HashMap fromJson3 = hashon.fromJson(Data.AES128Decode("FYsAXMqlWJLCDpnc", Base64.decode(str6, 2)));
            if (fromJson3 == null) {
                throw new Throwable("response is illegal: " + httpGet);
            }
            long longValue = ((Long) ResHelper.forceCast(fromJson2.get("timestamp"), 0L)).longValue();
            fromJson3.put("deviceTime", Long.valueOf(SystemClock.elapsedRealtime()));
            fromJson3.put("serverTime", Long.valueOf(longValue));
            return hashon.fromHashMap(fromJson3);
        } catch (Throwable th) {
            C10080f.m6243e(context, null);
            C10080f.m6241f(context, null);
            MobLog.getInstance().m6187w(th);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.mob.commons.a$1] */
    /* renamed from: u */
    private static void m6347u(final Context context) {
        if (!f31061d) {
            f31061d = true;
            new Thread() { // from class: com.mob.commons.a.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    String m6348t = C10054a.m6348t(context);
                    if (!TextUtils.isEmpty(m6348t)) {
                        C10054a.m6366b(m6348t);
                        C10080f.m6245d(context, new Hashon().fromHashMap(C10054a.f31058a));
                    }
                    boolean unused = C10054a.f31061d = false;
                }
            }.start();
        }
    }

    /* renamed from: v */
    private static String m6346v(Context context) {
        String str = null;
        try {
            str = C10080f.m6240g(context);
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
        }
        return TextUtils.isEmpty(str) ? "http://m.data.mob.com/v2/cconf" : str;
    }
}
