package p005b.p006a.p007a.p029b.p042h;

import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f;
import p005b.p006a.p007a.p029b.p042h.p044b.C0515b;
import p005b.p006a.p007a.p029b.p042h.p044b.C0523j;
import p005b.p006a.p007a.p029b.p042h.p044b.C0526m;
/* renamed from: b.a.a.b.h.f */
/* loaded from: classes.dex */
public abstract class AbstractC0535f<E> extends AbstractRunnableC0513b<E> implements AbstractC0519f {

    /* renamed from: d */
    private C0523j f863d;

    /* renamed from: e */
    private SocketFactory f864e;

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f
    /* renamed from: a */
    public void mo38906a(C0523j c0523j) {
        this.f863d = c0523j;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractRunnableC0513b
    /* renamed from: b */
    protected SocketFactory mo38905b() {
        return this.f864e;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f
    /* renamed from: f */
    public C0523j mo38904f() {
        if (this.f863d == null) {
            this.f863d = new C0523j();
        }
        return this.f863d;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractRunnableC0513b, p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        try {
            SSLContext a = mo38904f().a(this);
            C0526m m39007a = mo38904f().m39007a();
            m39007a.a(c_());
            this.f864e = new C0515b(m39007a, a.getSocketFactory());
            super.mo38474j();
        } catch (Exception e) {
            a(e.getMessage(), e);
        }
    }
}
