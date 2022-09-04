package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.m */
/* loaded from: classes2.dex */
public class C5935m implements Parcelable.Creator<PlayerLevelInfo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19505a(PlayerLevelInfo playerLevelInfo, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23474a(parcel, 1, playerLevelInfo.m20741b());
        C4630b.m23474a(parcel, 2, playerLevelInfo.m20740c());
        C4630b.m23470a(parcel, 3, (Parcelable) playerLevelInfo.m20739d(), i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) playerLevelInfo.m20738e(), i, false);
        C4630b.m23475a(parcel, 1000, playerLevelInfo.m20742a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlayerLevelInfo createFromParcel(Parcel parcel) {
        long j = 0;
        PlayerLevel playerLevel = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        PlayerLevel playerLevel2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    playerLevel2 = (PlayerLevel) C4628a.m23510a(parcel, m23514a, PlayerLevel.CREATOR);
                    break;
                case 4:
                    playerLevel = (PlayerLevel) C4628a.m23510a(parcel, m23514a, PlayerLevel.CREATOR);
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
        return new PlayerLevelInfo(i, j2, j, playerLevel2, playerLevel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlayerLevelInfo[] newArray(int i) {
        return new PlayerLevelInfo[i];
    }
}
