package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class BeginCompoundOperationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginCompoundOperationRequest> CREATOR = new C5052a();

    /* renamed from: a */
    final int f18109a;

    /* renamed from: b */
    final boolean f18110b;

    /* renamed from: c */
    final String f18111c;

    /* renamed from: d */
    final boolean f18112d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BeginCompoundOperationRequest(int i, boolean z, String str, boolean z2) {
        this.f18109a = i;
        this.f18110b = z;
        this.f18111c = str;
        this.f18112d = z2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5052a.m21941a(this, parcel, i);
    }
}
