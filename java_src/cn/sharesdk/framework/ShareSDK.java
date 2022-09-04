package cn.sharesdk.framework;

import android.content.Context;
import android.graphics.Bitmap;
import com.mob.tools.utils.DeviceHelper;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ShareSDK {
    public static final String SDK_TAG = "SHARESDK";
    public static final int SDK_VERSION_INT = 70;

    /* renamed from: a */
    private static C0821f f1487a;

    /* renamed from: b */
    private static boolean f1488b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m38026a(int i, String str) {
        m38020b();
        return f1487a.m37820a(i, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m38025a(Bitmap bitmap) {
        m38020b();
        return f1487a.m37819a(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m38024a(String str) {
        m38020b();
        return f1487a.m37798c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m38022a(String str, boolean z, int i, String str2) {
        m38020b();
        return f1487a.m37811a(str, z, i, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m38027a(int i, int i2) {
        m38020b();
        f1487a.m37822a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m38023a(String str, String str2) {
        m38020b();
        f1487a.m37813a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m38028a() {
        m38020b();
        return f1487a.m37797d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m38021a(HashMap<String, Object> hashMap) {
        m38020b();
        return f1487a.m37810a(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m38019b(String str, String str2) {
        m38020b();
        return f1487a.m37804b(str, str2);
    }

    /* renamed from: b */
    private static void m38020b() {
        if (f1487a == null) {
            throw new RuntimeException("Please call ShareSDK.initSDK(Context) in the main process before any action.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m38018b(HashMap<String, Object> hashMap) {
        m38020b();
        return f1487a.m37803b(hashMap);
    }

    public static void closeDebug() {
        f1488b = false;
    }

    public static void deleteCache() {
        m38020b();
        f1487a.m37795e();
    }

    @Deprecated
    public static Platform getPlatform(Context context, String str) {
        m38020b();
        return f1487a.m37815a(str);
    }

    public static Platform getPlatform(String str) {
        m38020b();
        return f1487a.m37815a(str);
    }

    public static synchronized Platform[] getPlatformList() {
        Platform[] m37824a;
        synchronized (ShareSDK.class) {
            m38020b();
            m37824a = f1487a.m37824a();
        }
        return m37824a;
    }

    @Deprecated
    public static synchronized Platform[] getPlatformList(Context context) {
        Platform[] platformList;
        synchronized (ShareSDK.class) {
            platformList = getPlatformList();
        }
        return platformList;
    }

    public static int getSDKVersionCode() {
        return 70;
    }

    public static String getSDKVersionName() {
        m38020b();
        return f1487a.m37808b();
    }

    public static <T extends Service> T getService(Class<T> cls) {
        m38020b();
        return (T) f1487a.m37799c(cls);
    }

    public static void initSDK(Context context) {
        initSDK(context, null, true);
    }

    public static void initSDK(Context context, String str) {
        initSDK(context, str, true);
    }

    public static void initSDK(Context context, String str, boolean z) {
        if (DeviceHelper.getInstance(context) == null) {
            throw new RuntimeException("The param of context is null which in ShareSDK.initSDK(context)!");
        }
        if (f1487a != null) {
            return;
        }
        C0821f c0821f = new C0821f(context, str);
        c0821f.m37809a(z);
        c0821f.startThread();
        f1487a = c0821f;
    }

    public static void initSDK(Context context, boolean z) {
        initSDK(context, null, z);
    }

    public static boolean isDebug() {
        return f1488b;
    }

    public static boolean isRemoveCookieOnAuthorize() {
        m38020b();
        return f1487a.m37801c();
    }

    public static void logApiEvent(String str, int i) {
        m38020b();
        f1487a.m37814a(str, i);
    }

    public static void logDemoEvent(int i, Platform platform) {
        m38020b();
        f1487a.m37821a(i, platform);
    }

    public static String platformIdToName(int i) {
        m38020b();
        return f1487a.m37800c(i);
    }

    public static int platformNameToId(String str) {
        m38020b();
        return f1487a.m37805b(str);
    }

    public static void registerPlatform(Class<? extends CustomPlatform> cls) {
        m38020b();
        f1487a.m37796d(cls);
    }

    public static void registerService(Class<? extends Service> cls) {
        m38020b();
        f1487a.m37816a(cls);
    }

    public static void removeCookieOnAuthorize(boolean z) {
        m38020b();
        f1487a.m37802b(z);
    }

    public static void setConnTimeout(int i) {
        m38020b();
        f1487a.m37823a(i);
    }

    public static void setPlatformDevInfo(String str, HashMap<String, Object> hashMap) {
        m38020b();
        f1487a.m37812a(str, hashMap);
    }

    public static void setReadTimeout(int i) {
        m38020b();
        f1487a.m37807b(i);
    }

    public static void stopSDK() {
    }

    public static void stopSDK(Context context) {
        stopSDK();
    }

    public static void unregisterPlatform(Class<? extends CustomPlatform> cls) {
        m38020b();
        f1487a.m37794e(cls);
    }

    public static void unregisterService(Class<? extends Service> cls) {
        m38020b();
        f1487a.m37806b(cls);
    }
}
