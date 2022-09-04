package com.fimi.p140a.p145e;

import java.io.Serializable;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.a.e.b */
/* loaded from: classes.dex */
public abstract class AbstractC1507b implements Serializable {
    private static final long serialVersionUID = -7754622750478538539L;

    /* renamed from: a */
    private int f3606a;

    /* renamed from: b */
    private int f3607b;

    /* renamed from: c */
    private int f3608c;

    /* renamed from: d */
    private int f3609d;

    /* renamed from: e */
    private byte f3610e;

    /* renamed from: f */
    private boolean f3611f;

    /* renamed from: a */
    public void mo35268a(byte b) {
        this.f3610e = b;
    }

    /* renamed from: a */
    public void m35484a(int i) {
        this.f3608c = i;
    }

    /* renamed from: a */
    public abstract void mo35236a(C1509d c1509d);

    /* renamed from: a */
    public void m35483a(boolean z) {
        this.f3611f = z;
    }

    /* renamed from: a */
    public boolean m35485a() {
        return this.f3611f;
    }

    /* renamed from: b */
    public byte mo35267b() {
        return this.f3610e;
    }

    /* renamed from: b */
    public void m35482b(int i) {
        this.f3609d = i;
    }

    /* renamed from: c */
    public int m35481c() {
        return this.f3608c;
    }

    /* renamed from: c */
    public void m35480c(int i) {
        this.f3606a = i;
    }

    /* renamed from: d */
    public int m35479d() {
        return this.f3609d;
    }

    /* renamed from: d */
    public void m35478d(int i) {
        this.f3607b = i;
    }

    /* renamed from: e */
    public int m35477e() {
        return this.f3606a;
    }

    /* renamed from: f */
    public int m35476f() {
        return this.f3607b;
    }

    /* renamed from: g */
    public abstract C1508c mo35234g();

    public String toString() {
        return "LinkMessage{tartgetId=" + this.f3606a + ", sourceId=" + this.f3607b + ", seq=" + this.f3608c + ", msgid=" + this.f3609d + ", type=" + ((int) this.f3610e) + ", isSuccess=" + this.f3611f + C0494h.f735w;
    }
}
