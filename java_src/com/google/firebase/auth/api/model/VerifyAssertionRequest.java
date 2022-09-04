package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7022gc;
import com.google.android.gms.internal.AbstractC7491om;
/* loaded from: classes.dex */
public class VerifyAssertionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VerifyAssertionRequest> CREATOR = new C9726h();
    @AbstractC7022gc

    /* renamed from: a */
    public final int f30400a;
    @AbstractC7491om(m14334a = "requestUri")

    /* renamed from: b */
    private String f30401b;
    @AbstractC7491om(m14334a = "idToken")

    /* renamed from: c */
    private String f30402c;
    @AbstractC7022gc

    /* renamed from: d */
    private String f30403d;
    @AbstractC7022gc

    /* renamed from: e */
    private String f30404e;
    @AbstractC7022gc

    /* renamed from: f */
    private String f30405f;
    @AbstractC7022gc
    @Nullable

    /* renamed from: g */
    private String f30406g;
    @AbstractC7491om(m14334a = "postBody")

    /* renamed from: h */
    private String f30407h;
    @AbstractC7491om(m14334a = "oauthTokenSecret")

    /* renamed from: i */
    private String f30408i;
    @AbstractC7491om(m14334a = "returnSecureToken")

    /* renamed from: j */
    private boolean f30409j;

    public VerifyAssertionRequest() {
        this.f30400a = 2;
        this.f30409j = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VerifyAssertionRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        this.f30400a = i;
        this.f30401b = str;
        this.f30402c = str2;
        this.f30403d = str3;
        this.f30404e = str4;
        this.f30405f = str5;
        this.f30406g = str6;
        this.f30407h = str7;
        this.f30408i = str8;
        this.f30409j = z;
    }

    public VerifyAssertionRequest(@Nullable String str, @Nullable String str2, String str3, @Nullable String str4, @Nullable String str5) {
        this.f30400a = 2;
        this.f30401b = "http://localhost";
        this.f30403d = str;
        this.f30404e = str2;
        this.f30408i = str5;
        this.f30409j = true;
        if (!TextUtils.isEmpty(this.f30403d) || !TextUtils.isEmpty(this.f30404e)) {
            this.f30405f = C4588d.m23625a(str3);
            this.f30406g = str4;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f30403d)) {
                sb.append("id_token").append("=").append(this.f30403d).append("&");
            }
            if (!TextUtils.isEmpty(this.f30404e)) {
                sb.append("access_token").append("=").append(this.f30404e).append("&");
            }
            if (!TextUtils.isEmpty(this.f30406g)) {
                sb.append("identifier").append("=").append(this.f30406g).append("&");
            }
            if (!TextUtils.isEmpty(this.f30408i)) {
                sb.append("oauth_token_secret").append("=").append(this.f30408i).append("&");
            }
            sb.append("providerId").append("=").append(this.f30405f);
            this.f30407h = sb.toString();
            return;
        }
        throw new IllegalArgumentException("Both idToken, and accessToken cannot be null");
    }

    /* renamed from: a */
    public String m7314a() {
        return this.f30401b;
    }

    /* renamed from: b */
    public String m7313b() {
        return this.f30402c;
    }

    /* renamed from: c */
    public String m7312c() {
        return this.f30403d;
    }

    /* renamed from: d */
    public String m7311d() {
        return this.f30404e;
    }

    /* renamed from: e */
    public String m7310e() {
        return this.f30405f;
    }

    /* renamed from: f */
    public String m7309f() {
        return this.f30408i;
    }

    /* renamed from: g */
    public boolean m7308g() {
        return this.f30409j;
    }

    @Nullable
    /* renamed from: h */
    public String m7307h() {
        return this.f30406g;
    }

    /* renamed from: i */
    public String m7306i() {
        return this.f30407h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9726h.m7282a(this, parcel, i);
    }
}
