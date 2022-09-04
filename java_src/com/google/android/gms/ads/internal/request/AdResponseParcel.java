package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import java.util.Collections;
import java.util.List;
@aaa
/* loaded from: classes.dex */
public final class AdResponseParcel extends AbstractSafeParcelable {
    public static final C3726h CREATOR = new C3726h();

    /* renamed from: A */
    public final boolean f14550A;

    /* renamed from: B */
    public final boolean f14551B;
    @Nullable

    /* renamed from: C */
    public final RewardItemParcel f14552C;
    @Nullable

    /* renamed from: D */
    public final List<String> f14553D;
    @Nullable

    /* renamed from: E */
    public final List<String> f14554E;

    /* renamed from: F */
    public final boolean f14555F;
    @Nullable

    /* renamed from: G */
    public final AutoClickProtectionConfigurationParcel f14556G;

    /* renamed from: H */
    public final boolean f14557H;
    @Nullable

    /* renamed from: I */
    public String f14558I;

    /* renamed from: J */
    public final List<String> f14559J;

    /* renamed from: K */
    public final boolean f14560K;
    @Nullable

    /* renamed from: L */
    public final String f14561L;
    @Nullable

    /* renamed from: M */
    public final SafeBrowsingConfigParcel f14562M;
    @Nullable

    /* renamed from: N */
    public final String f14563N;

    /* renamed from: O */
    private AdRequestInfoParcel f14564O;

    /* renamed from: a */
    public final int f14565a;

    /* renamed from: b */
    public final String f14566b;

    /* renamed from: c */
    public String f14567c;

    /* renamed from: d */
    public final List<String> f14568d;

    /* renamed from: e */
    public final int f14569e;

    /* renamed from: f */
    public final List<String> f14570f;

    /* renamed from: g */
    public final long f14571g;

    /* renamed from: h */
    public final boolean f14572h;

    /* renamed from: i */
    public final long f14573i;

    /* renamed from: j */
    public final List<String> f14574j;

    /* renamed from: k */
    public final long f14575k;

    /* renamed from: l */
    public final int f14576l;

    /* renamed from: m */
    public final String f14577m;

    /* renamed from: n */
    public final long f14578n;

    /* renamed from: o */
    public final String f14579o;

    /* renamed from: p */
    public final boolean f14580p;

    /* renamed from: q */
    public final String f14581q;

    /* renamed from: r */
    public final String f14582r;

    /* renamed from: s */
    public final boolean f14583s;

    /* renamed from: t */
    public final boolean f14584t;

    /* renamed from: u */
    public final boolean f14585u;

    /* renamed from: v */
    public final boolean f14586v;

    /* renamed from: w */
    public final boolean f14587w;

    /* renamed from: x */
    public LargeParcelTeleporter f14588x;

    /* renamed from: y */
    public String f14589y;

    /* renamed from: z */
    public final String f14590z;

    public AdResponseParcel(int i) {
        this(18, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null);
    }

    public AdResponseParcel(int i, long j) {
        this(18, null, null, null, i, null, -1L, false, -1L, null, j, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdResponseParcel(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LargeParcelTeleporter largeParcelTeleporter, String str7, String str8, boolean z8, boolean z9, RewardItemParcel rewardItemParcel, List<String> list4, List<String> list5, boolean z10, AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, boolean z11, String str9, List<String> list6, boolean z12, String str10, SafeBrowsingConfigParcel safeBrowsingConfigParcel, String str11) {
        StringParcel stringParcel;
        this.f14565a = i;
        this.f14566b = str;
        this.f14567c = str2;
        this.f14568d = list != null ? Collections.unmodifiableList(list) : null;
        this.f14569e = i2;
        this.f14570f = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f14571g = j;
        this.f14572h = z;
        this.f14573i = j2;
        this.f14574j = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f14575k = j3;
        this.f14576l = i3;
        this.f14577m = str3;
        this.f14578n = j4;
        this.f14579o = str4;
        this.f14580p = z2;
        this.f14581q = str5;
        this.f14582r = str6;
        this.f14583s = z3;
        this.f14584t = z4;
        this.f14585u = z5;
        this.f14586v = z6;
        this.f14587w = z7;
        this.f14588x = largeParcelTeleporter;
        this.f14589y = str7;
        this.f14590z = str8;
        if (this.f14567c == null && this.f14588x != null && (stringParcel = (StringParcel) this.f14588x.m27037a(StringParcel.CREATOR)) != null && !TextUtils.isEmpty(stringParcel.m27035a())) {
            this.f14567c = stringParcel.m27035a();
        }
        this.f14550A = z8;
        this.f14551B = z9;
        this.f14552C = rewardItemParcel;
        this.f14553D = list4;
        this.f14554E = list5;
        this.f14555F = z10;
        this.f14556G = autoClickProtectionConfigurationParcel;
        this.f14557H = z11;
        this.f14558I = str9;
        this.f14559J = list6;
        this.f14560K = z12;
        this.f14561L = str10;
        this.f14562M = safeBrowsingConfigParcel;
        this.f14563N = str11;
    }

    public AdResponseParcel(AdRequestInfoParcel adRequestInfoParcel, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, RewardItemParcel rewardItemParcel, List<String> list4, List<String> list5, boolean z9, AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, boolean z10, String str7, List<String> list6, boolean z11, String str8, SafeBrowsingConfigParcel safeBrowsingConfigParcel, String str9) {
        this(18, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, z6, null, null, str6, z7, z8, rewardItemParcel, list4, list5, z9, autoClickProtectionConfigurationParcel, z10, str7, list6, z11, str8, safeBrowsingConfigParcel, str9);
        this.f14564O = adRequestInfoParcel;
    }

    public AdResponseParcel(AdRequestInfoParcel adRequestInfoParcel, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, RewardItemParcel rewardItemParcel, List<String> list4, List<String> list5, boolean z10, AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, boolean z11, String str8, List<String> list6, boolean z12, String str9, SafeBrowsingConfigParcel safeBrowsingConfigParcel, String str10) {
        this(18, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, rewardItemParcel, list4, list5, z10, autoClickProtectionConfigurationParcel, z11, str8, list6, z12, str9, safeBrowsingConfigParcel, str10);
        this.f14564O = adRequestInfoParcel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f14564O != null && this.f14564O.f14485a >= 9 && !TextUtils.isEmpty(this.f14567c)) {
            this.f14588x = new LargeParcelTeleporter(new StringParcel(this.f14567c));
            this.f14567c = null;
        }
        C3726h.m27003a(this, parcel, i);
    }
}
