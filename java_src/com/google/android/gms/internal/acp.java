package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.C3780a;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
@aaa
/* loaded from: classes.dex */
public class acp {

    /* renamed from: a */
    private final Object f21152a = new Object();

    /* renamed from: b */
    private final List<Runnable> f21153b = new ArrayList();

    /* renamed from: c */
    private final List<Runnable> f21154c = new ArrayList();

    /* renamed from: d */
    private boolean f21155d = false;

    /* renamed from: c */
    private void m18199c(Runnable runnable) {
        abu.m18391a(runnable);
    }

    /* renamed from: d */
    private void m18198d(Runnable runnable) {
        C3780a.f14737a.post(runnable);
    }

    /* renamed from: a */
    public void m18202a() {
        synchronized (this.f21152a) {
            if (this.f21155d) {
                return;
            }
            for (Runnable runnable : this.f21153b) {
                m18199c(runnable);
            }
            for (Runnable runnable2 : this.f21154c) {
                m18198d(runnable2);
            }
            this.f21153b.clear();
            this.f21154c.clear();
            this.f21155d = true;
        }
    }

    /* renamed from: a */
    public void m18201a(Runnable runnable) {
        synchronized (this.f21152a) {
            if (this.f21155d) {
                m18199c(runnable);
            } else {
                this.f21153b.add(runnable);
            }
        }
    }

    /* renamed from: b */
    public void m18200b(Runnable runnable) {
        synchronized (this.f21152a) {
            if (this.f21155d) {
                m18198d(runnable);
            } else {
                this.f21154c.add(runnable);
            }
        }
    }
}
