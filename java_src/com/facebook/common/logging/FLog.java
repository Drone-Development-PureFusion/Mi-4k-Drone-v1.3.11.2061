package com.facebook.common.logging;
/* loaded from: classes.dex */
public class FLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static LoggingDelegate sHandler = FLogDefaultLoggingDelegate.getInstance();

    /* renamed from: d */
    public static void m35581d(Class<?> cls, String str) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35517d(getTag(cls), str);
        }
    }

    /* renamed from: d */
    public static void m35580d(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35517d(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: d */
    public static void m35579d(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35517d(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: d */
    public static void m35578d(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35517d(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: d */
    public static void m35577d(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35517d(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: d */
    public static void m35576d(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35516d(getTag(cls), str, th);
        }
    }

    /* renamed from: d */
    public static void m35575d(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35517d(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m35574d(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35516d(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m35573d(String str, String str2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35517d(str, str2);
        }
    }

    /* renamed from: d */
    public static void m35572d(String str, String str2, Object obj) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35517d(str, formatString(str2, obj));
        }
    }

    /* renamed from: d */
    public static void m35571d(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35517d(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: d */
    public static void m35570d(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35517d(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: d */
    public static void m35569d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35517d(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: d */
    public static void m35568d(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo35516d(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m35567d(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            m35573d(str, formatString(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m35566d(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            m35568d(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: e */
    public static void m35565e(Class<?> cls, String str) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo35515e(getTag(cls), str);
        }
    }

    /* renamed from: e */
    public static void m35564e(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo35514e(getTag(cls), str, th);
        }
    }

    /* renamed from: e */
    public static void m35563e(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo35515e(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: e */
    public static void m35562e(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo35514e(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: e */
    public static void m35561e(String str, String str2) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo35515e(str, str2);
        }
    }

    /* renamed from: e */
    public static void m35560e(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo35514e(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m35559e(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo35515e(str, formatString(str2, objArr));
        }
    }

    /* renamed from: e */
    public static void m35558e(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo35514e(str, formatString(str2, objArr), th);
        }
    }

    private static String formatString(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    public static int getMinimumLoggingLevel() {
        return sHandler.getMinimumLoggingLevel();
    }

    private static String getTag(Class<?> cls) {
        return cls.getSimpleName();
    }

    /* renamed from: i */
    public static void m35557i(Class<?> cls, String str) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(getTag(cls), str);
        }
    }

    /* renamed from: i */
    public static void m35556i(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: i */
    public static void m35555i(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: i */
    public static void m35554i(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: i */
    public static void m35553i(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: i */
    public static void m35552i(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35512i(getTag(cls), str, th);
        }
    }

    /* renamed from: i */
    public static void m35551i(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: i */
    public static void m35550i(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(4)) {
            sHandler.mo35512i(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m35549i(String str, String str2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(str, str2);
        }
    }

    /* renamed from: i */
    public static void m35548i(String str, String str2, Object obj) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(str, formatString(str2, obj));
        }
    }

    /* renamed from: i */
    public static void m35547i(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: i */
    public static void m35546i(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: i */
    public static void m35545i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: i */
    public static void m35544i(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35512i(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m35543i(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35513i(str, formatString(str2, objArr));
        }
    }

    /* renamed from: i */
    public static void m35542i(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo35512i(str, formatString(str2, objArr), th);
        }
    }

    public static boolean isLoggable(int i) {
        return sHandler.isLoggable(i);
    }

    public static void setLoggingDelegate(LoggingDelegate loggingDelegate) {
        if (loggingDelegate == null) {
            throw new IllegalArgumentException();
        }
        sHandler = loggingDelegate;
    }

    public static void setMinimumLoggingLevel(int i) {
        sHandler.setMinimumLoggingLevel(i);
    }

    /* renamed from: v */
    public static void m35541v(Class<?> cls, String str) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35511v(getTag(cls), str);
        }
    }

    /* renamed from: v */
    public static void m35540v(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35511v(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: v */
    public static void m35539v(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35511v(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: v */
    public static void m35538v(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (isLoggable(2)) {
            m35541v(cls, formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: v */
    public static void m35537v(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35511v(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: v */
    public static void m35536v(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35510v(getTag(cls), str, th);
        }
    }

    /* renamed from: v */
    public static void m35535v(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35511v(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: v */
    public static void m35534v(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35510v(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: v */
    public static void m35533v(String str, String str2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35511v(str, str2);
        }
    }

    /* renamed from: v */
    public static void m35532v(String str, String str2, Object obj) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35511v(str, formatString(str2, obj));
        }
    }

    /* renamed from: v */
    public static void m35531v(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35511v(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: v */
    public static void m35530v(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35511v(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: v */
    public static void m35529v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35511v(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: v */
    public static void m35528v(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35510v(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m35527v(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35511v(str, formatString(str2, objArr));
        }
    }

    /* renamed from: v */
    public static void m35526v(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo35510v(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: w */
    public static void m35525w(Class<?> cls, String str) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo35509w(getTag(cls), str);
        }
    }

    /* renamed from: w */
    public static void m35524w(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo35508w(getTag(cls), str, th);
        }
    }

    /* renamed from: w */
    public static void m35523w(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo35509w(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: w */
    public static void m35522w(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(5)) {
            m35524w(cls, formatString(str, objArr), th);
        }
    }

    /* renamed from: w */
    public static void m35521w(String str, String str2) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo35509w(str, str2);
        }
    }

    /* renamed from: w */
    public static void m35520w(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo35508w(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m35519w(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo35509w(str, formatString(str2, objArr));
        }
    }

    /* renamed from: w */
    public static void m35518w(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo35508w(str, formatString(str2, objArr), th);
        }
    }

    public static void wtf(Class<?> cls, String str) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo35515e(getTag(cls), str);
        }
    }

    public static void wtf(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), str, th);
        }
    }

    public static void wtf(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), formatString(str, objArr));
        }
    }

    public static void wtf(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), formatString(str, objArr), th);
        }
    }

    public static void wtf(String str, String str2) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo35515e(str, str2);
        }
    }

    public static void wtf(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, str2, th);
        }
    }

    public static void wtf(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, formatString(str2, objArr));
        }
    }

    public static void wtf(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, formatString(str2, objArr), th);
        }
    }
}
