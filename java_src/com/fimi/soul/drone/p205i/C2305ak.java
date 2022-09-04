package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.fimi.soul.drone.i.ak */
/* loaded from: classes.dex */
public class C2305ak extends C2247e {

    /* renamed from: b */
    public int f7416b;

    /* renamed from: c */
    public byte f7417c = 1;

    public C2305ak(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public int m32275a() {
        return this.f7416b;
    }

    /* renamed from: a */
    public void m32274a(int i, byte b) {
        this.f7416b = i;
        this.f7417c = b;
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.IMU_WORKSTATE);
        }
    }

    /* renamed from: b */
    public byte m32273b() {
        return this.f7417c;
    }

    public String toString() {
        return "IMUWorkStateInfo{imuWorkState=" + (this.f7416b & 255) + "cmdACK=" + (this.f7417c & SmileConstants.BYTE_MARKER_END_OF_CONTENT) + "}";
    }
}
