package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
/* renamed from: com.google.android.gms.games.snapshot.f */
/* loaded from: classes2.dex */
public class C6012f implements Parcelable.Creator<SnapshotMetadataEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19087a(SnapshotMetadataEntity snapshotMetadataEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) snapshotMetadataEntity.mo19124c(), i, false);
        C4630b.m23470a(parcel, 2, (Parcelable) snapshotMetadataEntity.mo19123d(), i, false);
        C4630b.m23464a(parcel, 3, snapshotMetadataEntity.mo19122e(), false);
        C4630b.m23470a(parcel, 5, (Parcelable) snapshotMetadataEntity.mo19121f(), i, false);
        C4630b.m23464a(parcel, 6, snapshotMetadataEntity.getCoverImageUrl(), false);
        C4630b.m23464a(parcel, 7, snapshotMetadataEntity.mo19118i(), false);
        C4630b.m23475a(parcel, 1000, snapshotMetadataEntity.m19127p());
        C4630b.m23464a(parcel, 8, snapshotMetadataEntity.mo19117j(), false);
        C4630b.m23474a(parcel, 9, snapshotMetadataEntity.mo19116k());
        C4630b.m23474a(parcel, 10, snapshotMetadataEntity.mo19115l());
        C4630b.m23476a(parcel, 11, snapshotMetadataEntity.mo19120g());
        C4630b.m23464a(parcel, 12, snapshotMetadataEntity.mo19119h(), false);
        C4630b.m23461a(parcel, 13, snapshotMetadataEntity.mo19114m());
        C4630b.m23474a(parcel, 14, snapshotMetadataEntity.mo19113n());
        C4630b.m23464a(parcel, 15, snapshotMetadataEntity.mo19112o(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SnapshotMetadataEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String str = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        float f = 0.0f;
        String str5 = null;
        boolean z = false;
        long j3 = 0;
        String str6 = null;
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
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 10:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 11:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 12:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 13:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 14:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 15:
                    str6 = C4628a.m23490q(parcel, m23514a);
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
        return new SnapshotMetadataEntity(i, gameEntity, playerEntity, str, uri, str2, str3, str4, j, j2, f, str5, z, j3, str6);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SnapshotMetadataEntity[] newArray(int i) {
        return new SnapshotMetadataEntity[i];
    }
}
