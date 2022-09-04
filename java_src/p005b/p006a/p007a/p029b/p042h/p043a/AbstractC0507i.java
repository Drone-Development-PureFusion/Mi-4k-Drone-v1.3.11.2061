package p005b.p006a.p007a.p029b.p042h.p043a;

import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f;
import p005b.p006a.p007a.p029b.p042h.p044b.C0514a;
import p005b.p006a.p007a.p029b.p042h.p044b.C0523j;
import p005b.p006a.p007a.p029b.p042h.p044b.C0526m;
/* renamed from: b.a.a.b.h.a.i */
/* loaded from: classes.dex */
public abstract class AbstractC0507i<E> extends AbstractC0496a<E> implements AbstractC0519f {

    /* renamed from: c */
    private C0523j f763c;

    /* renamed from: d */
    private ServerSocketFactory f764d;

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f
    /* renamed from: a */
    public void mo38906a(C0523j c0523j) {
        this.f763c = c0523j;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractC0496a
    /* renamed from: d */
    protected ServerSocketFactory mo39074d() {
        return this.f764d;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f
    /* renamed from: f */
    public C0523j mo38904f() {
        if (this.f763c == null) {
            this.f763c = new C0523j();
        }
        return this.f763c;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractC0496a, p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        try {
            SSLContext a = mo38904f().a(this);
            C0526m m39007a = mo38904f().m39007a();
            m39007a.a(c_());
            this.f764d = new C0514a(m39007a, a.getServerSocketFactory());
            super.mo38474j();
        } catch (Exception e) {
            a(e.getMessage(), e);
        }
    }
}
