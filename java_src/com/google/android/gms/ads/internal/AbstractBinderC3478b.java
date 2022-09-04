package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.overlay.AbstractC3659g;
import com.google.android.gms.ads.internal.purchase.AbstractC3695j;
import com.google.android.gms.ads.internal.purchase.BinderC3687d;
import com.google.android.gms.ads.internal.purchase.C3689f;
import com.google.android.gms.ads.internal.purchase.C3696k;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.ServiceConnectionC3685c;
import com.google.android.gms.ads.internal.purchase.ServiceConnectionC3690g;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7885vv;
import com.google.android.gms.internal.AbstractC7991xi;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.AbstractC8082yy;
import com.google.android.gms.internal.AbstractC8096zd;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.C7801un;
import com.google.android.gms.internal.HandlerC8075yv;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abj;
import com.google.android.gms.internal.abk;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Future;
@aaa
/* renamed from: com.google.android.gms.ads.internal.b */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3478b extends AbstractBinderC3476a implements AbstractC3659g, AbstractC3695j, AbstractC3768s, AbstractC7885vv, AbstractC7991xi {

    /* renamed from: j */
    protected final AbstractC8005xq f13807j;

    /* renamed from: k */
    protected transient boolean f13808k;

    /* renamed from: l */
    private final Messenger f13809l;

    public AbstractBinderC3478b(Context context, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, VersionInfoParcel versionInfoParcel, C3588d c3588d) {
        this(new ViewTreeObserver$OnGlobalLayoutListenerC3787v(context, adSizeParcel, str, versionInfoParcel), abstractC8005xq, null, c3588d);
    }

    protected AbstractBinderC3478b(ViewTreeObserver$OnGlobalLayoutListenerC3787v viewTreeObserver$OnGlobalLayoutListenerC3787v, AbstractC8005xq abstractC8005xq, @Nullable C3703r c3703r, C3588d c3588d) {
        super(viewTreeObserver$OnGlobalLayoutListenerC3787v, c3703r, c3588d);
        this.f13807j = abstractC8005xq;
        this.f13809l = new Messenger(new HandlerC8075yv(this.f13800f.f14764c));
        this.f13808k = false;
    }

    /* renamed from: a */
    private AdRequestInfoParcel.C3706a m27673a(AdRequestParcel adRequestParcel, Bundle bundle, abk abkVar) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo = this.f13800f.f14764c.getApplicationInfo();
        try {
            packageInfo = this.f13800f.f14764c.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.f13800f.f14764c.getResources().getDisplayMetrics();
        Bundle bundle2 = null;
        if (this.f13800f.f14767f != null && this.f13800f.f14767f.getParent() != null) {
            int[] iArr = new int[2];
            this.f13800f.f14767f.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int width = this.f13800f.f14767f.getWidth();
            int height = this.f13800f.f14767f.getHeight();
            int i3 = 0;
            if (this.f13800f.f14767f.isShown() && i + width > 0 && i2 + height > 0 && i <= displayMetrics.widthPixels && i2 <= displayMetrics.heightPixels) {
                i3 = 1;
            }
            bundle2 = new Bundle(5);
            bundle2.putInt("x", i);
            bundle2.putInt("y", i2);
            bundle2.putInt(FimiMediaMeta.IJKM_KEY_WIDTH, width);
            bundle2.putInt(FimiMediaMeta.IJKM_KEY_HEIGHT, height);
            bundle2.putInt("visible", i3);
        }
        String m18446c = C3779u.m26886i().m18446c();
        this.f13800f.f14773l = new abj(m18446c, this.f13800f.f14763b);
        this.f13800f.f14773l.m18482a(adRequestParcel);
        String m18375a = C3779u.m26890e().m18375a(this.f13800f.f14764c, this.f13800f.f14767f, this.f13800f.f14770i);
        long j = 0;
        if (this.f13800f.f14777p != null) {
            try {
                j = this.f13800f.f14777p.mo27565b();
            } catch (RemoteException e2) {
                abr.d("Cannot get correlation id, default to 0.");
            }
        }
        String uuid = UUID.randomUUID().toString();
        Bundle m18459a = C3779u.m26886i().m18459a(this.f13800f.f14764c, this, m18446c);
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= this.f13800f.f14783v.size()) {
                break;
            }
            arrayList.add(this.f13800f.f14783v.keyAt(i5));
            i4 = i5 + 1;
        }
        boolean z = this.f13800f.f14778q != null;
        boolean z2 = this.f13800f.f14779r != null && C3779u.m26886i().m18429r();
        boolean mo27161a = this.f13803i.f14061c.mo27161a(this.f13800f.f14764c);
        String str = "";
        if (C7788uf.f25880cu.m13486c().booleanValue()) {
            abr.a("Getting webview cookie from CookieManager.");
            CookieManager mo18282b = C3779u.m26888g().mo18282b(this.f13800f.f14764c);
            if (mo18282b != null) {
                str = mo18282b.getCookie("googleads.g.doubleclick.net");
            }
        }
        String str2 = null;
        if (abkVar != null) {
            str2 = abkVar.m18467c();
        }
        return new AdRequestInfoParcel.C3706a(bundle2, adRequestParcel, this.f13800f.f14770i, this.f13800f.f14763b, applicationInfo, packageInfo, m18446c, C3779u.m26886i().m18464a(), this.f13800f.f14766e, m18459a, this.f13800f.f14748A, arrayList, bundle, C3779u.m26886i().m18440g(), this.f13809l, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density, m18375a, j, uuid, C7788uf.m13471a(), this.f13800f.f14762a, this.f13800f.f14784w, new CapabilityParcel(z, z2, mo27161a), this.f13800f.m26825h(), C3779u.m26890e().m18316g(), C3779u.m26890e().m18314h(), C3779u.m26890e().m18309k(this.f13800f.f14764c), C3779u.m26890e().m18332b(this.f13800f.f14767f), this.f13800f.f14764c instanceof Activity, C3779u.m26886i().m18436k(), str, str2, C3779u.m26886i().m18433n(), C3779u.m26898B().m13271a(), C3779u.m26890e().m18312i(), C3779u.m26882m().m18270a());
    }

    @Override // com.google.android.gms.internal.AbstractC7991xi
    /* renamed from: A */
    public void mo13106A() {
        m27674B();
    }

    /* renamed from: B */
    public void m27674B() {
        mo27401a(this.f13800f.f14771j, false);
    }

    @Override // com.google.android.gms.ads.internal.AbstractC3768s
    /* renamed from: C */
    public void mo18139C() {
        C3779u.m26890e().m18348a(new Runnable() { // from class: com.google.android.gms.ads.internal.b.2
            @Override // java.lang.Runnable
            public void run() {
                AbstractBinderC3478b.this.f13799e.m27045b();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.AbstractC3768s
    /* renamed from: D */
    public void mo18138D() {
        C3779u.m26890e().m18348a(new Runnable() { // from class: com.google.android.gms.ads.internal.b.3
            @Override // java.lang.Runnable
            public void run() {
                AbstractBinderC3478b.this.f13799e.m27043c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27401a(@Nullable abi abiVar, boolean z) {
        if (abiVar == null) {
            abr.d("Ad state was null when trying to ping impression URLs.");
            return;
        }
        super.m27683c(abiVar);
        if (abiVar.f20911r != null && abiVar.f20911r.f26235d != null) {
            C3779u.m26871x().m13071a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, abiVar, this.f13800f.f14763b, z, abiVar.f20911r.f26235d);
        }
        if (abiVar.f20908o == null || abiVar.f20908o.f26222g == null) {
            return;
        }
        C3779u.m26871x().m13071a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, abiVar, this.f13800f.f14763b, z, abiVar.f20908o.f26222g);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13183a(AbstractC8082yy abstractC8082yy) {
        C4588d.m23620b("setInAppPurchaseListener must be called on the main UI thread.");
        this.f13800f.f14778q = abstractC8082yy;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13182a(AbstractC8096zd abstractC8096zd, @Nullable String str) {
        C4588d.m23620b("setPlayStorePurchaseParams must be called on the main UI thread.");
        this.f13800f.f14749B = new C3696k(str);
        this.f13800f.f14779r = abstractC8096zd;
        if (C3779u.m26886i().m18441f() || abstractC8096zd == null) {
            return;
        }
        Future future = (Future) new ServiceConnectionC3685c(this.f13800f.f14764c, this.f13800f.f14779r, this.f13800f.f14749B).mo12820e();
    }

    @Override // com.google.android.gms.internal.AbstractC7885vv
    /* renamed from: a */
    public void mo13296a(String str, ArrayList<String> arrayList) {
        BinderC3687d binderC3687d = new BinderC3687d(str, arrayList, this.f13800f.f14764c, this.f13800f.f14766e.f14733b);
        if (this.f13800f.f14778q != null) {
            try {
                this.f13800f.f14778q.mo12836a(binderC3687d);
                return;
            } catch (RemoteException e) {
                abr.d("Could not start In-App purchase.");
                return;
            }
        }
        abr.d("InAppPurchaseListener is not set. Try to launch default purchase flow.");
        if (!C3514ac.m27586a().m26853b(this.f13800f.f14764c)) {
            abr.d("Google Play Service unavailable, cannot launch default purchase flow.");
        } else if (this.f13800f.f14779r == null) {
            abr.d("PlayStorePurchaseListener is not set.");
        } else if (this.f13800f.f14749B == null) {
            abr.d("PlayStorePurchaseVerifier is not initialized.");
        } else if (this.f13800f.f14753F) {
            abr.d("An in-app purchase request is already in progress, abort");
        } else {
            this.f13800f.f14753F = true;
            try {
                if (!this.f13800f.f14779r.mo12824a(str)) {
                    this.f13800f.f14753F = false;
                } else {
                    C3779u.m26876s().m27082a(this.f13800f.f14764c, this.f13800f.f14766e.f14736e, new GInAppPurchaseManagerInfoParcel(this.f13800f.f14764c, this.f13800f.f14749B, binderC3687d, this));
                }
            } catch (RemoteException e2) {
                abr.d("Could not start In-App purchase.");
                this.f13800f.f14753F = false;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.purchase.AbstractC3695j
    /* renamed from: a */
    public void mo27075a(String str, boolean z, int i, final Intent intent, C3689f c3689f) {
        try {
            if (this.f13800f.f14779r != null) {
                this.f13800f.f14779r.mo12825a(new ServiceConnectionC3690g(this.f13800f.f14764c, str, z, i, intent, c3689f));
            }
        } catch (RemoteException e) {
            abr.d("Fail to invoke PlayStorePurchaseListener.");
        }
        abv.f21039a.postDelayed(new Runnable() { // from class: com.google.android.gms.ads.internal.b.1
            @Override // java.lang.Runnable
            public void run() {
                int m27081a = C3779u.m26876s().m27081a(intent);
                C3779u.m26876s();
                if (m27081a == 0 && AbstractBinderC3478b.this.f13800f.f14771j != null && AbstractBinderC3478b.this.f13800f.f14771j.f20895b != null && AbstractBinderC3478b.this.f13800f.f14771j.f20895b.mo18087i() != null) {
                    AbstractBinderC3478b.this.f13800f.f14771j.f20895b.mo18087i().m27233a();
                }
                AbstractBinderC3478b.this.f13800f.f14753F = false;
            }
        }, 500L);
    }

    /* renamed from: a */
    protected boolean mo18578a(AdRequestParcel adRequestParcel, abi abiVar, boolean z) {
        if (!z && this.f13800f.m26828e()) {
            if (abiVar.f20901h > 0) {
                this.f13799e.m27048a(adRequestParcel, abiVar.f20901h);
            } else if (abiVar.f20911r != null && abiVar.f20911r.f26240i > 0) {
                this.f13799e.m27048a(adRequestParcel, abiVar.f20911r.f26240i);
            } else if (!abiVar.f20907n && abiVar.f20897d == 2) {
                this.f13799e.m27044b(adRequestParcel);
            }
        }
        return this.f13799e.m27042d();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    public boolean mo27303a(AdRequestParcel adRequestParcel, C7801un c7801un) {
        abk abkVar;
        String str = null;
        if (!mo27395u()) {
            return false;
        }
        Bundle a = a(C3779u.m26886i().m18461a(this.f13800f.f14764c));
        this.f13799e.m27050a();
        this.f13800f.f14752E = 0;
        if (C7788uf.f25863cd.m13486c().booleanValue()) {
            abkVar = C3779u.m26886i().m18432o();
            C3619g m26899A = C3779u.m26899A();
            Context context = this.f13800f.f14764c;
            VersionInfoParcel versionInfoParcel = this.f13800f.f14766e;
            if (abkVar != null) {
                str = abkVar.m18466d();
            }
            m26899A.m27342a(context, versionInfoParcel, false, abkVar, str, this.f13800f.f14763b);
        } else {
            abkVar = null;
        }
        AdRequestInfoParcel.C3706a m27673a = m27673a(adRequestParcel, a, abkVar);
        c7801un.m13433a("seq_num", m27673a.f14530g);
        c7801un.m13433a("request_id", m27673a.f14545v);
        c7801un.m13433a("session_id", m27673a.f14531h);
        if (m27673a.f14529f != null) {
            c7801un.m13433a(Constants.EXTRA_KEY_APP_VERSION, String.valueOf(m27673a.f14529f.versionCode));
        }
        this.f13800f.f14768g = C3779u.m26895a().m27034a(this.f13800f.f14764c, m27673a, this.f13800f.f14765d, this);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    boolean mo27672a(abi abiVar) {
        AdRequestParcel adRequestParcel;
        boolean z = false;
        if (this.f13801g != null) {
            adRequestParcel = this.f13801g;
            this.f13801g = null;
        } else {
            adRequestParcel = abiVar.f20894a;
            if (adRequestParcel.f13847c != null) {
                z = adRequestParcel.f13847c.getBoolean("_noRefresh", false);
            }
        }
        return mo18578a(adRequestParcel, abiVar, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    public boolean mo18574a(@Nullable abi abiVar, abi abiVar2) {
        int i;
        int i2 = 0;
        if (abiVar != null && abiVar.f20912s != null) {
            abiVar.f20912s.m13100a((AbstractC7991xi) null);
        }
        if (abiVar2.f20912s != null) {
            abiVar2.f20912s.m13100a((AbstractC7991xi) this);
        }
        if (abiVar2.f20911r != null) {
            i = abiVar2.f20911r.f26246o;
            i2 = abiVar2.f20911r.f26247p;
        } else {
            i = 0;
        }
        this.f13800f.f14750C.m18417a(i, i2);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.internal.C8113zn.AbstractC8114a
    /* renamed from: b */
    public void mo12799b(abi abiVar) {
        super.mo12799b(abiVar);
        if (abiVar.f20908o != null) {
            abr.a("Pinging network fill URLs.");
            C3779u.m26871x().m13071a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, abiVar, this.f13800f.f14763b, false, abiVar.f20908o.f26223h);
            if (abiVar.f20911r != null && abiVar.f20911r.f26237f != null && abiVar.f20911r.f26237f.size() > 0) {
                abr.a("Pinging urls remotely");
                C3779u.m26890e().m18365a(this.f13800f.f14764c, abiVar.f20911r.f26237f);
            }
        }
        if (abiVar.f20897d != 3 || abiVar.f20911r == null || abiVar.f20911r.f26236e == null) {
            return;
        }
        abr.a("Pinging no fill URLs.");
        C3779u.m26871x().m13071a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, abiVar, this.f13800f.f14763b, false, abiVar.f20911r.f26236e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: b */
    public boolean mo27671b(AdRequestParcel adRequestParcel) {
        return super.mo27671b(adRequestParcel) && !this.f13808k;
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: d */
    public void mo13175d() {
        C4588d.m23620b("pause must be called on the main UI thread.");
        if (this.f13800f.f14771j != null && this.f13800f.f14771j.f20895b != null && this.f13800f.m26828e()) {
            C3779u.m26888g().m18304a(this.f13800f.f14771j.f20895b);
        }
        if (this.f13800f.f14771j != null && this.f13800f.f14771j.f20909p != null) {
            try {
                this.f13800f.f14771j.f20909p.mo12964d();
            } catch (RemoteException e) {
                abr.d("Could not pause mediation adapter.");
            }
        }
        this.f13802h.m13593d(this.f13800f.f14771j);
        this.f13799e.m27045b();
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3501a
    /* renamed from: e */
    public void mo27632e() {
        if (this.f13800f.f14771j == null) {
            abr.d("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (this.f13800f.f14771j.f20911r != null && this.f13800f.f14771j.f20911r.f26234c != null) {
            C3779u.m26871x().m13071a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, this.f13800f.f14771j, this.f13800f.f14763b, false, this.f13800f.f14771j.f20911r.f26234c);
        }
        if (this.f13800f.f14771j.f20908o != null && this.f13800f.f14771j.f20908o.f26221f != null) {
            C3779u.m26871x().m13071a(this.f13800f.f14764c, this.f13800f.f14766e.f14733b, this.f13800f.f14771j, this.f13800f.f14763b, false, this.f13800f.f14771j.f20908o.f26221f);
        }
        super.mo27632e();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: f */
    public void mo13174f() {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
    /* renamed from: g */
    public void mo12933g() {
        this.f13802h.m13592e(this.f13800f.f14771j);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: h_ */
    public void mo13172h_() {
        C4588d.m23620b("resume must be called on the main UI thread.");
        acy acyVar = null;
        if (this.f13800f.f14771j != null && this.f13800f.f14771j.f20895b != null) {
            acyVar = this.f13800f.f14771j.f20895b;
        }
        if (acyVar != null && this.f13800f.m26828e()) {
            C3779u.m26888g().m18303b(this.f13800f.f14771j.f20895b);
        }
        if (this.f13800f.f14771j != null && this.f13800f.f14771j.f20909p != null) {
            try {
                this.f13800f.f14771j.f20909p.mo12963e();
            } catch (RemoteException e) {
                abr.d("Could not resume mediation adapter.");
            }
        }
        if (acyVar == null || !acyVar.mo18075u()) {
            this.f13799e.m27043c();
        }
        this.f13802h.m13592e(this.f13800f.f14771j);
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
    /* renamed from: i_ */
    public void mo12932i_() {
        this.f13802h.m13595b(this.f13800f.f14771j);
        this.f13808k = false;
        p();
        this.f13800f.f14773l.m18477c();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: j */
    public String mo13170j() {
        if (this.f13800f.f14771j == null) {
            return null;
        }
        return this.f13800f.f14771j.f20910q;
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
    /* renamed from: j_ */
    public void mo12931j_() {
        this.f13808k = true;
        r();
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
    /* renamed from: k_ */
    public void mo12930k_() {
        this.f13802h.m13593d(this.f13800f.f14771j);
    }

    /* renamed from: u */
    protected boolean mo27395u() {
        return C3779u.m26890e().m18364a(this.f13800f.f14764c.getPackageManager(), this.f13800f.f14764c.getPackageName(), "android.permission.INTERNET") && C3779u.m26890e().m18378a(this.f13800f.f14764c);
    }

    @Override // com.google.android.gms.internal.AbstractC7991xi
    /* renamed from: v */
    public void mo13105v() {
        mo27632e();
    }

    @Override // com.google.android.gms.internal.AbstractC7991xi
    /* renamed from: w */
    public void mo13104w() {
        mo12932i_();
    }

    @Override // com.google.android.gms.internal.AbstractC7991xi
    /* renamed from: x */
    public void mo13103x() {
        m();
    }

    @Override // com.google.android.gms.internal.AbstractC7991xi
    /* renamed from: y */
    public void mo13102y() {
        mo12931j_();
    }

    @Override // com.google.android.gms.internal.AbstractC7991xi
    /* renamed from: z */
    public void mo13101z() {
        if (this.f13800f.f14771j != null) {
            String str = this.f13800f.f14771j.f20910q;
            abr.d(new StringBuilder(String.valueOf(str).length() + 74).append("Mediation adapter ").append(str).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        mo27401a(this.f13800f.f14771j, true);
        s();
    }
}
