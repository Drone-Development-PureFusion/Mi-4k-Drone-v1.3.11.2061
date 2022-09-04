package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
/* renamed from: com.google.android.gms.common.internal.aa */
/* loaded from: classes2.dex */
public class C4557aa {

    /* renamed from: a */
    private static final Uri f17023a = Uri.parse("http://plus.google.com/");

    /* renamed from: b */
    private static final Uri f17024b = f17023a.buildUpon().appendPath("circles").appendPath("find").build();

    /* renamed from: a */
    public static Intent m23715a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    /* renamed from: a */
    public static Intent m23714a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: a */
    public static Intent m23713a(String str, @Nullable String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(m23712b(str, str2));
        intent.setPackage("com.android.vending");
        intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        return intent;
    }

    /* renamed from: b */
    private static Uri m23712b(String str, @Nullable String str2) {
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        return appendQueryParameter.build();
    }
}
