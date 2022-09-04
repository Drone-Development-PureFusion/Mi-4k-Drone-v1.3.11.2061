package com.google.firebase.auth.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7022gc;
import com.google.android.gms.internal.AbstractC7491om;
import java.util.List;
/* loaded from: classes.dex */
public class GetAccountInfoUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAccountInfoUser> CREATOR = new C9720b();
    @AbstractC7022gc

    /* renamed from: a */
    public final int f30375a;
    @AbstractC7491om(m14334a = "localId")

    /* renamed from: b */
    private String f30376b;
    @AbstractC7491om(m14334a = C4538f.f16922b)

    /* renamed from: c */
    private String f30377c;
    @AbstractC7491om(m14334a = "emailVerified")

    /* renamed from: d */
    private boolean f30378d;
    @AbstractC7491om(m14334a = "displayName")

    /* renamed from: e */
    private String f30379e;
    @AbstractC7491om(m14334a = "photoUrl")

    /* renamed from: f */
    private String f30380f;
    @AbstractC7491om(m14334a = "providerUserInfo")

    /* renamed from: g */
    private ProviderUserInfoList f30381g;
    @AbstractC7491om(m14334a = "passwordHash")

    /* renamed from: h */
    private String f30382h;

    public GetAccountInfoUser() {
        this.f30375a = 1;
        this.f30381g = new ProviderUserInfoList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetAccountInfoUser(int i, String str, String str2, boolean z, String str3, String str4, ProviderUserInfoList providerUserInfoList, String str5) {
        this.f30375a = i;
        this.f30376b = str;
        this.f30377c = str2;
        this.f30378d = z;
        this.f30379e = str3;
        this.f30380f = str4;
        this.f30381g = providerUserInfoList == null ? ProviderUserInfoList.m7318b() : ProviderUserInfoList.m7319a(providerUserInfoList);
        this.f30382h = str5;
    }

    @Nullable
    /* renamed from: a */
    public String m7342a() {
        return this.f30377c;
    }

    /* renamed from: b */
    public boolean m7341b() {
        return this.f30378d;
    }

    @NonNull
    /* renamed from: c */
    public String m7340c() {
        return this.f30376b;
    }

    @Nullable
    /* renamed from: d */
    public String m7339d() {
        return this.f30379e;
    }

    @Nullable
    /* renamed from: e */
    public String m7338e() {
        return this.f30380f;
    }

    @Nullable
    /* renamed from: f */
    public Uri m7337f() {
        if (!TextUtils.isEmpty(this.f30380f)) {
            return Uri.parse(this.f30380f);
        }
        return null;
    }

    @Nullable
    /* renamed from: g */
    public String m7336g() {
        return this.f30382h;
    }

    @NonNull
    /* renamed from: h */
    public List<ProviderUserInfo> m7335h() {
        return this.f30381g.m7320a();
    }

    /* renamed from: i */
    public ProviderUserInfoList m7334i() {
        return this.f30381g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9720b.m7300a(this, parcel, i);
    }
}
