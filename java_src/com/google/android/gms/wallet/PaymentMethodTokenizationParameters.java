package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new C9412v();

    /* renamed from: a */
    int f29554a;

    /* renamed from: b */
    Bundle f29555b;

    /* renamed from: c */
    private final int f29556c;

    /* renamed from: com.google.android.gms.wallet.PaymentMethodTokenizationParameters$a */
    /* loaded from: classes2.dex */
    public final class C9347a {
        private C9347a() {
        }

        /* renamed from: a */
        public C9347a m8462a(int i) {
            PaymentMethodTokenizationParameters.this.f29554a = i;
            return this;
        }

        /* renamed from: a */
        public C9347a m8461a(String str, String str2) {
            C4588d.m23624a(str, (Object) "Tokenization parameter name must not be empty");
            C4588d.m23624a(str2, (Object) "Tokenization parameter value must not be empty");
            PaymentMethodTokenizationParameters.this.f29555b.putString(str, str2);
            return this;
        }

        /* renamed from: a */
        public PaymentMethodTokenizationParameters m8463a() {
            return PaymentMethodTokenizationParameters.this;
        }
    }

    private PaymentMethodTokenizationParameters() {
        this.f29555b = new Bundle();
        this.f29556c = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PaymentMethodTokenizationParameters(int i, int i2, Bundle bundle) {
        this.f29555b = new Bundle();
        this.f29556c = i;
        this.f29554a = i2;
        this.f29555b = bundle;
    }

    /* renamed from: a */
    public static C9347a m8467a() {
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = new PaymentMethodTokenizationParameters();
        paymentMethodTokenizationParameters.getClass();
        return new C9347a();
    }

    /* renamed from: b */
    public int m8466b() {
        return this.f29556c;
    }

    /* renamed from: c */
    public int m8465c() {
        return this.f29554a;
    }

    /* renamed from: d */
    public Bundle m8464d() {
        return new Bundle(this.f29555b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9412v.m8189a(this, parcel, i);
    }
}
