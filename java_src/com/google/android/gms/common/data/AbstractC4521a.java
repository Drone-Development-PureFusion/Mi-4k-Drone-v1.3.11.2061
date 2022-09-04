package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;
/* renamed from: com.google.android.gms.common.data.a */
/* loaded from: classes.dex */
public abstract class AbstractC4521a<T> implements AbstractC4522b<T> {

    /* renamed from: a */
    protected final DataHolder f16904a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4521a(DataHolder dataHolder) {
        this.f16904a = dataHolder;
        if (this.f16904a != null) {
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: a */
    public abstract T mo9715a(int i);

    @Override // com.google.android.gms.common.data.AbstractC4522b, com.google.android.gms.common.api.AbstractC4500k
    /* renamed from: b */
    public void mo7804b() {
        if (this.f16904a != null) {
            this.f16904a.close();
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: c */
    public int mo23826c() {
        if (this.f16904a == null) {
            return 0;
        }
        return this.f16904a.m23879g();
    }

    @Override // com.google.android.gms.common.data.AbstractC4522b
    @Deprecated
    /* renamed from: d */
    public final void mo23869d() {
        mo7804b();
    }

    @Override // com.google.android.gms.common.data.AbstractC4522b
    @Deprecated
    /* renamed from: e */
    public boolean mo23868e() {
        return this.f16904a == null || this.f16904a.m23877h();
    }

    @Override // com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: f */
    public Bundle mo23867f() {
        return this.f16904a.m23881f();
    }

    @Override // com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: g */
    public Iterator<T> mo23866g() {
        return new C4535n(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC4522b, java.lang.Iterable
    public Iterator<T> iterator() {
        return new C4530i(this);
    }
}
