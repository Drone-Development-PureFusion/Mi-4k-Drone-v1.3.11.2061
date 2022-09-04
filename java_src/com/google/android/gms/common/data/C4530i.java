package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.C4588d;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.common.data.i */
/* loaded from: classes2.dex */
public class C4530i<T> implements Iterator<T> {

    /* renamed from: a */
    protected final AbstractC4522b<T> f16906a;

    /* renamed from: b */
    protected int f16907b = -1;

    public C4530i(AbstractC4522b<T> abstractC4522b) {
        this.f16906a = (AbstractC4522b) C4588d.m23627a(abstractC4522b);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f16907b < this.f16906a.mo23826c() + (-1);
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(new StringBuilder(46).append("Cannot advance the iterator beyond ").append(this.f16907b).toString());
        }
        AbstractC4522b<T> abstractC4522b = this.f16906a;
        int i = this.f16907b + 1;
        this.f16907b = i;
        return abstractC4522b.mo9715a(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
