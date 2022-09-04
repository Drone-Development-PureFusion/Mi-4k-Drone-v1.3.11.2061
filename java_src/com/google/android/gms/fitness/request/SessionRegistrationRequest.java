package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class SessionRegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionRegistrationRequest> CREATOR = new C5230g();

    /* renamed from: a */
    private final int f19017a;

    /* renamed from: b */
    private final PendingIntent f19018b;

    /* renamed from: c */
    private final alq f19019c;

    /* renamed from: d */
    private final int f19020d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionRegistrationRequest(int i, PendingIntent pendingIntent, IBinder iBinder, int i2) {
        this.f19017a = i;
        this.f19018b = pendingIntent;
        this.f19019c = iBinder == null ? null : alq.AbstractBinderC6512a.m16932a(iBinder);
        this.f19020d = i2;
    }

    public SessionRegistrationRequest(PendingIntent pendingIntent, alq alqVar, int i) {
        this.f19017a = 6;
        this.f19018b = pendingIntent;
        this.f19019c = alqVar;
        this.f19020d = i;
    }

    /* renamed from: a */
    private boolean m21153a(SessionRegistrationRequest sessionRegistrationRequest) {
        return this.f19020d == sessionRegistrationRequest.f19020d && C4585c.m23634a(this.f19018b, sessionRegistrationRequest.f19018b);
    }

    /* renamed from: a */
    public PendingIntent m21154a() {
        return this.f19018b;
    }

    /* renamed from: b */
    public IBinder m21152b() {
        if (this.f19019c == null) {
            return null;
        }
        return this.f19019c.asBinder();
    }

    /* renamed from: c */
    public int m21151c() {
        return this.f19020d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m21150d() {
        return this.f19017a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionRegistrationRequest) && m21153a((SessionRegistrationRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19018b, Integer.valueOf(this.f19020d));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("pendingIntent", this.f19018b).m23632a("sessionRegistrationOption", Integer.valueOf(this.f19020d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5230g.m21025a(this, parcel, i);
    }
}
