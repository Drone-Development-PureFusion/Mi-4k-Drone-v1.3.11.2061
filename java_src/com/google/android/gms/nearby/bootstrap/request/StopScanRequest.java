package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.anb;
/* loaded from: classes2.dex */
public class StopScanRequest extends AbstractSafeParcelable {
    public static final C8754h CREATOR = new C8754h();

    /* renamed from: a */
    final int f28042a;

    /* renamed from: b */
    private final anb f28043b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StopScanRequest(int i, IBinder iBinder) {
        this.f28042a = i;
        C4588d.m23627a(iBinder);
        this.f28043b = anb.AbstractBinderC6602a.m16700a(iBinder);
    }

    /* renamed from: a */
    public IBinder m10254a() {
        if (this.f28043b == null) {
            return null;
        }
        return this.f28043b.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8754h c8754h = CREATOR;
        C8754h.m10230a(this, parcel, i);
    }
}
