package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.ao */
/* loaded from: classes.dex */
public class C2309ao extends C2247e {

    /* renamed from: b */
    private byte f7454b;

    /* renamed from: c */
    private byte f7455c;

    /* renamed from: d */
    private byte f7456d;

    /* renamed from: e */
    private byte f7457e;

    /* renamed from: f */
    private byte f7458f;

    public C2309ao(C2083a c2083a) {
        super(c2083a);
        c2083a.mo32909a(C2104d.EnumC2105a.PAIR_CODE);
    }

    /* renamed from: a */
    public byte m32209a() {
        return this.f7454b;
    }

    /* renamed from: a */
    public void m32208a(byte b) {
        this.f7454b = b;
    }

    /* renamed from: b */
    public byte m32207b() {
        return this.f7455c;
    }

    /* renamed from: b */
    public void m32206b(byte b) {
        this.f7455c = b;
    }

    /* renamed from: c */
    public byte m32205c() {
        return this.f7456d;
    }

    /* renamed from: c */
    public void m32204c(byte b) {
        this.f7456d = b;
    }

    /* renamed from: d */
    public byte m32203d() {
        return this.f7457e;
    }

    /* renamed from: d */
    public void m32202d(byte b) {
        this.f7457e = b;
    }

    /* renamed from: e */
    public byte m32201e() {
        return this.f7458f;
    }

    /* renamed from: e */
    public void m32200e(byte b) {
        this.f7458f = b;
    }

    public String toString() {
        return "PairCodeStatus{msg_id=" + ((int) this.f7454b) + ", target_id=" + ((int) this.f7455c) + ", ask_status=" + ((int) this.f7456d) + ", ask_type=" + ((int) this.f7457e) + ", pair_status=" + ((int) this.f7458f) + C0494h.f735w;
    }
}
