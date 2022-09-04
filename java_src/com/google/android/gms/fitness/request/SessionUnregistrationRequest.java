package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class SessionUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionUnregistrationRequest> CREATOR = new C5233j();

    /* renamed from: a */
    private final int f19028a;

    /* renamed from: b */
    private final PendingIntent f19029b;

    /* renamed from: c */
    private final alq f19030c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionUnregistrationRequest(int i, PendingIntent pendingIntent, IBinder iBinder) {
        this.f19028a = i;
        this.f19029b = pendingIntent;
        this.f19030c = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public SessionUnregistrationRequest(PendingIntent pendingIntent, alq alqVar) {
        this.f19028a = 5;
        this.f19029b = pendingIntent;
        this.f19030c = alqVar;
    }

    /* renamed from: a */
    private boolean m21139a(SessionUnregistrationRequest sessionUnregistrationRequest) {
        return C4585c.m23634a(this.f19029b, sessionUnregistrationRequest.f19029b);
    }

    /* renamed from: a */
    public PendingIntent m21140a() {
        return this.f19029b;
    }

    /* renamed from: b */
    public IBinder m21138b() {
        if (this.f19030c == null) {
            return null;
        }
        return this.f19030c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m21137c() {
        return this.f19028a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionUnregistrationRequest) && m21139a((SessionUnregistrationRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19029b);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("pendingIntent", this.f19029b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5233j.m21016a(this, parcel, i);
    }
}
