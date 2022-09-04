package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8798q;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8813v;
/* loaded from: classes2.dex */
public final class AcceptConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AcceptConnectionRequestParams> CREATOR = new C8771a();

    /* renamed from: a */
    final int f28079a;
    @Nullable

    /* renamed from: b */
    private final AbstractC8813v f28080b;
    @Nullable

    /* renamed from: c */
    private final AbstractC8798q f28081c;

    /* renamed from: d */
    private final String f28082d;
    @Nullable

    /* renamed from: e */
    private final byte[] f28083e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AcceptConnectionRequestParams(int i, @Nullable IBinder iBinder, @Nullable IBinder iBinder2, String str, @Nullable byte[] bArr) {
        this.f28079a = i;
        this.f28080b = AbstractC8813v.AbstractBinderC8814a.m9996a(iBinder);
        this.f28081c = AbstractC8798q.AbstractBinderC8799a.m10046a(iBinder2);
        this.f28082d = str;
        this.f28083e = bArr;
    }

    @Nullable
    /* renamed from: a */
    public IBinder m10165a() {
        if (this.f28080b == null) {
            return null;
        }
        return this.f28080b.asBinder();
    }

    @Nullable
    /* renamed from: b */
    public IBinder m10164b() {
        if (this.f28081c == null) {
            return null;
        }
        return this.f28081c.asBinder();
    }

    /* renamed from: c */
    public String m10163c() {
        return this.f28082d;
    }

    @Nullable
    /* renamed from: d */
    public byte[] m10162d() {
        return this.f28083e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptConnectionRequestParams)) {
            return false;
        }
        AcceptConnectionRequestParams acceptConnectionRequestParams = (AcceptConnectionRequestParams) obj;
        return this.f28079a == acceptConnectionRequestParams.f28079a && C4585c.m23634a(this.f28080b, acceptConnectionRequestParams.f28080b) && C4585c.m23634a(this.f28081c, acceptConnectionRequestParams.f28081c) && C4585c.m23634a(this.f28082d, acceptConnectionRequestParams.f28082d) && C4585c.m23634a(this.f28083e, acceptConnectionRequestParams.f28083e);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28079a), this.f28080b, this.f28081c, this.f28082d, this.f28083e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8771a.m10112a(this, parcel, i);
    }
}
