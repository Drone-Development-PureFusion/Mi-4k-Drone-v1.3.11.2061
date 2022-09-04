package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7078he;
/* renamed from: com.google.android.gms.internal.hf */
/* loaded from: classes2.dex */
public class C7081hf<K, V> extends AbstractC7082hg<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C7081hf(K k, V v) {
        super(k, v, C7077hd.m15650a(), C7077hd.m15650a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7081hf(K k, V v, AbstractC7078he<K, V> abstractC7078he, AbstractC7078he<K, V> abstractC7078he2) {
        super(k, v, abstractC7078he, abstractC7078he2);
    }

    @Override // com.google.android.gms.internal.AbstractC7082hg
    /* renamed from: a */
    protected AbstractC7078he.EnumC7079a mo15648a() {
        return AbstractC7078he.EnumC7079a.RED;
    }

    @Override // com.google.android.gms.internal.AbstractC7082hg
    /* renamed from: a */
    protected AbstractC7082hg<K, V> mo15644a(K k, V v, AbstractC7078he<K, V> abstractC7078he, AbstractC7078he<K, V> abstractC7078he2) {
        if (k == null) {
            k = d();
        }
        if (v == null) {
            v = e();
        }
        if (abstractC7078he == null) {
            abstractC7078he = f();
        }
        if (abstractC7078he2 == null) {
            abstractC7078he2 = g();
        }
        return new C7081hf(k, v, abstractC7078he, abstractC7078he2);
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: b */
    public boolean mo15649b() {
        return true;
    }
}
