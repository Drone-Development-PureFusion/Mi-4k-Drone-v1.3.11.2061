package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.internal.player.a */
/* loaded from: classes2.dex */
public class C5923a implements Parcelable.Creator<MostRecentGameInfoEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19536a(MostRecentGameInfoEntity mostRecentGameInfoEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, mostRecentGameInfoEntity.mo19551c(), false);
        C4630b.m23464a(parcel, 2, mostRecentGameInfoEntity.mo19550d(), false);
        C4630b.m23474a(parcel, 3, mostRecentGameInfoEntity.mo19549e());
        C4630b.m23470a(parcel, 4, (Parcelable) mostRecentGameInfoEntity.mo19548f(), i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) mostRecentGameInfoEntity.mo19547g(), i, false);
        C4630b.m23470a(parcel, 6, (Parcelable) mostRecentGameInfoEntity.mo19546h(), i, false);
        C4630b.m23475a(parcel, 1000, mostRecentGameInfoEntity.m19553i());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MostRecentGameInfoEntity createFromParcel(Parcel parcel) {
        Uri uri = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        Uri uri2 = null;
        Uri uri3 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    uri3 = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 6:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
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
        return new MostRecentGameInfoEntity(i, str2, str, j, uri3, uri2, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MostRecentGameInfoEntity[] newArray(int i) {
        return new MostRecentGameInfoEntity[i];
    }
}
