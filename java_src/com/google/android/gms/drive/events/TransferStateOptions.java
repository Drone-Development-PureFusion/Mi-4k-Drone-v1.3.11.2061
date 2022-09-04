package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveSpace;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* loaded from: classes2.dex */
public final class TransferStateOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransferStateOptions> CREATOR = new C4835t();

    /* renamed from: a */
    final int f17621a;

    /* renamed from: b */
    final List<DriveSpace> f17622b;

    /* renamed from: c */
    private final Set<DriveSpace> f17623c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransferStateOptions(int i, List<DriveSpace> list) {
        this(i, list, list == null ? null : new HashSet(list));
    }

    private TransferStateOptions(int i, List<DriveSpace> list, Set<DriveSpace> set) {
        this.f17621a = i;
        this.f17622b = list;
        this.f17623c = set;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj != this) {
            return C4585c.m23634a(this.f17623c, ((TransferStateOptions) obj).f17623c);
        }
        return true;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17623c);
    }

    public String toString() {
        return String.format(Locale.US, "TransferStateOptions[Spaces=%s]", this.f17622b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4835t.m22625a(this, parcel, i);
    }
}
