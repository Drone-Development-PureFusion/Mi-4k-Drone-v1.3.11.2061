package com.google.android.gms.clearcut;

import android.content.Context;
/* renamed from: com.google.android.gms.clearcut.a */
/* loaded from: classes2.dex */
public class C4455a {

    /* renamed from: b */
    private static int f16710b = -1;

    /* renamed from: a */
    public static final C4455a f16709a = new C4455a();

    protected C4455a() {
    }

    /* renamed from: a */
    public int m24083a(Context context) {
        if (f16710b < 0) {
            f16710b = context.getSharedPreferences("bootCount", 0).getInt("bootCount", 1);
        }
        return f16710b;
    }
}
