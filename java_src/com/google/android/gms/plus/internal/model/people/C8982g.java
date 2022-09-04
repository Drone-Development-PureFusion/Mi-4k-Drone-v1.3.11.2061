package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.plus.internal.model.people.g */
/* loaded from: classes2.dex */
public class C8982g implements Parcelable.Creator<PersonEntity.NameEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9501a(PersonEntity.NameEntity nameEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        Set<Integer> set = nameEntity.f28575a;
        if (set.contains(1)) {
            C4630b.m23475a(parcel, 1, nameEntity.f28576b);
        }
        if (set.contains(2)) {
            C4630b.m23464a(parcel, 2, nameEntity.f28577c, true);
        }
        if (set.contains(3)) {
            C4630b.m23464a(parcel, 3, nameEntity.f28578d, true);
        }
        if (set.contains(4)) {
            C4630b.m23464a(parcel, 4, nameEntity.f28579e, true);
        }
        if (set.contains(5)) {
            C4630b.m23464a(parcel, 5, nameEntity.f28580f, true);
        }
        if (set.contains(6)) {
            C4630b.m23464a(parcel, 6, nameEntity.f28581g, true);
        }
        if (set.contains(7)) {
            C4630b.m23464a(parcel, 7, nameEntity.f28582h, true);
        }
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.NameEntity createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(1);
                    break;
                case 2:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(2);
                    break;
                case 3:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(3);
                    break;
                case 4:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(4);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(5);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(6);
                    break;
                case 7:
                    str = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(7);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PersonEntity.NameEntity(hashSet, i, str6, str5, str4, str3, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.NameEntity[] newArray(int i) {
        return new PersonEntity.NameEntity[i];
    }
}
