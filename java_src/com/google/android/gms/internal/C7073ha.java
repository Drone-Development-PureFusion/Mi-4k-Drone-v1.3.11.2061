package com.google.android.gms.internal;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Stack;
/* renamed from: com.google.android.gms.internal.ha */
/* loaded from: classes2.dex */
public class C7073ha<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private final Stack<AbstractC7082hg<K, V>> f23854a = new Stack<>();

    /* renamed from: b */
    private final boolean f23855b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7073ha(AbstractC7078he<K, V> abstractC7078he, K k, Comparator<K> comparator, boolean z) {
        this.f23855b = z;
        AbstractC7078he<K, V> abstractC7078he2 = abstractC7078he;
        while (!abstractC7078he2.mo15639c()) {
            int compare = k != null ? z ? comparator.compare(k, abstractC7078he2.mo15638d()) : comparator.compare(abstractC7078he2.mo15638d(), k) : 1;
            if (compare < 0) {
                abstractC7078he2 = z ? abstractC7078he2.mo15636f() : abstractC7078he2.mo15635g();
            } else if (compare == 0) {
                this.f23854a.push((AbstractC7082hg) abstractC7078he2);
                return;
            } else {
                this.f23854a.push((AbstractC7082hg) abstractC7078he2);
                abstractC7078he2 = z ? abstractC7078he2.mo15635g() : abstractC7078he2.mo15636f();
            }
        }
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public Map.Entry<K, V> next() {
        try {
            AbstractC7082hg<K, V> pop = this.f23854a.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.mo15638d(), pop.mo15637e());
            if (this.f23855b) {
                for (AbstractC7078he<K, V> mo15636f = pop.mo15636f(); !mo15636f.mo15639c(); mo15636f = mo15636f.mo15635g()) {
                    this.f23854a.push((AbstractC7082hg) mo15636f);
                }
            } else {
                for (AbstractC7078he<K, V> mo15635g = pop.mo15635g(); !mo15635g.mo15639c(); mo15635g = mo15635g.mo15636f()) {
                    this.f23854a.push((AbstractC7082hg) mo15635g);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException e) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23854a.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
