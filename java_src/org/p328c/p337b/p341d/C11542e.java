package org.p328c.p337b.p341d;

import java.lang.annotation.Annotation;
import org.p328c.p347e.AbstractC11607b;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p348a.AbstractC11598a;
import org.p328c.p347e.p348a.AbstractC11602b;
import org.p328c.p347e.p348a.AbstractC11604d;
import org.p328c.p347e.p348a.C11603c;
import org.p328c.p347e.p348a.C11605e;
import org.p328c.p347e.p349b.C11608a;
import org.p328c.p347e.p349b.C11611c;
import p070c.p071a.C0741c;
import p070c.p072b.AbstractC0753i;
import p070c.p072b.AbstractC0754j;
import p070c.p072b.AbstractC0756l;
import p070c.p072b.C0745b;
import p070c.p072b.C0757m;
import p070c.p072b.C0759n;
/* renamed from: org.c.b.d.e */
/* loaded from: classes2.dex */
public class C11542e extends AbstractC11637l implements AbstractC11602b, AbstractC11604d {

    /* renamed from: a */
    private volatile AbstractC0753i f36661a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.c.b.d.e$a */
    /* loaded from: classes2.dex */
    public static final class C11544a implements AbstractC0756l {

        /* renamed from: a */
        private final C11611c f36662a;

        private C11544a(C11611c c11611c) {
            this.f36662a = c11611c;
        }

        /* renamed from: c */
        private C11622c m832c(AbstractC0753i abstractC0753i) {
            return abstractC0753i instanceof AbstractC11607b ? ((AbstractC11607b) abstractC0753i).mo327d() : C11622c.m549a(m831d(abstractC0753i), m830e(abstractC0753i));
        }

        /* renamed from: d */
        private Class<? extends AbstractC0753i> m831d(AbstractC0753i abstractC0753i) {
            return abstractC0753i.getClass();
        }

        /* renamed from: e */
        private String m830e(AbstractC0753i abstractC0753i) {
            return abstractC0753i instanceof AbstractC0754j ? ((AbstractC0754j) abstractC0753i).m38193j() : abstractC0753i.toString();
        }

        @Override // p070c.p072b.AbstractC0756l
        /* renamed from: a */
        public void mo836a(AbstractC0753i abstractC0753i) {
            this.f36662a.m556d(m832c(abstractC0753i));
        }

        @Override // p070c.p072b.AbstractC0756l
        /* renamed from: a */
        public void mo835a(AbstractC0753i abstractC0753i, C0745b c0745b) {
            mo834a(abstractC0753i, (Throwable) c0745b);
        }

        @Override // p070c.p072b.AbstractC0756l
        /* renamed from: a */
        public void mo834a(AbstractC0753i abstractC0753i, Throwable th) {
            this.f36662a.m568a(new C11608a(m832c(abstractC0753i), th));
        }

        @Override // p070c.p072b.AbstractC0756l
        /* renamed from: b */
        public void mo833b(AbstractC0753i abstractC0753i) {
            this.f36662a.m560b(m832c(abstractC0753i));
        }
    }

    public C11542e(AbstractC0753i abstractC0753i) {
        m838b(abstractC0753i);
    }

    public C11542e(Class<?> cls) {
        this(new C0759n(cls.asSubclass(AbstractC0754j.class)));
    }

    /* renamed from: a */
    private AbstractC0753i m842a() {
        return this.f36661a;
    }

    /* renamed from: a */
    private static String m839a(C0759n c0759n) {
        int mo38166a = c0759n.mo38166a();
        return String.format("TestSuite with %s tests%s", Integer.valueOf(mo38166a), mo38166a == 0 ? "" : String.format(" [example: %s]", c0759n.m38165a(0)));
    }

    /* renamed from: a */
    private static C11622c m841a(AbstractC0753i abstractC0753i) {
        if (abstractC0753i instanceof AbstractC0754j) {
            AbstractC0754j abstractC0754j = (AbstractC0754j) abstractC0753i;
            return C11622c.m548a(abstractC0754j.getClass(), abstractC0754j.m38193j(), m840a(abstractC0754j));
        } else if (!(abstractC0753i instanceof C0759n)) {
            return abstractC0753i instanceof AbstractC11607b ? ((AbstractC11607b) abstractC0753i).mo327d() : abstractC0753i instanceof C0741c ? m841a(((C0741c) abstractC0753i).m38295b()) : C11622c.m550a(abstractC0753i.getClass());
        } else {
            C0759n c0759n = (C0759n) abstractC0753i;
            C11622c m543a = C11622c.m543a(c0759n.m38152c() == null ? m839a(c0759n) : c0759n.m38152c(), new Annotation[0]);
            int m38150d = c0759n.m38150d();
            for (int i = 0; i < m38150d; i++) {
                m543a.m542a(m841a(c0759n.m38165a(i)));
            }
            return m543a;
        }
    }

    /* renamed from: a */
    private static Annotation[] m840a(AbstractC0754j abstractC0754j) {
        try {
            return abstractC0754j.getClass().getMethod(abstractC0754j.m38193j(), new Class[0]).getDeclaredAnnotations();
        } catch (NoSuchMethodException | SecurityException e) {
            return new Annotation[0];
        }
    }

    /* renamed from: b */
    private void m838b(AbstractC0753i abstractC0753i) {
        this.f36661a = abstractC0753i;
    }

    @Override // org.p328c.p347e.p348a.AbstractC11602b
    /* renamed from: a */
    public void mo344a(AbstractC11598a abstractC11598a) {
        if (m842a() instanceof AbstractC11602b) {
            ((AbstractC11602b) m842a()).mo344a(abstractC11598a);
        } else if (m842a() instanceof C0759n) {
            C0759n c0759n = (C0759n) m842a();
            C0759n c0759n2 = new C0759n(c0759n.m38152c());
            int m38150d = c0759n.m38150d();
            for (int i = 0; i < m38150d; i++) {
                AbstractC0753i m38165a = c0759n.m38165a(i);
                if (abstractC11598a.mo579a(m841a(m38165a))) {
                    c0759n2.m38164a(m38165a);
                }
            }
            m838b(c0759n2);
            if (c0759n2.m38150d() != 0) {
                return;
            }
            throw new C11603c();
        }
    }

    @Override // org.p328c.p347e.p348a.AbstractC11604d
    /* renamed from: a */
    public void mo342a(C11605e c11605e) {
        if (m842a() instanceof AbstractC11604d) {
            ((AbstractC11604d) m842a()).mo342a(c11605e);
        }
    }

    @Override // org.p328c.p347e.AbstractC11637l
    /* renamed from: a */
    public void mo341a(C11611c c11611c) {
        C0757m c0757m = new C0757m();
        c0757m.m38178a(m837b(c11611c));
        m842a().mo38162a(c0757m);
    }

    /* renamed from: b */
    public AbstractC0756l m837b(C11611c c11611c) {
        return new C11544a(c11611c);
    }

    @Override // org.p328c.p347e.AbstractC11637l, org.p328c.p347e.AbstractC11607b
    /* renamed from: d */
    public C11622c mo327d() {
        return m841a(m842a());
    }
}
