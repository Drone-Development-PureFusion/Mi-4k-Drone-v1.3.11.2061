package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.ed */
/* loaded from: classes2.dex */
public class C6885ed extends AbstractC6880ea<aqe> {

    /* renamed from: c */
    private static final Map<String, aqe> f23117c;

    /* renamed from: b */
    private aqe f23118b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C7645r.f25384a);
        f23117c = Collections.unmodifiableMap(hashMap);
    }

    public C6885ed(aqe aqeVar) {
        this.f23118b = aqeVar;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: a */
    public Iterator<AbstractC6880ea<?>> mo16037a() {
        return c();
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: c */
    public boolean mo16033c(String str) {
        return f23117c.containsKey(str);
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public aqe mo16034b() {
        return this.f23118b;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public aqe mo16031d(String str) {
        if (mo16033c(str)) {
            return f23117c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 60).append("Native Method ").append(str).append(" is not defined for type InstructionReference.").toString());
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    public String toString() {
        return this.f23118b.toString();
    }
}
