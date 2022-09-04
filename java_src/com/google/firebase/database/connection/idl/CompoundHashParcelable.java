package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.C7092hk;
import com.google.android.gms.internal.C7100ho;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class CompoundHashParcelable extends AbstractSafeParcelable {
    public static final C9841a CREATOR = new C9841a();

    /* renamed from: a */
    final int f30678a;

    /* renamed from: b */
    final List<String> f30679b;

    /* renamed from: c */
    final List<String> f30680c;

    public CompoundHashParcelable(int i, List<String> list, List<String> list2) {
        this.f30678a = i;
        this.f30679b = list;
        this.f30680c = list2;
    }

    /* renamed from: a */
    public static C7092hk m6849a(CompoundHashParcelable compoundHashParcelable) {
        ArrayList arrayList = new ArrayList(compoundHashParcelable.f30679b.size());
        for (String str : compoundHashParcelable.f30679b) {
            arrayList.add(C7100ho.m15577a(str));
        }
        return new C7092hk(arrayList, compoundHashParcelable.f30680c);
    }

    /* renamed from: a */
    public static CompoundHashParcelable m6850a(C7092hk c7092hk) {
        List<List<String>> m15597a = c7092hk.m15597a();
        ArrayList arrayList = new ArrayList(m15597a.size());
        for (List<String> list : m15597a) {
            arrayList.add(C7100ho.m15576a(list));
        }
        return new CompoundHashParcelable(1, arrayList, c7092hk.m15596b());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9841a.m6818a(this, parcel, i);
    }
}
