package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.plus.internal.model.people.a */
/* loaded from: classes2.dex */
public class C8976a implements Parcelable.Creator<PersonEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9519a(PersonEntity personEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        Set<Integer> set = personEntity.f28522a;
        if (set.contains(1)) {
            C4630b.m23475a(parcel, 1, personEntity.f28523b);
        }
        if (set.contains(2)) {
            C4630b.m23464a(parcel, 2, personEntity.f28524c, true);
        }
        if (set.contains(3)) {
            C4630b.m23470a(parcel, 3, (Parcelable) personEntity.f28525d, i, true);
        }
        if (set.contains(4)) {
            C4630b.m23464a(parcel, 4, personEntity.f28526e, true);
        }
        if (set.contains(5)) {
            C4630b.m23464a(parcel, 5, personEntity.f28527f, true);
        }
        if (set.contains(6)) {
            C4630b.m23475a(parcel, 6, personEntity.f28528g);
        }
        if (set.contains(7)) {
            C4630b.m23470a(parcel, 7, (Parcelable) personEntity.f28529h, i, true);
        }
        if (set.contains(8)) {
            C4630b.m23464a(parcel, 8, personEntity.f28530i, true);
        }
        if (set.contains(9)) {
            C4630b.m23464a(parcel, 9, personEntity.f28531j, true);
        }
        if (set.contains(12)) {
            C4630b.m23475a(parcel, 12, personEntity.f28532k);
        }
        if (set.contains(14)) {
            C4630b.m23464a(parcel, 14, personEntity.f28533l, true);
        }
        if (set.contains(15)) {
            C4630b.m23470a(parcel, 15, (Parcelable) personEntity.f28534m, i, true);
        }
        if (set.contains(16)) {
            C4630b.m23461a(parcel, 16, personEntity.f28535n);
        }
        if (set.contains(18)) {
            C4630b.m23464a(parcel, 18, personEntity.f28536o, true);
        }
        if (set.contains(19)) {
            C4630b.m23470a(parcel, 19, (Parcelable) personEntity.f28537p, i, true);
        }
        if (set.contains(20)) {
            C4630b.m23464a(parcel, 20, personEntity.f28538q, true);
        }
        if (set.contains(21)) {
            C4630b.m23475a(parcel, 21, personEntity.f28539r);
        }
        if (set.contains(22)) {
            C4630b.m23447c(parcel, 22, personEntity.f28540s, true);
        }
        if (set.contains(23)) {
            C4630b.m23447c(parcel, 23, personEntity.f28541t, true);
        }
        if (set.contains(24)) {
            C4630b.m23475a(parcel, 24, personEntity.f28542u);
        }
        if (set.contains(25)) {
            C4630b.m23475a(parcel, 25, personEntity.f28543v);
        }
        if (set.contains(26)) {
            C4630b.m23464a(parcel, 26, personEntity.f28544w, true);
        }
        if (set.contains(27)) {
            C4630b.m23464a(parcel, 27, personEntity.f28545x, true);
        }
        if (set.contains(28)) {
            C4630b.m23447c(parcel, 28, personEntity.f28546y, true);
        }
        if (set.contains(29)) {
            C4630b.m23461a(parcel, 29, personEntity.f28547z);
        }
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        PersonEntity.AgeRangeEntity ageRangeEntity = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        PersonEntity.CoverEntity coverEntity = null;
        String str4 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        PersonEntity.ImageEntity imageEntity = null;
        boolean z = false;
        String str7 = null;
        PersonEntity.NameEntity nameEntity = null;
        String str8 = null;
        int i4 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i5 = 0;
        int i6 = 0;
        String str9 = null;
        String str10 = null;
        ArrayList arrayList3 = null;
        boolean z2 = false;
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
                case 3:
                    hashSet.add(3);
                    ageRangeEntity = (PersonEntity.AgeRangeEntity) C4628a.m23510a(parcel, m23514a, PersonEntity.AgeRangeEntity.CREATOR);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(4);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(5);
                    break;
                case 6:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(6);
                    break;
                case 7:
                    hashSet.add(7);
                    coverEntity = (PersonEntity.CoverEntity) C4628a.m23510a(parcel, m23514a, PersonEntity.CoverEntity.CREATOR);
                    break;
                case 8:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(8);
                    break;
                case 9:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(9);
                    break;
                case 10:
                case 11:
                case 13:
                case 17:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
                case 12:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(12);
                    break;
                case 14:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(14);
                    break;
                case 15:
                    hashSet.add(15);
                    imageEntity = (PersonEntity.ImageEntity) C4628a.m23510a(parcel, m23514a, PersonEntity.ImageEntity.CREATOR);
                    break;
                case 16:
                    z = C4628a.m23505c(parcel, m23514a);
                    hashSet.add(16);
                    break;
                case 18:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(18);
                    break;
                case 19:
                    hashSet.add(19);
                    nameEntity = (PersonEntity.NameEntity) C4628a.m23510a(parcel, m23514a, PersonEntity.NameEntity.CREATOR);
                    break;
                case 20:
                    str8 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(20);
                    break;
                case 21:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(21);
                    break;
                case 22:
                    arrayList = C4628a.m23504c(parcel, m23514a, PersonEntity.OrganizationsEntity.CREATOR);
                    hashSet.add(22);
                    break;
                case 23:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, PersonEntity.PlacesLivedEntity.CREATOR);
                    hashSet.add(23);
                    break;
                case 24:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(24);
                    break;
                case 25:
                    i6 = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(25);
                    break;
                case 26:
                    str9 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(26);
                    break;
                case 27:
                    str10 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(27);
                    break;
                case 28:
                    arrayList3 = C4628a.m23504c(parcel, m23514a, PersonEntity.UrlsEntity.CREATOR);
                    hashSet.add(28);
                    break;
                case 29:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    hashSet.add(29);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PersonEntity(hashSet, i, str, ageRangeEntity, str2, str3, i2, coverEntity, str4, str5, i3, str6, imageEntity, z, str7, nameEntity, str8, i4, arrayList, arrayList2, i5, i6, str9, str10, arrayList3, z2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity[] newArray(int i) {
        return new PersonEntity[i];
    }
}
