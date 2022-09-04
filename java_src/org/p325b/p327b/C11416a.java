package org.p325b.p327b;

import java.lang.reflect.Array;
import java.util.Iterator;
/* renamed from: org.b.b.a */
/* loaded from: classes2.dex */
public class C11416a implements Iterator<Object> {

    /* renamed from: a */
    private final Object f36529a;

    /* renamed from: b */
    private int f36530b = 0;

    public C11416a(Object obj) {
        if (!obj.getClass().isArray()) {
            throw new IllegalArgumentException("not an array");
        }
        this.f36529a = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36530b < Array.getLength(this.f36529a);
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f36529a;
        int i = this.f36530b;
        this.f36530b = i + 1;
        return Array.get(obj, i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
