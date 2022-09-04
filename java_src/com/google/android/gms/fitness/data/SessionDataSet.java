package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class SessionDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionDataSet> CREATOR = new C5146d();

    /* renamed from: a */
    final int f18656a;

    /* renamed from: b */
    private final Session f18657b;

    /* renamed from: c */
    private final DataSet f18658c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionDataSet(int i, Session session, DataSet dataSet) {
        this.f18656a = i;
        this.f18657b = session;
        this.f18658c = dataSet;
    }

    /* renamed from: a */
    private boolean m21537a(SessionDataSet sessionDataSet) {
        return C4585c.m23634a(this.f18657b, sessionDataSet.f18657b) && C4585c.m23634a(this.f18658c, sessionDataSet.f18658c);
    }

    /* renamed from: a */
    public Session m21538a() {
        return this.f18657b;
    }

    /* renamed from: b */
    public DataSet m21536b() {
        return this.f18658c;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SessionDataSet) && m21537a((SessionDataSet) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18657b, this.f18658c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("session", this.f18657b).m23632a("dataSet", this.f18658c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5146d.m21478a(this, parcel, i);
    }
}
