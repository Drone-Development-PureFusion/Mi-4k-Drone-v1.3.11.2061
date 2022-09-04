package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.C4656l;
import java.util.concurrent.Callable;
@aaa
/* renamed from: com.google.android.gms.internal.ue */
/* loaded from: classes.dex */
public class C7786ue {

    /* renamed from: a */
    private final Object f25711a = new Object();

    /* renamed from: b */
    private boolean f25712b = false;
    @Nullable

    /* renamed from: c */
    private SharedPreferences f25713c = null;

    /* renamed from: a */
    public <T> T m13473a(final AbstractC7779ub<T> abstractC7779ub) {
        synchronized (this.f25711a) {
            if (!this.f25712b) {
                return abstractC7779ub.m13488b();
            }
            return (T) acj.m18219a(new Callable<T>() { // from class: com.google.android.gms.internal.ue.1
                /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
                @Override // java.util.concurrent.Callable
                public T call() {
                    return abstractC7779ub.mo13482a(C7786ue.this.f25713c);
                }
            });
        }
    }

    /* renamed from: a */
    public void m13474a(Context context) {
        synchronized (this.f25711a) {
            if (this.f25712b) {
                return;
            }
            Context m23329l = C4656l.m23329l(context);
            if (m23329l == null) {
                return;
            }
            this.f25713c = C3779u.m26880o().m13475a(m23329l);
            this.f25712b = true;
        }
    }
}
