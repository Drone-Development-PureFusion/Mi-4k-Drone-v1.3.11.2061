package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.internal.ea */
/* loaded from: classes2.dex */
public abstract class AbstractC6880ea<T> {

    /* renamed from: a */
    protected Map<String, AbstractC6880ea<?>> f23110a;

    /* renamed from: com.google.android.gms.internal.ea$a */
    /* loaded from: classes2.dex */
    private static class C6882a implements Iterator<AbstractC6880ea<?>> {
        private C6882a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public AbstractC6880ea<?> next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public Iterator<AbstractC6880ea<?>> mo16037a() {
        return new C6882a();
    }

    /* renamed from: a */
    public void m16061a(String str, AbstractC6880ea<?> abstractC6880ea) {
        if (this.f23110a == null) {
            this.f23110a = new HashMap();
        }
        this.f23110a.put(str, abstractC6880ea);
    }

    /* renamed from: a */
    public boolean m16062a(String str) {
        return this.f23110a != null && this.f23110a.containsKey(str);
    }

    /* renamed from: b */
    public AbstractC6880ea<?> mo16044b(String str) {
        return this.f23110a != null ? this.f23110a.get(str) : C6886ee.f23122e;
    }

    /* renamed from: b */
    public abstract T mo16034b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public Iterator<AbstractC6880ea<?>> m16060c() {
        if (this.f23110a == null) {
            return new C6882a();
        }
        final Iterator<String> it2 = this.f23110a.keySet().iterator();
        return new Iterator<AbstractC6880ea<?>>() { // from class: com.google.android.gms.internal.ea.1
            @Override // java.util.Iterator
            /* renamed from: a */
            public AbstractC6880ea<?> next() {
                return new C6893ej((String) it2.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it2.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                it2.remove();
            }
        };
    }

    /* renamed from: c */
    public boolean mo16033c(String str) {
        return false;
    }

    /* renamed from: d */
    public aqe mo16031d(String str) {
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 56).append("Attempting to access Native Method ").append(str).append(" on unsupported type.").toString());
    }

    public abstract String toString();
}
