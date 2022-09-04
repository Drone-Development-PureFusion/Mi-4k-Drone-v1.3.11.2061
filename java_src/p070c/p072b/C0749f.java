package p070c.p072b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p349b.C11608a;
import org.p328c.p347e.p349b.C11609b;
import org.p328c.p347e.p349b.C11611c;
/* renamed from: c.b.f */
/* loaded from: classes.dex */
public class C0749f extends HashMap<C11622c, AbstractC0753i> {

    /* renamed from: a */
    private static final C0749f f1405a = new C0749f();
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public static C0749f m38239a() {
        return f1405a;
    }

    /* renamed from: a */
    public AbstractC0753i m38237a(C11622c c11622c) {
        if (c11622c.m539c()) {
            return m38236b(c11622c);
        }
        if (!containsKey(c11622c)) {
            put(c11622c, m38236b(c11622c));
        }
        return get(c11622c);
    }

    /* renamed from: a */
    public C11611c m38238a(final C0757m c0757m, C0748e c0748e) {
        C11611c c11611c = new C11611c();
        c11611c.m567a(new C11609b() { // from class: c.b.f.1
            @Override // org.p328c.p347e.p349b.C11609b
            /* renamed from: a */
            public void mo476a(C11608a c11608a) {
                c0757m.m38180a(C0749f.this.m38237a(c11608a.m574b()), c11608a.m573c());
            }

            @Override // org.p328c.p347e.p349b.C11609b
            /* renamed from: a */
            public void mo475a(C11622c c11622c) {
                c0757m.m38183a(C0749f.this.m38237a(c11622c));
            }

            @Override // org.p328c.p347e.p349b.C11609b
            /* renamed from: b */
            public void mo553b(C11622c c11622c) {
                c0757m.m38176b(C0749f.this.m38237a(c11622c));
            }
        });
        return c11611c;
    }

    /* renamed from: b */
    AbstractC0753i m38236b(C11622c c11622c) {
        if (c11622c.m538d()) {
            return new C0751g(c11622c);
        }
        C0759n c0759n = new C0759n(c11622c.m552a());
        Iterator<C11622c> it2 = c11622c.m541b().iterator();
        while (it2.hasNext()) {
            c0759n.m38164a(m38237a(it2.next()));
        }
        return c0759n;
    }

    /* renamed from: c */
    public List<AbstractC0753i> m38235c(C11622c c11622c) {
        if (c11622c.m538d()) {
            return Arrays.asList(m38237a(c11622c));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C11622c> it2 = c11622c.m541b().iterator();
        while (it2.hasNext()) {
            arrayList.add(m38237a(it2.next()));
        }
        return arrayList;
    }
}
