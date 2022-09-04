package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AbstractC3432a;
import com.google.android.gms.ads.C3454e;
import com.google.android.gms.ads.doubleclick.AbstractC3447a;
import com.google.android.gms.ads.doubleclick.AbstractC3449c;
import com.google.android.gms.ads.doubleclick.C3453e;
import com.google.android.gms.ads.internal.reward.client.BinderC3760g;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.p226b.AbstractC3442c;
import com.google.android.gms.ads.purchase.AbstractC3819b;
import com.google.android.gms.ads.purchase.AbstractC3821d;
import com.google.android.gms.internal.BinderC7810us;
import com.google.android.gms.internal.BinderC8004xp;
import com.google.android.gms.internal.BinderC8099ze;
import com.google.android.gms.internal.BinderC8103zi;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.g */
/* loaded from: classes.dex */
public class C3563g {

    /* renamed from: a */
    private final BinderC8004xp f14009a;

    /* renamed from: b */
    private final Context f14010b;

    /* renamed from: c */
    private final C3586y f14011c;

    /* renamed from: d */
    private AbstractC3432a f14012d;

    /* renamed from: e */
    private AbstractC3501a f14013e;

    /* renamed from: f */
    private AbstractC3532ak f14014f;

    /* renamed from: g */
    private String f14015g;

    /* renamed from: h */
    private String f14016h;

    /* renamed from: i */
    private AbstractC3447a f14017i;

    /* renamed from: j */
    private AbstractC3821d f14018j;

    /* renamed from: k */
    private AbstractC3819b f14019k;

    /* renamed from: l */
    private C3453e f14020l;

    /* renamed from: m */
    private AbstractC3449c f14021m;

    /* renamed from: n */
    private C3454e f14022n;

    /* renamed from: o */
    private AbstractC3442c f14023o;

    /* renamed from: p */
    private boolean f14024p;

    public C3563g(Context context) {
        this(context, C3586y.m27414a(), null);
    }

    public C3563g(Context context, C3453e c3453e) {
        this(context, C3586y.m27414a(), c3453e);
    }

    public C3563g(Context context, C3586y c3586y, C3453e c3453e) {
        this.f14009a = new BinderC8004xp();
        this.f14010b = context;
        this.f14011c = c3586y;
        this.f14020l = c3453e;
    }

    /* renamed from: b */
    private void m27457b(String str) {
        if (this.f14015g == null) {
            m27455c(str);
        }
        this.f14014f = C3514ac.m27584b().m27616b(this.f14010b, this.f14024p ? AdSizeParcel.m27639a() : new AdSizeParcel(), this.f14015g, this.f14009a);
        if (this.f14012d != null) {
            this.f14014f.mo13188a(new BinderC3581t(this.f14012d));
        }
        if (this.f14013e != null) {
            this.f14014f.mo13189a(new BinderC3580s(this.f14013e));
        }
        if (this.f14017i != null) {
            this.f14014f.mo13187a(new BinderC3502aa(this.f14017i));
        }
        if (this.f14019k != null) {
            this.f14014f.mo13183a(new BinderC8099ze(this.f14019k));
        }
        if (this.f14018j != null) {
            this.f14014f.mo13182a(new BinderC8103zi(this.f14018j), this.f14016h);
        }
        if (this.f14021m != null) {
            this.f14014f.mo13184a(new BinderC7810us(this.f14021m));
        }
        if (this.f14022n != null) {
            this.f14014f.mo13186a(this.f14022n.m27754b());
        }
        if (this.f14023o != null) {
            this.f14014f.mo13185a(new BinderC3760g(this.f14023o));
        }
    }

    /* renamed from: c */
    private void m27455c(String str) {
        if (this.f14014f == null) {
            throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 63).append("The ad unit ID must be set on InterstitialAd before ").append(str).append(" is called.").toString());
        }
    }

    /* renamed from: a */
    public AbstractC3432a m27470a() {
        return this.f14012d;
    }

    /* renamed from: a */
    public void m27469a(AbstractC3432a abstractC3432a) {
        try {
            this.f14012d = abstractC3432a;
            if (this.f14014f == null) {
                return;
            }
            this.f14014f.mo13188a(abstractC3432a != null ? new BinderC3581t(abstractC3432a) : null);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the AdListener.", e);
        }
    }

    /* renamed from: a */
    public void m27468a(AbstractC3442c abstractC3442c) {
        try {
            this.f14023o = abstractC3442c;
            if (this.f14014f == null) {
                return;
            }
            this.f14014f.mo13185a(abstractC3442c != null ? new BinderC3760g(abstractC3442c) : null);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the AdListener.", e);
        }
    }

    /* renamed from: a */
    public void m27467a(AbstractC3447a abstractC3447a) {
        try {
            this.f14017i = abstractC3447a;
            if (this.f14014f == null) {
                return;
            }
            this.f14014f.mo13187a(abstractC3447a != null ? new BinderC3502aa(abstractC3447a) : null);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the AppEventListener.", e);
        }
    }

    /* renamed from: a */
    public void m27466a(AbstractC3449c abstractC3449c) {
        try {
            this.f14021m = abstractC3449c;
            if (this.f14014f == null) {
                return;
            }
            this.f14014f.mo13184a(abstractC3449c != null ? new BinderC7810us(abstractC3449c) : null);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the OnCustomRenderedAdLoadedListener.", e);
        }
    }

    /* renamed from: a */
    public void m27465a(C3454e c3454e) {
        this.f14022n = c3454e;
        try {
            if (this.f14014f == null) {
                return;
            }
            this.f14014f.mo13186a(this.f14022n == null ? null : this.f14022n.m27754b());
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set correlator.", e);
        }
    }

    /* renamed from: a */
    public void m27464a(AbstractC3501a abstractC3501a) {
        try {
            this.f14013e = abstractC3501a;
            if (this.f14014f == null) {
                return;
            }
            this.f14014f.mo13189a(abstractC3501a != null ? new BinderC3580s(abstractC3501a) : null);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the AdClickListener.", e);
        }
    }

    /* renamed from: a */
    public void m27463a(C3559e c3559e) {
        try {
            if (this.f14014f == null) {
                m27457b("loadAd");
            }
            if (!this.f14014f.mo13192a(this.f14011c.m27413a(this.f14010b, c3559e))) {
                return;
            }
            this.f14009a.m13057a(c3559e.m27546j());
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public void m27462a(AbstractC3819b abstractC3819b) {
        if (this.f14018j != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.f14019k = abstractC3819b;
            if (this.f14014f == null) {
                return;
            }
            this.f14014f.mo13183a(abstractC3819b != null ? new BinderC8099ze(abstractC3819b) : null);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the InAppPurchaseListener.", e);
        }
    }

    /* renamed from: a */
    public void m27461a(AbstractC3821d abstractC3821d, String str) {
        if (this.f14019k != null) {
            throw new IllegalStateException("In app purchase parameter has already been set.");
        }
        try {
            this.f14018j = abstractC3821d;
            this.f14016h = str;
            if (this.f14014f == null) {
                return;
            }
            this.f14014f.mo13182a(abstractC3821d != null ? new BinderC8103zi(abstractC3821d) : null, str);
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to set the play store purchase parameter.", e);
        }
    }

    /* renamed from: a */
    public void m27460a(String str) {
        if (this.f14015g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f14015g = str;
    }

    /* renamed from: a */
    public void m27459a(boolean z) {
        this.f14024p = z;
    }

    /* renamed from: b */
    public String m27458b() {
        return this.f14015g;
    }

    /* renamed from: c */
    public AbstractC3447a m27456c() {
        return this.f14017i;
    }

    /* renamed from: d */
    public AbstractC3819b m27454d() {
        return this.f14019k;
    }

    /* renamed from: e */
    public AbstractC3449c m27453e() {
        return this.f14021m;
    }

    /* renamed from: f */
    public boolean m27452f() {
        try {
            if (this.f14014f != null) {
                return this.f14014f.mo13177c();
            }
            return false;
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to check if ad is ready.", e);
            return false;
        }
    }

    /* renamed from: g */
    public boolean m27451g() {
        try {
            if (this.f14014f != null) {
                return this.f14014f.mo13169k();
            }
            return false;
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to check if ad is loading.", e);
            return false;
        }
    }

    /* renamed from: h */
    public String m27450h() {
        try {
            if (this.f14014f != null) {
                return this.f14014f.mo13170j();
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    /* renamed from: i */
    public void m27449i() {
        try {
            m27455c("show");
            this.f14014f.mo13174f();
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to show interstitial.", e);
        }
    }
}
