package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.plus.internal.model.people.i */
/* loaded from: classes2.dex */
public class C8984i implements Parcelable.Creator<PersonEntity.PlacesLivedEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9495a(PersonEntity.PlacesLivedEntity placesLivedEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        Set<Integer> set = placesLivedEntity.f28596a;
        if (set.contains(1)) {
            C4630b.m23475a(parcel, 1, placesLivedEntity.f28597b);
        }
        if (set.contains(2)) {
            C4630b.m23461a(parcel, 2, placesLivedEntity.f28598c);
        }
        if (set.contains(3)) {
            C4630b.m23464a(parcel, 3, placesLivedEntity.f28599d, true);
        }
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.PlacesLivedEntity createFromParcel(Parcel parcel) {
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(1);
                    break;
                case 2:
                    z = C4628a.m23505c(parcel, m23514a);
                    hashSet.add(2);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
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
        return new PersonEntity.PlacesLivedEntity(hashSet, i, z, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.PlacesLivedEntity[] newArray(int i) {
        return new PersonEntity.PlacesLivedEntity[i];
    }
}
