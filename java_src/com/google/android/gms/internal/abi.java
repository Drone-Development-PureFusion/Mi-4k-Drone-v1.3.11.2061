package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.AbstractC3603i;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
@aaa
/* loaded from: classes.dex */
public class abi {

    /* renamed from: A */
    public final long f20885A;

    /* renamed from: B */
    public final long f20886B;

    /* renamed from: C */
    public final String f20887C;

    /* renamed from: D */
    public final String f20888D;
    @Nullable

    /* renamed from: E */
    public final AbstractC3603i.AbstractC3604a f20889E;

    /* renamed from: F */
    public boolean f20890F;

    /* renamed from: G */
    public boolean f20891G;

    /* renamed from: H */
    public boolean f20892H;
    @Nullable

    /* renamed from: I */
    public final List<String> f20893I;

    /* renamed from: a */
    public final AdRequestParcel f20894a;
    @Nullable

    /* renamed from: b */
    public final acy f20895b;

    /* renamed from: c */
    public final List<String> f20896c;

    /* renamed from: d */
    public final int f20897d;

    /* renamed from: e */
    public final List<String> f20898e;

    /* renamed from: f */
    public final List<String> f20899f;

    /* renamed from: g */
    public final int f20900g;

    /* renamed from: h */
    public final long f20901h;

    /* renamed from: i */
    public final String f20902i;

    /* renamed from: j */
    public final JSONObject f20903j;

    /* renamed from: k */
    public final boolean f20904k;

    /* renamed from: l */
    public final AutoClickProtectionConfigurationParcel f20905l;

    /* renamed from: m */
    public boolean f20906m;

    /* renamed from: n */
    public final boolean f20907n;
    @Nullable

    /* renamed from: o */
    public final C7989xg f20908o;
    @Nullable

    /* renamed from: p */
    public final AbstractC8008xr f20909p;
    @Nullable

    /* renamed from: q */
    public final String f20910q;

    /* renamed from: r */
    public final C7990xh f20911r;
    @Nullable

    /* renamed from: s */
    public final BinderC7992xj f20912s;

    /* renamed from: t */
    public final long f20913t;
    @Nullable

    /* renamed from: u */
    public final String f20914u;

    /* renamed from: v */
    public final AdSizeParcel f20915v;

    /* renamed from: w */
    public final long f20916w;
    @Nullable

    /* renamed from: x */
    public final RewardItemParcel f20917x;
    @Nullable

    /* renamed from: y */
    public final List<String> f20918y;
    @Nullable

    /* renamed from: z */
    public final List<String> f20919z;

    @aaa
    /* renamed from: com.google.android.gms.internal.abi$a */
    /* loaded from: classes.dex */
    public static final class C6129a {

        /* renamed from: a */
        public final AdRequestInfoParcel f20920a;

        /* renamed from: b */
        public final AdResponseParcel f20921b;

        /* renamed from: c */
        public final C7990xh f20922c;
        @Nullable

        /* renamed from: d */
        public final AdSizeParcel f20923d;

        /* renamed from: e */
        public final int f20924e;

        /* renamed from: f */
        public final long f20925f;

        /* renamed from: g */
        public final long f20926g;
        @Nullable

        /* renamed from: h */
        public final JSONObject f20927h;

        public C6129a(AdRequestInfoParcel adRequestInfoParcel, AdResponseParcel adResponseParcel, C7990xh c7990xh, AdSizeParcel adSizeParcel, int i, long j, long j2, JSONObject jSONObject) {
            this.f20920a = adRequestInfoParcel;
            this.f20921b = adResponseParcel;
            this.f20922c = c7990xh;
            this.f20923d = adSizeParcel;
            this.f20924e = i;
            this.f20925f = j;
            this.f20926g = j2;
            this.f20927h = jSONObject;
        }
    }

    public abi(AdRequestParcel adRequestParcel, @Nullable acy acyVar, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, @Nullable C7989xg c7989xg, @Nullable AbstractC8008xr abstractC8008xr, @Nullable String str2, C7990xh c7990xh, @Nullable BinderC7992xj binderC7992xj, long j2, AdSizeParcel adSizeParcel, long j3, long j4, long j5, String str3, JSONObject jSONObject, @Nullable AbstractC3603i.AbstractC3604a abstractC3604a, RewardItemParcel rewardItemParcel, List<String> list4, List<String> list5, boolean z2, AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, @Nullable String str4, List<String> list6, String str5) {
        this.f20890F = false;
        this.f20891G = false;
        this.f20892H = false;
        this.f20894a = adRequestParcel;
        this.f20895b = acyVar;
        this.f20896c = m18485a(list);
        this.f20897d = i;
        this.f20898e = m18485a(list2);
        this.f20899f = m18485a(list3);
        this.f20900g = i2;
        this.f20901h = j;
        this.f20902i = str;
        this.f20907n = z;
        this.f20908o = c7989xg;
        this.f20909p = abstractC8008xr;
        this.f20910q = str2;
        this.f20911r = c7990xh;
        this.f20912s = binderC7992xj;
        this.f20913t = j2;
        this.f20915v = adSizeParcel;
        this.f20916w = j3;
        this.f20885A = j4;
        this.f20886B = j5;
        this.f20887C = str3;
        this.f20903j = jSONObject;
        this.f20889E = abstractC3604a;
        this.f20917x = rewardItemParcel;
        this.f20918y = m18485a(list4);
        this.f20919z = m18485a(list5);
        this.f20904k = z2;
        this.f20905l = autoClickProtectionConfigurationParcel;
        this.f20914u = str4;
        this.f20893I = m18485a(list6);
        this.f20888D = str5;
    }

    public abi(C6129a c6129a, @Nullable acy acyVar, @Nullable C7989xg c7989xg, @Nullable AbstractC8008xr abstractC8008xr, @Nullable String str, @Nullable BinderC7992xj binderC7992xj, @Nullable AbstractC3603i.AbstractC3604a abstractC3604a, @Nullable String str2) {
        this(c6129a.f20920a.f14487c, acyVar, c6129a.f20921b.f14568d, c6129a.f20924e, c6129a.f20921b.f14570f, c6129a.f20921b.f14574j, c6129a.f20921b.f14576l, c6129a.f20921b.f14575k, c6129a.f20920a.f14493i, c6129a.f20921b.f14572h, c7989xg, abstractC8008xr, str, c6129a.f20922c, binderC7992xj, c6129a.f20921b.f14573i, c6129a.f20923d, c6129a.f20921b.f14571g, c6129a.f20925f, c6129a.f20926g, c6129a.f20921b.f14579o, c6129a.f20927h, abstractC3604a, c6129a.f20921b.f14552C, c6129a.f20921b.f14553D, c6129a.f20921b.f14553D, c6129a.f20921b.f14555F, c6129a.f20921b.f14556G, str2, c6129a.f20921b.f14559J, c6129a.f20921b.f14563N);
    }

    @Nullable
    /* renamed from: a */
    private static <T> List<T> m18485a(@Nullable List<T> list) {
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public boolean m18486a() {
        if (this.f20895b == null || this.f20895b.mo18084l() == null) {
            return false;
        }
        return this.f20895b.mo18084l().m18162b();
    }
}
