package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* renamed from: com.google.android.gms.drive.query.internal.a */
/* loaded from: classes2.dex */
public class C5036a implements Parcelable.Creator<ComparisonFilter> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22000a(ComparisonFilter comparisonFilter, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) comparisonFilter.f18060a, i, false);
        C4630b.m23470a(parcel, 2, (Parcelable) comparisonFilter.f18061b, i, false);
        C4630b.m23475a(parcel, 1000, comparisonFilter.f18062c);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ComparisonFilter createFromParcel(Parcel parcel) {
        Operator operator;
        int m23500g;
        MetadataBundle metadataBundle;
        MetadataBundle metadataBundle2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Operator operator2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    Operator operator3 = (Operator) C4628a.m23510a(parcel, m23514a, Operator.CREATOR);
                    m23500g = i;
                    metadataBundle = metadataBundle2;
                    operator = operator3;
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) C4628a.m23510a(parcel, m23514a, MetadataBundle.CREATOR);
                    operator = operator2;
                    m23500g = i;
                    break;
                case 1000:
                    MetadataBundle metadataBundle3 = metadataBundle2;
                    operator = operator2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    metadataBundle = metadataBundle3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    metadataBundle = metadataBundle2;
                    operator = operator2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            operator2 = operator;
            metadataBundle2 = metadataBundle;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ComparisonFilter(i, operator2, metadataBundle2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ComparisonFilter[] newArray(int i) {
        return new ComparisonFilter[i];
    }
}
