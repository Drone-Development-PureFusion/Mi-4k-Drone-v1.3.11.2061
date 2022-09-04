package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.ab */
/* loaded from: classes.dex */
public class C2296ab extends C2247e {

    /* renamed from: b */
    private char f7351b;

    /* renamed from: c */
    private short f7352c;

    /* renamed from: d */
    private byte f7353d;

    /* renamed from: e */
    private byte f7354e = 50;

    /* renamed from: f */
    private long f7355f;

    /* renamed from: g */
    private long f7356g;

    /* renamed from: h */
    private long f7357h;

    /* renamed from: i */
    private long f7358i;

    /* renamed from: j */
    private C2196c f7359j;

    public C2296ab(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32382a() {
        return this.f7354e;
    }

    /* renamed from: a */
    public void m32381a(byte b, char c, short s, byte b2, long j, long j2, long j3, long j4, C2196c c2196c) {
        this.f7351b = c;
        this.f7352c = s;
        this.f7353d = b2;
        this.f7354e = b;
        this.f7355f = j;
        this.f7356g = j2;
        this.f7357h = j3;
        this.f7358i = j4;
        this.f7359j = c2196c;
        this.f7081a.mo32909a(C2104d.EnumC2105a.FCVERSION2);
    }

    /* renamed from: b */
    public char m32380b() {
        return this.f7351b;
    }

    /* renamed from: c */
    public short m32379c() {
        return this.f7352c;
    }

    /* renamed from: d */
    public byte m32378d() {
        return this.f7353d;
    }

    /* renamed from: e */
    public long m32377e() {
        return this.f7355f;
    }

    /* renamed from: f */
    public long m32376f() {
        return this.f7356g;
    }

    /* renamed from: g */
    public long m32375g() {
        return this.f7357h;
    }

    /* renamed from: h */
    public long m32374h() {
        return this.f7358i;
    }

    /* renamed from: i */
    public C2196c m32373i() {
        return this.f7359j;
    }

    public String toString() {
        return "FCVersion2{FC_hardware_version=" + this.f7351b + ", Software_version=" + ((int) this.f7352c) + ", Model=" + ((int) this.f7353d) + ", type=" + ((int) this.f7354e) + ", IDA=" + this.f7355f + ", IDB=" + this.f7356g + ", IDC=" + this.f7357h + ", reserve=" + this.f7358i + ", miLinkPacket=" + this.f7359j + C0494h.f735w;
    }
}
