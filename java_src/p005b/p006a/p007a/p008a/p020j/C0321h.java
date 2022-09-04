package p005b.p006a.p007a.p008a.p020j;

import java.net.InetAddress;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.p042h.AbstractRunnableC0513b;
import p005b.p006a.p007a.p029b.p055o.AbstractC0671o;
/* renamed from: b.a.a.a.j.h */
/* loaded from: classes.dex */
public class C0321h extends AbstractRunnableC0513b<AbstractC0366d> {

    /* renamed from: d */
    private static final AbstractC0671o<AbstractC0366d> f305d = new C0306a();

    /* renamed from: e */
    private boolean f306e = false;

    public C0321h() {
    }

    @Deprecated
    public C0321h(String str, int i) {
        super(str, i);
    }

    @Deprecated
    public C0321h(InetAddress inetAddress, int i) {
        super(inetAddress.getHostAddress(), i);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractRunnableC0513b
    /* renamed from: a */
    public AbstractC0671o<AbstractC0366d> mo39051a() {
        return f305d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p042h.AbstractRunnableC0513b
    /* renamed from: a */
    public void mo39042b(AbstractC0366d abstractC0366d) {
        if (this.f306e) {
            abstractC0366d.mo39531i();
        }
    }

    /* renamed from: a */
    public void m39657a(boolean z) {
        this.f306e = z;
    }
}
