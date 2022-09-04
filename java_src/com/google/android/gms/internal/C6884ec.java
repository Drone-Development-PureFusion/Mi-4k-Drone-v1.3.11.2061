package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.ec */
/* loaded from: classes2.dex */
public final class C6884ec extends AbstractC6880ea<Double> {

    /* renamed from: c */
    private static final Map<String, aqe> f23115c;

    /* renamed from: b */
    private Double f23116b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C7645r.f25384a);
        hashMap.put("toString", new C6762au());
        f23115c = Collections.unmodifiableMap(hashMap);
    }

    public C6884ec(Double d) {
        C4588d.m23627a(d);
        this.f23116b = d;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: c */
    public boolean mo16033c(String str) {
        return f23115c.containsKey(str);
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public aqe mo16031d(String str) {
        if (mo16033c(str)) {
            return f23115c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 53).append("Native Method ").append(str).append(" is not defined for type DoubleWrapper.").toString());
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public Double mo16034b() {
        return this.f23116b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6884ec)) {
            return false;
        }
        return this.f23116b.equals((Double) ((C6884ec) obj).mo16034b());
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    public String toString() {
        return this.f23116b.toString();
    }
}
