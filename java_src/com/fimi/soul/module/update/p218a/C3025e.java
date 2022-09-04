package com.fimi.soul.module.update.p218a;

import java.io.Serializable;
/* renamed from: com.fimi.soul.module.update.a.e */
/* loaded from: classes.dex */
public class C3025e implements Serializable {

    /* renamed from: a */
    private int f11236a;

    /* renamed from: b */
    private int f11237b;

    /* renamed from: c */
    private String f11238c;

    /* renamed from: d */
    private int f11239d;

    /* renamed from: e */
    private long f11240e;

    /* renamed from: f */
    private long f11241f;

    /* renamed from: g */
    private long f11242g;

    /* renamed from: h */
    private long f11243h;

    /* renamed from: i */
    private byte[] f11244i;

    /* renamed from: j */
    private byte[] f11245j;

    /* renamed from: k */
    private byte[] f11246k;

    /* renamed from: l */
    private byte[] f11247l;

    /* renamed from: m */
    private String f11248m;

    public C3025e() {
        this.f11244i = new byte[4];
        this.f11245j = new byte[4];
        this.f11246k = new byte[4];
        this.f11247l = new byte[4];
    }

    public C3025e(int i, int i2, int i3, String str, long j, long j2, long j3, long j4) {
        this.f11244i = new byte[4];
        this.f11245j = new byte[4];
        this.f11246k = new byte[4];
        this.f11247l = new byte[4];
        this.f11236a = i2;
        this.f11237b = i3;
        this.f11238c = str;
        this.f11239d = i;
        this.f11240e = j;
        this.f11241f = j2;
        this.f11242g = j3;
        this.f11243h = j4;
        if (i == 5) {
            this.f11248m = Long.toString(((65535 & j) << 32) | ((65535 & j2) << 16) | (65535 & j3));
        } else {
            this.f11248m = String.valueOf(j) + String.valueOf(j2) + String.valueOf(j3) + String.valueOf(j4);
        }
    }

    public C3025e(int i, int i2, int i3, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f11244i = new byte[4];
        this.f11245j = new byte[4];
        this.f11246k = new byte[4];
        this.f11247l = new byte[4];
        this.f11236a = i2;
        this.f11237b = i3;
        this.f11238c = str;
        this.f11239d = i;
        this.f11244i = bArr;
        this.f11245j = bArr2;
        this.f11246k = bArr3;
        this.f11247l = bArr4;
    }

    public C3025e(String str, int i, int i2) {
        this.f11244i = new byte[4];
        this.f11245j = new byte[4];
        this.f11246k = new byte[4];
        this.f11247l = new byte[4];
        this.f11238c = str;
        this.f11239d = i;
        this.f11237b = i2;
    }

    /* renamed from: a */
    public int m29571a() {
        return this.f11236a;
    }

    /* renamed from: a */
    public void m29570a(int i) {
        this.f11236a = i;
    }

    /* renamed from: a */
    public void m29569a(long j) {
        this.f11240e = j;
    }

    /* renamed from: a */
    public void m29568a(String str) {
        this.f11238c = str;
    }

    /* renamed from: a */
    public void m29567a(byte[] bArr) {
        this.f11244i = bArr;
    }

    /* renamed from: b */
    public int m29566b() {
        return this.f11237b;
    }

    /* renamed from: b */
    public void m29565b(int i) {
        this.f11237b = i;
    }

    /* renamed from: b */
    public void m29564b(long j) {
        this.f11241f = j;
    }

    /* renamed from: b */
    public void m29563b(String str) {
        this.f11248m = str;
    }

    /* renamed from: b */
    public void m29562b(byte[] bArr) {
        this.f11245j = bArr;
    }

    /* renamed from: c */
    public String m29561c() {
        return this.f11238c;
    }

    /* renamed from: c */
    public void m29560c(int i) {
        this.f11239d = i;
    }

    /* renamed from: c */
    public void m29559c(long j) {
        this.f11242g = j;
    }

    /* renamed from: c */
    public void m29558c(byte[] bArr) {
        this.f11246k = bArr;
    }

    /* renamed from: d */
    public int m29557d() {
        return this.f11239d;
    }

    /* renamed from: d */
    public void m29556d(long j) {
        this.f11243h = j;
    }

    /* renamed from: d */
    public void m29555d(byte[] bArr) {
        this.f11247l = bArr;
    }

    /* renamed from: e */
    public long m29554e() {
        return this.f11240e;
    }

    /* renamed from: f */
    public long m29553f() {
        return this.f11241f;
    }

    /* renamed from: g */
    public long m29552g() {
        return this.f11242g;
    }

    /* renamed from: h */
    public long m29551h() {
        return this.f11243h;
    }

    /* renamed from: i */
    public String m29550i() {
        return this.f11248m;
    }

    /* renamed from: j */
    public byte[] m29549j() {
        return this.f11244i;
    }

    /* renamed from: k */
    public byte[] m29548k() {
        return this.f11245j;
    }

    /* renamed from: l */
    public byte[] m29547l() {
        return this.f11246k;
    }

    /* renamed from: m */
    public byte[] m29546m() {
        return this.f11247l;
    }
}
