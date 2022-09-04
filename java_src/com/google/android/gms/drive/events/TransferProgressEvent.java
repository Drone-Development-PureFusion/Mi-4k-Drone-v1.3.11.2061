package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.events.internal.TransferProgressData;
/* loaded from: classes2.dex */
public final class TransferProgressEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator<TransferProgressEvent> CREATOR = new C4831p();

    /* renamed from: a */
    final int f17614a;

    /* renamed from: b */
    final TransferProgressData f17615b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransferProgressEvent(int i, TransferProgressData transferProgressData) {
        this.f17614a = i;
        this.f17615b = transferProgressData;
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    /* renamed from: a */
    public int mo22667a() {
        return 8;
    }

    /* renamed from: b */
    public TransferProgressData m22668b() {
        return this.f17615b;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj != this) {
            return C4585c.m23634a(this.f17615b, ((TransferProgressEvent) obj).f17615b);
        }
        return true;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17615b);
    }

    public String toString() {
        return String.format("TransferProgressEvent[%s]", this.f17615b.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4831p.m22634a(this, parcel, i);
    }
}
