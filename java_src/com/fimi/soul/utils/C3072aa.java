package com.fimi.soul.utils;

import java.io.Serializable;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.utils.aa */
/* loaded from: classes.dex */
public class C3072aa implements Serializable {

    /* renamed from: a */
    private String f11507a;

    /* renamed from: b */
    private String f11508b;

    /* renamed from: c */
    private long f11509c;

    /* renamed from: d */
    private double f11510d;

    /* renamed from: e */
    private String f11511e = "0";

    /* renamed from: f */
    private double f11512f;

    /* renamed from: g */
    private double f11513g;

    /* renamed from: a */
    public String m29389a() {
        return this.f11511e;
    }

    /* renamed from: a */
    public void m29388a(double d) {
        this.f11510d = d;
    }

    /* renamed from: a */
    public void m29387a(long j) {
        this.f11509c = j;
    }

    /* renamed from: a */
    public void m29386a(String str) {
        this.f11511e = str;
    }

    /* renamed from: b */
    public String m29385b() {
        return this.f11507a;
    }

    /* renamed from: b */
    public void m29384b(double d) {
        this.f11512f = d;
    }

    /* renamed from: b */
    public void m29383b(String str) {
        this.f11507a = str;
    }

    /* renamed from: c */
    public String m29382c() {
        return this.f11508b;
    }

    /* renamed from: c */
    public void m29381c(double d) {
        this.f11513g = d;
    }

    /* renamed from: c */
    public void m29380c(String str) {
        this.f11508b = str;
    }

    /* renamed from: d */
    public long m29379d() {
        return this.f11509c;
    }

    /* renamed from: e */
    public double m29378e() {
        return this.f11510d;
    }

    /* renamed from: f */
    public double m29377f() {
        return this.f11512f;
    }

    /* renamed from: g */
    public double m29376g() {
        return this.f11513g;
    }

    public String toString() {
        return "FlyRecordEntity{user_id='" + this.f11507a + C0494h.f738z + ", drone_id='" + this.f11508b + C0494h.f738z + ", flyTime=" + this.f11509c + ", flyDistance=" + this.f11510d + ", deviceType='" + this.f11511e + C0494h.f738z + ", lat=" + this.f11512f + ", lon=" + this.f11513g + C0494h.f735w;
    }
}
