package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new C9420e();

    /* renamed from: a */
    String f29758a;

    /* renamed from: b */
    LoyaltyPointsBalance f29759b;

    /* renamed from: c */
    String f29760c;

    /* renamed from: d */
    TimeInterval f29761d;

    /* renamed from: e */
    private final int f29762e;

    LoyaltyPoints() {
        this.f29762e = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoyaltyPoints(int i, String str, LoyaltyPointsBalance loyaltyPointsBalance, String str2, TimeInterval timeInterval) {
        this.f29762e = i;
        this.f29758a = str;
        this.f29759b = loyaltyPointsBalance;
        this.f29760c = str2;
        this.f29761d = timeInterval;
    }

    /* renamed from: a */
    public int m8178a() {
        return this.f29762e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9420e.m8158a(this, parcel, i);
    }
}
