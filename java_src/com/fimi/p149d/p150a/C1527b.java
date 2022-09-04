package com.fimi.p149d.p150a;

import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p140a.p145e.C1509d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.d.a.b */
/* loaded from: classes.dex */
public class C1527b extends AbstractC1507b {

    /* renamed from: a */
    public static final int f3678a = 125;

    /* renamed from: b */
    private byte f3679b;

    /* renamed from: c */
    private short f3680c;

    /* renamed from: d */
    private byte f3681d;

    /* renamed from: e */
    private byte f3682e;

    /* renamed from: f */
    private int f3683f;

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: a */
    public void mo35236a(C1509d c1509d) {
        c1509d.m35449c();
        m35362b(c1509d.m35447d());
        m35363a(c1509d.m35446e());
        m35361c(c1509d.m35447d());
    }

    /* renamed from: a */
    public void m35363a(short s) {
        this.f3680c = s;
        this.f3683f = m35355l();
    }

    /* renamed from: b */
    public void m35362b(byte b) {
        this.f3679b = b;
    }

    /* renamed from: c */
    public void m35361c(byte b) {
        this.f3681d = b;
        m35360d((byte) (b & 1));
    }

    /* renamed from: d */
    public void m35360d(byte b) {
        this.f3682e = b;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: g */
    public C1508c mo35234g() {
        return null;
    }

    /* renamed from: h */
    public byte m35359h() {
        return this.f3679b;
    }

    /* renamed from: i */
    public short m35358i() {
        return this.f3680c;
    }

    /* renamed from: j */
    public byte m35357j() {
        return this.f3681d;
    }

    /* renamed from: k */
    public byte m35356k() {
        return this.f3682e;
    }

    /* renamed from: l */
    public int m35355l() {
        if ((this.f3680c & 1) == 1) {
            return 0;
        }
        if (((this.f3680c >> 1) & 1) == 1) {
            return 1;
        }
        if (((this.f3680c >> 9) & 1) == 1) {
            return 9;
        }
        if (((this.f3680c >> 4) & 1) == 1) {
            return 4;
        }
        if (((this.f3680c >> 2) & 1) == 1) {
            return 2;
        }
        if (((this.f3680c >> 3) & 1) == 1) {
            return 3;
        }
        if (((this.f3680c >> 7) & 1) == 1) {
            return 7;
        }
        if (((this.f3680c >> 5) & 1) == 1) {
            return 5;
        }
        if (((this.f3680c >> 6) & 1) == 1) {
            return 6;
        }
        return ((this.f3680c >> 8) & 1) == 1 ? 8 : -1;
    }

    /* renamed from: m */
    public int m35354m() {
        return this.f3683f;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    public String toString() {
        return "Gimal7DResponse{commadType=" + ((int) this.f3679b) + ", errorCode=" + ((int) this.f3680c) + ", statusCode=" + ((int) this.f3681d) + C0494h.f735w;
    }
}
