package p005b.p006a.p007a.p008a.p020j;

import java.net.InetAddress;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.p042h.AbstractC0495a;
import p005b.p006a.p007a.p029b.p055o.AbstractC0671o;
/* renamed from: b.a.a.a.j.d */
/* loaded from: classes.dex */
public class C0317d extends AbstractC0495a<AbstractC0366d> {

    /* renamed from: d */
    private final AbstractC0671o<AbstractC0366d> f293d = new C0306a();

    /* renamed from: e */
    private boolean f294e;

    public C0317d() {
    }

    @Deprecated
    public C0317d(String str, int i) {
        super(str, i);
    }

    @Deprecated
    public C0317d(InetAddress inetAddress, int i) {
        super(inetAddress.getHostAddress(), i);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractRunnableC0513b
    /* renamed from: a */
    public AbstractC0671o<AbstractC0366d> mo39051a() {
        return this.f293d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p042h.AbstractRunnableC0513b
    /* renamed from: a */
    public void mo39042b(AbstractC0366d abstractC0366d) {
        if (this.f294e) {
            abstractC0366d.mo39531i();
        }
    }

    /* renamed from: a */
    public void m39674a(boolean z) {
        this.f294e = z;
    }
}
