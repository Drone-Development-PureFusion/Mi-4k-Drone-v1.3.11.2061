package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.c */
/* loaded from: classes.dex */
public class C2333c extends C2247e {

    /* renamed from: b */
    public byte f7577b;

    /* renamed from: c */
    public byte f7578c;

    /* renamed from: d */
    public byte f7579d;

    public C2333c() {
    }

    public C2333c(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32033a() {
        return this.f7579d;
    }

    /* renamed from: a */
    public void m32032a(byte b, byte b2, byte b3) {
        this.f7577b = b;
        this.f7578c = b2;
        this.f7579d = b3;
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.backControl);
        }
    }

    /* renamed from: b */
    public byte m32031b() {
        return this.f7577b;
    }

    /* renamed from: c */
    public byte m32030c() {
        return this.f7578c;
    }

    /* renamed from: d */
    public byte m32029d() {
        return this.f7579d;
    }

    public String toString() {
        return "BackControl [model=" + ((int) this.f7577b) + ", status=" + ((int) this.f7578c) + ", action=" + ((int) this.f7579d) + "]";
    }
}
