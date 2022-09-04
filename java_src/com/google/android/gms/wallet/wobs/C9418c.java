package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.common.util.C4679b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.wallet.wobs.c */
/* loaded from: classes2.dex */
public class C9418c implements Parcelable.Creator<LabelValueRow> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8164a(LabelValueRow labelValueRow, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, labelValueRow.m8179a());
        C4630b.m23464a(parcel, 2, labelValueRow.f29754a, false);
        C4630b.m23464a(parcel, 3, labelValueRow.f29755b, false);
        C4630b.m23447c(parcel, 4, labelValueRow.f29756c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LabelValueRow createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList m23173a = C4679b.m23173a();
        String str2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    m23173a = C4628a.m23504c(parcel, m23514a, LabelValue.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LabelValueRow(i, str2, str, m23173a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LabelValueRow[] newArray(int i) {
        return new LabelValueRow[i];
    }
}
