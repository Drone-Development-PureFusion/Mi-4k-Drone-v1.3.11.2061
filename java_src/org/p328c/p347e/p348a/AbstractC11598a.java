package org.p328c.p347e.p348a;

import java.util.Iterator;
import org.p328c.p347e.C11622c;
/* renamed from: org.c.e.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC11598a {

    /* renamed from: a */
    public static final AbstractC11598a f36728a = new AbstractC11598a() { // from class: org.c.e.a.a.1
        @Override // org.p328c.p347e.p348a.AbstractC11598a
        /* renamed from: a */
        public String mo580a() {
            return "all tests";
        }

        @Override // org.p328c.p347e.p348a.AbstractC11598a
        /* renamed from: a */
        public AbstractC11598a mo581a(AbstractC11598a abstractC11598a) {
            return abstractC11598a;
        }

        @Override // org.p328c.p347e.p348a.AbstractC11598a
        /* renamed from: a */
        public void mo582a(Object obj) {
        }

        @Override // org.p328c.p347e.p348a.AbstractC11598a
        /* renamed from: a */
        public boolean mo579a(C11622c c11622c) {
            return true;
        }
    };

    /* renamed from: b */
    public static AbstractC11598a m583b(final C11622c c11622c) {
        return new AbstractC11598a() { // from class: org.c.e.a.a.2
            @Override // org.p328c.p347e.p348a.AbstractC11598a
            /* renamed from: a */
            public String mo580a() {
                return String.format("Method %s", C11622c.this.m552a());
            }

            @Override // org.p328c.p347e.p348a.AbstractC11598a
            /* renamed from: a */
            public boolean mo579a(C11622c c11622c2) {
                if (c11622c2.m538d()) {
                    return C11622c.this.equals(c11622c2);
                }
                Iterator<C11622c> it2 = c11622c2.m541b().iterator();
                while (it2.hasNext()) {
                    if (mo579a(it2.next())) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    /* renamed from: a */
    public abstract String mo580a();

    /* renamed from: a */
    public AbstractC11598a mo581a(final AbstractC11598a abstractC11598a) {
        return (abstractC11598a == this || abstractC11598a == f36728a) ? this : new AbstractC11598a() { // from class: org.c.e.a.a.3
            @Override // org.p328c.p347e.p348a.AbstractC11598a
            /* renamed from: a */
            public String mo580a() {
                return this.mo580a() + " and " + abstractC11598a.mo580a();
            }

            @Override // org.p328c.p347e.p348a.AbstractC11598a
            /* renamed from: a */
            public boolean mo579a(C11622c c11622c) {
                return this.mo579a(c11622c) && abstractC11598a.mo579a(c11622c);
            }
        };
    }

    /* renamed from: a */
    public void mo582a(Object obj) {
        if (!(obj instanceof AbstractC11602b)) {
            return;
        }
        ((AbstractC11602b) obj).mo344a(this);
    }

    /* renamed from: a */
    public abstract boolean mo579a(C11622c c11622c);
}
