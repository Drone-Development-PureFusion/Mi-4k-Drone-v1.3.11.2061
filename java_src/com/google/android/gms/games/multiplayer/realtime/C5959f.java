package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.multiplayer.realtime.f */
/* loaded from: classes2.dex */
public class C5959f implements Parcelable.Creator<RoomEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19379a(RoomEntity roomEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, roomEntity.mo19425c(), false);
        C4630b.m23464a(parcel, 2, roomEntity.mo19424d(), false);
        C4630b.m23474a(parcel, 3, roomEntity.mo19423e());
        C4630b.m23475a(parcel, 4, roomEntity.mo19422f());
        C4630b.m23464a(parcel, 5, roomEntity.mo19421g(), false);
        C4630b.m23475a(parcel, 6, roomEntity.mo19420h());
        C4630b.m23473a(parcel, 7, roomEntity.mo19419i(), false);
        C4630b.m23475a(parcel, 1000, roomEntity.m19430l());
        C4630b.m23447c(parcel, 8, roomEntity.mo19340m(), false);
        C4630b.m23475a(parcel, 9, roomEntity.mo19418j());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RoomEntity createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 8:
                    arrayList = C4628a.m23504c(parcel, m23514a, ParticipantEntity.CREATOR);
                    break;
                case 9:
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
        return new RoomEntity(i4, str3, str2, j, i3, str, i2, bundle, arrayList, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RoomEntity[] newArray(int i) {
        return new RoomEntity[i];
    }
}
