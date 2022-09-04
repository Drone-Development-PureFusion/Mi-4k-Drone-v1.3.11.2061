package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
/* renamed from: com.google.android.gms.common.internal.y */
/* loaded from: classes2.dex */
public abstract class AbstractC4643y {

    /* renamed from: a */
    private static final Object f17146a = new Object();

    /* renamed from: b */
    private static AbstractC4643y f17147b;

    /* renamed from: a */
    public static AbstractC4643y m23408a(Context context) {
        synchronized (f17146a) {
            if (f17147b == null) {
                f17147b = new C4644z(context.getApplicationContext());
            }
        }
        return f17147b;
    }

    /* renamed from: a */
    public abstract boolean mo23407a(ComponentName componentName, ServiceConnection serviceConnection, String str);

    /* renamed from: a */
    public abstract boolean mo23404a(String str, String str2, ServiceConnection serviceConnection, String str3);

    /* renamed from: b */
    public abstract void mo23403b(ComponentName componentName, ServiceConnection serviceConnection, String str);

    /* renamed from: b */
    public abstract void mo23400b(String str, String str2, ServiceConnection serviceConnection, String str3);
}
