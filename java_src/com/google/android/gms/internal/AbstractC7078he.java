package com.google.android.gms.internal;

import java.util.Comparator;
/* renamed from: com.google.android.gms.internal.he */
/* loaded from: classes2.dex */
public interface AbstractC7078he<K, V> {

    /* renamed from: com.google.android.gms.internal.he$a */
    /* loaded from: classes2.dex */
    public enum EnumC7079a {
        RED,
        BLACK
    }

    /* renamed from: com.google.android.gms.internal.he$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7080b<K, V> {
        /* renamed from: a */
        public abstract void mo14811a(K k, V v);
    }

    /* renamed from: a */
    AbstractC7078he<K, V> mo15645a(K k, V v, EnumC7079a enumC7079a, AbstractC7078he<K, V> abstractC7078he, AbstractC7078he<K, V> abstractC7078he2);

    /* renamed from: a */
    AbstractC7078he<K, V> mo15643a(K k, V v, Comparator<K> comparator);

    /* renamed from: a */
    AbstractC7078he<K, V> mo15642a(K k, Comparator<K> comparator);

    /* renamed from: a */
    void mo15647a(AbstractC7080b<K, V> abstractC7080b);

    /* renamed from: b */
    boolean mo15649b();

    /* renamed from: c */
    boolean mo15639c();

    /* renamed from: d */
    K mo15638d();

    /* renamed from: e */
    V mo15637e();

    /* renamed from: f */
    AbstractC7078he<K, V> mo15636f();

    /* renamed from: g */
    AbstractC7078he<K, V> mo15635g();

    /* renamed from: h */
    AbstractC7078he<K, V> mo15634h();

    /* renamed from: i */
    AbstractC7078he<K, V> mo15633i();

    /* renamed from: j */
    int mo15632j();
}
