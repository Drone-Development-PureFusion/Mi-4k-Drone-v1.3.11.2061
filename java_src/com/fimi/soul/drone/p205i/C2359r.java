package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import java.util.Arrays;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.r */
/* loaded from: classes.dex */
public class C2359r extends C2247e {

    /* renamed from: b */
    public byte f7732b;

    /* renamed from: c */
    public byte f7733c;

    /* renamed from: d */
    public byte f7734d;

    /* renamed from: e */
    public byte f7735e;

    /* renamed from: f */
    public byte f7736f;

    /* renamed from: g */
    private byte f7737g;

    /* renamed from: h */
    private byte[] f7738h;

    public C2359r(C2083a c2083a) {
        super(c2083a);
        c2083a.mo32909a(C2104d.EnumC2105a.DYNAMIC_RESULT);
    }

    /* renamed from: a */
    public byte m31877a() {
        return this.f7737g;
    }

    /* renamed from: a */
    public void m31876a(byte b) {
        this.f7737g = b;
    }

    /* renamed from: a */
    public void m31875a(byte[] bArr) {
        this.f7738h = bArr;
    }

    /* renamed from: b */
    public byte m31874b() {
        return this.f7732b;
    }

    /* renamed from: b */
    public void m31873b(byte b) {
        this.f7732b = b;
    }

    /* renamed from: c */
    public byte m31872c() {
        return this.f7733c;
    }

    /* renamed from: c */
    public void m31871c(byte b) {
        this.f7733c = b;
    }

    /* renamed from: d */
    public void m31869d(byte b) {
        this.f7734d = b;
    }

    /* renamed from: d */
    public byte[] m31870d() {
        return this.f7738h;
    }

    /* renamed from: e */
    public byte m31868e() {
        return this.f7734d;
    }

    /* renamed from: e */
    public void m31867e(byte b) {
        this.f7735e = b;
    }

    /* renamed from: f */
    public byte m31866f() {
        return this.f7735e;
    }

    /* renamed from: f */
    public void m31865f(byte b) {
        this.f7736f = b;
    }

    /* renamed from: g */
    public byte m31864g() {
        return this.f7736f;
    }

    public String toString() {
        return "DynamicStatus{msg_id=" + ((int) this.f7737g) + ", tagertId=" + ((int) this.f7732b) + ", sourceId=" + ((int) this.f7733c) + ", packetNum=" + Arrays.toString(this.f7738h) + ", gps_status=" + ((int) this.f7734d) + ", received=" + ((int) this.f7735e) + ", report_status=" + ((int) this.f7736f) + C0494h.f735w;
    }
}
