package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alm;
import java.util.List;
/* loaded from: classes2.dex */
public class ReadRawRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ReadRawRequest> CREATOR = new C5217ak();

    /* renamed from: a */
    private final int f18961a;

    /* renamed from: b */
    private final alm f18962b;

    /* renamed from: c */
    private final List<DataSourceQueryParams> f18963c;

    /* renamed from: d */
    private final boolean f18964d;

    /* renamed from: e */
    private final boolean f18965e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReadRawRequest(int i, IBinder iBinder, List<DataSourceQueryParams> list, boolean z, boolean z2) {
        this.f18961a = i;
        this.f18962b = alm.AbstractBinderC6504a.m16938a(iBinder);
        this.f18963c = list;
        this.f18964d = z;
        this.f18965e = z2;
    }

    /* renamed from: a */
    public List<DataSourceQueryParams> m21229a() {
        return this.f18963c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m21228b() {
        return this.f18961a;
    }

    /* renamed from: c */
    public IBinder m21227c() {
        if (this.f18962b != null) {
            return this.f18962b.asBinder();
        }
        return null;
    }

    /* renamed from: d */
    public boolean m21226d() {
        return this.f18965e;
    }

    /* renamed from: e */
    public boolean m21225e() {
        return this.f18964d;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("params", this.f18963c).m23632a("server", Boolean.valueOf(this.f18965e)).m23632a("flush", Boolean.valueOf(this.f18964d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5217ak.m21074a(this, parcel, i);
    }
}
