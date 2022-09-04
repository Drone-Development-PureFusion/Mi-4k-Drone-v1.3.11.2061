package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class DataUpdateListenerUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataUpdateListenerUnregistrationRequest> CREATOR = new C5249z();

    /* renamed from: a */
    private final int f18934a;

    /* renamed from: b */
    private final PendingIntent f18935b;

    /* renamed from: c */
    private final alq f18936c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataUpdateListenerUnregistrationRequest(int i, PendingIntent pendingIntent, IBinder iBinder) {
        this.f18934a = i;
        this.f18935b = pendingIntent;
        this.f18936c = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public DataUpdateListenerUnregistrationRequest(PendingIntent pendingIntent, IBinder iBinder) {
        this.f18934a = 1;
        this.f18935b = pendingIntent;
        this.f18936c = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    /* renamed from: a */
    private boolean m21264a(DataUpdateListenerUnregistrationRequest dataUpdateListenerUnregistrationRequest) {
        return C4585c.m23634a(this.f18935b, dataUpdateListenerUnregistrationRequest.f18935b);
    }

    /* renamed from: a */
    public PendingIntent m21265a() {
        return this.f18935b;
    }

    /* renamed from: b */
    public IBinder m21263b() {
        if (this.f18936c == null) {
            return null;
        }
        return this.f18936c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m21262c() {
        return this.f18934a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataUpdateListenerUnregistrationRequest) && m21264a((DataUpdateListenerUnregistrationRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18935b);
    }

    public String toString() {
        return "DataUpdateListenerUnregistrationRequest";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5249z.m20968a(this, parcel, i);
    }
}
