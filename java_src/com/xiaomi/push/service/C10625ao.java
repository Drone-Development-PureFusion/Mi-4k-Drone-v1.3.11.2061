package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.xiaomi.channel.commonutils.misc.C10405a;
/* renamed from: com.xiaomi.push.service.ao */
/* loaded from: classes.dex */
public class C10625ao {

    /* renamed from: a */
    private static C10625ao f33054a;

    /* renamed from: b */
    private Context f33055b;

    /* renamed from: c */
    private int f33056c = 0;

    private C10625ao(Context context) {
        this.f33055b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C10625ao m4356a(Context context) {
        if (f33054a == null) {
            f33054a = new C10625ao(context);
        }
        return f33054a;
    }

    /* renamed from: a */
    public boolean m4357a() {
        return C10405a.f32335a.contains("xmsf") || C10405a.f32335a.contains("xiaomi") || C10405a.f32335a.contains("miui");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public int m4355b() {
        if (this.f33056c != 0) {
            return this.f33056c;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.f33056c = Settings.Global.getInt(this.f33055b.getContentResolver(), "device_provisioned", 0);
            return this.f33056c;
        }
        this.f33056c = Settings.Secure.getInt(this.f33055b.getContentResolver(), "device_provisioned", 0);
        return this.f33056c;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public Uri m4354c() {
        return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getUriFor("device_provisioned") : Settings.Secure.getUriFor("device_provisioned");
    }
}
