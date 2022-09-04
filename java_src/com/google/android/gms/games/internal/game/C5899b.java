package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.internal.game.b */
/* loaded from: classes2.dex */
public class C5899b implements Parcelable.Creator<GameBadgeEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19951a(GameBadgeEntity gameBadgeEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, gameBadgeEntity.mo19959c());
        C4630b.m23464a(parcel, 2, gameBadgeEntity.mo19958d(), false);
        C4630b.m23464a(parcel, 3, gameBadgeEntity.mo19957e(), false);
        C4630b.m23470a(parcel, 4, (Parcelable) gameBadgeEntity.mo19956f(), i, false);
        C4630b.m23475a(parcel, 1000, gameBadgeEntity.m19962g());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GameBadgeEntity createFromParcel(Parcel parcel) {
        int i = 0;
        Uri uri = null;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 1000:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GameBadgeEntity(i2, i, str2, str, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GameBadgeEntity[] newArray(int i) {
        return new GameBadgeEntity[i];
    }
}
