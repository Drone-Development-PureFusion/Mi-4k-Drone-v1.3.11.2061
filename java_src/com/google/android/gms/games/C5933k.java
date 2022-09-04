package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
/* renamed from: com.google.android.gms.games.k */
/* loaded from: classes2.dex */
public class C5933k implements Parcelable.Creator<PlayerEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19511a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, playerEntity.mo20734c(), false);
        C4630b.m23464a(parcel, 2, playerEntity.mo20733d(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) playerEntity.mo20728i(), i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) playerEntity.mo20726k(), i, false);
        C4630b.m23474a(parcel, 5, playerEntity.mo20725l());
        C4630b.m23475a(parcel, 6, playerEntity.mo20723n());
        C4630b.m23474a(parcel, 7, playerEntity.mo20724m());
        C4630b.m23475a(parcel, 1000, playerEntity.m20749x());
        C4630b.m23464a(parcel, 8, playerEntity.getIconImageUrl(), false);
        C4630b.m23464a(parcel, 9, playerEntity.getHiResImageUrl(), false);
        C4630b.m23464a(parcel, 14, playerEntity.mo20721p(), false);
        C4630b.m23470a(parcel, 15, (Parcelable) playerEntity.mo20719r(), i, false);
        C4630b.m23470a(parcel, 16, (Parcelable) playerEntity.mo20720q(), i, false);
        C4630b.m23461a(parcel, 18, playerEntity.mo20722o());
        C4630b.m23461a(parcel, 19, playerEntity.mo20730g());
        C4630b.m23464a(parcel, 20, playerEntity.mo20732e(), false);
        C4630b.m23464a(parcel, 21, playerEntity.mo20731f(), false);
        C4630b.m23470a(parcel, 22, (Parcelable) playerEntity.mo20718s(), i, false);
        C4630b.m23464a(parcel, 23, playerEntity.getBannerImageLandscapeUrl(), false);
        C4630b.m23470a(parcel, 24, (Parcelable) playerEntity.mo20717t(), i, false);
        C4630b.m23464a(parcel, 25, playerEntity.getBannerImagePortraitUrl(), false);
        C4630b.m23475a(parcel, 26, playerEntity.mo20716u());
        C4630b.m23474a(parcel, 27, playerEntity.mo20715v());
        C4630b.m23461a(parcel, 28, playerEntity.mo20714w());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlayerEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        PlayerLevelInfo playerLevelInfo = null;
        boolean z = false;
        boolean z2 = false;
        String str6 = null;
        String str7 = null;
        Uri uri3 = null;
        String str8 = null;
        Uri uri4 = null;
        String str9 = null;
        int i3 = 0;
        long j3 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 5:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 6:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 8:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 14:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 15:
                    mostRecentGameInfoEntity = (MostRecentGameInfoEntity) C4628a.m23510a(parcel, m23514a, MostRecentGameInfoEntity.CREATOR);
                    break;
                case 16:
                    playerLevelInfo = (PlayerLevelInfo) C4628a.m23510a(parcel, m23514a, PlayerLevelInfo.CREATOR);
                    break;
                case 18:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 19:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 20:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 21:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 22:
                    uri3 = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 23:
                    str8 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 24:
                    uri4 = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 25:
                    str9 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 26:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 27:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 28:
                    z3 = C4628a.m23505c(parcel, m23514a);
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
        return new PlayerEntity(i, str, str2, uri, uri2, j, i2, j2, str3, str4, str5, mostRecentGameInfoEntity, playerLevelInfo, z, z2, str6, str7, uri3, str8, uri4, str9, i3, j3, z3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlayerEntity[] newArray(int i) {
        return new PlayerEntity[i];
    }
}
