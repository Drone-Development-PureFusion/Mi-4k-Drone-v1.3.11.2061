package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.al */
/* loaded from: classes.dex */
public class C2306al extends C2247e {

    /* renamed from: b */
    public static final int f7418b = 0;

    /* renamed from: c */
    public static final int f7419c = 1;

    /* renamed from: d */
    public static final int f7420d = 2;

    /* renamed from: e */
    public static final int f7421e = 3;

    /* renamed from: f */
    public byte f7422f;

    /* renamed from: g */
    public byte f7423g;

    /* renamed from: h */
    public byte f7424h;

    /* renamed from: i */
    public byte f7425i;

    /* renamed from: j */
    public float f7426j;

    /* renamed from: k */
    public byte f7427k;

    /* renamed from: m */
    private boolean f7429m;

    /* renamed from: n */
    private boolean f7430n = false;

    /* renamed from: o */
    private boolean f7431o = true;

    /* renamed from: l */
    public byte f7428l = 0;

    public C2306al() {
    }

    public C2306al(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: k */
    private void m32256k() {
        if (this.f7422f != 34) {
            if (this.f7422f != 51 || this.f7424h != 3 || this.f7425i != 4) {
                return;
            }
            if (this.f7426j == 1.0f) {
                this.f7429m = true;
            } else {
                this.f7429m = false;
            }
        } else if (this.f7424h != 1 && this.f7424h != 3) {
        } else {
            if ((((int) this.f7426j) & 1) == 1) {
                this.f7429m = false;
            }
            if ((((int) this.f7426j) & 2) == 2) {
                this.f7429m = false;
                this.f7430n = true;
            }
            if ((((int) this.f7426j) & 4) != 4) {
                return;
            }
            this.f7429m = true;
            this.f7430n = false;
        }
    }

    /* renamed from: a */
    public void m32271a(byte b) {
        this.f7428l = b;
    }

    /* renamed from: a */
    public void m32270a(byte b, byte b2, byte b3, byte b4, int i, byte b5) {
        this.f7422f = b;
        this.f7423g = b2;
        this.f7424h = b3;
        this.f7425i = b4;
        this.f7426j = i;
        this.f7427k = b5;
        this.f7081a.mo32909a(C2104d.EnumC2105a.NEW_HAND_OPERATE);
    }

    /* renamed from: a */
    public void m32269a(C2196c c2196c) {
        C2197d c2197d = c2196c.f6914d;
        c2197d.m32741c();
        this.f7422f = c2197d.m32739d();
        this.f7423g = c2197d.m32739d();
        c2197d.m32739d();
        c2197d.m32739d();
        c2197d.m32739d();
        c2197d.m32739d();
        this.f7427k = c2197d.m32739d();
        this.f7081a.mo32909a(C2104d.EnumC2105a.NEW_HAND_OPERATE);
    }

    /* renamed from: a */
    public void m32268a(boolean z) {
        this.f7431o = z;
    }

    /* renamed from: a */
    public boolean m32272a() {
        return this.f7430n;
    }

    /* renamed from: b */
    public byte m32267b() {
        return this.f7428l;
    }

    /* renamed from: b */
    public void m32266b(C2196c c2196c) {
        C2197d c2197d = c2196c.f6914d;
        c2197d.m32741c();
        this.f7422f = c2197d.m32739d();
        this.f7423g = c2197d.m32739d();
        this.f7424h = c2197d.m32739d();
        this.f7425i = c2197d.m32739d();
        if (this.f7424h == 4) {
            this.f7426j = c2197d.m32734i();
        } else {
            this.f7426j = c2197d.m32737f();
        }
        this.f7427k = c2197d.m32739d();
        m32256k();
        this.f7081a.mo32909a(C2104d.EnumC2105a.NEW_HAND_OPERATE);
    }

    /* renamed from: b */
    public void m32265b(boolean z) {
        this.f7429m = z;
    }

    /* renamed from: c */
    public boolean m32264c() {
        return this.f7431o;
    }

    /* renamed from: d */
    public byte m32263d() {
        return this.f7422f;
    }

    /* renamed from: e */
    public byte m32262e() {
        return this.f7423g;
    }

    /* renamed from: f */
    public byte m32261f() {
        return this.f7424h;
    }

    /* renamed from: g */
    public byte m32260g() {
        return this.f7425i;
    }

    /* renamed from: h */
    public float m32259h() {
        return this.f7426j;
    }

    /* renamed from: i */
    public byte m32258i() {
        return this.f7427k;
    }

    /* renamed from: j */
    public boolean m32257j() {
        return this.f7429m;
    }

    public String toString() {
        return "NewHandDroneVariable{report=" + ((int) this.f7427k) + ", valueToBeOperate=" + this.f7426j + ", byteCode=" + ((int) this.f7425i) + ", targetByteID=" + ((int) this.f7424h) + ", pilotMode=" + ((int) this.f7423g) + ", operation=" + ((int) this.f7422f) + C0494h.f735w;
    }
}
