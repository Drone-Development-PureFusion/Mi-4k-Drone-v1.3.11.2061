package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC4559ac;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collection;
/* loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C4637v();

    /* renamed from: a */
    final int f16994a;

    /* renamed from: b */
    final int f16995b;

    /* renamed from: c */
    int f16996c;

    /* renamed from: d */
    String f16997d;

    /* renamed from: e */
    IBinder f16998e;

    /* renamed from: f */
    Scope[] f16999f;

    /* renamed from: g */
    Bundle f17000g;

    /* renamed from: h */
    Account f17001h;

    /* renamed from: i */
    long f17002i;

    public GetServiceRequest(int i) {
        this.f16994a = 3;
        this.f16996c = C4648j.f17166c;
        this.f16995b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, long j) {
        this.f16994a = i;
        this.f16995b = i2;
        this.f16996c = i3;
        this.f16997d = str;
        if (i < 2) {
            this.f17001h = m23734a(iBinder);
        } else {
            this.f16998e = iBinder;
            this.f17001h = account;
        }
        this.f16999f = scopeArr;
        this.f17000g = bundle;
        this.f17002i = j;
    }

    /* renamed from: a */
    private Account m23734a(IBinder iBinder) {
        if (iBinder != null) {
            return BinderC4556a.m23716a(AbstractC4559ac.AbstractBinderC4560a.m23702a(iBinder));
        }
        return null;
    }

    /* renamed from: a */
    public GetServiceRequest m23736a(Account account) {
        this.f17001h = account;
        return this;
    }

    /* renamed from: a */
    public GetServiceRequest m23735a(Bundle bundle) {
        this.f17000g = bundle;
        return this;
    }

    /* renamed from: a */
    public GetServiceRequest m23733a(AbstractC4559ac abstractC4559ac) {
        if (abstractC4559ac != null) {
            this.f16998e = abstractC4559ac.asBinder();
        }
        return this;
    }

    /* renamed from: a */
    public GetServiceRequest m23732a(String str) {
        this.f16997d = str;
        return this;
    }

    /* renamed from: a */
    public GetServiceRequest m23731a(Collection<Scope> collection) {
        this.f16999f = (Scope[]) collection.toArray(new Scope[collection.size()]);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4637v.m23426a(this, parcel, i);
    }
}
