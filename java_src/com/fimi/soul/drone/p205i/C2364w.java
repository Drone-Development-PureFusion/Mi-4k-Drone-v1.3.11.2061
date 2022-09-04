package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.w */
/* loaded from: classes.dex */
public class C2364w extends C2247e {

    /* renamed from: b */
    private long f7760b;

    /* renamed from: c */
    private byte f7761c;

    /* renamed from: d */
    private byte f7762d;

    /* renamed from: a */
    public byte m31834a() {
        return this.f7761c;
    }

    /* renamed from: a */
    public void m31833a(byte b) {
        this.f7761c = b;
    }

    /* renamed from: b */
    public byte m31832b() {
        return this.f7762d;
    }

    /* renamed from: b */
    public void m31831b(byte b) {
        this.f7762d = b;
    }

    /* renamed from: c */
    public boolean m31830c() {
        return this.f7762d == 1;
    }

    /* renamed from: d */
    public boolean m31829d() {
        if (System.currentTimeMillis() - this.f7760b > 10000) {
            this.f7760b = System.currentTimeMillis();
            return true;
        }
        return false;
    }
}
