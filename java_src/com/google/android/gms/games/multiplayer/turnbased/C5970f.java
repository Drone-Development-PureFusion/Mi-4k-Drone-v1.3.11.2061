package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.multiplayer.turnbased.f */
/* loaded from: classes2.dex */
public class C5970f implements Parcelable.Creator<TurnBasedMatchEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19300a(TurnBasedMatchEntity turnBasedMatchEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) turnBasedMatchEntity.mo19350c(), i, false);
        C4630b.m23464a(parcel, 2, turnBasedMatchEntity.mo19349d(), false);
        C4630b.m23464a(parcel, 3, turnBasedMatchEntity.mo19348e(), false);
        C4630b.m23474a(parcel, 4, turnBasedMatchEntity.mo19347f());
        C4630b.m23464a(parcel, 5, turnBasedMatchEntity.mo19342k(), false);
        C4630b.m23474a(parcel, 6, turnBasedMatchEntity.mo19341l());
        C4630b.m23464a(parcel, 7, turnBasedMatchEntity.mo19339n(), false);
        C4630b.m23475a(parcel, 1000, turnBasedMatchEntity.m19362A());
        C4630b.m23475a(parcel, 8, turnBasedMatchEntity.mo19346g());
        C4630b.m23475a(parcel, 10, turnBasedMatchEntity.mo19343j());
        C4630b.m23475a(parcel, 11, turnBasedMatchEntity.mo19335p());
        C4630b.m23460a(parcel, 12, turnBasedMatchEntity.mo19337o(), false);
        C4630b.m23447c(parcel, 13, turnBasedMatchEntity.mo19340m(), false);
        C4630b.m23464a(parcel, 14, turnBasedMatchEntity.mo19333r(), false);
        C4630b.m23460a(parcel, 15, turnBasedMatchEntity.mo19332s(), false);
        C4630b.m23475a(parcel, 16, turnBasedMatchEntity.mo19331t());
        C4630b.m23473a(parcel, 17, turnBasedMatchEntity.mo19330u(), false);
        C4630b.m23475a(parcel, 18, turnBasedMatchEntity.mo19345h());
        C4630b.m23461a(parcel, 19, turnBasedMatchEntity.mo19328w());
        C4630b.m23464a(parcel, 20, turnBasedMatchEntity.mo19344i(), false);
        C4630b.m23464a(parcel, 21, turnBasedMatchEntity.mo19326y(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TurnBasedMatchEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        String str = null;
        String str2 = null;
        long j = 0;
        String str3 = null;
        long j2 = 0;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr = null;
        ArrayList arrayList = null;
        String str5 = null;
        byte[] bArr2 = null;
        int i5 = 0;
        Bundle bundle = null;
        int i6 = 0;
        boolean z = false;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    gameEntity = (GameEntity) C4628a.m23510a(parcel, m23514a, GameEntity.CREATOR);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 7:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 10:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 11:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 12:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 13:
                    arrayList = C4628a.m23504c(parcel, m23514a, ParticipantEntity.CREATOR);
                    break;
                case 14:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 15:
                    bArr2 = C4628a.m23487t(parcel, m23514a);
                    break;
                case 16:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 17:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 18:
                    i6 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 19:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 20:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 21:
                    str7 = C4628a.m23490q(parcel, m23514a);
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
        return new TurnBasedMatchEntity(i, gameEntity, str, str2, j, str3, j2, str4, i2, i3, i4, bArr, arrayList, str5, bArr2, i5, bundle, i6, z, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TurnBasedMatchEntity[] newArray(int i) {
        return new TurnBasedMatchEntity[i];
    }
}
