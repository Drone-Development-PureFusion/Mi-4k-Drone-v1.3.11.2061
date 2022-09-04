package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.eb */
/* loaded from: classes2.dex */
public final class C6883eb extends AbstractC6880ea<Boolean> {

    /* renamed from: c */
    private static final Map<String, aqe> f23113c;

    /* renamed from: b */
    private final Boolean f23114b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("hasOwnProperty", C7645r.f25384a);
        hashMap.put("toString", new C6762au());
        f23113c = Collections.unmodifiableMap(hashMap);
    }

    public C6883eb(Boolean bool) {
        C4588d.m23627a(bool);
        this.f23114b = bool;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: c */
    public boolean mo16033c(String str) {
        return f23113c.containsKey(str);
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public aqe mo16031d(String str) {
        if (mo16033c(str)) {
            return f23113c.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 54).append("Native Method ").append(str).append(" is not defined for type BooleanWrapper.").toString());
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public Boolean mo16034b() {
        return this.f23114b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6883eb)) {
            return false;
        }
        return ((Boolean) ((C6883eb) obj).mo16034b()) == this.f23114b;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    public String toString() {
        return this.f23114b.toString();
    }
}
