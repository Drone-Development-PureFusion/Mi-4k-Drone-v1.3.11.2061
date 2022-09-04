package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8813v;
/* loaded from: classes2.dex */
public final class RejectConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RejectConnectionRequestParams> CREATOR = new C8780b();

    /* renamed from: a */
    final int f28124a;
    @Nullable

    /* renamed from: b */
    private final AbstractC8813v f28125b;

    /* renamed from: c */
    private final String f28126c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RejectConnectionRequestParams(int i, @Nullable IBinder iBinder, String str) {
        this.f28124a = i;
        this.f28125b = AbstractC8813v.AbstractBinderC8814a.m9996a(iBinder);
        this.f28126c = str;
    }

    @Nullable
    /* renamed from: a */
    public IBinder m10136a() {
        if (this.f28125b == null) {
            return null;
        }
        return this.f28125b.asBinder();
    }

    /* renamed from: b */
    public String m10135b() {
        return this.f28126c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RejectConnectionRequestParams)) {
            return false;
        }
        RejectConnectionRequestParams rejectConnectionRequestParams = (RejectConnectionRequestParams) obj;
        return this.f28124a == rejectConnectionRequestParams.f28124a && C4585c.m23634a(this.f28125b, rejectConnectionRequestParams.f28125b) && C4585c.m23634a(this.f28126c, rejectConnectionRequestParams.f28126c);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28124a), this.f28125b, this.f28126c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8780b.m10085a(this, parcel, i);
    }
}
