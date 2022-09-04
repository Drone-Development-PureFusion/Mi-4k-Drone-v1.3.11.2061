package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8798q;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8801r;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8813v;
/* loaded from: classes2.dex */
public final class SendConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SendConnectionRequestParams> CREATOR = new C8781c();

    /* renamed from: a */
    final int f28127a;
    @Nullable

    /* renamed from: b */
    private final AbstractC8813v f28128b;
    @Nullable

    /* renamed from: c */
    private final AbstractC8798q f28129c;
    @Nullable

    /* renamed from: d */
    private final AbstractC8801r f28130d;

    /* renamed from: e */
    private final String f28131e;

    /* renamed from: f */
    private final String f28132f;
    @Nullable

    /* renamed from: g */
    private final byte[] f28133g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SendConnectionRequestParams(int i, @Nullable IBinder iBinder, @Nullable IBinder iBinder2, @Nullable IBinder iBinder3, String str, String str2, @Nullable byte[] bArr) {
        this.f28127a = i;
        this.f28128b = AbstractC8813v.AbstractBinderC8814a.m9996a(iBinder);
        this.f28129c = AbstractC8798q.AbstractBinderC8799a.m10046a(iBinder2);
        this.f28130d = AbstractC8801r.AbstractBinderC8802a.m10042a(iBinder3);
        this.f28131e = str;
        this.f28132f = str2;
        this.f28133g = bArr;
    }

    @Nullable
    /* renamed from: a */
    public IBinder m10134a() {
        if (this.f28128b == null) {
            return null;
        }
        return this.f28128b.asBinder();
    }

    @Nullable
    /* renamed from: b */
    public IBinder m10133b() {
        if (this.f28129c == null) {
            return null;
        }
        return this.f28129c.asBinder();
    }

    @Nullable
    /* renamed from: c */
    public IBinder m10132c() {
        if (this.f28130d == null) {
            return null;
        }
        return this.f28130d.asBinder();
    }

    /* renamed from: d */
    public String m10131d() {
        return this.f28131e;
    }

    /* renamed from: e */
    public String m10130e() {
        return this.f28132f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendConnectionRequestParams)) {
            return false;
        }
        SendConnectionRequestParams sendConnectionRequestParams = (SendConnectionRequestParams) obj;
        return this.f28127a == sendConnectionRequestParams.f28127a && C4585c.m23634a(this.f28128b, sendConnectionRequestParams.f28128b) && C4585c.m23634a(this.f28129c, sendConnectionRequestParams.f28129c) && C4585c.m23634a(this.f28130d, sendConnectionRequestParams.f28130d) && C4585c.m23634a(this.f28131e, sendConnectionRequestParams.f28131e) && C4585c.m23634a(this.f28132f, sendConnectionRequestParams.f28132f) && C4585c.m23634a(this.f28133g, sendConnectionRequestParams.f28133g);
    }

    @Nullable
    /* renamed from: f */
    public byte[] m10129f() {
        return this.f28133g;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28127a), this.f28128b, this.f28129c, this.f28130d, this.f28131e, this.f28132f, this.f28133g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8781c.m10082a(this, parcel, i);
    }
}
