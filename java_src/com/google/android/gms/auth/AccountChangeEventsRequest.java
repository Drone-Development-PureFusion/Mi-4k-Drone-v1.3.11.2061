package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new C4079g();

    /* renamed from: a */
    final int f15336a;

    /* renamed from: b */
    int f15337b;
    @Deprecated

    /* renamed from: c */
    String f15338c;

    /* renamed from: d */
    Account f15339d;

    public AccountChangeEventsRequest() {
        this.f15336a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f15336a = i;
        this.f15337b = i2;
        this.f15338c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f15339d = account;
        } else {
            this.f15339d = new Account(str, "com.google");
        }
    }

    /* renamed from: a */
    public AccountChangeEventsRequest m25868a(int i) {
        this.f15337b = i;
        return this;
    }

    /* renamed from: a */
    public AccountChangeEventsRequest m25867a(Account account) {
        this.f15339d = account;
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public AccountChangeEventsRequest m25866a(String str) {
        this.f15338c = str;
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public String m25869a() {
        return this.f15338c;
    }

    /* renamed from: b */
    public Account m25865b() {
        return this.f15339d;
    }

    /* renamed from: c */
    public int m25864c() {
        return this.f15337b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4079g.m25544a(this, parcel, i);
    }
}
