package com.fimi.soul.biz.manager;

import android.content.Context;
import com.fimi.kernel.utils.C1681v;
/* renamed from: com.fimi.soul.biz.manager.o */
/* loaded from: classes.dex */
public class C1981o {

    /* renamed from: a */
    private static String f5518a = "screenlight";

    /* renamed from: b */
    private static String f5519b = "soundmax";

    /* renamed from: c */
    private static String f5520c = "autoupdate";

    /* renamed from: d */
    private static String f5521d = "push_control";

    /* renamed from: e */
    private static String f5522e = "open_position";

    /* renamed from: f */
    private static String f5523f = "mapchangge";

    /* renamed from: g */
    private static C1981o f5524g = null;

    /* renamed from: h */
    private C1681v f5525h;

    public C1981o(Context context) {
        this.f5525h = C1681v.m34543a(context);
    }

    /* renamed from: a */
    public static C1981o m33342a(Context context) {
        if (f5524g == null) {
            f5524g = new C1981o(context);
        }
        return f5524g;
    }

    /* renamed from: a */
    public void m33341a(boolean z) {
        this.f5525h.m34546a().edit().putBoolean(f5521d, z).commit();
    }

    /* renamed from: a */
    public boolean m33343a() {
        return this.f5525h.m34546a().getBoolean(f5518a, false);
    }

    /* renamed from: b */
    public void m33339b(boolean z) {
        this.f5525h.m34546a().edit().putBoolean(f5522e, z).commit();
    }

    /* renamed from: b */
    public boolean m33340b() {
        return this.f5525h.m34546a().getBoolean(f5519b, false);
    }

    /* renamed from: c */
    public void m33337c(boolean z) {
        this.f5525h.m34546a().edit().putBoolean(f5520c, z).commit();
    }

    /* renamed from: c */
    public boolean m33338c() {
        return this.f5525h.m34546a().getBoolean(f5520c, false);
    }

    /* renamed from: d */
    public void m33335d(boolean z) {
        this.f5525h.m34546a().edit().putBoolean(f5519b, z).commit();
    }

    /* renamed from: d */
    public boolean m33336d() {
        return this.f5525h.m34546a().getBoolean(f5522e, true);
    }

    /* renamed from: e */
    public void m33333e(boolean z) {
        this.f5525h.m34546a().edit().putBoolean(f5518a, z).commit();
    }

    /* renamed from: e */
    public boolean m33334e() {
        return this.f5525h.m34546a().getBoolean(f5523f, false);
    }

    /* renamed from: f */
    public void m33331f(boolean z) {
        this.f5525h.m34546a().edit().putBoolean(f5523f, z).commit();
    }

    /* renamed from: f */
    public boolean m33332f() {
        return this.f5525h.m34546a().getBoolean(f5521d, true);
    }
}
