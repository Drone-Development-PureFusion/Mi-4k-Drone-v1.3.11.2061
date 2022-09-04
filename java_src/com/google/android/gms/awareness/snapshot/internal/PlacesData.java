package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.AbstractC8243g;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class PlacesData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PlacesData> CREATOR = new C4117g();

    /* renamed from: a */
    private final int f15658a;

    /* renamed from: b */
    private final ArrayList<PlaceLikelihoodEntity> f15659b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlacesData(int i, ArrayList<PlaceLikelihoodEntity> arrayList) {
        this.f15658a = i;
        this.f15659b = arrayList;
    }

    /* renamed from: a */
    public List<AbstractC8243g> m25451a() {
        return this.f15659b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ArrayList<PlaceLikelihoodEntity> m25450b() {
        return this.f15659b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m25449c() {
        return this.f15658a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4117g.m25405a(this, parcel, i);
    }
}
