package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
/* loaded from: classes2.dex */
public class FitnessUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FitnessUnregistrationRequest> CREATOR = new C5179b();

    /* renamed from: a */
    private final int f18841a;

    /* renamed from: b */
    private final DataSource f18842b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FitnessUnregistrationRequest(int i, DataSource dataSource) {
        this.f18841a = i;
        this.f18842b = dataSource;
    }

    /* renamed from: a */
    public DataSource m21404a() {
        return this.f18842b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m21403b() {
        return this.f18841a;
    }

    public String toString() {
        return String.format("ApplicationUnregistrationRequest{%s}", this.f18842b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5179b.m21397a(this, parcel, i);
    }
}
