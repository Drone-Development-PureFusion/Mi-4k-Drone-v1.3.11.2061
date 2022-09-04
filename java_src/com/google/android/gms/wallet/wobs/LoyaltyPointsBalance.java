package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new C9419d();

    /* renamed from: a */
    int f29763a;

    /* renamed from: b */
    String f29764b;

    /* renamed from: c */
    double f29765c;

    /* renamed from: d */
    String f29766d;

    /* renamed from: e */
    long f29767e;

    /* renamed from: f */
    int f29768f;

    /* renamed from: g */
    private final int f29769g;

    LoyaltyPointsBalance() {
        this.f29769g = 1;
        this.f29768f = -1;
        this.f29763a = -1;
        this.f29765c = -1.0d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoyaltyPointsBalance(int i, int i2, String str, double d, String str2, long j, int i3) {
        this.f29769g = i;
        this.f29763a = i2;
        this.f29764b = str;
        this.f29765c = d;
        this.f29766d = str2;
        this.f29767e = j;
        this.f29768f = i3;
    }

    /* renamed from: a */
    public int m8177a() {
        return this.f29769g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9419d.m8161a(this, parcel, i);
    }
}
