package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.fimi.soul.biz.camera.C1831e;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C3559e;
import com.google.android.gms.ads.mediation.AbstractC3792b;
import com.google.android.gms.ads.mediation.AbstractC3816m;
import com.google.android.gms.ads.mediation.customevent.AbstractC3798a;
import com.google.android.gms.ads.search.C3825b;
/* renamed from: com.google.android.gms.ads.search.a */
/* loaded from: classes.dex */
public final class C3822a {

    /* renamed from: a */
    private final C3825b f14833a;

    /* renamed from: com.google.android.gms.ads.search.a$a */
    /* loaded from: classes.dex */
    public static final class C3824a {

        /* renamed from: a */
        private final C3825b.C3827a f14834a = new C3825b.C3827a();

        /* renamed from: b */
        private final Bundle f14835b = new Bundle();

        /* renamed from: a */
        public C3824a m26737a(int i) {
            this.f14835b.putString("csa_adPage", Integer.toString(i));
            return this;
        }

        /* renamed from: a */
        public C3824a m26736a(AbstractC3816m abstractC3816m) {
            this.f14834a.m26668a(abstractC3816m);
            return this;
        }

        /* renamed from: a */
        public C3824a m26734a(Class<? extends AbstractC3792b> cls, Bundle bundle) {
            this.f14834a.m26666a(cls, bundle);
            return this;
        }

        /* renamed from: a */
        public C3824a m26733a(String str) {
            this.f14835b.putString("csa_channel", str);
            return this;
        }

        /* renamed from: a */
        public C3824a m26732a(String str, String str2) {
            this.f14835b.putString(str, str2);
            return this;
        }

        /* renamed from: a */
        public C3824a m26731a(boolean z) {
            this.f14835b.putString("csa_adtest", z ? C1831e.f4911cE : "off");
            return this;
        }

        /* renamed from: a */
        public C3822a m26738a() {
            this.f14834a.m26666a(AdMobAdapter.class, this.f14835b);
            return new C3822a(this);
        }

        /* renamed from: b */
        public C3824a m26730b(int i) {
            this.f14835b.putString("csa_number", Integer.toString(i));
            return this;
        }

        /* renamed from: b */
        public C3824a m26729b(Class<? extends AbstractC3798a> cls, Bundle bundle) {
            this.f14834a.m26661b(cls, bundle);
            return this;
        }

        /* renamed from: b */
        public C3824a m26728b(String str) {
            this.f14835b.putString("csa_hl", str);
            return this;
        }

        /* renamed from: b */
        public C3824a m26727b(boolean z) {
            this.f14835b.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        /* renamed from: c */
        public C3824a m26726c(int i) {
            this.f14835b.putString("csa_fontSizeLocation", Integer.toString(i));
            return this;
        }

        /* renamed from: c */
        public C3824a m26725c(String str) {
            this.f14835b.putString("csa_colorLocation", str);
            return this;
        }

        /* renamed from: c */
        public C3824a m26724c(boolean z) {
            this.f14835b.putString("csa_location", Boolean.toString(z));
            return this;
        }

        /* renamed from: d */
        public C3824a m26723d(int i) {
            this.f14835b.putString("csa_width", Integer.toString(i));
            return this;
        }

        /* renamed from: d */
        public C3824a m26722d(String str) {
            this.f14835b.putString("csa_fontFamily", str);
            return this;
        }

        /* renamed from: d */
        public C3824a m26721d(boolean z) {
            this.f14835b.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public C3824a m26720e(int i) {
            return m26722d(Integer.toString(i));
        }

        /* renamed from: e */
        public C3824a m26719e(String str) {
            this.f14835b.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        /* renamed from: e */
        public C3824a m26718e(boolean z) {
            this.f14835b.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        /* renamed from: f */
        public C3824a m26717f(int i) {
            this.f14835b.putString("csa_fontSizeAnnotation", Integer.toString(i));
            return this;
        }

        /* renamed from: f */
        public C3824a m26716f(String str) {
            this.f14835b.putString("csa_colorAdBorder", str);
            return this;
        }

        /* renamed from: f */
        public C3824a m26715f(boolean z) {
            this.f14835b.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        /* renamed from: g */
        public C3824a m26714g(int i) {
            this.f14835b.putString("csa_fontSizeAttribution", Integer.toString(i));
            return this;
        }

        /* renamed from: g */
        public C3824a m26713g(String str) {
            this.f14835b.putString("csa_colorAdSeparator", str);
            return this;
        }

        /* renamed from: g */
        public C3824a m26712g(boolean z) {
            this.f14835b.putString("csa_noTitleUnderline", Boolean.toString(!z));
            return this;
        }

        /* renamed from: h */
        public C3824a m26711h(int i) {
            this.f14835b.putString("csa_fontSizeDescription", Integer.toString(i));
            return this;
        }

        /* renamed from: h */
        public C3824a m26710h(String str) {
            this.f14835b.putString("csa_colorAnnotation", str);
            return this;
        }

        /* renamed from: h */
        public C3824a m26709h(boolean z) {
            this.f14835b.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        /* renamed from: i */
        public C3824a m26708i(int i) {
            this.f14835b.putString("csa_fontSizeDomainLink", Integer.toString(i));
            return this;
        }

        /* renamed from: i */
        public C3824a m26707i(String str) {
            this.f14835b.putString("csa_colorAttribution", str);
            return this;
        }

        /* renamed from: i */
        public C3824a m26706i(boolean z) {
            this.f14835b.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        /* renamed from: j */
        public C3824a m26705j(int i) {
            this.f14835b.putString("csa_fontSizeTitle", Integer.toString(i));
            return this;
        }

        /* renamed from: j */
        public C3824a m26704j(String str) {
            this.f14835b.putString("csa_colorBackground", str);
            return this;
        }

        /* renamed from: j */
        public C3824a m26703j(boolean z) {
            this.f14835b.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        /* renamed from: k */
        public C3824a m26702k(int i) {
            this.f14835b.putString("csa_adjustableLineHeight", Integer.toString(i));
            return this;
        }

        /* renamed from: k */
        public C3824a m26701k(String str) {
            this.f14835b.putString("csa_colorBorder", str);
            return this;
        }

        /* renamed from: l */
        public C3824a m26700l(int i) {
            this.f14835b.putString("csa_attributionSpacingBelow", Integer.toString(i));
            return this;
        }

        /* renamed from: l */
        public C3824a m26699l(String str) {
            this.f14835b.putString("csa_colorDomainLink", str);
            return this;
        }

        /* renamed from: m */
        public C3824a m26698m(int i) {
            this.f14835b.putString("csa_verticalSpacing", Integer.toString(i));
            return this;
        }

        /* renamed from: m */
        public C3824a m26697m(String str) {
            this.f14835b.putString("csa_colorText", str);
            return this;
        }

        /* renamed from: n */
        public C3824a m26696n(String str) {
            this.f14835b.putString("csa_colorTitleLink", str);
            return this;
        }

        /* renamed from: o */
        public C3824a m26695o(String str) {
            this.f14835b.putString("csa_adBorderSelectors", str);
            return this;
        }

        /* renamed from: p */
        public C3824a m26694p(String str) {
            this.f14835b.putString("csa_borderSelections", str);
            return this;
        }

        /* renamed from: q */
        public C3824a m26693q(String str) {
            this.f14834a.m26654d(str);
            return this;
        }
    }

    private C3822a(C3824a c3824a) {
        this.f14833a = c3824a.f14834a.m26672a();
    }

    @Deprecated
    /* renamed from: a */
    public <T extends AbstractC3816m> T m26742a(Class<T> cls) {
        return (T) this.f14833a.m26690a(cls);
    }

    /* renamed from: a */
    public String m26744a() {
        return this.f14833a.m26674o();
    }

    /* renamed from: a */
    public boolean m26743a(Context context) {
        return this.f14833a.m26691a(context);
    }

    /* renamed from: b */
    public <T extends AbstractC3792b> Bundle m26740b(Class<T> cls) {
        return this.f14833a.m26688b(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C3559e m26741b() {
        return this.f14833a.m26673p();
    }

    /* renamed from: c */
    public <T extends AbstractC3798a> Bundle m26739c(Class<T> cls) {
        return this.f14833a.m26686c(cls);
    }
}
