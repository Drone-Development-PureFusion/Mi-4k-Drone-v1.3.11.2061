package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
/* loaded from: classes2.dex */
public class DataTypeResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<DataTypeResult> CREATOR = new C5256g();

    /* renamed from: a */
    private final int f19104a;

    /* renamed from: b */
    private final Status f19105b;

    /* renamed from: c */
    private final DataType f19106c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataTypeResult(int i, Status status, DataType dataType) {
        this.f19104a = i;
        this.f19105b = status;
        this.f19106c = dataType;
    }

    public DataTypeResult(Status status, DataType dataType) {
        this.f19104a = 2;
        this.f19105b = status;
        this.f19106c = dataType;
    }

    /* renamed from: a */
    public static DataTypeResult m20936a(Status status) {
        return new DataTypeResult(status, null);
    }

    /* renamed from: a */
    private boolean m20935a(DataTypeResult dataTypeResult) {
        return this.f19105b.equals(dataTypeResult.f19105b) && C4585c.m23634a(this.f19106c, dataTypeResult.f19106c);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19105b;
    }

    /* renamed from: b */
    public DataType m20934b() {
        return this.f19106c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m20933c() {
        return this.f19104a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataTypeResult) && m20935a((DataTypeResult) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19105b, this.f19106c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", this.f19105b).m23632a("dataType", this.f19106c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5256g.m20885a(this, parcel, i);
    }
}
