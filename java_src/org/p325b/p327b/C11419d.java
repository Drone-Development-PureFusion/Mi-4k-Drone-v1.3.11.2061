package org.p325b.p327b;

import java.util.Iterator;
import org.p325b.AbstractC11435m;
/* renamed from: org.b.b.d */
/* loaded from: classes2.dex */
public class C11419d<T> implements Iterator<AbstractC11435m> {

    /* renamed from: a */
    private Iterator<T> f36535a;

    public C11419d(Iterator<T> it2) {
        this.f36535a = it2;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public AbstractC11435m next() {
        return new C11418c(this.f36535a.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36535a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f36535a.remove();
    }
}
