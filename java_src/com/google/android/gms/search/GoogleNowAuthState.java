package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class GoogleNowAuthState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleNowAuthState> CREATOR = new C9005c();

    /* renamed from: a */
    final int f28627a;

    /* renamed from: b */
    String f28628b;

    /* renamed from: c */
    String f28629c;

    /* renamed from: d */
    long f28630d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleNowAuthState(int i, String str, String str2, long j) {
        this.f28627a = i;
        this.f28628b = str;
        this.f28629c = str2;
        this.f28630d = j;
    }

    /* renamed from: a */
    public String m9415a() {
        return this.f28628b;
    }

    /* renamed from: b */
    public String m9414b() {
        return this.f28629c;
    }

    /* renamed from: c */
    public long m9413c() {
        return this.f28630d;
    }

    public String toString() {
        String str = this.f28628b;
        String str2 = this.f28629c;
        return new StringBuilder(String.valueOf(str).length() + 74 + String.valueOf(str2).length()).append("mAuthCode = ").append(str).append("\nmAccessToken = ").append(str2).append("\nmNextAllowedTimeMillis = ").append(this.f28630d).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9005c.m9406a(this, parcel, i);
    }
}
