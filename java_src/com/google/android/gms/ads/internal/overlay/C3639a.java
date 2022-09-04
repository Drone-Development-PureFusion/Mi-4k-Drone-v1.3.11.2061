package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
@aaa
/* renamed from: com.google.android.gms.ads.internal.overlay.a */
/* loaded from: classes.dex */
public class C3639a {
    /* renamed from: a */
    public boolean m27252a(Context context, Intent intent, AbstractC3670p abstractC3670p) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            abr.m18409e(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            C3779u.m26890e().m18377a(context, intent);
            if (abstractC3670p != null) {
                abstractC3670p.mo27170m();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            abr.d(e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public boolean m27251a(Context context, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, AbstractC3670p abstractC3670p) {
        int i;
        if (adLauncherIntentInfoParcel == null) {
            abr.d("No intent data for launcher overlay.");
            return false;
        } else if (adLauncherIntentInfoParcel.f14252i != null) {
            return m27252a(context, adLauncherIntentInfoParcel.f14252i, abstractC3670p);
        } else {
            Intent intent = new Intent();
            if (TextUtils.isEmpty(adLauncherIntentInfoParcel.f14246c)) {
                abr.d("Open GMSG did not contain a URL.");
                return false;
            }
            if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.f14247d)) {
                intent.setDataAndType(Uri.parse(adLauncherIntentInfoParcel.f14246c), adLauncherIntentInfoParcel.f14247d);
            } else {
                intent.setData(Uri.parse(adLauncherIntentInfoParcel.f14246c));
            }
            intent.setAction("android.intent.action.VIEW");
            if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.f14248e)) {
                intent.setPackage(adLauncherIntentInfoParcel.f14248e);
            }
            if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.f14249f)) {
                String[] split = adLauncherIntentInfoParcel.f14249f.split("/", 2);
                if (split.length < 2) {
                    String valueOf = String.valueOf(adLauncherIntentInfoParcel.f14249f);
                    abr.d(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                    return false;
                }
                intent.setClassName(split[0], split[1]);
            }
            String str = adLauncherIntentInfoParcel.f14250g;
            if (!TextUtils.isEmpty(str)) {
                try {
                    i = Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    abr.d("Could not parse intent flags.");
                    i = 0;
                }
                intent.addFlags(i);
            }
            return m27252a(context, intent, abstractC3670p);
        }
    }
}
