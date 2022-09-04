package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.stats.b */
/* loaded from: classes2.dex */
public class C6027b implements Parcelable.Creator<PlayerStatsEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19028a(PlayerStatsEntity playerStatsEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23476a(parcel, 1, playerStatsEntity.mo19043c());
        C4630b.m23476a(parcel, 2, playerStatsEntity.mo19042d());
        C4630b.m23475a(parcel, 3, playerStatsEntity.mo19041e());
        C4630b.m23475a(parcel, 4, playerStatsEntity.mo19040f());
        C4630b.m23475a(parcel, 5, playerStatsEntity.mo19039g());
        C4630b.m23476a(parcel, 6, playerStatsEntity.mo19038h());
        C4630b.m23476a(parcel, 7, playerStatsEntity.mo19037i());
        C4630b.m23475a(parcel, 1000, playerStatsEntity.m19045n());
        C4630b.m23473a(parcel, 8, playerStatsEntity.mo19033m(), false);
        C4630b.m23476a(parcel, 9, playerStatsEntity.mo19036j());
        C4630b.m23476a(parcel, 10, playerStatsEntity.mo19035k());
        C4630b.m23476a(parcel, 11, playerStatsEntity.mo19034l());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlayerStatsEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        Bundle bundle = null;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 2:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 3:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    f3 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 7:
                    f4 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 8:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 9:
                    f5 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 10:
                    f6 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 11:
                    f7 = C4628a.m23495l(parcel, m23514a);
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
        return new PlayerStatsEntity(i, f, f2, i2, i3, i4, f3, f4, bundle, f5, f6, f7);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlayerStatsEntity[] newArray(int i) {
        return new PlayerStatsEntity[i];
    }
}
