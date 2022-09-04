package com.google.android.gms.internal;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.pf */
/* loaded from: classes2.dex */
public final class C7544pf extends C7598pp {

    /* renamed from: a */
    private static final Reader f25060a = new Reader() { // from class: com.google.android.gms.internal.pf.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* renamed from: b */
    private static final Object f25061b = new Object();

    /* renamed from: c */
    private final List<Object> f25062c = new ArrayList();

    public C7544pf(AbstractC7471nx abstractC7471nx) {
        super(f25060a);
        this.f25062c.add(abstractC7471nx);
    }

    /* renamed from: a */
    private void m14259a(EnumC7600pq enumC7600pq) {
        if (mo14146f() != enumC7600pq) {
            String valueOf = String.valueOf(enumC7600pq);
            String valueOf2 = String.valueOf(mo14146f());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
        }
    }

    /* renamed from: r */
    private Object m14257r() {
        return this.f25062c.get(this.f25062c.size() - 1);
    }

    /* renamed from: s */
    private Object m14256s() {
        return this.f25062c.remove(this.f25062c.size() - 1);
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: a */
    public void mo14165a() {
        m14259a(EnumC7600pq.BEGIN_ARRAY);
        this.f25062c.add(((C7468nu) m14257r()).iterator());
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: b */
    public void mo14158b() {
        m14259a(EnumC7600pq.END_ARRAY);
        m14256s();
        m14256s();
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: c */
    public void mo14152c() {
        m14259a(EnumC7600pq.BEGIN_OBJECT);
        this.f25062c.add(((C7475oa) m14257r()).m14364a().iterator());
    }

    @Override // com.google.android.gms.internal.C7598pp, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25062c.clear();
        this.f25062c.add(f25061b);
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: d */
    public void mo14149d() {
        m14259a(EnumC7600pq.END_OBJECT);
        m14256s();
        m14256s();
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: e */
    public boolean mo14147e() {
        EnumC7600pq mo14146f = mo14146f();
        return (mo14146f == EnumC7600pq.END_OBJECT || mo14146f == EnumC7600pq.END_ARRAY) ? false : true;
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: f */
    public EnumC7600pq mo14146f() {
        if (this.f25062c.isEmpty()) {
            return EnumC7600pq.END_DOCUMENT;
        }
        Object m14257r = m14257r();
        if (m14257r instanceof Iterator) {
            boolean z = this.f25062c.get(this.f25062c.size() - 2) instanceof C7475oa;
            Iterator it2 = (Iterator) m14257r;
            if (!it2.hasNext()) {
                return z ? EnumC7600pq.END_OBJECT : EnumC7600pq.END_ARRAY;
            } else if (z) {
                return EnumC7600pq.NAME;
            } else {
                this.f25062c.add(it2.next());
                return mo14146f();
            }
        } else if (m14257r instanceof C7475oa) {
            return EnumC7600pq.BEGIN_OBJECT;
        } else {
            if (m14257r instanceof C7468nu) {
                return EnumC7600pq.BEGIN_ARRAY;
            }
            if (!(m14257r instanceof C7478od)) {
                if (m14257r instanceof C7473nz) {
                    return EnumC7600pq.NULL;
                }
                if (m14257r != f25061b) {
                    throw new AssertionError();
                }
                throw new IllegalStateException("JsonReader is closed");
            }
            C7478od c7478od = (C7478od) m14257r;
            if (c7478od.m14341q()) {
                return EnumC7600pq.STRING;
            }
            if (c7478od.m14353a()) {
                return EnumC7600pq.BOOLEAN;
            }
            if (!c7478od.m14342p()) {
                throw new AssertionError();
            }
            return EnumC7600pq.NUMBER;
        }
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: g */
    public String mo14145g() {
        m14259a(EnumC7600pq.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m14257r()).next();
        this.f25062c.add(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: h */
    public String mo14144h() {
        EnumC7600pq mo14146f = mo14146f();
        if (mo14146f == EnumC7600pq.STRING || mo14146f == EnumC7600pq.NUMBER) {
            return ((C7478od) m14256s()).mo14348c();
        }
        String valueOf = String.valueOf(EnumC7600pq.STRING);
        String valueOf2 = String.valueOf(mo14146f);
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: i */
    public boolean mo14143i() {
        m14259a(EnumC7600pq.BOOLEAN);
        return ((C7478od) m14256s()).mo14344g();
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: j */
    public void mo14142j() {
        m14259a(EnumC7600pq.NULL);
        m14256s();
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: k */
    public double mo14141k() {
        EnumC7600pq mo14146f = mo14146f();
        if (mo14146f != EnumC7600pq.NUMBER && mo14146f != EnumC7600pq.STRING) {
            String valueOf = String.valueOf(EnumC7600pq.NUMBER);
            String valueOf2 = String.valueOf(mo14146f);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
        }
        double mo14347d = ((C7478od) m14257r()).mo14347d();
        if (!p() && (Double.isNaN(mo14347d) || Double.isInfinite(mo14347d))) {
            throw new NumberFormatException(new StringBuilder(57).append("JSON forbids NaN and infinities: ").append(mo14347d).toString());
        }
        m14256s();
        return mo14347d;
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: l */
    public long mo14140l() {
        EnumC7600pq mo14146f = mo14146f();
        if (mo14146f == EnumC7600pq.NUMBER || mo14146f == EnumC7600pq.STRING) {
            long mo14346e = ((C7478od) m14257r()).mo14346e();
            m14256s();
            return mo14346e;
        }
        String valueOf = String.valueOf(EnumC7600pq.NUMBER);
        String valueOf2 = String.valueOf(mo14146f);
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: m */
    public int mo14139m() {
        EnumC7600pq mo14146f = mo14146f();
        if (mo14146f == EnumC7600pq.NUMBER || mo14146f == EnumC7600pq.STRING) {
            int mo14345f = ((C7478od) m14257r()).mo14345f();
            m14256s();
            return mo14345f;
        }
        String valueOf = String.valueOf(EnumC7600pq.NUMBER);
        String valueOf2 = String.valueOf(mo14146f);
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length()).append("Expected ").append(valueOf).append(" but was ").append(valueOf2).toString());
    }

    @Override // com.google.android.gms.internal.C7598pp
    /* renamed from: n */
    public void mo14138n() {
        if (mo14146f() == EnumC7600pq.NAME) {
            mo14145g();
        } else {
            m14256s();
        }
    }

    /* renamed from: o */
    public void m14258o() {
        m14259a(EnumC7600pq.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m14257r()).next();
        this.f25062c.add(entry.getValue());
        this.f25062c.add(new C7478od((String) entry.getKey()));
    }

    @Override // com.google.android.gms.internal.C7598pp
    public String toString() {
        return getClass().getSimpleName();
    }
}
