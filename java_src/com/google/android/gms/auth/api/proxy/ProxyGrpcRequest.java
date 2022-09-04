package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ProxyGrpcRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyGrpcRequest> CREATOR = new C4038c();

    /* renamed from: a */
    final int f15467a;

    /* renamed from: b */
    public final String f15468b;

    /* renamed from: c */
    public final int f15469c;

    /* renamed from: d */
    public final long f15470d;

    /* renamed from: e */
    public final byte[] f15471e;

    /* renamed from: f */
    public final String f15472f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProxyGrpcRequest(int i, String str, int i2, long j, byte[] bArr, String str2) {
        this.f15467a = i;
        this.f15468b = str;
        this.f15469c = i2;
        this.f15470d = j;
        this.f15471e = bArr;
        this.f15472f = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4038c.m25695a(this, parcel, i);
    }
}
