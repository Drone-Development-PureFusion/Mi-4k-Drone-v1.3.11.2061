package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4584b;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4594j;
@Deprecated
/* loaded from: classes.dex */
public final class aie {

    /* renamed from: a */
    private static Object f21926a = new Object();

    /* renamed from: b */
    private static aie f21927b;

    /* renamed from: c */
    private final String f21928c;

    /* renamed from: d */
    private final String f21929d;

    /* renamed from: e */
    private final Status f21930e;

    /* renamed from: f */
    private final String f21931f;

    /* renamed from: g */
    private final String f21932g;

    /* renamed from: h */
    private final String f21933h;

    /* renamed from: i */
    private final boolean f21934i;

    /* renamed from: j */
    private final boolean f21935j;

    aie(Context context) {
        boolean z = true;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C3424R.C3427string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            boolean z2 = resources.getInteger(identifier) != 0;
            this.f21935j = z2 ? false : z;
            z = z2;
        } else {
            this.f21935j = false;
        }
        this.f21934i = z;
        C4594j c4594j = new C4594j(context);
        this.f21931f = c4594j.m23602a("firebase_database_url");
        this.f21933h = c4594j.m23602a("google_storage_bucket");
        this.f21932g = c4594j.m23602a("gcm_defaultSenderId");
        this.f21929d = c4594j.m23602a("google_api_key");
        String m23638a = C4584b.m23638a(context);
        m23638a = m23638a == null ? c4594j.m23602a("google_app_id") : m23638a;
        if (TextUtils.isEmpty(m23638a)) {
            this.f21930e = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f21928c = null;
            return;
        }
        this.f21928c = m23638a;
        this.f21930e = Status.f16786a;
    }

    aie(String str, boolean z) {
        this(str, z, null, null, null);
    }

    aie(String str, boolean z, String str2, String str3, String str4) {
        this.f21928c = str;
        this.f21929d = null;
        this.f21930e = Status.f16786a;
        this.f21934i = z;
        this.f21935j = !z;
        this.f21931f = str2;
        this.f21932g = str4;
        this.f21933h = str3;
    }

    /* renamed from: a */
    public static Status m17249a(Context context) {
        Status status;
        C4588d.m23626a(context, "Context must not be null.");
        synchronized (f21926a) {
            if (f21927b == null) {
                f21927b = new aie(context);
            }
            status = f21927b.f21930e;
        }
        return status;
    }

    /* renamed from: a */
    public static Status m17248a(Context context, String str, boolean z) {
        Status status;
        C4588d.m23626a(context, "Context must not be null.");
        C4588d.m23624a(str, (Object) "App ID must be nonempty.");
        synchronized (f21926a) {
            if (f21927b != null) {
                status = f21927b.m17247a(str);
            } else {
                f21927b = new aie(str, z);
                status = f21927b.f21930e;
            }
        }
        return status;
    }

    /* renamed from: a */
    public static String m17250a() {
        return m17245b("getGoogleAppId").f21928c;
    }

    /* renamed from: b */
    private static aie m17245b(String str) {
        aie aieVar;
        synchronized (f21926a) {
            if (f21927b == null) {
                throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 34).append("Initialize must be called before ").append(str).append(".").toString());
            }
            aieVar = f21927b;
        }
        return aieVar;
    }

    /* renamed from: b */
    public static boolean m17246b() {
        return m17245b("isMeasurementExplicitlyDisabled").f21935j;
    }

    /* renamed from: a */
    Status m17247a(String str) {
        if (this.f21928c == null || this.f21928c.equals(str)) {
            return Status.f16786a;
        }
        String str2 = this.f21928c;
        return new Status(10, new StringBuilder(String.valueOf(str2).length() + 97).append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '").append(str2).append("'.").toString());
    }
}
