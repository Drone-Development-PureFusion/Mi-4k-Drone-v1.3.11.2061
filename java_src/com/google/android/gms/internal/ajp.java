package com.google.android.gms.internal;

import android.content.Context;
/* loaded from: classes2.dex */
public class ajp {

    /* renamed from: b */
    private static ajp f22032b = new ajp();

    /* renamed from: a */
    private ajo f22033a = null;

    /* renamed from: b */
    public static ajo m17106b(Context context) {
        return f22032b.m17107a(context);
    }

    /* renamed from: a */
    public synchronized ajo m17107a(Context context) {
        if (this.f22033a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f22033a = new ajo(context);
        }
        return this.f22033a;
    }
}
