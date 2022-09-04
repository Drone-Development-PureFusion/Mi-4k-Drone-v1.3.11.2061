package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class FetchConfigIpcResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FetchConfigIpcResponse> CREATOR = new C4717h();

    /* renamed from: a */
    private final int f17329a;

    /* renamed from: b */
    private final int f17330b;

    /* renamed from: c */
    private final DataHolder f17331c;

    /* renamed from: d */
    private final long f17332d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FetchConfigIpcResponse(int i, int i2, DataHolder dataHolder, long j) {
        this.f17329a = i;
        this.f17330b = i2;
        this.f17331c = dataHolder;
        this.f17332d = j;
    }

    /* renamed from: a */
    public int m23061a() {
        return this.f17329a;
    }

    /* renamed from: b */
    public int m23060b() {
        return this.f17330b;
    }

    /* renamed from: c */
    public DataHolder m23059c() {
        return this.f17331c;
    }

    /* renamed from: d */
    public long m23058d() {
        return this.f17332d;
    }

    /* renamed from: e */
    public void m23057e() {
        if (this.f17331c == null || this.f17331c.m23877h()) {
            return;
        }
        this.f17331c.close();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4717h.m23031a(this, parcel, i);
    }
}
