package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.vision.C9274d;
/* loaded from: classes2.dex */
public class FrameMetadataParcel extends AbstractSafeParcelable {
    public static final C9306b CREATOR = new C9306b();

    /* renamed from: a */
    final int f29357a;

    /* renamed from: b */
    public int f29358b;

    /* renamed from: c */
    public int f29359c;

    /* renamed from: d */
    public int f29360d;

    /* renamed from: e */
    public long f29361e;

    /* renamed from: f */
    public int f29362f;

    public FrameMetadataParcel() {
        this.f29357a = 1;
    }

    public FrameMetadataParcel(int i, int i2, int i3, int i4, long j, int i5) {
        this.f29357a = i;
        this.f29358b = i2;
        this.f29359c = i3;
        this.f29360d = i4;
        this.f29361e = j;
        this.f29362f = i5;
    }

    /* renamed from: a */
    public static FrameMetadataParcel m8667a(C9274d c9274d) {
        FrameMetadataParcel frameMetadataParcel = new FrameMetadataParcel();
        frameMetadataParcel.f29358b = c9274d.m8765a().m8751a();
        frameMetadataParcel.f29359c = c9274d.m8765a().m8748b();
        frameMetadataParcel.f29362f = c9274d.m8765a().m8742e();
        frameMetadataParcel.f29360d = c9274d.m8765a().m8746c();
        frameMetadataParcel.f29361e = c9274d.m8765a().m8744d();
        return frameMetadataParcel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9306b c9306b = CREATOR;
        C9306b.m8661a(this, parcel, i);
    }
}
