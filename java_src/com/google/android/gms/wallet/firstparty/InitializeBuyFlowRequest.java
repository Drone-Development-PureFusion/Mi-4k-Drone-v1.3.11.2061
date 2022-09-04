package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class InitializeBuyFlowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<InitializeBuyFlowRequest> CREATOR = new C9368i();

    /* renamed from: a */
    byte[][] f29635a;

    /* renamed from: b */
    private final int f29636b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InitializeBuyFlowRequest(int i, byte[][] bArr) {
        this.f29636b = i;
        this.f29635a = bArr;
    }

    /* renamed from: a */
    public int m8421a() {
        return this.f29636b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9368i.m8397a(this, parcel, i);
    }
}
