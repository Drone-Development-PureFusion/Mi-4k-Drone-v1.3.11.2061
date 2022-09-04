package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.appdatasearch.b */
/* loaded from: classes2.dex */
public class C3954b implements Parcelable.Creator<DocumentContents> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25926a(DocumentContents documentContents, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23456a(parcel, 1, (Parcelable[]) documentContents.f15228b, i, false);
        C4630b.m23464a(parcel, 2, documentContents.f15229c, false);
        C4630b.m23461a(parcel, 3, documentContents.f15230d);
        C4630b.m23470a(parcel, 4, (Parcelable) documentContents.f15231e, i, false);
        C4630b.m23475a(parcel, 1000, documentContents.f15227a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DocumentContents createFromParcel(Parcel parcel) {
        boolean z = false;
        Account account = null;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        DocumentSection[] documentSectionArr = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    documentSectionArr = (DocumentSection[]) C4628a.m23506b(parcel, m23514a, DocumentSection.CREATOR);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    account = (Account) C4628a.m23510a(parcel, m23514a, Account.CREATOR);
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
        return new DocumentContents(i, documentSectionArr, str, z, account);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DocumentContents[] newArray(int i) {
        return new DocumentContents[i];
    }
}
