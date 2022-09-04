package p005b.p006a.p007a.p029b.p036g;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0437d;
import p005b.p006a.p007a.p029b.p036g.p037a.C0441f;
import p005b.p006a.p007a.p029b.p036g.p037a.C0442g;
import p005b.p006a.p007a.p029b.p036g.p037a.C0443h;
import p005b.p006a.p007a.p029b.p036g.p037a.C0444i;
import p005b.p006a.p007a.p029b.p036g.p037a.C0450o;
import p005b.p006a.p007a.p029b.p036g.p037a.C0452p;
import p005b.p006a.p007a.p029b.p036g.p037a.C0454q;
import p005b.p006a.p007a.p029b.p036g.p037a.C0455r;
import p005b.p006a.p007a.p029b.p036g.p037a.C0456s;
import p005b.p006a.p007a.p029b.p036g.p037a.C0457t;
import p005b.p006a.p007a.p029b.p036g.p037a.C0458u;
import p005b.p006a.p007a.p029b.p036g.p040d.AbstractC0484p;
import p005b.p006a.p007a.p029b.p036g.p040d.C0476h;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p036g.p040d.C0480l;
/* renamed from: b.a.a.b.g.b */
/* loaded from: classes.dex */
public abstract class AbstractC0459b extends AbstractC0433a {
    @Override // p005b.p006a.p007a.p029b.p036g.AbstractC0433a
    /* renamed from: a */
    protected void mo38600a(C0480l c0480l) {
        C0452p c0452p = new C0452p();
        c0452p.a(this.f1199s);
        c0480l.m39183a(c0452p);
        C0450o c0450o = new C0450o();
        c0450o.a(this.f1199s);
        c0480l.m39183a(c0450o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p036g.AbstractC0433a
    /* renamed from: a */
    public void mo38599a(AbstractC0484p abstractC0484p) {
        abstractC0484p.mo39160a(new C0476h("configuration/property"), new C0456s());
        abstractC0484p.mo39160a(new C0476h("configuration/substitutionProperty"), new C0456s());
        abstractC0484p.mo39160a(new C0476h("configuration/timestamp"), new C0458u());
        abstractC0484p.mo39160a(new C0476h("configuration/define"), new C0444i());
        abstractC0484p.mo39160a(new C0476h("configuration/conversionRule"), new C0443h());
        abstractC0484p.mo39160a(new C0476h("configuration/statusListener"), new C0457t());
        abstractC0484p.mo39160a(new C0476h("configuration/appender"), new C0441f());
        abstractC0484p.mo39160a(new C0476h("configuration/appender/appender-ref"), new C0442g());
        abstractC0484p.mo39160a(new C0476h("configuration/newRule"), new C0454q());
        abstractC0484p.mo39160a(new C0476h("*/param"), new C0455r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p036g.AbstractC0433a
    /* renamed from: b */
    public void mo39257b() {
        super.mo39257b();
        Map<String, Object> m39186h = this.f548a.m39168c().m39186h();
        m39186h.put(AbstractC0437d.f578m, new HashMap());
        m39186h.put(AbstractC0437d.f579n, new HashMap());
    }

    /* renamed from: c */
    public List m39256c() {
        return null;
    }

    /* renamed from: f */
    public C0479k m39255f() {
        return this.f548a.m39168c();
    }
}
