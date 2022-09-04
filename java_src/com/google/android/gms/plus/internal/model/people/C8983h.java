package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.plus.internal.model.people.h */
/* loaded from: classes2.dex */
public class C8983h implements Parcelable.Creator<PersonEntity.OrganizationsEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9498a(PersonEntity.OrganizationsEntity organizationsEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        Set<Integer> set = organizationsEntity.f28584a;
        if (set.contains(1)) {
            C4630b.m23475a(parcel, 1, organizationsEntity.f28585b);
        }
        if (set.contains(2)) {
            C4630b.m23464a(parcel, 2, organizationsEntity.f28586c, true);
        }
        if (set.contains(3)) {
            C4630b.m23464a(parcel, 3, organizationsEntity.f28587d, true);
        }
        if (set.contains(4)) {
            C4630b.m23464a(parcel, 4, organizationsEntity.f28588e, true);
        }
        if (set.contains(5)) {
            C4630b.m23464a(parcel, 5, organizationsEntity.f28589f, true);
        }
        if (set.contains(6)) {
            C4630b.m23464a(parcel, 6, organizationsEntity.f28590g, true);
        }
        if (set.contains(7)) {
            C4630b.m23461a(parcel, 7, organizationsEntity.f28591h);
        }
        if (set.contains(8)) {
            C4630b.m23464a(parcel, 8, organizationsEntity.f28592i, true);
        }
        if (set.contains(9)) {
            C4630b.m23464a(parcel, 9, organizationsEntity.f28593j, true);
        }
        if (set.contains(10)) {
            C4630b.m23475a(parcel, 10, organizationsEntity.f28594k);
        }
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.OrganizationsEntity createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        HashSet hashSet = new HashSet();
        String str2 = null;
        boolean z = false;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(1);
                    break;
                case 2:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(2);
                    break;
                case 3:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(3);
                    break;
                case 4:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(4);
                    break;
                case 5:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(5);
                    break;
                case 6:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(6);
                    break;
                case 7:
                    z = C4628a.m23505c(parcel, m23514a);
                    hashSet.add(7);
                    break;
                case 8:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(8);
                    break;
                case 9:
                    str = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(9);
                    break;
                case 10:
                    i = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(10);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PersonEntity.OrganizationsEntity(hashSet, i2, str7, str6, str5, str4, str3, z, str2, str, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.OrganizationsEntity[] newArray(int i) {
        return new PersonEntity.OrganizationsEntity[i];
    }
}
