package p005b.p006a.p007a.p029b.p045i.p047b;

import java.util.Map;
import p005b.p006a.p007a.p029b.p045i.AbstractC0547a;
import p005b.p006a.p007a.p029b.p045i.AbstractC0566b;
import p005b.p006a.p007a.p029b.p045i.AbstractC0584d;
import p005b.p006a.p007a.p029b.p045i.C0588h;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p056p.C0676a;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.a.a.b.i.b.a */
/* loaded from: classes.dex */
public class C0567a<E> extends C0662f {

    /* renamed from: a */
    AbstractC0566b<E> f944a;

    /* renamed from: b */
    AbstractC0566b<E> f945b;

    /* renamed from: c */
    final C0570d f946c;

    /* renamed from: d */
    final Map f947d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0567a(C0570d c0570d, Map map) {
        this.f946c = c0570d;
        this.f947d = map;
    }

    /* renamed from: a */
    private void m38855a(AbstractC0566b<E> abstractC0566b) {
        if (this.f944a == null) {
            this.f945b = abstractC0566b;
            this.f944a = abstractC0566b;
            return;
        }
        this.f945b.m38859b(abstractC0566b);
        this.f945b = abstractC0566b;
    }

    /* renamed from: a */
    AbstractC0547a<E> m38857a(C0568b c0568b) {
        String str = (String) c0568b.d();
        String str2 = (String) this.f947d.get(str);
        if (str2 == null) {
            c("There is no conversion class registered for composite conversion word [" + str + "]");
            return null;
        }
        try {
            return (AbstractC0547a) C0724u.m38382a(str2, AbstractC0547a.class, this.f1199s);
        } catch (Exception e) {
            a("Failed to instantiate converter class [" + str2 + "] as a composite converter for keyword [" + str + "]", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC0566b<E> m38858a() {
        this.f945b = null;
        this.f944a = null;
        for (C0570d c0570d = this.f946c; c0570d != null; c0570d = c0570d.f955h) {
            switch (c0570d.f953f) {
                case 0:
                    m38855a(new C0588h<>((String) c0570d.m38848d()));
                    break;
                case 1:
                    C0573g c0573g = (C0573g) c0570d;
                    AbstractC0584d<E> m38856a = m38856a(c0573g);
                    if (m38856a != null) {
                        m38856a.a(c0573g.b());
                        m38856a.m38811a(c0573g.m38829g());
                        m38855a(m38856a);
                        break;
                    } else {
                        AbstractC0566b<E> c0588h = new C0588h<>("%PARSER_ERROR[" + c0573g.d() + "]");
                        a(new C0676a("[" + c0573g.d() + "] is not a valid conversion word", this));
                        m38855a(c0588h);
                        break;
                    }
                case 2:
                    C0568b c0568b = (C0568b) c0570d;
                    AbstractC0547a<E> m38857a = m38857a(c0568b);
                    if (m38857a == null) {
                        c("Failed to create converter for [%" + c0568b.d() + "] keyword");
                        m38855a(new C0588h<>("%PARSER_ERROR[" + c0568b.d() + "]"));
                        break;
                    } else {
                        m38857a.a(c0568b.b());
                        m38857a.a(c0568b.g());
                        C0567a c0567a = new C0567a(c0568b.m38854a(), this.f947d);
                        c0567a.a(this.f1199s);
                        m38857a.m38862a((AbstractC0566b) c0567a.m38858a());
                        m38855a(m38857a);
                        break;
                    }
            }
        }
        return this.f944a;
    }

    /* renamed from: a */
    AbstractC0584d<E> m38856a(C0573g c0573g) {
        String str = (String) c0573g.d();
        String str2 = (String) this.f947d.get(str);
        if (str2 == null) {
            c("There is no conversion class registered for conversion word [" + str + "]");
            return null;
        }
        try {
            return (AbstractC0584d) C0724u.m38382a(str2, AbstractC0584d.class, this.f1199s);
        } catch (Exception e) {
            a("Failed to instantiate converter class [" + str2 + "] for keyword [" + str + "]", e);
            return null;
        }
    }
}
