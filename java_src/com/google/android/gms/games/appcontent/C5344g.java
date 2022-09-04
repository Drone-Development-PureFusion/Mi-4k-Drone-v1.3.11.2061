package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.appcontent.g */
/* loaded from: classes2.dex */
public class C5344g implements Parcelable.Creator<AppContentTupleEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20521a(AppContentTupleEntity appContentTupleEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, appContentTupleEntity.mo20543c(), false);
        C4630b.m23464a(parcel, 2, appContentTupleEntity.mo20542d(), false);
        C4630b.m23475a(parcel, 1000, appContentTupleEntity.m20545e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentTupleEntity createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
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
        return new AppContentTupleEntity(i, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentTupleEntity[] newArray(int i) {
        return new AppContentTupleEntity[i];
    }
}
