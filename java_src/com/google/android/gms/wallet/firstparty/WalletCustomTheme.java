package com.google.android.gms.wallet.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class WalletCustomTheme extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletCustomTheme> CREATOR = new C9369j();

    /* renamed from: a */
    final int f29637a;

    /* renamed from: b */
    int f29638b;

    /* renamed from: c */
    Bundle f29639c;

    /* renamed from: d */
    String f29640d;

    public WalletCustomTheme() {
        this.f29637a = 2;
        this.f29638b = 0;
        this.f29639c = new Bundle();
        this.f29640d = "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WalletCustomTheme(int i, int i2, Bundle bundle, String str) {
        this.f29637a = i;
        this.f29639c = bundle;
        this.f29638b = i2;
        this.f29640d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9369j.m8394a(this, parcel, i);
    }
}
