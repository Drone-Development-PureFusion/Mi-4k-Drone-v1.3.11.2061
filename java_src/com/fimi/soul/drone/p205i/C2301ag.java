package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import java.io.Serializable;
import org.codehaus.jackson.smile.SmileConstants;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.ag */
/* loaded from: classes.dex */
public class C2301ag extends C2247e implements Serializable {

    /* renamed from: b */
    private double f7383b;

    /* renamed from: c */
    private double f7384c;

    /* renamed from: d */
    private byte f7385d;

    /* renamed from: e */
    private byte f7386e;

    /* renamed from: f */
    private int f7387f;

    /* renamed from: g */
    private byte f7388g;

    /* renamed from: h */
    private byte f7389h;

    /* renamed from: i */
    private double f7390i;

    /* renamed from: j */
    private double f7391j;

    /* renamed from: k */
    private double f7392k;

    /* renamed from: l */
    private double f7393l;

    /* renamed from: m */
    private double f7394m;

    /* renamed from: n */
    private double f7395n;

    /* renamed from: o */
    private double f7396o;

    public C2301ag() {
    }

    public C2301ag(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public double m32334a() {
        return this.f7383b;
    }

    /* renamed from: a */
    public void m32333a(byte b) {
        this.f7385d = b;
    }

    /* renamed from: a */
    public void m32332a(byte b, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        this.f7385d = (byte) (b & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
        this.f7390i = d;
        this.f7396o = d2;
        this.f7395n = d3;
        this.f7394m = d4;
        this.f7391j = d5;
        this.f7392k = d6;
        this.f7393l = d7;
        this.f7386e = (byte) d8;
        this.f7387f = (int) d9;
        this.f7383b = d10;
        this.f7384c = d11;
        this.f7388g = (byte) d12;
        this.f7389h = (byte) d13;
    }

    /* renamed from: a */
    public void m32331a(double d) {
        this.f7383b = d;
    }

    /* renamed from: a */
    public void m32330a(double d, double d2, double d3, double d4, double d5, double d6, double d7, byte b, byte b2, int i, byte b3, byte b4, double d8, double d9) {
        this.f7390i = d2;
        this.f7395n = d;
        this.f7391j = d3;
        this.f7392k = d4;
        this.f7393l = d5;
        this.f7394m = d6;
        this.f7396o = d7;
        this.f7383b = d8;
        this.f7384c = d9;
        this.f7385d = b;
        this.f7386e = b2;
        this.f7387f = i;
        this.f7388g = b3;
        this.f7389h = b4;
        this.f7081a.mo32909a(C2104d.EnumC2105a.HEARDATA);
    }

    /* renamed from: a */
    public void m32329a(int i) {
        this.f7387f = i;
    }

    /* renamed from: b */
    public double m32328b() {
        return this.f7384c;
    }

    /* renamed from: b */
    public void m32327b(byte b) {
        this.f7386e = b;
    }

    /* renamed from: b */
    public void m32326b(double d) {
        this.f7384c = d;
    }

    /* renamed from: c */
    public byte m32325c() {
        return this.f7385d;
    }

    /* renamed from: c */
    public void m32324c(double d) {
        this.f7390i = d;
    }

    /* renamed from: d */
    public byte m32323d() {
        return this.f7386e;
    }

    /* renamed from: d */
    public void m32322d(double d) {
        this.f7391j = d;
    }

    /* renamed from: e */
    public int m32321e() {
        return this.f7387f;
    }

    /* renamed from: e */
    public void m32320e(double d) {
        this.f7392k = d;
    }

    /* renamed from: f */
    public byte m32319f() {
        return this.f7388g;
    }

    /* renamed from: f */
    public void m32318f(double d) {
        this.f7393l = d;
    }

    /* renamed from: g */
    public byte m32317g() {
        return this.f7389h;
    }

    /* renamed from: g */
    public void m32316g(double d) {
        this.f7394m = d;
    }

    /* renamed from: h */
    public double m32315h() {
        return this.f7390i;
    }

    /* renamed from: h */
    public void m32314h(double d) {
        this.f7395n = d;
    }

    /* renamed from: i */
    public double m32313i() {
        return this.f7391j;
    }

    /* renamed from: i */
    public void m32312i(double d) {
        this.f7396o = d;
    }

    /* renamed from: j */
    public double m32311j() {
        return this.f7392k;
    }

    /* renamed from: k */
    public double m32310k() {
        return this.f7393l;
    }

    /* renamed from: l */
    public double m32309l() {
        return this.f7394m;
    }

    /* renamed from: m */
    public double m32308m() {
        return this.f7395n;
    }

    /* renamed from: n */
    public double m32307n() {
        return this.f7396o;
    }

    public String toString() {
        return "HeardData{GroundSpeed=" + this.f7383b + ", DownVelocity=" + this.f7384c + ", Heartbeat=" + ((int) this.f7385d) + ", Disarm_count=" + ((int) this.f7386e) + ", FlightMode=" + this.f7387f + ", rcReceiver=" + ((int) this.f7388g) + ", takeoffTag=" + ((int) this.f7389h) + ", ThrottleStick=" + this.f7390i + ", rollangle=" + this.f7391j + ", pitchangle=" + this.f7392k + ", Headingangle=" + this.f7393l + ", YawStick=" + this.f7394m + ", PitchStick=" + this.f7395n + ", RollStick=" + this.f7396o + C0494h.f735w;
    }
}
