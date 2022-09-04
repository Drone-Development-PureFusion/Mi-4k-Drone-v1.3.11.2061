package com.fimi.p149d.p150a;

import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p140a.p145e.C1509d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.d.a.c */
/* loaded from: classes.dex */
public class C1528c extends AbstractC1507b {

    /* renamed from: a */
    public static final int f3684a = 25;

    /* renamed from: b */
    private int f3685b = 10;

    /* renamed from: c */
    private byte f3686c;

    /* renamed from: d */
    private byte f3687d;

    /* renamed from: e */
    private byte f3688e;

    /* renamed from: f */
    private byte f3689f;

    /* renamed from: g */
    private byte f3690g;

    /* renamed from: h */
    private byte f3691h;

    /* renamed from: i */
    private byte f3692i;

    /* renamed from: j */
    private byte f3693j;

    /* renamed from: k */
    private byte f3694k;

    /* renamed from: l */
    private byte f3695l;

    /* renamed from: m */
    private byte f3696m;

    /* renamed from: n */
    private byte f3697n;

    /* renamed from: o */
    private byte f3698o;

    /* renamed from: p */
    private byte f3699p;

    /* renamed from: q */
    private byte f3700q;

    /* renamed from: r */
    private byte f3701r;

    /* renamed from: A */
    public byte m35353A() {
        return (byte) (this.f3699p | (this.f3700q << 1) | (this.f3701r << 2));
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: a */
    public void mo35236a(C1509d c1509d) {
        c1509d.m35449c();
        m35345h(c1509d.m35447d());
        m35343i(c1509d.m35447d());
        m35341j(c1509d.m35447d());
        m35339k(c1509d.m35447d());
        m35337l(c1509d.m35447d());
        m35335m(c1509d.m35447d());
        m35333n(c1509d.m35447d());
        m35327q(c1509d.m35447d());
        m35346h();
        m35344i();
    }

    /* renamed from: b */
    public void m35352b(byte b) {
        this.f3696m = b;
    }

    /* renamed from: c */
    public void m35351c(byte b) {
        this.f3697n = b;
    }

    /* renamed from: d */
    public void m35350d(byte b) {
        this.f3698o = b;
    }

    /* renamed from: e */
    public void m35349e(byte b) {
        this.f3699p = b;
    }

    /* renamed from: f */
    public void m35348f(byte b) {
        this.f3700q = b;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: g */
    public C1508c mo35234g() {
        return null;
    }

    /* renamed from: g */
    public void m35347g(byte b) {
        this.f3701r = b;
    }

    /* renamed from: h */
    public void m35346h() {
        m35352b((byte) ((this.f3688e >> 0) & 1));
        m35351c((byte) ((this.f3688e >> 1) & 1));
        m35350d((byte) ((this.f3688e >> 2) & 1));
    }

    /* renamed from: h */
    public void m35345h(byte b) {
        this.f3686c = b;
    }

    /* renamed from: i */
    public void m35344i() {
        m35349e((byte) ((this.f3695l >> 0) & 1));
        m35348f((byte) ((this.f3695l >> 1) & 1));
        m35347g((byte) ((this.f3695l >> 2) & 1));
    }

    /* renamed from: i */
    public void m35343i(byte b) {
        this.f3687d = b;
    }

    /* renamed from: j */
    public byte m35342j() {
        return this.f3696m;
    }

    /* renamed from: j */
    public void m35341j(byte b) {
        this.f3688e = b;
    }

    /* renamed from: k */
    public byte m35340k() {
        return this.f3697n;
    }

    /* renamed from: k */
    public void m35339k(byte b) {
        this.f3689f = b;
    }

    /* renamed from: l */
    public byte m35338l() {
        return this.f3698o;
    }

    /* renamed from: l */
    public void m35337l(byte b) {
        this.f3690g = b;
    }

    /* renamed from: m */
    public byte m35336m() {
        return this.f3699p;
    }

    /* renamed from: m */
    public void m35335m(byte b) {
        this.f3691h = b;
    }

    /* renamed from: n */
    public byte m35334n() {
        return this.f3700q;
    }

    /* renamed from: n */
    public void m35333n(byte b) {
        this.f3692i = b;
    }

    /* renamed from: o */
    public byte m35332o() {
        return this.f3701r;
    }

    /* renamed from: o */
    public void m35331o(byte b) {
        this.f3693j = b;
    }

    /* renamed from: p */
    public byte m35330p() {
        return this.f3686c;
    }

    /* renamed from: p */
    public void m35329p(byte b) {
        this.f3694k = b;
    }

    /* renamed from: q */
    public byte m35328q() {
        return this.f3687d;
    }

    /* renamed from: q */
    public void m35327q(byte b) {
        this.f3695l = b;
    }

    /* renamed from: r */
    public byte m35326r() {
        return this.f3688e;
    }

    /* renamed from: s */
    public byte m35325s() {
        return this.f3689f;
    }

    /* renamed from: t */
    public byte m35324t() {
        return this.f3690g;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    public String toString() {
        return "Scene7bResponse{DATALEN=" + this.f3685b + ", cmdId=" + ((int) this.f3686c) + ", scenarios=" + ((int) this.f3687d) + ", follower=" + ((int) this.f3688e) + ", course_x_1=" + ((int) this.f3689f) + ", course_x_2=" + ((int) this.f3690g) + ", cabrage_y_1=" + ((int) this.f3691h) + ", cabrage_y_2=" + ((int) this.f3692i) + ", vRockerVertical=" + ((int) this.f3693j) + ", vRockerHorizontal=" + ((int) this.f3694k) + ", rockerSetting=" + ((int) this.f3695l) + ", followerBit0=" + ((int) this.f3696m) + ", followerBit1=" + ((int) this.f3697n) + ", followerBit2=" + ((int) this.f3698o) + ", rockerSettingBit0=" + ((int) this.f3699p) + ", rockerSettingBit1=" + ((int) this.f3700q) + ", rockerSettingBit2=" + ((int) this.f3701r) + C0494h.f735w;
    }

    /* renamed from: u */
    public byte m35323u() {
        return this.f3691h;
    }

    /* renamed from: v */
    public byte m35322v() {
        return this.f3692i;
    }

    /* renamed from: w */
    public byte m35321w() {
        return this.f3693j;
    }

    /* renamed from: x */
    public byte m35320x() {
        return this.f3694k;
    }

    /* renamed from: y */
    public byte m35319y() {
        return this.f3695l;
    }

    /* renamed from: z */
    public byte m35318z() {
        return (byte) (this.f3696m | (this.f3697n << 1) | (this.f3698o << 2));
    }
}
