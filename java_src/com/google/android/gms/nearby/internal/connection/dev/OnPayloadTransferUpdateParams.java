package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.dev.PayloadTransferUpdate;
/* loaded from: classes2.dex */
public final class OnPayloadTransferUpdateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnPayloadTransferUpdateParams> CREATOR = new C8775ad();

    /* renamed from: a */
    final int f28109a;

    /* renamed from: b */
    private final String f28110b;

    /* renamed from: c */
    private final PayloadTransferUpdate f28111c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnPayloadTransferUpdateParams(int i, String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.f28109a = i;
        this.f28110b = str;
        this.f28111c = payloadTransferUpdate;
    }

    /* renamed from: a */
    public String m10146a() {
        return this.f28110b;
    }

    /* renamed from: b */
    public PayloadTransferUpdate m10145b() {
        return this.f28111c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnPayloadTransferUpdateParams)) {
            return false;
        }
        OnPayloadTransferUpdateParams onPayloadTransferUpdateParams = (OnPayloadTransferUpdateParams) obj;
        return this.f28109a == onPayloadTransferUpdateParams.f28109a && C4585c.m23634a(this.f28110b, onPayloadTransferUpdateParams.f28110b) && C4585c.m23634a(this.f28111c, onPayloadTransferUpdateParams.f28111c);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28109a), this.f28110b, this.f28111c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8775ad.m10100a(this, parcel, i);
    }
}
