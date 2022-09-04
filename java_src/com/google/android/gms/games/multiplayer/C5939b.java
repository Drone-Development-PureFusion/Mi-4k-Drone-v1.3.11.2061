package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.multiplayer.b */
/* loaded from: classes2.dex */
public class C5939b implements Parcelable.Creator<InvitationEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19461a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) invitationEntity.mo19495e(), i, false);
        C4630b.m23464a(parcel, 2, invitationEntity.mo19494f(), false);
        C4630b.m23474a(parcel, 3, invitationEntity.mo19492h());
        C4630b.m23475a(parcel, 4, invitationEntity.mo19491i());
        C4630b.m23470a(parcel, 5, (Parcelable) invitationEntity.mo19493g(), i, false);
        C4630b.m23447c(parcel, 6, invitationEntity.mo19340m(), false);
        C4630b.m23475a(parcel, 7, invitationEntity.mo19490j());
        C4630b.m23475a(parcel, 1000, invitationEntity.m19499l());
        C4630b.m23475a(parcel, 8, invitationEntity.mo19489k());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public InvitationEntity createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        int i2 = 0;
        ParticipantEntity participantEntity = null;
        int i3 = 0;
        String str = null;
        GameEntity gameEntity = null;
        int i4 = 0;
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
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    participantEntity = (ParticipantEntity) C4628a.m23510a(parcel, m23514a, ParticipantEntity.CREATOR);
                    break;
                case 6:
                    arrayList = C4628a.m23504c(parcel, m23514a, ParticipantEntity.CREATOR);
                    break;
                case 7:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 1000:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new InvitationEntity(i4, gameEntity, str, j, i3, participantEntity, arrayList, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public InvitationEntity[] newArray(int i) {
        return new InvitationEntity[i];
    }
}
