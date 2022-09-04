package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.internal.client.C3564h;
import com.google.android.gms.ads.internal.client.C3565i;
import com.google.android.gms.ads.p226b.AbstractC3441b;
/* renamed from: com.google.android.gms.ads.g */
/* loaded from: classes.dex */
public class C3469g {

    /* renamed from: com.google.android.gms.ads.g$a */
    /* loaded from: classes.dex */
    public static final class C3470a {

        /* renamed from: a */
        private final C3565i f13782a = new C3565i();

        @Deprecated
        /* renamed from: a */
        public C3470a m27705a(String str) {
            this.f13782a.m27441a(str);
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C3470a m27704a(boolean z) {
            this.f13782a.m27440a(z);
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public String m27706a() {
            return this.f13782a.m27442a();
        }

        @Deprecated
        /* renamed from: b */
        public boolean m27703b() {
            return this.f13782a.m27439b();
        }

        /* renamed from: c */
        C3565i m27702c() {
            return this.f13782a;
        }
    }

    private C3469g() {
    }

    /* renamed from: a */
    public static void m27713a(float f) {
        C3564h.m27448a().m27447a(f);
    }

    @Deprecated
    /* renamed from: a */
    public static void m27712a(Context context) {
        m27710a(context, null, null);
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public static void m27711a(Context context, String str) {
        m27710a(context, str, null);
    }

    @RequiresPermission("android.permission.INTERNET")
    @Deprecated
    /* renamed from: a */
    public static void m27710a(Context context, String str, C3470a c3470a) {
        C3564h.m27448a().m27444a(context, str, c3470a == null ? null : c3470a.m27702c());
    }

    /* renamed from: a */
    public static void m27709a(boolean z) {
        C3564h.m27448a().m27443a(z);
    }

    /* renamed from: b */
    public static AbstractC3441b m27708b(Context context) {
        return C3564h.m27448a().m27446a(context);
    }

    /* renamed from: b */
    public static void m27707b(Context context, String str) {
        C3564h.m27448a().m27445a(context, str);
    }
}
