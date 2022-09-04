package p005b.p006a.p007a.p008a.p025m;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
import p005b.p006a.p007a.p029b.p036g.p038b.AbstractC0462c;
import p005b.p006a.p007a.p029b.p036g.p038b.C0463d;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p054n.AbstractC0645c;
/* renamed from: b.a.a.a.m.d */
/* loaded from: classes.dex */
public class C0360d extends AbstractC0436c implements AbstractC0462c {

    /* renamed from: a */
    List<C0463d> f359a;

    /* renamed from: a */
    public List<C0463d> m39581a() {
        return this.f359a;
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p038b.AbstractC0462c
    /* renamed from: a */
    public void mo39252a(C0463d c0463d) {
        this.f359a.add(c0463d);
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
        c0479k.m39194b(this);
        Object m39189f = c0479k.m39189f();
        if (m39189f instanceof C0361e) {
            C0361e c0361e = (C0361e) m39189f;
            c0361e.a((AbstractC0645c) new C0357a(this.f359a, c0361e.f(), c0479k.mo38528o()));
        }
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f359a = new ArrayList();
        c0479k.m39201a((AbstractC0462c) this);
    }
}
