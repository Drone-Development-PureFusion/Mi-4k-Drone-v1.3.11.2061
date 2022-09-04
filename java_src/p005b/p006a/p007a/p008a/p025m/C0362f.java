package p005b.p006a.p007a.p008a.p025m;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p008a.p028p.C0396d;
import p005b.p006a.p007a.p029b.AbstractC0401a;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0437d;
import p005b.p006a.p007a.p029b.p036g.p037a.C0441f;
import p005b.p006a.p007a.p029b.p036g.p040d.AbstractC0484p;
import p005b.p006a.p007a.p029b.p036g.p040d.C0474f;
import p005b.p006a.p007a.p029b.p036g.p040d.C0475g;
import p005b.p006a.p007a.p029b.p036g.p040d.C0476h;
import p005b.p006a.p007a.p029b.p054n.AbstractC0650h;
/* renamed from: b.a.a.a.m.f */
/* loaded from: classes.dex */
public class C0362f extends AbstractC0650h<AbstractC0366d> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0362f(String str, String str2, Map<String, String> map) {
        super(str, str2, map);
    }

    @Override // p005b.p006a.p007a.p029b.p036g.AbstractC0433a
    /* renamed from: a */
    protected C0475g mo39309a() {
        return new C0475g("configuration");
    }

    @Override // p005b.p006a.p007a.p029b.p036g.AbstractC0433a
    /* renamed from: a */
    protected void mo39307a(C0474f c0474f) {
        C0396d.m39430a(c0474f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p054n.AbstractC0650h, p005b.p006a.p007a.p029b.p036g.AbstractC0433a
    /* renamed from: a */
    public void mo38599a(AbstractC0484p abstractC0484p) {
        super.mo38599a(abstractC0484p);
        abstractC0484p.mo39160a(new C0476h("configuration/appender"), new C0441f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p036g.AbstractC0433a
    /* renamed from: b */
    public void mo39257b() {
        super.b();
        Map<String, Object> m39186h = this.f548a.m39168c().m39186h();
        m39186h.put(AbstractC0437d.f578m, new HashMap());
        m39186h.put(AbstractC0437d.f579n, new HashMap());
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f1172d);
        hashMap.put(this.f1170b, this.f1171c);
        this.f548a.m39172a(hashMap);
    }

    @Override // p005b.p006a.p007a.p029b.p054n.AbstractC0650h
    /* renamed from: c */
    public AbstractC0401a<AbstractC0366d> mo38596c() {
        HashMap hashMap = (HashMap) this.f548a.m39168c().m39186h().get(AbstractC0437d.f578m);
        a(hashMap);
        Collection values = hashMap.values();
        if (values.size() == 0) {
            return null;
        }
        return (AbstractC0401a) values.iterator().next();
    }
}
