package com.p120c.p121a.p138c;

import android.util.Log;
import com.p120c.p121a.p129b.C1321d;
/* renamed from: com.c.a.c.d */
/* loaded from: classes.dex */
public final class C1356d {

    /* renamed from: a */
    private static final String f3532a = "%1$s\n%2$s";

    /* renamed from: b */
    private static volatile boolean f3533b = false;

    /* renamed from: c */
    private static volatile boolean f3534c = true;

    private C1356d() {
    }

    @Deprecated
    /* renamed from: a */
    public static void m35614a() {
        m35606b(true);
    }

    /* renamed from: a */
    private static void m35613a(int i, Throwable th, String str, Object... objArr) {
        if (!f3534c) {
            return;
        }
        String format = objArr.length > 0 ? String.format(str, objArr) : str;
        if (th != null) {
            if (format == null) {
                format = th.getMessage();
            }
            format = String.format(f3532a, format, Log.getStackTraceString(th));
        }
        Log.println(i, C1321d.f3356a, format);
    }

    /* renamed from: a */
    public static void m35612a(String str, Object... objArr) {
        if (f3533b) {
            m35613a(3, null, str, objArr);
        }
    }

    /* renamed from: a */
    public static void m35611a(Throwable th) {
        m35613a(6, th, null, new Object[0]);
    }

    /* renamed from: a */
    public static void m35610a(Throwable th, String str, Object... objArr) {
        m35613a(6, th, str, objArr);
    }

    /* renamed from: a */
    public static void m35609a(boolean z) {
        f3533b = z;
    }

    @Deprecated
    /* renamed from: b */
    public static void m35608b() {
        m35606b(false);
    }

    /* renamed from: b */
    public static void m35607b(String str, Object... objArr) {
        m35613a(4, null, str, objArr);
    }

    /* renamed from: b */
    public static void m35606b(boolean z) {
        f3534c = z;
    }

    /* renamed from: c */
    public static void m35605c(String str, Object... objArr) {
        m35613a(5, null, str, objArr);
    }

    /* renamed from: d */
    public static void m35604d(String str, Object... objArr) {
        m35613a(6, null, str, objArr);
    }
}
