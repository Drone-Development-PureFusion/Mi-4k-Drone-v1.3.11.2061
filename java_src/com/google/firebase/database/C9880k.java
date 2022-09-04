package com.google.firebase.database;

import com.google.android.gms.internal.AbstractC7344lh;
import com.google.android.gms.internal.C7160ij;
import com.google.android.gms.internal.C7203ir;
import com.google.android.gms.internal.C7235iz;
import com.google.android.gms.internal.C7319kv;
import com.google.android.gms.internal.C7337lc;
import com.google.android.gms.internal.C7343lg;
import com.google.android.gms.internal.C7347li;
import com.google.android.gms.internal.C7350ll;
import com.google.android.gms.internal.C7394ml;
import com.google.android.gms.internal.C7395mm;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: com.google.firebase.database.k */
/* loaded from: classes2.dex */
public class C9880k {

    /* renamed from: a */
    private final C7203ir f30744a;

    /* renamed from: b */
    private final C7160ij f30745b;

    private C9880k(C7203ir c7203ir, C7160ij c7160ij) {
        this.f30744a = c7203ir;
        this.f30745b = c7160ij;
        C7235iz.m15147a(this.f30745b, m6716f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9880k(AbstractC7344lh abstractC7344lh) {
        this(new C7203ir(abstractC7344lh), new C7160ij(""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC7344lh m6729a() {
        return this.f30744a.m15247a(this.f30745b);
    }

    /* renamed from: a */
    public <T> T m6728a(AbstractC9876h<T> abstractC9876h) {
        return (T) C7395mm.m14589a(m6729a().mo14710a(), abstractC9876h);
    }

    /* renamed from: a */
    public <T> T m6726a(Class<T> cls) {
        return (T) C7395mm.m14588a(m6729a().mo14710a(), (Class<Object>) cls);
    }

    /* renamed from: a */
    public void m6725a(Object obj) {
        C7235iz.m15147a(this.f30745b, obj);
        Object m14590a = C7395mm.m14590a(obj);
        C7394ml.m14600a(m14590a);
        this.f30744a.m15246a(this.f30745b, C7347li.m14735a(m14590a));
    }

    /* renamed from: a */
    public boolean m6724a(String str) {
        return !m6729a().mo14750a(new C7160ij(str)).mo14739b();
    }

    /* renamed from: b */
    public C9880k m6720b(String str) {
        C7394ml.m14599a(str);
        return new C9880k(this.f30744a, this.f30745b.m15370a(new C7160ij(str)));
    }

    /* renamed from: b */
    public void m6721b(Object obj) {
        this.f30744a.m15246a(this.f30745b, m6729a().mo14705b(C7350ll.m14728a(obj)));
    }

    /* renamed from: b */
    public boolean m6723b() {
        AbstractC7344lh m6729a = m6729a();
        return !m6729a.mo14743e() && !m6729a.mo14739b();
    }

    /* renamed from: c */
    public long m6719c() {
        return m6729a().mo14745c();
    }

    /* renamed from: d */
    public Iterable<C9880k> m6718d() {
        AbstractC7344lh m6729a = m6729a();
        if (m6729a.mo14739b() || m6729a.mo14743e()) {
            return new Iterable<C9880k>() { // from class: com.google.firebase.database.k.1
                @Override // java.lang.Iterable
                public Iterator<C9880k> iterator() {
                    return new Iterator<C9880k>() { // from class: com.google.firebase.database.k.1.1
                        @Override // java.util.Iterator
                        /* renamed from: a */
                        public C9880k next() {
                            throw new NoSuchElementException();
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            return false;
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            throw new UnsupportedOperationException("remove called on immutable collection");
                        }
                    };
                }
            };
        }
        final Iterator<C7343lg> it2 = C7337lc.m14769a(m6729a).iterator();
        return new Iterable<C9880k>() { // from class: com.google.firebase.database.k.2
            @Override // java.lang.Iterable
            public Iterator<C9880k> iterator() {
                return new Iterator<C9880k>() { // from class: com.google.firebase.database.k.2.1
                    @Override // java.util.Iterator
                    /* renamed from: a */
                    public C9880k next() {
                        return new C9880k(C9880k.this.f30744a, C9880k.this.f30745b.m15368a(((C7343lg) it2.next()).m14752c()));
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it2.hasNext();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException("remove called on immutable collection");
                    }
                };
            }
        };
    }

    /* renamed from: e */
    public String m6717e() {
        if (this.f30745b.m15357g() != null) {
            return this.f30745b.m15357g().m14823e();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9880k) && this.f30744a.equals(((C9880k) obj).f30744a) && this.f30745b.equals(((C9880k) obj).f30745b);
    }

    /* renamed from: f */
    public Object m6716f() {
        return m6729a().mo14710a();
    }

    /* renamed from: g */
    public Object m6715g() {
        return m6729a().mo14737f().mo14710a();
    }

    public String toString() {
        C7319kv m15363d = this.f30745b.m15363d();
        String m14823e = m15363d != null ? m15363d.m14823e() : "<none>";
        String valueOf = String.valueOf(this.f30744a.m15248a().mo14747a(true));
        return new StringBuilder(String.valueOf(m14823e).length() + 32 + String.valueOf(valueOf).length()).append("MutableData { key = ").append(m14823e).append(", value = ").append(valueOf).append(" }").toString();
    }
}
