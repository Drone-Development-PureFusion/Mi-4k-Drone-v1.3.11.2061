package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new C9411u();

    /* renamed from: a */
    int f29551a;

    /* renamed from: b */
    String f29552b;

    /* renamed from: c */
    private final int f29553c;

    private PaymentMethodToken() {
        this.f29553c = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PaymentMethodToken(int i, int i2, String str) {
        this.f29553c = i;
        this.f29551a = i2;
        this.f29552b = str;
    }

    /* renamed from: a */
    public int m8470a() {
        return this.f29553c;
    }

    /* renamed from: b */
    public int m8469b() {
        return this.f29551a;
    }

    /* renamed from: c */
    public String m8468c() {
        return this.f29552b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9411u.m8192a(this, parcel, i);
    }
}
