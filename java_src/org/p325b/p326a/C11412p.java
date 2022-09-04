package org.p325b.p326a;

import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
/* renamed from: org.b.a.p */
/* loaded from: classes.dex */
public class C11412p extends AbstractC11414r {
    public C11412p(String str) {
        super(str);
    }

    @AbstractC11431i
    /* renamed from: b */
    public static AbstractC11433k<String> m1146b(String str) {
        return new C11412p(str);
    }

    @Override // org.p325b.p326a.AbstractC11414r
    /* renamed from: a */
    protected boolean mo1144a(String str) {
        return str.endsWith(this.f36528a);
    }

    @Override // org.p325b.p326a.AbstractC11414r
    /* renamed from: b */
    protected String mo1142b() {
        return "ending with";
    }
}
