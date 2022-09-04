package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.xiaomi.push.service.m */
/* loaded from: classes2.dex */
public class C10676m {

    /* renamed from: a */
    private static volatile C10676m f33165a;

    /* renamed from: b */
    private SharedPreferences f33166b;

    private C10676m(Context context) {
        this.f33166b = context.getSharedPreferences("mipush", 0);
    }

    /* renamed from: a */
    public static C10676m m4201a(Context context) {
        if (f33165a == null) {
            synchronized (C10676m.class) {
                if (f33165a == null) {
                    f33165a = new C10676m(context);
                }
            }
        }
        return f33165a;
    }

    /* renamed from: a */
    public synchronized void m4202a() {
        SharedPreferences.Editor edit = this.f33166b.edit();
        edit.remove(Constants.EXTRA_KEY_MIID);
        edit.commit();
    }

    /* renamed from: a */
    public synchronized void m4200a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        SharedPreferences.Editor edit = this.f33166b.edit();
        edit.putString(Constants.EXTRA_KEY_MIID, str);
        edit.commit();
    }

    /* renamed from: b */
    public synchronized String m4199b() {
        return this.f33166b.getString(Constants.EXTRA_KEY_MIID, "0");
    }

    /* renamed from: c */
    public synchronized boolean m4198c() {
        return !TextUtils.equals("0", m4199b());
    }
}
