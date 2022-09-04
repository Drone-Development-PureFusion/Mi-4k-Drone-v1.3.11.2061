package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class PlacePhotoMetadataResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<PlacePhotoMetadataResult> CREATOR = new C8312u();

    /* renamed from: a */
    final int f26892a;

    /* renamed from: b */
    final DataHolder f26893b;

    /* renamed from: c */
    private final Status f26894c;

    /* renamed from: d */
    private final C8289j f26895d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlacePhotoMetadataResult(int i, Status status, DataHolder dataHolder) {
        this.f26892a = i;
        this.f26894c = status;
        this.f26893b = dataHolder;
        if (dataHolder == null) {
            this.f26895d = null;
        } else {
            this.f26895d = new C8289j(this.f26893b);
        }
    }

    public PlacePhotoMetadataResult(Status status, DataHolder dataHolder) {
        this(0, status, dataHolder);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f26894c;
    }

    /* renamed from: b */
    public C8289j m12339b() {
        return this.f26895d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8312u.m12098a(this, parcel, i);
    }
}
