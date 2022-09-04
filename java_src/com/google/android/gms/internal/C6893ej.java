package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.p251a.C9654a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p005b.p006a.p007a.p029b.p045i.p047b.C0572f;
/* renamed from: com.google.android.gms.internal.ej */
/* loaded from: classes2.dex */
public final class C6893ej extends AbstractC6880ea<String> {

    /* renamed from: c */
    private static final Map<String, aqe> f23260c;

    /* renamed from: b */
    private final String f23261b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("charAt", new C6330ah());
        hashMap.put("concat", new C6372ai());
        hashMap.put("hasOwnProperty", C7645r.f25384a);
        hashMap.put("indexOf", new C6399aj());
        hashMap.put("lastIndexOf", new C6436ak());
        hashMap.put("match", new C6480al());
        hashMap.put(C0572f.f967c, new C6549am());
        hashMap.put(C9654a.C9655a.f30199o, new C6599an());
        hashMap.put("slice", new C6676ao());
        hashMap.put("split", new C6705ap());
        hashMap.put("substring", new C6752aq());
        hashMap.put("toLocaleLowerCase", new C6759ar());
        hashMap.put("toLocaleUpperCase", new C6760as());
        hashMap.put("toLowerCase", new C6761at());
        hashMap.put("toUpperCase", new C6763av());
        hashMap.put("toString", new C6762au());
        hashMap.put("trim", new C6764aw());
        f23260c = Collections.unmodifiableMap(hashMap);
    }

    public C6893ej(String str) {
        C4588d.m23627a(str);
        this.f23261b = str;
    }

    /* renamed from: a */
    public AbstractC6880ea<?> m16036a(int i) {
        return (i < 0 || i >= this.f23261b.length()) ? C6886ee.f23122e : new C6893ej(String.valueOf(this.f23261b.charAt(i)));
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: a */
    public Iterator<AbstractC6880ea<?>> mo16037a() {
        return new Iterator<AbstractC6880ea<?>>() { // from class: com.google.android.gms.internal.ej.1

            /* renamed from: b */
            private int f23263b = 0;

            @Override // java.util.Iterator
            /* renamed from: a */
            public AbstractC6880ea<?> next() {
                if (this.f23263b >= C6893ej.this.f23261b.length()) {
                    throw new NoSuchElementException();
                }
                int i = this.f23263b;
                this.f23263b = i + 1;
                return new C6884ec(Double.valueOf(i));
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f23263b < C6893ej.this.f23261b.length();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: c */
    public boolean mo16033c(String str) {
        return f23260c.containsKey(str);
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public aqe mo16031d(String str) {
        if (mo16033c(str)) {
            return f23260c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 51).append("Native Method ").append(str).append(" is not defined for type ListWrapper.").toString());
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public String mo16034b() {
        return this.f23261b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6893ej)) {
            return false;
        }
        return this.f23261b.equals((String) ((C6893ej) obj).mo16034b());
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    public String toString() {
        return this.f23261b.toString();
    }
}
