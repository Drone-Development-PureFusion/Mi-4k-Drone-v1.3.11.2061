package com.google.android.gms.internal;

import java.util.Map;
import p005b.p006a.p007a.p008a.p020j.C0324k;
/* renamed from: com.google.android.gms.internal.jw */
/* loaded from: classes2.dex */
public class C7277jw<T> {

    /* renamed from: a */
    static final /* synthetic */ boolean f24379a;

    /* renamed from: b */
    private C7319kv f24380b;

    /* renamed from: c */
    private C7277jw<T> f24381c;

    /* renamed from: d */
    private C7281jx<T> f24382d;

    /* renamed from: com.google.android.gms.internal.jw$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7279a<T> {
        /* renamed from: a */
        boolean mo14962a(C7277jw<T> c7277jw);
    }

    /* renamed from: com.google.android.gms.internal.jw$b */
    /* loaded from: classes2.dex */
    public interface AbstractC7280b<T> {
        /* renamed from: a */
        void mo14961a(C7277jw<T> c7277jw);
    }

    static {
        f24379a = !C7277jw.class.desiredAssertionStatus();
    }

    public C7277jw() {
        this(null, null, new C7281jx());
    }

    public C7277jw(C7319kv c7319kv, C7277jw<T> c7277jw, C7281jx<T> c7281jx) {
        this.f24380b = c7319kv;
        this.f24381c = c7277jw;
        this.f24382d = c7281jx;
    }

    /* renamed from: a */
    private void m14970a(C7319kv c7319kv, C7277jw<T> c7277jw) {
        boolean m14964d = c7277jw.m14964d();
        boolean containsKey = this.f24382d.f24386a.containsKey(c7319kv);
        if (m14964d && containsKey) {
            this.f24382d.f24386a.remove(c7319kv);
            m14963e();
        } else if (m14964d || containsKey) {
        } else {
            this.f24382d.f24386a.put(c7319kv, c7277jw.f24382d);
            m14963e();
        }
    }

    /* renamed from: e */
    private void m14963e() {
        if (this.f24381c != null) {
            this.f24381c.m14970a(this.f24380b, this);
        }
    }

    /* renamed from: a */
    public C7277jw<T> m14975a(C7160ij c7160ij) {
        C7319kv m15363d = c7160ij.m15363d();
        while (m15363d != null) {
            C7277jw<T> c7277jw = new C7277jw<>(m15363d, this, this.f24382d.f24386a.containsKey(m15363d) ? this.f24382d.f24386a.get(m15363d) : new C7281jx<>());
            c7160ij = c7160ij.m15361e();
            m15363d = c7160ij.m15363d();
            this = c7277jw;
        }
        return this;
    }

    /* renamed from: a */
    public T m14976a() {
        return this.f24382d.f24387b;
    }

    /* renamed from: a */
    String m14968a(String str) {
        String m14823e = this.f24380b == null ? "<anon>" : this.f24380b.m14823e();
        String valueOf = String.valueOf(this.f24382d.m14960a(String.valueOf(str).concat(C0324k.f324b)));
        return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(m14823e).length() + String.valueOf(valueOf).length()).append(str).append(m14823e).append("\n").append(valueOf).toString();
    }

    /* renamed from: a */
    public void m14972a(AbstractC7280b<T> abstractC7280b) {
        m14971a(abstractC7280b, false, false);
    }

    /* renamed from: a */
    public void m14971a(final AbstractC7280b<T> abstractC7280b, boolean z, final boolean z2) {
        if (z && !z2) {
            abstractC7280b.mo14961a(this);
        }
        m14966b(new AbstractC7280b<T>() { // from class: com.google.android.gms.internal.jw.1
            @Override // com.google.android.gms.internal.C7277jw.AbstractC7280b
            /* renamed from: a */
            public void mo14961a(C7277jw<T> c7277jw) {
                c7277jw.m14971a(abstractC7280b, true, z2);
            }
        });
        if (!z || !z2) {
            return;
        }
        abstractC7280b.mo14961a(this);
    }

    /* renamed from: a */
    public void m14969a(T t) {
        this.f24382d.f24387b = t;
        m14963e();
    }

    /* renamed from: a */
    public boolean m14974a(AbstractC7279a<T> abstractC7279a) {
        return m14973a((AbstractC7279a) abstractC7279a, false);
    }

    /* renamed from: a */
    public boolean m14973a(AbstractC7279a<T> abstractC7279a, boolean z) {
        if (!z) {
            this = this.f24381c;
        }
        while (this != null) {
            if (abstractC7279a.mo14962a(this)) {
                return true;
            }
            this = this.f24381c;
        }
        return false;
    }

    /* renamed from: b */
    public C7160ij m14967b() {
        if (this.f24381c == null) {
            return this.f24380b != null ? new C7160ij(this.f24380b) : C7160ij.m15371a();
        } else if (!f24379a && this.f24380b == null) {
            throw new AssertionError();
        } else {
            return this.f24381c.m14967b().m15368a(this.f24380b);
        }
    }

    /* renamed from: b */
    public void m14966b(AbstractC7280b<T> abstractC7280b) {
        Object[] array = this.f24382d.f24386a.entrySet().toArray();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < array.length) {
                Map.Entry entry = (Map.Entry) array[i2];
                abstractC7280b.mo14961a(new C7277jw<>((C7319kv) entry.getKey(), this, (C7281jx) entry.getValue()));
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean m14965c() {
        return !this.f24382d.f24386a.isEmpty();
    }

    /* renamed from: d */
    public boolean m14964d() {
        return this.f24382d.f24387b == null && this.f24382d.f24386a.isEmpty();
    }

    public String toString() {
        return m14968a("");
    }
}
