package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.anb;
import com.google.android.gms.nearby.bootstrap.Device;
/* loaded from: classes2.dex */
public class DisconnectRequest extends AbstractSafeParcelable {
    public static final C8750d CREATOR = new C8750d();

    /* renamed from: a */
    final int f28023a;

    /* renamed from: b */
    private final Device f28024b;

    /* renamed from: c */
    private final anb f28025c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DisconnectRequest(int i, Device device, IBinder iBinder) {
        this.f28023a = i;
        this.f28024b = (Device) C4588d.m23627a(device);
        C4588d.m23627a(iBinder);
        this.f28025c = anb.AbstractBinderC6602a.m16700a(iBinder);
    }

    /* renamed from: a */
    public Device m10269a() {
        return this.f28024b;
    }

    /* renamed from: b */
    public IBinder m10268b() {
        return this.f28025c.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8750d c8750d = CREATOR;
        C8750d.m10242a(this, parcel, i);
    }
}
