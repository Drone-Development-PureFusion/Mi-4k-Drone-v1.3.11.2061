package org.p328c.p337b.p339b;

import java.lang.Throwable;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11435m;
import org.p325b.AbstractC11438p;
/* renamed from: org.c.b.b.b */
/* loaded from: classes.dex */
public class C11505b<T extends Throwable> extends AbstractC11438p<T> {

    /* renamed from: a */
    private final AbstractC11433k<? extends Throwable> f36610a;

    public C11505b(AbstractC11433k<? extends Throwable> abstractC11433k) {
        this.f36610a = abstractC11433k;
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T extends Throwable> AbstractC11433k<T> m908a(AbstractC11433k<? extends Throwable> abstractC11433k) {
        return new C11505b(abstractC11433k);
    }

    /* renamed from: a */
    protected void m909a(T t, AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("cause ");
        this.f36610a.mo1070a(t.getCause(), abstractC11428g);
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("exception with cause ");
        abstractC11428g.mo1083a((AbstractC11435m) this.f36610a);
    }

    /* renamed from: a */
    protected boolean m910a(T t) {
        return this.f36610a.mo900a(t.getCause());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p325b.AbstractC11438p
    /* renamed from: b */
    protected /* synthetic */ void mo902b(Object obj, AbstractC11428g abstractC11428g) {
        m909a((C11505b<T>) ((Throwable) obj), abstractC11428g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p325b.AbstractC11438p
    /* renamed from: b */
    protected /* synthetic */ boolean mo903b(Object obj) {
        return m910a((C11505b<T>) ((Throwable) obj));
    }
}
