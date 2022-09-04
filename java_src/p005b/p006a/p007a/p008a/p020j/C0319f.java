package p005b.p006a.p007a.p008a.p020j;

import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p029b.p042h.p044b.C0514a;
import p005b.p006a.p007a.p029b.p042h.p044b.C0526m;
/* renamed from: b.a.a.a.j.f */
/* loaded from: classes.dex */
public class C0319f extends C0320g {

    /* renamed from: b */
    private final ServerSocketFactory f297b;

    public C0319f(C0286f c0286f, int i) {
        this(c0286f, i, SSLContext.getDefault());
    }

    public C0319f(C0286f c0286f, int i, SSLContext sSLContext) {
        super(c0286f, i);
        if (sSLContext == null) {
            throw new NullPointerException("SSL context required");
        }
        C0526m c0526m = new C0526m();
        c0526m.a(c0286f);
        this.f297b = new C0514a(c0526m, sSLContext.getServerSocketFactory());
    }

    /* renamed from: a */
    public static void m39673a(String[] strArr) {
        a(C0319f.class, strArr);
    }

    @Override // p005b.p006a.p007a.p008a.p020j.C0320g
    /* renamed from: a */
    protected ServerSocketFactory mo39672a() {
        return this.f297b;
    }
}
