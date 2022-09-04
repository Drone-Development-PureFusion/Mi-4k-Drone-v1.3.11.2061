package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class FitnessDataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FitnessDataSourcesRequest> CREATOR = new C5178a();

    /* renamed from: a */
    private final int f18839a;

    /* renamed from: b */
    private final List<DataType> f18840b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FitnessDataSourcesRequest(int i, List<DataType> list) {
        this.f18839a = i;
        this.f18840b = list;
    }

    /* renamed from: a */
    public List<DataType> m21406a() {
        return Collections.unmodifiableList(this.f18840b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m21405b() {
        return this.f18839a;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("dataTypes", this.f18840b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5178a.m21400a(this, parcel, i);
    }
}
