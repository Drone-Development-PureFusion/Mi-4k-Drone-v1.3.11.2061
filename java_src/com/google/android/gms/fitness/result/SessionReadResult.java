package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class SessionReadResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<SessionReadResult> CREATOR = new C5261l();

    /* renamed from: a */
    private final int f19119a;

    /* renamed from: b */
    private final List<Session> f19120b;

    /* renamed from: c */
    private final List<SessionDataSet> f19121c;

    /* renamed from: d */
    private final Status f19122d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionReadResult(int i, List<Session> list, List<SessionDataSet> list2, Status status) {
        this.f19119a = i;
        this.f19120b = list;
        this.f19121c = Collections.unmodifiableList(list2);
        this.f19122d = status;
    }

    public SessionReadResult(List<Session> list, List<SessionDataSet> list2, Status status) {
        this.f19119a = 3;
        this.f19120b = list;
        this.f19121c = Collections.unmodifiableList(list2);
        this.f19122d = status;
    }

    /* renamed from: a */
    public static SessionReadResult m20919a(Status status) {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status);
    }

    /* renamed from: a */
    private boolean m20916a(SessionReadResult sessionReadResult) {
        return this.f19122d.equals(sessionReadResult.f19122d) && C4585c.m23634a(this.f19120b, sessionReadResult.f19120b) && C4585c.m23634a(this.f19121c, sessionReadResult.f19121c);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19122d;
    }

    /* renamed from: a */
    public List<DataSet> m20918a(Session session) {
        C4588d.m23617b(this.f19120b.contains(session), "Attempting to read data for session %s which was not returned", session);
        ArrayList arrayList = new ArrayList();
        for (SessionDataSet sessionDataSet : this.f19121c) {
            if (C4585c.m23634a(session, sessionDataSet.m21538a())) {
                arrayList.add(sessionDataSet.m21536b());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<DataSet> m20917a(Session session, DataType dataType) {
        C4588d.m23617b(this.f19120b.contains(session), "Attempting to read data for session %s which was not returned", session);
        ArrayList arrayList = new ArrayList();
        for (SessionDataSet sessionDataSet : this.f19121c) {
            if (C4585c.m23634a(session, sessionDataSet.m21538a()) && dataType.equals(sessionDataSet.m21536b().m21699c())) {
                arrayList.add(sessionDataSet.m21536b());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<Session> m20915b() {
        return this.f19120b;
    }

    /* renamed from: c */
    public List<SessionDataSet> m20914c() {
        return this.f19121c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m20913d() {
        return this.f19119a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionReadResult) && m20916a((SessionReadResult) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19122d, this.f19120b, this.f19121c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", this.f19122d).m23632a("sessions", this.f19120b).m23632a("sessionDataSets", this.f19121c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5261l.m20870a(this, parcel, i);
    }
}
