package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.BinderC3628l;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AbstractC3517af;
import com.google.android.gms.ads.internal.client.AbstractC3520ag;
import com.google.android.gms.ads.internal.client.AbstractC3532ak;
import com.google.android.gms.ads.internal.client.AbstractC3538am;
import com.google.android.gms.ads.internal.client.AbstractC3544ao;
import com.google.android.gms.ads.internal.client.AbstractC3553c;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.reward.client.AbstractC3755d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.C7940wr;
import com.google.android.gms.p232c.AbstractC4170e;
@aaa
/* renamed from: com.google.android.gms.internal.ws */
/* loaded from: classes.dex */
public class BinderC7942ws extends AbstractC3532ak.AbstractBinderC3533a {

    /* renamed from: a */
    private final String f26127a;

    /* renamed from: b */
    private final C7910wm f26128b;
    @Nullable

    /* renamed from: c */
    private BinderC3628l f26129c;

    /* renamed from: d */
    private final C7936wo f26130d;
    @Nullable

    /* renamed from: e */
    private AbstractC8096zd f26131e;

    /* renamed from: f */
    private String f26132f;

    public BinderC7942ws(Context context, String str, AbstractC8005xq abstractC8005xq, VersionInfoParcel versionInfoParcel, C3588d c3588d) {
        this(str, new C7910wm(context, abstractC8005xq, versionInfoParcel, c3588d));
    }

    BinderC7942ws(String str, C7910wm c7910wm) {
        this.f26127a = str;
        this.f26128b = c7910wm;
        this.f26130d = new C7936wo();
        C3779u.m26875t().m13222a(c7910wm);
    }

    /* renamed from: b */
    static boolean m13178b(AdRequestParcel adRequestParcel) {
        Bundle m13224a = C7938wp.m13224a(adRequestParcel);
        return m13224a != null && m13224a.containsKey("gw");
    }

    /* renamed from: c */
    static boolean m13176c(AdRequestParcel adRequestParcel) {
        Bundle m13224a = C7938wp.m13224a(adRequestParcel);
        return m13224a != null && m13224a.containsKey("_ad");
    }

    /* renamed from: n */
    private void m13165n() {
        if (this.f26129c == null || this.f26131e == null) {
            return;
        }
        this.f26129c.a(this.f26131e, this.f26132f);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    @Nullable
    /* renamed from: a */
    public AbstractC4170e mo13193a() {
        if (this.f26129c != null) {
            return this.f26129c.a();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13191a(AdSizeParcel adSizeParcel) {
        if (this.f26129c != null) {
            this.f26129c.a(adSizeParcel);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13190a(VideoOptionsParcel videoOptionsParcel) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13189a(AbstractC3517af abstractC3517af) {
        this.f26130d.f26108e = abstractC3517af;
        if (this.f26129c != null) {
            this.f26130d.m13232a(this.f26129c);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13188a(AbstractC3520ag abstractC3520ag) {
        this.f26130d.f26104a = abstractC3520ag;
        if (this.f26129c != null) {
            this.f26130d.m13232a(this.f26129c);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13187a(AbstractC3538am abstractC3538am) {
        this.f26130d.f26105b = abstractC3538am;
        if (this.f26129c != null) {
            this.f26130d.m13232a(this.f26129c);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13186a(AbstractC3544ao abstractC3544ao) {
        m13166m();
        if (this.f26129c != null) {
            this.f26129c.a(abstractC3544ao);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13185a(AbstractC3755d abstractC3755d) {
        this.f26130d.f26109f = abstractC3755d;
        if (this.f26129c != null) {
            this.f26130d.m13232a(this.f26129c);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13184a(AbstractC7807ur abstractC7807ur) {
        this.f26130d.f26107d = abstractC7807ur;
        if (this.f26129c != null) {
            this.f26130d.m13232a(this.f26129c);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13183a(AbstractC8082yy abstractC8082yy) {
        this.f26130d.f26106c = abstractC8082yy;
        if (this.f26129c != null) {
            this.f26130d.m13232a(this.f26129c);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13182a(AbstractC8096zd abstractC8096zd, String str) {
        this.f26131e = abstractC8096zd;
        this.f26132f = str;
        m13165n();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13181a(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13180a(boolean z) {
        m13166m();
        if (this.f26129c != null) {
            this.f26129c.a(z);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public boolean mo13192a(AdRequestParcel adRequestParcel) {
        if (C7788uf.f25788at.m13486c().booleanValue()) {
            AdRequestParcel.m27640a(adRequestParcel);
        }
        if (!m13178b(adRequestParcel)) {
            m13166m();
        }
        if (C7938wp.m13214c(adRequestParcel)) {
            m13166m();
        }
        if (adRequestParcel.f13854j != null) {
            m13166m();
        }
        if (this.f26129c != null) {
            return this.f26129c.a(adRequestParcel);
        }
        C7938wp m26875t = C3779u.m26875t();
        if (m13176c(adRequestParcel)) {
            m26875t.m13217b(adRequestParcel, this.f26127a);
        }
        C7940wr.C7941a m13223a = m26875t.m13223a(adRequestParcel, this.f26127a);
        if (m13223a == null) {
            m13166m();
            return this.f26129c.a(adRequestParcel);
        }
        if (!m13223a.f26124e) {
            m13223a.m13194a();
        }
        this.f26129c = m13223a.f26120a;
        m13223a.f26122c.m13244a(this.f26130d);
        this.f26130d.m13232a(this.f26129c);
        m13165n();
        return m13223a.f26125f;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: b */
    public void mo13179b() {
        if (this.f26129c != null) {
            this.f26129c.b();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: c */
    public boolean mo13177c() {
        return this.f26129c != null && this.f26129c.c();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: d */
    public void mo13175d() {
        if (this.f26129c != null) {
            this.f26129c.d();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: f */
    public void mo13174f() {
        if (this.f26129c != null) {
            this.f26129c.mo13174f();
        } else {
            abr.d("Interstitial ad must be loaded before showInterstitial().");
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: h */
    public void mo13173h() {
        if (this.f26129c != null) {
            this.f26129c.h();
        } else {
            abr.d("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: h_ */
    public void mo13172h_() {
        if (this.f26129c != null) {
            this.f26129c.h_();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    @Nullable
    /* renamed from: i */
    public AdSizeParcel mo13171i() {
        if (this.f26129c != null) {
            return this.f26129c.i();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    @Nullable
    /* renamed from: j */
    public String mo13170j() {
        if (this.f26129c != null) {
            return this.f26129c.j();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: k */
    public boolean mo13169k() {
        return this.f26129c != null && this.f26129c.k();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: l */
    public AbstractC3553c mo13168l() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: l_ */
    public void mo13167l_() {
        if (this.f26129c != null) {
            this.f26129c.l_();
        }
    }

    /* renamed from: m */
    void m13166m() {
        if (this.f26129c != null) {
            return;
        }
        this.f26129c = this.f26128b.m13249a(this.f26127a);
        this.f26130d.m13232a(this.f26129c);
        m13165n();
    }
}
