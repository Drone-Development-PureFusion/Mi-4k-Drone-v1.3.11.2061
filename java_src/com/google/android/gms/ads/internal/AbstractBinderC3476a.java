package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.Debug;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.ViewTreeObserver$OnGlobalLayoutListenerC3787v;
import com.google.android.gms.ads.internal.client.AbstractC3501a;
import com.google.android.gms.ads.internal.client.AbstractC3517af;
import com.google.android.gms.ads.internal.client.AbstractC3520ag;
import com.google.android.gms.ads.internal.client.AbstractC3532ak;
import com.google.android.gms.ads.internal.client.AbstractC3538am;
import com.google.android.gms.ads.internal.client.AbstractC3544ao;
import com.google.android.gms.ads.internal.client.AbstractC3553c;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.client.C3584w;
import com.google.android.gms.ads.internal.client.ThinAdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.overlay.AbstractC3670p;
import com.google.android.gms.ads.internal.request.C3708a;
import com.google.android.gms.ads.internal.reward.client.AbstractC3755d;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4686i;
import com.google.android.gms.internal.AbstractC7807ur;
import com.google.android.gms.internal.AbstractC7857vp;
import com.google.android.gms.internal.AbstractC8082yy;
import com.google.android.gms.internal.AbstractC8096zd;
import com.google.android.gms.internal.C7743ti;
import com.google.android.gms.internal.C7754tn;
import com.google.android.gms.internal.C7760tq;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.C7799ul;
import com.google.android.gms.internal.C7801un;
import com.google.android.gms.internal.C8113zn;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aas;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abj;
import com.google.android.gms.internal.abn;
import com.google.android.gms.internal.abo;
import com.google.android.gms.internal.abr;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
@aaa
/* renamed from: com.google.android.gms.ads.internal.a */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3476a extends AbstractC3532ak.AbstractBinderC3533a implements AbstractC3501a, AbstractC3670p, C3708a.AbstractC3709a, abn, AbstractC7857vp, C8113zn.AbstractC8114a {

    /* renamed from: a */
    protected C7801un f13795a;

    /* renamed from: b */
    protected C7799ul f13796b;

    /* renamed from: c */
    protected C7799ul f13797c;

    /* renamed from: d */
    protected boolean f13798d = false;

    /* renamed from: e */
    protected final C3703r f13799e;

    /* renamed from: f */
    protected final ViewTreeObserver$OnGlobalLayoutListenerC3787v f13800f;
    @Nullable

    /* renamed from: g */
    protected transient AdRequestParcel f13801g;

    /* renamed from: h */
    protected final C7743ti f13802h;

    /* renamed from: i */
    protected final C3588d f13803i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC3476a(ViewTreeObserver$OnGlobalLayoutListenerC3787v viewTreeObserver$OnGlobalLayoutListenerC3787v, @Nullable C3703r c3703r, C3588d c3588d) {
        this.f13800f = viewTreeObserver$OnGlobalLayoutListenerC3787v;
        this.f13799e = c3703r == null ? new C3703r(this) : c3703r;
        this.f13803i = c3588d;
        C3779u.m26890e().m18336b(this.f13800f.f14764c);
        C3779u.m26886i().m18460a(this.f13800f.f14764c, this.f13800f.f14766e);
        C3779u.m26885j().m27663a(this.f13800f.f14764c);
        this.f13802h = C3779u.m26886i().m18431p();
        C3779u.m26887h().m13558a(this.f13800f.f14764c);
        m27675u();
    }

    /* renamed from: a */
    private TimerTask m27686a(final Timer timer, final CountDownLatch countDownLatch) {
        return new TimerTask() { // from class: com.google.android.gms.ads.internal.a.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (C7788uf.f25817bV.m13486c().intValue() != countDownLatch.getCount()) {
                    abr.a("Stopping method tracing");
                    Debug.stopMethodTracing();
                    if (countDownLatch.getCount() == 0) {
                        timer.cancel();
                        return;
                    }
                }
                String concat = String.valueOf(AbstractBinderC3476a.this.f13800f.f14764c.getPackageName()).concat("_adsTrace_");
                try {
                    abr.a("Starting method tracing");
                    countDownLatch.countDown();
                    Debug.startMethodTracing(new StringBuilder(String.valueOf(concat).length() + 20).append(concat).append(C3779u.m26884k().mo16434a()).toString(), C7788uf.f25818bW.m13486c().intValue());
                } catch (Exception e) {
                    abr.d("Exception occurred while starting method tracing.", e);
                }
            }
        };
    }

    /* renamed from: d */
    private AdRequestParcel m27682d(AdRequestParcel adRequestParcel) {
        return (!C4686i.m23135b(this.f13800f.f14764c) || adRequestParcel.f13855k == null) ? adRequestParcel : new C3584w(adRequestParcel).m27418a(null).m27419a();
    }

    /* renamed from: d */
    private void m27681d(abi abiVar) {
        if (!C3779u.m26882m().m18263b() || abiVar.f20892H || TextUtils.isEmpty(abiVar.f20888D)) {
            return;
        }
        abr.a("Sending troubleshooting signals to the server.");
        C3779u.m26882m().m18266a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, abiVar.f20888D, this.f13800f.f14763b);
        abiVar.f20892H = true;
    }

    /* renamed from: u */
    private void m27675u() {
        if (C7788uf.f25815bT.m13486c().booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(m27686a(timer, new CountDownLatch(C7788uf.f25817bV.m13486c().intValue())), 0L, C7788uf.f25816bU.m13486c().longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle m27687a(@Nullable C7760tq c7760tq) {
        String str;
        String m18438i;
        if (c7760tq == null) {
            return null;
        }
        if (c7760tq.m13531f()) {
            c7760tq.m13533d();
        }
        C7754tn m13534c = c7760tq.m13534c();
        if (m13534c != null) {
            m18438i = m13534c.m13573b();
            str = m13534c.m13571c();
            String valueOf = String.valueOf(m13534c.toString());
            abr.a(valueOf.length() != 0 ? "In AdManager: loadAd, ".concat(valueOf) : new String("In AdManager: loadAd, "));
            if (m18438i != null) {
                C3779u.m26886i().m18454a(m18438i);
            }
        } else {
            str = null;
            m18438i = C3779u.m26886i().m18438i();
        }
        if (m18438i == null) {
            return null;
        }
        Bundle bundle = new Bundle(1);
        bundle.putString("fingerprint", m18438i);
        if (m18438i.equals(str)) {
            return bundle;
        }
        bundle.putString("v_fp", str);
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public AbstractC4170e mo13193a() {
        C4588d.m23620b("getAdFrame must be called on the main UI thread.");
        return BinderC4173f.m25293a(this.f13800f.f14767f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m27690a(int i) {
        abr.d(new StringBuilder(30).append("Failed to load ad: ").append(i).toString());
        this.f13798d = false;
        if (this.f13800f.f14775n != null) {
            try {
                this.f13800f.f14775n.mo13230a(i);
            } catch (RemoteException e) {
                abr.d("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        if (this.f13800f.f14787z != null) {
            try {
                this.f13800f.f14787z.mo13239a(i);
            } catch (RemoteException e2) {
                abr.d("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m27689a(View view) {
        ViewTreeObserver$OnGlobalLayoutListenerC3787v.C3788a c3788a = this.f13800f.f14767f;
        if (c3788a != null) {
            c3788a.addView(view, C3779u.m26888g().mo18284d());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13191a(AdSizeParcel adSizeParcel) {
        C4588d.m23620b("setAdSize must be called on the main UI thread.");
        this.f13800f.f14770i = adSizeParcel;
        if (this.f13800f.f14771j != null && this.f13800f.f14771j.f20895b != null && this.f13800f.f14752E == 0) {
            this.f13800f.f14771j.f20895b.mo18117a(adSizeParcel);
        }
        if (this.f13800f.f14767f == null) {
            return;
        }
        if (this.f13800f.f14767f.getChildCount() > 1) {
            this.f13800f.f14767f.removeView(this.f13800f.f14767f.getNextView());
        }
        this.f13800f.f14767f.setMinimumWidth(adSizeParcel.f13869g);
        this.f13800f.f14767f.setMinimumHeight(adSizeParcel.f13866d);
        this.f13800f.f14767f.requestLayout();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13190a(@Nullable VideoOptionsParcel videoOptionsParcel) {
        C4588d.m23620b("setVideoOptions must be called on the main UI thread.");
        this.f13800f.f14785x = videoOptionsParcel;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13189a(AbstractC3517af abstractC3517af) {
        C4588d.m23620b("setAdListener must be called on the main UI thread.");
        this.f13800f.f14774m = abstractC3517af;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13188a(AbstractC3520ag abstractC3520ag) {
        C4588d.m23620b("setAdListener must be called on the main UI thread.");
        this.f13800f.f14775n = abstractC3520ag;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13187a(AbstractC3538am abstractC3538am) {
        C4588d.m23620b("setAppEventListener must be called on the main UI thread.");
        this.f13800f.f14776o = abstractC3538am;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13186a(AbstractC3544ao abstractC3544ao) {
        C4588d.m23620b("setCorrelationIdProvider must be called on the main UI thread");
        this.f13800f.f14777p = abstractC3544ao;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13185a(AbstractC3755d abstractC3755d) {
        C4588d.m23620b("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f13800f.f14787z = abstractC3755d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m27688a(@Nullable RewardItemParcel rewardItemParcel) {
        if (this.f13800f.f14787z == null) {
            return;
        }
        String str = "";
        int i = 0;
        if (rewardItemParcel != null) {
            try {
                str = rewardItemParcel.f14674b;
                i = rewardItemParcel.f14675c;
            } catch (RemoteException e) {
                abr.d("Could not call RewardedVideoAdListener.onRewarded().", e);
                return;
            }
        }
        this.f13800f.f14787z.mo13238a(new aas(str, i));
    }

    @Override // com.google.android.gms.ads.internal.request.C3708a.AbstractC3709a
    /* renamed from: a */
    public void mo27033a(abi.C6129a c6129a) {
        if (c6129a.f20921b.f14578n != -1 && !TextUtils.isEmpty(c6129a.f20921b.f14589y)) {
            long m27685b = m27685b(c6129a.f20921b.f14589y);
            if (m27685b != -1) {
                this.f13795a.m13436a(this.f13795a.m13438a(m27685b + c6129a.f20921b.f14578n), "stc");
            }
        }
        this.f13795a.m13434a(c6129a.f20921b.f14589y);
        this.f13795a.m13436a(this.f13796b, "arf");
        this.f13797c = this.f13795a.m13439a();
        this.f13795a.m13433a("gqi", c6129a.f20921b.f14590z);
        this.f13800f.f14768g = null;
        this.f13800f.f14772k = c6129a;
        mo18575a(c6129a, this.f13795a);
    }

    /* renamed from: a */
    protected abstract void mo18575a(abi.C6129a c6129a, C7801un c7801un);

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13184a(AbstractC7807ur abstractC7807ur) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13183a(AbstractC8082yy abstractC8082yy) {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13182a(AbstractC8096zd abstractC8096zd, String str) {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13181a(String str) {
        abr.d("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    @Override // com.google.android.gms.internal.AbstractC7857vp
    /* renamed from: a */
    public void mo13319a(String str, @Nullable String str2) {
        if (this.f13800f.f14776o != null) {
            try {
                this.f13800f.f14776o.mo13243a(str, str2);
            } catch (RemoteException e) {
                abr.d("Could not call the AppEventListener.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.abn
    /* renamed from: a */
    public void mo18419a(HashSet<abj> hashSet) {
        this.f13800f.m26834a(hashSet);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13180a(boolean z) {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public boolean mo13192a(AdRequestParcel adRequestParcel) {
        C4588d.m23620b("loadAd must be called on the main UI thread.");
        C3779u.m26885j().m27664a();
        if (C7788uf.f25788at.m13486c().booleanValue()) {
            AdRequestParcel.m27640a(adRequestParcel);
        }
        AdRequestParcel m27682d = m27682d(adRequestParcel);
        if (this.f13800f.f14768g != null || this.f13800f.f14769h != null) {
            if (this.f13801g != null) {
                abr.d("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            } else {
                abr.d("Loading already in progress, saving this object for future refreshes.");
            }
            this.f13801g = m27682d;
            return false;
        }
        abr.c("Starting ad request.");
        m27679o();
        this.f13796b = this.f13795a.m13439a();
        if (!m27682d.f13850f) {
            String valueOf = String.valueOf(C3514ac.m27586a().m26866a(this.f13800f.f14764c));
            abr.c(new StringBuilder(String.valueOf(valueOf).length() + 71).append("Use AdRequest.Builder.addTestDevice(\"").append(valueOf).append("\") to get test ads on this device.").toString());
        }
        this.f13799e.m27049a(m27682d);
        this.f13798d = mo27303a(m27682d, this.f13795a);
        return this.f13798d;
    }

    /* renamed from: a */
    protected abstract boolean mo27303a(AdRequestParcel adRequestParcel, C7801un c7801un);

    /* renamed from: a */
    boolean mo27672a(abi abiVar) {
        return false;
    }

    /* renamed from: a */
    protected abstract boolean mo18574a(@Nullable abi abiVar, abi abiVar2);

    /* renamed from: b */
    long m27685b(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException e) {
            abr.d("Invalid index for Url fetch time in CSI latency info.");
            return -1L;
        } catch (NumberFormatException e2) {
            abr.d("Cannot find valid format of Url fetch time in CSI latency info.");
            return -1L;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: b */
    public void mo13179b() {
        C4588d.m23620b("destroy must be called on the main UI thread.");
        this.f13799e.m27050a();
        this.f13802h.m13594c(this.f13800f.f14771j);
        this.f13800f.m26823j();
    }

    @Override // com.google.android.gms.internal.C8113zn.AbstractC8114a
    /* renamed from: b */
    public void mo12799b(abi abiVar) {
        this.f13795a.m13436a(this.f13797c, "awr");
        this.f13800f.f14769h = null;
        if (abiVar.f20897d != -2 && abiVar.f20897d != 3) {
            C3779u.m26886i().m18450a(this.f13800f.m26835a());
        }
        if (abiVar.f20897d == -1) {
            this.f13798d = false;
            return;
        }
        if (mo27672a(abiVar)) {
            abr.a("Ad refresh scheduled.");
        }
        if (abiVar.f20897d != -2) {
            m27690a(abiVar.f20897d);
            return;
        }
        if (this.f13800f.f14750C == null) {
            this.f13800f.f14750C = new abo(this.f13800f.f14763b);
        }
        this.f13802h.m13595b(this.f13800f.f14771j);
        if (mo18574a(this.f13800f.f14771j, abiVar)) {
            this.f13800f.f14771j = abiVar;
            this.f13800f.m26824i();
            this.f13795a.m13433a("is_mraid", this.f13800f.f14771j.m18486a() ? "1" : "0");
            this.f13795a.m13433a("is_mediation", this.f13800f.f14771j.f20907n ? "1" : "0");
            if (this.f13800f.f14771j.f20895b != null && this.f13800f.f14771j.f20895b.mo18084l() != null) {
                this.f13795a.m13433a("is_delay_pl", this.f13800f.f14771j.f20895b.mo18084l().m18156f() ? "1" : "0");
            }
            this.f13795a.m13436a(this.f13796b, "ttc");
            if (C3779u.m26886i().m18442e() != null) {
                C3779u.m26886i().m18442e().m13460a(this.f13795a);
            }
            if (this.f13800f.m26828e()) {
                mo27297s();
            }
        }
        if (abiVar.f20893I == null) {
            return;
        }
        C3779u.m26890e().m18365a(this.f13800f.f14764c, abiVar.f20893I);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo27671b(AdRequestParcel adRequestParcel) {
        if (this.f13800f.f14767f == null) {
            return false;
        }
        ViewParent parent = this.f13800f.f14767f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return C3779u.m26890e().m18358a(view, view.getContext());
    }

    /* renamed from: c */
    public void m27684c(AdRequestParcel adRequestParcel) {
        if (mo27671b(adRequestParcel)) {
            mo13192a(adRequestParcel);
            return;
        }
        abr.c("Ad is not visible. Not refreshing ad.");
        this.f13799e.m27044b(adRequestParcel);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m27683c(@Nullable abi abiVar) {
        if (abiVar == null) {
            abr.d("Ad state was null when trying to ping impression URLs.");
            return;
        }
        abr.a("Pinging Impression URLs.");
        if (this.f13800f.f14773l != null) {
            this.f13800f.f14773l.m18484a();
        }
        if (abiVar.f20898e == null || abiVar.f20890F) {
            return;
        }
        C3779u.m26890e().m18368a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, abiVar.f20898e);
        abiVar.f20890F = true;
        m27681d(abiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: c */
    public boolean mo13177c() {
        C4588d.m23620b("isLoaded must be called on the main UI thread.");
        return this.f13800f.f14768g == null && this.f13800f.f14769h == null && this.f13800f.f14771j != null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: d */
    public void mo13175d() {
        C4588d.m23620b("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3501a
    /* renamed from: e */
    public void mo27632e() {
        if (this.f13800f.f14771j == null) {
            abr.d("Ad state was null when trying to ping click URLs.");
            return;
        }
        abr.a("Pinging click URLs.");
        if (this.f13800f.f14773l != null) {
            this.f13800f.f14773l.m18480b();
        }
        if (this.f13800f.f14771j.f20896c != null) {
            C3779u.m26890e().m18368a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, this.f13800f.f14771j.f20896c);
        }
        if (this.f13800f.f14774m == null) {
            return;
        }
        try {
            this.f13800f.f14774m.mo13241a();
        } catch (RemoteException e) {
            abr.d("Could not notify onAdClicked event.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: h */
    public void mo13173h() {
        C4588d.m23620b("recordManualImpression must be called on the main UI thread.");
        if (this.f13800f.f14771j == null) {
            abr.d("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        abr.a("Pinging manual tracking URLs.");
        if (this.f13800f.f14771j.f20899f == null || this.f13800f.f14771j.f20891G) {
            return;
        }
        C3779u.m26890e().m18368a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, this.f13800f.f14771j.f20899f);
        this.f13800f.f14771j.f20891G = true;
        m27681d(this.f13800f.f14771j);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: h_ */
    public void mo13172h_() {
        C4588d.m23620b("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    @Nullable
    /* renamed from: i */
    public AdSizeParcel mo13171i() {
        C4588d.m23620b("getAdSize must be called on the main UI thread.");
        if (this.f13800f.f14770i == null) {
            return null;
        }
        return new ThinAdSizeParcel(this.f13800f.f14770i);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: k */
    public boolean mo13169k() {
        return this.f13798d;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: l */
    public AbstractC3553c mo13168l() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: l_ */
    public void mo13167l_() {
        C4588d.m23620b("stopLoading must be called on the main UI thread.");
        this.f13798d = false;
        this.f13800f.m26833a(true);
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3670p
    /* renamed from: m */
    public void mo27170m() {
        m27678q();
    }

    /* renamed from: n */
    public C3588d m27680n() {
        return this.f13803i;
    }

    /* renamed from: o */
    public void m27679o() {
        this.f13795a = new C7801un(C7788uf.f25729N.m13486c().booleanValue(), "load_ad", this.f13800f.f14770i.f13864b);
        this.f13796b = new C7799ul(-1L, null, null);
        this.f13797c = new C7799ul(-1L, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void mo27298p() {
        abr.c("Ad closing.");
        if (this.f13800f.f14775n != null) {
            try {
                this.f13800f.f14775n.mo13231a();
            } catch (RemoteException e) {
                abr.d("Could not call AdListener.onAdClosed().", e);
            }
        }
        if (this.f13800f.f14787z != null) {
            try {
                this.f13800f.f14787z.mo13235d();
            } catch (RemoteException e2) {
                abr.d("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public void m27678q() {
        abr.c("Ad leaving application.");
        if (this.f13800f.f14775n != null) {
            try {
                this.f13800f.f14775n.mo13229b();
            } catch (RemoteException e) {
                abr.d("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        if (this.f13800f.f14787z != null) {
            try {
                this.f13800f.f14787z.mo13234e();
            } catch (RemoteException e2) {
                abr.d("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void m27677r() {
        abr.c("Ad opening.");
        if (this.f13800f.f14775n != null) {
            try {
                this.f13800f.f14775n.mo13227d();
            } catch (RemoteException e) {
                abr.d("Could not call AdListener.onAdOpened().", e);
            }
        }
        if (this.f13800f.f14787z != null) {
            try {
                this.f13800f.f14787z.mo13237b();
            } catch (RemoteException e2) {
                abr.d("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public void mo27297s() {
        abr.c("Ad finished loading.");
        this.f13798d = false;
        if (this.f13800f.f14775n != null) {
            try {
                this.f13800f.f14775n.mo13228c();
            } catch (RemoteException e) {
                abr.d("Could not call AdListener.onAdLoaded().", e);
            }
        }
        if (this.f13800f.f14787z != null) {
            try {
                this.f13800f.f14787z.mo13240a();
            } catch (RemoteException e2) {
                abr.d("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public void m27676t() {
        if (this.f13800f.f14787z == null) {
            return;
        }
        try {
            this.f13800f.f14787z.mo13236c();
        } catch (RemoteException e) {
            abr.d("Could not call RewardedVideoAdListener.onVideoStarted().", e);
        }
    }
}
