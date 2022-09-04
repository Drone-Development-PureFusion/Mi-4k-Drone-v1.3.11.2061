package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.AbstractC3849e;
/* renamed from: com.google.android.gms.analytics.internal.ai */
/* loaded from: classes2.dex */
class C3875ai implements AbstractC3849e {

    /* renamed from: a */
    private int f15009a = 2;

    /* renamed from: b */
    private boolean f15010b;

    @Override // com.google.android.gms.analytics.AbstractC3849e
    /* renamed from: a */
    public int mo9150a() {
        return this.f15009a;
    }

    @Override // com.google.android.gms.analytics.AbstractC3849e
    /* renamed from: a */
    public void mo9149a(int i) {
        this.f15009a = i;
        if (!this.f15010b) {
            String m26339a = C3882ao.f15038c.m26339a();
            Log.i(C3882ao.f15038c.m26339a(), new StringBuilder(String.valueOf(m26339a).length() + 91).append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append(m26339a).append(" DEBUG").toString());
            this.f15010b = true;
        }
    }

    @Override // com.google.android.gms.analytics.AbstractC3849e
    /* renamed from: a */
    public void mo9148a(Exception exc) {
    }

    @Override // com.google.android.gms.analytics.AbstractC3849e
    /* renamed from: a */
    public void mo9147a(String str) {
    }

    @Override // com.google.android.gms.analytics.AbstractC3849e
    /* renamed from: b */
    public void mo9145b(String str) {
    }

    @Override // com.google.android.gms.analytics.AbstractC3849e
    /* renamed from: c */
    public void mo9144c(String str) {
    }

    @Override // com.google.android.gms.analytics.AbstractC3849e
    /* renamed from: d */
    public void mo9143d(String str) {
    }
}
