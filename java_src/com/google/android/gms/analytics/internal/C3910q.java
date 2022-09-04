package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.xiaomi.market.sdk.C10445j;
/* renamed from: com.google.android.gms.analytics.internal.q */
/* loaded from: classes2.dex */
public class C3910q extends AbstractC3920t {

    /* renamed from: a */
    protected String f15130a;

    /* renamed from: b */
    protected String f15131b;

    /* renamed from: c */
    protected int f15132c;

    /* renamed from: d */
    protected boolean f15133d;

    /* renamed from: e */
    protected int f15134e;

    /* renamed from: f */
    protected boolean f15135f;

    /* renamed from: g */
    protected boolean f15136g;

    public C3910q(C3922v c3922v) {
        super(c3922v);
    }

    /* renamed from: a */
    private static int m26181a(String str) {
        String lowerCase = str.toLowerCase();
        if ("verbose".equals(lowerCase)) {
            return 0;
        }
        if (C10445j.f32461ag.equals(lowerCase)) {
            return 1;
        }
        if ("warning".equals(lowerCase)) {
            return 2;
        }
        return "error".equals(lowerCase) ? 3 : -1;
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
        m26172j();
    }

    /* renamed from: a */
    void m26182a(C3886b c3886b) {
        int m26181a;
        q("Loading global XML config values");
        if (c3886b.m26327a()) {
            String m26326b = c3886b.m26326b();
            this.f15131b = m26326b;
            b("XML config - app name", m26326b);
        }
        if (c3886b.m26325c()) {
            String m26324d = c3886b.m26324d();
            this.f15130a = m26324d;
            b("XML config - app version", m26324d);
        }
        if (c3886b.m26323e() && (m26181a = m26181a(c3886b.m26322f())) >= 0) {
            this.f15132c = m26181a;
            a("XML config - log level", Integer.valueOf(m26181a));
        }
        if (c3886b.m26321g()) {
            int m26320h = c3886b.m26320h();
            this.f15134e = m26320h;
            this.f15133d = true;
            b("XML config - dispatch period (sec)", Integer.valueOf(m26320h));
        }
        if (c3886b.m26319i()) {
            boolean m26318j = c3886b.m26318j();
            this.f15136g = m26318j;
            this.f15135f = true;
            b("XML config - dry run", Boolean.valueOf(m26318j));
        }
    }

    /* renamed from: b */
    public String m26180b() {
        D();
        return this.f15130a;
    }

    /* renamed from: c */
    public String m26179c() {
        D();
        return this.f15131b;
    }

    /* renamed from: d */
    public boolean m26178d() {
        D();
        return false;
    }

    /* renamed from: e */
    public int m26177e() {
        D();
        return this.f15132c;
    }

    /* renamed from: f */
    public boolean m26176f() {
        D();
        return this.f15133d;
    }

    /* renamed from: g */
    public int m26175g() {
        D();
        return this.f15134e;
    }

    /* renamed from: h */
    public boolean m26174h() {
        D();
        return this.f15135f;
    }

    /* renamed from: i */
    public boolean m26173i() {
        D();
        return this.f15136g;
    }

    /* renamed from: j */
    protected void m26172j() {
        ApplicationInfo applicationInfo;
        int i;
        C3886b a;
        Context o = o();
        try {
            applicationInfo = o.getPackageManager().getApplicationInfo(o.getPackageName(), 129);
        } catch (PackageManager.NameNotFoundException e) {
            d("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            t("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0 || (a = new C3884ap(k()).a(i)) == null) {
            return;
        }
        m26182a(a);
    }
}
