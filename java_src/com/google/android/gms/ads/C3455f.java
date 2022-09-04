package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.internal.client.AbstractC3501a;
import com.google.android.gms.ads.internal.client.C3563g;
import com.google.android.gms.ads.p226b.AbstractC3442c;
import com.google.android.gms.ads.purchase.AbstractC3819b;
import com.google.android.gms.ads.purchase.AbstractC3821d;
/* renamed from: com.google.android.gms.ads.f */
/* loaded from: classes2.dex */
public final class C3455f {

    /* renamed from: a */
    private final C3563g f13762a;

    public C3455f(Context context) {
        this.f13762a = new C3563g(context);
    }

    /* renamed from: a */
    public AbstractC3432a m27753a() {
        return this.f13762a.m27470a();
    }

    /* renamed from: a */
    public void m27752a(AbstractC3432a abstractC3432a) {
        this.f13762a.m27469a(abstractC3432a);
        if (abstractC3432a != null && (abstractC3432a instanceof AbstractC3501a)) {
            this.f13762a.m27464a((AbstractC3501a) abstractC3432a);
        } else if (abstractC3432a != null) {
        } else {
            this.f13762a.m27464a((AbstractC3501a) null);
        }
    }

    /* renamed from: a */
    public void m27751a(AbstractC3442c abstractC3442c) {
        this.f13762a.m27468a(abstractC3442c);
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public void m27750a(C3443c c3443c) {
        this.f13762a.m27463a(c3443c.m27832f());
    }

    /* renamed from: a */
    public void m27749a(AbstractC3819b abstractC3819b) {
        this.f13762a.m27462a(abstractC3819b);
    }

    /* renamed from: a */
    public void m27748a(AbstractC3821d abstractC3821d, String str) {
        this.f13762a.m27461a(abstractC3821d, str);
    }

    /* renamed from: a */
    public void m27747a(String str) {
        this.f13762a.m27460a(str);
    }

    /* renamed from: a */
    public void m27746a(boolean z) {
        this.f13762a.m27459a(z);
    }

    /* renamed from: b */
    public String m27745b() {
        return this.f13762a.m27458b();
    }

    /* renamed from: c */
    public AbstractC3819b m27744c() {
        return this.f13762a.m27454d();
    }

    /* renamed from: d */
    public boolean m27743d() {
        return this.f13762a.m27452f();
    }

    /* renamed from: e */
    public boolean m27742e() {
        return this.f13762a.m27451g();
    }

    /* renamed from: f */
    public String m27741f() {
        return this.f13762a.m27450h();
    }

    /* renamed from: g */
    public void m27740g() {
        this.f13762a.m27449i();
    }
}
