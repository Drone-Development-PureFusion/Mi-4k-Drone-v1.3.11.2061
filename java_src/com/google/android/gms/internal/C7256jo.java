package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
/* renamed from: com.google.android.gms.internal.jo */
/* loaded from: classes2.dex */
public class C7256jo implements AbstractC7257jp {

    /* renamed from: a */
    private boolean f24345a = false;

    /* renamed from: c */
    private void m15082c() {
        C7392mk.m14606a(this.f24345a, "Transaction expected to already be in progress.");
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public C7282jy mo15075a(C7296kg c7296kg) {
        return new C7282jy(C7337lc.m14768a(C7335la.m14778j(), c7296kg.m14896c()), false, false);
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public <T> T mo15071a(Callable<T> callable) {
        boolean z;
        C7392mk.m14606a(!this.f24345a, "runInTransaction called when an existing transaction is already in progress.");
        try {
            return callable.call();
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15081a() {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15080a(long j) {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15079a(C7160ij c7160ij, C7142ia c7142ia) {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15078a(C7160ij c7160ij, C7142ia c7142ia, long j) {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15077a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15076a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh, long j) {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15074a(C7296kg c7296kg, AbstractC7344lh abstractC7344lh) {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15073a(C7296kg c7296kg, Set<C7319kv> set) {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: a */
    public void mo15072a(C7296kg c7296kg, Set<C7319kv> set, Set<C7319kv> set2) {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: b */
    public List<C7234iy> mo15070b() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: b */
    public void mo15069b(C7160ij c7160ij, C7142ia c7142ia) {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: b */
    public void mo15068b(C7296kg c7296kg) {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: c */
    public void mo15067c(C7296kg c7296kg) {
        m15082c();
    }

    @Override // com.google.android.gms.internal.AbstractC7257jp
    /* renamed from: d */
    public void mo15066d(C7296kg c7296kg) {
        m15082c();
    }
}
