package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7068gz;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.hb */
/* loaded from: classes2.dex */
public class C7074hb<T> implements Iterable<T> {

    /* renamed from: a */
    private final AbstractC7068gz<T, Void> f23856a;

    /* renamed from: com.google.android.gms.internal.hb$a */
    /* loaded from: classes2.dex */
    private static class C7075a<T> implements Iterator<T> {

        /* renamed from: a */
        final Iterator<Map.Entry<T, Void>> f23857a;

        public C7075a(Iterator<Map.Entry<T, Void>> it2) {
            this.f23857a = it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23857a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f23857a.next().getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f23857a.remove();
        }
    }

    private C7074hb(AbstractC7068gz<T, Void> abstractC7068gz) {
        this.f23856a = abstractC7068gz;
    }

    public C7074hb(List<T> list, Comparator<T> comparator) {
        this.f23856a = AbstractC7068gz.C7069a.m15660a(list, Collections.emptyMap(), AbstractC7068gz.C7069a.m15662a(), comparator);
    }

    /* renamed from: a */
    public C7074hb<T> m15655a(T t) {
        AbstractC7068gz<T, Void> mo15615c = this.f23856a.mo15615c(t);
        return mo15615c == this.f23856a ? this : new C7074hb<>(mo15615c);
    }

    /* renamed from: a */
    public T m15656a() {
        return this.f23856a.mo15624a();
    }

    /* renamed from: b */
    public C7074hb<T> m15653b(T t) {
        return new C7074hb<>(this.f23856a.mo15621a(t, null));
    }

    /* renamed from: b */
    public T m15654b() {
        return this.f23856a.mo15618b();
    }

    /* renamed from: c */
    public T m15651c(T t) {
        return this.f23856a.mo15613d(t);
    }

    /* renamed from: c */
    public Iterator<T> m15652c() {
        return new C7075a(this.f23856a.mo15612e());
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C7075a(this.f23856a.iterator());
    }
}
