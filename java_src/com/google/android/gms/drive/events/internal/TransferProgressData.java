package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class TransferProgressData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransferProgressData> CREATOR = new C4824c();

    /* renamed from: a */
    final int f17624a;

    /* renamed from: b */
    final int f17625b;

    /* renamed from: c */
    final DriveId f17626c;

    /* renamed from: d */
    final int f17627d;

    /* renamed from: e */
    final long f17628e;

    /* renamed from: f */
    final long f17629f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransferProgressData(int i, int i2, DriveId driveId, int i3, long j, long j2) {
        this.f17624a = i;
        this.f17625b = i2;
        this.f17626c = driveId;
        this.f17627d = i3;
        this.f17628e = j;
        this.f17629f = j2;
    }

    /* renamed from: a */
    public int m22650a() {
        return this.f17625b;
    }

    /* renamed from: b */
    public DriveId m22649b() {
        return this.f17626c;
    }

    /* renamed from: c */
    public int m22648c() {
        return this.f17627d;
    }

    /* renamed from: d */
    public long m22647d() {
        return this.f17628e;
    }

    /* renamed from: e */
    public long m22646e() {
        return this.f17629f;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TransferProgressData transferProgressData = (TransferProgressData) obj;
        return this.f17625b == transferProgressData.f17625b && C4585c.m23634a(this.f17626c, transferProgressData.f17626c) && this.f17627d == transferProgressData.f17627d && this.f17628e == transferProgressData.f17628e && this.f17629f == transferProgressData.f17629f;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f17625b), this.f17626c, Integer.valueOf(this.f17627d), Long.valueOf(this.f17628e), Long.valueOf(this.f17629f));
    }

    public String toString() {
        return String.format("TransferProgressData[TransferType: %d, DriveId: %s, status: %d, bytes transferred: %d, total bytes: %d]", Integer.valueOf(this.f17625b), this.f17626c, Integer.valueOf(this.f17627d), Long.valueOf(this.f17628e), Long.valueOf(this.f17629f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4824c.m22643a(this, parcel, i);
    }
}
