package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.AbstractC8853k;
@Deprecated
/* loaded from: classes.dex */
public class GetPermissionStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPermissionStatusRequest> CREATOR = new C8847g();

    /* renamed from: a */
    final int f28266a;

    /* renamed from: b */
    public final AbstractC8853k f28267b;
    @Deprecated

    /* renamed from: c */
    public final String f28268c;
    @Deprecated

    /* renamed from: d */
    public final ClientAppContext f28269d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetPermissionStatusRequest(int i, IBinder iBinder, String str, ClientAppContext clientAppContext) {
        this.f28266a = i;
        this.f28267b = AbstractC8853k.AbstractBinderC8854a.m9863a(iBinder);
        this.f28268c = str;
        this.f28269d = ClientAppContext.m9919a(clientAppContext, null, str, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetPermissionStatusRequest(IBinder iBinder) {
        this(1, iBinder, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m9913a() {
        return this.f28267b.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8847g.m9873a(this, parcel, i);
    }
}
