package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.internal.aln;
import java.util.List;
/* loaded from: classes2.dex */
public class ReadStatsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ReadStatsRequest> CREATOR = new C5218al();

    /* renamed from: a */
    private final int f18966a;

    /* renamed from: b */
    private final aln f18967b;

    /* renamed from: c */
    private final List<DataSource> f18968c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReadStatsRequest(int i, IBinder iBinder, List<DataSource> list) {
        this.f18966a = i;
        this.f18967b = aln.AbstractBinderC6506a.m16936a(iBinder);
        this.f18968c = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m21224a() {
        return this.f18966a;
    }

    /* renamed from: b */
    public IBinder m21223b() {
        return this.f18967b.asBinder();
    }

    /* renamed from: c */
    public List<DataSource> m21222c() {
        return this.f18968c;
    }

    public String toString() {
        return String.format("ReadStatsRequest", new Object[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5218al.m21071a(this, parcel, i);
    }
}
