package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.C3762i;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.p226b.AbstractC3441b;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.BinderC8004xp;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.h */
/* loaded from: classes.dex */
public class C3564h {

    /* renamed from: a */
    private static C3564h f14025a;

    /* renamed from: b */
    private static final Object f14026b = new Object();

    /* renamed from: c */
    private AbstractC3547ap f14027c;

    /* renamed from: d */
    private AbstractC3441b f14028d;

    private C3564h() {
    }

    /* renamed from: a */
    public static C3564h m27448a() {
        C3564h c3564h;
        synchronized (f14026b) {
            if (f14025a == null) {
                f14025a = new C3564h();
            }
            c3564h = f14025a;
        }
        return c3564h;
    }

    /* renamed from: a */
    public AbstractC3441b m27446a(Context context) {
        AbstractC3441b abstractC3441b;
        synchronized (f14026b) {
            if (this.f14028d != null) {
                abstractC3441b = this.f14028d;
            } else {
                this.f14028d = new C3762i(context, C3514ac.m27584b().m27624a(context, new BinderC8004xp()));
                abstractC3441b = this.f14028d;
            }
        }
        return abstractC3441b;
    }

    /* renamed from: a */
    public void m27447a(float f) {
        boolean z = true;
        C4588d.m23618b(0.0f <= f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        if (this.f14027c == null) {
            z = false;
        }
        C4588d.m23622a(z, "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.f14027c.mo27270a(f);
        } catch (RemoteException e) {
            C3784b.m26843b("Unable to set app volume.", e);
        }
    }

    /* renamed from: a */
    public void m27445a(Context context, String str) {
        C4588d.m23622a(this.f14027c != null, "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.f14027c.mo27268a(BinderC4173f.m25293a(context), str);
        } catch (RemoteException e) {
            C3784b.m26843b("Unable to open debug menu.", e);
        }
    }

    /* renamed from: a */
    public void m27444a(Context context, String str, C3565i c3565i) {
        synchronized (f14026b) {
            if (this.f14027c != null) {
                return;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            try {
                this.f14027c = C3514ac.m27584b().m27628a(context);
                this.f14027c.mo27271a();
                if (str != null) {
                    this.f14027c.mo27267a(str);
                }
            } catch (RemoteException e) {
                C3784b.m26839d("Fail to initialize or set applicationCode on mobile ads setting manager", e);
            }
        }
    }

    /* renamed from: a */
    public void m27443a(boolean z) {
        C4588d.m23622a(this.f14027c != null, "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.f14027c.mo27266a(z);
        } catch (RemoteException e) {
            C3784b.m26843b("Unable to set app mute state.", e);
        }
    }
}
