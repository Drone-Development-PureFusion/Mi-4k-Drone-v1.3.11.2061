package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.snapshot.b */
/* loaded from: classes2.dex */
public class C6007b implements Parcelable.Creator<SnapshotEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19105a(SnapshotEntity snapshotEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) snapshotEntity.mo19137c(), i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) snapshotEntity.mo19136d(), i, false);
        C4630b.m23475a(parcel, 1000, snapshotEntity.m19135e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SnapshotEntity createFromParcel(Parcel parcel) {
        SnapshotMetadataEntity snapshotMetadataEntity;
        int m23500g;
        SnapshotContentsEntity snapshotContentsEntity;
        SnapshotContentsEntity snapshotContentsEntity2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        SnapshotMetadataEntity snapshotMetadataEntity2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    SnapshotMetadataEntity snapshotMetadataEntity3 = (SnapshotMetadataEntity) C4628a.m23510a(parcel, m23514a, SnapshotMetadataEntity.CREATOR);
                    m23500g = i;
                    snapshotContentsEntity = snapshotContentsEntity2;
                    snapshotMetadataEntity = snapshotMetadataEntity3;
                    break;
                case 3:
                    snapshotContentsEntity = (SnapshotContentsEntity) C4628a.m23510a(parcel, m23514a, SnapshotContentsEntity.CREATOR);
                    snapshotMetadataEntity = snapshotMetadataEntity2;
                    m23500g = i;
                    break;
                case 1000:
                    SnapshotContentsEntity snapshotContentsEntity3 = snapshotContentsEntity2;
                    snapshotMetadataEntity = snapshotMetadataEntity2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    snapshotContentsEntity = snapshotContentsEntity3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    snapshotContentsEntity = snapshotContentsEntity2;
                    snapshotMetadataEntity = snapshotMetadataEntity2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            snapshotMetadataEntity2 = snapshotMetadataEntity;
            snapshotContentsEntity2 = snapshotContentsEntity;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SnapshotEntity(i, snapshotMetadataEntity2, snapshotContentsEntity2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SnapshotEntity[] newArray(int i) {
        return new SnapshotEntity[i];
    }
}
