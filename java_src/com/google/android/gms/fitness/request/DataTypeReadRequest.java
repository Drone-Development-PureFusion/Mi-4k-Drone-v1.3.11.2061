package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.akz;
/* loaded from: classes2.dex */
public class DataTypeReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataTypeReadRequest> CREATOR = new C5247x();

    /* renamed from: a */
    private final int f18923a;

    /* renamed from: b */
    private final String f18924b;

    /* renamed from: c */
    private final akz f18925c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataTypeReadRequest(int i, String str, IBinder iBinder) {
        this.f18923a = i;
        this.f18924b = str;
        this.f18925c = akz.AbstractBinderC6478a.m16990a(iBinder);
    }

    public DataTypeReadRequest(String str, akz akzVar) {
        this.f18923a = 3;
        this.f18924b = str;
        this.f18925c = akzVar;
    }

    /* renamed from: a */
    private boolean m21281a(DataTypeReadRequest dataTypeReadRequest) {
        return C4585c.m23634a(this.f18924b, dataTypeReadRequest.f18924b);
    }

    /* renamed from: a */
    public String m21282a() {
        return this.f18924b;
    }

    /* renamed from: b */
    public IBinder m21280b() {
        return this.f18925c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m21279c() {
        return this.f18923a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataTypeReadRequest) && m21281a((DataTypeReadRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18924b);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("name", this.f18924b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5247x.m20974a(this, parcel, i);
    }
}
