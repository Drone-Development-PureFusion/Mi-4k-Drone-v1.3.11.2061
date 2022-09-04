package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.C3589e;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.cache.CacheEntryParcel;
import com.google.android.gms.ads.internal.cache.CacheOffering;
import com.google.android.gms.ads.internal.client.AbstractC3501a;
import com.google.android.gms.ads.internal.overlay.AbstractC3659g;
import com.google.android.gms.ads.internal.overlay.AbstractC3670p;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.BinderC3649d;
import com.google.android.gms.ads.internal.overlay.C3657e;
import com.google.android.gms.ads.internal.safebrowsing.AbstractC3771c;
import com.google.android.gms.iid.C6095a;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.market.sdk.C10445j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
@aaa
/* loaded from: classes.dex */
public class acz extends WebViewClient {

    /* renamed from: c */
    private static final String[] f21170c = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", C6095a.f20616b, "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: d */
    private static final String[] f21171d = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: A */
    private boolean f21172A;

    /* renamed from: B */
    private boolean f21173B;

    /* renamed from: C */
    private boolean f21174C;

    /* renamed from: D */
    private int f21175D;

    /* renamed from: a */
    protected acy f21176a;
    @Nullable

    /* renamed from: b */
    protected AbstractC3771c f21177b;

    /* renamed from: e */
    private final HashMap<String, List<AbstractC7877vt>> f21178e;

    /* renamed from: f */
    private final Object f21179f;

    /* renamed from: g */
    private AbstractC3501a f21180g;

    /* renamed from: h */
    private AbstractC3659g f21181h;

    /* renamed from: i */
    private AbstractC6197a f21182i;

    /* renamed from: j */
    private AbstractC6198b f21183j;

    /* renamed from: k */
    private AbstractC7857vp f21184k;

    /* renamed from: l */
    private AbstractC6199c f21185l;

    /* renamed from: m */
    private boolean f21186m;

    /* renamed from: n */
    private AbstractC7885vv f21187n;

    /* renamed from: o */
    private AbstractC7887vx f21188o;

    /* renamed from: p */
    private boolean f21189p;

    /* renamed from: q */
    private boolean f21190q;

    /* renamed from: r */
    private ViewTreeObserver.OnGlobalLayoutListener f21191r;

    /* renamed from: s */
    private ViewTreeObserver.OnScrollChangedListener f21192s;

    /* renamed from: t */
    private boolean f21193t;

    /* renamed from: u */
    private AbstractC3670p f21194u;

    /* renamed from: v */
    private final C8062ym f21195v;

    /* renamed from: w */
    private C3589e f21196w;

    /* renamed from: x */
    private C8053yi f21197x;

    /* renamed from: y */
    private AbstractC8064yo f21198y;

    /* renamed from: z */
    private AbstractC6201e f21199z;

    /* renamed from: com.google.android.gms.internal.acz$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6197a {
        /* renamed from: a */
        void mo12714a(acy acyVar, boolean z);
    }

    /* renamed from: com.google.android.gms.internal.acz$b */
    /* loaded from: classes2.dex */
    public interface AbstractC6198b {
        /* renamed from: a */
        void mo12715a(acy acyVar);
    }

    /* renamed from: com.google.android.gms.internal.acz$c */
    /* loaded from: classes2.dex */
    public interface AbstractC6199c {
        /* renamed from: a */
        void mo18145a();
    }

    /* renamed from: com.google.android.gms.internal.acz$d */
    /* loaded from: classes2.dex */
    private static class C6200d implements AbstractC3659g {

        /* renamed from: a */
        private acy f21202a;

        /* renamed from: b */
        private AbstractC3659g f21203b;

        public C6200d(acy acyVar, AbstractC3659g abstractC3659g) {
            this.f21202a = acyVar;
            this.f21203b = abstractC3659g;
        }

        @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
        /* renamed from: g */
        public void mo12933g() {
        }

        @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
        /* renamed from: i_ */
        public void mo12932i_() {
            this.f21203b.mo12932i_();
            this.f21202a.mo18099c();
        }

        @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
        /* renamed from: j_ */
        public void mo12931j_() {
            this.f21203b.mo12931j_();
            this.f21202a.mo18095d();
        }

        @Override // com.google.android.gms.ads.internal.overlay.AbstractC3659g
        /* renamed from: k_ */
        public void mo12930k_() {
        }
    }

    /* renamed from: com.google.android.gms.internal.acz$e */
    /* loaded from: classes2.dex */
    public interface AbstractC6201e {
        /* renamed from: a */
        void mo18144a();
    }

    public acz(acy acyVar, boolean z) {
        this(acyVar, z, new C8062ym(acyVar, acyVar.mo18089g(), new C7774tx(acyVar.getContext())), null);
    }

    acz(acy acyVar, boolean z, C8062ym c8062ym, C8053yi c8053yi) {
        this.f21178e = new HashMap<>();
        this.f21179f = new Object();
        this.f21186m = false;
        this.f21176a = acyVar;
        this.f21189p = z;
        this.f21195v = c8062ym;
        this.f21197x = c8053yi;
    }

    /* renamed from: a */
    private String m18168a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() != null ? parse.getHost() : "";
    }

    /* renamed from: a */
    private void m18181a(Context context, String str, String str2, String str3) {
        if (!C7788uf.f25755aM.m13486c().booleanValue()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("err", str);
        bundle.putString(XiaomiOAuthConstants.EXTRA_CODE_2, str2);
        bundle.putString(C10445j.HOST, m18168a(str3));
        C3779u.m26890e().m18369a(context, this.f21176a.mo18081o().f14733b, "gmob-apps", bundle, true);
    }

    /* renamed from: b */
    private static boolean m18161b(Uri uri) {
        String scheme = uri.getScheme();
        return UriUtil.HTTP_SCHEME.equalsIgnoreCase(scheme) || UriUtil.HTTPS_SCHEME.equalsIgnoreCase(scheme);
    }

    /* renamed from: p */
    private void m18146p() {
        if (this.f21183j != null) {
            this.f21183j.mo12715a(this.f21176a);
            this.f21183j = null;
        }
    }

    /* renamed from: a */
    public C3589e m18184a() {
        return this.f21196w;
    }

    /* renamed from: a */
    public void m18183a(int i, int i2) {
        if (this.f21197x != null) {
            this.f21197x.m12914c(i, i2);
        }
    }

    /* renamed from: a */
    public void m18182a(int i, int i2, boolean z) {
        this.f21195v.m12894a(i, i2);
        if (this.f21197x != null) {
            this.f21197x.m12921a(i, i2, z);
        }
    }

    /* renamed from: a */
    public void m18180a(Uri uri) {
        String path = uri.getPath();
        List<AbstractC7877vt> list = this.f21178e.get(path);
        if (list == null) {
            String valueOf = String.valueOf(uri);
            abr.m18409e(new StringBuilder(String.valueOf(valueOf).length() + 32).append("No GMSG handler found for GMSG: ").append(valueOf).toString());
            return;
        }
        Map<String, String> m18363a = C3779u.m26890e().m18363a(uri);
        if (abr.a(2)) {
            String valueOf2 = String.valueOf(path);
            abr.m18409e(valueOf2.length() != 0 ? "Received GMSG: ".concat(valueOf2) : new String("Received GMSG: "));
            for (String str : m18363a.keySet()) {
                String str2 = m18363a.get(str);
                abr.m18409e(new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length()).append("  ").append(str).append(": ").append(str2).toString());
            }
        }
        for (AbstractC7877vt abstractC7877vt : list) {
            abstractC7877vt.mo12713a(this.f21176a, m18363a);
        }
    }

    /* renamed from: a */
    public final void m18179a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f21179f) {
            this.f21190q = true;
            this.f21176a.mo18140B();
            this.f21191r = onGlobalLayoutListener;
            this.f21192s = onScrollChangedListener;
        }
    }

    /* renamed from: a */
    public void m18178a(AbstractC3501a abstractC3501a, AbstractC3659g abstractC3659g, AbstractC7857vp abstractC7857vp, AbstractC3670p abstractC3670p, boolean z, AbstractC7885vv abstractC7885vv, @Nullable AbstractC7887vx abstractC7887vx, C3589e c3589e, AbstractC8064yo abstractC8064yo, @Nullable AbstractC3771c abstractC3771c) {
        if (c3589e == null) {
            c3589e = new C3589e(this.f21176a.getContext());
        }
        this.f21197x = new C8053yi(this.f21176a, abstractC8064yo);
        this.f21177b = abstractC3771c;
        m18167a("/appEvent", new C7856vo(abstractC7857vp));
        m18167a("/backButton", C7860vs.f25996l);
        m18167a("/refresh", C7860vs.f25997m);
        m18167a("/canOpenURLs", C7860vs.f25986b);
        m18167a("/canOpenIntents", C7860vs.f25987c);
        m18167a("/click", C7860vs.f25988d);
        m18167a("/close", C7860vs.f25989e);
        m18167a("/customClose", C7860vs.f25991g);
        m18167a("/instrument", C7860vs.f26001q);
        m18167a("/delayPageLoaded", C7860vs.f26003s);
        m18167a("/delayPageClosed", C7860vs.f26004t);
        m18167a("/getLocationInfo", C7860vs.f26005u);
        m18167a("/httpTrack", C7860vs.f25992h);
        m18167a("/log", C7860vs.f25993i);
        m18167a("/mraid", new C7891wa(c3589e, this.f21197x));
        m18167a("/mraidLoaded", this.f21195v);
        m18167a("/open", new C7892wb(abstractC7885vv, c3589e, this.f21197x));
        m18167a("/precache", C7860vs.f26000p);
        m18167a("/touch", C7860vs.f25995k);
        m18167a("/video", C7860vs.f25998n);
        m18167a("/videoMeta", C7860vs.f25999o);
        m18167a("/appStreaming", C7860vs.f25990f);
        if (abstractC7887vx != null) {
            m18167a("/setInterstitialProperties", new C7886vw(abstractC7887vx));
        }
        this.f21180g = abstractC3501a;
        this.f21181h = abstractC3659g;
        this.f21184k = abstractC7857vp;
        this.f21187n = abstractC7885vv;
        this.f21194u = abstractC3670p;
        this.f21196w = c3589e;
        this.f21198y = abstractC8064yo;
        this.f21188o = abstractC7887vx;
        m18166a(z);
    }

    /* renamed from: a */
    public final void m18177a(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel) {
        AbstractC3659g abstractC3659g = null;
        boolean mo18080p = this.f21176a.mo18080p();
        AbstractC3501a abstractC3501a = (!mo18080p || this.f21176a.mo18085k().f13867e) ? this.f21180g : null;
        if (!mo18080p) {
            abstractC3659g = this.f21181h;
        }
        m18176a(new AdOverlayInfoParcel(adLauncherIntentInfoParcel, abstractC3501a, abstractC3659g, this.f21194u, this.f21176a.mo18081o()));
    }

    /* renamed from: a */
    public void m18176a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean m12918b = this.f21197x != null ? this.f21197x.m12918b() : false;
        C3657e m26892c = C3779u.m26892c();
        Context context = this.f21176a.getContext();
        if (!m12918b) {
            z = true;
        }
        m26892c.m27214a(context, adOverlayInfoParcel, z);
        if (this.f21177b != null) {
            String str = adOverlayInfoParcel.f14265m;
            if (str == null && adOverlayInfoParcel.f14254b != null) {
                str = adOverlayInfoParcel.f14254b.f14246c;
            }
            this.f21177b.m26927a(str);
        }
    }

    /* renamed from: a */
    public void m18175a(acy acyVar) {
        this.f21176a = acyVar;
    }

    /* renamed from: a */
    public void m18174a(AbstractC6197a abstractC6197a) {
        this.f21182i = abstractC6197a;
    }

    /* renamed from: a */
    public void m18173a(AbstractC6198b abstractC6198b) {
        this.f21183j = abstractC6198b;
    }

    /* renamed from: a */
    public void m18172a(AbstractC6199c abstractC6199c) {
        this.f21185l = abstractC6199c;
    }

    /* renamed from: a */
    public void m18171a(AbstractC6201e abstractC6201e) {
        this.f21199z = abstractC6201e;
    }

    /* renamed from: a */
    public void m18167a(String str, AbstractC7877vt abstractC7877vt) {
        synchronized (this.f21179f) {
            List<AbstractC7877vt> list = this.f21178e.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.f21178e.put(str, list);
            }
            list.add(abstractC7877vt);
        }
    }

    /* renamed from: a */
    public void m18166a(boolean z) {
        this.f21186m = z;
    }

    /* renamed from: a */
    public final void m18165a(boolean z, int i) {
        m18176a(new AdOverlayInfoParcel((!this.f21176a.mo18080p() || this.f21176a.mo18085k().f13867e) ? this.f21180g : null, this.f21181h, this.f21194u, this.f21176a, z, i, this.f21176a.mo18081o()));
    }

    /* renamed from: a */
    public final void m18164a(boolean z, int i, String str) {
        C6200d c6200d = null;
        boolean mo18080p = this.f21176a.mo18080p();
        AbstractC3501a abstractC3501a = (!mo18080p || this.f21176a.mo18085k().f13867e) ? this.f21180g : null;
        if (!mo18080p) {
            c6200d = new C6200d(this.f21176a, this.f21181h);
        }
        m18176a(new AdOverlayInfoParcel(abstractC3501a, c6200d, this.f21184k, this.f21194u, this.f21176a, z, i, str, this.f21176a.mo18081o(), this.f21187n));
    }

    /* renamed from: a */
    public final void m18163a(boolean z, int i, String str, String str2) {
        boolean mo18080p = this.f21176a.mo18080p();
        m18176a(new AdOverlayInfoParcel((!mo18080p || this.f21176a.mo18085k().f13867e) ? this.f21180g : null, mo18080p ? null : new C6200d(this.f21176a, this.f21181h), this.f21184k, this.f21194u, this.f21176a, z, i, str, str2, this.f21176a.mo18081o(), this.f21187n));
    }

    /* renamed from: b */
    public void m18160b(String str, AbstractC7877vt abstractC7877vt) {
        synchronized (this.f21179f) {
            List<AbstractC7877vt> list = this.f21178e.get(str);
            if (list == null) {
                return;
            }
            list.remove(abstractC7877vt);
        }
    }

    /* renamed from: b */
    public boolean m18162b() {
        boolean z;
        synchronized (this.f21179f) {
            z = this.f21189p;
        }
        return z;
    }

    /* renamed from: c */
    public boolean m18159c() {
        boolean z;
        synchronized (this.f21179f) {
            z = this.f21190q;
        }
        return z;
    }

    /* renamed from: d */
    public ViewTreeObserver.OnGlobalLayoutListener m18158d() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f21179f) {
            onGlobalLayoutListener = this.f21191r;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public ViewTreeObserver.OnScrollChangedListener m18157e() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f21179f) {
            onScrollChangedListener = this.f21192s;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public boolean m18156f() {
        boolean z;
        synchronized (this.f21179f) {
            z = this.f21193t;
        }
        return z;
    }

    /* renamed from: g */
    public void m18155g() {
        synchronized (this.f21179f) {
            abr.m18409e("Loading blank page in WebView, 2...");
            this.f21172A = true;
            this.f21176a.mo18109a("about:blank");
        }
    }

    /* renamed from: h */
    public void m18154h() {
        if (this.f21177b != null) {
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.acz.1
                @Override // java.lang.Runnable
                public void run() {
                    if (acz.this.f21177b != null) {
                        acz.this.f21177b.m26928a(acz.this.f21176a.mo18105b());
                    }
                }
            });
        }
    }

    /* renamed from: i */
    public void m18153i() {
        synchronized (this.f21179f) {
            this.f21193t = true;
        }
        this.f21175D++;
        m18150l();
    }

    /* renamed from: j */
    public void m18152j() {
        this.f21175D--;
        m18150l();
    }

    /* renamed from: k */
    public void m18151k() {
        this.f21174C = true;
        m18150l();
    }

    /* renamed from: l */
    public final void m18150l() {
        if (this.f21182i != null && ((this.f21173B && this.f21175D <= 0) || this.f21174C)) {
            this.f21182i.mo12714a(this.f21176a, !this.f21174C);
            this.f21182i = null;
        }
        this.f21176a.mo18137E();
    }

    /* renamed from: m */
    public final void m18149m() {
        if (this.f21177b != null) {
            this.f21177b.m26929a();
            this.f21177b = null;
        }
        synchronized (this.f21179f) {
            this.f21178e.clear();
            this.f21180g = null;
            this.f21181h = null;
            this.f21182i = null;
            this.f21183j = null;
            this.f21184k = null;
            this.f21186m = false;
            this.f21189p = false;
            this.f21190q = false;
            this.f21193t = false;
            this.f21187n = null;
            this.f21194u = null;
            this.f21185l = null;
            if (this.f21197x != null) {
                this.f21197x.m12919a(true);
                this.f21197x = null;
            }
        }
    }

    /* renamed from: n */
    public AbstractC6201e m18148n() {
        return this.f21199z;
    }

    /* renamed from: o */
    public final void m18147o() {
        synchronized (this.f21179f) {
            this.f21186m = false;
            this.f21189p = true;
            C3779u.m26890e().m18348a(new Runnable() { // from class: com.google.android.gms.internal.acz.2
                @Override // java.lang.Runnable
                public void run() {
                    acz.this.f21176a.mo18140B();
                    BinderC3649d mo18087i = acz.this.f21176a.mo18087i();
                    if (mo18087i != null) {
                        mo18087i.m27223m();
                    }
                    if (acz.this.f21185l != null) {
                        acz.this.f21185l.mo18145a();
                        acz.this.f21185l = null;
                    }
                }
            });
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        abr.m18409e(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            return;
        }
        m18180a(parse);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f21179f) {
            if (this.f21172A) {
                abr.m18409e("Blank page loaded, 1...");
                this.f21176a.mo18077s();
                return;
            }
            this.f21173B = true;
            m18146p();
            m18150l();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        m18181a(this.f21176a.getContext(), "http_err", (i >= 0 || (-i) + (-1) >= f21170c.length) ? String.valueOf(i) : f21170c[(-i) - 1], str2);
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            m18181a(this.f21176a.getContext(), "ssl_err", (primaryError < 0 || primaryError >= f21171d.length) ? String.valueOf(primaryError) : f21171d[primaryError], C3779u.m26888g().mo18294a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        CacheEntryParcel m27662a;
        try {
            CacheOffering m27665a = CacheOffering.m27665a(str);
            if (m27665a != null && (m27662a = C3779u.m26885j().m27662a(m27665a)) != null && m27662a.m27669a()) {
                return new WebResourceResponse("", "", m27662a.m27668b());
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 79:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 222:
                return true;
            default:
                return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        String valueOf = String.valueOf(str);
        abr.m18409e(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m18180a(parse);
        } else if (this.f21186m && webView == this.f21176a.mo18122a() && m18161b(parse)) {
            if (this.f21180g != null && C7788uf.f25772ad.m13486c().booleanValue()) {
                this.f21180g.mo27632e();
                if (this.f21177b != null) {
                    this.f21177b.m26927a(str);
                }
                this.f21180g = null;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        } else if (!this.f21176a.mo18122a().willNotDraw()) {
            try {
                C7667ro mo18082n = this.f21176a.mo18082n();
                if (mo18082n != null && mo18082n.m13781c(parse)) {
                    parse = mo18082n.m13790a(parse, this.f21176a.getContext(), this.f21176a.mo18105b());
                }
                uri = parse;
            } catch (C7668rp e) {
                String valueOf2 = String.valueOf(str);
                abr.d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                uri = parse;
            }
            if (this.f21196w == null || this.f21196w.m27402b()) {
                m18177a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.f21196w.m27403a(str);
            }
        } else {
            String valueOf3 = String.valueOf(str);
            abr.d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }
}
