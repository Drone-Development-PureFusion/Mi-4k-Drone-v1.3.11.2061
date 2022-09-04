package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.plus.internal.model.people.f */
/* loaded from: classes2.dex */
public class C8981f implements Parcelable.Creator<PersonEntity.ImageEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9504a(PersonEntity.ImageEntity imageEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        Set<Integer> set = imageEntity.f28571a;
        if (set.contains(1)) {
            C4630b.m23475a(parcel, 1, imageEntity.f28572b);
        }
        if (set.contains(2)) {
            C4630b.m23464a(parcel, 2, imageEntity.f28573c, true);
        }
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.ImageEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(1);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(2);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PersonEntity.ImageEntity(hashSet, i, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.ImageEntity[] newArray(int i) {
        return new PersonEntity.ImageEntity[i];
    }
}
