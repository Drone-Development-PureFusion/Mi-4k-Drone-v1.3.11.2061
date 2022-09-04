package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.formats.C3458b;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public class NativeAdOptionsParcel extends AbstractSafeParcelable {
    public static final C3615k CREATOR = new C3615k();

    /* renamed from: a */
    public final int f14074a;

    /* renamed from: b */
    public final boolean f14075b;

    /* renamed from: c */
    public final int f14076c;

    /* renamed from: d */
    public final boolean f14077d;

    /* renamed from: e */
    public final int f14078e;
    @Nullable

    /* renamed from: f */
    public final VideoOptionsParcel f14079f;

    public NativeAdOptionsParcel(int i, boolean z, int i2, boolean z2, int i3, VideoOptionsParcel videoOptionsParcel) {
        this.f14074a = i;
        this.f14075b = z;
        this.f14076c = i2;
        this.f14077d = z2;
        this.f14078e = i3;
        this.f14079f = videoOptionsParcel;
    }

    public NativeAdOptionsParcel(C3458b c3458b) {
        this(3, c3458b.m27733a(), c3458b.m27732b(), c3458b.m27731c(), c3458b.m27730d(), c3458b.m27729e() != null ? new VideoOptionsParcel(c3458b.m27729e()) : null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3615k.m27355a(this, parcel, i);
    }
}
