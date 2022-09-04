package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
/* loaded from: classes2.dex */
public final class InstallReferrerReceiver extends CampaignTrackingReceiver {
    @Override // com.google.android.gms.analytics.CampaignTrackingReceiver
    /* renamed from: a */
    protected Class<? extends CampaignTrackingService> mo9356a() {
        return InstallReferrerService.class;
    }

    @Override // com.google.android.gms.analytics.CampaignTrackingReceiver
    /* renamed from: a */
    protected void mo9355a(Context context, String str) {
        C9052an.m9313a(str);
        C9052an.m9315a(context, str);
    }
}
