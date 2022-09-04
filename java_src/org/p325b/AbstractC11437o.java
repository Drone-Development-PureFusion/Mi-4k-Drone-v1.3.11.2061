package org.p325b;

import org.p325b.AbstractC11428g;
import org.p325b.p327b.C11417b;
/* renamed from: org.b.o */
/* loaded from: classes2.dex */
public abstract class AbstractC11437o<T> extends AbstractC11415b<T> {

    /* renamed from: a */
    private static final C11417b f36547a = new C11417b("matchesSafely", 2, 0);

    /* renamed from: b */
    private final Class<?> f36548b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11437o() {
        this(f36547a);
    }

    protected AbstractC11437o(Class<?> cls) {
        this.f36548b = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11437o(C11417b c11417b) {
        this.f36548b = c11417b.m1140a(getClass());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p325b.AbstractC11415b, org.p325b.AbstractC11433k
    /* renamed from: a */
    public final void mo1070a(Object obj, AbstractC11428g abstractC11428g) {
        if (obj == 0 || !this.f36548b.isInstance(obj)) {
            super.mo1070a(obj, abstractC11428g);
        } else {
            mo1071b(obj, abstractC11428g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p325b.AbstractC11433k
    /* renamed from: a */
    public final boolean mo900a(Object obj) {
        return obj != 0 && this.f36548b.isInstance(obj) && mo1071b(obj, new AbstractC11428g.C11429a());
    }

    /* renamed from: b */
    protected abstract boolean mo1071b(T t, AbstractC11428g abstractC11428g);
}
