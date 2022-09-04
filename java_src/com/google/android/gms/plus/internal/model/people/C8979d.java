package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.plus.internal.model.people.d */
/* loaded from: classes2.dex */
public class C8979d implements Parcelable.Creator<PersonEntity.CoverEntity.CoverInfoEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9510a(PersonEntity.CoverEntity.CoverInfoEntity coverInfoEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        Set<Integer> set = coverInfoEntity.f28560a;
        if (set.contains(1)) {
            C4630b.m23475a(parcel, 1, coverInfoEntity.f28561b);
        }
        if (set.contains(2)) {
            C4630b.m23475a(parcel, 2, coverInfoEntity.f28562c);
        }
        if (set.contains(3)) {
            C4630b.m23475a(parcel, 3, coverInfoEntity.f28563d);
        }
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.CoverEntity.CoverInfoEntity createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(1);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(2);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(3);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PersonEntity.CoverEntity.CoverInfoEntity(hashSet, i3, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.CoverEntity.CoverInfoEntity[] newArray(int i) {
        return new PersonEntity.CoverEntity.CoverInfoEntity[i];
    }
}
