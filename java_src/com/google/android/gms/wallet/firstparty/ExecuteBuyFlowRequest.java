package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ExecuteBuyFlowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExecuteBuyFlowRequest> CREATOR = new C9360a();

    /* renamed from: a */
    byte[] f29617a;

    /* renamed from: b */
    byte[] f29618b;

    /* renamed from: c */
    WalletCustomTheme f29619c;

    /* renamed from: d */
    private final int f29620d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecuteBuyFlowRequest(int i, byte[] bArr, byte[] bArr2, WalletCustomTheme walletCustomTheme) {
        this.f29620d = i;
        this.f29617a = bArr;
        this.f29618b = bArr2;
        this.f29619c = walletCustomTheme;
    }

    /* renamed from: a */
    public int m8428a() {
        return this.f29620d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9360a.m8418a(this, parcel, i);
    }
}
