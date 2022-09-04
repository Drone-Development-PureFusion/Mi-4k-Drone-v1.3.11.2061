package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.quest.b */
/* loaded from: classes2.dex */
public class C5987b implements Parcelable.Creator<MilestoneEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m19210a(MilestoneEntity milestoneEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, milestoneEntity.mo19245c(), false);
        C4630b.m23474a(parcel, 2, milestoneEntity.mo19244d());
        C4630b.m23474a(parcel, 3, milestoneEntity.mo19241g());
        C4630b.m23460a(parcel, 4, milestoneEntity.mo19240h(), false);
        C4630b.m23475a(parcel, 5, milestoneEntity.mo19242f());
        C4630b.m23464a(parcel, 6, milestoneEntity.mo19243e(), false);
        C4630b.m23475a(parcel, 1000, milestoneEntity.m19247i());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MilestoneEntity createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        byte[] bArr = null;
        long j2 = 0;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 5:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 1000:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new MilestoneEntity(i2, str2, j2, j, bArr, i, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MilestoneEntity[] newArray(int i) {
        return new MilestoneEntity[i];
    }
}
