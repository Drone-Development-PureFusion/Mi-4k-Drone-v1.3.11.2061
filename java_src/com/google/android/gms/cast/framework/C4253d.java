package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.C4201a;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.AbstractC4356s;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.cast.internal.C4441n;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4503n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.afc;
import com.google.android.gms.internal.afe;
import com.google.android.gms.internal.afq;
import com.google.firebase.p253b.C9755a;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.cast.framework.d */
/* loaded from: classes.dex */
public class C4253d extends AbstractC4279j {

    /* renamed from: a */
    private static final C4440m f16152a = new C4440m("CastSession");

    /* renamed from: b */
    private final Context f16153b;

    /* renamed from: c */
    private final Set<C4201a.C4215d> f16154c = new HashSet();

    /* renamed from: d */
    private final AbstractC4362u f16155d;

    /* renamed from: e */
    private final C4201a.AbstractC4204b f16156e;

    /* renamed from: f */
    private final afe f16157f;

    /* renamed from: g */
    private final afq f16158g;

    /* renamed from: h */
    private AbstractC4489g f16159h;

    /* renamed from: i */
    private C4298c f16160i;

    /* renamed from: j */
    private CastDevice f16161j;

    /* renamed from: k */
    private C4201a.AbstractC4203a f16162k;

    /* renamed from: com.google.android.gms.cast.framework.d$a */
    /* loaded from: classes2.dex */
    private class C4255a implements AbstractC4503n<C4201a.AbstractC4203a> {

        /* renamed from: a */
        String f16163a;

        C4255a(String str) {
            this.f16163a = str;
        }

        @Override // com.google.android.gms.common.api.AbstractC4503n
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7161a(@NonNull C4201a.AbstractC4203a abstractC4203a) {
            C4253d.this.f16162k = abstractC4203a;
            try {
                if (!abstractC4203a.a().m24018f()) {
                    C4253d.f16152a.m24160b("%s() -> failure result", this.f16163a);
                    C4253d.this.f16155d.mo24392b(abstractC4203a.a().m24015i());
                    return;
                }
                C4253d.f16152a.m24160b("%s() -> success result", this.f16163a);
                C4253d.this.f16160i = new C4298c(new C4441n(null), C4253d.this.f16156e);
                try {
                    C4253d.this.f16160i.m24558a(C4253d.this.f16159h);
                    C4253d.this.f16160i.m24537d();
                    C4253d.this.f16158g.m17747a(C4253d.this.f16160i, C4253d.this.m24843b());
                } catch (IOException e) {
                    C4253d.f16152a.m24156c(e, "Exception when setting GoogleApiClient.", new Object[0]);
                    C4253d.this.f16160i = null;
                }
                C4253d.this.f16155d.mo24395a(abstractC4203a.mo24217b(), abstractC4203a.mo24216c(), abstractC4203a.mo24215d(), abstractC4203a.mo24214e());
            } catch (RemoteException e2) {
                C4253d.f16152a.m24163a(e2, "Unable to call %s on %s.", "methods", AbstractC4362u.class.getSimpleName());
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.d$b */
    /* loaded from: classes2.dex */
    private class BinderC4256b extends AbstractC4356s.AbstractBinderC4357a {
        private BinderC4256b() {
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4356s
        /* renamed from: a */
        public int mo24414a() {
            return 9683208;
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4356s
        /* renamed from: a */
        public void mo24413a(int i) {
            C4253d.this.m24833e(i);
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4356s
        /* renamed from: a */
        public void mo24412a(String str) {
            C4253d.this.f16156e.mo24943c(C4253d.this.f16159h, str);
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4356s
        /* renamed from: a */
        public void mo24411a(String str, LaunchOptions launchOptions) {
            C4253d.this.f16156e.mo24953a(C4253d.this.f16159h, str, launchOptions).mo13673a(new C4255a("launchApplication"));
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4356s
        /* renamed from: a */
        public void mo24410a(String str, String str2) {
            C4253d.this.f16156e.mo24945b(C4253d.this.f16159h, str, str2).mo13673a(new C4255a("joinApplication"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.cast.framework.d$c */
    /* loaded from: classes2.dex */
    public class C4257c extends C4201a.C4215d {
        private C4257c() {
        }

        @Override // com.google.android.gms.cast.C4201a.C4215d
        /* renamed from: a */
        public void mo24823a() {
            for (C4201a.C4215d c4215d : new HashSet(C4253d.this.f16154c)) {
                c4215d.mo24823a();
            }
        }

        @Override // com.google.android.gms.cast.C4201a.C4215d
        /* renamed from: a */
        public void mo24822a(int i) {
            C4253d.this.m24833e(i);
            C4253d.this.b(i);
            for (C4201a.C4215d c4215d : new HashSet(C4253d.this.f16154c)) {
                c4215d.mo24822a(i);
            }
        }

        @Override // com.google.android.gms.cast.C4201a.C4215d
        /* renamed from: a */
        public void mo24821a(ApplicationMetadata applicationMetadata) {
            for (C4201a.C4215d c4215d : new HashSet(C4253d.this.f16154c)) {
                c4215d.mo24821a(applicationMetadata);
            }
        }

        @Override // com.google.android.gms.cast.C4201a.C4215d
        /* renamed from: b */
        public void mo17693b() {
            for (C4201a.C4215d c4215d : new HashSet(C4253d.this.f16154c)) {
                c4215d.mo17693b();
            }
        }

        @Override // com.google.android.gms.cast.C4201a.C4215d
        /* renamed from: b */
        public void mo24820b(int i) {
            for (C4201a.C4215d c4215d : new HashSet(C4253d.this.f16154c)) {
                c4215d.mo24820b(i);
            }
        }

        @Override // com.google.android.gms.cast.C4201a.C4215d
        /* renamed from: c */
        public void mo24819c(int i) {
            for (C4201a.C4215d c4215d : new HashSet(C4253d.this.f16154c)) {
                c4215d.mo24819c(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.cast.framework.d$d */
    /* loaded from: classes2.dex */
    public class C4258d implements AbstractC4489g.AbstractC4491b, AbstractC4489g.AbstractC4492c {
        private C4258d() {
        }

        @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
        /* renamed from: a */
        public void mo17285a(int i) {
            try {
                C4253d.this.f16155d.mo24397a(i);
            } catch (RemoteException e) {
                C4253d.f16152a.m24163a(e, "Unable to call %s on %s.", "onConnectionSuspended", AbstractC4362u.class.getSimpleName());
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
        /* renamed from: a */
        public void mo17281a(Bundle bundle) {
            try {
                C4253d.this.f16155d.mo24396a(bundle);
            } catch (RemoteException e) {
                C4253d.f16152a.m24163a(e, "Unable to call %s on %s.", "onConnected", AbstractC4362u.class.getSimpleName());
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4492c
        /* renamed from: a */
        public void mo17280a(@NonNull ConnectionResult connectionResult) {
            try {
                C4253d.this.f16155d.mo24394a(connectionResult);
            } catch (RemoteException e) {
                C4253d.f16152a.m24163a(e, "Unable to call %s on %s.", "onConnectionFailed", AbstractC4362u.class.getSimpleName());
            }
        }
    }

    public C4253d(Context context, String str, String str2, CastOptions castOptions, C4201a.AbstractC4204b abstractC4204b, afe afeVar, afq afqVar) {
        super(context, str, str2);
        this.f16153b = context.getApplicationContext();
        this.f16156e = abstractC4204b;
        this.f16157f = afeVar;
        this.f16158g = afqVar;
        this.f16155d = afc.m17811a(context, castOptions, u(), new BinderC4256b());
    }

    /* renamed from: c */
    private void m24838c(Bundle bundle) {
        this.f16161j = CastDevice.m25243b(bundle);
        if (this.f16161j == null) {
            if (s()) {
                c(8);
                return;
            } else {
                a(8);
                return;
            }
        }
        if (this.f16159h != null) {
            this.f16159h.mo17356g();
            this.f16159h = null;
        }
        f16152a.m24160b("Acquiring a connection to Google Play Services for %s", this.f16161j);
        C4258d c4258d = new C4258d();
        this.f16159h = this.f16157f.m17803a(this.f16153b, this.f16161j, new C4257c(), c4258d, c4258d);
        this.f16159h.mo17358e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m24833e(int i) {
        this.f16158g.m17752a(i);
        if (this.f16159h != null) {
            this.f16159h.mo17356g();
            this.f16159h = null;
        }
        this.f16161j = null;
        if (this.f16160i != null) {
            try {
                this.f16160i.m24558a((AbstractC4489g) null);
            } catch (IOException e) {
                f16152a.m24156c(e, "Exception when setting GoogleApiClient.", new Object[0]);
            }
            this.f16160i = null;
        }
        this.f16162k = null;
    }

    /* renamed from: a */
    public C4298c m24853a() {
        return this.f16160i;
    }

    /* renamed from: a */
    public AbstractC4494i<Status> m24844a(String str, String str2) {
        if (this.f16159h != null) {
            return this.f16156e.mo24951a(this.f16159h, str, str2);
        }
        return null;
    }

    /* renamed from: a */
    public void m24852a(double d) {
        if (this.f16159h != null) {
            this.f16156e.mo24955a(this.f16159h, d);
        }
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4279j
    /* renamed from: a */
    protected void mo24744a(Bundle bundle) {
        m24838c(bundle);
    }

    /* renamed from: a */
    public void m24851a(C4201a.C4215d c4215d) {
        if (c4215d != null) {
            this.f16154c.add(c4215d);
        }
    }

    /* renamed from: a */
    public void m24846a(String str) {
        if (this.f16159h != null) {
            this.f16156e.mo24941d(this.f16159h, str);
        }
    }

    /* renamed from: a */
    public void m24845a(String str, C4201a.AbstractC4216e abstractC4216e) {
        if (this.f16159h != null) {
            this.f16156e.mo24952a(this.f16159h, str, abstractC4216e);
        }
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4279j
    /* renamed from: a */
    protected void mo24743a(boolean z) {
        try {
            this.f16155d.mo24393a(z, 0);
        } catch (RemoteException e) {
            f16152a.m24163a(e, "Unable to call %s on %s.", "disconnectFromDevice", AbstractC4362u.class.getSimpleName());
        }
        b(0);
    }

    /* renamed from: b */
    public CastDevice m24843b() {
        return this.f16161j;
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4279j
    /* renamed from: b */
    protected void mo24741b(Bundle bundle) {
        m24838c(bundle);
    }

    /* renamed from: b */
    public void m24842b(C4201a.C4215d c4215d) {
        if (c4215d != null) {
            this.f16154c.remove(c4215d);
        }
    }

    /* renamed from: b */
    public void m24840b(boolean z) {
        if (this.f16159h != null) {
            this.f16156e.mo24948a(this.f16159h, z);
        }
    }

    /* renamed from: c */
    public void m24839c() {
        if (this.f16159h != null) {
            this.f16156e.mo24956a(this.f16159h);
        }
    }

    /* renamed from: d */
    public int m24836d() {
        if (this.f16159h != null) {
            return this.f16156e.mo24938g(this.f16159h);
        }
        return -1;
    }

    /* renamed from: e */
    public int m24834e() {
        if (this.f16159h != null) {
            return this.f16156e.mo24937h(this.f16159h);
        }
        return -1;
    }

    /* renamed from: f */
    public ApplicationMetadata m24831f() {
        if (this.f16159h != null) {
            return this.f16156e.mo24936i(this.f16159h);
        }
        return null;
    }

    /* renamed from: g */
    public String m24829g() {
        if (this.f16159h != null) {
            return this.f16156e.mo24935j(this.f16159h);
        }
        return null;
    }

    /* renamed from: h */
    public double m24828h() {
        return this.f16159h != null ? this.f16156e.mo24940e(this.f16159h) : C9755a.f30449c;
    }

    /* renamed from: i */
    public boolean m24827i() {
        if (this.f16159h != null) {
            return this.f16156e.mo24939f(this.f16159h);
        }
        return false;
    }

    /* renamed from: j */
    public C4201a.AbstractC4203a m24826j() {
        return this.f16162k;
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4279j
    /* renamed from: k */
    public long mo24736k() {
        if (this.f16160i == null) {
            return 0L;
        }
        return this.f16160i.m24531f() - this.f16160i.m24534e();
    }
}
