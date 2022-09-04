package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4559ac;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new C4590f();

    /* renamed from: a */
    final int f17007a;

    /* renamed from: b */
    IBinder f17008b;

    /* renamed from: c */
    private ConnectionResult f17009c;

    /* renamed from: d */
    private boolean f17010d;

    /* renamed from: e */
    private boolean f17011e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f17007a = i;
        this.f17008b = iBinder;
        this.f17009c = connectionResult;
        this.f17010d = z;
        this.f17011e = z2;
    }

    /* renamed from: a */
    public AbstractC4559ac m23727a() {
        return AbstractC4559ac.AbstractBinderC4560a.m23702a(this.f17008b);
    }

    /* renamed from: b */
    public ConnectionResult m23726b() {
        return this.f17009c;
    }

    /* renamed from: c */
    public boolean m23725c() {
        return this.f17010d;
    }

    /* renamed from: d */
    public boolean m23724d() {
        return this.f17011e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f17009c.equals(resolveAccountResponse.f17009c) && m23727a().equals(resolveAccountResponse.m23727a());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4590f.m23610a(this, parcel, i);
    }
}
