package com.fimi.soul.drone.p202f;

import java.io.Serializable;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.f.a */
/* loaded from: classes.dex */
public class C2269a implements Serializable {

    /* renamed from: a */
    private int f7117a;

    /* renamed from: b */
    private int f7118b;

    /* renamed from: c */
    private int f7119c;

    /* renamed from: d */
    private long f7120d;

    /* renamed from: e */
    private long f7121e;

    /* renamed from: f */
    private long f7122f;

    /* renamed from: g */
    private long f7123g;

    /* renamed from: h */
    private char f7124h;

    public C2269a() {
    }

    public C2269a(int i, int i2, int i3, char c, long j, long j2, long j3, long j4) {
        this.f7119c = i;
        this.f7117a = i2;
        this.f7118b = i3;
        this.f7124h = c;
        this.f7120d = j;
        this.f7121e = j2;
        this.f7122f = j3;
        this.f7123g = j4;
    }

    /* renamed from: a */
    public int m32523a() {
        return this.f7117a;
    }

    /* renamed from: a */
    public void m32522a(char c) {
        this.f7124h = c;
    }

    /* renamed from: a */
    public void m32521a(int i) {
        this.f7117a = i;
    }

    /* renamed from: a */
    public void m32520a(long j) {
        this.f7120d = j;
    }

    /* renamed from: a */
    public void m32519a(short s) {
        this.f7118b = s;
    }

    /* renamed from: b */
    public int m32518b() {
        return this.f7119c;
    }

    /* renamed from: b */
    public void m32517b(int i) {
        this.f7119c = i;
    }

    /* renamed from: b */
    public void m32516b(long j) {
        this.f7121e = j;
    }

    /* renamed from: c */
    public int m32515c() {
        return this.f7118b;
    }

    /* renamed from: c */
    public void m32514c(long j) {
        this.f7123g = j;
    }

    /* renamed from: d */
    public long m32513d() {
        return this.f7120d;
    }

    /* renamed from: d */
    public void m32512d(long j) {
        this.f7122f = j;
    }

    /* renamed from: e */
    public long m32511e() {
        return this.f7121e;
    }

    /* renamed from: f */
    public long m32510f() {
        return this.f7123g;
    }

    /* renamed from: g */
    public long m32509g() {
        return this.f7122f;
    }

    /* renamed from: h */
    public long m32508h() {
        return Long.valueOf(this.f7124h).longValue();
    }

    public String toString() {
        return "DroneUpdateInfo{model=" + this.f7117a + ", version=" + this.f7118b + ", type=" + this.f7119c + ", IDA=" + this.f7120d + ", IDB=" + this.f7121e + ", IDC=" + this.f7122f + ", IDD=" + this.f7123g + ", hwVersion=" + this.f7124h + C0494h.f735w;
    }
}
