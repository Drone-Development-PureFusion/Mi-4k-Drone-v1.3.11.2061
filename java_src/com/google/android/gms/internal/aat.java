package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.AbstractC3749b;
import com.google.android.gms.ads.internal.reward.client.AbstractC3755d;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* loaded from: classes.dex */
public class aat extends AbstractC3749b.AbstractBinderC3750a {

    /* renamed from: a */
    private final Context f20808a;

    /* renamed from: b */
    private final Object f20809b;

    /* renamed from: c */
    private final VersionInfoParcel f20810c;

    /* renamed from: d */
    private final aau f20811d;

    public aat(Context context, C3588d c3588d, AbstractC8005xq abstractC8005xq, VersionInfoParcel versionInfoParcel) {
        this(context, versionInfoParcel, new aau(context, c3588d, AdSizeParcel.m27639a(), abstractC8005xq, versionInfoParcel));
    }

    aat(Context context, VersionInfoParcel versionInfoParcel, aau aauVar) {
        this.f20809b = new Object();
        this.f20808a = context;
        this.f20810c = versionInfoParcel;
        this.f20811d = aauVar;
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: a */
    public void mo18592a() {
        synchronized (this.f20809b) {
            this.f20811d.m18581E();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: a */
    public void mo18591a(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel) {
        synchronized (this.f20809b) {
            this.f20811d.m18577a(rewardedVideoAdRequestParcel);
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: a */
    public void mo18590a(AbstractC3755d abstractC3755d) {
        synchronized (this.f20809b) {
            this.f20811d.a(abstractC3755d);
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: a */
    public void mo18589a(AbstractC4170e abstractC4170e) {
        synchronized (this.f20809b) {
            this.f20811d.mo13175d();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: a */
    public void mo18588a(String str) {
        abr.d("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: b */
    public void mo18586b(AbstractC4170e abstractC4170e) {
        Context context;
        synchronized (this.f20809b) {
            if (abstractC4170e == null) {
                context = null;
            } else {
                try {
                    context = (Context) BinderC4173f.m25294a(abstractC4170e);
                } catch (Exception e) {
                    abr.d("Unable to extract updated context.", e);
                }
            }
            if (context != null) {
                this.f20811d.m18579a(context);
            }
            this.f20811d.mo13172h_();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: b */
    public boolean mo18587b() {
        boolean m18580F;
        synchronized (this.f20809b) {
            m18580F = this.f20811d.m18580F();
        }
        return m18580F;
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: c */
    public void mo18585c() {
        mo18589a((AbstractC4170e) null);
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: c */
    public void mo18584c(AbstractC4170e abstractC4170e) {
        synchronized (this.f20809b) {
            this.f20811d.mo13179b();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: d */
    public void mo18583d() {
        mo18586b(null);
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: e */
    public void mo18582e() {
        mo18584c(null);
    }
}
