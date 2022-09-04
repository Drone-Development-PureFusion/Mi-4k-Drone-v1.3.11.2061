package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.string.C10433d;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.xiaomi.push.service.p */
/* loaded from: classes.dex */
public class C10688p {

    /* renamed from: a */
    private static C10688p f33215a = null;

    /* renamed from: b */
    private Context f33216b;

    /* renamed from: c */
    private List<String> f33217c = new ArrayList();

    /* renamed from: d */
    private final List<String> f33218d = new ArrayList();

    /* renamed from: e */
    private final List<String> f33219e = new ArrayList();

    private C10688p(Context context) {
        String[] split;
        String[] split2;
        String[] split3;
        this.f33216b = context.getApplicationContext();
        if (this.f33216b == null) {
            this.f33216b = context;
        }
        SharedPreferences sharedPreferences = this.f33216b.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (TextUtils.isEmpty(str)) {
                this.f33217c.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!TextUtils.isEmpty(str2)) {
                this.f33218d.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!TextUtils.isEmpty(str3)) {
                this.f33219e.add(str3);
            }
        }
    }

    /* renamed from: a */
    public static C10688p m4130a(Context context) {
        if (f33215a == null) {
            f33215a = new C10688p(context);
        }
        return f33215a;
    }

    /* renamed from: a */
    public boolean m4129a(String str) {
        boolean contains;
        synchronized (this.f33217c) {
            contains = this.f33217c.contains(str);
        }
        return contains;
    }

    /* renamed from: b */
    public boolean m4128b(String str) {
        boolean contains;
        synchronized (this.f33218d) {
            contains = this.f33218d.contains(str);
        }
        return contains;
    }

    /* renamed from: c */
    public boolean m4127c(String str) {
        boolean contains;
        synchronized (this.f33219e) {
            contains = this.f33219e.contains(str);
        }
        return contains;
    }

    /* renamed from: d */
    public void m4126d(String str) {
        synchronized (this.f33217c) {
            if (!this.f33217c.contains(str)) {
                this.f33217c.add(str);
                this.f33216b.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", C10433d.m5175a(this.f33217c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: e */
    public void m4125e(String str) {
        synchronized (this.f33218d) {
            if (!this.f33218d.contains(str)) {
                this.f33218d.add(str);
                this.f33216b.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", C10433d.m5175a(this.f33218d, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: f */
    public void m4124f(String str) {
        synchronized (this.f33219e) {
            if (!this.f33219e.contains(str)) {
                this.f33219e.add(str);
                this.f33216b.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", C10433d.m5175a(this.f33219e, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: g */
    public void m4123g(String str) {
        synchronized (this.f33217c) {
            if (this.f33217c.contains(str)) {
                this.f33217c.remove(str);
                this.f33216b.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", C10433d.m5175a(this.f33217c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: h */
    public void m4122h(String str) {
        synchronized (this.f33218d) {
            if (this.f33218d.contains(str)) {
                this.f33218d.remove(str);
                this.f33216b.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", C10433d.m5175a(this.f33218d, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: i */
    public void m4121i(String str) {
        synchronized (this.f33219e) {
            if (this.f33219e.contains(str)) {
                this.f33219e.remove(str);
                this.f33216b.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", C10433d.m5175a(this.f33219e, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }
}
