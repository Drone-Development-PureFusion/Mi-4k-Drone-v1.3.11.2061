package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public class Contents extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Contents> CREATOR = new C5025q();

    /* renamed from: a */
    final int f17503a;

    /* renamed from: b */
    final ParcelFileDescriptor f17504b;

    /* renamed from: c */
    final int f17505c;

    /* renamed from: d */
    final int f17506d;

    /* renamed from: e */
    final DriveId f17507e;

    /* renamed from: f */
    final boolean f17508f;

    /* renamed from: g */
    final String f17509g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Contents(int i, ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, DriveId driveId, boolean z, String str) {
        this.f17503a = i;
        this.f17504b = parcelFileDescriptor;
        this.f17505c = i2;
        this.f17506d = i3;
        this.f17507e = driveId;
        this.f17508f = z;
        this.f17509g = str;
    }

    /* renamed from: a */
    public ParcelFileDescriptor m22744a() {
        return this.f17504b;
    }

    /* renamed from: b */
    public DriveId m22743b() {
        return this.f17507e;
    }

    /* renamed from: c */
    public InputStream m22742c() {
        return new FileInputStream(this.f17504b.getFileDescriptor());
    }

    /* renamed from: d */
    public OutputStream m22741d() {
        return new FileOutputStream(this.f17504b.getFileDescriptor());
    }

    /* renamed from: e */
    public int m22740e() {
        return this.f17506d;
    }

    /* renamed from: f */
    public int m22739f() {
        return this.f17505c;
    }

    /* renamed from: g */
    public boolean m22738g() {
        return this.f17508f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5025q.m22054a(this, parcel, i);
    }
}
