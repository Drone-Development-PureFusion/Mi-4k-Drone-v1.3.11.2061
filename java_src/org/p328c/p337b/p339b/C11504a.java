package org.p328c.p337b.p339b;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Throwable;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11438p;
/* renamed from: org.c.b.b.a */
/* loaded from: classes.dex */
public class C11504a<T extends Throwable> extends AbstractC11438p<T> {

    /* renamed from: a */
    private final AbstractC11433k<T> f36609a;

    public C11504a(AbstractC11433k<T> abstractC11433k) {
        this.f36609a = abstractC11433k;
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T extends Throwable> AbstractC11433k<T> m913a(AbstractC11433k<T> abstractC11433k) {
        return new C11504a(abstractC11433k);
    }

    /* renamed from: b */
    private String m912b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @AbstractC11431i
    /* renamed from: b */
    public static <T extends Exception> AbstractC11433k<T> m911b(AbstractC11433k<T> abstractC11433k) {
        return new C11504a(abstractC11433k);
    }

    /* renamed from: a */
    protected void m914a(T t, AbstractC11428g abstractC11428g) {
        this.f36609a.mo1070a(t, abstractC11428g);
        abstractC11428g.mo1086a("\nStacktrace was: ");
        abstractC11428g.mo1086a(m912b((Throwable) t));
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        this.f36609a.a(abstractC11428g);
    }

    /* renamed from: a */
    protected boolean m915a(T t) {
        return this.f36609a.mo900a(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p325b.AbstractC11438p
    /* renamed from: b */
    protected /* synthetic */ void mo902b(Object obj, AbstractC11428g abstractC11428g) {
        m914a((C11504a<T>) ((Throwable) obj), abstractC11428g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p325b.AbstractC11438p
    /* renamed from: b */
    protected /* synthetic */ boolean mo903b(Object obj) {
        return m915a((C11504a<T>) ((Throwable) obj));
    }
}
