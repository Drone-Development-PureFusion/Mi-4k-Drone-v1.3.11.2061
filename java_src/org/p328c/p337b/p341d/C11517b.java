package org.p328c.p337b.p341d;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p349b.C11608a;
import org.p328c.p347e.p349b.C11611c;
import org.p328c.p350f.p351a.C11645e;
/* renamed from: org.c.b.d.b */
/* loaded from: classes2.dex */
public class C11517b extends AbstractC11637l {

    /* renamed from: a */
    private final List<Throwable> f36627a;

    /* renamed from: b */
    private final Class<?> f36628b;

    public C11517b(Class<?> cls, Throwable th) {
        if (cls == null) {
            throw new NullPointerException("Test class cannot be null");
        }
        this.f36628b = cls;
        this.f36627a = m881a(th);
    }

    /* renamed from: a */
    private List<Throwable> m881a(Throwable th) {
        return th instanceof InvocationTargetException ? m881a(th.getCause()) : th instanceof C11645e ? ((C11645e) th).m440a() : th instanceof C11541d ? ((C11541d) th).m843a() : Arrays.asList(th);
    }

    /* renamed from: a */
    private void m880a(Throwable th, C11611c c11611c) {
        C11622c m879b = m879b(th);
        c11611c.m560b(m879b);
        c11611c.m568a(new C11608a(m879b, th));
        c11611c.m556d(m879b);
    }

    /* renamed from: b */
    private C11622c m879b(Throwable th) {
        return C11622c.m549a(this.f36628b, "initializationError");
    }

    @Override // org.p328c.p347e.AbstractC11637l
    /* renamed from: a */
    public void mo341a(C11611c c11611c) {
        for (Throwable th : this.f36627a) {
            m880a(th, c11611c);
        }
    }

    @Override // org.p328c.p347e.AbstractC11637l, org.p328c.p347e.AbstractC11607b
    /* renamed from: d */
    public C11622c mo327d() {
        C11622c m550a = C11622c.m550a(this.f36628b);
        for (Throwable th : this.f36627a) {
            m550a.m542a(m879b(th));
        }
        return m550a;
    }
}
