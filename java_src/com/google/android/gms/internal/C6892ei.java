package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.List;
import org.p356d.AbstractC11759f;
/* renamed from: com.google.android.gms.internal.ei */
/* loaded from: classes2.dex */
public class C6892ei extends AbstractC6880ea<String> {

    /* renamed from: b */
    private final String f23258b;

    /* renamed from: c */
    private final List<AbstractC6880ea<?>> f23259c;

    public C6892ei(String str, List<AbstractC6880ea<?>> list) {
        C4588d.m23626a(str, (Object) "Instruction name must be a string.");
        C4588d.m23627a(list);
        this.f23258b = str;
        this.f23259c = list;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public String mo16034b() {
        return toString();
    }

    /* renamed from: e */
    public String m16039e() {
        return this.f23258b;
    }

    /* renamed from: f */
    public List<AbstractC6880ea<?>> m16038f() {
        return this.f23259c;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    public String toString() {
        String str = this.f23258b;
        String valueOf = String.valueOf(this.f23259c.toString());
        return new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(valueOf).length()).append(AbstractC11759f.f37104a).append(str).append(": ").append(valueOf).toString();
    }
}
