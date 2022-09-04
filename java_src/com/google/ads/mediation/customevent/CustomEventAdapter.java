package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.C3392a;
import com.google.ads.C3395b;
import com.google.ads.mediation.AbstractC3415e;
import com.google.ads.mediation.AbstractC3416f;
import com.google.ads.mediation.AbstractC3417g;
import com.google.ads.mediation.AbstractC3418h;
import com.google.ads.mediation.C3404c;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.mediation.customevent.C3801d;
import com.google.android.gms.common.annotation.KeepName;
@KeepName
/* loaded from: classes2.dex */
public final class CustomEventAdapter implements AbstractC3415e<C3801d, C3413g>, AbstractC3417g<C3801d, C3413g> {

    /* renamed from: a */
    AbstractC3408b f13665a;

    /* renamed from: b */
    AbstractC3410d f13666b;

    /* renamed from: c */
    private View f13667c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    /* loaded from: classes2.dex */
    public static final class C3405a implements AbstractC3409c {

        /* renamed from: a */
        private final CustomEventAdapter f13668a;

        /* renamed from: b */
        private final AbstractC3416f f13669b;

        public C3405a(CustomEventAdapter customEventAdapter, AbstractC3416f abstractC3416f) {
            this.f13668a = customEventAdapter;
            this.f13669b = abstractC3416f;
        }

        @Override // com.google.ads.mediation.customevent.AbstractC3412f
        /* renamed from: a */
        public void mo27902a() {
            C3784b.m26846a("Custom event adapter called onFailedToReceiveAd.");
            this.f13669b.mo12954a(this.f13668a, C3392a.EnumC3393a.NO_FILL);
        }

        @Override // com.google.ads.mediation.customevent.AbstractC3409c
        /* renamed from: a */
        public void mo27907a(View view) {
            C3784b.m26846a("Custom event adapter called onReceivedAd.");
            this.f13668a.m27915a(view);
            this.f13669b.mo12955a(this.f13668a);
        }

        @Override // com.google.ads.mediation.customevent.AbstractC3409c
        /* renamed from: b */
        public void mo27906b() {
            C3784b.m26846a("Custom event adapter called onFailedToReceiveAd.");
            this.f13669b.mo12944e(this.f13668a);
        }

        @Override // com.google.ads.mediation.customevent.AbstractC3412f
        /* renamed from: c */
        public void mo27901c() {
            C3784b.m26846a("Custom event adapter called onFailedToReceiveAd.");
            this.f13669b.mo12950b(this.f13668a);
        }

        @Override // com.google.ads.mediation.customevent.AbstractC3412f
        /* renamed from: d */
        public void mo27900d() {
            C3784b.m26846a("Custom event adapter called onFailedToReceiveAd.");
            this.f13669b.mo12948c(this.f13668a);
        }

        @Override // com.google.ads.mediation.customevent.AbstractC3412f
        /* renamed from: e */
        public void mo27899e() {
            C3784b.m26846a("Custom event adapter called onFailedToReceiveAd.");
            this.f13669b.mo12946d(this.f13668a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    /* loaded from: classes2.dex */
    public class C3406b implements AbstractC3411e {

        /* renamed from: b */
        private final CustomEventAdapter f13671b;

        /* renamed from: c */
        private final AbstractC3418h f13672c;

        public C3406b(CustomEventAdapter customEventAdapter, AbstractC3418h abstractC3418h) {
            this.f13671b = customEventAdapter;
            this.f13672c = abstractC3418h;
        }

        @Override // com.google.ads.mediation.customevent.AbstractC3412f
        /* renamed from: a */
        public void mo27902a() {
            C3784b.m26846a("Custom event adapter called onFailedToReceiveAd.");
            this.f13672c.mo12952a(this.f13671b, C3392a.EnumC3393a.NO_FILL);
        }

        @Override // com.google.ads.mediation.customevent.AbstractC3411e
        /* renamed from: b */
        public void mo27903b() {
            C3784b.m26846a("Custom event adapter called onReceivedAd.");
            this.f13672c.mo12953a(CustomEventAdapter.this);
        }

        @Override // com.google.ads.mediation.customevent.AbstractC3412f
        /* renamed from: c */
        public void mo27901c() {
            C3784b.m26846a("Custom event adapter called onPresentScreen.");
            this.f13672c.mo12949b(this.f13671b);
        }

        @Override // com.google.ads.mediation.customevent.AbstractC3412f
        /* renamed from: d */
        public void mo27900d() {
            C3784b.m26846a("Custom event adapter called onDismissScreen.");
            this.f13672c.mo12947c(this.f13671b);
        }

        @Override // com.google.ads.mediation.customevent.AbstractC3412f
        /* renamed from: e */
        public void mo27899e() {
            C3784b.m26846a("Custom event adapter called onLeaveApplication.");
            this.f13672c.mo12945d(this.f13671b);
        }
    }

    /* renamed from: a */
    private static <T> T m27910a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String valueOf = String.valueOf(th.getMessage());
            C3784b.m26840d(new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(valueOf).length()).append("Could not instantiate custom event adapter: ").append(str).append(". ").append(valueOf).toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m27915a(View view) {
        this.f13667c = view;
    }

    /* renamed from: a */
    C3406b m27912a(AbstractC3418h abstractC3418h) {
        return new C3406b(this, abstractC3418h);
    }

    @Override // com.google.ads.mediation.AbstractC3414d
    /* renamed from: a */
    public void mo27898a() {
        if (this.f13665a != null) {
            this.f13665a.a();
        }
        if (this.f13666b != null) {
            this.f13666b.a();
        }
    }

    @Override // com.google.ads.mediation.AbstractC3415e
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo27895a(AbstractC3416f abstractC3416f, Activity activity, C3413g c3413g, C3395b c3395b, C3404c c3404c, C3801d c3801d) {
        this.f13665a = (AbstractC3408b) m27910a(c3413g.f13674b);
        if (this.f13665a == null) {
            abstractC3416f.mo12954a(this, C3392a.EnumC3393a.INTERNAL_ERROR);
        } else {
            this.f13665a.m27908a(new C3405a(this, abstractC3416f), activity, c3413g.f13673a, c3413g.f13675c, c3395b, c3404c, c3801d == null ? null : c3801d.m26806a(c3413g.f13673a));
        }
    }

    @Override // com.google.ads.mediation.AbstractC3417g
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo27893a(AbstractC3418h abstractC3418h, Activity activity, C3413g c3413g, C3404c c3404c, C3801d c3801d) {
        this.f13666b = (AbstractC3410d) m27910a(c3413g.f13674b);
        if (this.f13666b == null) {
            abstractC3418h.mo12952a(this, C3392a.EnumC3393a.INTERNAL_ERROR);
        } else {
            this.f13666b.m27905a(m27912a(abstractC3418h), activity, c3413g.f13673a, c3413g.f13675c, c3404c, c3801d == null ? null : c3801d.m26806a(c3413g.f13673a));
        }
    }

    @Override // com.google.ads.mediation.AbstractC3414d
    /* renamed from: b */
    public Class<C3801d> mo27897b() {
        return C3801d.class;
    }

    @Override // com.google.ads.mediation.AbstractC3414d
    /* renamed from: c */
    public Class<C3413g> mo27896c() {
        return C3413g.class;
    }

    @Override // com.google.ads.mediation.AbstractC3415e
    /* renamed from: d */
    public View mo27894d() {
        return this.f13667c;
    }

    @Override // com.google.ads.mediation.AbstractC3417g
    /* renamed from: e */
    public void mo27892e() {
        this.f13666b.m27904b();
    }
}
