package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class UriData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UriData> CREATOR = new C9423h();

    /* renamed from: a */
    String f29776a;

    /* renamed from: b */
    String f29777b;

    /* renamed from: c */
    private final int f29778c;

    UriData() {
        this.f29778c = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UriData(int i, String str, String str2) {
        this.f29778c = i;
        this.f29776a = str;
        this.f29777b = str2;
    }

    /* renamed from: a */
    public int m8174a() {
        return this.f29778c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9423h.m8149a(this, parcel, i);
    }
}
