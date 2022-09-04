package com.fimi.p149d.p150a;

import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p140a.p145e.C1509d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.d.a.a */
/* loaded from: classes.dex */
public class C1526a extends AbstractC1507b {

    /* renamed from: a */
    public static final int f3671a = 65;

    /* renamed from: b */
    private byte f3672b;

    /* renamed from: c */
    private byte f3673c;

    /* renamed from: d */
    private byte f3674d;

    /* renamed from: e */
    private int f3675e;

    /* renamed from: f */
    private boolean f3676f;

    /* renamed from: g */
    private boolean f3677g;

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: a */
    public void mo35236a(C1509d c1509d) {
        c1509d.m35449c();
        m35375b(c1509d.m35447d());
        m35373c(c1509d.m35447d());
        m35371d(c1509d.m35447d());
    }

    /* renamed from: b */
    public void m35375b(byte b) {
        this.f3672b = b;
    }

    /* renamed from: b */
    public void m35374b(boolean z) {
        this.f3676f = z;
    }

    /* renamed from: c */
    public void m35373c(byte b) {
        this.f3673c = b;
    }

    /* renamed from: c */
    public void m35372c(boolean z) {
        this.f3677g = z;
    }

    /* renamed from: d */
    public void m35371d(byte b) {
        this.f3674d = b;
        this.f3675e = b & 3;
        if ((b & 4) != 0) {
            this.f3676f = true;
        } else {
            this.f3676f = false;
        }
        if ((b & 8) != 0) {
            this.f3676f = true;
        } else {
            this.f3676f = false;
        }
        if ((b & 16) != 0) {
            this.f3677g = true;
        } else {
            this.f3677g = false;
        }
    }

    /* renamed from: e */
    public void m35370e(int i) {
        this.f3675e = i;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: g */
    public C1508c mo35234g() {
        return null;
    }

    /* renamed from: h */
    public int m35369h() {
        return this.f3675e;
    }

    /* renamed from: i */
    public boolean m35368i() {
        return this.f3676f;
    }

    /* renamed from: j */
    public boolean m35367j() {
        return this.f3677g;
    }

    /* renamed from: k */
    public byte m35366k() {
        return this.f3672b;
    }

    /* renamed from: l */
    public byte m35365l() {
        return this.f3673c;
    }

    /* renamed from: m */
    public byte m35364m() {
        return this.f3674d;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    public String toString() {
        return "Battery41Response{batteryCapcity=" + ((int) this.f3672b) + ", batteryVoltage=" + ((int) this.f3673c) + ", batteryInfo=" + ((int) this.f3674d) + ", changeState=" + this.f3675e + ", cameraChange=" + this.f3676f + ", poweOff=" + this.f3677g + C0494h.f735w;
    }
}
