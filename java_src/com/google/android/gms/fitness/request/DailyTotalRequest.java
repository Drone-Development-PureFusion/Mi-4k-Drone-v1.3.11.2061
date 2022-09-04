package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.akw;
/* loaded from: classes2.dex */
public class DailyTotalRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DailyTotalRequest> CREATOR = new C5240q();

    /* renamed from: a */
    private final int f18847a;

    /* renamed from: b */
    private final akw f18848b;

    /* renamed from: c */
    private DataType f18849c;

    /* renamed from: d */
    private final boolean f18850d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DailyTotalRequest(int i, IBinder iBinder, DataType dataType, boolean z) {
        this.f18847a = i;
        this.f18848b = akw.AbstractBinderC6472a.m16993a(iBinder);
        this.f18849c = dataType;
        this.f18850d = z;
    }

    public DailyTotalRequest(akw akwVar, DataType dataType, boolean z) {
        this.f18847a = 3;
        this.f18848b = akwVar;
        this.f18849c = dataType;
        this.f18850d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m21390a() {
        return this.f18847a;
    }

    /* renamed from: b */
    public DataType m21389b() {
        return this.f18849c;
    }

    /* renamed from: c */
    public boolean m21388c() {
        return this.f18850d;
    }

    /* renamed from: d */
    public IBinder m21387d() {
        return this.f18848b.asBinder();
    }

    public String toString() {
        Object[] objArr = new Object[1];
        objArr[0] = this.f18849c == null ? "null" : this.f18849c.m21654c();
        return String.format("DailyTotalRequest{%s}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5240q.m20995a(this, parcel, i);
    }
}
