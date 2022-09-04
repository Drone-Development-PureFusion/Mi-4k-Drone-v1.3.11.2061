package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.wallet.r */
/* loaded from: classes2.dex */
public class C9408r implements Parcelable.Creator<MaskedWalletRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8201a(MaskedWalletRequest maskedWalletRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, maskedWalletRequest.m8515b());
        C4630b.m23464a(parcel, 2, maskedWalletRequest.f29515a, false);
        C4630b.m23461a(parcel, 3, maskedWalletRequest.f29516b);
        C4630b.m23461a(parcel, 4, maskedWalletRequest.f29517c);
        C4630b.m23461a(parcel, 5, maskedWalletRequest.f29518d);
        C4630b.m23464a(parcel, 6, maskedWalletRequest.f29519e, false);
        C4630b.m23464a(parcel, 7, maskedWalletRequest.f29520f, false);
        C4630b.m23464a(parcel, 8, maskedWalletRequest.f29521g, false);
        C4630b.m23470a(parcel, 9, (Parcelable) maskedWalletRequest.f29522h, i, false);
        C4630b.m23461a(parcel, 10, maskedWalletRequest.f29523i);
        C4630b.m23461a(parcel, 11, maskedWalletRequest.f29524j);
        C4630b.m23456a(parcel, 12, (Parcelable[]) maskedWalletRequest.f29525k, i, false);
        C4630b.m23461a(parcel, 13, maskedWalletRequest.f29526l);
        C4630b.m23461a(parcel, 14, maskedWalletRequest.f29527m);
        C4630b.m23447c(parcel, 15, maskedWalletRequest.f29528n, false);
        C4630b.m23470a(parcel, 16, (Parcelable) maskedWalletRequest.f29529o, i, false);
        C4630b.m23463a(parcel, 17, (List<Integer>) maskedWalletRequest.f29530p, false);
        C4630b.m23464a(parcel, 18, maskedWalletRequest.f29531q, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MaskedWalletRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Cart cart = null;
        boolean z4 = false;
        boolean z5 = false;
        CountrySpecification[] countrySpecificationArr = null;
        boolean z6 = true;
        boolean z7 = true;
        ArrayList arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        ArrayList<Integer> arrayList2 = null;
        String str5 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    cart = (Cart) C4628a.m23510a(parcel, m23514a, Cart.CREATOR);
                    break;
                case 10:
                    z4 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 11:
                    z5 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 12:
                    countrySpecificationArr = (CountrySpecification[]) C4628a.m23506b(parcel, m23514a, CountrySpecification.CREATOR);
                    break;
                case 13:
                    z6 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 14:
                    z7 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 15:
                    arrayList = C4628a.m23504c(parcel, m23514a, com.google.android.gms.identity.intents.model.CountrySpecification.CREATOR);
                    break;
                case 16:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) C4628a.m23510a(parcel, m23514a, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 17:
                    arrayList2 = C4628a.m23519D(parcel, m23514a);
                    break;
                case 18:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new MaskedWalletRequest(i, str, z, z2, z3, str2, str3, str4, cart, z4, z5, countrySpecificationArr, z6, z7, arrayList, paymentMethodTokenizationParameters, arrayList2, str5);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MaskedWalletRequest[] newArray(int i) {
        return new MaskedWalletRequest[i];
    }
}
