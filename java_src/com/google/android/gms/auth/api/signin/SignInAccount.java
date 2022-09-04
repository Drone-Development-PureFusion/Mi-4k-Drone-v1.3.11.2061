package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C4049f();

    /* renamed from: a */
    final int f15542a;
    @Deprecated

    /* renamed from: b */
    String f15543b;
    @Deprecated

    /* renamed from: c */
    String f15544c;

    /* renamed from: d */
    private GoogleSignInAccount f15545d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(int i, String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f15542a = i;
        this.f15545d = googleSignInAccount;
        this.f15543b = C4588d.m23624a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f15544c = C4588d.m23624a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    /* renamed from: a */
    public GoogleSignInAccount m25639a() {
        return this.f15545d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4049f.m25627a(this, parcel, i);
    }
}
