package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.b */
/* loaded from: classes2.dex */
public class C5354b implements Parcelable.Creator<GameEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20512a(GameEntity gameEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, gameEntity.mo20777c(), false);
        C4630b.m23464a(parcel, 2, gameEntity.mo20775d(), false);
        C4630b.m23464a(parcel, 3, gameEntity.mo20774e(), false);
        C4630b.m23464a(parcel, 4, gameEntity.mo20773f(), false);
        C4630b.m23464a(parcel, 5, gameEntity.mo20772g(), false);
        C4630b.m23464a(parcel, 6, gameEntity.mo20771h(), false);
        C4630b.m23470a(parcel, 7, (Parcelable) gameEntity.mo20770i(), i, false);
        C4630b.m23470a(parcel, 8, (Parcelable) gameEntity.mo20769j(), i, false);
        C4630b.m23470a(parcel, 9, (Parcelable) gameEntity.mo20768k(), i, false);
        C4630b.m23461a(parcel, 10, gameEntity.mo20767l());
        C4630b.m23461a(parcel, 11, gameEntity.mo20764o());
        C4630b.m23464a(parcel, 12, gameEntity.mo20763p(), false);
        C4630b.m23475a(parcel, 13, gameEntity.m20781y());
        C4630b.m23475a(parcel, 14, gameEntity.mo20762q());
        C4630b.m23475a(parcel, 15, gameEntity.mo20761r());
        C4630b.m23461a(parcel, 16, gameEntity.mo20760s());
        C4630b.m23461a(parcel, 17, gameEntity.mo20759t());
        C4630b.m23464a(parcel, 18, gameEntity.getIconImageUrl(), false);
        C4630b.m23464a(parcel, 19, gameEntity.getHiResImageUrl(), false);
        C4630b.m23464a(parcel, 20, gameEntity.getFeaturedImageUrl(), false);
        C4630b.m23461a(parcel, 21, gameEntity.mo20766m());
        C4630b.m23461a(parcel, 22, gameEntity.mo20765n());
        C4630b.m23461a(parcel, 23, gameEntity.mo20758u());
        C4630b.m23464a(parcel, 24, gameEntity.mo20757v(), false);
        C4630b.m23461a(parcel, 25, gameEntity.mo20756w());
        C4630b.m23475a(parcel, 1000, gameEntity.m20782x());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GameEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean z = false;
        boolean z2 = false;
        String str7 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        String str11 = null;
        boolean z8 = false;
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
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 8:
                    uri2 = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 9:
                    uri3 = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 10:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 11:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 12:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 13:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 14:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 15:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 16:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 17:
                    z4 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 18:
                    str8 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 19:
                    str9 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 20:
                    str10 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 21:
                    z5 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 22:
                    z6 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 23:
                    z7 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 24:
                    str11 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 25:
                    z8 = C4628a.m23505c(parcel, m23514a);
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
        return new GameEntity(i, str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i2, i3, i4, z3, z4, str8, str9, str10, z5, z6, z7, str11, z8);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GameEntity[] newArray(int i) {
        return new GameEntity[i];
    }
}
