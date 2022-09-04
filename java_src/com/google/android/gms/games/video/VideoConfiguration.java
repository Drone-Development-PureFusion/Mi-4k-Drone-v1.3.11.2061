package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class VideoConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VideoConfiguration> CREATOR = new C6035d();

    /* renamed from: a */
    public static final int f20430a = 3;

    /* renamed from: b */
    public static final int f20431b = 2;

    /* renamed from: c */
    public static final int f20432c = 1;

    /* renamed from: d */
    public static final int f20433d = 0;

    /* renamed from: e */
    public static final int f20434e = -1;

    /* renamed from: f */
    public static final int f20435f = 4;

    /* renamed from: g */
    public static final int f20436g = -1;

    /* renamed from: h */
    public static final int f20437h = 0;

    /* renamed from: i */
    public static final int f20438i = 1;

    /* renamed from: j */
    public static final int f20439j = 2;

    /* renamed from: k */
    private final int f20440k;

    /* renamed from: l */
    private final int f20441l;

    /* renamed from: m */
    private final int f20442m;

    /* renamed from: n */
    private final String f20443n;

    /* renamed from: o */
    private final String f20444o;

    /* renamed from: p */
    private final String f20445p;

    /* renamed from: q */
    private final String f20446q;

    /* renamed from: r */
    private final boolean f20447r;

    /* renamed from: com.google.android.gms.games.video.VideoConfiguration$a */
    /* loaded from: classes2.dex */
    public static final class C6031a {

        /* renamed from: a */
        private int f20448a;

        /* renamed from: b */
        private int f20449b;

        /* renamed from: c */
        private boolean f20450c = true;

        /* renamed from: d */
        private String f20451d = null;

        /* renamed from: e */
        private String f20452e = null;

        /* renamed from: f */
        private String f20453f = null;

        /* renamed from: g */
        private String f20454g = null;

        public C6031a(int i, int i2) {
            this.f20448a = i;
            this.f20449b = i2;
        }

        /* renamed from: a */
        public C6031a m19005a(int i) {
            this.f20448a = i;
            return this;
        }

        /* renamed from: a */
        public VideoConfiguration m19006a() {
            return new VideoConfiguration(this.f20448a, this.f20449b, (String) null, (String) null, (String) null, (String) null, this.f20450c);
        }

        /* renamed from: b */
        public C6031a m19004b(int i) {
            this.f20449b = i;
            return this;
        }
    }

    public VideoConfiguration(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z) {
        boolean z2 = true;
        this.f20440k = i;
        C4588d.m23619b(m19015a(i2, false));
        C4588d.m23619b(m19013b(i3, false));
        this.f20441l = i2;
        this.f20442m = i3;
        this.f20447r = z;
        if (i3 == 1) {
            this.f20444o = str2;
            this.f20443n = str;
            this.f20445p = str3;
            this.f20446q = str4;
            return;
        }
        C4588d.m23618b(str2 == null, "Stream key should be null when not streaming");
        C4588d.m23618b(str == null, "Stream url should be null when not streaming");
        C4588d.m23618b(str3 == null, "Stream title should be null when not streaming");
        C4588d.m23618b(str4 != null ? false : z2, "Stream description should be null when not streaming");
        this.f20444o = null;
        this.f20443n = null;
        this.f20445p = null;
        this.f20446q = null;
    }

    private VideoConfiguration(int i, int i2, String str, String str2, String str3, String str4, boolean z) {
        this(2, i, i2, str, str2, str3, str4, z);
    }

    /* renamed from: a */
    public static boolean m19015a(int i, boolean z) {
        switch (i) {
            case -1:
                return z;
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m19013b(int i, boolean z) {
        switch (i) {
            case -1:
                return z;
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public int m19016a() {
        return this.f20440k;
    }

    /* renamed from: b */
    public int m19014b() {
        return this.f20441l;
    }

    /* renamed from: c */
    public int m19012c() {
        return this.f20442m;
    }

    /* renamed from: d */
    public String m19011d() {
        return this.f20444o;
    }

    /* renamed from: e */
    public String m19010e() {
        return this.f20443n;
    }

    /* renamed from: f */
    public String m19009f() {
        return this.f20445p;
    }

    /* renamed from: g */
    public String m19008g() {
        return this.f20446q;
    }

    /* renamed from: h */
    public boolean m19007h() {
        return this.f20447r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6035d.m18980a(this, parcel, i);
    }
}
