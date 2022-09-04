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
public final class ChangesAvailableOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChangesAvailableOptions> CREATOR = new C4818f();

    /* renamed from: a */
    final int f17579a;

    /* renamed from: b */
    final int f17580b;

    /* renamed from: c */
    final boolean f17581c;

    /* renamed from: d */
    final List<DriveSpace> f17582d;

    /* renamed from: e */
    private final Set<DriveSpace> f17583e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChangesAvailableOptions(int i, int i2, boolean z, List<DriveSpace> list) {
        this(i, i2, z, list, list == null ? null : new HashSet(list));
    }

    private ChangesAvailableOptions(int i, int i2, boolean z, List<DriveSpace> list, Set<DriveSpace> set) {
        this.f17579a = i;
        this.f17580b = i2;
        this.f17581c = z;
        this.f17582d = list;
        this.f17583e = set;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ChangesAvailableOptions changesAvailableOptions = (ChangesAvailableOptions) obj;
        return C4585c.m23634a(this.f17583e, changesAvailableOptions.f17583e) && this.f17580b == changesAvailableOptions.f17580b && this.f17581c == changesAvailableOptions.f17581c;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17583e, Integer.valueOf(this.f17580b), Boolean.valueOf(this.f17581c));
    }

    public String toString() {
        return String.format(Locale.US, "ChangesAvailableOptions[ChangesSizeLimit=%d, Repeats=%s, Spaces=%s]", Integer.valueOf(this.f17580b), Boolean.valueOf(this.f17581c), this.f17582d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4818f.m22655a(this, parcel, i);
    }
}
