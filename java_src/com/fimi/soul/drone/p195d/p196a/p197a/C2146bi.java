package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bi */
/* loaded from: classes.dex */
public class C2146bi extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6553a = 130;

    /* renamed from: c */
    public static final int f6554c = 2;
    private static final long serialVersionUID = 130;

    /* renamed from: d */
    public short f6555d;

    public C2146bi() {
        this.f6910b = 130;
    }

    public C2146bi(C2196c c2196c) {
        this.f6910b = 130;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6555d = c2197d.m32738e();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 2;
        c2196c.f6913c = 130;
        c2196c.f6914d.m32746a(this.f6555d);
        return c2196c;
    }

    public String toString() {
        return "msg_NumberUplink [MILINK_MSG_ID_RCDATA=130+number=" + ((int) this.f6555d) + "]";
    }
}
