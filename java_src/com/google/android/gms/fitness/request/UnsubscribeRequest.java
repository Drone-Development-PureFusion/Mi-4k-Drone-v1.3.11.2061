package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnsubscribeRequest> CREATOR = new C5238o();

    /* renamed from: a */
    private final int f19049a;

    /* renamed from: b */
    private final DataType f19050b;

    /* renamed from: c */
    private final DataSource f19051c;

    /* renamed from: d */
    private final alq f19052d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnsubscribeRequest(int i, DataType dataType, DataSource dataSource, IBinder iBinder) {
        this.f19049a = i;
        this.f19050b = dataType;
        this.f19051c = dataSource;
        this.f19052d = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public UnsubscribeRequest(DataType dataType, DataSource dataSource, alq alqVar) {
        this.f19049a = 3;
        this.f19050b = dataType;
        this.f19051c = dataSource;
        this.f19052d = alqVar;
    }

    /* renamed from: a */
    private boolean m21112a(UnsubscribeRequest unsubscribeRequest) {
        return C4585c.m23634a(this.f19051c, unsubscribeRequest.f19051c) && C4585c.m23634a(this.f19050b, unsubscribeRequest.f19050b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m21113a() {
        return this.f19049a;
    }

    /* renamed from: b */
    public DataType m21111b() {
        return this.f19050b;
    }

    /* renamed from: c */
    public DataSource m21110c() {
        return this.f19051c;
    }

    /* renamed from: d */
    public IBinder m21109d() {
        if (this.f19052d == null) {
            return null;
        }
        return this.f19052d.asBinder();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof UnsubscribeRequest) && m21112a((UnsubscribeRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19051c, this.f19050b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5238o.m21001a(this, parcel, i);
    }
}
