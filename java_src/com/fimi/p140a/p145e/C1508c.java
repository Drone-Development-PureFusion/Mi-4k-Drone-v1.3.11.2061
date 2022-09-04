package com.fimi.p140a.p145e;

import com.fimi.p140a.p146f.C1516b;
import com.fimi.p149d.p150a.C1526a;
import com.fimi.p149d.p150a.C1527b;
import com.fimi.p149d.p150a.C1528c;
import com.fimi.p149d.p150a.C1529d;
import com.fimi.p149d.p150a.C1530e;
import com.fimi.p149d.p150a.C1531f;
import com.fimi.p149d.p150a.C1532g;
import com.fimi.p149d.p150a.C1533h;
import com.fimi.p149d.p150a.C1534i;
import java.io.Serializable;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.fimi.a.e.c */
/* loaded from: classes.dex */
public class C1508c implements Serializable {

    /* renamed from: a */
    public static final int f3612a = 254;
    private static final long serialVersionUID = 2095947771227815314L;

    /* renamed from: b */
    public C1509d f3613b;

    /* renamed from: c */
    public C1506a f3614c;

    /* renamed from: d */
    private int f3615d;

    /* renamed from: e */
    private int f3616e;

    /* renamed from: f */
    private int f3617f;

    /* renamed from: g */
    private byte[] f3618g;

    public C1508c() {
        this.f3618g = new byte[6];
        this.f3613b = new C1509d();
        this.f3618g[0] = -2;
    }

    public C1508c(C1509d c1509d) {
        this.f3618g = new byte[6];
        this.f3613b = c1509d;
    }

    /* renamed from: a */
    private void m35471a(byte[] bArr) {
        this.f3614c = new C1506a();
        for (int i = 1; i < bArr.length - 2; i++) {
            this.f3614c.m35489a(bArr[i]);
        }
    }

    /* renamed from: a */
    public int m35475a() {
        return this.f3615d;
    }

    /* renamed from: a */
    public void m35474a(int i) {
        this.f3615d = i;
    }

    /* renamed from: a */
    public void m35473a(int i, int i2) {
        this.f3618g[i] = (byte) i2;
        switch (i) {
            case 1:
                m35469b(i2);
                return;
            case 5:
                this.f3617f = i2;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m35472a(int i, int i2, int i3, int i4, int i5) {
        this.f3618g[1] = (byte) (i + 4);
        this.f3615d = i;
        this.f3618g[2] = (byte) i2;
        this.f3618g[3] = (byte) i3;
        this.f3618g[4] = (byte) i4;
        this.f3618g[5] = (byte) i5;
        this.f3617f = i5;
    }

    /* renamed from: b */
    public int m35470b() {
        return this.f3616e;
    }

    /* renamed from: b */
    public void m35469b(int i) {
        this.f3616e = i;
    }

    /* renamed from: c */
    public int m35468c() {
        return this.f3617f;
    }

    /* renamed from: c */
    public void m35467c(int i) {
        this.f3617f = i;
    }

    /* renamed from: d */
    public boolean m35466d() {
        return this.f3613b.m35453b() >= 511 || this.f3613b.m35453b() == (this.f3618g[1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) + (-4);
    }

    /* renamed from: e */
    public void m35465e() {
        this.f3614c = new C1506a();
        for (int i = 1; i < this.f3618g.length; i++) {
            this.f3614c.m35489a(this.f3618g[i]);
        }
        this.f3613b.m35449c();
        for (int i2 = 0; i2 < this.f3613b.m35453b(); i2++) {
            this.f3614c.m35489a(this.f3613b.m35447d());
        }
    }

    /* renamed from: f */
    public byte[] m35464f() {
        int i = 6;
        int i2 = 0;
        byte[] bArr = new byte[this.f3615d + 6 + 2];
        System.arraycopy(this.f3618g, 0, bArr, 0, 6);
        while (i2 < this.f3613b.m35453b()) {
            bArr[i] = this.f3613b.f3620b.get(i2);
            i2++;
            i++;
        }
        m35471a(bArr);
        int i3 = i + 1;
        bArr[i] = (byte) this.f3614c.m35486c();
        int i4 = i3 + 1;
        bArr[i3] = (byte) this.f3614c.m35488b();
        System.out.println("encodePacket " + C1516b.m35418a(bArr));
        return bArr;
    }

    /* renamed from: g */
    public AbstractC1507b m35463g() {
        switch (this.f3618g[5] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) {
            case 25:
                C1528c c1528c = new C1528c();
                c1528c.b(25);
                c1528c.mo35236a(this.f3613b);
                return c1528c;
            case 65:
                C1526a c1526a = new C1526a();
                c1526a.b(65);
                c1526a.mo35236a(this.f3613b);
                return c1526a;
            case 125:
                C1527b c1527b = new C1527b();
                c1527b.b(125);
                c1527b.mo35236a(this.f3613b);
                return c1527b;
            case 193:
                C1529d c1529d = new C1529d();
                c1529d.b(193);
                c1529d.mo35236a(this.f3613b);
                return c1529d;
            case 199:
                C1530e c1530e = new C1530e();
                c1530e.b(199);
                c1530e.mo35236a(this.f3613b);
                return c1530e;
            case 201:
                C1531f c1531f = new C1531f();
                c1531f.b(201);
                c1531f.mo35236a(this.f3613b);
                return c1531f;
            case 202:
                C1532g c1532g = new C1532g();
                c1532g.b(202);
                c1532g.mo35236a(this.f3613b);
                return c1532g;
            case 203:
                C1533h c1533h = new C1533h();
                c1533h.b(203);
                c1533h.mo35236a(this.f3613b);
                return c1533h;
            case 204:
                C1534i c1534i = new C1534i();
                c1534i.b(204);
                c1534i.mo35236a(this.f3613b);
                return c1534i;
            default:
                return null;
        }
    }
}
