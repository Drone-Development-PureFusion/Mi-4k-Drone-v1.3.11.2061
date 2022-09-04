package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import org.codehaus.jackson.smile.SmileConstants;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.d */
/* loaded from: classes.dex */
public class C2334d extends C2247e {

    /* renamed from: b */
    public byte f7580b;

    /* renamed from: c */
    public byte f7581c;

    /* renamed from: d */
    public byte f7582d;

    /* renamed from: e */
    public byte f7583e;

    /* renamed from: f */
    public byte f7584f;

    /* renamed from: g */
    public byte f7585g;

    /* renamed from: h */
    public short f7586h;

    /* renamed from: i */
    public short f7587i;

    /* renamed from: j */
    public byte f7588j;

    /* renamed from: k */
    public byte f7589k;

    /* renamed from: l */
    public byte f7590l;

    /* renamed from: m */
    public byte f7591m;

    /* renamed from: n */
    public byte f7592n;

    public C2334d() {
    }

    public C2334d(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public int m32028a() {
        return this.f7580b & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
    }

    /* renamed from: a */
    public void m32027a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, short s, short s2, byte b7, byte b8, byte b9, byte b10, byte b11) {
        this.f7580b = b;
        this.f7581c = b2;
        this.f7582d = b3;
        this.f7583e = b4;
        this.f7584f = b5;
        this.f7585g = b6;
        this.f7586h = s;
        this.f7587i = s2;
        this.f7588j = b7;
        this.f7589k = b8;
        this.f7590l = b9;
        this.f7591m = b10;
        this.f7592n = b11;
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.BATTERY);
        }
    }

    /* renamed from: b */
    public int m32026b() {
        return this.f7581c & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
    }

    /* renamed from: c */
    public int m32025c() {
        return this.f7582d & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
    }

    /* renamed from: d */
    public int m32024d() {
        return this.f7583e & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
    }

    /* renamed from: e */
    public byte m32023e() {
        return this.f7584f;
    }

    /* renamed from: f */
    public byte m32022f() {
        return this.f7585g;
    }

    /* renamed from: g */
    public short m32021g() {
        return this.f7586h;
    }

    /* renamed from: h */
    public short m32020h() {
        return this.f7587i;
    }

    /* renamed from: i */
    public int m32019i() {
        return this.f7588j & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
    }

    /* renamed from: j */
    public short m32018j() {
        return this.f7589k;
    }

    /* renamed from: k */
    public byte m32017k() {
        return this.f7590l;
    }

    /* renamed from: l */
    public byte m32016l() {
        return this.f7591m;
    }

    /* renamed from: m */
    public byte m32015m() {
        return this.f7592n;
    }

    public String toString() {
        return "Battery{Cell_1_Voltage=" + ((int) this.f7580b) + ", Cell_2_Voltage=" + ((int) this.f7581c) + ", Cell_3_Voltage=" + ((int) this.f7582d) + ", Cell_4_Voltage=" + ((int) this.f7583e) + ", Cell_5_Voltage=" + ((int) this.f7584f) + ", Cell_6_Voltage=" + ((int) this.f7585g) + ", Current_Capacity=" + ((int) this.f7586h) + ", Current=" + ((int) this.f7587i) + ", battery_temperature=" + ((int) this.f7588j) + ", batteryLevel=" + ((int) this.f7589k) + ", battery_parameter_err=" + ((int) this.f7590l) + ", battery_over_discharge=" + ((int) this.f7591m) + ", RCNoUpdateCnt=" + ((int) this.f7592n) + C0494h.f735w;
    }
}
