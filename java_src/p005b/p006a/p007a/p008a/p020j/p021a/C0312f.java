package p005b.p006a.p007a.p008a.p020j.p021a;

import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f;
import p005b.p006a.p007a.p029b.p042h.p044b.C0514a;
import p005b.p006a.p007a.p029b.p042h.p044b.C0523j;
import p005b.p006a.p007a.p029b.p042h.p044b.C0526m;
/* renamed from: b.a.a.a.j.a.f */
/* loaded from: classes.dex */
public class C0312f extends C0314h implements AbstractC0519f {

    /* renamed from: b */
    private C0523j f280b;

    /* renamed from: c */
    private ServerSocketFactory f281c;

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f
    /* renamed from: a */
    public void mo38906a(C0523j c0523j) {
        this.f280b = c0523j;
    }

    @Override // p005b.p006a.p007a.p008a.p020j.p021a.C0314h
    /* renamed from: e */
    protected ServerSocketFactory mo39685e() {
        if (this.f281c == null) {
            SSLContext a = mo38904f().a(this);
            C0526m m39007a = mo38904f().m39007a();
            m39007a.a(c_());
            this.f281c = new C0514a(m39007a, a.getServerSocketFactory());
        }
        return this.f281c;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0519f
    /* renamed from: f */
    public C0523j mo38904f() {
        if (this.f280b == null) {
            this.f280b = new C0523j();
        }
        return this.f280b;
    }
}
