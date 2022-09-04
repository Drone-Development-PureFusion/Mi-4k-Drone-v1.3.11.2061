package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import java.util.Collections;
import java.util.List;
@aaa
/* loaded from: classes.dex */
public final class AdRequestInfoParcel extends AbstractSafeParcelable {
    public static final C3724f CREATOR = new C3724f();

    /* renamed from: A */
    public final List<String> f14469A;

    /* renamed from: B */
    public final long f14470B;

    /* renamed from: C */
    public final CapabilityParcel f14471C;

    /* renamed from: D */
    public final String f14472D;

    /* renamed from: E */
    public final float f14473E;

    /* renamed from: F */
    public final int f14474F;

    /* renamed from: G */
    public final int f14475G;

    /* renamed from: H */
    public final boolean f14476H;

    /* renamed from: I */
    public final boolean f14477I;

    /* renamed from: J */
    public final String f14478J;

    /* renamed from: K */
    public final boolean f14479K;

    /* renamed from: L */
    public final String f14480L;

    /* renamed from: M */
    public final boolean f14481M;

    /* renamed from: N */
    public final int f14482N;

    /* renamed from: O */
    public final Bundle f14483O;

    /* renamed from: P */
    public final String f14484P;

    /* renamed from: a */
    public final int f14485a;
    @Nullable

    /* renamed from: b */
    public final Bundle f14486b;

    /* renamed from: c */
    public final AdRequestParcel f14487c;

    /* renamed from: d */
    public final AdSizeParcel f14488d;

    /* renamed from: e */
    public final String f14489e;

    /* renamed from: f */
    public final ApplicationInfo f14490f;
    @Nullable

    /* renamed from: g */
    public final PackageInfo f14491g;

    /* renamed from: h */
    public final String f14492h;

    /* renamed from: i */
    public final String f14493i;

    /* renamed from: j */
    public final String f14494j;

    /* renamed from: k */
    public final VersionInfoParcel f14495k;

    /* renamed from: l */
    public final Bundle f14496l;

    /* renamed from: m */
    public final int f14497m;

    /* renamed from: n */
    public final List<String> f14498n;

    /* renamed from: o */
    public final Bundle f14499o;

    /* renamed from: p */
    public final boolean f14500p;

    /* renamed from: q */
    public final Messenger f14501q;

    /* renamed from: r */
    public final int f14502r;

    /* renamed from: s */
    public final int f14503s;

    /* renamed from: t */
    public final float f14504t;

    /* renamed from: u */
    public final String f14505u;

    /* renamed from: v */
    public final long f14506v;

    /* renamed from: w */
    public final String f14507w;
    @Nullable

    /* renamed from: x */
    public final List<String> f14508x;

    /* renamed from: y */
    public final String f14509y;

    /* renamed from: z */
    public final NativeAdOptionsParcel f14510z;

    @aaa
    /* renamed from: com.google.android.gms.ads.internal.request.AdRequestInfoParcel$a */
    /* loaded from: classes.dex */
    public static final class C3706a {

        /* renamed from: A */
        public final String f14511A;

        /* renamed from: B */
        public final float f14512B;

        /* renamed from: C */
        public final boolean f14513C;

        /* renamed from: D */
        public final int f14514D;

        /* renamed from: E */
        public final int f14515E;

        /* renamed from: F */
        public final boolean f14516F;

        /* renamed from: G */
        public final boolean f14517G;

        /* renamed from: H */
        public final String f14518H;

        /* renamed from: I */
        public final String f14519I;

        /* renamed from: J */
        public final boolean f14520J;

        /* renamed from: K */
        public final int f14521K;

        /* renamed from: L */
        public final Bundle f14522L;

        /* renamed from: M */
        public final String f14523M;
        @Nullable

        /* renamed from: a */
        public final Bundle f14524a;

        /* renamed from: b */
        public final AdRequestParcel f14525b;

        /* renamed from: c */
        public final AdSizeParcel f14526c;

        /* renamed from: d */
        public final String f14527d;

        /* renamed from: e */
        public final ApplicationInfo f14528e;
        @Nullable

        /* renamed from: f */
        public final PackageInfo f14529f;

        /* renamed from: g */
        public final String f14530g;

        /* renamed from: h */
        public final String f14531h;

        /* renamed from: i */
        public final Bundle f14532i;

        /* renamed from: j */
        public final VersionInfoParcel f14533j;

        /* renamed from: k */
        public final int f14534k;

        /* renamed from: l */
        public final List<String> f14535l;

        /* renamed from: m */
        public final List<String> f14536m;

        /* renamed from: n */
        public final Bundle f14537n;

        /* renamed from: o */
        public final boolean f14538o;

        /* renamed from: p */
        public final Messenger f14539p;

        /* renamed from: q */
        public final int f14540q;

        /* renamed from: r */
        public final int f14541r;

        /* renamed from: s */
        public final float f14542s;

        /* renamed from: t */
        public final String f14543t;

        /* renamed from: u */
        public final long f14544u;

        /* renamed from: v */
        public final String f14545v;
        @Nullable

        /* renamed from: w */
        public final List<String> f14546w;

        /* renamed from: x */
        public final String f14547x;

        /* renamed from: y */
        public final NativeAdOptionsParcel f14548y;

        /* renamed from: z */
        public final CapabilityParcel f14549z;

        public C3706a(@Nullable Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, String str2, String str3, VersionInfoParcel versionInfoParcel, Bundle bundle2, List<String> list, List<String> list2, Bundle bundle3, boolean z, Messenger messenger, int i, int i2, float f, String str4, long j, String str5, @Nullable List<String> list3, String str6, NativeAdOptionsParcel nativeAdOptionsParcel, CapabilityParcel capabilityParcel, String str7, float f2, boolean z2, int i3, int i4, boolean z3, boolean z4, String str8, String str9, boolean z5, int i5, Bundle bundle4, String str10) {
            this.f14524a = bundle;
            this.f14525b = adRequestParcel;
            this.f14526c = adSizeParcel;
            this.f14527d = str;
            this.f14528e = applicationInfo;
            this.f14529f = packageInfo;
            this.f14530g = str2;
            this.f14531h = str3;
            this.f14533j = versionInfoParcel;
            this.f14532i = bundle2;
            this.f14538o = z;
            this.f14539p = messenger;
            this.f14540q = i;
            this.f14541r = i2;
            this.f14542s = f;
            if (list == null || list.size() <= 0) {
                this.f14534k = 0;
                this.f14535l = null;
                this.f14536m = null;
            } else {
                this.f14534k = 3;
                this.f14535l = list;
                this.f14536m = list2;
            }
            this.f14537n = bundle3;
            this.f14543t = str4;
            this.f14544u = j;
            this.f14545v = str5;
            this.f14546w = list3;
            this.f14547x = str6;
            this.f14548y = nativeAdOptionsParcel;
            this.f14549z = capabilityParcel;
            this.f14511A = str7;
            this.f14512B = f2;
            this.f14513C = z2;
            this.f14514D = i3;
            this.f14515E = i4;
            this.f14516F = z3;
            this.f14517G = z4;
            this.f14518H = str8;
            this.f14519I = str9;
            this.f14520J = z5;
            this.f14521K = i5;
            this.f14522L = bundle4;
            this.f14523M = str10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdRequestInfoParcel(int i, Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, Messenger messenger, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list3, long j2, CapabilityParcel capabilityParcel, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11) {
        this.f14485a = i;
        this.f14486b = bundle;
        this.f14487c = adRequestParcel;
        this.f14488d = adSizeParcel;
        this.f14489e = str;
        this.f14490f = applicationInfo;
        this.f14491g = packageInfo;
        this.f14492h = str2;
        this.f14493i = str3;
        this.f14494j = str4;
        this.f14495k = versionInfoParcel;
        this.f14496l = bundle2;
        this.f14497m = i2;
        this.f14498n = list;
        this.f14469A = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f14499o = bundle3;
        this.f14500p = z;
        this.f14501q = messenger;
        this.f14502r = i3;
        this.f14503s = i4;
        this.f14504t = f;
        this.f14505u = str5;
        this.f14506v = j;
        this.f14507w = str6;
        this.f14508x = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f14509y = str7;
        this.f14510z = nativeAdOptionsParcel;
        this.f14470B = j2;
        this.f14471C = capabilityParcel;
        this.f14472D = str8;
        this.f14473E = f2;
        this.f14479K = z2;
        this.f14474F = i5;
        this.f14475G = i6;
        this.f14476H = z3;
        this.f14477I = z4;
        this.f14478J = str9;
        this.f14480L = str10;
        this.f14481M = z5;
        this.f14482N = i7;
        this.f14483O = bundle4;
        this.f14484P = str11;
    }

    public AdRequestInfoParcel(@Nullable Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, Messenger messenger, int i2, int i3, float f, String str5, long j, String str6, @Nullable List<String> list3, String str7, NativeAdOptionsParcel nativeAdOptionsParcel, long j2, CapabilityParcel capabilityParcel, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11) {
        this(19, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i, list, bundle3, z, messenger, i2, i3, f, str5, j, str6, list3, str7, nativeAdOptionsParcel, list2, j2, capabilityParcel, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11);
    }

    public AdRequestInfoParcel(C3706a c3706a, String str, long j) {
        this(c3706a.f14524a, c3706a.f14525b, c3706a.f14526c, c3706a.f14527d, c3706a.f14528e, c3706a.f14529f, str, c3706a.f14530g, c3706a.f14531h, c3706a.f14533j, c3706a.f14532i, c3706a.f14534k, c3706a.f14535l, c3706a.f14536m, c3706a.f14537n, c3706a.f14538o, c3706a.f14539p, c3706a.f14540q, c3706a.f14541r, c3706a.f14542s, c3706a.f14543t, c3706a.f14544u, c3706a.f14545v, c3706a.f14546w, c3706a.f14547x, c3706a.f14548y, j, c3706a.f14549z, c3706a.f14511A, c3706a.f14512B, c3706a.f14513C, c3706a.f14514D, c3706a.f14515E, c3706a.f14516F, c3706a.f14517G, c3706a.f14518H, c3706a.f14519I, c3706a.f14520J, c3706a.f14521K, c3706a.f14522L, c3706a.f14523M);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3724f.m27006a(this, parcel, i);
    }
}
