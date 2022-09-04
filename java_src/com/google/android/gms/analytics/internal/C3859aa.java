package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.ado;
/* renamed from: com.google.android.gms.analytics.internal.aa */
/* loaded from: classes2.dex */
public class C3859aa extends AbstractC3920t {

    /* renamed from: a */
    private final ado f14971a = new ado();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3859aa(C3922v c3922v) {
        super(c3922v);
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
        r().m25974a().mo17922a(this.f14971a);
        m26442b();
    }

    /* renamed from: b */
    public void m26442b() {
        C3910q v = v();
        String m26179c = v.m26179c();
        if (m26179c != null) {
            this.f14971a.m18030a(m26179c);
        }
        String m26180b = v.m26180b();
        if (m26180b != null) {
            this.f14971a.m18028b(m26180b);
        }
    }

    /* renamed from: c */
    public ado m26441c() {
        D();
        return this.f14971a;
    }
}
