package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.internal.ef */
/* loaded from: classes2.dex */
public final class C6887ef extends AbstractC6880ea<List<AbstractC6880ea<?>>> {

    /* renamed from: c */
    private static final Map<String, aqe> f23126c;

    /* renamed from: b */
    private final ArrayList<AbstractC6880ea<?>> f23127b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("concat", new aqh());
        hashMap.put("every", new aqi());
        hashMap.put("filter", new aqj());
        hashMap.put("forEach", new aqk());
        hashMap.put("indexOf", new aql());
        hashMap.put("hasOwnProperty", C7645r.f25384a);
        hashMap.put("join", new aqm());
        hashMap.put("lastIndexOf", new aqo());
        hashMap.put("map", new aqp());
        hashMap.put("pop", new aqq());
        hashMap.put("push", new aqr());
        hashMap.put("reduce", new aqs());
        hashMap.put("reduceRight", new aqt());
        hashMap.put("reverse", new aqu());
        hashMap.put("shift", new aqv());
        hashMap.put("slice", new aqw());
        hashMap.put("some", new aqx());
        hashMap.put("sort", new aqy());
        hashMap.put("splice", new aqz());
        hashMap.put("toString", new C6762au());
        hashMap.put("unshift", new ara());
        f23126c = Collections.unmodifiableMap(hashMap);
    }

    public C6887ef(List<AbstractC6880ea<?>> list) {
        C4588d.m23627a(list);
        this.f23127b = new ArrayList<>(list);
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: a */
    public Iterator<AbstractC6880ea<?>> mo16037a() {
        final Iterator<AbstractC6880ea<?>> it2 = new Iterator<AbstractC6880ea<?>>() { // from class: com.google.android.gms.internal.ef.1

            /* renamed from: b */
            private int f23129b = 0;

            @Override // java.util.Iterator
            /* renamed from: a */
            public AbstractC6880ea<?> next() {
                if (this.f23129b >= C6887ef.this.f23127b.size()) {
                    throw new NoSuchElementException();
                }
                for (int i = this.f23129b; i < C6887ef.this.f23127b.size(); i++) {
                    if (C6887ef.this.f23127b.get(i) != null) {
                        this.f23129b = i;
                        int i2 = this.f23129b;
                        this.f23129b = i2 + 1;
                        return new C6884ec(Double.valueOf(i2));
                    }
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                for (int i = this.f23129b; i < C6887ef.this.f23127b.size(); i++) {
                    if (C6887ef.this.f23127b.get(i) != null) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        final Iterator<AbstractC6880ea<?>> m16060c = super.m16060c();
        return new Iterator<AbstractC6880ea<?>>() { // from class: com.google.android.gms.internal.ef.2
            @Override // java.util.Iterator
            /* renamed from: a */
            public AbstractC6880ea<?> next() {
                return it2.hasNext() ? (AbstractC6880ea) it2.next() : (AbstractC6880ea) m16060c.next();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it2.hasNext() || m16060c.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* renamed from: a */
    public void m16052a(int i) {
        C4588d.m23618b(i >= 0, "Invalid array length");
        if (this.f23127b.size() == i) {
            return;
        }
        if (this.f23127b.size() >= i) {
            this.f23127b.subList(i, this.f23127b.size()).clear();
            return;
        }
        this.f23127b.ensureCapacity(i);
        for (int size = this.f23127b.size(); size < i; size++) {
            this.f23127b.add(null);
        }
    }

    /* renamed from: a */
    public void m16051a(int i, AbstractC6880ea<?> abstractC6880ea) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i >= this.f23127b.size()) {
            m16052a(i + 1);
        }
        this.f23127b.set(i, abstractC6880ea);
    }

    /* renamed from: b */
    public AbstractC6880ea<?> m16049b(int i) {
        if (i < 0 || i >= this.f23127b.size()) {
            return C6886ee.f23122e;
        }
        AbstractC6880ea<?> abstractC6880ea = this.f23127b.get(i);
        return abstractC6880ea == null ? C6886ee.f23122e : abstractC6880ea;
    }

    /* renamed from: c */
    public boolean m16048c(int i) {
        return i >= 0 && i < this.f23127b.size() && this.f23127b.get(i) != null;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: c */
    public boolean mo16033c(String str) {
        return f23126c.containsKey(str);
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public aqe mo16031d(String str) {
        if (mo16033c(str)) {
            return f23126c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 51).append("Native Method ").append(str).append(" is not defined for type ListWrapper.").toString());
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public List<AbstractC6880ea<?>> mo16034b() {
        return this.f23127b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6887ef)) {
            return false;
        }
        List<AbstractC6880ea<?>> mo16034b = ((C6887ef) obj).mo16034b();
        if (this.f23127b.size() != mo16034b.size()) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (i < this.f23127b.size()) {
            boolean equals = this.f23127b.get(i) == null ? mo16034b.get(i) == null : this.f23127b.get(i).equals(mo16034b.get(i));
            if (!equals) {
                return equals;
            }
            i++;
            z = equals;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    public String toString() {
        return this.f23127b.toString();
    }
}
