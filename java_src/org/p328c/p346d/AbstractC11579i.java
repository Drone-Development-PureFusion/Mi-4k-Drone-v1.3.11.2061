package org.p328c.p346d;

import java.util.concurrent.TimeUnit;
import org.p328c.C11595e;
import org.p328c.p347e.C11622c;
import org.p328c.p350f.p351a.AbstractC11650j;
/* renamed from: org.c.d.i */
/* loaded from: classes2.dex */
public abstract class AbstractC11579i implements AbstractC11585l {

    /* renamed from: a */
    private final C11581a f36703a;

    /* renamed from: b */
    private volatile long f36704b;

    /* renamed from: c */
    private volatile long f36705c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.c.d.i$a */
    /* loaded from: classes2.dex */
    public static class C11581a {
        C11581a() {
        }

        /* renamed from: a */
        public long m637a() {
            return System.nanoTime();
        }
    }

    /* renamed from: org.c.d.i$b */
    /* loaded from: classes2.dex */
    private class C11582b extends AbstractC11586m {
        private C11582b() {
        }

        @Override // org.p328c.p346d.AbstractC11586m
        /* renamed from: a */
        protected void mo621a(Throwable th, C11622c c11622c) {
            AbstractC11579i.this.m639c();
            AbstractC11579i.this.m647a(AbstractC11579i.this.m648a(), th, c11622c);
        }

        @Override // org.p328c.p346d.AbstractC11586m
        /* renamed from: a */
        protected void mo614a(C11622c c11622c) {
            AbstractC11579i.this.m642b();
        }

        @Override // org.p328c.p346d.AbstractC11586m
        /* renamed from: a */
        protected void mo612a(C11595e c11595e, C11622c c11622c) {
            AbstractC11579i.this.m639c();
            AbstractC11579i.this.m645a(AbstractC11579i.this.m648a(), c11595e, c11622c);
        }

        @Override // org.p328c.p346d.AbstractC11586m
        /* renamed from: b */
        protected void mo610b(C11622c c11622c) {
            AbstractC11579i.this.m641b(AbstractC11579i.this.m648a(), c11622c);
        }

        @Override // org.p328c.p346d.AbstractC11586m
        /* renamed from: c */
        protected void mo607c(C11622c c11622c) {
            AbstractC11579i.this.m639c();
            AbstractC11579i.this.m646a(AbstractC11579i.this.m648a(), c11622c);
        }
    }

    public AbstractC11579i() {
        this(new C11581a());
    }

    AbstractC11579i(C11581a c11581a) {
        this.f36703a = c11581a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public long m648a() {
        if (this.f36704b == 0) {
            throw new IllegalStateException("Test has not started");
        }
        long j = this.f36705c;
        if (j == 0) {
            j = this.f36703a.m637a();
        }
        return j - this.f36704b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m642b() {
        this.f36704b = this.f36703a.m637a();
        this.f36705c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m639c() {
        this.f36705c = this.f36703a.m637a();
    }

    /* renamed from: a */
    public long m644a(TimeUnit timeUnit) {
        return timeUnit.convert(m648a(), TimeUnit.NANOSECONDS);
    }

    @Override // org.p328c.p346d.AbstractC11585l
    /* renamed from: a */
    public final AbstractC11650j mo587a(AbstractC11650j abstractC11650j, C11622c c11622c) {
        return new C11582b().a(abstractC11650j, c11622c);
    }

    /* renamed from: a */
    protected void m647a(long j, Throwable th, C11622c c11622c) {
    }

    /* renamed from: a */
    protected void m646a(long j, C11622c c11622c) {
    }

    /* renamed from: a */
    protected void m645a(long j, C11595e c11595e, C11622c c11622c) {
    }

    /* renamed from: b */
    protected void m641b(long j, C11622c c11622c) {
    }
}
