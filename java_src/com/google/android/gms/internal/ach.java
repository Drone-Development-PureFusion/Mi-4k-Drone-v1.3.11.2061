package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C3779u;
@aaa
/* loaded from: classes.dex */
public class ach {

    /* renamed from: a */
    private long f21126a;

    /* renamed from: b */
    private long f21127b = Long.MIN_VALUE;

    /* renamed from: c */
    private Object f21128c = new Object();

    public ach(long j) {
        this.f21126a = j;
    }

    /* renamed from: a */
    public boolean m18222a() {
        boolean z;
        synchronized (this.f21128c) {
            long mo16432b = C3779u.m26884k().mo16432b();
            if (this.f21127b + this.f21126a > mo16432b) {
                z = false;
            } else {
                this.f21127b = mo16432b;
                z = true;
            }
        }
        return z;
    }
}
