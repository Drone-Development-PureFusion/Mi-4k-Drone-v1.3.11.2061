package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.anb;
/* loaded from: classes2.dex */
public class DisableTargetRequest extends AbstractSafeParcelable {
    public static final C8749c CREATOR = new C8749c();

    /* renamed from: a */
    final int f28021a;

    /* renamed from: b */
    private final anb f28022b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DisableTargetRequest(int i, IBinder iBinder) {
        this.f28021a = i;
        C4588d.m23627a(iBinder);
        this.f28022b = anb.AbstractBinderC6602a.m16700a(iBinder);
    }

    /* renamed from: a */
    public IBinder m10270a() {
        if (this.f28022b == null) {
            return null;
        }
        return this.f28022b.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8749c c8749c = CREATOR;
        C8749c.m10245a(this, parcel, i);
    }
}
