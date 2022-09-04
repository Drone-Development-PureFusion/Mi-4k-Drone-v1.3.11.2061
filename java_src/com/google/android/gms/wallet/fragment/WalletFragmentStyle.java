package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public final class WalletFragmentStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletFragmentStyle> CREATOR = new C9396i();

    /* renamed from: a */
    final int f29683a;

    /* renamed from: b */
    Bundle f29684b;

    /* renamed from: c */
    int f29685c;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragmentStyle$a */
    /* loaded from: classes.dex */
    public @interface AbstractC9384a {

        /* renamed from: a */
        public static final int f29686a = 4;

        /* renamed from: b */
        public static final int f29687b = 5;

        /* renamed from: c */
        public static final int f29688c = 6;
        @Deprecated

        /* renamed from: d */
        public static final int f29689d = 1;
        @Deprecated

        /* renamed from: e */
        public static final int f29690e = 2;
        @Deprecated

        /* renamed from: f */
        public static final int f29691f = 3;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragmentStyle$b */
    /* loaded from: classes.dex */
    public @interface AbstractC9385b {

        /* renamed from: a */
        public static final int f29692a = 5;

        /* renamed from: b */
        public static final int f29693b = 6;

        /* renamed from: c */
        public static final int f29694c = 7;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragmentStyle$c */
    /* loaded from: classes.dex */
    public @interface AbstractC9386c {

        /* renamed from: a */
        public static final int f29695a = 0;

        /* renamed from: b */
        public static final int f29696b = 1;

        /* renamed from: c */
        public static final int f29697c = 2;

        /* renamed from: d */
        public static final int f29698d = 3;

        /* renamed from: e */
        public static final int f29699e = 4;

        /* renamed from: f */
        public static final int f29700f = 5;

        /* renamed from: g */
        public static final int f29701g = -1;

        /* renamed from: h */
        public static final int f29702h = -2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragmentStyle$d */
    /* loaded from: classes.dex */
    public @interface AbstractC9387d {
        @Deprecated

        /* renamed from: a */
        public static final int f29703a = 1;
        @Deprecated

        /* renamed from: b */
        public static final int f29704b = 2;

        /* renamed from: c */
        public static final int f29705c = 3;
    }

    public WalletFragmentStyle() {
        this.f29683a = 1;
        this.f29684b = new Bundle();
        this.f29684b.putInt("buyButtonAppearanceDefault", 4);
        this.f29684b.putInt("maskedWalletDetailsLogoImageTypeDefault", 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WalletFragmentStyle(int i, Bundle bundle, int i2) {
        this.f29683a = i;
        this.f29684b = bundle;
        this.f29685c = i2;
    }

    /* renamed from: a */
    private static int m8268a(long j, DisplayMetrics displayMetrics) {
        int i;
        int i2 = (int) (j >>> 32);
        int i3 = (int) j;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 128:
                return TypedValue.complexToDimensionPixelSize(i3, displayMetrics);
            case 129:
                return i3;
            default:
                throw new IllegalStateException(new StringBuilder(36).append("Unexpected unit or type: ").append(i2).toString());
        }
        return Math.round(TypedValue.applyDimension(i, Float.intBitsToFloat(i3), displayMetrics));
    }

    /* renamed from: a */
    private static long m8269a(int i, int i2) {
        return (i << 32) | (i2 & 4294967295L);
    }

    /* renamed from: a */
    private static long m8264a(TypedValue typedValue) {
        switch (typedValue.type) {
            case 5:
                return m8269a(128, typedValue.data);
            case 16:
                return m8246o(typedValue.data);
            default:
                throw new IllegalArgumentException(new StringBuilder(38).append("Unexpected dimension type: ").append(typedValue.type).toString());
        }
    }

    /* renamed from: a */
    private void m8266a(TypedArray typedArray, int i, String str) {
        TypedValue peekValue;
        if (!this.f29684b.containsKey(str) && (peekValue = typedArray.peekValue(i)) != null) {
            this.f29684b.putLong(str, m8264a(peekValue));
        }
    }

    /* renamed from: a */
    private void m8265a(TypedArray typedArray, int i, String str, String str2) {
        TypedValue peekValue;
        if (this.f29684b.containsKey(str) || this.f29684b.containsKey(str2) || (peekValue = typedArray.peekValue(i)) == null) {
            return;
        }
        if (peekValue.type < 28 || peekValue.type > 31) {
            this.f29684b.putInt(str2, peekValue.resourceId);
        } else {
            this.f29684b.putInt(str, peekValue.data);
        }
    }

    /* renamed from: b */
    private void m8260b(TypedArray typedArray, int i, String str) {
        TypedValue peekValue;
        if (!this.f29684b.containsKey(str) && (peekValue = typedArray.peekValue(i)) != null) {
            this.f29684b.putInt(str, peekValue.data);
        }
    }

    /* renamed from: c */
    private static long m8258c(int i, float f) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return m8269a(i, Float.floatToIntBits(f));
            default:
                throw new IllegalArgumentException(new StringBuilder(30).append("Unrecognized unit: ").append(i).toString());
        }
    }

    /* renamed from: o */
    private static long m8246o(int i) {
        if (i < 0) {
            if (i != -1 && i != -2) {
                throw new IllegalArgumentException(new StringBuilder(39).append("Unexpected dimension value: ").append(i).toString());
            }
            return m8269a(129, i);
        }
        return m8258c(0, i);
    }

    /* renamed from: a */
    public int m8263a(String str, DisplayMetrics displayMetrics, int i) {
        return this.f29684b.containsKey(str) ? m8268a(this.f29684b.getLong(str), displayMetrics) : i;
    }

    /* renamed from: a */
    public WalletFragmentStyle m8271a(int i) {
        this.f29685c = i;
        return this;
    }

    /* renamed from: a */
    public WalletFragmentStyle m8270a(int i, float f) {
        this.f29684b.putLong("buyButtonHeight", m8258c(i, f));
        return this;
    }

    /* renamed from: a */
    public void m8267a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f29685c <= 0 ? C3424R.style.WalletFragmentDefaultStyle : this.f29685c, C3424R.styleable.WalletFragmentStyle);
        m8266a(obtainStyledAttributes, C3424R.styleable.WalletFragmentStyle_buyButtonWidth, "buyButtonWidth");
        m8266a(obtainStyledAttributes, C3424R.styleable.WalletFragmentStyle_buyButtonHeight, "buyButtonHeight");
        m8260b(obtainStyledAttributes, C3424R.styleable.WalletFragmentStyle_buyButtonText, "buyButtonText");
        m8260b(obtainStyledAttributes, C3424R.styleable.WalletFragmentStyle_buyButtonAppearance, "buyButtonAppearance");
        m8260b(obtainStyledAttributes, C3424R.styleable.WalletFragmentStyle_maskedWalletDetailsTextAppearance, "maskedWalletDetailsTextAppearance");
        m8260b(obtainStyledAttributes, C3424R.styleable.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance, "maskedWalletDetailsHeaderTextAppearance");
        m8265a(obtainStyledAttributes, C3424R.styleable.WalletFragmentStyle_maskedWalletDetailsBackground, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
        m8260b(obtainStyledAttributes, C3424R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance, "maskedWalletDetailsButtonTextAppearance");
        m8265a(obtainStyledAttributes, C3424R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonBackground, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
        m8260b(obtainStyledAttributes, C3424R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoTextColor, "maskedWalletDetailsLogoTextColor");
        m8260b(obtainStyledAttributes, C3424R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoImageType, "maskedWalletDetailsLogoImageType");
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public WalletFragmentStyle m8262b(int i) {
        this.f29684b.putInt("buyButtonText", i);
        return this;
    }

    /* renamed from: b */
    public WalletFragmentStyle m8261b(int i, float f) {
        this.f29684b.putLong("buyButtonWidth", m8258c(i, f));
        return this;
    }

    /* renamed from: c */
    public WalletFragmentStyle m8259c(int i) {
        this.f29684b.putLong("buyButtonHeight", m8246o(i));
        return this;
    }

    /* renamed from: d */
    public WalletFragmentStyle m8257d(int i) {
        this.f29684b.putLong("buyButtonWidth", m8246o(i));
        return this;
    }

    /* renamed from: e */
    public WalletFragmentStyle m8256e(int i) {
        this.f29684b.putInt("buyButtonAppearance", i);
        return this;
    }

    /* renamed from: f */
    public WalletFragmentStyle m8255f(int i) {
        this.f29684b.putInt("maskedWalletDetailsTextAppearance", i);
        return this;
    }

    /* renamed from: g */
    public WalletFragmentStyle m8254g(int i) {
        this.f29684b.putInt("maskedWalletDetailsHeaderTextAppearance", i);
        return this;
    }

    /* renamed from: h */
    public WalletFragmentStyle m8253h(int i) {
        this.f29684b.remove("maskedWalletDetailsBackgroundResource");
        this.f29684b.putInt("maskedWalletDetailsBackgroundColor", i);
        return this;
    }

    /* renamed from: i */
    public WalletFragmentStyle m8252i(int i) {
        this.f29684b.remove("maskedWalletDetailsBackgroundColor");
        this.f29684b.putInt("maskedWalletDetailsBackgroundResource", i);
        return this;
    }

    /* renamed from: j */
    public WalletFragmentStyle m8251j(int i) {
        this.f29684b.putInt("maskedWalletDetailsButtonTextAppearance", i);
        return this;
    }

    /* renamed from: k */
    public WalletFragmentStyle m8250k(int i) {
        this.f29684b.remove("maskedWalletDetailsButtonBackgroundResource");
        this.f29684b.putInt("maskedWalletDetailsButtonBackgroundColor", i);
        return this;
    }

    /* renamed from: l */
    public WalletFragmentStyle m8249l(int i) {
        this.f29684b.remove("maskedWalletDetailsButtonBackgroundColor");
        this.f29684b.putInt("maskedWalletDetailsButtonBackgroundResource", i);
        return this;
    }

    /* renamed from: m */
    public WalletFragmentStyle m8248m(int i) {
        this.f29684b.putInt("maskedWalletDetailsLogoImageType", i);
        return this;
    }

    @Deprecated
    /* renamed from: n */
    public WalletFragmentStyle m8247n(int i) {
        this.f29684b.putInt("maskedWalletDetailsLogoTextColor", i);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9396i.m8237a(this, parcel, i);
    }
}
