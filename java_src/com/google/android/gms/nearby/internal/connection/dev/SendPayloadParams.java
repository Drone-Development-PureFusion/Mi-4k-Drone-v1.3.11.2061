package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8813v;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class SendPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SendPayloadParams> CREATOR = new C8782d();

    /* renamed from: a */
    final int f28134a;
    @Nullable

    /* renamed from: b */
    private final AbstractC8813v f28135b;

    /* renamed from: c */
    private final String[] f28136c;
    @Nullable

    /* renamed from: d */
    private final ParcelablePayload f28137d;

    /* renamed from: e */
    private final boolean f28138e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SendPayloadParams(int i, @Nullable IBinder iBinder, String[] strArr, @Nullable ParcelablePayload parcelablePayload, boolean z) {
        this.f28134a = i;
        this.f28135b = AbstractC8813v.AbstractBinderC8814a.m9996a(iBinder);
        this.f28136c = strArr;
        this.f28137d = parcelablePayload;
        this.f28138e = z;
    }

    @Nullable
    /* renamed from: a */
    public IBinder m10128a() {
        if (this.f28135b == null) {
            return null;
        }
        return this.f28135b.asBinder();
    }

    /* renamed from: b */
    public String[] m10127b() {
        return this.f28136c;
    }

    @Nullable
    /* renamed from: c */
    public ParcelablePayload m10126c() {
        return this.f28137d;
    }

    /* renamed from: d */
    public boolean m10125d() {
        return this.f28138e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendPayloadParams)) {
            return false;
        }
        SendPayloadParams sendPayloadParams = (SendPayloadParams) obj;
        return this.f28134a == sendPayloadParams.f28134a && C4585c.m23634a(this.f28135b, sendPayloadParams.f28135b) && Arrays.equals(this.f28136c, sendPayloadParams.f28136c) && C4585c.m23634a(this.f28137d, sendPayloadParams.f28137d) && C4585c.m23634a(Boolean.valueOf(this.f28138e), Boolean.valueOf(sendPayloadParams.f28138e));
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28134a), this.f28135b, this.f28136c, this.f28137d, Boolean.valueOf(this.f28138e));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8782d.m10079a(this, parcel, i);
    }
}
