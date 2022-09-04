package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class ReadRawResult extends AbstractSafeParcelable implements AbstractC4502m, Closeable {
    public static final Parcelable.Creator<ReadRawResult> CREATOR = new C5260k();

    /* renamed from: a */
    private final int f19116a;

    /* renamed from: b */
    private final DataHolder f19117b;

    /* renamed from: c */
    private final List<DataHolder> f19118c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReadRawResult(int i, DataHolder dataHolder, List<DataHolder> list) {
        this.f19116a = i;
        this.f19117b = dataHolder;
        this.f19118c = list == null ? Collections.singletonList(dataHolder) : list;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return new Status(this.f19117b.m23883e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m20922b() {
        return this.f19116a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public DataHolder m20921c() {
        return this.f19117b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19117b != null) {
            this.f19117b.close();
        }
        for (DataHolder dataHolder : this.f19118c) {
            dataHolder.close();
        }
    }

    /* renamed from: d */
    public List<DataHolder> m20920d() {
        return this.f19118c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5260k.m20873a(this, parcel, i);
    }
}
