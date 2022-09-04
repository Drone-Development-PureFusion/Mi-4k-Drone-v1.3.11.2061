package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class TransferProgressOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransferProgressOptions> CREATOR = new C4832q();

    /* renamed from: a */
    final int f17616a;

    /* renamed from: b */
    final int f17617b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransferProgressOptions(int i, int i2) {
        this.f17616a = i;
        this.f17617b = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj != this) {
            return C4585c.m23634a(Integer.valueOf(this.f17617b), Integer.valueOf(((TransferProgressOptions) obj).f17617b));
        }
        return true;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f17617b));
    }

    public String toString() {
        return String.format(Locale.US, "TransferProgressOptions[type=%d]", Integer.valueOf(this.f17617b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4832q.m22631a(this, parcel, i);
    }
}
