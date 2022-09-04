package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.internal.overlay.e */
/* loaded from: classes.dex */
public class C3657e {
    /* renamed from: a */
    public void m27215a(Context context, AdOverlayInfoParcel adOverlayInfoParcel) {
        m27214a(context, adOverlayInfoParcel, true);
    }

    /* renamed from: a */
    public void m27214a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f14264l == 4 && adOverlayInfoParcel.f14256d == null) {
            if (adOverlayInfoParcel.f14255c != null) {
                adOverlayInfoParcel.f14255c.mo27632e();
            }
            C3779u.m26893b().m27251a(context, adOverlayInfoParcel.f14254b, adOverlayInfoParcel.f14262j);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.f13701a);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f14266n.f14736e);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.m27258a(intent, adOverlayInfoParcel);
        if (!C4696s.m23104j()) {
            intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(AbstractC4808e.f17570a_);
        }
        C3779u.m26890e().m18377a(context, intent);
    }
}
