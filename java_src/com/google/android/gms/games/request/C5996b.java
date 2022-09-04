package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.request.b */
/* loaded from: classes2.dex */
public class C5996b implements Parcelable.Creator<GameRequestEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19169a(GameRequestEntity gameRequestEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) gameRequestEntity.mo19181f(), i, false);
        C4630b.m23470a(parcel, 2, (Parcelable) gameRequestEntity.mo19180g(), i, false);
        C4630b.m23460a(parcel, 3, gameRequestEntity.mo19179i(), false);
        C4630b.m23464a(parcel, 4, gameRequestEntity.mo19182e(), false);
        C4630b.m23447c(parcel, 5, gameRequestEntity.mo19174o(), false);
        C4630b.m23475a(parcel, 7, gameRequestEntity.mo19178j());
        C4630b.m23475a(parcel, 1000, gameRequestEntity.m19188c());
        C4630b.m23474a(parcel, 9, gameRequestEntity.mo19177k());
        C4630b.m23474a(parcel, 10, gameRequestEntity.mo19176l());
        C4630b.m23473a(parcel, 11, gameRequestEntity.m19186d(), false);
        C4630b.m23475a(parcel, 12, gameRequestEntity.mo19175m());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GameRequestEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        byte[] bArr = null;
        String str = null;
        ArrayList arrayList = null;
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    gameEntity = (GameEntity) C4628a.m23510a(parcel, m23514a, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) C4628a.m23510a(parcel, m23514a, PlayerEntity.CREATOR);
                    break;
                case 3:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    arrayList = C4628a.m23504c(parcel, m23514a, PlayerEntity.CREATOR);
                    break;
                case 7:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 9:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 10:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 11:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 12:
                    i3 = C4628a.m23500g(parcel, m23514a);
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
        return new GameRequestEntity(i, gameEntity, playerEntity, bArr, str, arrayList, i2, j, j2, bundle, i3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GameRequestEntity[] newArray(int i) {
        return new GameRequestEntity[i];
    }
}
