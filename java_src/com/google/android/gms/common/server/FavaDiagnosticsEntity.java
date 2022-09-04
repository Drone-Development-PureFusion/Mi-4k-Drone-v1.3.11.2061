package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C4658a CREATOR = new C4658a();

    /* renamed from: a */
    final int f17190a;

    /* renamed from: b */
    public final String f17191b;

    /* renamed from: c */
    public final int f17192c;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f17190a = i;
        this.f17191b = str;
        this.f17192c = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4658a.m23317a(this, parcel, i);
    }
}
