package org.p325b;
/* renamed from: org.b.c */
/* loaded from: classes2.dex */
public abstract class AbstractC11420c<T> {

    /* renamed from: a */
    public static final C11423b<Object> f36536a = new C11423b<>();

    /* renamed from: org.b.c$a */
    /* loaded from: classes2.dex */
    private static final class C11422a<T> extends AbstractC11420c<T> {

        /* renamed from: b */
        private final T f36537b;

        /* renamed from: c */
        private final AbstractC11428g f36538c;

        private C11422a(T t, AbstractC11428g abstractC11428g) {
            super();
            this.f36537b = t;
            this.f36538c = abstractC11428g;
        }

        @Override // org.p325b.AbstractC11420c
        /* renamed from: a */
        public <U> AbstractC11420c<U> mo1132a(AbstractC11424c<? super T, U> abstractC11424c) {
            return abstractC11424c.m1130a((T) this.f36537b, this.f36538c);
        }

        @Override // org.p325b.AbstractC11420c
        /* renamed from: a */
        public boolean mo1131a(AbstractC11433k<T> abstractC11433k, String str) {
            if (abstractC11433k.mo900a(this.f36537b)) {
                return true;
            }
            this.f36538c.mo1086a(str);
            abstractC11433k.mo1070a(this.f36537b, this.f36538c);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.b.c$b */
    /* loaded from: classes2.dex */
    public static final class C11423b<T> extends AbstractC11420c<T> {
        private C11423b() {
            super();
        }

        @Override // org.p325b.AbstractC11420c
        /* renamed from: a */
        public <U> AbstractC11420c<U> mo1132a(AbstractC11424c<? super T, U> abstractC11424c) {
            return a();
        }

        @Override // org.p325b.AbstractC11420c
        /* renamed from: a */
        public boolean mo1131a(AbstractC11433k<T> abstractC11433k, String str) {
            return false;
        }
    }

    /* renamed from: org.b.c$c */
    /* loaded from: classes2.dex */
    public interface AbstractC11424c<I, O> {
        /* renamed from: a */
        AbstractC11420c<O> m1130a(I i, AbstractC11428g abstractC11428g);
    }

    private AbstractC11420c() {
    }

    /* renamed from: a */
    public static <T> AbstractC11420c<T> m1136a() {
        return f36536a;
    }

    /* renamed from: a */
    public static <T> AbstractC11420c<T> m1135a(T t, AbstractC11428g abstractC11428g) {
        return new C11422a(t, abstractC11428g);
    }

    /* renamed from: a */
    public abstract <U> AbstractC11420c<U> mo1132a(AbstractC11424c<? super T, U> abstractC11424c);

    /* renamed from: a */
    public final boolean m1134a(AbstractC11433k<T> abstractC11433k) {
        return mo1131a(abstractC11433k, "");
    }

    /* renamed from: a */
    public abstract boolean mo1131a(AbstractC11433k<T> abstractC11433k, String str);

    /* renamed from: b */
    public final <U> AbstractC11420c<U> m1133b(AbstractC11424c<? super T, U> abstractC11424c) {
        return mo1132a(abstractC11424c);
    }
}
