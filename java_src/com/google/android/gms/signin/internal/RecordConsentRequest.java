package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class RecordConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecordConsentRequest> CREATOR = new C9015f();

    /* renamed from: a */
    final int f28646a;

    /* renamed from: b */
    private final Account f28647b;

    /* renamed from: c */
    private final Scope[] f28648c;

    /* renamed from: d */
    private final String f28649d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecordConsentRequest(int i, Account account, Scope[] scopeArr, String str) {
        this.f28646a = i;
        this.f28647b = account;
        this.f28648c = scopeArr;
        this.f28649d = str;
    }

    /* renamed from: a */
    public Account m9403a() {
        return this.f28647b;
    }

    /* renamed from: b */
    public Scope[] m9402b() {
        return this.f28648c;
    }

    /* renamed from: c */
    public String m9401c() {
        return this.f28649d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9015f.m9372a(this, parcel, i);
    }
}
