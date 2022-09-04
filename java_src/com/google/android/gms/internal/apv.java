package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.Build;
/* loaded from: classes2.dex */
public class apv {
    /* renamed from: a */
    public static void m16288a(final SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            new Thread(new Runnable() { // from class: com.google.android.gms.internal.apv.1
                @Override // java.lang.Runnable
                public void run() {
                    editor.commit();
                }
            }).start();
        }
    }
}
