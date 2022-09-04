package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.request.AbstractC5209ag;
import com.google.android.gms.fitness.request.BinderC5225d;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class StopBleScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StopBleScanRequest> CREATOR = new C5235l();

    /* renamed from: a */
    private final int f19039a;

    /* renamed from: b */
    private final AbstractC5209ag f19040b;

    /* renamed from: c */
    private final alq f19041c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StopBleScanRequest(int i, IBinder iBinder, IBinder iBinder2) {
        this.f19039a = i;
        this.f19040b = AbstractC5209ag.AbstractBinderC5210a.m21088a(iBinder);
        this.f19041c = alq.AbstractBinderC6512a.m16932a(iBinder2);
    }

    public StopBleScanRequest(AbstractC5202a abstractC5202a, alq alqVar) {
        this(BinderC5225d.C5227a.m21036a().m21034b(abstractC5202a), alqVar);
    }

    public StopBleScanRequest(AbstractC5209ag abstractC5209ag, alq alqVar) {
        this.f19039a = 3;
        this.f19040b = abstractC5209ag;
        this.f19041c = alqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m21123a() {
        return this.f19039a;
    }

    /* renamed from: b */
    public IBinder m21122b() {
        return this.f19040b.asBinder();
    }

    /* renamed from: c */
    public IBinder m21121c() {
        if (this.f19041c == null) {
            return null;
        }
        return this.f19041c.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5235l.m21010a(this, parcel, i);
    }
}
