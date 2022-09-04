package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
/* loaded from: classes2.dex */
public final class WalletFragmentInitParams extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WalletFragmentInitParams> CREATOR = new C9394g();

    /* renamed from: a */
    final int f29671a;

    /* renamed from: b */
    private String f29672b;

    /* renamed from: c */
    private MaskedWalletRequest f29673c;

    /* renamed from: d */
    private int f29674d;

    /* renamed from: e */
    private MaskedWallet f29675e;

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragmentInitParams$a */
    /* loaded from: classes2.dex */
    public final class C9381a {
        private C9381a() {
        }

        /* renamed from: a */
        public C9381a m8292a(int i) {
            WalletFragmentInitParams.this.f29674d = i;
            return this;
        }

        /* renamed from: a */
        public C9381a m8291a(MaskedWallet maskedWallet) {
            WalletFragmentInitParams.this.f29675e = maskedWallet;
            return this;
        }

        /* renamed from: a */
        public C9381a m8290a(MaskedWalletRequest maskedWalletRequest) {
            WalletFragmentInitParams.this.f29673c = maskedWalletRequest;
            return this;
        }

        /* renamed from: a */
        public C9381a m8289a(String str) {
            WalletFragmentInitParams.this.f29672b = str;
            return this;
        }

        /* renamed from: a */
        public WalletFragmentInitParams m8293a() {
            boolean z = true;
            C4588d.m23622a((WalletFragmentInitParams.this.f29675e != null && WalletFragmentInitParams.this.f29673c == null) || (WalletFragmentInitParams.this.f29675e == null && WalletFragmentInitParams.this.f29673c != null), "Exactly one of MaskedWallet or MaskedWalletRequest is required");
            if (WalletFragmentInitParams.this.f29674d < 0) {
                z = false;
            }
            C4588d.m23622a(z, "masked wallet request code is required and must be non-negative");
            return WalletFragmentInitParams.this;
        }
    }

    private WalletFragmentInitParams() {
        this.f29671a = 1;
        this.f29674d = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WalletFragmentInitParams(int i, String str, MaskedWalletRequest maskedWalletRequest, int i2, MaskedWallet maskedWallet) {
        this.f29671a = i;
        this.f29672b = str;
        this.f29673c = maskedWalletRequest;
        this.f29674d = i2;
        this.f29675e = maskedWallet;
    }

    /* renamed from: a */
    public static C9381a m8305a() {
        WalletFragmentInitParams walletFragmentInitParams = new WalletFragmentInitParams();
        walletFragmentInitParams.getClass();
        return new C9381a();
    }

    /* renamed from: b */
    public String m8299b() {
        return this.f29672b;
    }

    /* renamed from: c */
    public MaskedWalletRequest m8297c() {
        return this.f29673c;
    }

    /* renamed from: d */
    public int m8295d() {
        return this.f29674d;
    }

    /* renamed from: e */
    public MaskedWallet m8294e() {
        return this.f29675e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9394g.m8243a(this, parcel, i);
    }
}
