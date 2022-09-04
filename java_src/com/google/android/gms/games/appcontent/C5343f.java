package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.appcontent.f */
/* loaded from: classes2.dex */
public class C5343f implements Parcelable.Creator<AppContentSectionEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20524a(AppContentSectionEntity appContentSectionEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, appContentSectionEntity.mo20562c(), false);
        C4630b.m23447c(parcel, 3, appContentSectionEntity.mo20560e(), false);
        C4630b.m23464a(parcel, 4, appContentSectionEntity.mo20558g(), false);
        C4630b.m23473a(parcel, 5, appContentSectionEntity.mo20557h(), false);
        C4630b.m23464a(parcel, 6, appContentSectionEntity.mo20555j(), false);
        C4630b.m23464a(parcel, 7, appContentSectionEntity.mo20554k(), false);
        C4630b.m23475a(parcel, 1000, appContentSectionEntity.m20564m());
        C4630b.m23464a(parcel, 8, appContentSectionEntity.mo20553l(), false);
        C4630b.m23464a(parcel, 9, appContentSectionEntity.mo20556i(), false);
        C4630b.m23464a(parcel, 10, appContentSectionEntity.mo20559f(), false);
        C4630b.m23447c(parcel, 14, appContentSectionEntity.mo20561d(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentSectionEntity createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Bundle bundle = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList3 = C4628a.m23504c(parcel, m23514a, AppContentActionEntity.CREATOR);
                    break;
                case 3:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, AppContentCardEntity.CREATOR);
                    break;
                case 4:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 6:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 10:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 14:
                    arrayList = C4628a.m23504c(parcel, m23514a, AppContentAnnotationEntity.CREATOR);
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
        return new AppContentSectionEntity(i, arrayList3, arrayList2, str6, bundle, str5, str4, str3, str2, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentSectionEntity[] newArray(int i) {
        return new AppContentSectionEntity[i];
    }
}
