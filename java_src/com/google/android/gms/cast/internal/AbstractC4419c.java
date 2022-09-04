package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
/* renamed from: com.google.android.gms.cast.internal.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4419c extends AbstractC4422d {

    /* renamed from: a */
    protected final Handler f16603a;

    /* renamed from: b */
    protected final AbstractC4682e f16604b;

    /* renamed from: c */
    protected final long f16605c;

    /* renamed from: d */
    protected final Runnable f16606d;

    /* renamed from: e */
    protected boolean f16607e;

    /* renamed from: com.google.android.gms.cast.internal.c$a */
    /* loaded from: classes2.dex */
    private class RunnableC4421a implements Runnable {
        private RunnableC4421a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4419c.this.f16607e = false;
            AbstractC4419c.this.m24267a(AbstractC4419c.this.mo17667a(AbstractC4419c.this.f16604b.mo16432b()));
        }
    }

    public AbstractC4419c(String str, AbstractC4682e abstractC4682e, String str2, String str3) {
        this(str, abstractC4682e, str2, str3, 1000L);
    }

    public AbstractC4419c(String str, AbstractC4682e abstractC4682e, String str2, String str3, long j) {
        super(str, str2, str3);
        this.f16603a = new Handler(Looper.getMainLooper());
        this.f16604b = abstractC4682e;
        this.f16606d = new RunnableC4421a();
        this.f16605c = j;
        m24267a(false);
    }

    public AbstractC4419c(String str, String str2, String str3) {
        this(str, C4685h.m23138d(), str2, str3);
    }

    @Override // com.google.android.gms.cast.internal.AbstractC4422d
    /* renamed from: a */
    public void mo24152a() {
        m24267a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m24267a(boolean z) {
        if (this.f16607e != z) {
            this.f16607e = z;
            if (z) {
                this.f16603a.postDelayed(this.f16606d, this.f16605c);
            } else {
                this.f16603a.removeCallbacks(this.f16606d);
            }
        }
    }

    /* renamed from: a */
    protected abstract boolean mo17667a(long j);
}
