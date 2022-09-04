package com.fimi.soul.utils;

import android.app.Application;
/* renamed from: com.fimi.soul.utils.a */
/* loaded from: classes.dex */
public class C3065a {

    /* renamed from: a */
    private Application f11481a;

    /* renamed from: com.fimi.soul.utils.a$a */
    /* loaded from: classes.dex */
    private static class C3066a {

        /* renamed from: a */
        private static final C3065a f11482a = new C3065a();

        private C3066a() {
        }
    }

    /* renamed from: a */
    public static C3065a m29404a() {
        return C3066a.f11482a;
    }

    /* renamed from: a */
    public void m29403a(Application application) {
        this.f11481a = application;
    }

    /* renamed from: b */
    public boolean m29402b() {
        if (this.f11481a != null) {
            return C3103au.m29185q(this.f11481a);
        }
        return false;
    }
}
