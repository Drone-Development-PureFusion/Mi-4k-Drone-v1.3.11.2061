package org.p286a.p321b;

import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.AbstractC11378g;
import org.p286a.p321b.p323b.C11371a;
import org.p286a.p321b.p324c.C11387c;
/* renamed from: org.a.b.e */
/* loaded from: classes2.dex */
public class C11391e {

    /* renamed from: a */
    private final AbstractC11376e f36505a;

    /* renamed from: b */
    private final C11387c f36506b;

    public C11391e() {
        this(new C11371a.C11372a());
    }

    public C11391e(AbstractC11378g abstractC11378g) {
        this.f36506b = new C11387c();
        this.f36505a = abstractC11378g.mo1221a(this.f36506b);
    }

    /* renamed from: a */
    public void m1208a(AbstractC11361a abstractC11361a, byte[] bArr) {
        try {
            this.f36506b.m1219a(bArr);
            abstractC11361a.mo1286a(this.f36505a);
        } finally {
            this.f36505a.m1229y();
        }
    }
}
