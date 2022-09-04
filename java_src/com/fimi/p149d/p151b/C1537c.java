package com.fimi.p149d.p151b;

import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p140a.p145e.C1509d;
/* renamed from: com.fimi.d.b.c */
/* loaded from: classes.dex */
public class C1537c extends AbstractC1507b {

    /* renamed from: a */
    public static final int f3741a = 199;

    /* renamed from: b */
    private final int f3742b = 3;

    /* renamed from: c */
    private byte f3743c;

    /* renamed from: d */
    private byte f3744d;

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: a */
    public void mo35236a(C1509d c1509d) {
    }

    /* renamed from: b */
    public void m35248b(byte b) {
        this.f3743c = b;
    }

    /* renamed from: c */
    public void m35247c(byte b) {
        this.f3744d = b;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: g */
    public C1508c mo35234g() {
        C1508c c1508c = new C1508c();
        c1508c.m35472a(3, e(), f(), c(), d());
        c1508c.f3613b.m35452b(b());
        c1508c.f3613b.m35452b(this.f3743c);
        c1508c.f3613b.m35452b(this.f3744d);
        return c1508c;
    }

    /* renamed from: h */
    public byte m35246h() {
        return this.f3743c;
    }

    /* renamed from: i */
    public byte m35245i() {
        return this.f3744d;
    }
}
