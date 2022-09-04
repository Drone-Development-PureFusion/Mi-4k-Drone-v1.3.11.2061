package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class aqd extends aqg {

    /* renamed from: a */
    private apr f22859a;

    /* renamed from: b */
    private final String f22860b;

    /* renamed from: c */
    private final List<String> f22861c;

    /* renamed from: d */
    private final List<C6892ei> f22862d;

    public aqd(apr aprVar, String str, List<String> list, List<C6892ei> list2) {
        this.f22859a = aprVar;
        this.f22860b = str;
        this.f22861c = list;
        this.f22862d = list2;
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    public AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        try {
            apr m16318a = this.f22859a.m16318a();
            for (int i = 0; i < this.f22861c.size(); i++) {
                if (abstractC6880eaArr.length > i) {
                    m16318a.m16316a(this.f22861c.get(i), abstractC6880eaArr[i]);
                } else {
                    m16318a.m16316a(this.f22861c.get(i), C6886ee.f23122e);
                }
            }
            m16318a.m16316a("arguments", new C6887ef(Arrays.asList(abstractC6880eaArr)));
            for (C6892ei c6892ei : this.f22862d) {
                AbstractC6880ea m16027a = C6895ek.m16027a(m16318a, c6892ei);
                if ((m16027a instanceof C6886ee) && ((C6886ee) m16027a).m16053e()) {
                    return ((C6886ee) m16027a).mo16034b();
                }
            }
        } catch (RuntimeException e) {
            String str = this.f22860b;
            String valueOf = String.valueOf(e.getMessage());
            aph.m16396a(new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(valueOf).length()).append("Internal error - Function call: ").append(str).append("\n").append(valueOf).toString());
        }
        return C6886ee.f23122e;
    }

    /* renamed from: a */
    public String m16226a() {
        return this.f22860b;
    }

    /* renamed from: a */
    public void m16225a(apr aprVar) {
        this.f22859a = aprVar;
    }

    public String toString() {
        String str = this.f22860b;
        String valueOf = String.valueOf(this.f22861c.toString());
        String valueOf2 = String.valueOf(this.f22862d.toString());
        return new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length()).append(str).append("\n\tparams: ").append(valueOf).append("\n\t: statements: ").append(valueOf2).toString();
    }
}
