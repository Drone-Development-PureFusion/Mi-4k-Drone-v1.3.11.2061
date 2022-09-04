package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.pg */
/* loaded from: classes2.dex */
public final class C7546pg extends C7602ps {

    /* renamed from: a */
    private static final Writer f25063a = new Writer() { // from class: com.google.android.gms.internal.pg.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* renamed from: b */
    private static final C7478od f25064b = new C7478od("closed");

    /* renamed from: d */
    private String f25066d;

    /* renamed from: c */
    private final List<AbstractC7471nx> f25065c = new ArrayList();

    /* renamed from: e */
    private AbstractC7471nx f25067e = C7473nz.f24952a;

    public C7546pg() {
        super(f25063a);
    }

    /* renamed from: a */
    private void m14254a(AbstractC7471nx abstractC7471nx) {
        if (this.f25066d != null) {
            if (!abstractC7471nx.m14368k() || i()) {
                ((C7475oa) m14253j()).m14361a(this.f25066d, abstractC7471nx);
            }
            this.f25066d = null;
        } else if (this.f25065c.isEmpty()) {
            this.f25067e = abstractC7471nx;
        } else {
            AbstractC7471nx m14253j = m14253j();
            if (!(m14253j instanceof C7468nu)) {
                throw new IllegalStateException();
            }
            ((C7468nu) m14253j).m14373a(abstractC7471nx);
        }
    }

    /* renamed from: j */
    private AbstractC7471nx m14253j() {
        return this.f25065c.get(this.f25065c.size() - 1);
    }

    /* renamed from: a */
    public AbstractC7471nx m14255a() {
        if (!this.f25065c.isEmpty()) {
            String valueOf = String.valueOf(this.f25065c);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 34).append("Expected one JSON element but was ").append(valueOf).toString());
        }
        return this.f25067e;
    }

    @Override // com.google.android.gms.internal.C7602ps
    /* renamed from: a */
    public C7602ps mo14111a(long j) {
        m14254a(new C7478od((Number) Long.valueOf(j)));
        return this;
    }

    @Override // com.google.android.gms.internal.C7602ps
    /* renamed from: a */
    public C7602ps mo14110a(Number number) {
        if (number == null) {
            return mo14095f();
        }
        if (!g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                String valueOf = String.valueOf(number);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("JSON forbids NaN and infinities: ").append(valueOf).toString());
            }
        }
        m14254a(new C7478od(number));
        return this;
    }

    @Override // com.google.android.gms.internal.C7602ps
    /* renamed from: a */
    public C7602ps mo14109a(String str) {
        if (this.f25065c.isEmpty() || this.f25066d != null) {
            throw new IllegalStateException();
        }
        if (!(m14253j() instanceof C7475oa)) {
            throw new IllegalStateException();
        }
        this.f25066d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.C7602ps
    /* renamed from: a */
    public C7602ps mo14108a(boolean z) {
        m14254a(new C7478od(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.android.gms.internal.C7602ps
    /* renamed from: b */
    public C7602ps mo14107b() {
        C7468nu c7468nu = new C7468nu();
        m14254a(c7468nu);
        this.f25065c.add(c7468nu);
        return this;
    }

    @Override // com.google.android.gms.internal.C7602ps
    /* renamed from: b */
    public C7602ps mo14105b(String str) {
        if (str == null) {
            return mo14095f();
        }
        m14254a(new C7478od(str));
        return this;
    }

    @Override // com.google.android.gms.internal.C7602ps
    /* renamed from: c */
    public C7602ps mo14103c() {
        if (this.f25065c.isEmpty() || this.f25066d != null) {
            throw new IllegalStateException();
        }
        if (!(m14253j() instanceof C7468nu)) {
            throw new IllegalStateException();
        }
        this.f25065c.remove(this.f25065c.size() - 1);
        return this;
    }

    @Override // com.google.android.gms.internal.C7602ps, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f25065c.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f25065c.add(f25064b);
    }

    @Override // com.google.android.gms.internal.C7602ps
    /* renamed from: d */
    public C7602ps mo14100d() {
        C7475oa c7475oa = new C7475oa();
        m14254a(c7475oa);
        this.f25065c.add(c7475oa);
        return this;
    }

    @Override // com.google.android.gms.internal.C7602ps
    /* renamed from: e */
    public C7602ps mo14097e() {
        if (this.f25065c.isEmpty() || this.f25066d != null) {
            throw new IllegalStateException();
        }
        if (!(m14253j() instanceof C7475oa)) {
            throw new IllegalStateException();
        }
        this.f25065c.remove(this.f25065c.size() - 1);
        return this;
    }

    @Override // com.google.android.gms.internal.C7602ps
    /* renamed from: f */
    public C7602ps mo14095f() {
        m14254a(C7473nz.f24952a);
        return this;
    }

    @Override // com.google.android.gms.internal.C7602ps, java.io.Flushable
    public void flush() {
    }
}
