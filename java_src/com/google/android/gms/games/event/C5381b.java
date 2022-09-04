package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.games.PlayerEntity;
/* renamed from: com.google.android.gms.games.event.b */
/* loaded from: classes2.dex */
public class C5381b implements Parcelable.Creator<EventEntity> {

    /* renamed from: a */
    public static final int f19469a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20458a(EventEntity eventEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, eventEntity.mo20471c(), false);
        C4630b.m23464a(parcel, 2, eventEntity.mo20469d(), false);
        C4630b.m23464a(parcel, 3, eventEntity.mo20468e(), false);
        C4630b.m23470a(parcel, 4, (Parcelable) eventEntity.mo20467f(), i, false);
        C4630b.m23464a(parcel, 5, eventEntity.getIconImageUrl(), false);
        C4630b.m23470a(parcel, 6, (Parcelable) eventEntity.mo20466g(), i, false);
        C4630b.m23474a(parcel, 7, eventEntity.mo20465h());
        C4630b.m23475a(parcel, 1000, eventEntity.m20475k());
        C4630b.m23464a(parcel, 8, eventEntity.mo20464i(), false);
        C4630b.m23461a(parcel, 9, eventEntity.mo20463j());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public EventEntity createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        PlayerEntity playerEntity = null;
        String str2 = null;
        Uri uri = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 5:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    playerEntity = (PlayerEntity) C4628a.m23510a(parcel, m23514a, PlayerEntity.CREATOR);
                    break;
                case 7:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 8:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new EventEntity(i, str5, str4, str3, uri, str2, playerEntity, j, str, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public EventEntity[] newArray(int i) {
        return new EventEntity[i];
    }
}
