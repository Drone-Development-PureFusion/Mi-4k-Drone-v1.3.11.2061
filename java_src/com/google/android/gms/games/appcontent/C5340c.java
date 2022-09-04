package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.appcontent.c */
/* loaded from: classes2.dex */
public class C5340c implements Parcelable.Creator<AppContentCardEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20532a(AppContentCardEntity appContentCardEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, appContentCardEntity.mo20590c(), false);
        C4630b.m23447c(parcel, 2, appContentCardEntity.mo20589d(), false);
        C4630b.m23447c(parcel, 3, appContentCardEntity.mo20588e(), false);
        C4630b.m23464a(parcel, 4, appContentCardEntity.mo20587f(), false);
        C4630b.m23475a(parcel, 5, appContentCardEntity.mo20586g());
        C4630b.m23464a(parcel, 6, appContentCardEntity.mo20585h(), false);
        C4630b.m23473a(parcel, 7, appContentCardEntity.mo20584i(), false);
        C4630b.m23475a(parcel, 1000, appContentCardEntity.m20592o());
        C4630b.m23464a(parcel, 10, appContentCardEntity.mo20582k(), false);
        C4630b.m23464a(parcel, 11, appContentCardEntity.mo20581l(), false);
        C4630b.m23475a(parcel, 12, appContentCardEntity.mo20580m());
        C4630b.m23464a(parcel, 13, appContentCardEntity.mo20579n(), false);
        C4630b.m23464a(parcel, 14, appContentCardEntity.mo20583j(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentCardEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str = null;
        int i2 = 0;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList = C4628a.m23504c(parcel, m23514a, AppContentActionEntity.CREATOR);
                    break;
                case 2:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, AppContentAnnotationEntity.CREATOR);
                    break;
                case 3:
                    arrayList3 = C4628a.m23504c(parcel, m23514a, AppContentConditionEntity.CREATOR);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 10:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 11:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 12:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 13:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 14:
                    str6 = C4628a.m23490q(parcel, m23514a);
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
        return new AppContentCardEntity(i, arrayList, arrayList2, arrayList3, str, i2, str2, bundle, str3, str4, i3, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentCardEntity[] newArray(int i) {
        return new AppContentCardEntity[i];
    }
}
