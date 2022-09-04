package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class PlacePhotoResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<PlacePhotoResult> CREATOR = new C8324v();

    /* renamed from: a */
    final int f26896a;

    /* renamed from: b */
    final BitmapTeleporter f26897b;

    /* renamed from: c */
    private final Status f26898c;

    /* renamed from: d */
    private final Bitmap f26899d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlacePhotoResult(int i, Status status, BitmapTeleporter bitmapTeleporter) {
        this.f26896a = i;
        this.f26898c = status;
        this.f26897b = bitmapTeleporter;
        if (this.f26897b != null) {
            this.f26899d = bitmapTeleporter.m23904a();
        } else {
            this.f26899d = null;
        }
    }

    public PlacePhotoResult(Status status, @Nullable BitmapTeleporter bitmapTeleporter) {
        this(0, status, bitmapTeleporter);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f26898c;
    }

    /* renamed from: b */
    public Bitmap m12338b() {
        return this.f26899d;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", this.f26898c).m23632a("bitmap", this.f26899d).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8324v.m12061a(this, parcel, i);
    }
}
