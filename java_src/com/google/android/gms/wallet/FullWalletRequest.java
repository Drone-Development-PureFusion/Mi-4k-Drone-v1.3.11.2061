package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class FullWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWalletRequest> CREATOR = new C9401k();

    /* renamed from: a */
    String f29448a;

    /* renamed from: b */
    String f29449b;

    /* renamed from: c */
    Cart f29450c;

    /* renamed from: d */
    private final int f29451d;

    /* renamed from: com.google.android.gms.wallet.FullWalletRequest$a */
    /* loaded from: classes2.dex */
    public final class C9332a {
        private C9332a() {
        }

        /* renamed from: a */
        public C9332a m8575a(Cart cart) {
            FullWalletRequest.this.f29450c = cart;
            return this;
        }

        /* renamed from: a */
        public C9332a m8574a(String str) {
            FullWalletRequest.this.f29448a = str;
            return this;
        }

        /* renamed from: a */
        public FullWalletRequest m8576a() {
            return FullWalletRequest.this;
        }

        /* renamed from: b */
        public C9332a m8573b(String str) {
            FullWalletRequest.this.f29449b = str;
            return this;
        }
    }

    FullWalletRequest() {
        this.f29451d = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullWalletRequest(int i, String str, String str2, Cart cart) {
        this.f29451d = i;
        this.f29448a = str;
        this.f29449b = str2;
        this.f29450c = cart;
    }

    /* renamed from: a */
    public static C9332a m8581a() {
        FullWalletRequest fullWalletRequest = new FullWalletRequest();
        fullWalletRequest.getClass();
        return new C9332a();
    }

    /* renamed from: b */
    public int m8580b() {
        return this.f29451d;
    }

    /* renamed from: c */
    public String m8579c() {
        return this.f29448a;
    }

    /* renamed from: d */
    public String m8578d() {
        return this.f29449b;
    }

    /* renamed from: e */
    public Cart m8577e() {
        return this.f29450c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9401k.m8222a(this, parcel, i);
    }
}
