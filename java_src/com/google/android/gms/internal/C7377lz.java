package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.lz */
/* loaded from: classes2.dex */
public class C7377lz {

    /* renamed from: a */
    private static final boolean f24601a = m14641b();

    /* renamed from: a */
    public static boolean m14642a() {
        return f24601a;
    }

    /* renamed from: b */
    private static boolean m14641b() {
        try {
            Class.forName("android.app.Activity");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
