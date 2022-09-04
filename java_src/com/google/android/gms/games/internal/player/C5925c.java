package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.internal.player.c */
/* loaded from: classes2.dex */
public class C5925c implements Parcelable.Creator<ProfileSettingsEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19533a(ProfileSettingsEntity profileSettingsEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) profileSettingsEntity.mo7645a(), i, false);
        C4630b.m23464a(parcel, 2, profileSettingsEntity.mo19255d(), false);
        C4630b.m23461a(parcel, 3, profileSettingsEntity.mo19253f());
        C4630b.m23461a(parcel, 4, profileSettingsEntity.mo19257b());
        C4630b.m23461a(parcel, 5, profileSettingsEntity.mo19256c());
        C4630b.m23470a(parcel, 6, (Parcelable) profileSettingsEntity.mo19254e(), i, false);
        C4630b.m23461a(parcel, 7, profileSettingsEntity.mo19252g());
        C4630b.m23475a(parcel, 1000, profileSettingsEntity.m19544i());
        C4630b.m23461a(parcel, 8, profileSettingsEntity.mo19251h());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ProfileSettingsEntity createFromParcel(Parcel parcel) {
        StockProfileImageEntity stockProfileImageEntity = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        Status status = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    status = (Status) C4628a.m23510a(parcel, m23514a, Status.CREATOR);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    z5 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    z4 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    stockProfileImageEntity = (StockProfileImageEntity) C4628a.m23510a(parcel, m23514a, StockProfileImageEntity.CREATOR);
                    break;
                case 7:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new ProfileSettingsEntity(i, status, str, z5, z4, z3, stockProfileImageEntity, z2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ProfileSettingsEntity[] newArray(int i) {
        return new ProfileSettingsEntity[i];
    }
}
