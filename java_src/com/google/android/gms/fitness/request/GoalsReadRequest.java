package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.alb;
import java.util.List;
/* loaded from: classes2.dex */
public class GoalsReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoalsReadRequest> CREATOR = new C5208af();

    /* renamed from: a */
    private final int f18953a;

    /* renamed from: b */
    private final alb f18954b;

    /* renamed from: c */
    private final List<DataType> f18955c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoalsReadRequest(int i, IBinder iBinder, List<DataType> list) {
        this.f18953a = i;
        this.f18954b = iBinder == null ? null : alb.AbstractBinderC6483a.m16987a(iBinder);
        this.f18955c = list;
    }

    /* renamed from: a */
    private boolean m21237a(GoalsReadRequest goalsReadRequest) {
        return C4585c.m23634a(this.f18955c, goalsReadRequest.f18955c);
    }

    /* renamed from: a */
    public List<DataType> m21238a() {
        return this.f18955c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m21236b() {
        return this.f18953a;
    }

    /* renamed from: c */
    public IBinder m21235c() {
        return this.f18954b.asBinder();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GoalsReadRequest) && m21237a((GoalsReadRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18955c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("dataTypes", this.f18955c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5208af.m21089a(this, parcel, i);
    }
}
