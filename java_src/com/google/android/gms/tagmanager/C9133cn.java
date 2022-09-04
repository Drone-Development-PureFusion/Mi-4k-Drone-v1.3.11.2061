package com.google.android.gms.tagmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
/* renamed from: com.google.android.gms.tagmanager.cn */
/* loaded from: classes2.dex */
class C9133cn {
    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public static void m9162a(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        m9161a(edit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9161a(final SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            new Thread(new Runnable() { // from class: com.google.android.gms.tagmanager.cn.1
                @Override // java.lang.Runnable
                public void run() {
                    editor.commit();
                }
            }).start();
        }
    }
}
