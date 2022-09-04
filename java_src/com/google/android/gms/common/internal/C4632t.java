package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.util.SimpleArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.C4536e;
import com.google.android.gms.common.util.C4686i;
import com.google.android.gms.internal.ajp;
/* renamed from: com.google.android.gms.common.internal.t */
/* loaded from: classes2.dex */
public final class C4632t {

    /* renamed from: a */
    private static final SimpleArrayMap<String, String> f17122a = new SimpleArrayMap<>();

    /* renamed from: a */
    public static String m23440a(Context context) {
        String str = context.getApplicationInfo().name;
        if (TextUtils.isEmpty(str)) {
            String packageName = context.getPackageName();
            context.getApplicationContext().getPackageManager();
            try {
                return ajp.m17106b(context).m17111a(context.getPackageName()).toString();
            } catch (PackageManager.NameNotFoundException e) {
                return packageName;
            }
        }
        return str;
    }

    @Nullable
    /* renamed from: a */
    public static String m23439a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C3424R.C3427string.common_google_play_services_install_title);
            case 2:
            case 42:
                return resources.getString(C3424R.C3427string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C3424R.C3427string.common_google_play_services_enable_title);
            case 4:
            case 6:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m23438a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m23438a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(C3424R.C3427string.common_google_play_services_unsupported_title);
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m23438a(context, "common_google_play_services_sign_in_failed_title");
            case 18:
                return resources.getString(C3424R.C3427string.common_google_play_services_updating_title);
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m23438a(context, "common_google_play_services_restricted_profile_title");
            default:
                Log.e("GoogleApiAvailability", new StringBuilder(33).append("Unexpected error code ").append(i).toString());
                return null;
        }
    }

    @Nullable
    /* renamed from: a */
    private static String m23438a(Context context, String str) {
        synchronized (f17122a) {
            String str2 = f17122a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources m23805c = C4536e.m23805c(context);
            if (m23805c == null) {
                return null;
            }
            int identifier = m23805c.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = m23805c.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                f17122a.put(str, string);
                return string;
            }
            String valueOf2 = String.valueOf(str);
            Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
            return null;
        }
    }

    /* renamed from: a */
    private static String m23437a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m23438a = m23438a(context, str);
        if (m23438a == null) {
            m23438a = resources.getString(C3424R.C3427string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, m23438a, str2);
    }

    @NonNull
    /* renamed from: b */
    public static String m23436b(Context context, int i) {
        String m23438a = i == 6 ? m23438a(context, "common_google_play_services_resolution_required_title") : m23439a(context, i);
        return m23438a == null ? context.getResources().getString(C3424R.C3427string.common_google_play_services_notification_ticker) : m23438a;
    }

    @NonNull
    /* renamed from: c */
    public static String m23435c(Context context, int i) {
        Resources resources = context.getResources();
        String m23440a = m23440a(context);
        switch (i) {
            case 1:
                return C4686i.m23136a(resources) ? resources.getString(C3424R.C3427string.common_google_play_services_install_text_tablet, m23440a) : resources.getString(C3424R.C3427string.common_google_play_services_install_text_phone, m23440a);
            case 2:
                return resources.getString(C3424R.C3427string.common_google_play_services_update_text, m23440a);
            case 3:
                return resources.getString(C3424R.C3427string.common_google_play_services_enable_text, m23440a);
            case 5:
                return m23437a(context, "common_google_play_services_invalid_account_text", m23440a);
            case 7:
                return m23437a(context, "common_google_play_services_network_error_text", m23440a);
            case 9:
                return resources.getString(C3424R.C3427string.common_google_play_services_unsupported_text, m23440a);
            case 16:
                return m23437a(context, "common_google_play_services_api_unavailable_text", m23440a);
            case 17:
                return m23437a(context, "common_google_play_services_sign_in_failed_text", m23440a);
            case 18:
                return resources.getString(C3424R.C3427string.common_google_play_services_updating_text, m23440a);
            case 20:
                return m23437a(context, "common_google_play_services_restricted_profile_text", m23440a);
            case 42:
                return resources.getString(C3424R.C3427string.common_google_play_services_wear_update_text);
            default:
                return resources.getString(C3424R.C3427string.common_google_play_services_unknown_issue, m23440a);
        }
    }

    @NonNull
    /* renamed from: d */
    public static String m23434d(Context context, int i) {
        return i == 6 ? m23437a(context, "common_google_play_services_resolution_required_text", m23440a(context)) : m23435c(context, i);
    }

    @NonNull
    /* renamed from: e */
    public static String m23433e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C3424R.C3427string.common_google_play_services_install_button);
            case 2:
                return resources.getString(C3424R.C3427string.common_google_play_services_update_button);
            case 3:
                return resources.getString(C3424R.C3427string.common_google_play_services_enable_button);
            default:
                return resources.getString(17039370);
        }
    }
}
