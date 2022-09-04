package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.PlayerEntity;
/* renamed from: com.google.android.gms.games.achievement.b */
/* loaded from: classes2.dex */
public class C5334b implements Parcelable.Creator<AchievementEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20624a(AchievementEntity achievementEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, achievementEntity.mo20644c(), false);
        C4630b.m23475a(parcel, 2, achievementEntity.mo20642d());
        C4630b.m23464a(parcel, 3, achievementEntity.mo20640e(), false);
        C4630b.m23464a(parcel, 4, achievementEntity.mo20639f(), false);
        C4630b.m23470a(parcel, 5, (Parcelable) achievementEntity.mo20638g(), i, false);
        C4630b.m23464a(parcel, 6, achievementEntity.getUnlockedImageUrl(), false);
        C4630b.m23470a(parcel, 7, (Parcelable) achievementEntity.mo20637h(), i, false);
        C4630b.m23475a(parcel, 1000, achievementEntity.m20652q());
        C4630b.m23464a(parcel, 8, achievementEntity.getRevealedImageUrl(), false);
        C4630b.m23475a(parcel, 9, achievementEntity.m20651r());
        C4630b.m23464a(parcel, 10, achievementEntity.m20650s(), false);
        C4630b.m23470a(parcel, 11, (Parcelable) achievementEntity.mo20634k(), i, false);
        C4630b.m23475a(parcel, 12, achievementEntity.mo20633l());
        C4630b.m23475a(parcel, 13, achievementEntity.m20649t());
        C4630b.m23464a(parcel, 14, achievementEntity.m20648u(), false);
        C4630b.m23474a(parcel, 15, achievementEntity.mo20630o());
        C4630b.m23474a(parcel, 16, achievementEntity.mo20629p());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AchievementEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        Uri uri2 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        PlayerEntity playerEntity = null;
        int i4 = 0;
        int i5 = 0;
        String str7 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 6:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    uri2 = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 8:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 10:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 11:
                    playerEntity = (PlayerEntity) C4628a.m23510a(parcel, m23514a, PlayerEntity.CREATOR);
                    break;
                case 12:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 13:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 14:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 15:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 16:
                    j2 = C4628a.m23498i(parcel, m23514a);
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
        return new AchievementEntity(i, str, i2, str2, str3, uri, str4, uri2, str5, i3, str6, playerEntity, i4, i5, str7, j, j2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AchievementEntity[] newArray(int i) {
        return new AchievementEntity[i];
    }
}
