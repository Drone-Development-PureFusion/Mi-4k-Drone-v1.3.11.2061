package com.fimi.p155h;

import android.util.Log;
import com.fimi.p140a.p141a.C1492d;
import java.util.Arrays;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.h.b */
/* loaded from: classes.dex */
public class C1565b {

    /* renamed from: a */
    private int f3848a;

    /* renamed from: b */
    private int f3849b;

    /* renamed from: c */
    private int f3850c;

    /* renamed from: d */
    private int f3851d;

    /* renamed from: e */
    private byte[] f3852e;

    /* renamed from: f */
    private byte[] f3853f;

    /* renamed from: g */
    private byte[] f3854g;

    /* renamed from: h */
    private byte[] f3855h;

    /* renamed from: i */
    private int f3856i;

    public C1565b(int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f3848a = i;
        this.f3849b = i2;
        this.f3850c = i3;
        this.f3851d = i4;
        this.f3852e = bArr;
        this.f3853f = bArr2;
        this.f3854g = bArr3;
        this.f3855h = bArr4 == null ? new byte[4] : bArr4;
    }

    /* renamed from: a */
    public int m35140a() {
        return this.f3856i;
    }

    /* renamed from: a */
    public void m35139a(int i) {
        this.f3856i = i;
    }

    /* renamed from: b */
    public byte m35138b() {
        return (byte) this.f3848a;
    }

    /* renamed from: c */
    public int m35137c() {
        return this.f3849b;
    }

    /* renamed from: d */
    public int m35136d() {
        return this.f3850c;
    }

    /* renamed from: e */
    public int m35135e() {
        return this.f3851d;
    }

    /* renamed from: f */
    public byte[] m35134f() {
        return this.f3852e;
    }

    /* renamed from: g */
    public byte[] m35133g() {
        return this.f3853f;
    }

    /* renamed from: h */
    public byte[] m35132h() {
        return this.f3854g;
    }

    /* renamed from: i */
    public byte[] m35131i() {
        return this.f3855h;
    }

    /* renamed from: j */
    public void m35130j() {
        if (this.f3848a == 3 && this.f3849b == 3) {
            this.f3856i = C1492d.f3565a;
        } else if (this.f3848a == 8 && this.f3849b == 3) {
            this.f3856i = C1492d.f3566b;
        } else if (this.f3848a == 6 && this.f3849b == 2) {
            this.f3856i = C1492d.f3567c;
        }
        Log.d("zhej", "sysId:" + this.f3856i);
    }

    public String toString() {
        return "FirmwareBean{type=" + this.f3848a + ", model=" + this.f3849b + ", hardwareVersion=" + this.f3850c + ", softwareVersion=" + this.f3851d + ", idA=" + Arrays.toString(this.f3852e) + ", idB=" + Arrays.toString(this.f3853f) + ", idC=" + Arrays.toString(this.f3854g) + ", idD=" + Arrays.toString(this.f3855h) + ", sysId=" + this.f3856i + C0494h.f735w;
    }
}
