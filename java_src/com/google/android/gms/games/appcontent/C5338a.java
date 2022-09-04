package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.appcontent.a */
/* loaded from: classes2.dex */
public class C5338a implements Parcelable.Creator<AppContentActionEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20538a(AppContentActionEntity appContentActionEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, appContentActionEntity.mo20617d(), false);
        C4630b.m23464a(parcel, 2, appContentActionEntity.mo20616e(), false);
        C4630b.m23473a(parcel, 3, appContentActionEntity.mo20615f(), false);
        C4630b.m23464a(parcel, 6, appContentActionEntity.mo20612i(), false);
        C4630b.m23464a(parcel, 7, appContentActionEntity.mo20614g(), false);
        C4630b.m23475a(parcel, 1000, appContentActionEntity.m20620j());
        C4630b.m23470a(parcel, 8, (Parcelable) appContentActionEntity.mo20618c(), i, false);
        C4630b.m23464a(parcel, 9, appContentActionEntity.mo20613h(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentActionEntity createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        AppContentAnnotationEntity appContentAnnotationEntity = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList = C4628a.m23504c(parcel, m23514a, AppContentConditionEntity.CREATOR);
                    break;
                case 2:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 6:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    appContentAnnotationEntity = (AppContentAnnotationEntity) C4628a.m23510a(parcel, m23514a, AppContentAnnotationEntity.CREATOR);
                    break;
                case 9:
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
        return new AppContentActionEntity(i, arrayList, str4, bundle, str3, str2, appContentAnnotationEntity, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentActionEntity[] newArray(int i) {
        return new AppContentActionEntity[i];
    }
}
