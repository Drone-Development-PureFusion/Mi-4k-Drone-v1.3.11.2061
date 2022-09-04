package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p001v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.AbstractC8066yq;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.aby;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Future;
@aaa
/* renamed from: com.google.android.gms.ads.internal.overlay.d */
/* loaded from: classes.dex */
public class BinderC3649d extends AbstractC8066yq.AbstractBinderC8067a implements AbstractC3675u {

    /* renamed from: a */
    static final int f14298a = Color.argb(0, 0, 0, 0);

    /* renamed from: b */
    AdOverlayInfoParcel f14299b;

    /* renamed from: c */
    acy f14300c;

    /* renamed from: d */
    C3654c f14301d;

    /* renamed from: e */
    View$OnClickListenerC3669o f14302e;

    /* renamed from: g */
    FrameLayout f14304g;

    /* renamed from: h */
    WebChromeClient.CustomViewCallback f14305h;

    /* renamed from: k */
    C3653b f14308k;

    /* renamed from: o */
    private final Activity f14312o;

    /* renamed from: q */
    private Runnable f14314q;

    /* renamed from: r */
    private boolean f14315r;

    /* renamed from: s */
    private boolean f14316s;

    /* renamed from: f */
    boolean f14303f = false;

    /* renamed from: i */
    boolean f14306i = false;

    /* renamed from: j */
    boolean f14307j = false;

    /* renamed from: l */
    boolean f14309l = false;

    /* renamed from: m */
    int f14310m = 0;

    /* renamed from: p */
    private final Object f14313p = new Object();

    /* renamed from: t */
    private boolean f14317t = false;

    /* renamed from: u */
    private boolean f14318u = false;

    /* renamed from: v */
    private boolean f14319v = true;

    /* renamed from: n */
    AbstractC3666l f14311n = new C3673s();

    /* JADX INFO: Access modifiers changed from: private */
    @aaa
    /* renamed from: com.google.android.gms.ads.internal.overlay.d$a */
    /* loaded from: classes.dex */
    public static final class C3652a extends Exception {
        public C3652a(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @aaa
    /* renamed from: com.google.android.gms.ads.internal.overlay.d$b */
    /* loaded from: classes.dex */
    public static class C3653b extends RelativeLayout {

        /* renamed from: a */
        aby f14322a;

        /* renamed from: b */
        boolean f14323b;

        public C3653b(Context context, String str) {
            super(context);
            this.f14322a = new aby(context, str);
        }

        /* renamed from: a */
        void m27216a() {
            this.f14323b = true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.f14323b) {
                this.f14322a.m18279a(motionEvent);
                return false;
            }
            return false;
        }
    }

    @aaa
    /* renamed from: com.google.android.gms.ads.internal.overlay.d$c */
    /* loaded from: classes.dex */
    public static class C3654c {

        /* renamed from: a */
        public final int f14324a;

        /* renamed from: b */
        public final ViewGroup.LayoutParams f14325b;

        /* renamed from: c */
        public final ViewGroup f14326c;

        /* renamed from: d */
        public final Context f14327d;

        public C3654c(acy acyVar) {
            this.f14325b = acyVar.getLayoutParams();
            ViewParent parent = acyVar.getParent();
            this.f14327d = acyVar.mo18089g();
            if (parent == null || !(parent instanceof ViewGroup)) {
                throw new C3652a("Could not get the parent of the WebView for an overlay.");
            }
            this.f14326c = (ViewGroup) parent;
            this.f14324a = this.f14326c.indexOfChild(acyVar.mo18105b());
            this.f14326c.removeView(acyVar.mo18105b());
            acyVar.mo18106a(true);
        }
    }

    @aaa
    /* renamed from: com.google.android.gms.ads.internal.overlay.d$d */
    /* loaded from: classes.dex */
    private class C3655d extends abq {
        private C3655d() {
        }

        @Override // com.google.android.gms.internal.abq
        /* renamed from: a */
        public void mo12782a() {
            Bitmap m18224a = C3779u.m26869z().m18224a(Integer.valueOf(BinderC3649d.this.f14299b.f14269q.f13794g));
            if (m18224a != null) {
                final Drawable mo18291a = C3779u.m26888g().mo18291a(BinderC3649d.this.f14312o, m18224a, BinderC3649d.this.f14299b.f14269q.f13792e, BinderC3649d.this.f14299b.f14269q.f13793f);
                abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.d.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BinderC3649d.this.f14312o.getWindow().setBackgroundDrawable(mo18291a);
                    }
                });
            }
        }

        @Override // com.google.android.gms.internal.abq
        /* renamed from: b */
        public void mo12779b() {
        }
    }

    public BinderC3649d(Activity activity) {
        this.f14312o = activity;
    }

    /* renamed from: a */
    public void m27233a() {
        this.f14310m = 2;
        this.f14312o.finish();
    }

    /* renamed from: a */
    public void m27232a(int i) {
        this.f14312o.setRequestedOrientation(i);
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: a */
    public void mo12874a(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: a */
    public void mo12873a(Bundle bundle) {
        boolean z = false;
        this.f14312o.requestWindowFeature(1);
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.f14306i = z;
        try {
            this.f14299b = AdOverlayInfoParcel.m27259a(this.f14312o.getIntent());
            if (this.f14299b == null) {
                throw new C3652a("Could not get info for ad overlay.");
            }
            if (this.f14299b.f14266n.f14735d > 7500000) {
                this.f14310m = 3;
            }
            if (this.f14312o.getIntent() != null) {
                this.f14319v = this.f14312o.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.f14299b.f14269q != null) {
                this.f14307j = this.f14299b.f14269q.f13789b;
            } else {
                this.f14307j = false;
            }
            if (C7788uf.f25796bA.m13486c().booleanValue() && this.f14307j && this.f14299b.f14269q.f13794g != -1) {
                Future future = (Future) new C3655d().mo12820e();
            }
            if (bundle == null) {
                if (this.f14299b.f14256d != null && this.f14319v) {
                    this.f14299b.f14256d.mo12931j_();
                }
                if (this.f14299b.f14264l != 1 && this.f14299b.f14255c != null) {
                    this.f14299b.f14255c.mo27632e();
                }
            }
            this.f14308k = new C3653b(this.f14312o, this.f14299b.f14268p);
            this.f14308k.setId(1000);
            switch (this.f14299b.f14264l) {
                case 1:
                    m27224b(false);
                    return;
                case 2:
                    this.f14301d = new C3654c(this.f14299b.f14257e);
                    m27224b(false);
                    return;
                case 3:
                    m27224b(true);
                    return;
                case 4:
                    if (this.f14306i) {
                        this.f14310m = 3;
                        this.f14312o.finish();
                        return;
                    } else if (C3779u.m26893b().m27251a(this.f14312o, this.f14299b.f14254b, this.f14299b.f14262j)) {
                        return;
                    } else {
                        this.f14310m = 3;
                        this.f14312o.finish();
                        return;
                    }
                default:
                    throw new C3652a("Could not determine ad overlay type.");
            }
        } catch (C3652a e) {
            abr.d(e.getMessage());
            this.f14310m = 3;
            this.f14312o.finish();
        }
    }

    /* renamed from: a */
    public void m27231a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f14304g = new FrameLayout(this.f14312o);
        this.f14304g.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f14304g.addView(view, -1, -1);
        this.f14312o.setContentView(this.f14304g);
        mo12862l();
        this.f14305h = customViewCallback;
        this.f14303f = true;
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: a */
    public void mo12872a(AbstractC4170e abstractC4170e) {
        if (!C7788uf.f25859cK.m13486c().booleanValue() || !C4696s.m23101m()) {
            return;
        }
        if (C3779u.m26890e().m18382a(this.f14312o, (Configuration) BinderC4173f.m25294a(abstractC4170e))) {
            this.f14312o.getWindow().addFlags(1024);
            this.f14312o.getWindow().clearFlags(2048);
            return;
        }
        this.f14312o.getWindow().addFlags(2048);
        this.f14312o.getWindow().clearFlags(1024);
    }

    /* renamed from: a */
    public void m27229a(acy acyVar, Map<String, String> map) {
        this.f14311n.mo27166a(acyVar, map);
    }

    /* renamed from: a */
    public void m27228a(boolean z) {
        this.f14302e = new View$OnClickListenerC3669o(this.f14312o, z ? 50 : 32, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.f14302e.m27171a(z, this.f14299b.f14260h);
        this.f14308k.addView(this.f14302e, layoutParams);
    }

    /* renamed from: a */
    public void m27227a(boolean z, boolean z2) {
        if (this.f14302e != null) {
            this.f14302e.m27171a(z, z2);
        }
    }

    /* renamed from: b */
    public void m27226b() {
        if (this.f14299b != null && this.f14303f) {
            m27232a(this.f14299b.f14263k);
        }
        if (this.f14304g != null) {
            this.f14312o.setContentView(this.f14308k);
            mo12862l();
            this.f14304g.removeAllViews();
            this.f14304g = null;
        }
        if (this.f14305h != null) {
            this.f14305h.onCustomViewHidden();
            this.f14305h = null;
        }
        this.f14303f = false;
    }

    /* renamed from: b */
    protected void m27225b(int i) {
        this.f14300c.mo18121a(i);
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: b */
    public void mo12871b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f14306i);
    }

    /* renamed from: b */
    protected void m27224b(boolean z) {
        if (!this.f14316s) {
            this.f14312o.requestWindowFeature(1);
        }
        Window window = this.f14312o.getWindow();
        if (window == null) {
            throw new C3652a("Invalid activity, no window available.");
        }
        boolean m18382a = (!C4696s.m23101m() || !C7788uf.f25859cK.m13486c().booleanValue()) ? true : C3779u.m26890e().m18382a(this.f14312o, this.f14312o.getResources().getConfiguration());
        boolean z2 = this.f14299b.f14269q != null && this.f14299b.f14269q.f13790c;
        if ((!this.f14307j || z2) && m18382a) {
            window.setFlags(1024, 1024);
        }
        acz mo18084l = this.f14299b.f14257e.mo18084l();
        boolean m18162b = mo18084l != null ? mo18084l.m18162b() : false;
        this.f14309l = false;
        if (m18162b) {
            if (this.f14299b.f14263k == C3779u.m26888g().mo18302a()) {
                this.f14309l = this.f14312o.getResources().getConfiguration().orientation == 1;
            } else if (this.f14299b.f14263k == C3779u.m26888g().mo18301b()) {
                this.f14309l = this.f14312o.getResources().getConfiguration().orientation == 2;
            }
        }
        abr.a(new StringBuilder(46).append("Delay onShow to next orientation change: ").append(this.f14309l).toString());
        m27232a(this.f14299b.f14263k);
        if (C3779u.m26888g().mo18298a(window)) {
            abr.a("Hardware acceleration on the AdActivity window enabled.");
        }
        if (!this.f14307j) {
            this.f14308k.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } else {
            this.f14308k.setBackgroundColor(f14298a);
        }
        this.f14312o.setContentView(this.f14308k);
        mo12862l();
        if (z) {
            this.f14300c = C3779u.m26889f().m18142a(this.f14312o, this.f14299b.f14257e.mo18085k(), true, m18162b, null, this.f14299b.f14266n, null, null, this.f14299b.f14257e.mo18088h());
            this.f14300c.mo18084l().m18178a(null, null, this.f14299b.f14258f, this.f14299b.f14262j, true, this.f14299b.f14267o, null, this.f14299b.f14257e.mo18084l().m18184a(), null, null);
            this.f14300c.mo18084l().m18174a(new acz.AbstractC6197a() { // from class: com.google.android.gms.ads.internal.overlay.d.1
                @Override // com.google.android.gms.internal.acz.AbstractC6197a
                /* renamed from: a */
                public void mo12714a(acy acyVar, boolean z3) {
                    acyVar.mo18095d();
                }
            });
            if (this.f14299b.f14265m != null) {
                this.f14300c.loadUrl(this.f14299b.f14265m);
            } else if (this.f14299b.f14261i == null) {
                throw new C3652a("No URL or HTML to display in ad overlay.");
            } else {
                this.f14300c.loadDataWithBaseURL(this.f14299b.f14259g, this.f14299b.f14261i, "text/html", "UTF-8", null);
            }
            if (this.f14299b.f14257e != null) {
                this.f14299b.f14257e.mo18103b(this);
            }
        } else {
            this.f14300c = this.f14299b.f14257e;
            this.f14300c.mo18120a(this.f14312o);
        }
        this.f14300c.mo18115a(this);
        ViewParent parent = this.f14300c.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.f14300c.mo18105b());
        }
        if (this.f14307j) {
            this.f14300c.mo18134H();
        }
        this.f14308k.addView(this.f14300c.mo18105b(), -1, -1);
        if (!z && !this.f14309l) {
            m27219q();
        }
        m27228a(m18162b);
        if (this.f14300c.mo18083m()) {
            m27227a(m18162b, true);
        }
        C3588d mo18088h = this.f14300c.mo18088h();
        AbstractC3667m abstractC3667m = mo18088h != null ? mo18088h.f14061c : null;
        if (abstractC3667m != null) {
            this.f14311n = abstractC3667m.mo27162a(this.f14312o, this.f14300c, this.f14308k);
        } else {
            abr.d("Appstreaming controller is null.");
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3675u
    /* renamed from: c */
    public void mo27160c() {
        this.f14310m = 1;
        this.f14312o.finish();
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: d */
    public void mo12870d() {
        this.f14310m = 0;
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: e */
    public boolean mo12869e() {
        boolean z = true;
        this.f14310m = 0;
        if (this.f14300c != null) {
            if (!this.f14300c.mo18076t() || !this.f14311n.mo27163d()) {
                z = false;
            }
            if (!z) {
                this.f14300c.mo18107a("onbackblocked", Collections.emptyMap());
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: f */
    public void mo12868f() {
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: g */
    public void mo12867g() {
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: h */
    public void mo12866h() {
        if (this.f14299b != null && this.f14299b.f14264l == 4) {
            if (this.f14306i) {
                this.f14310m = 3;
                this.f14312o.finish();
            } else {
                this.f14306i = true;
            }
        }
        if (this.f14299b.f14256d != null) {
            this.f14299b.f14256d.mo12933g();
        }
        if (this.f14300c == null || this.f14300c.mo18078r()) {
            abr.d("The webview does not exit. Ignoring action.");
        } else {
            C3779u.m26888g().m18303b(this.f14300c);
        }
        this.f14311n.mo27165b();
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: i */
    public void mo12865i() {
        this.f14311n.mo27167a();
        m27226b();
        if (this.f14299b.f14256d != null) {
            this.f14299b.f14256d.mo12930k_();
        }
        if (this.f14300c != null && (!this.f14312o.isFinishing() || this.f14301d == null)) {
            C3779u.m26888g().m18304a(this.f14300c);
        }
        m27222n();
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: j */
    public void mo12864j() {
        m27222n();
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: k */
    public void mo12863k() {
        if (this.f14300c != null) {
            this.f14308k.removeView(this.f14300c.mo18105b());
        }
        m27222n();
    }

    @Override // com.google.android.gms.internal.AbstractC8066yq
    /* renamed from: l */
    public void mo12862l() {
        this.f14316s = true;
    }

    /* renamed from: m */
    public void m27223m() {
        this.f14308k.removeView(this.f14302e);
        m27228a(true);
    }

    /* renamed from: n */
    protected void m27222n() {
        if (!this.f14312o.isFinishing() || this.f14317t) {
            return;
        }
        this.f14317t = true;
        if (this.f14300c != null) {
            m27225b(this.f14310m);
            synchronized (this.f14313p) {
                if (!this.f14315r && this.f14300c.mo18141A()) {
                    this.f14314q = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.d.2
                        @Override // java.lang.Runnable
                        public void run() {
                            BinderC3649d.this.m27221o();
                        }
                    };
                    abv.f21039a.postDelayed(this.f14314q, C7788uf.f25789au.m13486c().longValue());
                    return;
                }
            }
        }
        m27221o();
    }

    /* renamed from: o */
    void m27221o() {
        if (this.f14318u) {
            return;
        }
        this.f14318u = true;
        if (this.f14300c != null) {
            this.f14308k.removeView(this.f14300c.mo18105b());
            if (this.f14301d != null) {
                this.f14300c.mo18120a(this.f14301d.f14327d);
                this.f14300c.mo18106a(false);
                this.f14301d.f14326c.addView(this.f14300c.mo18105b(), this.f14301d.f14324a, this.f14301d.f14325b);
                this.f14301d = null;
            } else if (this.f14312o.getApplicationContext() != null) {
                this.f14300c.mo18120a(this.f14312o.getApplicationContext());
            }
            this.f14300c = null;
        }
        if (this.f14299b != null && this.f14299b.f14256d != null) {
            this.f14299b.f14256d.mo12932i_();
        }
        this.f14311n.mo27164c();
    }

    /* renamed from: p */
    public void m27220p() {
        if (this.f14309l) {
            this.f14309l = false;
            m27219q();
        }
    }

    /* renamed from: q */
    protected void m27219q() {
        this.f14300c.mo18095d();
    }

    /* renamed from: r */
    public void m27218r() {
        this.f14308k.m27216a();
    }

    /* renamed from: s */
    public void m27217s() {
        synchronized (this.f14313p) {
            this.f14315r = true;
            if (this.f14314q != null) {
                abv.f21039a.removeCallbacks(this.f14314q);
                abv.f21039a.post(this.f14314q);
            }
        }
    }
}
