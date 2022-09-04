package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new C9424i();

    /* renamed from: a */
    String f29779a;

    /* renamed from: b */
    String f29780b;

    /* renamed from: c */
    TimeInterval f29781c;

    /* renamed from: d */
    UriData f29782d;

    /* renamed from: e */
    UriData f29783e;

    /* renamed from: f */
    private final int f29784f;

    WalletObjectMessage() {
        this.f29784f = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WalletObjectMessage(int i, String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.f29784f = i;
        this.f29779a = str;
        this.f29780b = str2;
        this.f29781c = timeInterval;
        this.f29782d = uriData;
        this.f29783e = uriData2;
    }

    /* renamed from: a */
    public int m8173a() {
        return this.f29784f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9424i.m8146a(this, parcel, i);
    }
}
