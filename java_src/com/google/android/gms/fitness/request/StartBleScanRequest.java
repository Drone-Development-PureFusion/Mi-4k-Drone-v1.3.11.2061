package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4679b;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.AbstractC5209ag;
import com.google.android.gms.fitness.request.BinderC5225d;
import com.google.android.gms.internal.alq;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class StartBleScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartBleScanRequest> CREATOR = new C5234k();

    /* renamed from: a */
    private final int f19031a;

    /* renamed from: b */
    private final List<DataType> f19032b;

    /* renamed from: c */
    private final AbstractC5209ag f19033c;

    /* renamed from: d */
    private final int f19034d;

    /* renamed from: e */
    private final alq f19035e;

    /* renamed from: com.google.android.gms.fitness.request.StartBleScanRequest$a */
    /* loaded from: classes2.dex */
    public static class C5201a {

        /* renamed from: b */
        private AbstractC5209ag f19037b;

        /* renamed from: a */
        private DataType[] f19036a = new DataType[0];

        /* renamed from: c */
        private int f19038c = 10;

        /* renamed from: a */
        public C5201a m21130a(int i) {
            boolean z = true;
            C4588d.m23618b(i > 0, "Stop time must be greater than zero");
            if (i > 60) {
                z = false;
            }
            C4588d.m23618b(z, "Stop time must be less than 1 minute");
            this.f19038c = i;
            return this;
        }

        /* renamed from: a */
        public C5201a m21128a(AbstractC5202a abstractC5202a) {
            m21127a(BinderC5225d.C5227a.m21036a().m21035a(abstractC5202a));
            return this;
        }

        /* renamed from: a */
        public C5201a m21127a(AbstractC5209ag abstractC5209ag) {
            this.f19037b = abstractC5209ag;
            return this;
        }

        /* renamed from: a */
        public C5201a m21126a(DataType... dataTypeArr) {
            this.f19036a = dataTypeArr;
            return this;
        }

        /* renamed from: a */
        public StartBleScanRequest m21131a() {
            C4588d.m23622a(this.f19037b != null, "Must set BleScanCallback");
            return new StartBleScanRequest(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StartBleScanRequest(int i, List<DataType> list, IBinder iBinder, int i2, IBinder iBinder2) {
        this.f19031a = i;
        this.f19032b = list;
        this.f19033c = AbstractC5209ag.AbstractBinderC5210a.m21088a(iBinder);
        this.f19034d = i2;
        this.f19035e = alq.AbstractBinderC6512a.m16932a(iBinder2);
    }

    private StartBleScanRequest(C5201a c5201a) {
        this(C4679b.m23164a(c5201a.f19036a), c5201a.f19037b, c5201a.f19038c, null);
    }

    public StartBleScanRequest(StartBleScanRequest startBleScanRequest, alq alqVar) {
        this(startBleScanRequest.f19032b, startBleScanRequest.f19033c, startBleScanRequest.f19034d, alqVar);
    }

    public StartBleScanRequest(List<DataType> list, AbstractC5209ag abstractC5209ag, int i, alq alqVar) {
        this.f19031a = 4;
        this.f19032b = list;
        this.f19033c = abstractC5209ag;
        this.f19034d = i;
        this.f19035e = alqVar;
    }

    /* renamed from: a */
    public List<DataType> m21136a() {
        return Collections.unmodifiableList(this.f19032b);
    }

    /* renamed from: b */
    public int m21135b() {
        return this.f19034d;
    }

    /* renamed from: c */
    public IBinder m21134c() {
        return this.f19033c.asBinder();
    }

    /* renamed from: d */
    public IBinder m21133d() {
        if (this.f19035e == null) {
            return null;
        }
        return this.f19035e.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m21132e() {
        return this.f19031a;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("dataTypes", this.f19032b).m23632a("timeoutSecs", Integer.valueOf(this.f19034d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5234k.m21013a(this, parcel, i);
    }
}
