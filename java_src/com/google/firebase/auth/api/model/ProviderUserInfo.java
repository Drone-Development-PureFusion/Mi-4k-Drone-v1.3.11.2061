package com.google.firebase.auth.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7022gc;
import com.google.android.gms.internal.AbstractC7491om;
/* loaded from: classes.dex */
public class ProviderUserInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProviderUserInfo> CREATOR = new C9723e();
    @AbstractC7022gc

    /* renamed from: a */
    public final int f30391a;
    @AbstractC7491om(m14334a = "federatedId")

    /* renamed from: b */
    private String f30392b;
    @AbstractC7491om(m14334a = "displayName")

    /* renamed from: c */
    private String f30393c;
    @AbstractC7491om(m14334a = "photoUrl")

    /* renamed from: d */
    private String f30394d;
    @AbstractC7491om(m14334a = "providerId")

    /* renamed from: e */
    private String f30395e;

    public ProviderUserInfo() {
        this.f30391a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProviderUserInfo(int i, String str, String str2, String str3, String str4) {
        this.f30391a = i;
        this.f30392b = str;
        this.f30393c = str2;
        this.f30394d = str3;
        this.f30395e = str4;
    }

    /* renamed from: a */
    public String m7325a() {
        return this.f30392b;
    }

    @Nullable
    /* renamed from: b */
    public String m7324b() {
        return this.f30393c;
    }

    @Nullable
    /* renamed from: c */
    public String m7323c() {
        return this.f30394d;
    }

    @Nullable
    /* renamed from: d */
    public Uri m7322d() {
        if (!TextUtils.isEmpty(this.f30394d)) {
            return Uri.parse(this.f30394d);
        }
        return null;
    }

    /* renamed from: e */
    public String m7321e() {
        return this.f30395e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9723e.m7291a(this, parcel, i);
    }
}
