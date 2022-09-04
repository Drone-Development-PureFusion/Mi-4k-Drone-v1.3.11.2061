package com.fimi.soul.module.p214c;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.p197a.C2133aw;
import com.fimi.soul.drone.p195d.p196a.p197a.C2136az;
import com.fimi.soul.drone.p195d.p196a.p197a.C2138ba;
import com.fimi.soul.drone.p195d.p196a.p197a.C2152bo;
import com.fimi.soul.drone.p195d.p196a.p197a.C2155br;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.module.calibcompass.C2540a;
import com.fimi.soul.module.droneui.DroneMap;
import com.fimi.soul.module.setting.newhand.C2955c;
/* renamed from: com.fimi.soul.module.c.d */
/* loaded from: classes.dex */
public class C2523d {

    /* renamed from: a */
    private static C2523d f8193a = null;

    /* renamed from: b */
    private static C2083a f8194b;

    /* renamed from: c */
    private C2540a f8195c = C2540a.m31307a();

    /* renamed from: d */
    private C2519b f8196d = C2519b.m31392a();

    private C2523d() {
    }

    /* renamed from: a */
    public static C2523d m31374a(C2083a c2083a) {
        f8194b = c2083a;
        if (f8193a == null) {
            f8193a = new C2523d();
        }
        return f8193a;
    }

    /* renamed from: a */
    private void m31373a(C2196c c2196c) {
        C2516a m31398a = C2516a.m31398a(this.f8196d);
        this.f8195c.m31304a(c2196c.f6913c + "", m31398a);
        if (m31398a != null) {
            if (c2196c.f6913c == 140 || c2196c.f6913c == 139) {
                m31398a.m31402a(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING);
            } else {
                m31398a.m31402a(300);
            }
            m31398a.m31401a(f8194b, c2196c);
            m31398a.m31403a();
            C2279c.m32454a(C2279c.EnumC2280a.PHONESEND);
        }
    }

    /* renamed from: a */
    public void m31386a() {
        if (!f8194b.m33009am()) {
            C2152bo c2152bo = new C2152bo();
            c2152bo.f6596d = (short) 1;
            f8194b.mo32906ab().mo32587a(c2152bo.mo32762b());
            m31373a(c2152bo.mo32762b());
        }
    }

    /* renamed from: a */
    public void m31385a(byte b) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 154;
        c2196c.f6912b = 25;
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 13);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b(b);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: a */
    public void m31384a(byte b, byte b2, byte b3) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 153;
        c2196c.f6912b = 3;
        c2196c.f6914d.m32744b(b);
        c2196c.f6914d.m32744b(b2);
        c2196c.f6914d.m32744b(b3);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: a */
    public void m31383a(byte b, byte b2, short s, short s2, byte b3, short s3, float f, float f2) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 134;
        c2196c.f6912b = 19;
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b(b);
        c2196c.f6914d.m32744b(b2);
        c2196c.f6914d.m32746a(s);
        c2196c.f6914d.m32746a(s2);
        c2196c.f6914d.m32744b(b3);
        c2196c.f6914d.m32746a(s3);
        c2196c.f6914d.m32749a(f);
        c2196c.f6914d.m32749a(f2);
        c2196c.f6914d.m32744b((byte) 0);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: a */
    public void m31382a(double d, double d2) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 128;
        c2196c.f6912b = 14;
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32749a((float) d);
        c2196c.f6914d.m32749a((float) d2);
        c2196c.f6914d.m32746a((short) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: a */
    public void m31381a(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 130;
        c2196c.f6912b = 2;
        c2196c.f6914d.m32746a((short) i);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: a */
    public void m31380a(int i, double d, double d2, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 129;
        c2196c.f6912b = 19;
        c2196c.f6914d.m32744b((byte) i);
        c2196c.f6914d.m32744b((byte) i3);
        c2196c.f6914d.m32749a((float) d);
        c2196c.f6914d.m32749a((float) d2);
        c2196c.f6914d.m32746a((short) i2);
        c2196c.f6914d.m32746a((short) i4);
        c2196c.f6914d.m32744b((byte) i5);
        c2196c.f6914d.m32744b((byte) i6);
        c2196c.f6914d.m32744b((byte) i7);
        c2196c.f6914d.m32744b((byte) i8);
        c2196c.f6914d.m32744b((byte) 0);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: a */
    public void m31379a(int i, double d, double d2, short s, int i2, int i3) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 133;
        c2196c.f6912b = 16;
        c2196c.f6914d.m32744b((byte) i);
        c2196c.f6914d.m32744b((byte) i3);
        c2196c.f6914d.m32749a((float) d);
        c2196c.f6914d.m32749a((float) d2);
        c2196c.f6914d.m32746a(s);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) i2);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: a */
    public void m31378a(int i, double d, double d2, short s, short s2, int i2) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 131;
        c2196c.f6912b = 19;
        c2196c.f6914d.m32746a((short) i);
        c2196c.f6914d.m32749a((float) d);
        c2196c.f6914d.m32749a((float) d2);
        c2196c.f6914d.m32746a(s);
        c2196c.f6914d.m32746a((short) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) i2);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32746a(s2);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: a */
    public void m31377a(int i, int i2, int i3, int i4, long j) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 139;
        c2196c.f6912b = 17;
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 15);
        c2196c.f6914d.m32744b((byte) 13);
        c2196c.f6914d.m32744b((byte) -96);
        c2196c.f6914d.m32746a((short) i);
        c2196c.f6914d.m32746a((short) i2);
        c2196c.f6914d.m32744b((byte) i3);
        c2196c.f6914d.m32744b((byte) i4);
        c2196c.f6914d.m32743b((int) j);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: a */
    public void m31376a(int i, int i2, byte[] bArr) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 139;
        c2196c.f6912b = 9;
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 15);
        c2196c.f6914d.m32744b((byte) 13);
        c2196c.f6914d.m32744b((byte) -95);
        c2196c.f6914d.m32746a((short) i);
        c2196c.f6914d.m32746a((short) i2);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: a */
    public void m31375a(int i, byte[] bArr) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 140;
        c2196c.f6912b = bArr.length + 5;
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 15);
        c2196c.f6914d.m32744b((byte) 13);
        c2196c.f6914d.m32746a((short) i);
        for (byte b : bArr) {
            c2196c.f6914d.m32744b(b);
        }
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: b */
    public void m31372b() {
        C2138ba c2138ba = new C2138ba();
        c2138ba.f6493d = (short) 1;
        f8194b.mo32906ab().mo32587a(c2138ba.mo32762b());
        m31373a(c2138ba.mo32762b());
    }

    /* renamed from: b */
    public void m31371b(byte b, byte b2, byte b3) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 153;
        c2196c.f6912b = 3;
        c2196c.f6914d.m32744b(b);
        c2196c.f6914d.m32744b(b2);
        c2196c.f6914d.m32744b(b3);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: b */
    public void m31370b(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 204;
        c2196c.f6912b = 2;
        c2196c.f6914d.m32744b((byte) i);
        c2196c.f6914d.m32744b((byte) 2);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: c */
    public void m31369c() {
        C2133aw c2133aw = new C2133aw();
        c2133aw.f6458d = (short) 1;
        f8194b.mo32906ab().mo32587a(c2133aw.mo32762b());
        m31373a(c2133aw.mo32762b());
    }

    /* renamed from: c */
    public void m31368c(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 138;
        c2196c.f6912b = 8;
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 13);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 17);
        c2196c.f6914d.m32744b((byte) i);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: d */
    public void m31367d() {
        C2136az c2136az = new C2136az();
        c2136az.f6483d = (short) 1;
        c2136az.f6484e = DroneMap.f9378o;
        f8194b.mo32906ab().mo32587a(c2136az.mo32762b());
        m31373a(c2136az.mo32762b());
    }

    /* renamed from: d */
    public void m31366d(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 139;
        c2196c.f6912b = 6;
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 15);
        c2196c.f6914d.m32744b((byte) 13);
        c2196c.f6914d.m32744b((byte) -94);
        c2196c.f6914d.m32744b((byte) i);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: e */
    public void m31365e() {
        C2136az c2136az = new C2136az();
        c2136az.f6483d = (short) 1;
        c2136az.f6484e = DroneMap.f9377n;
        f8194b.mo32906ab().mo32587a(c2136az.mo32762b());
        m31373a(c2136az.mo32762b());
    }

    /* renamed from: e */
    public void m31364e(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 193;
        c2196c.f6912b = 1;
        c2196c.f6914d.m32744b((byte) i);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: f */
    public void m31363f() {
        C2136az c2136az = new C2136az();
        c2136az.f6483d = (short) 1;
        c2136az.f6484e = DroneMap.f9376m;
        f8194b.mo32906ab().mo32587a(c2136az.mo32762b());
        m31373a(c2136az.mo32762b());
    }

    /* renamed from: f */
    public void m31362f(int i) {
        this.f8195c.m31305a(i + "");
    }

    /* renamed from: g */
    public void m31361g() {
        C2155br c2155br = new C2155br();
        c2155br.f6617e = (byte) 1;
        c2155br.f6616d = (byte) 114;
        c2155br.f6618f = (byte) 3;
        f8194b.mo32906ab().mo32587a(c2155br.mo32762b());
        m31373a(c2155br.mo32762b());
    }

    /* renamed from: h */
    public void m31360h() {
        C2155br c2155br = new C2155br();
        c2155br.f6617e = (byte) 1;
        c2155br.f6616d = (byte) 114;
        c2155br.f6618f = (byte) 1;
        f8194b.mo32906ab().mo32587a(c2155br.mo32762b());
        m31373a(c2155br.mo32762b());
    }

    /* renamed from: i */
    public void m31359i() {
        C2155br c2155br = new C2155br();
        c2155br.f6617e = (byte) 1;
        c2155br.f6616d = (byte) 114;
        c2155br.f6618f = (byte) 2;
        f8194b.mo32906ab().mo32587a(c2155br.mo32762b());
        m31373a(c2155br.mo32762b());
    }

    /* renamed from: j */
    public void m31358j() {
        C2155br c2155br = new C2155br();
        c2155br.f6617e = (byte) 1;
        c2155br.f6616d = (byte) 87;
        c2155br.f6618f = (byte) 0;
        f8194b.mo32906ab().mo32587a(c2155br.mo32762b());
        m31373a(c2155br.mo32762b());
    }

    /* renamed from: k */
    public void m31357k() {
        C2155br c2155br = new C2155br();
        c2155br.f6617e = (byte) 2;
        c2155br.f6616d = DroneMap.f9377n;
        c2155br.f6618f = (byte) 0;
        f8194b.mo32906ab().mo32587a(c2155br.mo32762b());
        m31373a(c2155br.mo32762b());
    }

    /* renamed from: l */
    public void m31356l() {
        C2155br c2155br = new C2155br();
        c2155br.f6617e = (byte) 1;
        c2155br.f6616d = (byte) 84;
        c2155br.f6618f = (byte) 0;
        f8194b.mo32906ab().mo32587a(c2155br.mo32762b());
        m31373a(c2155br.mo32762b());
    }

    /* renamed from: m */
    public void m31355m() {
        C2155br c2155br = new C2155br();
        c2155br.f6617e = (byte) 1;
        c2155br.f6616d = (byte) 88;
        c2155br.f6618f = (byte) 0;
        f8194b.mo32906ab().mo32587a(c2155br.mo32762b());
        m31373a(c2155br.mo32762b());
    }

    /* renamed from: n */
    public void m31354n() {
        C2155br c2155br = new C2155br();
        c2155br.f6617e = (byte) 1;
        c2155br.f6616d = (byte) 86;
        c2155br.f6618f = (byte) 2;
        f8194b.mo32906ab().mo32587a(c2155br.mo32762b());
        m31373a(c2155br.mo32762b());
    }

    /* renamed from: o */
    public void m31353o() {
        C2155br c2155br = new C2155br();
        c2155br.f6617e = (byte) 1;
        c2155br.f6616d = C2955c.f10865f;
        c2155br.f6618f = (byte) 1;
        f8194b.mo32906ab().mo32587a(c2155br.mo32762b());
        m31373a(c2155br.mo32762b());
    }

    /* renamed from: p */
    public void m31352p() {
        C2155br c2155br = new C2155br();
        c2155br.f6617e = (byte) 1;
        c2155br.f6616d = (byte) 86;
        c2155br.f6618f = (byte) 1;
        f8194b.mo32906ab().mo32587a(c2155br.mo32762b());
        m31373a(c2155br.mo32762b());
    }

    /* renamed from: q */
    public void m31351q() {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 148;
        c2196c.f6912b = 2;
        c2196c.f6914d.m32746a((short) 1);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }

    /* renamed from: r */
    public void m31350r() {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 122;
        c2196c.f6912b = 2;
        c2196c.f6914d.m32744b((byte) 10);
        c2196c.f6914d.m32744b((byte) 0);
        f8194b.mo32906ab().mo32587a(c2196c);
        m31373a(c2196c);
    }
}
