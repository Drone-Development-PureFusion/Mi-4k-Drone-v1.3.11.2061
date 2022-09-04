package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import org.codehaus.jackson.smile.SmileConstants;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.ad */
/* loaded from: classes.dex */
public class C2298ad extends C2247e {

    /* renamed from: b */
    private byte f7367b;

    /* renamed from: c */
    private byte f7368c;

    /* renamed from: d */
    private byte f7369d;

    /* renamed from: e */
    private byte f7370e;

    /* renamed from: f */
    private byte f7371f;

    /* renamed from: g */
    private byte f7372g;

    public C2298ad(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32364a() {
        return this.f7369d;
    }

    /* renamed from: a */
    public void m32363a(byte b) {
        this.f7371f = b;
    }

    /* renamed from: a */
    public void m32362a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6) {
        this.f7367b = b;
        this.f7368c = b2;
        this.f7369d = b3;
        this.f7370e = b4;
        this.f7371f = b4;
        this.f7372g = b6;
        this.f7081a.mo32909a(C2104d.EnumC2105a.GimbalCalibration);
    }

    /* renamed from: b */
    public byte m32361b() {
        return this.f7370e;
    }

    /* renamed from: b */
    public void m32360b(byte b) {
        this.f7372g = b;
    }

    /* renamed from: c */
    public byte m32359c() {
        return this.f7367b;
    }

    /* renamed from: d */
    public byte m32358d() {
        return this.f7368c;
    }

    /* renamed from: e */
    public byte m32357e() {
        return this.f7371f;
    }

    /* renamed from: f */
    public byte m32356f() {
        return (byte) (this.f7372g & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
    }

    public String toString() {
        return "GimalCalibrationVarable{type=" + ((int) this.f7367b) + ", progress=" + ((int) this.f7368c) + ", temp=" + ((int) this.f7369d) + ", errCode=" + ((int) this.f7370e) + ", fault=" + ((int) this.f7371f) + ", testData=" + ((int) this.f7372g) + C0494h.f735w;
    }
}
