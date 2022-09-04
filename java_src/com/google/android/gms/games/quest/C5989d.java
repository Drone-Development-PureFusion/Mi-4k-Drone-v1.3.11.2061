package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.quest.d */
/* loaded from: classes2.dex */
public class C5989d implements Parcelable.Creator<QuestEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19206a(QuestEntity questEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) questEntity.mo19223j(), i, false);
        C4630b.m23464a(parcel, 2, questEntity.mo19230c(), false);
        C4630b.m23474a(parcel, 3, questEntity.mo19220m());
        C4630b.m23470a(parcel, 4, (Parcelable) questEntity.mo19227f(), i, false);
        C4630b.m23464a(parcel, 5, questEntity.getBannerImageUrl(), false);
        C4630b.m23464a(parcel, 6, questEntity.mo19228e(), false);
        C4630b.m23474a(parcel, 7, questEntity.mo19219n());
        C4630b.m23475a(parcel, 1000, questEntity.m19234s());
        C4630b.m23474a(parcel, 8, questEntity.mo19218o());
        C4630b.m23470a(parcel, 9, (Parcelable) questEntity.mo19226g(), i, false);
        C4630b.m23464a(parcel, 10, questEntity.getIconImageUrl(), false);
        C4630b.m23464a(parcel, 12, questEntity.mo19229d(), false);
        C4630b.m23474a(parcel, 13, questEntity.mo19217p());
        C4630b.m23474a(parcel, 14, questEntity.mo19216q());
        C4630b.m23475a(parcel, 15, questEntity.mo19222k());
        C4630b.m23475a(parcel, 16, questEntity.mo19221l());
        C4630b.m23447c(parcel, 17, questEntity.mo19224i(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public QuestEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        String str = null;
        long j = 0;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        long j2 = 0;
        long j3 = 0;
        Uri uri2 = null;
        String str4 = null;
        String str5 = null;
        long j4 = 0;
        long j5 = 0;
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList = null;
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
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 5:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 8:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 9:
                    uri2 = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 10:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 12:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 13:
                    j4 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 14:
                    j5 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 15:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 16:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 17:
                    arrayList = C4628a.m23504c(parcel, m23514a, MilestoneEntity.CREATOR);
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
        return new QuestEntity(i, gameEntity, str, j, uri, str2, str3, j2, j3, uri2, str4, str5, j4, j5, i2, i3, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public QuestEntity[] newArray(int i) {
        return new QuestEntity[i];
    }
}
