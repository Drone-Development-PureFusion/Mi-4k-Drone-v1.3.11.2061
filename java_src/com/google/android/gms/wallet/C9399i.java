package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wallet.i */
/* loaded from: classes2.dex */
public class C9399i implements Parcelable.Creator<CreateWalletObjectsRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8228a(CreateWalletObjectsRequest createWalletObjectsRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, createWalletObjectsRequest.m8592a());
        C4630b.m23470a(parcel, 2, (Parcelable) createWalletObjectsRequest.f29432a, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) createWalletObjectsRequest.f29433b, i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) createWalletObjectsRequest.f29434c, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateWalletObjectsRequest createFromParcel(Parcel parcel) {
        GiftCardWalletObject giftCardWalletObject;
        OfferWalletObject offerWalletObject;
        LoyaltyWalletObject loyaltyWalletObject;
        int i;
        GiftCardWalletObject giftCardWalletObject2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        OfferWalletObject offerWalletObject2 = null;
        LoyaltyWalletObject loyaltyWalletObject2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    GiftCardWalletObject giftCardWalletObject3 = giftCardWalletObject2;
                    offerWalletObject = offerWalletObject2;
                    loyaltyWalletObject = loyaltyWalletObject2;
                    i = C4628a.m23500g(parcel, m23514a);
                    giftCardWalletObject = giftCardWalletObject3;
                    break;
                case 2:
                    i = i2;
                    OfferWalletObject offerWalletObject3 = offerWalletObject2;
                    loyaltyWalletObject = (LoyaltyWalletObject) C4628a.m23510a(parcel, m23514a, LoyaltyWalletObject.CREATOR);
                    giftCardWalletObject = giftCardWalletObject2;
                    offerWalletObject = offerWalletObject3;
                    break;
                case 3:
                    loyaltyWalletObject = loyaltyWalletObject2;
                    i = i2;
                    GiftCardWalletObject giftCardWalletObject4 = giftCardWalletObject2;
                    offerWalletObject = (OfferWalletObject) C4628a.m23510a(parcel, m23514a, OfferWalletObject.CREATOR);
                    giftCardWalletObject = giftCardWalletObject4;
                    break;
                case 4:
                    giftCardWalletObject = (GiftCardWalletObject) C4628a.m23510a(parcel, m23514a, GiftCardWalletObject.CREATOR);
                    offerWalletObject = offerWalletObject2;
                    loyaltyWalletObject = loyaltyWalletObject2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    giftCardWalletObject = giftCardWalletObject2;
                    offerWalletObject = offerWalletObject2;
                    loyaltyWalletObject = loyaltyWalletObject2;
                    i = i2;
                    break;
            }
            i2 = i;
            loyaltyWalletObject2 = loyaltyWalletObject;
            offerWalletObject2 = offerWalletObject;
            giftCardWalletObject2 = giftCardWalletObject;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CreateWalletObjectsRequest(i2, loyaltyWalletObject2, offerWalletObject2, giftCardWalletObject2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateWalletObjectsRequest[] newArray(int i) {
        return new CreateWalletObjectsRequest[i];
    }
}
