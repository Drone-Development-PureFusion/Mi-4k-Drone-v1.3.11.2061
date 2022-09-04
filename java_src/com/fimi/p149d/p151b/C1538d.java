package com.fimi.p149d.p151b;

import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p140a.p145e.C1509d;
import java.util.Arrays;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.d.b.d */
/* loaded from: classes.dex */
public class C1538d extends AbstractC1507b {

    /* renamed from: a */
    public static final int f3745a = 201;

    /* renamed from: b */
    private short f3746b;

    /* renamed from: c */
    private int f3747c;

    /* renamed from: d */
    private byte[] f3748d;

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: a */
    public void mo35236a(C1509d c1509d) {
    }

    /* renamed from: a */
    public void m35244a(byte[] bArr) {
        this.f3748d = bArr;
    }

    /* renamed from: e */
    public void m35243e(int i) {
        this.f3746b = (short) i;
    }

    /* renamed from: f */
    public void m35242f(int i) {
        this.f3747c = i;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: g */
    public C1508c mo35234g() {
        C1508c c1508c = new C1508c();
        c1508c.m35472a(this.f3747c + 3, e(), f(), c(), d());
        c1508c.f3613b.m35452b(b());
        c1508c.f3613b.m35455a((short) (this.f3746b + 1));
        c1508c.f3613b.m35454a(this.f3748d);
        return c1508c;
    }

    /* renamed from: h */
    public short m35241h() {
        return this.f3746b;
    }

    /* renamed from: i */
    public int m35240i() {
        return this.f3747c;
    }

    /* renamed from: j */
    public byte[] m35239j() {
        return this.f3748d;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    public String toString() {
        return "UpgradeC9Message{sequence=" + ((int) this.f3746b) + ", dataLen=" + this.f3747c + ", data=" + Arrays.toString(this.f3748d) + C0494h.f735w;
    }
}
