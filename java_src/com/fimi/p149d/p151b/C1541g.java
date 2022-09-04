package com.fimi.p149d.p151b;

import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p140a.p145e.C1509d;
/* renamed from: com.fimi.d.b.g */
/* loaded from: classes.dex */
public class C1541g extends AbstractC1507b {

    /* renamed from: a */
    public static final int f3754a = 204;

    /* renamed from: b */
    private final int f3755b = 2;

    /* renamed from: c */
    private byte f3756c;

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: a */
    public void mo35236a(C1509d c1509d) {
        c1509d.m35449c();
    }

    /* renamed from: b */
    public void m35235b(byte b) {
        this.f3756c = b;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: g */
    public C1508c mo35234g() {
        C1508c c1508c = new C1508c();
        c1508c.m35472a(2, e(), f(), c(), d());
        c1508c.f3613b.m35452b(b());
        c1508c.f3613b.m35452b(this.f3756c);
        return c1508c;
    }

    /* renamed from: h */
    public byte m35233h() {
        return this.f3756c;
    }
}
