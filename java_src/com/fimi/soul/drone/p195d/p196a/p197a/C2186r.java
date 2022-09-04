package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import java.io.Serializable;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.fimi.soul.drone.d.a.a.r */
/* loaded from: classes.dex */
public class C2186r extends AbstractC2195b implements Serializable {

    /* renamed from: a */
    public static final byte f6822a = 115;

    /* renamed from: c */
    public static final byte f6823c = 1;

    /* renamed from: d */
    public static final byte f6824d = 0;

    /* renamed from: e */
    public static final byte f6825e = 1;

    /* renamed from: f */
    public static final byte f6826f = 2;

    /* renamed from: g */
    public byte f6827g;

    /* renamed from: h */
    public byte f6828h;

    /* renamed from: i */
    public byte f6829i;

    /* renamed from: j */
    public byte f6830j;

    /* renamed from: k */
    private final byte f6831k = SmileConstants.TOKEN_KEY_LONG_STRING;

    /* renamed from: l */
    private byte f6832l = 0;

    public C2186r() {
        this.f6910b = 52;
    }

    /* renamed from: a */
    public void m32769a(byte b) {
        switch (b) {
            case 0:
                this.f6832l = (byte) 0;
                return;
            case 1:
                this.f6832l = (byte) 1;
                return;
            case 2:
                this.f6832l = (byte) 2;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m32768a(C2196c c2196c) {
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6827g = c2197d.m32739d();
        this.f6828h = c2197d.m32739d();
        this.f6829i = c2197d.m32739d();
        this.f6830j = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 52;
        c2196c.f6912b = 2;
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 1);
        return c2196c;
    }
}
