package com.google.android.gms.common.util;

import android.support.p001v4.util.ArrayMap;
import android.support.p001v4.util.SimpleArrayMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: com.google.android.gms.common.util.a */
/* loaded from: classes2.dex */
public class C4678a<E> extends AbstractSet<E> {

    /* renamed from: a */
    private final ArrayMap<E, E> f17291a;

    public C4678a() {
        this.f17291a = new ArrayMap<>();
    }

    public C4678a(int i) {
        this.f17291a = new ArrayMap<>(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4678a(Collection<E> collection) {
        this(collection.size());
        addAll(collection);
    }

    /* renamed from: a */
    public boolean m23174a(C4678a<? extends E> c4678a) {
        int size = size();
        this.f17291a.putAll((SimpleArrayMap<? extends E, ? extends E>) c4678a.f17291a);
        return size() > size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (this.f17291a.containsKey(e)) {
            return false;
        }
        this.f17291a.put(e, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        return collection instanceof C4678a ? m23174a((C4678a) collection) : super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f17291a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f17291a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f17291a.keySet().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f17291a.containsKey(obj)) {
            return false;
        }
        this.f17291a.remove(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f17291a.size();
    }
}
