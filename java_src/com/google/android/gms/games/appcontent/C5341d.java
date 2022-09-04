package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.appcontent.d */
/* loaded from: classes2.dex */
public class C5341d implements Parcelable.Creator<AppContentConditionEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20529a(AppContentConditionEntity appContentConditionEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, appContentConditionEntity.mo20572c(), false);
        C4630b.m23464a(parcel, 2, appContentConditionEntity.mo20571d(), false);
        C4630b.m23464a(parcel, 3, appContentConditionEntity.mo20570e(), false);
        C4630b.m23473a(parcel, 4, appContentConditionEntity.mo20569f(), false);
        C4630b.m23475a(parcel, 1000, appContentConditionEntity.m20574g());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentConditionEntity createFromParcel(Parcel parcel) {
        Bundle bundle = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    bundle = C4628a.m23488s(parcel, m23514a);
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
        return new AppContentConditionEntity(i, str3, str2, str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentConditionEntity[] newArray(int i) {
        return new AppContentConditionEntity[i];
    }
}
