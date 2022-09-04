package org.p328c.p347e.p349b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.C11632j;
import org.p328c.p347e.p349b.C11609b;
/* renamed from: org.c.e.b.c */
/* loaded from: classes.dex */
public class C11611c {

    /* renamed from: a */
    private final List<C11609b> f36737a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private volatile boolean f36738b = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.c.e.b.c$a */
    /* loaded from: classes2.dex */
    public abstract class AbstractC11619a {

        /* renamed from: a */
        private final List<C11609b> f36753a;

        AbstractC11619a(C11611c c11611c) {
            this(c11611c.f36737a);
        }

        AbstractC11619a(List<C11609b> list) {
            this.f36753a = list;
        }

        /* renamed from: a */
        void m555a() {
            int size = this.f36753a.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (C11609b c11609b : this.f36753a) {
                try {
                    mo554a(c11609b);
                    arrayList.add(c11609b);
                } catch (Exception e) {
                    arrayList2.add(new C11608a(C11622c.f36758b, e));
                }
            }
            C11611c.this.m569a(arrayList, arrayList2);
        }

        /* renamed from: a */
        protected abstract void mo554a(C11609b c11609b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m569a(List<C11609b> list, final List<C11608a> list2) {
        if (!list2.isEmpty()) {
            new AbstractC11619a(list) { // from class: org.c.e.b.c.4
                @Override // org.p328c.p347e.p349b.C11611c.AbstractC11619a
                /* renamed from: a */
                protected void mo554a(C11609b c11609b) {
                    for (C11608a c11608a : list2) {
                        c11609b.mo476a(c11608a);
                    }
                }
            }.a();
        }
    }

    /* renamed from: a */
    public void m570a() {
        this.f36738b = true;
    }

    /* renamed from: a */
    public void m568a(C11608a c11608a) {
        m569a(this.f36737a, Arrays.asList(c11608a));
    }

    /* renamed from: a */
    public void m567a(C11609b c11609b) {
        if (c11609b == null) {
            throw new NullPointerException("Cannot add a null listener");
        }
        this.f36737a.add(m559c(c11609b));
    }

    /* renamed from: a */
    public void m564a(final C11622c c11622c) {
        new AbstractC11619a() { // from class: org.c.e.b.c.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C11611c.this);
            }

            @Override // org.p328c.p347e.p349b.C11611c.AbstractC11619a
            /* renamed from: a */
            protected void mo554a(C11609b c11609b) {
                c11609b.mo471d(c11622c);
            }
        }.a();
    }

    /* renamed from: a */
    public void m563a(final C11632j c11632j) {
        new AbstractC11619a() { // from class: org.c.e.b.c.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C11611c.this);
            }

            @Override // org.p328c.p347e.p349b.C11611c.AbstractC11619a
            /* renamed from: a */
            protected void mo554a(C11609b c11609b) {
                c11609b.mo474a(c11632j);
            }
        }.a();
    }

    /* renamed from: b */
    public void m562b(final C11608a c11608a) {
        new AbstractC11619a() { // from class: org.c.e.b.c.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C11611c.this);
            }

            @Override // org.p328c.p347e.p349b.C11611c.AbstractC11619a
            /* renamed from: a */
            protected void mo554a(C11609b c11609b) {
                c11609b.mo473b(c11608a);
            }
        }.a();
    }

    /* renamed from: b */
    public void m561b(C11609b c11609b) {
        if (c11609b == null) {
            throw new NullPointerException("Cannot remove a null listener");
        }
        this.f36737a.remove(m559c(c11609b));
    }

    /* renamed from: b */
    public void m560b(final C11622c c11622c) {
        if (this.f36738b) {
            throw new C11620d();
        }
        new AbstractC11619a() { // from class: org.c.e.b.c.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C11611c.this);
            }

            @Override // org.p328c.p347e.p349b.C11611c.AbstractC11619a
            /* renamed from: a */
            protected void mo554a(C11609b c11609b) {
                c11609b.mo553b(c11622c);
            }
        }.a();
    }

    /* renamed from: c */
    C11609b m559c(C11609b c11609b) {
        return c11609b.getClass().isAnnotationPresent(C11609b.AbstractC11610a.class) ? c11609b : new C11621e(c11609b, this);
    }

    /* renamed from: c */
    public void m558c(final C11622c c11622c) {
        new AbstractC11619a() { // from class: org.c.e.b.c.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C11611c.this);
            }

            @Override // org.p328c.p347e.p349b.C11611c.AbstractC11619a
            /* renamed from: a */
            protected void mo554a(C11609b c11609b) {
                c11609b.mo472c(c11622c);
            }
        }.a();
    }

    /* renamed from: d */
    public void m557d(C11609b c11609b) {
        if (c11609b == null) {
            throw new NullPointerException("Cannot add a null listener");
        }
        this.f36737a.add(0, m559c(c11609b));
    }

    /* renamed from: d */
    public void m556d(final C11622c c11622c) {
        new AbstractC11619a() { // from class: org.c.e.b.c.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C11611c.this);
            }

            @Override // org.p328c.p347e.p349b.C11611c.AbstractC11619a
            /* renamed from: a */
            protected void mo554a(C11609b c11609b) {
                c11609b.mo475a(c11622c);
            }
        }.a();
    }
}
