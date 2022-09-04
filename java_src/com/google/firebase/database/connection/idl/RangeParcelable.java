package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.C7120ht;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class RangeParcelable extends AbstractSafeParcelable {
    public static final C9865k CREATOR = new C9865k();

    /* renamed from: a */
    final int f30705a;

    /* renamed from: b */
    final List<String> f30706b;

    /* renamed from: c */
    final List<String> f30707c;

    public RangeParcelable(int i, List<String> list, List<String> list2) {
        this.f30705a = i;
        this.f30706b = list;
        this.f30707c = list2;
    }

    /* renamed from: a */
    public static C7120ht m6821a(RangeParcelable rangeParcelable, Object obj) {
        return new C7120ht(rangeParcelable.f30706b, rangeParcelable.f30707c, obj);
    }

    /* renamed from: a */
    public static RangeParcelable m6822a(C7120ht c7120ht) {
        return new RangeParcelable(1, c7120ht.m15488a(), c7120ht.m15487b());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9865k.m6773a(this, parcel, i);
    }
}
