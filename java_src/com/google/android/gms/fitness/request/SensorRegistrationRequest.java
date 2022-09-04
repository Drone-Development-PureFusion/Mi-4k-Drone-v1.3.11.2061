package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.AbstractC5167y;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.alq;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.ClientIdentity;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class SensorRegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SensorRegistrationRequest> CREATOR = new C5219am();

    /* renamed from: a */
    int f18969a;

    /* renamed from: b */
    int f18970b;

    /* renamed from: c */
    private final int f18971c;

    /* renamed from: d */
    private DataSource f18972d;

    /* renamed from: e */
    private DataType f18973e;

    /* renamed from: f */
    private AbstractC5167y f18974f;

    /* renamed from: g */
    private final long f18975g;

    /* renamed from: h */
    private final long f18976h;

    /* renamed from: i */
    private final PendingIntent f18977i;

    /* renamed from: j */
    private final long f18978j;

    /* renamed from: k */
    private final int f18979k;

    /* renamed from: l */
    private final List<LocationRequest> f18980l;

    /* renamed from: m */
    private final long f18981m;

    /* renamed from: n */
    private final List<ClientIdentity> f18982n;

    /* renamed from: o */
    private final alq f18983o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SensorRegistrationRequest(int i, DataSource dataSource, DataType dataType, IBinder iBinder, int i2, int i3, long j, long j2, PendingIntent pendingIntent, long j3, int i4, List<LocationRequest> list, long j4, IBinder iBinder2) {
        this.f18971c = i;
        this.f18972d = dataSource;
        this.f18973e = dataType;
        this.f18974f = iBinder == null ? null : AbstractC5167y.AbstractBinderC5168a.m21419a(iBinder);
        this.f18975g = j == 0 ? i2 : j;
        this.f18978j = j3;
        this.f18976h = j2 == 0 ? i3 : j2;
        this.f18980l = list;
        this.f18977i = pendingIntent;
        this.f18979k = i4;
        this.f18982n = Collections.emptyList();
        this.f18981m = j4;
        this.f18983o = alq.AbstractBinderC6512a.m16932a(iBinder2);
    }

    public SensorRegistrationRequest(DataSource dataSource, DataType dataType, AbstractC5167y abstractC5167y, PendingIntent pendingIntent, long j, long j2, long j3, int i, List<LocationRequest> list, List<ClientIdentity> list2, long j4, alq alqVar) {
        this.f18971c = 6;
        this.f18972d = dataSource;
        this.f18973e = dataType;
        this.f18974f = abstractC5167y;
        this.f18977i = pendingIntent;
        this.f18975g = j;
        this.f18978j = j2;
        this.f18976h = j3;
        this.f18979k = i;
        this.f18980l = list;
        this.f18982n = list2;
        this.f18981m = j4;
        this.f18983o = alqVar;
    }

    public SensorRegistrationRequest(C5222c c5222c, AbstractC5167y abstractC5167y, PendingIntent pendingIntent, alq alqVar) {
        this(c5222c.m21063a(), c5222c.m21058b(), abstractC5167y, pendingIntent, c5222c.m21059a(TimeUnit.MICROSECONDS), c5222c.m21057b(TimeUnit.MICROSECONDS), c5222c.m21055c(TimeUnit.MICROSECONDS), c5222c.m21056c(), null, Collections.emptyList(), c5222c.m21054d(), alqVar);
    }

    /* renamed from: a */
    private boolean m21220a(SensorRegistrationRequest sensorRegistrationRequest) {
        return C4585c.m23634a(this.f18972d, sensorRegistrationRequest.f18972d) && C4585c.m23634a(this.f18973e, sensorRegistrationRequest.f18973e) && this.f18975g == sensorRegistrationRequest.f18975g && this.f18978j == sensorRegistrationRequest.f18978j && this.f18976h == sensorRegistrationRequest.f18976h && this.f18979k == sensorRegistrationRequest.f18979k && C4585c.m23634a(this.f18980l, sensorRegistrationRequest.f18980l);
    }

    /* renamed from: a */
    public DataSource m21221a() {
        return this.f18972d;
    }

    /* renamed from: b */
    public DataType m21219b() {
        return this.f18973e;
    }

    /* renamed from: c */
    public PendingIntent m21218c() {
        return this.f18977i;
    }

    /* renamed from: d */
    public long m21217d() {
        return this.f18978j;
    }

    /* renamed from: e */
    public long m21216e() {
        return this.f18975g;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SensorRegistrationRequest) && m21220a((SensorRegistrationRequest) obj));
    }

    /* renamed from: f */
    public long m21215f() {
        return this.f18976h;
    }

    /* renamed from: g */
    public List<LocationRequest> m21214g() {
        return this.f18980l;
    }

    /* renamed from: h */
    public int m21213h() {
        return this.f18979k;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18972d, this.f18973e, this.f18974f, Long.valueOf(this.f18975g), Long.valueOf(this.f18978j), Long.valueOf(this.f18976h), Integer.valueOf(this.f18979k), this.f18980l);
    }

    /* renamed from: i */
    public long m21212i() {
        return this.f18981m;
    }

    /* renamed from: j */
    public IBinder m21211j() {
        if (this.f18983o == null) {
            return null;
        }
        return this.f18983o.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m21210k() {
        return this.f18971c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public IBinder m21209l() {
        if (this.f18974f == null) {
            return null;
        }
        return this.f18974f.asBinder();
    }

    public String toString() {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", this.f18973e, this.f18972d, Long.valueOf(this.f18975g), Long.valueOf(this.f18978j), Long.valueOf(this.f18976h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5219am.m21068a(this, parcel, i);
    }
}
