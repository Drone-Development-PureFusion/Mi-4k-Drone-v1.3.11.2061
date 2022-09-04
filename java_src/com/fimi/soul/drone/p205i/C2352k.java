package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.k */
/* loaded from: classes.dex */
public class C2352k extends C2247e {

    /* renamed from: b */
    private byte f7707b;

    /* renamed from: c */
    private byte f7708c;

    /* renamed from: d */
    private byte f7709d;

    /* renamed from: e */
    private byte f7710e;

    /* renamed from: f */
    private byte f7711f;

    public C2352k(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m31923a() {
        return this.f7707b;
    }

    /* renamed from: a */
    public void m31922a(byte b) {
        this.f7707b = b;
    }

    /* renamed from: a */
    public void m31921a(byte b, byte b2, byte b3, byte b4, byte b5) {
        this.f7707b = b;
        this.f7708c = b2;
        this.f7709d = b3;
        this.f7710e = b4;
        this.f7711f = b5;
        this.f7081a.mo32909a(C2104d.EnumC2105a.CaliCompass);
    }

    /* renamed from: b */
    public byte m31920b() {
        return this.f7711f;
    }

    /* renamed from: b */
    public void m31919b(byte b) {
        this.f7711f = b;
    }

    /* renamed from: c */
    public byte m31918c() {
        return this.f7710e;
    }

    /* renamed from: c */
    public void m31917c(byte b) {
        this.f7710e = b;
    }

    /* renamed from: d */
    public byte m31916d() {
        return this.f7709d;
    }

    /* renamed from: d */
    public void m31915d(byte b) {
        this.f7709d = b;
    }

    /* renamed from: e */
    public byte m31914e() {
        return this.f7708c;
    }

    /* renamed from: e */
    public void m31913e(byte b) {
        this.f7708c = b;
    }

    public String toString() {
        return "Compass{packetSeq=" + ((int) this.f7707b) + ", caliType=" + ((int) this.f7708c) + ", caliStep=" + ((int) this.f7709d) + ", caliStepStatus=" + ((int) this.f7710e) + ", report=" + ((int) this.f7711f) + C0494h.f735w;
    }
}
