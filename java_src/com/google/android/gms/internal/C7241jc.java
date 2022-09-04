package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.internal.jc */
/* loaded from: classes2.dex */
public class C7241jc {

    /* renamed from: a */
    private final C7160ij f24310a;

    /* renamed from: b */
    private final C7238jb f24311b;

    public C7241jc(C7160ij c7160ij, C7238jb c7238jb) {
        this.f24310a = c7160ij;
        this.f24311b = c7238jb;
    }

    /* renamed from: a */
    public C7241jc m15114a(C7319kv c7319kv) {
        return new C7241jc(this.f24310a.m15368a(c7319kv), this.f24311b);
    }

    /* renamed from: a */
    public C7343lg m15111a(AbstractC7344lh abstractC7344lh, C7343lg c7343lg, boolean z, AbstractC7336lb abstractC7336lb) {
        return this.f24311b.m15126a(this.f24310a, abstractC7344lh, c7343lg, z, abstractC7336lb);
    }

    /* renamed from: a */
    public AbstractC7344lh m15116a(C7160ij c7160ij) {
        return this.f24311b.m15119b(this.f24310a.m15370a(c7160ij));
    }

    /* renamed from: a */
    public AbstractC7344lh m15115a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh, AbstractC7344lh abstractC7344lh2) {
        return this.f24311b.m15129a(this.f24310a, c7160ij, abstractC7344lh, abstractC7344lh2);
    }

    /* renamed from: a */
    public AbstractC7344lh m15113a(C7319kv c7319kv, C7282jy c7282jy) {
        return this.f24311b.m15128a(this.f24310a, c7319kv, c7282jy);
    }

    /* renamed from: a */
    public AbstractC7344lh m15112a(AbstractC7344lh abstractC7344lh) {
        return m15110a(abstractC7344lh, Collections.emptyList());
    }

    /* renamed from: a */
    public AbstractC7344lh m15110a(AbstractC7344lh abstractC7344lh, List<Long> list) {
        return m15109a(abstractC7344lh, list, false);
    }

    /* renamed from: a */
    public AbstractC7344lh m15109a(AbstractC7344lh abstractC7344lh, List<Long> list, boolean z) {
        return this.f24311b.m15124a(this.f24310a, abstractC7344lh, list, z);
    }

    /* renamed from: b */
    public AbstractC7344lh m15108b(AbstractC7344lh abstractC7344lh) {
        return this.f24311b.m15127a(this.f24310a, abstractC7344lh);
    }
}
