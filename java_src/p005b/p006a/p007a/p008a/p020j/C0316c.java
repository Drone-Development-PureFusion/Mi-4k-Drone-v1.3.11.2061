package p005b.p006a.p007a.p008a.p020j;

import org.p356d.AbstractC11759f;
import p005b.p006a.p007a.p008a.C0274c;
import p005b.p006a.p007a.p008a.C0291g;
import p005b.p006a.p007a.p008a.p010b.C0272b;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.AbstractC0594j;
import p005b.p006a.p007a.p029b.p031b.AbstractC0406b;
import p005b.p006a.p007a.p029b.p034e.C0423a;
import p005b.p006a.p007a.p029b.p042h.AbstractC0533e;
import p005b.p006a.p007a.p029b.p045i.AbstractC0591k;
/* renamed from: b.a.a.a.j.c */
/* loaded from: classes.dex */
public class C0316c extends AbstractC0533e<AbstractC0366d> {

    /* renamed from: a */
    static final String f291a = "%logger{20} - %m";

    /* renamed from: u */
    private boolean f292u = false;

    public C0316c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0316c(AbstractC0406b<AbstractC0366d> abstractC0406b) {
        this.f851p = abstractC0406b;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractC0533e
    /* renamed from: a */
    protected AbstractC0594j<AbstractC0366d> mo38945a(String str) {
        if (str == null) {
            str = f291a;
        }
        C0291g c0291g = new C0291g();
        c0291g.a(c_());
        c0291g.f(str);
        c0291g.a((AbstractC0591k) null);
        c0291g.j();
        return c0291g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p042h.AbstractC0533e
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo38950a(C0423a<AbstractC0366d> c0423a, AbstractC0366d abstractC0366d) {
        if (this.f292u) {
            abstractC0366d.mo39531i();
        }
        abstractC0366d.mo38531o();
        c0423a.m39350a((C0423a<AbstractC0366d>) abstractC0366d);
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractC0533e
    /* renamed from: a */
    protected void mo38949a(C0423a<AbstractC0366d> c0423a, StringBuffer stringBuffer) {
        int m39344e = c0423a.m39344e();
        for (int i = 0; i < m39344e; i++) {
            stringBuffer.append(this.f845j.mo38773a((AbstractC0594j<E>) c0423a.m39347c()));
        }
    }

    /* renamed from: a */
    public void m39677a(boolean z) {
        this.f292u = z;
    }

    /* renamed from: a */
    public boolean m39680a() {
        return this.f292u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p042h.AbstractC0533e
    /* renamed from: a */
    public boolean mo38940b(AbstractC0366d abstractC0366d) {
        AbstractC11759f mo39529k = abstractC0366d.mo39529k();
        if (mo39529k == null) {
            return false;
        }
        return mo39529k.mo5c(C0274c.f167e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p042h.AbstractC0533e
    /* renamed from: b */
    public C0291g mo38931f_(String str) {
        C0291g c0291g = new C0291g();
        c0291g.f(str + "%nopex");
        return c0291g;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.AbstractC0533e, p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f851p == null) {
            C0272b c0272b = new C0272b();
            c0272b.a(c_());
            c0272b.b("onError");
            c0272b.j();
            this.f851p = c0272b;
        }
        super.mo38474j();
    }
}
