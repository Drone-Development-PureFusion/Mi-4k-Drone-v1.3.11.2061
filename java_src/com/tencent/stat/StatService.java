package com.tencent.stat;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.stat.common.C10336a;
import com.tencent.stat.common.C10341f;
import com.tencent.stat.common.C10346k;
import com.tencent.stat.common.C10351p;
import com.tencent.stat.common.StatConstants;
import com.tencent.stat.common.StatLogger;
import com.tencent.stat.p268a.C10323a;
import com.tencent.stat.p268a.C10324b;
import com.tencent.stat.p268a.C10325c;
import com.tencent.stat.p268a.C10326d;
import com.tencent.stat.p268a.C10329g;
import com.tencent.stat.p268a.C10330h;
import com.tencent.stat.p268a.C10332j;
import com.tencent.stat.p268a.C10333k;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.Thread;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class StatService {

    /* renamed from: a */
    private static Handler f32144a;

    /* renamed from: b */
    private static volatile Map<C10325c, Long> f32145b = new ConcurrentHashMap();

    /* renamed from: c */
    private static volatile long f32146c = 0;

    /* renamed from: d */
    private static volatile long f32147d = 0;

    /* renamed from: e */
    private static volatile int f32148e = 0;

    /* renamed from: f */
    private static volatile String f32149f = "";

    /* renamed from: g */
    private static volatile String f32150g = "";

    /* renamed from: h */
    private static Map<String, Long> f32151h = new ConcurrentHashMap();

    /* renamed from: i */
    private static StatLogger f32152i = C10346k.m5425b();

    /* renamed from: j */
    private static Thread.UncaughtExceptionHandler f32153j = null;

    /* renamed from: k */
    private static volatile boolean f32154k = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5498a(Context context, boolean z) {
        boolean z2 = true;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z3 = z && currentTimeMillis - f32146c >= ((long) StatConfig.getSessionTimoutMillis());
        f32146c = currentTimeMillis;
        if (f32147d == 0) {
            f32147d = C10346k.m5421c();
        }
        if (currentTimeMillis >= f32147d) {
            f32147d = C10346k.m5421c();
            if (C10362n.m5362a(context).m5349b(context).getUserType() != 1) {
                C10362n.m5362a(context).m5349b(context).m5534b(1);
            }
            StatConfig.m5516b(0);
            StatMid.m5510a(context);
            z3 = true;
        }
        if (!f32154k) {
            z2 = z3;
        }
        if (z2) {
            if (StatConfig.m5511e() < StatConfig.getMaxDaySessionNumbers()) {
                C10346k.m5435F(context);
                m5492d(context);
            } else {
                f32152i.m5464e("Exceed StatConfig.getMaxDaySessionNumbers().");
            }
        }
        if (f32154k) {
            C10341f.m5447b(context);
            testSpeed(context);
            m5491e(context);
            f32154k = false;
        }
        return f32148e;
    }

    /* renamed from: a */
    static JSONObject m5502a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (StatConfig.f32106b.f32206d != 0) {
                jSONObject2.put("v", StatConfig.f32106b.f32206d);
            }
            jSONObject.put(Integer.toString(StatConfig.f32106b.f32203a), jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            if (StatConfig.f32105a.f32206d != 0) {
                jSONObject3.put("v", StatConfig.f32105a.f32206d);
            }
            jSONObject.put(Integer.toString(StatConfig.f32105a.f32203a), jSONObject3);
        } catch (JSONException e) {
            f32152i.m5465e((Exception) e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    static synchronized void m5501a(Context context) {
        synchronized (StatService.class) {
            if (context != null) {
                if (f32144a == null && m5495b(context)) {
                    if (!C10341f.m5450a(context)) {
                        f32152i.m5464e("ooh, Compatibility problem was found in this device!");
                        f32152i.m5464e("If you are on debug mode, please delete apk and try again.");
                        StatConfig.setEnableStatService(false);
                    } else {
                        HandlerThread handlerThread = new HandlerThread("StatService");
                        handlerThread.start();
                        f32144a = new Handler(handlerThread.getLooper());
                        C10362n.m5362a(context);
                        C10352d.m5375a(context);
                        C10352d.m5372b();
                        StatConfig.getDeviceInfo(context);
                        f32153j = Thread.getDefaultUncaughtExceptionHandler();
                        if (StatConfig.isAutoExceptionCaught()) {
                            Thread.setDefaultUncaughtExceptionHandler(new C10355g(context.getApplicationContext()));
                        } else {
                            f32152i.warn("MTA SDK AutoExceptionCaught is disable");
                        }
                        if (StatConfig.getStatSendStrategy() == StatReportStrategy.APP_LAUNCH && C10346k.m5408h(context)) {
                            C10362n.m5362a(context).m5363a(-1);
                        }
                        f32152i.m5466d("Init MTA StatService success.");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static void m5500a(Context context, Throwable th) {
        try {
            if (StatConfig.isEnableStatService()) {
                if (context == null) {
                    f32152i.error("The Context of StatService.reportSdkSelfException() can not be null!");
                } else {
                    C10326d c10326d = new C10326d(context, m5498a(context, false), 99, th);
                    if (m5493c(context) != null) {
                        m5493c(context).post(new RunnableC10359k(c10326d));
                    }
                }
            }
        } catch (Throwable th2) {
            f32152i.m5464e("reportSdkSelfException error: " + th2);
        }
    }

    /* renamed from: a */
    static void m5499a(Context context, Map<String, ?> map) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.sendAdditionEvent() can not be null!");
            return;
        }
        try {
            C10323a c10323a = new C10323a(context, m5498a(context, false), map);
            if (m5493c(context) == null) {
                return;
            }
            m5493c(context).post(new RunnableC10359k(c10323a));
        } catch (Throwable th) {
            f32152i.m5464e(th);
            m5500a(context, th);
        }
    }

    /* renamed from: a */
    static boolean m5497a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: b */
    static boolean m5495b(Context context) {
        if (C10346k.m5422b(StatConstants.VERSION) <= C10351p.m5381a(context, StatConfig.f32107c, 0L)) {
            StatConfig.setEnableStatService(false);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Handler m5493c(Context context) {
        if (f32144a == null) {
            m5501a(context);
        }
        return f32144a;
    }

    public static void commitEvents(Context context, int i) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.commitEvents() can not be null!");
        } else if (i < -1 || i == 0) {
            f32152i.error("The maxNumber of StatService.commitEvents() should be -1 or bigger than 0.");
        } else {
            try {
                C10362n.m5362a(context).m5363a(i);
            } catch (Throwable th) {
                f32152i.m5464e(th);
                m5500a(context, th);
            }
        }
    }

    /* renamed from: d */
    static void m5492d(Context context) {
        if (m5493c(context) != null) {
            f32152i.m5466d("start new session.");
            f32148e = C10346k.m5433a();
            StatConfig.m5527a(0);
            StatConfig.m5512d();
            m5493c(context).post(new RunnableC10359k(new C10333k(context, f32148e, m5502a())));
        }
    }

    /* renamed from: e */
    static void m5491e(Context context) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.reportNativeCrash() can not be null!");
            return;
        }
        try {
            if (m5493c(context) == null) {
                return;
            }
            m5493c(context).post(new RunnableC10357i(context));
        } catch (Throwable th) {
            f32152i.m5464e(th);
            m5500a(context, th);
        }
    }

    public static void onPause(Context context) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.onPause() can not be null!");
        } else {
            trackEndPage(context, C10346k.m5404k(context));
        }
    }

    public static void onResume(Context context) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.onResume() can not be null!");
        } else {
            trackBeginPage(context, C10346k.m5404k(context));
        }
    }

    public static void reportAppMonitorStat(Context context, StatAppMonitor statAppMonitor) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.reportAppMonitorStat() can not be null!");
        } else if (statAppMonitor == null) {
            f32152i.error("The StatAppMonitor of StatService.reportAppMonitorStat() can not be null!");
        } else if (statAppMonitor.getInterfaceName() == null) {
            f32152i.error("The interfaceName of StatAppMonitor on StatService.reportAppMonitorStat() can not be null!");
        } else {
            try {
                C10330h c10330h = new C10330h(context, m5498a(context, false), statAppMonitor);
                if (m5493c(context) == null) {
                    return;
                }
                m5493c(context).post(new RunnableC10359k(c10330h));
            } catch (Throwable th) {
                f32152i.m5464e(th);
                m5500a(context, th);
            }
        }
    }

    public static void reportError(Context context, String str) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.reportError() can not be null!");
        } else if (m5497a(str)) {
            f32152i.error("Error message in StatService.reportError() is empty.");
        } else {
            try {
                C10326d c10326d = new C10326d(context, m5498a(context, false), str, 0, StatConfig.getMaxReportEventLength());
                if (m5493c(context) == null) {
                    return;
                }
                m5493c(context).post(new RunnableC10359k(c10326d));
            } catch (Throwable th) {
                f32152i.m5464e(th);
                m5500a(context, th);
            }
        }
    }

    public static void reportException(Context context, Throwable th) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.reportException() can not be null!");
        } else if (th == null) {
            f32152i.error("The Throwable error message of StatService.reportException() can not be null!");
        } else {
            C10326d c10326d = new C10326d(context, m5498a(context, false), 1, th);
            if (m5493c(context) == null) {
                return;
            }
            m5493c(context).post(new RunnableC10359k(c10326d));
        }
    }

    public static void reportGameUser(Context context, StatGameUser statGameUser) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.reportGameUser() can not be null!");
        } else if (statGameUser == null) {
            f32152i.error("The gameUser of StatService.reportGameUser() can not be null!");
        } else if (statGameUser.getAccount() == null || statGameUser.getAccount().length() == 0) {
            f32152i.error("The account of gameUser on StatService.reportGameUser() can not be null or empty!");
        } else {
            try {
                C10329g c10329g = new C10329g(context, m5498a(context, false), statGameUser);
                if (m5493c(context) == null) {
                    return;
                }
                m5493c(context).post(new RunnableC10359k(c10329g));
            } catch (Throwable th) {
                f32152i.m5464e(th);
                m5500a(context, th);
            }
        }
    }

    public static void reportQQ(Context context, String str) {
        if (str == null) {
            str = "";
        }
        if (!StatConfig.f32108d.equals(str)) {
            StatConfig.f32108d = new String(str);
            m5499a(context, (Map<String, ?>) null);
        }
    }

    public static void setEnvAttributes(Context context, Map<String, String> map) {
        if (map == null || map.size() > 512) {
            f32152i.error("The map in setEnvAttributes can't be null or its size can't exceed 512.");
            return;
        }
        try {
            C10336a.m5459a(context, map);
        } catch (JSONException e) {
            f32152i.m5465e((Exception) e);
        }
    }

    public static void startNewSession(Context context) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.startNewSession() can not be null!");
            return;
        }
        try {
            stopSession();
            m5498a(context, true);
        } catch (Throwable th) {
            f32152i.m5464e(th);
            m5500a(context, th);
        }
    }

    public static boolean startStatService(Context context, String str, String str2) {
        if (!StatConfig.isEnableStatService()) {
            f32152i.error("MTA StatService is disable.");
            return false;
        }
        f32152i.m5466d("MTA SDK version, current: " + StatConstants.VERSION + " ,required: " + str2);
        if (context == null || str2 == null) {
            f32152i.error("Context or mtaSdkVersion in StatService.startStatService() is null, please check it!");
            StatConfig.setEnableStatService(false);
            throw new MtaSDkException("Context or mtaSdkVersion in StatService.startStatService() is null, please check it!");
        } else if (C10346k.m5422b(StatConstants.VERSION) < C10346k.m5422b(str2)) {
            String str3 = ("MTA SDK version conflicted, current: " + StatConstants.VERSION + ",required: " + str2) + ". please delete the current SDK and download the latest one. official website: http://mta.qq.com/ or http://mta.oa.com/";
            f32152i.error(str3);
            StatConfig.setEnableStatService(false);
            throw new MtaSDkException(str3);
        } else {
            try {
                String installChannel = StatConfig.getInstallChannel(context);
                if (installChannel == null || installChannel.length() == 0) {
                    StatConfig.setInstallChannel(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                }
                if (str != null) {
                    StatConfig.setAppKey(context, str);
                }
                m5493c(context);
                m5498a(context, false);
                return true;
            } catch (Throwable th) {
                f32152i.m5464e(th);
                return false;
            }
        }
    }

    public static void stopSession() {
        f32146c = 0L;
    }

    public static void testSpeed(Context context) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.testSpeed() can not be null!");
            return;
        }
        try {
            if (m5493c(context) == null) {
                return;
            }
            m5493c(context).post(new RunnableC10358j(context, null));
        } catch (Throwable th) {
            f32152i.m5464e(th);
            m5500a(context, th);
        }
    }

    public static void testSpeed(Context context, Map<String, Integer> map) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.testSpeed() can not be null!");
        } else if (map == null || map.size() == 0) {
            f32152i.error("The domainMap of StatService.testSpeed() can not be null or empty!");
        } else {
            try {
                if (m5493c(context) == null) {
                    return;
                }
                m5493c(context).post(new RunnableC10358j(context, map));
            } catch (Throwable th) {
                f32152i.m5464e(th);
                m5500a(context, th);
            }
        }
    }

    public static void trackBeginPage(Context context, String str) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null || str == null || str.length() == 0) {
            f32152i.error("The Context or pageName of StatService.trackBeginPage() can not be null or empty!");
            return;
        }
        try {
            synchronized (f32151h) {
                if (f32151h.size() >= StatConfig.getMaxParallelTimmingEvents()) {
                    f32152i.error("The number of page events exceeds the maximum value " + Integer.toString(StatConfig.getMaxParallelTimmingEvents()));
                } else {
                    f32149f = str;
                    if (f32151h.containsKey(f32149f)) {
                        f32152i.m5464e("Duplicate PageID : " + f32149f + ", onResume() repeated?");
                    } else {
                        f32151h.put(f32149f, Long.valueOf(System.currentTimeMillis()));
                        m5498a(context, true);
                    }
                }
            }
        } catch (Throwable th) {
            f32152i.m5464e(th);
            m5500a(context, th);
        }
    }

    public static void trackCustomBeginEvent(Context context, String str, String... strArr) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.trackCustomBeginEvent() can not be null!");
        } else if (m5497a(str)) {
            f32152i.error("The event_id of StatService.trackCustomBeginEvent() can not be null or empty.");
        } else {
            try {
                C10325c c10325c = new C10325c(str, strArr, null);
                if (f32145b.containsKey(c10325c)) {
                    f32152i.error("Duplicate CustomEvent key: " + c10325c.toString() + ", trackCustomBeginEvent() repeated?");
                } else if (f32145b.size() <= StatConfig.getMaxParallelTimmingEvents()) {
                    f32145b.put(c10325c, Long.valueOf(System.currentTimeMillis()));
                } else {
                    f32152i.error("The number of timedEvent exceeds the maximum value " + Integer.toString(StatConfig.getMaxParallelTimmingEvents()));
                }
            } catch (Throwable th) {
                f32152i.m5464e(th);
                m5500a(context, th);
            }
        }
    }

    public static void trackCustomBeginKVEvent(Context context, String str, Properties properties) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.trackCustomBeginEvent() can not be null!");
        } else if (m5497a(str)) {
            f32152i.error("The event_id of StatService.trackCustomBeginEvent() can not be null or empty.");
        } else {
            try {
                C10325c c10325c = new C10325c(str, null, properties);
                if (f32145b.containsKey(c10325c)) {
                    f32152i.error("Duplicate CustomEvent key: " + c10325c.toString() + ", trackCustomBeginKVEvent() repeated?");
                } else if (f32145b.size() <= StatConfig.getMaxParallelTimmingEvents()) {
                    f32145b.put(c10325c, Long.valueOf(System.currentTimeMillis()));
                } else {
                    f32152i.error("The number of timedEvent exceeds the maximum value " + Integer.toString(StatConfig.getMaxParallelTimmingEvents()));
                }
            } catch (Throwable th) {
                f32152i.m5464e(th);
                m5500a(context, th);
            }
        }
    }

    public static void trackCustomEndEvent(Context context, String str, String... strArr) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.trackCustomEndEvent() can not be null!");
        } else if (m5497a(str)) {
            f32152i.error("The event_id of StatService.trackCustomEndEvent() can not be null or empty.");
        } else {
            try {
                C10325c c10325c = new C10325c(str, strArr, null);
                Long remove = f32145b.remove(c10325c);
                if (remove == null) {
                    f32152i.error("No start time found for custom event: " + c10325c.toString() + ", lost trackCustomBeginEvent()?");
                    return;
                }
                C10324b c10324b = new C10324b(context, m5498a(context, false), str);
                c10324b.m5478a(strArr);
                Long valueOf = Long.valueOf((System.currentTimeMillis() - remove.longValue()) / 1000);
                c10324b.m5480a(Long.valueOf(valueOf.longValue() == 0 ? 1L : valueOf.longValue()).longValue());
                if (m5493c(context) == null) {
                    return;
                }
                m5493c(context).post(new RunnableC10359k(c10324b));
            } catch (Throwable th) {
                f32152i.m5464e(th);
                m5500a(context, th);
            }
        }
    }

    public static void trackCustomEndKVEvent(Context context, String str, Properties properties) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.trackCustomEndEvent() can not be null!");
        } else if (m5497a(str)) {
            f32152i.error("The event_id of StatService.trackCustomEndEvent() can not be null or empty.");
        } else {
            try {
                C10325c c10325c = new C10325c(str, null, properties);
                Long remove = f32145b.remove(c10325c);
                if (remove == null) {
                    f32152i.error("No start time found for custom event: " + c10325c.toString() + ", lost trackCustomBeginKVEvent()?");
                    return;
                }
                C10324b c10324b = new C10324b(context, m5498a(context, false), str);
                c10324b.m5479a(properties);
                Long valueOf = Long.valueOf((System.currentTimeMillis() - remove.longValue()) / 1000);
                c10324b.m5480a(Long.valueOf(valueOf.longValue() == 0 ? 1L : valueOf.longValue()).longValue());
                if (m5493c(context) == null) {
                    return;
                }
                m5493c(context).post(new RunnableC10359k(c10324b));
            } catch (Throwable th) {
                f32152i.m5464e(th);
                m5500a(context, th);
            }
        }
    }

    public static void trackCustomEvent(Context context, String str, String... strArr) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.trackCustomEvent() can not be null!");
        } else if (m5497a(str)) {
            f32152i.error("The event_id of StatService.trackCustomEvent() can not be null or empty.");
        } else {
            try {
                C10324b c10324b = new C10324b(context, m5498a(context, false), str);
                c10324b.m5478a(strArr);
                if (m5493c(context) == null) {
                    return;
                }
                m5493c(context).post(new RunnableC10359k(c10324b));
            } catch (Throwable th) {
                f32152i.m5464e(th);
                m5500a(context, th);
            }
        }
    }

    public static void trackCustomKVEvent(Context context, String str, Properties properties) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null) {
            f32152i.error("The Context of StatService.trackCustomEvent() can not be null!");
        } else if (m5497a(str)) {
            f32152i.error("The event_id of StatService.trackCustomEvent() can not be null or empty.");
        } else {
            try {
                C10324b c10324b = new C10324b(context, m5498a(context, false), str);
                c10324b.m5479a(properties);
                if (m5493c(context) == null) {
                    return;
                }
                m5493c(context).post(new RunnableC10359k(c10324b));
            } catch (Throwable th) {
                f32152i.m5464e(th);
                m5500a(context, th);
            }
        }
    }

    public static void trackEndPage(Context context, String str) {
        Long remove;
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (context == null || str == null || str.length() == 0) {
            f32152i.error("The Context or pageName of StatService.trackEndPage() can not be null or empty!");
            return;
        }
        try {
            synchronized (f32151h) {
                remove = f32151h.remove(str);
            }
            if (remove == null) {
                f32152i.m5464e("Starttime for PageID:" + str + " not found, lost onResume()?");
                return;
            }
            Long valueOf = Long.valueOf((System.currentTimeMillis() - remove.longValue()) / 1000);
            if (valueOf.longValue() <= 0) {
                valueOf = 1L;
            }
            String str2 = f32150g;
            if (str2 != null && str2.equals(str)) {
                str2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            }
            if (m5493c(context) != null) {
                C10332j c10332j = new C10332j(context, str2, str, m5498a(context, false), valueOf);
                if (!str.equals(f32149f)) {
                    f32152i.warn("Invalid invocation since previous onResume on diff page.");
                }
                m5493c(context).post(new RunnableC10359k(c10332j));
            }
            f32150g = str;
        } catch (Throwable th) {
            f32152i.m5464e(th);
            m5500a(context, th);
        }
    }
}
