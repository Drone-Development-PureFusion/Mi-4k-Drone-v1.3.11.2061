package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.drive.query.internal.d */
/* loaded from: classes2.dex */
public class C5039d implements Parcelable.Creator<FilterHolder> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21991a(FilterHolder filterHolder, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) filterHolder.f18071b, i, false);
        C4630b.m23470a(parcel, 2, (Parcelable) filterHolder.f18072c, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) filterHolder.f18073d, i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) filterHolder.f18074e, i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) filterHolder.f18075f, i, false);
        C4630b.m23470a(parcel, 6, (Parcelable) filterHolder.f18076g, i, false);
        C4630b.m23470a(parcel, 7, (Parcelable) filterHolder.f18077h, i, false);
        C4630b.m23475a(parcel, 1000, filterHolder.f18070a);
        C4630b.m23470a(parcel, 8, (Parcelable) filterHolder.f18078i, i, false);
        C4630b.m23470a(parcel, 9, (Parcelable) filterHolder.f18079j, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FilterHolder createFromParcel(Parcel parcel) {
        OwnedByMeFilter ownedByMeFilter = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        FullTextSearchFilter fullTextSearchFilter = null;
        HasFilter hasFilter = null;
        MatchAllFilter matchAllFilter = null;
        InFilter inFilter = null;
        NotFilter notFilter = null;
        LogicalFilter logicalFilter = null;
        FieldOnlyFilter fieldOnlyFilter = null;
        ComparisonFilter comparisonFilter = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    comparisonFilter = (ComparisonFilter) C4628a.m23510a(parcel, m23514a, ComparisonFilter.CREATOR);
                    break;
                case 2:
                    fieldOnlyFilter = (FieldOnlyFilter) C4628a.m23510a(parcel, m23514a, FieldOnlyFilter.CREATOR);
                    break;
                case 3:
                    logicalFilter = (LogicalFilter) C4628a.m23510a(parcel, m23514a, LogicalFilter.CREATOR);
                    break;
                case 4:
                    notFilter = (NotFilter) C4628a.m23510a(parcel, m23514a, NotFilter.CREATOR);
                    break;
                case 5:
                    inFilter = (InFilter) C4628a.m23510a(parcel, m23514a, InFilter.CREATOR);
                    break;
                case 6:
                    matchAllFilter = (MatchAllFilter) C4628a.m23510a(parcel, m23514a, MatchAllFilter.CREATOR);
                    break;
                case 7:
                    hasFilter = (HasFilter) C4628a.m23510a(parcel, m23514a, HasFilter.CREATOR);
                    break;
                case 8:
                    fullTextSearchFilter = (FullTextSearchFilter) C4628a.m23510a(parcel, m23514a, FullTextSearchFilter.CREATOR);
                    break;
                case 9:
                    ownedByMeFilter = (OwnedByMeFilter) C4628a.m23510a(parcel, m23514a, OwnedByMeFilter.CREATOR);
                    break;
                case 1000:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new FilterHolder(i, comparisonFilter, fieldOnlyFilter, logicalFilter, notFilter, inFilter, matchAllFilter, hasFilter, fullTextSearchFilter, ownedByMeFilter);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FilterHolder[] newArray(int i) {
        return new FilterHolder[i];
    }
}
