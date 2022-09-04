package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.C3446d;
import com.google.android.gms.ads.internal.client.AbstractC3553c;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.safebrowsing.AbstractC3771c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7741tg;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.add;
@aaa
/* renamed from: com.google.android.gms.ads.internal.f */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC3590f extends AbstractBinderC3482c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: l */
    private boolean f14066l;

    /* renamed from: com.google.android.gms.ads.internal.f$a */
    /* loaded from: classes2.dex */
    public class C3594a {
        public C3594a() {
        }

        /* renamed from: a */
        public void m27394a() {
            ViewTreeObserver$OnGlobalLayoutListenerC3590f.this.e();
        }
    }

    public ViewTreeObserver$OnGlobalLayoutListenerC3590f(Context context, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, VersionInfoParcel versionInfoParcel, C3588d c3588d) {
        super(context, adSizeParcel, str, abstractC8005xq, versionInfoParcel, c3588d);
    }

    /* renamed from: b */
    private AdSizeParcel m27400b(abi.C6129a c6129a) {
        C3446d m27635b;
        if (c6129a.f20921b.f14550A) {
            return this.f13800f.f14770i;
        }
        String str = c6129a.f20921b.f14577m;
        if (str != null) {
            String[] split = str.split("[xX]");
            split[0] = split[0].trim();
            split[1] = split[1].trim();
            m27635b = new C3446d(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        } else {
            m27635b = this.f13800f.f14770i.m27635b();
        }
        return new AdSizeParcel(this.f13800f.f14764c, m27635b);
    }

    /* renamed from: b */
    private boolean m27399b(@Nullable abi abiVar, abi abiVar2) {
        if (abiVar2.f20907n) {
            View m27291a = C3632n.m27291a(abiVar2);
            if (m27291a == null) {
                abr.d("Could not get mediation view");
                return false;
            }
            View nextView = this.f13800f.f14767f.getNextView();
            if (nextView != null) {
                if (nextView instanceof acy) {
                    ((acy) nextView).destroy();
                }
                this.f13800f.f14767f.removeView(nextView);
            }
            if (!C3632n.m27277b(abiVar2)) {
                try {
                    a(m27291a);
                } catch (Throwable th) {
                    abr.d("Could not add mediation view to view hierarchy.", th);
                    return false;
                }
            }
        } else if (abiVar2.f20915v != null && abiVar2.f20895b != null) {
            abiVar2.f20895b.mo18117a(abiVar2.f20915v);
            this.f13800f.f14767f.removeAllViews();
            this.f13800f.f14767f.setMinimumWidth(abiVar2.f20915v.f13869g);
            this.f13800f.f14767f.setMinimumHeight(abiVar2.f20915v.f13866d);
            a(abiVar2.f20895b.mo18105b());
        }
        if (this.f13800f.f14767f.getChildCount() > 1) {
            this.f13800f.f14767f.showNext();
        }
        if (abiVar != null) {
            View nextView2 = this.f13800f.f14767f.getNextView();
            if (nextView2 instanceof acy) {
                ((acy) nextView2).mo18119a(this.f13800f.f14764c, this.f13800f.f14770i, this.f13795a);
            } else if (nextView2 != null) {
                this.f13800f.f14767f.removeView(nextView2);
            }
            this.f13800f.m26829d();
        }
        this.f13800f.f14767f.setVisibility(0);
        return true;
    }

    /* renamed from: e */
    private void m27396e(final abi abiVar) {
        if (!this.f13800f.m26828e()) {
            if (this.f13800f.f14751D == null || abiVar.f20903j == null) {
                return;
            }
            this.f13802h.m13600a(this.f13800f.f14770i, abiVar, this.f13800f.f14751D);
        } else if (abiVar.f20895b == null) {
        } else {
            if (abiVar.f20903j != null) {
                this.f13802h.m13601a(this.f13800f.f14770i, abiVar);
            }
            if (abiVar.m18486a()) {
                this.f13802h.m13601a(this.f13800f.f14770i, abiVar).m13627a((AbstractC7741tg) abiVar.f20895b);
            } else {
                abiVar.f20895b.mo18084l().m18172a(new acz.AbstractC6199c() { // from class: com.google.android.gms.ads.internal.f.3
                    @Override // com.google.android.gms.internal.acz.AbstractC6199c
                    /* renamed from: a */
                    public void mo18145a() {
                        ViewTreeObserver$OnGlobalLayoutListenerC3590f.this.f13802h.m13601a(ViewTreeObserver$OnGlobalLayoutListenerC3590f.this.f13800f.f14770i, abiVar).m13627a((AbstractC7741tg) abiVar.f20895b);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.AbstractBinderC3482c
    /* renamed from: a */
    public acy mo27301a(abi.C6129a c6129a, @Nullable C3589e c3589e, @Nullable AbstractC3771c abstractC3771c) {
        if (this.f13800f.f14770i.f13870h == null && this.f13800f.f14770i.f13872j) {
            this.f13800f.f14770i = m27400b(c6129a);
        }
        return super.mo27301a(c6129a, c3589e, abstractC3771c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b
    /* renamed from: a */
    public void mo27401a(@Nullable abi abiVar, boolean z) {
        super.a(abiVar, z);
        if (C3632n.m27277b(abiVar)) {
            C3632n.m27290a(abiVar, new C3594a());
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13180a(boolean z) {
        C4588d.m23620b("setManualImpressionsEnabled must be called from the main thread.");
        this.f14066l = z;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public boolean mo13192a(AdRequestParcel adRequestParcel) {
        return super.a(m27398d(adRequestParcel));
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3482c, com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    public boolean mo18574a(@Nullable abi abiVar, final abi abiVar2) {
        add addVar;
        if (!super.mo18574a(abiVar, abiVar2)) {
            return false;
        }
        if (this.f13800f.m26828e() && !m27399b(abiVar, abiVar2)) {
            a(0);
            return false;
        }
        if (abiVar2.f20904k) {
            m27397d(abiVar2);
            C3779u.m26897C().m18196a((View) this.f13800f.f14767f, (ViewTreeObserver.OnGlobalLayoutListener) this);
            C3779u.m26897C().m18195a((View) this.f13800f.f14767f, (ViewTreeObserver.OnScrollChangedListener) this);
            if (!abiVar2.f20906m) {
                final Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.f.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ViewTreeObserver$OnGlobalLayoutListenerC3590f.this.m27397d(ViewTreeObserver$OnGlobalLayoutListenerC3590f.this.f13800f.f14771j);
                    }
                };
                acz mo18084l = abiVar2.f20895b != null ? abiVar2.f20895b.mo18084l() : null;
                if (mo18084l != null) {
                    mo18084l.m18171a(new acz.AbstractC6201e() { // from class: com.google.android.gms.ads.internal.f.2
                        @Override // com.google.android.gms.internal.acz.AbstractC6201e
                        /* renamed from: a */
                        public void mo18144a() {
                            if (!abiVar2.f20906m) {
                                C3779u.m26890e();
                                abv.m18331b(runnable);
                            }
                        }
                    });
                }
            }
        } else if (!this.f13800f.m26827f() || C7788uf.f25803bH.m13486c().booleanValue()) {
            mo27401a(abiVar2, false);
        }
        if (abiVar2.f20895b != null) {
            addVar = abiVar2.f20895b.mo18070z();
            acz mo18084l2 = abiVar2.f20895b.mo18084l();
            if (mo18084l2 != null) {
                mo18084l2.m18154h();
            }
        } else {
            addVar = null;
        }
        if (this.f13800f.f14785x != null && addVar != null) {
            addVar.m18056b(this.f13800f.f14785x.f13890b);
        }
        m27396e(abiVar2);
        return true;
    }

    /* renamed from: d */
    AdRequestParcel m27398d(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.f13852h == this.f14066l) {
            return adRequestParcel;
        }
        return new AdRequestParcel(adRequestParcel.f13845a, adRequestParcel.f13846b, adRequestParcel.f13847c, adRequestParcel.f13848d, adRequestParcel.f13849e, adRequestParcel.f13850f, adRequestParcel.f13851g, adRequestParcel.f13852h || this.f14066l, adRequestParcel.f13853i, adRequestParcel.f13854j, adRequestParcel.f13855k, adRequestParcel.f13856l, adRequestParcel.f13857m, adRequestParcel.f13858n, adRequestParcel.f13859o, adRequestParcel.f13860p, adRequestParcel.f13861q, adRequestParcel.f13862r);
    }

    /* renamed from: d */
    void m27397d(@Nullable abi abiVar) {
        if (abiVar != null && !abiVar.f20906m && this.f13800f.f14767f != null && C3779u.m26890e().m18358a(this.f13800f.f14767f, this.f13800f.f14764c) && this.f13800f.f14767f.getGlobalVisibleRect(new Rect(), null)) {
            if (abiVar != null && abiVar.f20895b != null && abiVar.f20895b.mo18084l() != null) {
                abiVar.f20895b.mo18084l().m18171a((acz.AbstractC6201e) null);
            }
            mo27401a(abiVar, false);
            abiVar.f20906m = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: f */
    public void mo13174f() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    @Nullable
    /* renamed from: l */
    public AbstractC3553c mo13168l() {
        C4588d.m23620b("getVideoController must be called from the main thread.");
        if (this.f13800f.f14771j == null || this.f13800f.f14771j.f20895b == null) {
            return null;
        }
        return this.f13800f.f14771j.f20895b.mo18070z();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m27397d(this.f13800f.f14771j);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        m27397d(this.f13800f.f14771j);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b
    /* renamed from: u */
    protected boolean mo27395u() {
        boolean z = true;
        if (!C3779u.m26890e().m18364a(this.f13800f.f14764c.getPackageManager(), this.f13800f.f14764c.getPackageName(), "android.permission.INTERNET")) {
            C3514ac.m27586a().m26859a(this.f13800f.f14767f, this.f13800f.f14770i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        if (!C3779u.m26890e().m18378a(this.f13800f.f14764c)) {
            C3514ac.m27586a().m26859a(this.f13800f.f14767f, this.f13800f.f14770i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && this.f13800f.f14767f != null) {
            this.f13800f.f14767f.setVisibility(0);
        }
        return z;
    }
}
