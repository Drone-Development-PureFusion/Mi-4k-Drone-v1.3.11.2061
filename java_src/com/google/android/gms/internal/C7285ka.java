package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7287kc;
/* renamed from: com.google.android.gms.internal.ka */
/* loaded from: classes2.dex */
public class C7285ka {

    /* renamed from: a */
    private final AbstractC7287kc.EnumC7288a f24394a;

    /* renamed from: b */
    private final C7337lc f24395b;

    /* renamed from: c */
    private final C7337lc f24396c;

    /* renamed from: d */
    private final C7319kv f24397d;

    /* renamed from: e */
    private final C7319kv f24398e;

    private C7285ka(AbstractC7287kc.EnumC7288a enumC7288a, C7337lc c7337lc, C7319kv c7319kv, C7319kv c7319kv2, C7337lc c7337lc2) {
        this.f24394a = enumC7288a;
        this.f24395b = c7337lc;
        this.f24397d = c7319kv;
        this.f24398e = c7319kv2;
        this.f24396c = c7337lc2;
    }

    /* renamed from: a */
    public static C7285ka m14950a(C7319kv c7319kv, C7337lc c7337lc) {
        return new C7285ka(AbstractC7287kc.EnumC7288a.CHILD_ADDED, c7337lc, c7319kv, null, null);
    }

    /* renamed from: a */
    public static C7285ka m14949a(C7319kv c7319kv, C7337lc c7337lc, C7337lc c7337lc2) {
        return new C7285ka(AbstractC7287kc.EnumC7288a.CHILD_CHANGED, c7337lc, c7319kv, null, c7337lc2);
    }

    /* renamed from: a */
    public static C7285ka m14948a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        return m14950a(c7319kv, C7337lc.m14769a(abstractC7344lh));
    }

    /* renamed from: a */
    public static C7285ka m14947a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh, AbstractC7344lh abstractC7344lh2) {
        return m14949a(c7319kv, C7337lc.m14769a(abstractC7344lh), C7337lc.m14769a(abstractC7344lh2));
    }

    /* renamed from: a */
    public static C7285ka m14946a(C7337lc c7337lc) {
        return new C7285ka(AbstractC7287kc.EnumC7288a.VALUE, c7337lc, null, null, null);
    }

    /* renamed from: b */
    public static C7285ka m14944b(C7319kv c7319kv, C7337lc c7337lc) {
        return new C7285ka(AbstractC7287kc.EnumC7288a.CHILD_REMOVED, c7337lc, c7319kv, null, null);
    }

    /* renamed from: b */
    public static C7285ka m14943b(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        return m14944b(c7319kv, C7337lc.m14769a(abstractC7344lh));
    }

    /* renamed from: c */
    public static C7285ka m14941c(C7319kv c7319kv, C7337lc c7337lc) {
        return new C7285ka(AbstractC7287kc.EnumC7288a.CHILD_MOVED, c7337lc, c7319kv, null, null);
    }

    /* renamed from: a */
    public C7285ka m14951a(C7319kv c7319kv) {
        return new C7285ka(this.f24394a, this.f24395b, this.f24397d, c7319kv, this.f24396c);
    }

    /* renamed from: a */
    public C7319kv m14952a() {
        return this.f24397d;
    }

    /* renamed from: b */
    public AbstractC7287kc.EnumC7288a m14945b() {
        return this.f24394a;
    }

    /* renamed from: c */
    public C7337lc m14942c() {
        return this.f24395b;
    }

    /* renamed from: d */
    public C7319kv m14940d() {
        return this.f24398e;
    }

    /* renamed from: e */
    public C7337lc m14939e() {
        return this.f24396c;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f24394a);
        String valueOf2 = String.valueOf(this.f24397d);
        return new StringBuilder(String.valueOf(valueOf).length() + 9 + String.valueOf(valueOf2).length()).append("Change: ").append(valueOf).append(" ").append(valueOf2).toString();
    }
}
