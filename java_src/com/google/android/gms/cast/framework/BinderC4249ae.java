package com.google.android.gms.cast.framework;

import android.support.annotation.NonNull;
import com.google.android.gms.cast.framework.AbstractC4241ab;
import com.google.android.gms.cast.framework.AbstractC4279j;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.cast.framework.ae */
/* loaded from: classes2.dex */
public class BinderC4249ae<T extends AbstractC4279j> extends AbstractC4241ab.AbstractBinderC4242a {

    /* renamed from: a */
    private final AbstractC4283l<T> f16139a;

    /* renamed from: b */
    private final Class<T> f16140b;

    public BinderC4249ae(@NonNull AbstractC4283l<T> abstractC4283l, @NonNull Class<T> cls) {
        this.f16139a = abstractC4283l;
        this.f16140b = cls;
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4241ab
    /* renamed from: a */
    public int mo24883a() {
        return 9683208;
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4241ab
    /* renamed from: a */
    public void mo24882a(@NonNull AbstractC4170e abstractC4170e) {
        AbstractC4279j abstractC4279j = (AbstractC4279j) BinderC4173f.m25294a(abstractC4170e);
        if (this.f16140b.isInstance(abstractC4279j)) {
            this.f16139a.mo24447a(this.f16140b.cast(abstractC4279j));
        }
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4241ab
    /* renamed from: a */
    public void mo24881a(@NonNull AbstractC4170e abstractC4170e, int i) {
        AbstractC4279j abstractC4279j = (AbstractC4279j) BinderC4173f.m25294a(abstractC4170e);
        if (this.f16140b.isInstance(abstractC4279j)) {
            this.f16139a.mo24446a((AbstractC4283l<T>) this.f16140b.cast(abstractC4279j), i);
        }
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4241ab
    /* renamed from: a */
    public void mo24880a(@NonNull AbstractC4170e abstractC4170e, String str) {
        AbstractC4279j abstractC4279j = (AbstractC4279j) BinderC4173f.m25294a(abstractC4170e);
        if (this.f16140b.isInstance(abstractC4279j)) {
            this.f16139a.mo24445a((AbstractC4283l<T>) this.f16140b.cast(abstractC4279j), str);
        }
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4241ab
    /* renamed from: a */
    public void mo24879a(@NonNull AbstractC4170e abstractC4170e, boolean z) {
        AbstractC4279j abstractC4279j = (AbstractC4279j) BinderC4173f.m25294a(abstractC4170e);
        if (this.f16140b.isInstance(abstractC4279j)) {
            this.f16139a.mo24444a((AbstractC4283l<T>) this.f16140b.cast(abstractC4279j), z);
        }
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4241ab
    /* renamed from: b */
    public AbstractC4170e mo24878b() {
        return BinderC4173f.m25293a(this.f16139a);
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4241ab
    /* renamed from: b */
    public void mo24877b(@NonNull AbstractC4170e abstractC4170e) {
        AbstractC4279j abstractC4279j = (AbstractC4279j) BinderC4173f.m25294a(abstractC4170e);
        if (this.f16140b.isInstance(abstractC4279j)) {
            this.f16139a.mo24440b(this.f16140b.cast(abstractC4279j));
        }
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4241ab
    /* renamed from: b */
    public void mo24876b(@NonNull AbstractC4170e abstractC4170e, int i) {
        AbstractC4279j abstractC4279j = (AbstractC4279j) BinderC4173f.m25294a(abstractC4170e);
        if (this.f16140b.isInstance(abstractC4279j)) {
            this.f16139a.mo24439b((AbstractC4283l<T>) this.f16140b.cast(abstractC4279j), i);
        }
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4241ab
    /* renamed from: b */
    public void mo24875b(@NonNull AbstractC4170e abstractC4170e, String str) {
        AbstractC4279j abstractC4279j = (AbstractC4279j) BinderC4173f.m25294a(abstractC4170e);
        if (this.f16140b.isInstance(abstractC4279j)) {
            this.f16139a.mo24438b((AbstractC4283l<T>) this.f16140b.cast(abstractC4279j), str);
        }
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4241ab
    /* renamed from: c */
    public void mo24874c(@NonNull AbstractC4170e abstractC4170e, int i) {
        AbstractC4279j abstractC4279j = (AbstractC4279j) BinderC4173f.m25294a(abstractC4170e);
        if (this.f16140b.isInstance(abstractC4279j)) {
            this.f16139a.mo24436c(this.f16140b.cast(abstractC4279j), i);
        }
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4241ab
    /* renamed from: d */
    public void mo24873d(@NonNull AbstractC4170e abstractC4170e, int i) {
        AbstractC4279j abstractC4279j = (AbstractC4279j) BinderC4173f.m25294a(abstractC4170e);
        if (this.f16140b.isInstance(abstractC4279j)) {
            this.f16139a.mo24434d(this.f16140b.cast(abstractC4279j), i);
        }
    }
}
