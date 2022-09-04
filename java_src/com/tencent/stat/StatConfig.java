package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.C10346k;
import com.tencent.stat.common.C10351p;
import com.tencent.stat.common.StatConstants;
import com.tencent.stat.common.StatLogger;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.util.Iterator;
import org.apache.http.HttpHost;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* loaded from: classes2.dex */
public class StatConfig {

    /* renamed from: n */
    private static String f32118n;

    /* renamed from: o */
    private static String f32119o;

    /* renamed from: e */
    private static StatLogger f32109e = C10346k.m5425b();

    /* renamed from: a */
    static C10334b f32105a = new C10334b(2);

    /* renamed from: b */
    static C10334b f32106b = new C10334b(1);

    /* renamed from: f */
    private static StatReportStrategy f32110f = StatReportStrategy.APP_LAUNCH;

    /* renamed from: g */
    private static boolean f32111g = true;

    /* renamed from: h */
    private static int f32112h = 30000;

    /* renamed from: i */
    private static int f32113i = 1024;

    /* renamed from: j */
    private static int f32114j = 30;

    /* renamed from: k */
    private static int f32115k = 3;

    /* renamed from: l */
    private static int f32116l = 30;

    /* renamed from: c */
    static String f32107c = "__HIBERNATE__";

    /* renamed from: m */
    private static String f32117m = null;

    /* renamed from: d */
    static String f32108d = "";

    /* renamed from: p */
    private static int f32120p = 1440;

    /* renamed from: q */
    private static int f32121q = 1024;

    /* renamed from: r */
    private static boolean f32122r = true;

    /* renamed from: s */
    private static long f32123s = 0;

    /* renamed from: t */
    private static long f32124t = MiStatInterface.MIN_UPLOAD_INTERVAL;
    public static boolean isAutoExceptionCaught = true;

    /* renamed from: u */
    private static String f32125u = "http://pingma.qq.com:80/mstat/report";

    /* renamed from: v */
    private static int f32126v = 0;

    /* renamed from: w */
    private static volatile int f32127w = 0;

    /* renamed from: x */
    private static int f32128x = 20;

    /* renamed from: y */
    private static int f32129y = 0;

    /* renamed from: z */
    private static boolean f32130z = false;

    /* renamed from: A */
    private static int f32102A = 4096;

    /* renamed from: B */
    private static boolean f32103B = false;

    /* renamed from: C */
    private static String f32104C = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5528a() {
        return f32114j;
    }

    /* renamed from: a */
    static String m5525a(Context context) {
        return C10346k.m5416d(C10351p.m5380a(context, "_mta_ky_tag_", (String) null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m5520a(String str, String str2) {
        try {
            String string = f32106b.f32204b.getString(str);
            return string != null ? string : str2;
        } catch (Throwable th) {
            f32109e.m5461w(th);
            return str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m5527a(int i) {
        synchronized (StatConfig.class) {
            f32127w = i;
        }
    }

    /* renamed from: a */
    static void m5524a(Context context, String str) {
        if (str != null) {
            C10351p.m5377b(context, "_mta_ky_tag_", C10346k.m5419c(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m5523a(C10334b c10334b) {
        if (c10334b.f32203a == f32106b.f32203a) {
            f32106b = c10334b;
            m5515b(f32106b.f32204b);
        } else if (c10334b.f32203a != f32105a.f32203a) {
        } else {
            f32105a = c10334b;
        }
    }

    /* renamed from: a */
    static void m5522a(C10334b c10334b, JSONObject jSONObject) {
        boolean z;
        boolean z2 = false;
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equalsIgnoreCase("v")) {
                    int i = jSONObject.getInt(next);
                    z = c10334b.f32206d != i ? true : z2;
                    c10334b.f32206d = i;
                } else if (next.equalsIgnoreCase("c")) {
                    String string = jSONObject.getString("c");
                    if (string.length() > 0) {
                        c10334b.f32204b = new JSONObject(string);
                    }
                    z = z2;
                } else {
                    if (next.equalsIgnoreCase(C0548a.f931b)) {
                        c10334b.f32205c = jSONObject.getString(C0548a.f931b);
                    }
                    z = z2;
                }
                z2 = z;
            }
            if (!z2) {
                return;
            }
            C10362n m5362a = C10362n.m5362a(C10352d.m5376a());
            if (m5362a != null) {
                m5362a.m5360a(c10334b);
            }
            if (c10334b.f32203a != f32106b.f32203a) {
                return;
            }
            m5515b(c10334b.f32204b);
            m5513c(c10334b.f32204b);
        } catch (JSONException e) {
            f32109e.m5465e((Exception) e);
        } catch (Throwable th) {
            f32109e.m5464e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m5519a(JSONObject jSONObject) {
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equalsIgnoreCase(Integer.toString(f32106b.f32203a))) {
                    m5522a(f32106b, jSONObject.getJSONObject(next));
                } else if (next.equalsIgnoreCase(Integer.toString(f32105a.f32203a))) {
                    m5522a(f32105a, jSONObject.getJSONObject(next));
                } else if (!next.equalsIgnoreCase("rs")) {
                    return;
                } else {
                    StatReportStrategy statReportStrategy = StatReportStrategy.getStatReportStrategy(jSONObject.getInt(next));
                    if (statReportStrategy != null) {
                        f32110f = statReportStrategy;
                        f32109e.m5466d("Change to ReportStrategy:" + statReportStrategy.name());
                    }
                }
            }
        } catch (JSONException e) {
            f32109e.m5465e((Exception) e);
        }
    }

    /* renamed from: a */
    static void m5518a(boolean z) {
        StatNativeCrashReport.setNativeCrashDebugEnable(z);
    }

    /* renamed from: a */
    static boolean m5526a(int i, int i2, int i3) {
        return i >= i2 && i <= i3;
    }

    /* renamed from: a */
    private static boolean m5521a(String str) {
        if (str == null) {
            return false;
        }
        if (f32118n == null) {
            f32118n = str;
            return true;
        } else if (f32118n.contains(str)) {
            return false;
        } else {
            f32118n += "|" + str;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static HttpHost m5517b() {
        if (f32117m == null || f32117m.length() <= 0) {
            return null;
        }
        String str = f32117m;
        String[] split = str.split(":");
        int i = 80;
        if (split.length == 2) {
            str = split[0];
            i = Integer.parseInt(split[1]);
        }
        return new HttpHost(str, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m5516b(int i) {
        if (i < 0) {
            return;
        }
        f32129y = i;
    }

    /* renamed from: b */
    static void m5515b(JSONObject jSONObject) {
        try {
            StatReportStrategy statReportStrategy = StatReportStrategy.getStatReportStrategy(jSONObject.getInt("rs"));
            if (statReportStrategy == null) {
                return;
            }
            setStatSendStrategy(statReportStrategy);
        } catch (JSONException e) {
            f32109e.m5466d("rs not found.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static synchronized void m5514c() {
        synchronized (StatConfig.class) {
            f32127w++;
        }
    }

    /* renamed from: c */
    static void m5513c(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(f32107c);
            f32109e.m5466d("hibernateVer:" + string + ", current version:" + StatConstants.VERSION);
            long m5422b = C10346k.m5422b(string);
            if (C10346k.m5422b(StatConstants.VERSION) > m5422b) {
                return;
            }
            C10351p.m5378b(C10352d.m5376a(), f32107c, m5422b);
            setEnableStatService(false);
            f32109e.warn("MTA has disable for SDK version of " + string + " or lower.");
        } catch (JSONException e) {
            f32109e.m5466d("__HIBERNATE__ not found.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m5512d() {
        f32129y++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m5511e() {
        return f32129y;
    }

    public static synchronized String getAppKey(Context context) {
        String str;
        synchronized (StatConfig.class) {
            if (f32118n != null) {
                str = f32118n;
            } else {
                if (context != null && f32118n == null) {
                    f32118n = C10346k.m5406i(context);
                }
                if (f32118n == null || f32118n.trim().length() == 0) {
                    f32109e.error("AppKey can not be null or empty, please read Developer's Guide first!");
                }
                str = f32118n;
            }
        }
        return str;
    }

    public static int getCurSessionStatReportCount() {
        return f32127w;
    }

    public static String getCustomProperty(String str) {
        try {
            return f32105a.f32204b.getString(str);
        } catch (Throwable th) {
            f32109e.m5464e(th);
            return null;
        }
    }

    public static String getCustomProperty(String str, String str2) {
        try {
            String string = f32105a.f32204b.getString(str);
            return string != null ? string : str2;
        } catch (Throwable th) {
            f32109e.m5464e(th);
            return str2;
        }
    }

    public static String getCustomUserId(Context context) {
        if (context == null) {
            f32109e.error("Context for getCustomUid is null.");
            return null;
        }
        if (f32104C == null) {
            f32104C = C10351p.m5380a(context, "MTA_CUSTOM_UID", "");
        }
        return f32104C;
    }

    public static DeviceInfo getDeviceInfo(Context context) {
        return StatMid.getDeviceInfo(context);
    }

    public static synchronized String getInstallChannel(Context context) {
        String str;
        synchronized (StatConfig.class) {
            if (f32119o != null) {
                str = f32119o;
            } else {
                f32119o = C10346k.m5405j(context);
                if (f32119o == null || f32119o.trim().length() == 0) {
                    f32109e.m5461w("installChannel can not be null or empty, please read Developer's Guide first!");
                }
                str = f32119o;
            }
        }
        return str;
    }

    public static int getMaxBatchReportCount() {
        return f32116l;
    }

    public static int getMaxDaySessionNumbers() {
        return f32128x;
    }

    public static int getMaxParallelTimmingEvents() {
        return f32121q;
    }

    public static int getMaxReportEventLength() {
        return f32102A;
    }

    public static int getMaxSendRetryCount() {
        return f32115k;
    }

    public static int getMaxSessionStatReportCount() {
        return f32126v;
    }

    public static int getMaxStoreEventCount() {
        return f32113i;
    }

    public static String getMid(Context context) {
        return StatMid.getMid(context);
    }

    public static String getQQ() {
        return f32108d;
    }

    public static int getSendPeriodMinutes() {
        return f32120p;
    }

    public static int getSessionTimoutMillis() {
        return f32112h;
    }

    public static String getStatReportUrl() {
        return f32125u;
    }

    public static StatReportStrategy getStatSendStrategy() {
        return f32110f;
    }

    public static void initNativeCrashReport(Context context, String str) {
        if (!isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32109e.error("The Context of StatConfig.initNativeCrashReport() can not be null!");
        } else {
            StatNativeCrashReport.initNativeCrash(context, str);
        }
    }

    public static boolean isAutoExceptionCaught() {
        return isAutoExceptionCaught;
    }

    public static boolean isDebugEnable() {
        return C10346k.m5425b().isDebugEnable();
    }

    public static boolean isEnableConcurrentProcess() {
        return f32103B;
    }

    public static boolean isEnableSmartReporting() {
        return f32122r;
    }

    public static boolean isEnableStatService() {
        return f32111g;
    }

    public static void setAppKey(Context context, String str) {
        if (context == null) {
            f32109e.error("ctx in StatConfig.setAppKey() is null");
        } else if (str == null || str.length() > 256) {
            f32109e.error("appkey in StatConfig.setAppKey() is null or exceed 256 bytes");
        } else {
            if (f32118n == null) {
                f32118n = m5525a(context);
            }
            if (!m5521a(str) && !m5521a(C10346k.m5406i(context))) {
                return;
            }
            m5524a(context, f32118n);
        }
    }

    public static void setAppKey(String str) {
        if (str == null) {
            f32109e.error("appkey in StatConfig.setAppKey() is null");
        } else if (str.length() > 256) {
            f32109e.error("The length of appkey cann't exceed 256 bytes.");
        } else {
            f32118n = str;
        }
    }

    public static void setAutoExceptionCaught(boolean z) {
        isAutoExceptionCaught = z;
    }

    public static void setCustomUserId(Context context, String str) {
        if (context == null) {
            f32109e.error("Context for setCustomUid is null.");
            return;
        }
        C10351p.m5377b(context, "MTA_CUSTOM_UID", str);
        f32104C = str;
    }

    public static void setDebugEnable(boolean z) {
        C10346k.m5425b().setDebugEnable(z);
        m5518a(z);
    }

    public static void setEnableConcurrentProcess(boolean z) {
        f32103B = z;
    }

    public static void setEnableSmartReporting(boolean z) {
        f32122r = z;
    }

    public static void setEnableStatService(boolean z) {
        f32111g = z;
        if (!z) {
            f32109e.warn("!!!!!!MTA StatService has been disabled!!!!!!");
        }
    }

    public static void setInstallChannel(String str) {
        if (str.length() > 128) {
            f32109e.error("the length of installChannel can not exceed the range of 128 bytes.");
        } else {
            f32119o = str;
        }
    }

    public static void setMaxBatchReportCount(int i) {
        if (!m5526a(i, 2, 1000)) {
            f32109e.error("setMaxBatchReportCount can not exceed the range of [2,1000].");
        } else {
            f32116l = i;
        }
    }

    public static void setMaxDaySessionNumbers(int i) {
        if (i <= 0) {
            f32109e.m5464e("maxDaySessionNumbers must be greater than 0.");
        } else {
            f32128x = i;
        }
    }

    public static void setMaxParallelTimmingEvents(int i) {
        if (!m5526a(i, 1, 4096)) {
            f32109e.error("setMaxParallelTimmingEvents can not exceed the range of [1, 4096].");
        } else {
            f32121q = i;
        }
    }

    public static void setMaxReportEventLength(int i) {
        if (i <= 0) {
            f32109e.error("maxReportEventLength on setMaxReportEventLength() must greater than 0.");
        } else {
            f32102A = i;
        }
    }

    public static void setMaxSendRetryCount(int i) {
        if (!m5526a(i, 1, 1000)) {
            f32109e.error("setMaxSendRetryCount can not exceed the range of [1,1000].");
        } else {
            f32115k = i;
        }
    }

    public static void setMaxSessionStatReportCount(int i) {
        if (i < 0) {
            f32109e.error("maxSessionStatReportCount cannot be less than 0.");
        } else {
            f32126v = i;
        }
    }

    public static void setMaxStoreEventCount(int i) {
        if (!m5526a(i, 0, 500000)) {
            f32109e.error("setMaxStoreEventCount can not exceed the range of [0, 500000].");
        } else {
            f32113i = i;
        }
    }

    public static void setQQ(Context context, String str) {
        StatService.reportQQ(context, str);
    }

    public static void setSendPeriodMinutes(int i) {
        if (!m5526a(i, 1, 10080)) {
            f32109e.error("setSendPeriodMinutes can not exceed the range of [1, 7*24*60] minutes.");
        } else {
            f32120p = i;
        }
    }

    public static void setSessionTimoutMillis(int i) {
        if (!m5526a(i, 1000, C0494h.f705Z)) {
            f32109e.error("setSessionTimoutMillis can not exceed the range of [1000, 24 * 60 * 60 * 1000].");
        } else {
            f32112h = i;
        }
    }

    public static void setStatReportUrl(String str) {
        if (str == null || str.length() == 0) {
            f32109e.error("statReportUrl cannot be null or empty.");
        } else {
            f32125u = str;
        }
    }

    public static void setStatSendStrategy(StatReportStrategy statReportStrategy) {
        f32110f = statReportStrategy;
        f32109e.m5466d("Change to statSendStrategy: " + statReportStrategy);
    }
}
