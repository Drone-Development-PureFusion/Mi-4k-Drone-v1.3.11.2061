package com.google.android.gms.games.social;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.PlayerEntity;
/* renamed from: com.google.android.gms.games.social.d */
/* loaded from: classes2.dex */
public class C6025d implements Parcelable.Creator<SocialInviteEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19049a(SocialInviteEntity socialInviteEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, socialInviteEntity.mo19060c(), false);
        C4630b.m23470a(parcel, 2, (Parcelable) socialInviteEntity.mo19059d(), i, false);
        C4630b.m23475a(parcel, 3, socialInviteEntity.mo19058e());
        C4630b.m23475a(parcel, 4, socialInviteEntity.mo19057f());
        C4630b.m23474a(parcel, 5, socialInviteEntity.mo19056g());
        C4630b.m23475a(parcel, 1000, socialInviteEntity.m19062h());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SocialInviteEntity createFromParcel(Parcel parcel) {
        PlayerEntity playerEntity = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) C4628a.m23510a(parcel, m23514a, PlayerEntity.CREATOR);
                    break;
                case 3:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 1000:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SocialInviteEntity(i3, str, playerEntity, i2, i, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SocialInviteEntity[] newArray(int i) {
        return new SocialInviteEntity[i];
    }
}
