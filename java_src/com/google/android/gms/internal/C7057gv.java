package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
/* renamed from: com.google.android.gms.internal.gv */
/* loaded from: classes2.dex */
public class C7057gv implements AbstractC7153ig {

    /* renamed from: a */
    private final Handler f23821a = new Handler(Looper.getMainLooper());

    @Override // com.google.android.gms.internal.AbstractC7153ig
    /* renamed from: a */
    public void mo15157a() {
    }

    @Override // com.google.android.gms.internal.AbstractC7153ig
    /* renamed from: a */
    public void mo15156a(Runnable runnable) {
        this.f23821a.post(runnable);
    }

    @Override // com.google.android.gms.internal.AbstractC7153ig
    /* renamed from: b */
    public void mo15155b() {
    }
}
