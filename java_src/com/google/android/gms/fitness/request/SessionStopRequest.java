package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alp;
/* loaded from: classes2.dex */
public class SessionStopRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionStopRequest> CREATOR = new C5232i();

    /* renamed from: a */
    private final int f19024a;

    /* renamed from: b */
    private final String f19025b;

    /* renamed from: c */
    private final String f19026c;

    /* renamed from: d */
    private final alp f19027d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionStopRequest(int i, String str, String str2, IBinder iBinder) {
        this.f19024a = i;
        this.f19025b = str;
        this.f19026c = str2;
        this.f19027d = alp.AbstractBinderC6510a.m16933a(iBinder);
    }

    public SessionStopRequest(String str, String str2, alp alpVar) {
        this.f19024a = 3;
        this.f19025b = str;
        this.f19026c = str2;
        this.f19027d = alpVar;
    }

    /* renamed from: a */
    private boolean m21144a(SessionStopRequest sessionStopRequest) {
        return C4585c.m23634a(this.f19025b, sessionStopRequest.f19025b) && C4585c.m23634a(this.f19026c, sessionStopRequest.f19026c);
    }

    /* renamed from: a */
    public String m21145a() {
        return this.f19025b;
    }

    /* renamed from: b */
    public String m21143b() {
        return this.f19026c;
    }

    /* renamed from: c */
    public IBinder m21142c() {
        if (this.f19027d == null) {
            return null;
        }
        return this.f19027d.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m21141d() {
        return this.f19024a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SessionStopRequest) && m21144a((SessionStopRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19025b, this.f19026c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("name", this.f19025b).m23632a("identifier", this.f19026c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5232i.m21019a(this, parcel, i);
    }
}
