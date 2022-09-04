package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.appcontent.b */
/* loaded from: classes2.dex */
public class C5339b implements Parcelable.Creator<AppContentAnnotationEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20535a(AppContentAnnotationEntity appContentAnnotationEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, appContentAnnotationEntity.mo20605c(), false);
        C4630b.m23470a(parcel, 2, (Parcelable) appContentAnnotationEntity.mo20601g(), i, false);
        C4630b.m23464a(parcel, 3, appContentAnnotationEntity.mo20597k(), false);
        C4630b.m23464a(parcel, 5, appContentAnnotationEntity.mo20604d(), false);
        C4630b.m23464a(parcel, 6, appContentAnnotationEntity.mo20598j(), false);
        C4630b.m23464a(parcel, 7, appContentAnnotationEntity.mo20603e(), false);
        C4630b.m23475a(parcel, 1000, appContentAnnotationEntity.m20607l());
        C4630b.m23475a(parcel, 8, appContentAnnotationEntity.mo20602f());
        C4630b.m23475a(parcel, 9, appContentAnnotationEntity.mo20599i());
        C4630b.m23473a(parcel, 10, appContentAnnotationEntity.mo20600h(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentAnnotationEntity createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 3:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 9:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 10:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 1000:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AppContentAnnotationEntity(i3, str5, uri, str4, str3, str2, str, i2, i, bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppContentAnnotationEntity[] newArray(int i) {
        return new AppContentAnnotationEntity[i];
    }
}
