package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.AbstractC5167y;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class SensorUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SensorUnregistrationRequest> CREATOR = new C5220an();

    /* renamed from: a */
    private final int f18984a;

    /* renamed from: b */
    private final AbstractC5167y f18985b;

    /* renamed from: c */
    private final PendingIntent f18986c;

    /* renamed from: d */
    private final alq f18987d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SensorUnregistrationRequest(int i, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2) {
        this.f18984a = i;
        this.f18985b = iBinder == null ? null : AbstractC5167y.AbstractBinderC5168a.m21419a(iBinder);
        this.f18986c = pendingIntent;
        this.f18987d = alq.AbstractBinderC6512a.m16932a(iBinder2);
    }

    public SensorUnregistrationRequest(AbstractC5167y abstractC5167y, PendingIntent pendingIntent, alq alqVar) {
        this.f18984a = 4;
        this.f18985b = abstractC5167y;
        this.f18986c = pendingIntent;
        this.f18987d = alqVar;
    }

    /* renamed from: a */
    public PendingIntent m21208a() {
        return this.f18986c;
    }

    /* renamed from: b */
    public IBinder m21207b() {
        if (this.f18987d == null) {
            return null;
        }
        return this.f18987d.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m21206c() {
        return this.f18984a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public IBinder m21205d() {
        if (this.f18985b == null) {
            return null;
        }
        return this.f18985b.asBinder();
    }

    public String toString() {
        return String.format("SensorUnregistrationRequest{%s}", this.f18985b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5220an.m21065a(this, parcel, i);
    }
}
