package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class VideoCapabilities extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VideoCapabilities> CREATOR = new C6034c();

    /* renamed from: a */
    private final int f20424a;

    /* renamed from: b */
    private final boolean f20425b;

    /* renamed from: c */
    private final boolean f20426c;

    /* renamed from: d */
    private final boolean f20427d;

    /* renamed from: e */
    private final boolean[] f20428e;

    /* renamed from: f */
    private final boolean[] f20429f;

    public VideoCapabilities(int i, boolean z, boolean z2, boolean z3, boolean[] zArr, boolean[] zArr2) {
        this.f20424a = i;
        this.f20425b = z;
        this.f20426c = z2;
        this.f20427d = z3;
        this.f20428e = zArr;
        this.f20429f = zArr2;
    }

    /* renamed from: a */
    public int m19025a() {
        return this.f20424a;
    }

    /* renamed from: a */
    public boolean m19024a(int i) {
        C4588d.m23623a(VideoConfiguration.m19013b(i, false));
        return this.f20428e[i];
    }

    /* renamed from: a */
    public boolean m19023a(int i, int i2) {
        return this.f20425b && this.f20426c && this.f20427d && m19024a(i) && m19021b(i2);
    }

    /* renamed from: b */
    public boolean m19022b() {
        return this.f20426c;
    }

    /* renamed from: b */
    public boolean m19021b(int i) {
        C4588d.m23623a(VideoConfiguration.m19015a(i, false));
        return this.f20429f[i];
    }

    /* renamed from: c */
    public boolean m19020c() {
        return this.f20425b;
    }

    /* renamed from: d */
    public boolean m19019d() {
        return this.f20427d;
    }

    /* renamed from: e */
    public boolean[] m19018e() {
        return this.f20428e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VideoCapabilities)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        VideoCapabilities videoCapabilities = (VideoCapabilities) obj;
        return C4585c.m23634a(videoCapabilities.m19018e(), m19018e()) && C4585c.m23634a(videoCapabilities.m19017f(), m19017f()) && C4585c.m23634a(Boolean.valueOf(videoCapabilities.m19020c()), Boolean.valueOf(m19020c())) && C4585c.m23634a(Boolean.valueOf(videoCapabilities.m19022b()), Boolean.valueOf(m19022b())) && C4585c.m23634a(Boolean.valueOf(videoCapabilities.m19019d()), Boolean.valueOf(m19019d()));
    }

    /* renamed from: f */
    public boolean[] m19017f() {
        return this.f20429f;
    }

    public int hashCode() {
        return C4585c.m23633a(m19018e(), m19017f(), Boolean.valueOf(m19020c()), Boolean.valueOf(m19022b()), Boolean.valueOf(m19019d()));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("SupportedCaptureModes", m19018e()).m23632a("SupportedQualityLevels", m19017f()).m23632a("CameraSupported", Boolean.valueOf(m19020c())).m23632a("MicSupported", Boolean.valueOf(m19022b())).m23632a("StorageWriteSupported", Boolean.valueOf(m19019d())).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6034c.m18983a(this, parcel, i);
    }
}
