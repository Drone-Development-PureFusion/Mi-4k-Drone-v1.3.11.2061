package p070c.p072b;

import java.util.Iterator;
import java.util.List;
import org.p328c.AbstractC11693k;
import org.p328c.p347e.AbstractC11607b;
import org.p328c.p347e.AbstractC11630i;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p348a.AbstractC11598a;
import org.p328c.p347e.p348a.AbstractC11602b;
import org.p328c.p347e.p348a.AbstractC11604d;
import org.p328c.p347e.p348a.C11605e;
/* renamed from: c.b.e */
/* loaded from: classes.dex */
public class C0748e implements AbstractC0753i, AbstractC11602b, AbstractC11604d, AbstractC11607b {

    /* renamed from: a */
    private final Class<?> f1402a;

    /* renamed from: b */
    private final AbstractC11637l f1403b;

    /* renamed from: c */
    private final C0749f f1404c;

    public C0748e(Class<?> cls) {
        this(cls, C0749f.m38239a());
    }

    public C0748e(Class<?> cls, C0749f c0749f) {
        this.f1404c = c0749f;
        this.f1402a = cls;
        this.f1403b = AbstractC11630i.m490b(cls).mo489a();
    }

    /* renamed from: a */
    private C11622c m38243a(C11622c c11622c) {
        if (m38241b(c11622c)) {
            return C11622c.f36757a;
        }
        C11622c m535g = c11622c.m535g();
        Iterator<C11622c> it2 = c11622c.m541b().iterator();
        while (it2.hasNext()) {
            C11622c m38243a = m38243a(it2.next());
            if (!m38243a.m536f()) {
                m535g.m542a(m38243a);
            }
        }
        return m535g;
    }

    /* renamed from: b */
    private boolean m38241b(C11622c c11622c) {
        return c11622c.m540b(AbstractC11693k.class) != null;
    }

    @Override // p070c.p072b.AbstractC0753i
    /* renamed from: a */
    public int mo38166a() {
        return this.f1403b.m462h();
    }

    @Override // p070c.p072b.AbstractC0753i
    /* renamed from: a */
    public void mo38162a(C0757m c0757m) {
        this.f1403b.mo341a(this.f1404c.m38238a(c0757m, this));
    }

    @Override // org.p328c.p347e.p348a.AbstractC11602b
    /* renamed from: a */
    public void mo344a(AbstractC11598a abstractC11598a) {
        abstractC11598a.mo582a(this.f1403b);
    }

    @Override // org.p328c.p347e.p348a.AbstractC11604d
    /* renamed from: a */
    public void mo342a(C11605e c11605e) {
        c11605e.m578a(this.f1403b);
    }

    /* renamed from: b */
    public List<AbstractC0753i> m38242b() {
        return this.f1404c.m38235c(mo327d());
    }

    /* renamed from: c */
    public Class<?> m38240c() {
        return this.f1402a;
    }

    @Override // org.p328c.p347e.AbstractC11607b
    /* renamed from: d */
    public C11622c mo327d() {
        return m38243a(this.f1403b.mo327d());
    }

    public String toString() {
        return this.f1402a.getName();
    }
}
