package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class DataUpdateListenerRegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataUpdateListenerRegistrationRequest> CREATOR = new C5248y();

    /* renamed from: a */
    private final int f18926a;

    /* renamed from: b */
    private DataSource f18927b;

    /* renamed from: c */
    private DataType f18928c;

    /* renamed from: d */
    private final PendingIntent f18929d;

    /* renamed from: e */
    private final alq f18930e;

    /* renamed from: com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest$a */
    /* loaded from: classes2.dex */
    public static class C5193a {

        /* renamed from: a */
        private DataSource f18931a;

        /* renamed from: b */
        private DataType f18932b;

        /* renamed from: c */
        private PendingIntent f18933c;

        /* renamed from: a */
        public C5193a m21271a(PendingIntent pendingIntent) {
            C4588d.m23627a(pendingIntent);
            this.f18933c = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public C5193a m21270a(DataSource dataSource) {
            C4588d.m23627a(dataSource);
            this.f18931a = dataSource;
            return this;
        }

        /* renamed from: a */
        public C5193a m21269a(DataType dataType) {
            C4588d.m23627a(dataType);
            this.f18932b = dataType;
            return this;
        }

        /* renamed from: a */
        public DataUpdateListenerRegistrationRequest m21272a() {
            C4588d.m23622a((this.f18931a == null && this.f18932b == null) ? false : true, "Set either dataSource or dataTYpe");
            C4588d.m23626a(this.f18933c, "pendingIntent must be set");
            return new DataUpdateListenerRegistrationRequest(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataUpdateListenerRegistrationRequest(int i, DataSource dataSource, DataType dataType, PendingIntent pendingIntent, IBinder iBinder) {
        this.f18926a = i;
        this.f18927b = dataSource;
        this.f18928c = dataType;
        this.f18929d = pendingIntent;
        this.f18930e = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public DataUpdateListenerRegistrationRequest(DataSource dataSource, DataType dataType, PendingIntent pendingIntent, IBinder iBinder) {
        this.f18926a = 1;
        this.f18927b = dataSource;
        this.f18928c = dataType;
        this.f18929d = pendingIntent;
        this.f18930e = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    private DataUpdateListenerRegistrationRequest(C5193a c5193a) {
        this(c5193a.f18931a, c5193a.f18932b, c5193a.f18933c, null);
    }

    public DataUpdateListenerRegistrationRequest(DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest, IBinder iBinder) {
        this(dataUpdateListenerRegistrationRequest.f18927b, dataUpdateListenerRegistrationRequest.f18928c, dataUpdateListenerRegistrationRequest.f18929d, iBinder);
    }

    /* renamed from: a */
    private boolean m21277a(DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        return C4585c.m23634a(this.f18927b, dataUpdateListenerRegistrationRequest.f18927b) && C4585c.m23634a(this.f18928c, dataUpdateListenerRegistrationRequest.f18928c) && C4585c.m23634a(this.f18929d, dataUpdateListenerRegistrationRequest.f18929d);
    }

    /* renamed from: a */
    public DataSource m21278a() {
        return this.f18927b;
    }

    /* renamed from: b */
    public DataType m21276b() {
        return this.f18928c;
    }

    /* renamed from: c */
    public PendingIntent m21275c() {
        return this.f18929d;
    }

    /* renamed from: d */
    public IBinder m21274d() {
        if (this.f18930e == null) {
            return null;
        }
        return this.f18930e.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m21273e() {
        return this.f18926a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataUpdateListenerRegistrationRequest) && m21277a((DataUpdateListenerRegistrationRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18927b, this.f18928c, this.f18929d);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("dataSource", this.f18927b).m23632a("dataType", this.f18928c).m23632a("pendingIntent", this.f18929d).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5248y.m20971a(this, parcel, i);
    }
}
