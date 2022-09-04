package com.mob.commons.logcollector;

import android.content.Context;
import com.mob.tools.utils.SharePrefrenceHelper;
/* renamed from: com.mob.commons.logcollector.d */
/* loaded from: classes2.dex */
public class C10084d {

    /* renamed from: a */
    private static C10084d f31131a;

    /* renamed from: b */
    private SharePrefrenceHelper f31132b;

    private C10084d(Context context) {
        this.f31132b = new SharePrefrenceHelper(context.getApplicationContext());
        this.f31132b.open("mob_sdk_exception", 1);
    }

    /* renamed from: a */
    public static C10084d m6214a(Context context) {
        if (f31131a == null) {
            f31131a = new C10084d(context);
        }
        return f31131a;
    }

    /* renamed from: a */
    public long m6217a() {
        return this.f31132b.getLong("service_time");
    }

    /* renamed from: a */
    public void m6216a(int i) {
        this.f31132b.putInt("is_upload_crash", Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m6215a(long j) {
        this.f31132b.putLong("service_time", Long.valueOf(j));
    }

    /* renamed from: a */
    public void m6213a(String str) {
        this.f31132b.putString("err_log_filter", str);
    }

    /* renamed from: a */
    public void m6212a(boolean z) {
        this.f31132b.putInt("is_upload_err_log", Integer.valueOf(z ? 0 : 1));
    }

    /* renamed from: b */
    public void m6210b(int i) {
        this.f31132b.putInt("is_upload_sdkerr", Integer.valueOf(i));
    }

    /* renamed from: b */
    public boolean m6211b() {
        return this.f31132b.getInt("is_upload_err_log") == 0;
    }

    /* renamed from: c */
    public int m6209c() {
        return this.f31132b.getInt("is_upload_crash");
    }

    /* renamed from: c */
    public void m6208c(int i) {
        this.f31132b.putInt("is_upload_apperr", Integer.valueOf(i));
    }

    /* renamed from: d */
    public int m6207d() {
        return this.f31132b.getInt("is_upload_sdkerr");
    }

    /* renamed from: e */
    public int m6206e() {
        return this.f31132b.getInt("is_upload_apperr");
    }

    /* renamed from: f */
    public String m6205f() {
        return this.f31132b.getString("err_log_filter");
    }
}
