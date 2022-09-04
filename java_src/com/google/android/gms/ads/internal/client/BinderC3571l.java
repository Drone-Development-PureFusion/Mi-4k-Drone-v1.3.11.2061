package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AbstractC3532ak;
import com.google.android.gms.ads.internal.reward.client.AbstractC3755d;
import com.google.android.gms.ads.internal.util.client.C3780a;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.internal.AbstractC7807ur;
import com.google.android.gms.internal.AbstractC8082yy;
import com.google.android.gms.internal.AbstractC8096zd;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.ads.internal.client.l */
/* loaded from: classes2.dex */
public class BinderC3571l extends AbstractC3532ak.AbstractBinderC3533a {

    /* renamed from: a */
    private AbstractC3520ag f14032a;

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public AbstractC4170e mo13193a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13191a(AdSizeParcel adSizeParcel) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13190a(VideoOptionsParcel videoOptionsParcel) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13189a(AbstractC3517af abstractC3517af) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13188a(AbstractC3520ag abstractC3520ag) {
        this.f14032a = abstractC3520ag;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13187a(AbstractC3538am abstractC3538am) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13186a(AbstractC3544ao abstractC3544ao) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13185a(AbstractC3755d abstractC3755d) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13184a(AbstractC7807ur abstractC7807ur) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13183a(AbstractC8082yy abstractC8082yy) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13182a(AbstractC8096zd abstractC8096zd, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13181a(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13180a(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public boolean mo13192a(AdRequestParcel adRequestParcel) {
        C3784b.m26844b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.l.1
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC3571l.this.f14032a != null) {
                    try {
                        BinderC3571l.this.f14032a.mo13230a(1);
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not notify onAdFailedToLoad event.", e);
                    }
                }
            }
        });
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: b */
    public void mo13179b() {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: c */
    public boolean mo13177c() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: d */
    public void mo13175d() {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: f */
    public void mo13174f() {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: h */
    public void mo13173h() {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: h_ */
    public void mo13172h_() {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: i */
    public AdSizeParcel mo13171i() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: j */
    public String mo13170j() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: k */
    public boolean mo13169k() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: l */
    public AbstractC3553c mo13168l() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: l_ */
    public void mo13167l_() {
    }
}
