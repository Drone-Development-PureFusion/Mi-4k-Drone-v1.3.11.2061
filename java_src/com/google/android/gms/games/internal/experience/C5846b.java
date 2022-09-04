package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.GameEntity;
/* renamed from: com.google.android.gms.games.internal.experience.b */
/* loaded from: classes2.dex */
public class C5846b implements Parcelable.Creator<ExperienceEventEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19968a(ExperienceEventEntity experienceEventEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, experienceEventEntity.mo19982c(), false);
        C4630b.m23470a(parcel, 2, (Parcelable) experienceEventEntity.mo19981d(), i, false);
        C4630b.m23464a(parcel, 3, experienceEventEntity.mo19980e(), false);
        C4630b.m23464a(parcel, 4, experienceEventEntity.mo19979f(), false);
        C4630b.m23464a(parcel, 5, experienceEventEntity.getIconImageUrl(), false);
        C4630b.m23470a(parcel, 6, (Parcelable) experienceEventEntity.mo19978g(), i, false);
        C4630b.m23474a(parcel, 7, experienceEventEntity.mo19977h());
        C4630b.m23475a(parcel, 1000, experienceEventEntity.m19984m());
        C4630b.m23474a(parcel, 8, experienceEventEntity.mo19976i());
        C4630b.m23474a(parcel, 9, experienceEventEntity.mo19975j());
        C4630b.m23475a(parcel, 10, experienceEventEntity.mo19974k());
        C4630b.m23475a(parcel, 11, experienceEventEntity.mo19973l());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ExperienceEventEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        GameEntity gameEntity = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    gameEntity = (GameEntity) C4628a.m23510a(parcel, m23514a, GameEntity.CREATOR);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 7:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 8:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 9:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 10:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 11:
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
        return new ExperienceEventEntity(i, str, gameEntity, str2, str3, str4, uri, j, j2, j3, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ExperienceEventEntity[] newArray(int i) {
        return new ExperienceEventEntity[i];
    }
}
