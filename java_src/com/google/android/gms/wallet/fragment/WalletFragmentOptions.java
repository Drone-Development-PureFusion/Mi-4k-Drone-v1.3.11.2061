package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class WalletFragmentOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WalletFragmentOptions> CREATOR = new C9395h();

    /* renamed from: a */
    final int f29677a;

    /* renamed from: b */
    private int f29678b;

    /* renamed from: c */
    private int f29679c;

    /* renamed from: d */
    private WalletFragmentStyle f29680d;

    /* renamed from: e */
    private int f29681e;

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragmentOptions$a */
    /* loaded from: classes2.dex */
    public final class C9383a {
        private C9383a() {
        }

        /* renamed from: a */
        public C9383a m8276a(int i) {
            WalletFragmentOptions.this.f29678b = i;
            return this;
        }

        /* renamed from: a */
        public C9383a m8275a(WalletFragmentStyle walletFragmentStyle) {
            WalletFragmentOptions.this.f29680d = walletFragmentStyle;
            return this;
        }

        /* renamed from: a */
        public WalletFragmentOptions m8277a() {
            return WalletFragmentOptions.this;
        }

        /* renamed from: b */
        public C9383a m8274b(int i) {
            WalletFragmentOptions.this.f29679c = i;
            return this;
        }

        /* renamed from: c */
        public C9383a m8273c(int i) {
            WalletFragmentOptions.this.f29680d = new WalletFragmentStyle().m8271a(i);
            return this;
        }

        /* renamed from: d */
        public C9383a m8272d(int i) {
            WalletFragmentOptions.this.f29681e = i;
            return this;
        }
    }

    private WalletFragmentOptions() {
        this.f29677a = 1;
        this.f29678b = 3;
        this.f29680d = new WalletFragmentStyle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WalletFragmentOptions(int i, int i2, int i3, WalletFragmentStyle walletFragmentStyle, int i4) {
        this.f29677a = i;
        this.f29678b = i2;
        this.f29679c = i3;
        this.f29680d = walletFragmentStyle;
        this.f29681e = i4;
    }

    /* renamed from: a */
    public static C9383a m8288a() {
        WalletFragmentOptions walletFragmentOptions = new WalletFragmentOptions();
        walletFragmentOptions.getClass();
        return new C9383a();
    }

    /* renamed from: a */
    public static WalletFragmentOptions m8286a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3424R.styleable.WalletFragmentOptions);
        int i = obtainStyledAttributes.getInt(C3424R.styleable.WalletFragmentOptions_appTheme, 0);
        int i2 = obtainStyledAttributes.getInt(C3424R.styleable.WalletFragmentOptions_environment, 1);
        int resourceId = obtainStyledAttributes.getResourceId(C3424R.styleable.WalletFragmentOptions_fragmentStyle, 0);
        int i3 = obtainStyledAttributes.getInt(C3424R.styleable.WalletFragmentOptions_fragmentMode, 1);
        obtainStyledAttributes.recycle();
        WalletFragmentOptions walletFragmentOptions = new WalletFragmentOptions();
        walletFragmentOptions.f29679c = i;
        walletFragmentOptions.f29678b = i2;
        walletFragmentOptions.f29680d = new WalletFragmentStyle().m8271a(resourceId);
        walletFragmentOptions.f29680d.m8267a(context);
        walletFragmentOptions.f29681e = i3;
        return walletFragmentOptions;
    }

    /* renamed from: a */
    public void m8287a(Context context) {
        if (this.f29680d != null) {
            this.f29680d.m8267a(context);
        }
    }

    /* renamed from: b */
    public int m8283b() {
        return this.f29678b;
    }

    /* renamed from: c */
    public int m8281c() {
        return this.f29679c;
    }

    /* renamed from: d */
    public WalletFragmentStyle m8279d() {
        return this.f29680d;
    }

    /* renamed from: e */
    public int m8278e() {
        return this.f29681e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9395h.m8240a(this, parcel, i);
    }
}
