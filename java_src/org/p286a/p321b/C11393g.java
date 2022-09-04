package org.p286a.p321b;

import java.io.ByteArrayOutputStream;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.AbstractC11378g;
import org.p286a.p321b.p323b.C11371a;
import org.p286a.p321b.p324c.C11385a;
/* renamed from: org.a.b.g */
/* loaded from: classes2.dex */
public class C11393g {

    /* renamed from: a */
    private final ByteArrayOutputStream f36507a;

    /* renamed from: b */
    private final C11385a f36508b;

    /* renamed from: c */
    private AbstractC11376e f36509c;

    public C11393g() {
        this(new C11371a.C11372a());
    }

    public C11393g(AbstractC11378g abstractC11378g) {
        this.f36507a = new ByteArrayOutputStream();
        this.f36508b = new C11385a(this.f36507a);
        this.f36509c = abstractC11378g.mo1221a(this.f36508b);
    }

    /* renamed from: a */
    public byte[] m1207a(AbstractC11361a abstractC11361a) {
        this.f36507a.reset();
        abstractC11361a.mo1285b(this.f36509c);
        return this.f36507a.toByteArray();
    }
}
