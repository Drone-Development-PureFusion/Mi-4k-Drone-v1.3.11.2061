package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.AbstractC8341w;
import com.google.android.gms.location.AbstractC8344x;
import com.google.android.gms.location.internal.AbstractC8198g;
/* loaded from: classes2.dex */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final C8220n CREATOR = new C8220n();

    /* renamed from: a */
    int f26747a;

    /* renamed from: b */
    LocationRequestInternal f26748b;

    /* renamed from: c */
    AbstractC8344x f26749c;

    /* renamed from: d */
    PendingIntent f26750d;

    /* renamed from: e */
    AbstractC8341w f26751e;

    /* renamed from: f */
    AbstractC8198g f26752f;

    /* renamed from: g */
    private final int f26753g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationRequestUpdateData(int i, int i2, LocationRequestInternal locationRequestInternal, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        AbstractC8198g abstractC8198g = null;
        this.f26753g = i;
        this.f26747a = i2;
        this.f26748b = locationRequestInternal;
        this.f26749c = iBinder == null ? null : AbstractC8344x.AbstractBinderC8345a.m12023a(iBinder);
        this.f26750d = pendingIntent;
        this.f26751e = iBinder2 == null ? null : AbstractC8341w.AbstractBinderC8342a.m12026a(iBinder2);
        this.f26752f = iBinder3 != null ? AbstractC8198g.AbstractBinderC8199a.m12474a(iBinder3) : abstractC8198g;
    }

    /* renamed from: a */
    public static LocationRequestUpdateData m12544a(PendingIntent pendingIntent, @Nullable AbstractC8198g abstractC8198g) {
        return new LocationRequestUpdateData(1, 2, null, null, pendingIntent, null, abstractC8198g != null ? abstractC8198g.asBinder() : null);
    }

    /* renamed from: a */
    public static LocationRequestUpdateData m12543a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent, @Nullable AbstractC8198g abstractC8198g) {
        return new LocationRequestUpdateData(1, 1, locationRequestInternal, null, pendingIntent, null, abstractC8198g != null ? abstractC8198g.asBinder() : null);
    }

    /* renamed from: a */
    public static LocationRequestUpdateData m12542a(LocationRequestInternal locationRequestInternal, AbstractC8341w abstractC8341w, @Nullable AbstractC8198g abstractC8198g) {
        return new LocationRequestUpdateData(1, 1, locationRequestInternal, null, null, abstractC8341w.asBinder(), abstractC8198g != null ? abstractC8198g.asBinder() : null);
    }

    /* renamed from: a */
    public static LocationRequestUpdateData m12541a(LocationRequestInternal locationRequestInternal, AbstractC8344x abstractC8344x, @Nullable AbstractC8198g abstractC8198g) {
        return new LocationRequestUpdateData(1, 1, locationRequestInternal, abstractC8344x.asBinder(), null, null, abstractC8198g != null ? abstractC8198g.asBinder() : null);
    }

    /* renamed from: a */
    public static LocationRequestUpdateData m12540a(AbstractC8341w abstractC8341w, @Nullable AbstractC8198g abstractC8198g) {
        return new LocationRequestUpdateData(1, 2, null, null, null, abstractC8341w.asBinder(), abstractC8198g != null ? abstractC8198g.asBinder() : null);
    }

    /* renamed from: a */
    public static LocationRequestUpdateData m12539a(AbstractC8344x abstractC8344x, @Nullable AbstractC8198g abstractC8198g) {
        return new LocationRequestUpdateData(1, 2, null, abstractC8344x.asBinder(), null, null, abstractC8198g != null ? abstractC8198g.asBinder() : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m12545a() {
        return this.f26753g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public IBinder m12538b() {
        if (this.f26749c == null) {
            return null;
        }
        return this.f26749c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public IBinder m12537c() {
        if (this.f26751e == null) {
            return null;
        }
        return this.f26751e.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public IBinder m12536d() {
        if (this.f26752f == null) {
            return null;
        }
        return this.f26752f.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8220n.m12390a(this, parcel, i);
    }
}
