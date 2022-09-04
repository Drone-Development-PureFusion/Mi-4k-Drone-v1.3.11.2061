package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class SessionStopResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<SessionStopResult> CREATOR = new C5262m();

    /* renamed from: a */
    private final int f19123a;

    /* renamed from: b */
    private final Status f19124b;

    /* renamed from: c */
    private final List<Session> f19125c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionStopResult(int i, Status status, List<Session> list) {
        this.f19123a = i;
        this.f19124b = status;
        this.f19125c = Collections.unmodifiableList(list);
    }

    public SessionStopResult(Status status, List<Session> list) {
        this.f19123a = 3;
        this.f19124b = status;
        this.f19125c = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public static SessionStopResult m20912a(Status status) {
        return new SessionStopResult(status, Collections.emptyList());
    }

    /* renamed from: a */
    private boolean m20911a(SessionStopResult sessionStopResult) {
        return this.f19124b.equals(sessionStopResult.f19124b) && C4585c.m23634a(this.f19125c, sessionStopResult.f19125c);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19124b;
    }

    /* renamed from: b */
    public List<Session> m20910b() {
        return this.f19125c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m20909c() {
        return this.f19123a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionStopResult) && m20911a((SessionStopResult) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19124b, this.f19125c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", this.f19124b).m23632a("sessions", this.f19125c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5262m.m20867a(this, parcel, i);
    }
}
