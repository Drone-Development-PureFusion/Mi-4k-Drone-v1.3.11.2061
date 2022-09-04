package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public abstract class WriteAwareParcelable extends AbstractSafeParcelable {

    /* renamed from: a */
    private volatile transient boolean f17547a = false;

    /* renamed from: a */
    protected abstract void mo22607a(Parcel parcel, int i);

    /* renamed from: o_ */
    public final boolean m22716o_() {
        return this.f17547a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4588d.m23623a(!m22716o_());
        this.f17547a = true;
        mo22607a(parcel, i);
    }
}
