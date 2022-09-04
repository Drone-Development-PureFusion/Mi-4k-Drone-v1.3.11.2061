package com.fimi.soul.module.droneTrack;

import java.io.Serializable;
/* renamed from: com.fimi.soul.module.droneTrack.b */
/* loaded from: classes.dex */
public class C2681b implements Serializable {

    /* renamed from: a */
    private int f9146a;

    /* renamed from: b */
    private int f9147b;

    /* renamed from: a */
    public int m30648a() {
        return this.f9146a;
    }

    /* renamed from: a */
    public void m30647a(int i) {
        this.f9146a = i;
    }

    /* renamed from: a */
    public void m30646a(int i, int i2) {
        this.f9146a = i;
        this.f9147b = i2;
    }

    /* renamed from: b */
    public int m30645b() {
        return this.f9147b;
    }

    /* renamed from: b */
    public void m30644b(int i) {
        this.f9147b = i;
    }

    public String toString() {
        return this.f9146a + ",           " + this.f9147b + ",           ";
    }
}
