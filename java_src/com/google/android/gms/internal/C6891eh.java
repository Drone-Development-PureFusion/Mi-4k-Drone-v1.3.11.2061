package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.eh */
/* loaded from: classes2.dex */
public final class C6891eh extends AbstractC6880ea<Map<String, AbstractC6880ea<?>>> {

    /* renamed from: b */
    private static final Map<String, aqe> f23256b;

    /* renamed from: c */
    private boolean f23257c = false;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C7645r.f25384a);
        f23256b = Collections.unmodifiableMap(hashMap);
    }

    public C6891eh(Map<String, AbstractC6880ea<?>> map) {
        this.f23110a = (Map) C4588d.m23627a(map);
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: a */
    public Iterator<AbstractC6880ea<?>> mo16037a() {
        return c();
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: b */
    public AbstractC6880ea<?> mo16044b(String str) {
        AbstractC6880ea<?> mo16044b = super.mo16044b(str);
        return mo16044b == null ? C6886ee.f23122e : mo16044b;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: c */
    public boolean mo16033c(String str) {
        return f23256b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public aqe mo16031d(String str) {
        if (mo16033c(str)) {
            return f23256b.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 51).append("Native Method ").append(str).append(" is not defined for type ListWrapper.").toString());
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public Map<String, AbstractC6880ea<?>> mo16034b() {
        return this.f23110a;
    }

    /* renamed from: e */
    public void m16042e() {
        this.f23257c = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6891eh)) {
            return false;
        }
        return this.f23110a.entrySet().equals(((C6891eh) obj).mo16034b().entrySet());
    }

    /* renamed from: f */
    public boolean m16041f() {
        return this.f23257c;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    public String toString() {
        return this.f23110a.toString();
    }
}
