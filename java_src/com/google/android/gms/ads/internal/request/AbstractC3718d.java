package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.request.C3714c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.internal.C7775ty;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aad;
import com.google.android.gms.internal.aae;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.acr;
import com.tencent.tauth.AuthActivity;
@aaa
/* renamed from: com.google.android.gms.ads.internal.request.d */
/* loaded from: classes.dex */
public abstract class AbstractC3718d implements C3714c.AbstractC3716a, abx<Void> {

    /* renamed from: a */
    private final acr<AdRequestInfoParcel> f14622a;

    /* renamed from: b */
    private final C3714c.AbstractC3716a f14623b;

    /* renamed from: c */
    private final Object f14624c = new Object();

    @aaa
    /* renamed from: com.google.android.gms.ads.internal.request.d$a */
    /* loaded from: classes.dex */
    public static final class C3721a extends AbstractC3718d {

        /* renamed from: a */
        private final Context f14628a;

        public C3721a(Context context, acr<AdRequestInfoParcel> acrVar, C3714c.AbstractC3716a abstractC3716a) {
            super(acrVar, abstractC3716a);
            this.f14628a = context;
        }

        @Override // com.google.android.gms.ads.internal.request.AbstractC3718d
        /* renamed from: a */
        public void mo27014a() {
        }

        @Override // com.google.android.gms.ads.internal.request.AbstractC3718d
        /* renamed from: b */
        public AbstractC3729k mo27013b() {
            return aae.m18690a(this.f14628a, new C7775ty(C7788uf.f25795b.m13486c()), aad.m18691a());
        }

        @Override // com.google.android.gms.ads.internal.request.AbstractC3718d, com.google.android.gms.internal.abx
        /* renamed from: e */
        public /* synthetic */ Void mo12820e() {
            return super.mo12820e();
        }
    }

    @aaa
    /* renamed from: com.google.android.gms.ads.internal.request.d$b */
    /* loaded from: classes.dex */
    public static class C3722b extends AbstractC3718d implements AbstractC4600p.AbstractC4602b, AbstractC4600p.AbstractC4603c {

        /* renamed from: a */
        protected C3723e f14629a;

        /* renamed from: b */
        private Context f14630b;

        /* renamed from: c */
        private VersionInfoParcel f14631c;

        /* renamed from: d */
        private acr<AdRequestInfoParcel> f14632d;

        /* renamed from: e */
        private final C3714c.AbstractC3716a f14633e;

        /* renamed from: f */
        private final Object f14634f = new Object();

        /* renamed from: g */
        private boolean f14635g;

        public C3722b(Context context, VersionInfoParcel versionInfoParcel, acr<AdRequestInfoParcel> acrVar, C3714c.AbstractC3716a abstractC3716a) {
            super(acrVar, abstractC3716a);
            Looper mainLooper;
            this.f14630b = context;
            this.f14631c = versionInfoParcel;
            this.f14632d = acrVar;
            this.f14633e = abstractC3716a;
            if (C7788uf.f25723H.m13486c().booleanValue()) {
                this.f14635g = true;
                mainLooper = C3779u.m26874u().m18235a();
            } else {
                mainLooper = context.getMainLooper();
            }
            this.f14629a = new C3723e(context, mainLooper, this, this, this.f14631c.f14735d);
            m27012f();
        }

        @Override // com.google.android.gms.ads.internal.request.AbstractC3718d
        /* renamed from: a */
        public void mo27014a() {
            synchronized (this.f14634f) {
                if (this.f14629a.t() || this.f14629a.u()) {
                    this.f14629a.f();
                }
                Binder.flushPendingCommands();
                if (this.f14635g) {
                    C3779u.m26874u().m18233b();
                    this.f14635g = false;
                }
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4602b
        /* renamed from: a */
        public void mo10593a(int i) {
            abr.a("Disconnected from remote ad request service.");
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4602b
        /* renamed from: a */
        public void mo10591a(Bundle bundle) {
            Void r0 = (Void) mo12820e();
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4603c
        /* renamed from: a */
        public void mo10590a(@NonNull ConnectionResult connectionResult) {
            abr.a("Cannot connect to remote service, fallback to local instance.");
            m27011g().mo12820e();
            Bundle bundle = new Bundle();
            bundle.putString(AuthActivity.ACTION_KEY, "gms_connection_failed_fallback_to_local");
            C3779u.m26890e().m18333b(this.f14630b, this.f14631c.f14733b, "gmob-apps", bundle, true);
        }

        @Override // com.google.android.gms.ads.internal.request.AbstractC3718d
        /* renamed from: b */
        public AbstractC3729k mo27013b() {
            AbstractC3729k abstractC3729k;
            synchronized (this.f14634f) {
                try {
                    abstractC3729k = this.f14629a.m27009g_();
                } catch (DeadObjectException | IllegalStateException e) {
                    abstractC3729k = null;
                }
            }
            return abstractC3729k;
        }

        @Override // com.google.android.gms.ads.internal.request.AbstractC3718d, com.google.android.gms.internal.abx
        /* renamed from: e */
        public /* synthetic */ Void mo12820e() {
            return super.mo12820e();
        }

        /* renamed from: f */
        protected void m27012f() {
            this.f14629a.A();
        }

        /* renamed from: g */
        abx m27011g() {
            return new C3721a(this.f14630b, this.f14632d, this.f14633e);
        }
    }

    public AbstractC3718d(acr<AdRequestInfoParcel> acrVar, C3714c.AbstractC3716a abstractC3716a) {
        this.f14622a = acrVar;
        this.f14623b = abstractC3716a;
    }

    /* renamed from: a */
    public abstract void mo27014a();

    @Override // com.google.android.gms.ads.internal.request.C3714c.AbstractC3716a
    /* renamed from: a */
    public void mo27018a(AdResponseParcel adResponseParcel) {
        synchronized (this.f14624c) {
            this.f14623b.mo27018a(adResponseParcel);
            mo27014a();
        }
    }

    /* renamed from: a */
    boolean m27017a(AbstractC3729k abstractC3729k, AdRequestInfoParcel adRequestInfoParcel) {
        try {
            abstractC3729k.mo18686a(adRequestInfoParcel, new BinderC3725g(this));
            return true;
        } catch (RemoteException e) {
            abr.d("Could not fetch ad response from ad request service.", e);
            C3779u.m26886i().m18451a(e, "AdRequestClientTask.getAdResponseFromService");
            this.f14623b.mo27018a(new AdResponseParcel(0));
            return false;
        } catch (NullPointerException e2) {
            abr.d("Could not fetch ad response from ad request service due to an Exception.", e2);
            C3779u.m26886i().m18451a(e2, "AdRequestClientTask.getAdResponseFromService");
            this.f14623b.mo27018a(new AdResponseParcel(0));
            return false;
        } catch (SecurityException e3) {
            abr.d("Could not fetch ad response from ad request service due to an Exception.", e3);
            C3779u.m26886i().m18451a(e3, "AdRequestClientTask.getAdResponseFromService");
            this.f14623b.mo27018a(new AdResponseParcel(0));
            return false;
        } catch (Throwable th) {
            abr.d("Could not fetch ad response from ad request service due to an Exception.", th);
            C3779u.m26886i().m18451a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f14623b.mo27018a(new AdResponseParcel(0));
            return false;
        }
    }

    /* renamed from: b */
    public abstract AbstractC3729k mo27013b();

    @Override // com.google.android.gms.internal.abx
    /* renamed from: c */
    public Void mo12820e() {
        final AbstractC3729k mo27013b = mo27013b();
        if (mo27013b == null) {
            this.f14623b.mo27018a(new AdResponseParcel(0));
            mo27014a();
        } else {
            this.f14622a.mo13122a(new acr.AbstractC6193c<AdRequestInfoParcel>() { // from class: com.google.android.gms.ads.internal.request.d.1
                @Override // com.google.android.gms.internal.acr.AbstractC6193c
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo12764a(AdRequestInfoParcel adRequestInfoParcel) {
                    if (!AbstractC3718d.this.m27017a(mo27013b, adRequestInfoParcel)) {
                        AbstractC3718d.this.mo27014a();
                    }
                }
            }, new acr.AbstractC6191a() { // from class: com.google.android.gms.ads.internal.request.d.2
                @Override // com.google.android.gms.internal.acr.AbstractC6191a
                /* renamed from: a */
                public void mo12763a() {
                    AbstractC3718d.this.mo27014a();
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.abx
    /* renamed from: d */
    public void mo12794d() {
        mo27014a();
    }
}
