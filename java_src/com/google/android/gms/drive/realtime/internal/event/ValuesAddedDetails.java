package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ValuesAddedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ValuesAddedDetails> CREATOR = new C5071i();

    /* renamed from: a */
    final int f18175a;

    /* renamed from: b */
    final int f18176b;

    /* renamed from: c */
    final int f18177c;

    /* renamed from: d */
    final int f18178d;

    /* renamed from: e */
    final String f18179e;

    /* renamed from: f */
    final int f18180f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ValuesAddedDetails(int i, int i2, int i3, int i4, String str, int i5) {
        this.f18175a = i;
        this.f18176b = i2;
        this.f18177c = i3;
        this.f18178d = i4;
        this.f18179e = str;
        this.f18180f = i5;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5071i.m21902a(this, parcel, i);
    }
}
