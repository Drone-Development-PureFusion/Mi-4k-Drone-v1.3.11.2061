package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alr;
/* loaded from: classes2.dex */
public class GetSyncInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSyncInfoRequest> CREATOR = new C5207ae();

    /* renamed from: a */
    private final int f18951a;

    /* renamed from: b */
    private final alr f18952b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetSyncInfoRequest(int i, IBinder iBinder) {
        this.f18951a = i;
        this.f18952b = alr.AbstractBinderC6514a.m16931a(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m21240a() {
        return this.f18951a;
    }

    /* renamed from: b */
    public IBinder m21239b() {
        return this.f18952b.asBinder();
    }

    public String toString() {
        return String.format("GetSyncInfoRequest {%d, %s}", Integer.valueOf(this.f18951a), this.f18952b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5207ae.m21092a(this, parcel, i);
    }
}
