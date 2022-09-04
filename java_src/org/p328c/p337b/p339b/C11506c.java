package org.p328c.p337b.p339b;

import java.lang.Throwable;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11435m;
import org.p325b.AbstractC11438p;
/* renamed from: org.c.b.b.c */
/* loaded from: classes.dex */
public class C11506c<T extends Throwable> extends AbstractC11438p<T> {

    /* renamed from: a */
    private final AbstractC11433k<String> f36611a;

    public C11506c(AbstractC11433k<String> abstractC11433k) {
        this.f36611a = abstractC11433k;
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T extends Throwable> AbstractC11433k<T> m904a(AbstractC11433k<String> abstractC11433k) {
        return new C11506c(abstractC11433k);
    }

    /* renamed from: a */
    protected void m906a(T t, AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("message ");
        this.f36611a.mo1070a(t.getMessage(), abstractC11428g);
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("exception with message ");
        abstractC11428g.mo1083a((AbstractC11435m) this.f36611a);
    }

    /* renamed from: a */
    protected boolean m907a(T t) {
        return this.f36611a.mo900a(t.getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p325b.AbstractC11438p
    /* renamed from: b */
    protected /* synthetic */ void mo902b(Object obj, AbstractC11428g abstractC11428g) {
        m906a((C11506c<T>) ((Throwable) obj), abstractC11428g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p325b.AbstractC11438p
    /* renamed from: b */
    protected /* synthetic */ boolean mo903b(Object obj) {
        return m907a((C11506c<T>) ((Throwable) obj));
    }
}
