package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.alq;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class SessionStartRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionStartRequest> CREATOR = new C5231h();

    /* renamed from: a */
    private final int f19021a;

    /* renamed from: b */
    private final Session f19022b;

    /* renamed from: c */
    private final alq f19023c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionStartRequest(int i, Session session, IBinder iBinder) {
        this.f19021a = i;
        this.f19022b = session;
        this.f19023c = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public SessionStartRequest(Session session, alq alqVar) {
        C4588d.m23618b(session.m21570a(TimeUnit.MILLISECONDS) < System.currentTimeMillis(), "Cannot start a session in the future");
        C4588d.m23618b(session.m21569b(), "Cannot start a session which has already ended");
        this.f19021a = 3;
        this.f19022b = session;
        this.f19023c = alqVar;
    }

    /* renamed from: a */
    private boolean m21148a(SessionStartRequest sessionStartRequest) {
        return C4585c.m23634a(this.f19022b, sessionStartRequest.f19022b);
    }

    /* renamed from: a */
    public Session m21149a() {
        return this.f19022b;
    }

    /* renamed from: b */
    public IBinder m21147b() {
        if (this.f19023c == null) {
            return null;
        }
        return this.f19023c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m21146c() {
        return this.f19021a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SessionStartRequest) && m21148a((SessionStartRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19022b);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("session", this.f19022b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5231h.m21022a(this, parcel, i);
    }
}
