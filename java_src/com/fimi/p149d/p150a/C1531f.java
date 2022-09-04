package com.fimi.p149d.p150a;

import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p140a.p145e.C1509d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.d.a.f */
/* loaded from: classes.dex */
public class C1531f extends AbstractC1507b {

    /* renamed from: a */
    private short f3708a;

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: a */
    public void mo35236a(C1509d c1509d) {
        c1509d.m35449c();
        a(c1509d.m35447d());
        m35308a(c1509d.m35446e());
        a(c1509d.m35447d() == 0);
    }

    /* renamed from: a */
    public void m35308a(short s) {
        this.f3708a = s;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: g */
    public C1508c mo35234g() {
        return null;
    }

    /* renamed from: h */
    public short m35307h() {
        return this.f3708a;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    public String toString() {
        return "UpgradeC9Response{sequence=" + ((int) this.f3708a) + C0494h.f735w;
    }
}
