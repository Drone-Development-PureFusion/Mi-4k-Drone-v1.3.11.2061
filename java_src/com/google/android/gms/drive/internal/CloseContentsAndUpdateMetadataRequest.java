package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.C5114x;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* loaded from: classes2.dex */
public class CloseContentsAndUpdateMetadataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloseContentsAndUpdateMetadataRequest> CREATOR = new C4883bg();

    /* renamed from: a */
    final int f17665a;

    /* renamed from: b */
    final DriveId f17666b;

    /* renamed from: c */
    final MetadataBundle f17667c;

    /* renamed from: d */
    final Contents f17668d;

    /* renamed from: e */
    final boolean f17669e;

    /* renamed from: f */
    final String f17670f;

    /* renamed from: g */
    final int f17671g;

    /* renamed from: h */
    final int f17672h;

    /* renamed from: i */
    final boolean f17673i;

    /* renamed from: j */
    final boolean f17674j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CloseContentsAndUpdateMetadataRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents, boolean z, String str, int i2, int i3, boolean z2, boolean z3) {
        this.f17665a = i;
        this.f17666b = driveId;
        this.f17667c = metadataBundle;
        this.f17668d = contents;
        this.f17669e = z;
        this.f17670f = str;
        this.f17671g = i2;
        this.f17672h = i3;
        this.f17673i = z2;
        this.f17674j = z3;
    }

    public CloseContentsAndUpdateMetadataRequest(DriveId driveId, MetadataBundle metadataBundle, int i, boolean z, C5114x c5114x) {
        this(1, driveId, metadataBundle, null, c5114x.b(), c5114x.a(), c5114x.c(), i, z, c5114x.m21795d());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4883bg.m22502a(this, parcel, i);
    }
}
