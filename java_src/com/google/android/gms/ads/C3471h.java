package com.google.android.gms.ads;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AbstractC3553c;
import com.google.android.gms.ads.internal.client.BinderC3578q;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.h */
/* loaded from: classes.dex */
public final class C3471h {

    /* renamed from: a */
    private final Object f13783a = new Object();
    @Nullable

    /* renamed from: b */
    private AbstractC3553c f13784b;
    @Nullable

    /* renamed from: c */
    private AbstractC3472a f13785c;

    /* renamed from: com.google.android.gms.ads.h$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC3472a {
        /* renamed from: a */
        public void m27695a() {
        }
    }

    /* renamed from: a */
    public AbstractC3553c m27701a() {
        AbstractC3553c abstractC3553c;
        synchronized (this.f13783a) {
            abstractC3553c = this.f13784b;
        }
        return abstractC3553c;
    }

    /* renamed from: a */
    public void m27700a(AbstractC3472a abstractC3472a) {
        C4588d.m23626a(abstractC3472a, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f13783a) {
            this.f13785c = abstractC3472a;
            if (this.f13784b == null) {
                return;
            }
            try {
                this.f13784b.mo18064a(new BinderC3578q(abstractC3472a));
            } catch (RemoteException e) {
                C3784b.m26843b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    /* renamed from: a */
    public void m27699a(AbstractC3553c abstractC3553c) {
        synchronized (this.f13783a) {
            this.f13784b = abstractC3553c;
            if (this.f13785c != null) {
                m27700a(this.f13785c);
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public AbstractC3472a m27698b() {
        AbstractC3472a abstractC3472a;
        synchronized (this.f13783a) {
            abstractC3472a = this.f13785c;
        }
        return abstractC3472a;
    }

    /* renamed from: c */
    public boolean m27697c() {
        boolean z;
        synchronized (this.f13783a) {
            z = this.f13784b != null;
        }
        return z;
    }

    /* renamed from: d */
    public float m27696d() {
        float f = 0.0f;
        synchronized (this.f13783a) {
            if (this.f13784b != null) {
                try {
                    f = this.f13784b.mo18049g();
                } catch (RemoteException e) {
                    C3784b.m26843b("Unable to call getAspectRatio on video controller.", e);
                }
            }
        }
        return f;
    }
}
