package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.plus.internal.model.people.c */
/* loaded from: classes2.dex */
public class C8978c implements Parcelable.Creator<PersonEntity.CoverEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9513a(PersonEntity.CoverEntity coverEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        Set<Integer> set = coverEntity.f28554a;
        if (set.contains(1)) {
            C4630b.m23475a(parcel, 1, coverEntity.f28555b);
        }
        if (set.contains(2)) {
            C4630b.m23470a(parcel, 2, (Parcelable) coverEntity.f28556c, i, true);
        }
        if (set.contains(3)) {
            C4630b.m23470a(parcel, 3, (Parcelable) coverEntity.f28557d, i, true);
        }
        if (set.contains(4)) {
            C4630b.m23475a(parcel, 4, coverEntity.f28558e);
        }
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.CoverEntity createFromParcel(Parcel parcel) {
        PersonEntity.CoverEntity.CoverPhotoEntity coverPhotoEntity = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        HashSet hashSet = new HashSet();
        PersonEntity.CoverEntity.CoverInfoEntity coverInfoEntity = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(1);
                    break;
                case 2:
                    hashSet.add(2);
                    coverInfoEntity = (PersonEntity.CoverEntity.CoverInfoEntity) C4628a.m23510a(parcel, m23514a, PersonEntity.CoverEntity.CoverInfoEntity.CREATOR);
                    break;
                case 3:
                    hashSet.add(3);
                    coverPhotoEntity = (PersonEntity.CoverEntity.CoverPhotoEntity) C4628a.m23510a(parcel, m23514a, PersonEntity.CoverEntity.CoverPhotoEntity.CREATOR);
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(4);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PersonEntity.CoverEntity(hashSet, i2, coverInfoEntity, coverPhotoEntity, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.CoverEntity[] newArray(int i) {
        return new PersonEntity.CoverEntity[i];
    }
}
