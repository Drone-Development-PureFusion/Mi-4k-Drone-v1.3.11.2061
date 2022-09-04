package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* loaded from: classes2.dex */
public class CreateFileIntentSenderRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateFileIntentSenderRequest> CREATOR = new C4888bl();

    /* renamed from: a */
    final int f17686a;

    /* renamed from: b */
    final MetadataBundle f17687b;

    /* renamed from: c */
    final int f17688c;

    /* renamed from: d */
    final String f17689d;

    /* renamed from: e */
    final DriveId f17690e;

    /* renamed from: f */
    final Integer f17691f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CreateFileIntentSenderRequest(int i, MetadataBundle metadataBundle, int i2, String str, DriveId driveId, Integer num) {
        this.f17686a = i;
        this.f17687b = metadataBundle;
        this.f17688c = i2;
        this.f17689d = str;
        this.f17690e = driveId;
        this.f17691f = num;
    }

    public CreateFileIntentSenderRequest(MetadataBundle metadataBundle, int i, String str, DriveId driveId, int i2) {
        this(1, metadataBundle, i, str, driveId, Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4888bl.m22485a(this, parcel, i);
    }
}
