package com.google.firebase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4594j;
import com.google.android.gms.common.util.C4700w;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
/* renamed from: com.google.firebase.e */
/* loaded from: classes2.dex */
public final class C9903e {

    /* renamed from: a */
    private final String f30778a;

    /* renamed from: b */
    private final String f30779b;

    /* renamed from: c */
    private final String f30780c;

    /* renamed from: d */
    private final String f30781d;

    /* renamed from: e */
    private final String f30782e;

    /* renamed from: f */
    private final String f30783f;

    /* renamed from: com.google.firebase.e$a */
    /* loaded from: classes2.dex */
    public static final class C9905a {

        /* renamed from: a */
        private String f30784a;

        /* renamed from: b */
        private String f30785b;

        /* renamed from: c */
        private String f30786c;

        /* renamed from: d */
        private String f30787d;

        /* renamed from: e */
        private String f30788e;

        /* renamed from: f */
        private String f30789f;

        public C9905a() {
        }

        public C9905a(C9903e c9903e) {
            this.f30785b = c9903e.f30779b;
            this.f30784a = c9903e.f30778a;
            this.f30786c = c9903e.f30780c;
            this.f30787d = c9903e.f30781d;
            this.f30788e = c9903e.f30782e;
            this.f30789f = c9903e.f30783f;
        }

        /* renamed from: a */
        public C9905a m6627a(@NonNull String str) {
            this.f30784a = C4588d.m23624a(str, (Object) "ApiKey must be set.");
            return this;
        }

        /* renamed from: a */
        public C9903e m6628a() {
            return new C9903e(this.f30785b, this.f30784a, this.f30786c, this.f30787d, this.f30788e, this.f30789f);
        }

        /* renamed from: b */
        public C9905a m6626b(@NonNull String str) {
            this.f30785b = C4588d.m23624a(str, (Object) "ApplicationId must be set.");
            return this;
        }

        /* renamed from: c */
        public C9905a m6625c(@Nullable String str) {
            this.f30786c = str;
            return this;
        }

        /* renamed from: d */
        public C9905a m6624d(@Nullable String str) {
            this.f30788e = str;
            return this;
        }

        /* renamed from: e */
        public C9905a m6623e(@Nullable String str) {
            this.f30789f = str;
            return this;
        }
    }

    private C9903e(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        C4588d.m23622a(!C4700w.m23093a(str), "ApplicationId must be set.");
        this.f30779b = str;
        this.f30778a = str2;
        this.f30780c = str3;
        this.f30781d = str4;
        this.f30782e = str5;
        this.f30783f = str6;
    }

    /* renamed from: a */
    public static C9903e m6639a(Context context) {
        C4594j c4594j = new C4594j(context);
        String m23602a = c4594j.m23602a("google_app_id");
        if (TextUtils.isEmpty(m23602a)) {
            return null;
        }
        return new C9903e(m23602a, c4594j.m23602a("google_api_key"), c4594j.m23602a("firebase_database_url"), c4594j.m23602a("ga_trackingId"), c4594j.m23602a("gcm_defaultSenderId"), c4594j.m23602a("google_storage_bucket"));
    }

    /* renamed from: a */
    public String m6640a() {
        return this.f30778a;
    }

    /* renamed from: b */
    public String m6637b() {
        return this.f30779b;
    }

    /* renamed from: c */
    public String m6635c() {
        return this.f30780c;
    }

    /* renamed from: d */
    public String m6633d() {
        return this.f30782e;
    }

    /* renamed from: e */
    public String m6631e() {
        return this.f30783f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9903e)) {
            return false;
        }
        C9903e c9903e = (C9903e) obj;
        return C4585c.m23634a(this.f30779b, c9903e.f30779b) && C4585c.m23634a(this.f30778a, c9903e.f30778a) && C4585c.m23634a(this.f30780c, c9903e.f30780c) && C4585c.m23634a(this.f30781d, c9903e.f30781d) && C4585c.m23634a(this.f30782e, c9903e.f30782e) && C4585c.m23634a(this.f30783f, c9903e.f30783f);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f30779b, this.f30778a, this.f30780c, this.f30781d, this.f30782e, this.f30783f);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("applicationId", this.f30779b).m23632a(MMPluginProviderConstants.OAuth.API_KEY, this.f30778a).m23632a("databaseUrl", this.f30780c).m23632a("gcmSenderId", this.f30782e).m23632a("storageBucket", this.f30783f).toString();
    }
}
