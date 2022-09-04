package com.google.android.gms.internal;

import android.util.Log;
/* renamed from: com.google.android.gms.internal.sw */
/* loaded from: classes2.dex */
public class C7715sw {

    /* renamed from: a */
    private static boolean f25567a = false;

    /* renamed from: a */
    public static String m13666a(String str, String str2) {
        if (m13667a(2)) {
            String m13663a = m13663a(str, str2, new Object[0]);
            Log.v("ctxmgr", m13663a);
            return m13663a;
        }
        return "";
    }

    /* renamed from: a */
    public static String m13665a(String str, String str2, Object obj) {
        if (m13667a(6)) {
            String m13663a = m13663a(str, str2, obj);
            Log.e("ctxmgr", m13663a);
            return m13663a;
        }
        return "";
    }

    /* renamed from: a */
    public static String m13664a(String str, String str2, Throwable th) {
        if (m13667a(6)) {
            String m13663a = m13663a(str, str2, new Object[0]);
            Log.e("ctxmgr", m13663a, th);
            return m13663a;
        }
        return "";
    }

    /* renamed from: a */
    private static String m13663a(String str, String str2, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return String.format("[%s]%s", str, str2);
        }
        String valueOf = String.valueOf(String.format("[%s]", str));
        String valueOf2 = String.valueOf(String.format(str2, objArr));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private static boolean m13667a(int i) {
        return Log.isLoggable("ctxmgr", i);
    }

    /* renamed from: b */
    public static String m13662b(String str, String str2) {
        if (m13667a(6)) {
            String m13663a = m13663a(str, str2, new Object[0]);
            Log.e("ctxmgr", m13663a);
            return m13663a;
        }
        return "";
    }
}
