package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class GassRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GassRequestParcel> CREATOR = new C6051c();

    /* renamed from: a */
    public final int f20470a;

    /* renamed from: b */
    public final String f20471b;

    /* renamed from: c */
    public final String f20472c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GassRequestParcel(int i, String str, String str2) {
        this.f20470a = i;
        this.f20471b = str;
        this.f20472c = str2;
    }

    public GassRequestParcel(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6051c.m18948a(this, parcel, i);
    }
}
