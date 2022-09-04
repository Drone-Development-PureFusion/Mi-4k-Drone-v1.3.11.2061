package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
/* loaded from: classes2.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new C9400j();

    /* renamed from: a */
    String f29436a;

    /* renamed from: b */
    String f29437b;

    /* renamed from: c */
    ProxyCard f29438c;

    /* renamed from: d */
    String f29439d;

    /* renamed from: e */
    Address f29440e;

    /* renamed from: f */
    Address f29441f;

    /* renamed from: g */
    String[] f29442g;

    /* renamed from: h */
    UserAddress f29443h;

    /* renamed from: i */
    UserAddress f29444i;

    /* renamed from: j */
    InstrumentInfo[] f29445j;

    /* renamed from: k */
    PaymentMethodToken f29446k;

    /* renamed from: l */
    private final int f29447l;

    private FullWallet() {
        this.f29447l = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullWallet(int i, String str, String str2, ProxyCard proxyCard, String str3, Address address, Address address2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.f29447l = i;
        this.f29436a = str;
        this.f29437b = str2;
        this.f29438c = proxyCard;
        this.f29439d = str3;
        this.f29440e = address;
        this.f29441f = address2;
        this.f29442g = strArr;
        this.f29443h = userAddress;
        this.f29444i = userAddress2;
        this.f29445j = instrumentInfoArr;
        this.f29446k = paymentMethodToken;
    }

    /* renamed from: a */
    public int m8591a() {
        return this.f29447l;
    }

    /* renamed from: b */
    public String m8590b() {
        return this.f29436a;
    }

    /* renamed from: c */
    public String m8589c() {
        return this.f29437b;
    }

    /* renamed from: d */
    public ProxyCard m8588d() {
        return this.f29438c;
    }

    /* renamed from: e */
    public String m8587e() {
        return this.f29439d;
    }

    /* renamed from: f */
    public String[] m8586f() {
        return this.f29442g;
    }

    /* renamed from: g */
    public UserAddress m8585g() {
        return this.f29443h;
    }

    /* renamed from: h */
    public UserAddress m8584h() {
        return this.f29444i;
    }

    /* renamed from: i */
    public InstrumentInfo[] m8583i() {
        return this.f29445j;
    }

    /* renamed from: j */
    public PaymentMethodToken m8582j() {
        return this.f29446k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9400j.m8225a(this, parcel, i);
    }
}
