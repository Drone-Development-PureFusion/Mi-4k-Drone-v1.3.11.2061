package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AbstractC3432a;
import com.google.android.gms.ads.C3446d;
import com.google.android.gms.ads.C3454e;
import com.google.android.gms.ads.C3471h;
import com.google.android.gms.ads.C3473i;
import com.google.android.gms.ads.doubleclick.AbstractC3447a;
import com.google.android.gms.ads.doubleclick.AbstractC3449c;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.purchase.AbstractC3819b;
import com.google.android.gms.ads.purchase.AbstractC3821d;
import com.google.android.gms.internal.BinderC7810us;
import com.google.android.gms.internal.BinderC8004xp;
import com.google.android.gms.internal.BinderC8099ze;
import com.google.android.gms.internal.BinderC8103zi;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.concurrent.atomic.AtomicBoolean;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.f */
/* loaded from: classes.dex */
public class C3561f {

    /* renamed from: a */
    final C3516ae f13988a;

    /* renamed from: b */
    private final BinderC8004xp f13989b;

    /* renamed from: c */
    private final C3586y f13990c;

    /* renamed from: d */
    private final AtomicBoolean f13991d;

    /* renamed from: e */
    private final C3471h f13992e;

    /* renamed from: f */
    private AbstractC3501a f13993f;

    /* renamed from: g */
    private AbstractC3432a f13994g;

    /* renamed from: h */
    private C3446d[] f13995h;

    /* renamed from: i */
    private AbstractC3447a f13996i;

    /* renamed from: j */
    private C3454e f13997j;

    /* renamed from: k */
    private AbstractC3532ak f13998k;

    /* renamed from: l */
    private AbstractC3819b f13999l;

    /* renamed from: m */
    private AbstractC3449c f14000m;

    /* renamed from: n */
    private AbstractC3821d f14001n;

    /* renamed from: o */
    private C3473i f14002o;

    /* renamed from: p */
    private String f14003p;

    /* renamed from: q */
    private String f14004q;

    /* renamed from: r */
    private ViewGroup f14005r;

    /* renamed from: s */
    private boolean f14006s;

    /* renamed from: t */
    private boolean f14007t;

    public C3561f(ViewGroup viewGroup) {
        this(viewGroup, null, false, C3586y.m27414a(), false);
    }

    public C3561f(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, C3586y.m27414a(), false);
    }

    C3561f(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C3586y c3586y, AbstractC3532ak abstractC3532ak, boolean z2) {
        this.f13989b = new BinderC8004xp();
        this.f13992e = new C3471h();
        this.f13988a = new C3516ae() { // from class: com.google.android.gms.ads.internal.client.f.1
            @Override // com.google.android.gms.ads.internal.client.C3516ae, com.google.android.gms.ads.AbstractC3432a
            /* renamed from: a */
            public void mo27472a() {
                C3561f.this.f13992e.m27699a(C3561f.this.m27477o());
                super.mo27472a();
            }

            @Override // com.google.android.gms.ads.internal.client.C3516ae, com.google.android.gms.ads.AbstractC3432a
            /* renamed from: a */
            public void mo27471a(int i) {
                C3561f.this.f13992e.m27699a(C3561f.this.m27477o());
                super.mo27471a(i);
            }
        };
        this.f14005r = viewGroup;
        this.f13990c = c3586y;
        this.f13998k = abstractC3532ak;
        this.f13991d = new AtomicBoolean(false);
        this.f14006s = z2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzk zzkVar = new zzk(context, attributeSet);
                this.f13995h = zzkVar.m27406a(z);
                this.f14003p = zzkVar.m27408a();
                if (!viewGroup.isInEditMode()) {
                    return;
                }
                C3514ac.m27586a().m26861a(viewGroup, m27507a(context, this.f13995h[0], this.f14006s), "Ads by Google");
            } catch (IllegalArgumentException e) {
                C3514ac.m27586a().m26859a(viewGroup, new AdSizeParcel(context, C3446d.f13737c), e.getMessage(), e.getMessage());
            }
        }
    }

    C3561f(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C3586y c3586y, boolean z2) {
        this(viewGroup, attributeSet, z, c3586y, null, z2);
    }

    public C3561f(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, boolean z2) {
        this(viewGroup, attributeSet, z, C3586y.m27414a(), z2);
    }

    public C3561f(ViewGroup viewGroup, boolean z) {
        this(viewGroup, null, false, C3586y.m27414a(), z);
    }

    /* renamed from: a */
    private static AdSizeParcel m27507a(Context context, C3446d c3446d, boolean z) {
        AdSizeParcel adSizeParcel = new AdSizeParcel(context, c3446d);
        adSizeParcel.m27636a(z);
        return adSizeParcel;
    }

    /* renamed from: a */
    private static AdSizeParcel m27506a(Context context, C3446d[] c3446dArr, boolean z) {
        AdSizeParcel adSizeParcel = new AdSizeParcel(context, c3446dArr);
        adSizeParcel.m27636a(z);
        return adSizeParcel;
    }

    /* renamed from: s */
    private void m27473s() {
        try {
            AbstractC4170e mo13193a = this.f13998k.mo13193a();
            if (mo13193a == null) {
                return;
            }
            this.f14005r.addView((View) BinderC4173f.m25294a(mo13193a));
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to get an ad frame.", e);
        }
    }

    /* renamed from: a */
    public void m27508a() {
        try {
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13179b();
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to destroy AdView.", e);
        }
    }

    /* renamed from: a */
    public void m27505a(AbstractC3432a abstractC3432a) {
        this.f13994g = abstractC3432a;
        this.f13988a.m27581a(abstractC3432a);
    }

    /* renamed from: a */
    public void m27504a(AbstractC3447a abstractC3447a) {
        try {
            this.f13996i = abstractC3447a;
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13187a(abstractC3447a != null ? new BinderC3502aa(abstractC3447a) : null);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the AppEventListener.", e);
        }
    }

    /* renamed from: a */
    public void m27503a(AbstractC3449c abstractC3449c) {
        this.f14000m = abstractC3449c;
        try {
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13184a(abstractC3449c != null ? new BinderC7810us(abstractC3449c) : null);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }

    /* renamed from: a */
    public void m27502a(C3454e c3454e) {
        this.f13997j = c3454e;
        try {
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13186a(this.f13997j == null ? null : this.f13997j.m27754b());
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set correlator.", e);
        }
    }

    /* renamed from: a */
    public void m27501a(C3473i c3473i) {
        this.f14002o = c3473i;
        try {
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13190a(c3473i == null ? null : new VideoOptionsParcel(c3473i));
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set video options.", e);
        }
    }

    /* renamed from: a */
    public void m27499a(AbstractC3501a abstractC3501a) {
        try {
            this.f13993f = abstractC3501a;
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13189a(abstractC3501a != null ? new BinderC3580s(abstractC3501a) : null);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the AdClickListener.", e);
        }
    }

    /* renamed from: a */
    public void m27498a(C3559e c3559e) {
        try {
            if (this.f13998k == null) {
                m27475q();
            }
            if (!this.f13998k.mo13192a(this.f13990c.m27413a(this.f14005r.getContext(), c3559e))) {
                return;
            }
            this.f13989b.m13057a(c3559e.m27546j());
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public void m27496a(AbstractC3819b abstractC3819b) {
        if (this.f14001n != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.f13999l = abstractC3819b;
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13183a(abstractC3819b != null ? new BinderC8099ze(abstractC3819b) : null);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the InAppPurchaseListener.", e);
        }
    }

    /* renamed from: a */
    public void m27495a(AbstractC3821d abstractC3821d, String str) {
        if (this.f13999l != null) {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        try {
            this.f14001n = abstractC3821d;
            this.f14004q = str;
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13182a(abstractC3821d != null ? new BinderC8103zi(abstractC3821d) : null, str);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the play store purchase parameter.", e);
        }
    }

    /* renamed from: a */
    public void m27494a(String str) {
        if (this.f14003p != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f14003p = str;
    }

    /* renamed from: a */
    public void m27493a(boolean z) {
        this.f14007t = z;
        try {
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13180a(this.f14007t);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set manual impressions.", e);
        }
    }

    /* renamed from: a */
    public void m27492a(C3446d... c3446dArr) {
        if (this.f13995h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m27490b(c3446dArr);
    }

    /* renamed from: a */
    public boolean m27500a(AdSizeParcel adSizeParcel) {
        return "search_v2".equals(adSizeParcel.f13864b);
    }

    /* renamed from: b */
    public AbstractC3432a m27491b() {
        return this.f13994g;
    }

    /* renamed from: b */
    public void m27490b(C3446d... c3446dArr) {
        this.f13995h = c3446dArr;
        try {
            if (this.f13998k != null) {
                this.f13998k.mo13191a(m27506a(this.f14005r.getContext(), this.f13995h, this.f14006s));
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the ad size.", e);
        }
        this.f14005r.requestLayout();
    }

    /* renamed from: c */
    public C3446d m27489c() {
        AdSizeParcel mo13171i;
        try {
            if (this.f13998k != null && (mo13171i = this.f13998k.mo13171i()) != null) {
                return mo13171i.m27635b();
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to get the current AdSize.", e);
        }
        if (this.f13995h != null) {
            return this.f13995h[0];
        }
        return null;
    }

    /* renamed from: d */
    public C3446d[] m27488d() {
        return this.f13995h;
    }

    /* renamed from: e */
    public String m27487e() {
        return this.f14003p;
    }

    /* renamed from: f */
    public AbstractC3447a m27486f() {
        return this.f13996i;
    }

    /* renamed from: g */
    public AbstractC3819b m27485g() {
        return this.f13999l;
    }

    /* renamed from: h */
    public AbstractC3449c m27484h() {
        return this.f14000m;
    }

    /* renamed from: i */
    public void m27483i() {
        try {
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13175d();
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to call pause.", e);
        }
    }

    /* renamed from: j */
    public void m27482j() {
        if (this.f13991d.getAndSet(true)) {
            return;
        }
        try {
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13173h();
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to record impression.", e);
        }
    }

    /* renamed from: k */
    public void m27481k() {
        try {
            if (this.f13998k == null) {
                return;
            }
            this.f13998k.mo13172h_();
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to call resume.", e);
        }
    }

    /* renamed from: l */
    public String m27480l() {
        try {
            if (this.f13998k != null) {
                return this.f13998k.mo13170j();
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    /* renamed from: m */
    public boolean m27479m() {
        try {
            if (this.f13998k != null) {
                return this.f13998k.mo13169k();
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to check if ad is loading.", e);
        }
        return false;
    }

    /* renamed from: n */
    public C3471h m27478n() {
        return this.f13992e;
    }

    /* renamed from: o */
    public AbstractC3553c m27477o() {
        if (this.f13998k == null) {
            return null;
        }
        try {
            return this.f13998k.mo13168l();
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to retrieve VideoController.", e);
            return null;
        }
    }

    /* renamed from: p */
    public C3473i m27476p() {
        return this.f14002o;
    }

    /* renamed from: q */
    void m27475q() {
        if ((this.f13995h == null || this.f14003p == null) && this.f13998k == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        this.f13998k = m27474r();
        this.f13998k.mo13188a(new BinderC3581t(this.f13988a));
        if (this.f13993f != null) {
            this.f13998k.mo13189a(new BinderC3580s(this.f13993f));
        }
        if (this.f13996i != null) {
            this.f13998k.mo13187a(new BinderC3502aa(this.f13996i));
        }
        if (this.f13999l != null) {
            this.f13998k.mo13183a(new BinderC8099ze(this.f13999l));
        }
        if (this.f14001n != null) {
            this.f13998k.mo13182a(new BinderC8103zi(this.f14001n), this.f14004q);
        }
        if (this.f14000m != null) {
            this.f13998k.mo13184a(new BinderC7810us(this.f14000m));
        }
        if (this.f13997j != null) {
            this.f13998k.mo13186a(this.f13997j.m27754b());
        }
        if (this.f14002o != null) {
            this.f13998k.mo13190a(new VideoOptionsParcel(this.f14002o));
        }
        this.f13998k.mo13180a(this.f14007t);
        m27473s();
    }

    /* renamed from: r */
    protected AbstractC3532ak m27474r() {
        Context context = this.f14005r.getContext();
        AdSizeParcel m27506a = m27506a(context, this.f13995h, this.f14006s);
        return m27500a(m27506a) ? C3514ac.m27584b().m27626a(context, m27506a, this.f14003p) : C3514ac.m27584b().m27625a(context, m27506a, this.f14003p, this.f13989b);
    }
}
