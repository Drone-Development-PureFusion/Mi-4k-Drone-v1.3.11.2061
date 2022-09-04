package com.google.android.gms.appinvite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.plus.C8954e;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
/* renamed from: com.google.android.gms.appinvite.e */
/* loaded from: classes.dex */
public class C3972e {
    private C3972e() {
    }

    @Deprecated
    /* renamed from: a */
    public static Intent m25880a(Intent intent, Intent intent2) {
        Bundle m25874e = m25874e(intent);
        if (m25874e != null && intent2 != null) {
            intent2.putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", m25874e);
        }
        return intent2;
    }

    @Deprecated
    /* renamed from: a */
    public static Intent m25879a(String str, String str2, Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", m25878a(str, str2, false));
    }

    /* renamed from: a */
    private static Bundle m25878a(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.appinvite.INVITATION_ID", str);
        if (str2 != null) {
            bundle.putString("com.google.android.gms.appinvite.DEEP_LINK", str2);
        }
        bundle.putBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", z);
        return bundle;
    }

    /* renamed from: a */
    public static boolean m25881a(Intent intent) {
        return (intent == null || intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE") == null) ? false : true;
    }

    /* renamed from: b */
    public static boolean m25877b(Intent intent) {
        return m25881a(intent) && intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE").getBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", false);
    }

    /* renamed from: c */
    public static String m25876c(Intent intent) {
        Bundle bundleExtra;
        if (intent == null || (bundleExtra = intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE")) == null) {
            return null;
        }
        return bundleExtra.getString("com.google.android.gms.appinvite.INVITATION_ID");
    }

    /* renamed from: d */
    public static String m25875d(Intent intent) {
        Bundle bundleExtra;
        if (intent == null || (bundleExtra = intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE")) == null) {
            return null;
        }
        return bundleExtra.getString("com.google.android.gms.appinvite.DEEP_LINK");
    }

    /* renamed from: e */
    private static Bundle m25874e(Intent intent) {
        if (intent == null || !intent.getAction().equals("com.android.vending.INSTALL_REFERRER") || intent.getStringExtra("referrer") == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("referrer");
        try {
            String decode = URLDecoder.decode(stringExtra, "UTF-8");
            String valueOf = String.valueOf(decode);
            Uri parse = Uri.parse(valueOf.length() != 0 ? "s://a.b.c?".concat(valueOf) : new String("s://a.b.c?"));
            String queryParameter = parse.getQueryParameter("invitation_id");
            String queryParameter2 = parse.getQueryParameter(C8954e.f28492m);
            if (queryParameter != null || queryParameter2 != null) {
                return m25878a(queryParameter, queryParameter2, true);
            }
            String valueOf2 = String.valueOf(decode);
            Log.w("AppInviteRef", valueOf2.length() != 0 ? "Missing  Referrer query params: ".concat(valueOf2) : new String("Missing  Referrer query params: "));
            return null;
        } catch (UnsupportedEncodingException e) {
            String valueOf3 = String.valueOf(stringExtra);
            Log.e("AppInviteRef", valueOf3.length() != 0 ? "Error parsing Play Store referrer URL: ".concat(valueOf3) : new String("Error parsing Play Store referrer URL: "));
            return null;
        }
    }
}
