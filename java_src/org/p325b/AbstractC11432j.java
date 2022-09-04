package org.p325b;

import org.p325b.p327b.C11417b;
/* renamed from: org.b.j */
/* loaded from: classes2.dex */
public abstract class AbstractC11432j<T, U> extends AbstractC11437o<T> {

    /* renamed from: a */
    private static final C11417b f36542a = new C11417b("featureValueOf", 1, 0);

    /* renamed from: b */
    private final AbstractC11433k<? super U> f36543b;

    /* renamed from: c */
    private final String f36544c;

    /* renamed from: d */
    private final String f36545d;

    public AbstractC11432j(AbstractC11433k<? super U> abstractC11433k, String str, String str2) {
        super(f36542a);
        this.f36543b = abstractC11433k;
        this.f36544c = str;
        this.f36545d = str2;
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public final void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a(this.f36544c).mo1086a(" ").mo1083a((AbstractC11435m) this.f36543b);
    }

    /* renamed from: b */
    protected abstract U m1080b(T t);

    @Override // org.p325b.AbstractC11437o
    /* renamed from: b */
    protected boolean mo1071b(T t, AbstractC11428g abstractC11428g) {
        U m1080b = m1080b(t);
        if (!this.f36543b.mo900a(m1080b)) {
            abstractC11428g.mo1086a(this.f36545d).mo1086a(" ");
            this.f36543b.mo1070a(m1080b, abstractC11428g);
            return false;
        }
        return true;
    }
}
