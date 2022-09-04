package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7078he;
import java.util.Comparator;
/* renamed from: com.google.android.gms.internal.hd */
/* loaded from: classes2.dex */
public class C7077hd<K, V> implements AbstractC7078he<K, V> {

    /* renamed from: a */
    private static final C7077hd f23858a = new C7077hd();

    private C7077hd() {
    }

    /* renamed from: a */
    public static <K, V> C7077hd<K, V> m15650a() {
        return f23858a;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: a */
    public AbstractC7078he<K, V> mo15645a(K k, V v, AbstractC7078he.EnumC7079a enumC7079a, AbstractC7078he<K, V> abstractC7078he, AbstractC7078he<K, V> abstractC7078he2) {
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: a */
    public AbstractC7078he<K, V> mo15643a(K k, V v, Comparator<K> comparator) {
        return new C7081hf(k, v);
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: a */
    public AbstractC7078he<K, V> mo15642a(K k, Comparator<K> comparator) {
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: a */
    public void mo15647a(AbstractC7078he.AbstractC7080b<K, V> abstractC7080b) {
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: b */
    public boolean mo15649b() {
        return false;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: c */
    public boolean mo15639c() {
        return true;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: d */
    public K mo15638d() {
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: e */
    public V mo15637e() {
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: f */
    public AbstractC7078he<K, V> mo15636f() {
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: g */
    public AbstractC7078he<K, V> mo15635g() {
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: h */
    public AbstractC7078he<K, V> mo15634h() {
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: i */
    public AbstractC7078he<K, V> mo15633i() {
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: j */
    public int mo15632j() {
        return 0;
    }
}
