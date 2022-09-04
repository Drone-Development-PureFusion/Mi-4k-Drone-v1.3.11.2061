package com.google.android.gms.games.video;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.games.video.a */
/* loaded from: classes2.dex */
public final class C6032a {

    /* renamed from: a */
    private final boolean f20461a;

    /* renamed from: b */
    private final int f20462b;

    /* renamed from: c */
    private final int f20463c;

    /* renamed from: d */
    private final boolean f20464d;

    /* renamed from: e */
    private final boolean f20465e;

    private C6032a(boolean z, int i, int i2, boolean z2, boolean z3) {
        C4588d.m23619b(VideoConfiguration.m19013b(i, true));
        C4588d.m23619b(VideoConfiguration.m19015a(i2, true));
        this.f20461a = z;
        this.f20462b = i;
        this.f20463c = i2;
        this.f20464d = z2;
        this.f20465e = z3;
    }

    /* renamed from: a */
    public static C6032a m18991a(Bundle bundle) {
        if (bundle == null || bundle.get("IsCapturing") == null) {
            return null;
        }
        return new C6032a(bundle.getBoolean("IsCapturing", false), bundle.getInt("CaptureMode", -1), bundle.getInt("CaptureQuality", -1), bundle.getBoolean("IsOverlayVisible", false), bundle.getBoolean("IsPaused", false));
    }

    /* renamed from: a */
    public boolean m18992a() {
        return this.f20461a;
    }

    /* renamed from: b */
    public int m18990b() {
        return this.f20462b;
    }

    /* renamed from: c */
    public int m18989c() {
        return this.f20463c;
    }

    /* renamed from: d */
    public boolean m18988d() {
        return this.f20464d;
    }

    /* renamed from: e */
    public boolean m18987e() {
        return this.f20465e;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("IsCapturing", Boolean.valueOf(this.f20461a)).m23632a("CaptureMode", Integer.valueOf(this.f20462b)).m23632a("CaptureQuality", Integer.valueOf(this.f20463c)).m23632a("IsOverlayVisible", Boolean.valueOf(this.f20464d)).m23632a("IsPaused", Boolean.valueOf(this.f20465e)).toString();
    }
}
