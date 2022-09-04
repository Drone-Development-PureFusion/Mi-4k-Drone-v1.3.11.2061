package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class OnPayloadReceivedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnPayloadReceivedParams> CREATOR = new C8774ac();

    /* renamed from: a */
    final int f28105a;

    /* renamed from: b */
    private final String f28106b;

    /* renamed from: c */
    private final ParcelablePayload f28107c;

    /* renamed from: d */
    private final boolean f28108d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnPayloadReceivedParams(int i, String str, ParcelablePayload parcelablePayload, boolean z) {
        this.f28105a = i;
        this.f28106b = str;
        this.f28107c = parcelablePayload;
        this.f28108d = z;
    }

    /* renamed from: a */
    public String m10149a() {
        return this.f28106b;
    }

    /* renamed from: b */
    public ParcelablePayload m10148b() {
        return this.f28107c;
    }

    /* renamed from: c */
    public boolean m10147c() {
        return this.f28108d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnPayloadReceivedParams)) {
            return false;
        }
        OnPayloadReceivedParams onPayloadReceivedParams = (OnPayloadReceivedParams) obj;
        return this.f28105a == onPayloadReceivedParams.f28105a && C4585c.m23634a(this.f28106b, onPayloadReceivedParams.f28106b) && C4585c.m23634a(this.f28107c, onPayloadReceivedParams.f28107c) && C4585c.m23634a(Boolean.valueOf(this.f28108d), Boolean.valueOf(onPayloadReceivedParams.f28108d));
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28105a), this.f28106b, this.f28107c, Boolean.valueOf(this.f28108d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8774ac.m10103a(this, parcel, i);
    }
}
