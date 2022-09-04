package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class DataInsertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataInsertRequest> CREATOR = new C5242s();

    /* renamed from: a */
    private final int f18867a;

    /* renamed from: b */
    private final DataSet f18868b;

    /* renamed from: c */
    private final alq f18869c;

    /* renamed from: d */
    private final boolean f18870d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataInsertRequest(int i, DataSet dataSet, IBinder iBinder, boolean z) {
        this.f18867a = i;
        this.f18868b = dataSet;
        this.f18869c = alq.AbstractBinderC6512a.m16932a(iBinder);
        this.f18870d = z;
    }

    public DataInsertRequest(DataSet dataSet, alq alqVar, boolean z) {
        this.f18867a = 4;
        this.f18868b = dataSet;
        this.f18869c = alqVar;
        this.f18870d = z;
    }

    /* renamed from: a */
    private boolean m21356a(DataInsertRequest dataInsertRequest) {
        return C4585c.m23634a(this.f18868b, dataInsertRequest.f18868b);
    }

    /* renamed from: a */
    public DataSet m21357a() {
        return this.f18868b;
    }

    /* renamed from: b */
    public IBinder m21355b() {
        if (this.f18869c == null) {
            return null;
        }
        return this.f18869c.asBinder();
    }

    /* renamed from: c */
    public boolean m21354c() {
        return this.f18870d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m21353d() {
        return this.f18867a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataInsertRequest) && m21356a((DataInsertRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18868b);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("dataSet", this.f18868b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5242s.m20989a(this, parcel, i);
    }
}
