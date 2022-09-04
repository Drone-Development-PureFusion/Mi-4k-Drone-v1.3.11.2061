package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.PlayerEntity;
/* renamed from: com.google.android.gms.games.multiplayer.g */
/* loaded from: classes2.dex */
public class C5945g implements Parcelable.Creator<ParticipantEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19449a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, participantEntity.mo19472j(), false);
        C4630b.m23464a(parcel, 2, participantEntity.mo19475g(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) participantEntity.mo19474h(), i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) participantEntity.mo19473i(), i, false);
        C4630b.m23475a(parcel, 5, participantEntity.mo19479c());
        C4630b.m23464a(parcel, 6, participantEntity.mo19478d(), false);
        C4630b.m23461a(parcel, 7, participantEntity.mo19476f());
        C4630b.m23475a(parcel, 1000, participantEntity.m19483m());
        C4630b.m23470a(parcel, 8, (Parcelable) participantEntity.mo19471k(), i, false);
        C4630b.m23475a(parcel, 9, participantEntity.mo19477e());
        C4630b.m23470a(parcel, 10, (Parcelable) participantEntity.mo19470l(), i, false);
        C4630b.m23464a(parcel, 11, participantEntity.getIconImageUrl(), false);
        C4630b.m23464a(parcel, 12, participantEntity.getHiResImageUrl(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        int i2 = 0;
        String str3 = null;
        boolean z = false;
        PlayerEntity playerEntity = null;
        int i3 = 0;
        ParticipantResult participantResult = null;
        String str4 = null;
        String str5 = null;
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
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 8:
                    playerEntity = (PlayerEntity) C4628a.m23510a(parcel, m23514a, PlayerEntity.CREATOR);
                    break;
                case 9:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 10:
                    participantResult = (ParticipantResult) C4628a.m23510a(parcel, m23514a, ParticipantResult.CREATOR);
                    break;
                case 11:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 12:
                    str5 = C4628a.m23490q(parcel, m23514a);
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
        return new ParticipantEntity(i, str, str2, uri, uri2, i2, str3, z, playerEntity, i3, participantResult, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParticipantEntity[] newArray(int i) {
        return new ParticipantEntity[i];
    }
}
