package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class OnStartStreamSession extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnStartStreamSession> CREATOR = new C4852ah();

    /* renamed from: a */
    final int f17783a;

    /* renamed from: b */
    final ParcelFileDescriptor f17784b;

    /* renamed from: c */
    final IBinder f17785c;

    /* renamed from: d */
    final String f17786d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnStartStreamSession(int i, ParcelFileDescriptor parcelFileDescriptor, IBinder iBinder, String str) {
        this.f17783a = i;
        this.f17784b = parcelFileDescriptor;
        this.f17785c = iBinder;
        this.f17786d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4852ah.m22574a(this, parcel, i | 1);
    }
}
