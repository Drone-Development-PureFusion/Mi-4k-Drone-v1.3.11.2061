package org.p328c.p346d;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.p325b.AbstractC11433k;
import org.p328c.C11565c;
import org.p328c.p350f.p351a.C11646f;
/* renamed from: org.c.d.b */
/* loaded from: classes2.dex */
public class C11569b extends AbstractC11593p {

    /* renamed from: a */
    private List<Throwable> f36688a = new ArrayList();

    /* renamed from: a */
    public <T> T m676a(Callable<T> callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            m677a(th);
            return null;
        }
    }

    @Override // org.p328c.p346d.AbstractC11593p
    /* renamed from: a */
    protected void mo588a() {
        C11646f.m438a(this.f36688a);
    }

    /* renamed from: a */
    public <T> void m679a(T t, AbstractC11433k<T> abstractC11433k) {
        m678a("", t, abstractC11433k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> void m678a(final String str, final T t, final AbstractC11433k<T> abstractC11433k) {
        m676a(new Callable<Object>() { // from class: org.c.d.b.1
            @Override // java.util.concurrent.Callable
            public Object call() {
                C11565c.m750a(str, t, (AbstractC11433k<? super Object>) abstractC11433k);
                return t;
            }
        });
    }

    /* renamed from: a */
    public void m677a(Throwable th) {
        this.f36688a.add(th);
    }
}
