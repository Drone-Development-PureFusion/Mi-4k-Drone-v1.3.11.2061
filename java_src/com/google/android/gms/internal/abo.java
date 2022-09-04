package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.C3779u;
@aaa
/* loaded from: classes.dex */
public class abo {

    /* renamed from: a */
    private final Object f20989a;

    /* renamed from: b */
    private int f20990b;

    /* renamed from: c */
    private int f20991c;

    /* renamed from: d */
    private final abl f20992d;

    /* renamed from: e */
    private final String f20993e;

    abo(abl ablVar, String str) {
        this.f20989a = new Object();
        this.f20992d = ablVar;
        this.f20993e = str;
    }

    public abo(String str) {
        this(C3779u.m26886i(), str);
    }

    /* renamed from: a */
    public Bundle m18418a() {
        Bundle bundle;
        synchronized (this.f20989a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f20990b);
            bundle.putInt("pmnll", this.f20991c);
        }
        return bundle;
    }

    /* renamed from: a */
    public void m18417a(int i, int i2) {
        synchronized (this.f20989a) {
            this.f20990b = i;
            this.f20991c = i2;
            this.f20992d.m18453a(this.f20993e, this);
        }
    }
}
