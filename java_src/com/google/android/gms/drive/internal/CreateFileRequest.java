package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.C5111w;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* loaded from: classes2.dex */
public class CreateFileRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateFileRequest> CREATOR = new C4889bm();

    /* renamed from: a */
    final int f17692a;

    /* renamed from: b */
    final DriveId f17693b;

    /* renamed from: c */
    final MetadataBundle f17694c;

    /* renamed from: d */
    final Contents f17695d;

    /* renamed from: e */
    final Integer f17696e;

    /* renamed from: f */
    final boolean f17697f;

    /* renamed from: g */
    final String f17698g;

    /* renamed from: h */
    final int f17699h;

    /* renamed from: i */
    final int f17700i;

    /* renamed from: j */
    final String f17701j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CreateFileRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents, Integer num, boolean z, String str, int i2, int i3, String str2) {
        if (contents != null && i3 != 0) {
            C4588d.m23618b(contents.m22739f() == i3, "inconsistent contents reference");
        }
        if ((num == null || num.intValue() == 0) && contents == null && i3 == 0) {
            throw new IllegalArgumentException("Need a valid contents");
        }
        this.f17692a = i;
        this.f17693b = (DriveId) C4588d.m23627a(driveId);
        this.f17694c = (MetadataBundle) C4588d.m23627a(metadataBundle);
        this.f17695d = contents;
        this.f17696e = num;
        this.f17698g = str;
        this.f17699h = i2;
        this.f17697f = z;
        this.f17700i = i3;
        this.f17701j = str2;
    }

    public CreateFileRequest(DriveId driveId, MetadataBundle metadataBundle, int i, int i2, C5111w c5111w) {
        this(2, driveId, metadataBundle, null, Integer.valueOf(i2), c5111w.b(), c5111w.a(), c5111w.c(), i, c5111w.m21802d());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4889bm.m22482a(this, parcel, i);
    }
}
