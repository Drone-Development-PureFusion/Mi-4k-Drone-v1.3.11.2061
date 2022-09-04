package org.p325b.p326a;

import java.util.ArrayList;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11435m;
import org.p325b.AbstractC11437o;
/* renamed from: org.b.a.c */
/* loaded from: classes.dex */
public class C11397c<T> extends AbstractC11437o<T> {

    /* renamed from: a */
    private final AbstractC11433k<? super T> f36511a;

    /* renamed from: org.b.a.c$a */
    /* loaded from: classes2.dex */
    public static final class C11398a<X> {

        /* renamed from: a */
        private final AbstractC11433k<? super X> f36512a;

        public C11398a(AbstractC11433k<? super X> abstractC11433k) {
            this.f36512a = abstractC11433k;
        }

        /* renamed from: a */
        public C11397c<X> m1182a(AbstractC11433k<? super X> abstractC11433k) {
            return new C11397c(this.f36512a).m1187a((AbstractC11433k) abstractC11433k);
        }
    }

    /* renamed from: org.b.a.c$b */
    /* loaded from: classes2.dex */
    public static final class C11399b<X> {

        /* renamed from: a */
        private final AbstractC11433k<? super X> f36513a;

        public C11399b(AbstractC11433k<? super X> abstractC11433k) {
            this.f36513a = abstractC11433k;
        }

        /* renamed from: a */
        public C11397c<X> m1181a(AbstractC11433k<? super X> abstractC11433k) {
            return new C11397c(this.f36513a).m1186b(abstractC11433k);
        }
    }

    public C11397c(AbstractC11433k<? super T> abstractC11433k) {
        this.f36511a = abstractC11433k;
    }

    @AbstractC11431i
    /* renamed from: c */
    public static <LHS> C11398a<LHS> m1185c(AbstractC11433k<? super LHS> abstractC11433k) {
        return new C11398a<>(abstractC11433k);
    }

    @AbstractC11431i
    /* renamed from: d */
    public static <LHS> C11399b<LHS> m1184d(AbstractC11433k<? super LHS> abstractC11433k) {
        return new C11399b<>(abstractC11433k);
    }

    /* renamed from: e */
    private ArrayList<AbstractC11433k<? super T>> m1183e(AbstractC11433k<? super T> abstractC11433k) {
        ArrayList<AbstractC11433k<? super T>> arrayList = new ArrayList<>();
        arrayList.add(this.f36511a);
        arrayList.add(abstractC11433k);
        return arrayList;
    }

    /* renamed from: a */
    public C11397c<T> m1187a(AbstractC11433k<? super T> abstractC11433k) {
        return new C11397c<>(new C11395a(m1183e(abstractC11433k)));
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1083a((AbstractC11435m) this.f36511a);
    }

    /* renamed from: b */
    public C11397c<T> m1186b(AbstractC11433k<? super T> abstractC11433k) {
        return new C11397c<>(new C11396b(m1183e(abstractC11433k)));
    }

    @Override // org.p325b.AbstractC11437o
    /* renamed from: b */
    protected boolean mo1071b(T t, AbstractC11428g abstractC11428g) {
        if (!this.f36511a.mo900a(t)) {
            this.f36511a.mo1070a(t, abstractC11428g);
            return false;
        }
        return true;
    }
}
