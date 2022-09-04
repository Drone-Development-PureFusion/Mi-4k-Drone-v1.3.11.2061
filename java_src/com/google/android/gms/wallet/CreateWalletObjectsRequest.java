package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new C9399i();

    /* renamed from: a */
    LoyaltyWalletObject f29432a;

    /* renamed from: b */
    OfferWalletObject f29433b;

    /* renamed from: c */
    GiftCardWalletObject f29434c;

    /* renamed from: d */
    private final int f29435d;

    CreateWalletObjectsRequest() {
        this.f29435d = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CreateWalletObjectsRequest(int i, LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject) {
        this.f29435d = i;
        this.f29432a = loyaltyWalletObject;
        this.f29433b = offerWalletObject;
        this.f29434c = giftCardWalletObject;
    }

    /* renamed from: a */
    public int m8592a() {
        return this.f29435d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9399i.m8228a(this, parcel, i);
    }
}
