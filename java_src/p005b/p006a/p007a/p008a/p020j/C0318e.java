package p005b.p006a.p007a.p008a.p020j;

import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f;
import p005b.p006a.p007a.p029b.p042h.p044b.C0515b;
import p005b.p006a.p007a.p029b.p042h.p044b.C0523j;
import p005b.p006a.p007a.p029b.p042h.p044b.C0526m;
/* renamed from: b.a.a.a.j.e */
/* loaded from: classes.dex */
public class C0318e extends RunnableC0323j implements AbstractC0519f {

    /* renamed from: a */
    private C0523j f295a;

    /* renamed from: b */
    private SocketFactory f296b;

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f
    /* renamed from: a */
    public void mo38906a(C0523j c0523j) {
        this.f295a = c0523j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p008a.p020j.RunnableC0323j, p005b.p006a.p007a.p008a.p020j.AbstractC0315b
    /* renamed from: a */
    public boolean mo39655a() {
        try {
            SSLContext a = mo38904f().a(this);
            C0526m m39007a = mo38904f().m39007a();
            m39007a.a(c_());
            this.f296b = new C0515b(m39007a, a.getSocketFactory());
            return super.mo39655a();
        } catch (Exception e) {
            a(e.getMessage(), e);
            return false;
        }
    }

    @Override // p005b.p006a.p007a.p008a.p020j.RunnableC0323j
    /* renamed from: e */
    protected SocketFactory mo39644e() {
        return this.f296b;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f
    /* renamed from: f */
    public C0523j mo38904f() {
        if (this.f295a == null) {
            this.f295a = new C0523j();
        }
        return this.f295a;
    }
}
