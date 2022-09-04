package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.anb;
import com.google.android.gms.nearby.bootstrap.Device;
/* loaded from: classes2.dex */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final C8752f CREATOR = new C8752f();

    /* renamed from: a */
    final int f28034a;

    /* renamed from: b */
    private final Device f28035b;

    /* renamed from: c */
    private final byte[] f28036c;

    /* renamed from: d */
    private final anb f28037d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SendDataRequest(int i, Device device, byte[] bArr, IBinder iBinder) {
        this.f28034a = i;
        this.f28035b = (Device) C4588d.m23627a(device);
        this.f28036c = (byte[]) C4588d.m23627a(bArr);
        C4588d.m23627a(iBinder);
        this.f28037d = anb.AbstractBinderC6602a.m16700a(iBinder);
    }

    /* renamed from: a */
    public Device m10260a() {
        return this.f28035b;
    }

    /* renamed from: b */
    public byte[] m10259b() {
        return this.f28036c;
    }

    /* renamed from: c */
    public IBinder m10258c() {
        if (this.f28037d == null) {
            return null;
        }
        return this.f28037d.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8752f c8752f = CREATOR;
        C8752f.m10236a(this, parcel, i);
    }
}
