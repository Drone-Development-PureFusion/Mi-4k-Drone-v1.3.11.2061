package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.aml;
import java.util.concurrent.Callable;
/* renamed from: com.google.android.gms.flags.impl.b */
/* loaded from: classes2.dex */
public class C5278b {

    /* renamed from: a */
    private static SharedPreferences f19153a = null;

    /* renamed from: a */
    public static SharedPreferences m20834a(final Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f19153a == null) {
                f19153a = (SharedPreferences) aml.m16789a(new Callable<SharedPreferences>() { // from class: com.google.android.gms.flags.impl.b.1
                    @Override // java.util.concurrent.Callable
                    /* renamed from: a */
                    public SharedPreferences call() {
                        return context.getSharedPreferences("google_sdk_flags", 1);
                    }
                });
            }
            sharedPreferences = f19153a;
        }
        return sharedPreferences;
    }
}
