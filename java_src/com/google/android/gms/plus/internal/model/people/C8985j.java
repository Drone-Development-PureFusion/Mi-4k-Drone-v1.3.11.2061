package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.plus.internal.model.people.j */
/* loaded from: classes2.dex */
public class C8985j implements Parcelable.Creator<PersonEntity.UrlsEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9492a(PersonEntity.UrlsEntity urlsEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        Set<Integer> set = urlsEntity.f28601a;
        if (set.contains(1)) {
            C4630b.m23475a(parcel, 1, urlsEntity.f28602b);
        }
        if (set.contains(3)) {
            C4630b.m23475a(parcel, 3, urlsEntity.m9528i());
        }
        if (set.contains(4)) {
            C4630b.m23464a(parcel, 4, urlsEntity.f28605e, true);
        }
        if (set.contains(5)) {
            C4630b.m23464a(parcel, 5, urlsEntity.f28603c, true);
        }
        if (set.contains(6)) {
            C4630b.m23475a(parcel, 6, urlsEntity.f28604d);
        }
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.UrlsEntity createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(1);
                    break;
                case 2:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(3);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(4);
                    break;
                case 5:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    hashSet.add(5);
                    break;
                case 6:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    hashSet.add(6);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PersonEntity.UrlsEntity(hashSet, i3, str2, i2, str, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PersonEntity.UrlsEntity[] newArray(int i) {
        return new PersonEntity.UrlsEntity[i];
    }
}
