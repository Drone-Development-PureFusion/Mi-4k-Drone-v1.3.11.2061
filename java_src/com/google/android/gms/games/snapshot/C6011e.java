package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.snapshot.e */
/* loaded from: classes2.dex */
public class C6011e implements Parcelable.Creator<SnapshotMetadataChangeEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19090a(SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, snapshotMetadataChangeEntity.mo19103a(), false);
        C4630b.m23465a(parcel, 2, snapshotMetadataChangeEntity.mo19102b(), false);
        C4630b.m23470a(parcel, 4, (Parcelable) snapshotMetadataChangeEntity.m19131g(), i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) snapshotMetadataChangeEntity.mo19101c(), i, false);
        C4630b.m23465a(parcel, 6, snapshotMetadataChangeEntity.mo19099e(), false);
        C4630b.m23475a(parcel, 1000, snapshotMetadataChangeEntity.m19132f());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SnapshotMetadataChangeEntity createFromParcel(Parcel parcel) {
        Long l = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Uri uri = null;
        BitmapTeleporter bitmapTeleporter = null;
        Long l2 = null;
        String str = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    l2 = C4628a.m23497j(parcel, m23514a);
                    break;
                case 4:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 5:
                    bitmapTeleporter = (BitmapTeleporter) C4628a.m23510a(parcel, m23514a, BitmapTeleporter.CREATOR);
                    break;
                case 6:
                    l = C4628a.m23497j(parcel, m23514a);
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
        return new SnapshotMetadataChangeEntity(i, str, l2, bitmapTeleporter, uri, l);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SnapshotMetadataChangeEntity[] newArray(int i) {
        return new SnapshotMetadataChangeEntity[i];
    }
}
