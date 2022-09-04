package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.C3473i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public class VideoOptionsParcel extends AbstractSafeParcelable {
    public static final C3579r CREATOR = new C3579r();

    /* renamed from: a */
    public final int f13889a;

    /* renamed from: b */
    public final boolean f13890b;

    public VideoOptionsParcel(int i, boolean z) {
        this.f13889a = i;
        this.f13890b = z;
    }

    public VideoOptionsParcel(C3473i c3473i) {
        this(1, c3473i.m27694a());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3579r.m27424a(this, parcel, i);
    }
}
