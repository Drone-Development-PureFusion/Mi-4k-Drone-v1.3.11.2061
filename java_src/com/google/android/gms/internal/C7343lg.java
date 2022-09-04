package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.lg */
/* loaded from: classes2.dex */
public class C7343lg {

    /* renamed from: c */
    private static final C7343lg f24532c = new C7343lg(C7319kv.m14830a(), C7335la.m14778j());

    /* renamed from: d */
    private static final C7343lg f24533d = new C7343lg(C7319kv.m14827b(), AbstractC7344lh.f24536d);

    /* renamed from: a */
    private final C7319kv f24534a;

    /* renamed from: b */
    private final AbstractC7344lh f24535b;

    public C7343lg(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        this.f24534a = c7319kv;
        this.f24535b = abstractC7344lh;
    }

    /* renamed from: a */
    public static C7343lg m14754a() {
        return f24532c;
    }

    /* renamed from: b */
    public static C7343lg m14753b() {
        return f24533d;
    }

    /* renamed from: c */
    public C7319kv m14752c() {
        return this.f24534a;
    }

    /* renamed from: d */
    public AbstractC7344lh m14751d() {
        return this.f24535b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7343lg c7343lg = (C7343lg) obj;
        return this.f24534a.equals(c7343lg.f24534a) && this.f24535b.equals(c7343lg.f24535b);
    }

    public int hashCode() {
        return (this.f24534a.hashCode() * 31) + this.f24535b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f24534a);
        String valueOf2 = String.valueOf(this.f24535b);
        return new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length()).append("NamedNode{name=").append(valueOf).append(", node=").append(valueOf2).append("}").toString();
    }
}
