package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public class StringParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StringParcel> CREATOR = new C3745o();

    /* renamed from: a */
    final int f14605a;

    /* renamed from: b */
    String f14606b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StringParcel(int i, String str) {
        this.f14605a = i;
        this.f14606b = str;
    }

    public StringParcel(String str) {
        this.f14605a = 1;
        this.f14606b = str;
    }

    /* renamed from: a */
    public String m27035a() {
        return this.f14606b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3745o.m26976a(this, parcel, i);
    }
}
