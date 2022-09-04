package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.p004v7.media.MediaRouteProviderProtocol;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.AbstractC3768s;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.formats.AbstractC3601g;
import com.google.android.gms.ads.internal.overlay.BinderC3649d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.drive.AbstractC4808e;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
@aaa
/* loaded from: classes.dex */
public class adc extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, acy {

    /* renamed from: A */
    private C7799ul f21207A;

    /* renamed from: B */
    private C7800um f21208B;

    /* renamed from: C */
    private WeakReference<View.OnClickListener> f21209C;

    /* renamed from: D */
    private BinderC3649d f21210D;

    /* renamed from: E */
    private ack f21211E;

    /* renamed from: J */
    private Map<String, AbstractC7903wi> f21216J;

    /* renamed from: b */
    private final C6205a f21219b;
    @Nullable

    /* renamed from: d */
    private final C7667ro f21221d;

    /* renamed from: e */
    private final VersionInfoParcel f21222e;

    /* renamed from: f */
    private final AbstractC3768s f21223f;

    /* renamed from: g */
    private final C3588d f21224g;

    /* renamed from: h */
    private acz f21225h;

    /* renamed from: i */
    private BinderC3649d f21226i;

    /* renamed from: j */
    private AdSizeParcel f21227j;

    /* renamed from: k */
    private boolean f21228k;

    /* renamed from: l */
    private boolean f21229l;

    /* renamed from: m */
    private boolean f21230m;

    /* renamed from: n */
    private boolean f21231n;

    /* renamed from: o */
    private Boolean f21232o;

    /* renamed from: s */
    private add f21236s;

    /* renamed from: t */
    private boolean f21237t;

    /* renamed from: u */
    private boolean f21238u;

    /* renamed from: v */
    private AbstractC3601g f21239v;

    /* renamed from: w */
    private int f21240w;

    /* renamed from: x */
    private int f21241x;

    /* renamed from: y */
    private C7799ul f21242y;

    /* renamed from: z */
    private C7799ul f21243z;

    /* renamed from: c */
    private final Object f21220c = new Object();

    /* renamed from: q */
    private boolean f21234q = true;

    /* renamed from: a */
    boolean f21218a = false;

    /* renamed from: r */
    private String f21235r = "";

    /* renamed from: F */
    private int f21212F = -1;

    /* renamed from: G */
    private int f21213G = -1;

    /* renamed from: H */
    private int f21214H = -1;

    /* renamed from: I */
    private int f21215I = -1;

    /* renamed from: p */
    private int f21233p = -1;

    /* renamed from: K */
    private final WindowManager f21217K = (WindowManager) getContext().getSystemService("window");

    @aaa
    /* renamed from: com.google.android.gms.internal.adc$a */
    /* loaded from: classes.dex */
    public static class C6205a extends MutableContextWrapper {

        /* renamed from: a */
        private Activity f21246a;

        /* renamed from: b */
        private Context f21247b;

        /* renamed from: c */
        private Context f21248c;

        public C6205a(Context context) {
            super(context);
            setBaseContext(context);
        }

        /* renamed from: a */
        public Activity m18069a() {
            return this.f21246a;
        }

        /* renamed from: b */
        public Context m18068b() {
            return this.f21248c;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return this.f21248c.getSystemService(str);
        }

        @Override // android.content.MutableContextWrapper
        public void setBaseContext(Context context) {
            this.f21247b = context.getApplicationContext();
            this.f21246a = context instanceof Activity ? (Activity) context : null;
            this.f21248c = context;
            super.setBaseContext(this.f21247b);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public void startActivity(Intent intent) {
            if (this.f21246a != null) {
                this.f21246a.startActivity(intent);
                return;
            }
            intent.setFlags(AbstractC4808e.f17570a_);
            this.f21247b.startActivity(intent);
        }
    }

    protected adc(C6205a c6205a, AdSizeParcel adSizeParcel, boolean z, boolean z2, @Nullable C7667ro c7667ro, VersionInfoParcel versionInfoParcel, C7801un c7801un, AbstractC3768s abstractC3768s, C3588d c3588d) {
        super(c6205a);
        this.f21219b = c6205a;
        this.f21227j = adSizeParcel;
        this.f21230m = z;
        this.f21221d = c7667ro;
        this.f21222e = versionInfoParcel;
        this.f21223f = abstractC3768s;
        this.f21224g = c3588d;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        C3779u.m26890e().m18371a(c6205a, versionInfoParcel.f14733b, settings);
        C3779u.m26888g().mo18288a(getContext(), settings);
        setDownloadListener(this);
        m18127O();
        if (C4696s.m23108f()) {
            addJavascriptInterface(new ade(this), "googleAdsJsInterface");
        }
        if (C4696s.m23114a()) {
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        this.f21211E = new ack(this.f21219b.m18069a(), this, this, null);
        m18111a(c7801un);
    }

    /* renamed from: L */
    private void m18130L() {
        synchronized (this.f21220c) {
            this.f21232o = C3779u.m26886i().m18437j();
            if (this.f21232o == null) {
                try {
                    evaluateJavascript("(function(){})()", null);
                    m18110a((Boolean) true);
                } catch (IllegalStateException e) {
                    m18110a((Boolean) false);
                }
            }
        }
    }

    /* renamed from: M */
    private void m18129M() {
        C7794uj.m13449a(this.f21208B.m13442a(), this.f21243z, "aeh2");
    }

    /* renamed from: N */
    private void m18128N() {
        C7794uj.m13449a(this.f21208B.m13442a(), this.f21243z, "aebb2");
    }

    /* renamed from: O */
    private void m18127O() {
        synchronized (this.f21220c) {
            if (this.f21230m || this.f21227j.f13867e) {
                if (Build.VERSION.SDK_INT < 14) {
                    abr.a("Disabling hardware acceleration on an overlay.");
                    m18126P();
                } else {
                    abr.a("Enabling hardware acceleration on an overlay.");
                    m18125Q();
                }
            } else if (Build.VERSION.SDK_INT < 18) {
                abr.a("Disabling hardware acceleration on an AdView.");
                m18126P();
            } else {
                abr.a("Enabling hardware acceleration on an AdView.");
                m18125Q();
            }
        }
    }

    /* renamed from: P */
    private void m18126P() {
        synchronized (this.f21220c) {
            if (!this.f21231n) {
                C3779u.m26888g().mo18296c((View) this);
            }
            this.f21231n = true;
        }
    }

    /* renamed from: Q */
    private void m18125Q() {
        synchronized (this.f21220c) {
            if (this.f21231n) {
                C3779u.m26888g().mo18297b((View) this);
            }
            this.f21231n = false;
        }
    }

    /* renamed from: R */
    private void m18124R() {
        synchronized (this.f21220c) {
            this.f21216J = null;
        }
    }

    /* renamed from: S */
    private void m18123S() {
        C7801un m13442a;
        if (this.f21208B == null || (m13442a = this.f21208B.m13442a()) == null || C3779u.m26886i().m18442e() == null) {
            return;
        }
        C3779u.m26886i().m18442e().m13460a(m13442a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static adc m18118a(Context context, AdSizeParcel adSizeParcel, boolean z, boolean z2, @Nullable C7667ro c7667ro, VersionInfoParcel versionInfoParcel, C7801un c7801un, AbstractC3768s abstractC3768s, C3588d c3588d) {
        return new adc(new C6205a(context), adSizeParcel, z, z2, c7667ro, versionInfoParcel, c7801un, abstractC3768s, c3588d);
    }

    /* renamed from: a */
    private void m18111a(C7801un c7801un) {
        m18123S();
        this.f21208B = new C7800um(new C7801un(true, "make_wv", this.f21227j.f13864b));
        this.f21208B.m13442a().m13435a(c7801un);
        this.f21243z = C7794uj.m13452a(this.f21208B.m13442a());
        this.f21208B.m13441a("native:view_create", this.f21243z);
        this.f21207A = null;
        this.f21242y = null;
    }

    /* renamed from: e */
    private void m18091e(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        mo18107a("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: A */
    public boolean mo18141A() {
        boolean z;
        synchronized (this.f21220c) {
            z = this.f21240w > 0;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: B */
    public void mo18140B() {
        this.f21211E.m18218a();
    }

    @Override // com.google.android.gms.ads.internal.AbstractC3768s
    /* renamed from: C */
    public void mo18139C() {
        synchronized (this.f21220c) {
            this.f21218a = true;
            if (this.f21223f != null) {
                this.f21223f.mo18139C();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.AbstractC3768s
    /* renamed from: D */
    public void mo18138D() {
        synchronized (this.f21220c) {
            this.f21218a = false;
            if (this.f21223f != null) {
                this.f21223f.mo18138D();
            }
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: E */
    public void mo18137E() {
        if (this.f21207A == null) {
            this.f21207A = C7794uj.m13452a(this.f21208B.m13442a());
            this.f21208B.m13441a("native:view_load", this.f21207A);
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: F */
    public View.OnClickListener mo18136F() {
        return this.f21209C.get();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: G */
    public AbstractC3601g mo18135G() {
        AbstractC3601g abstractC3601g;
        synchronized (this.f21220c) {
            abstractC3601g = this.f21239v;
        }
        return abstractC3601g;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: H */
    public void mo18134H() {
        setBackgroundColor(0);
    }

    /* renamed from: I */
    public boolean m18133I() {
        int i;
        int i2;
        if (mo18084l().m18162b() || mo18084l().m18159c()) {
            DisplayMetrics m18355a = C3779u.m26890e().m18355a(this.f21217K);
            int m26851b = C3514ac.m27586a().m26851b(m18355a, m18355a.widthPixels);
            int m26851b2 = C3514ac.m27586a().m26851b(m18355a, m18355a.heightPixels);
            Activity mo18090f = mo18090f();
            if (mo18090f == null || mo18090f.getWindow() == null) {
                i = m26851b2;
                i2 = m26851b;
            } else {
                int[] m18383a = C3779u.m26890e().m18383a(mo18090f);
                i2 = C3514ac.m27586a().m26851b(m18355a, m18383a[0]);
                i = C3514ac.m27586a().m26851b(m18355a, m18383a[1]);
            }
            if (this.f21213G == m26851b && this.f21212F == m26851b2 && this.f21214H == i2 && this.f21215I == i) {
                return false;
            }
            boolean z = (this.f21213G == m26851b && this.f21212F == m26851b2) ? false : true;
            this.f21213G = m26851b;
            this.f21212F = m26851b2;
            this.f21214H = i2;
            this.f21215I = i;
            new C8063yn(this).m12884a(m26851b, m26851b2, i2, i, m18355a.density, this.f21217K.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    /* renamed from: J */
    Boolean m18132J() {
        Boolean bool;
        synchronized (this.f21220c) {
            bool = this.f21232o;
        }
        return bool;
    }

    /* renamed from: K */
    AbstractC7877vt m18131K() {
        return new AbstractC7877vt() { // from class: com.google.android.gms.internal.adc.1
            @Override // com.google.android.gms.internal.AbstractC7877vt
            /* renamed from: a */
            public void mo12713a(acy acyVar, Map<String, String> map) {
                if (map != null) {
                    String str = map.get(FimiMediaMeta.IJKM_KEY_HEIGHT);
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(str);
                        synchronized (adc.this.f21220c) {
                            if (adc.this.f21241x != parseInt) {
                                adc.this.f21241x = parseInt;
                                adc.this.requestLayout();
                            }
                        }
                    } catch (Exception e) {
                        abr.d("Exception occurred while getting webview content height", e);
                    }
                }
            }
        };
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public WebView mo18122a() {
        return this;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18121a(int i) {
        if (i == 0) {
            m18128N();
        }
        m18129M();
        if (this.f21208B.m13442a() != null) {
            this.f21208B.m13442a().m13433a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f21222e.f14733b);
        mo18107a("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18120a(Context context) {
        this.f21219b.setBaseContext(context);
        this.f21211E.m18217a(this.f21219b.m18069a());
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18119a(Context context, AdSizeParcel adSizeParcel, C7801un c7801un) {
        synchronized (this.f21220c) {
            this.f21211E.m18216b();
            mo18120a(context);
            this.f21226i = null;
            this.f21227j = adSizeParcel;
            this.f21230m = false;
            this.f21228k = false;
            this.f21235r = "";
            this.f21233p = -1;
            C3779u.m26888g().m18303b((acy) this);
            loadUrl("about:blank");
            this.f21225h.m18149m();
            setOnTouchListener(null);
            setOnClickListener(null);
            this.f21234q = true;
            this.f21218a = false;
            this.f21236s = null;
            m18111a(c7801un);
            this.f21237t = false;
            this.f21240w = 0;
            C3779u.m26898B().m13270a(this);
            m18124R();
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18117a(AdSizeParcel adSizeParcel) {
        synchronized (this.f21220c) {
            this.f21227j = adSizeParcel;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18116a(AbstractC3601g abstractC3601g) {
        synchronized (this.f21220c) {
            this.f21239v = abstractC3601g;
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18115a(BinderC3649d binderC3649d) {
        synchronized (this.f21220c) {
            this.f21226i = binderC3649d;
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18112a(add addVar) {
        synchronized (this.f21220c) {
            if (this.f21236s != null) {
                abr.b("Attempt to create multiple AdWebViewVideoControllers.");
            } else {
                this.f21236s = addVar;
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7741tg
    /* renamed from: a */
    public void mo13608a(AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf, boolean z) {
        synchronized (this.f21220c) {
            this.f21237t = z;
        }
        m18091e(z);
    }

    /* renamed from: a */
    void m18110a(Boolean bool) {
        synchronized (this.f21220c) {
            this.f21232o = bool;
        }
        C3779u.m26886i().m18455a(bool);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18109a(String str) {
        synchronized (this.f21220c) {
            super.loadUrl(str);
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    protected void m18108a(String str, ValueCallback<String> valueCallback) {
        synchronized (this.f21220c) {
            if (!mo18078r()) {
                evaluateJavascript(str, valueCallback);
            } else {
                abr.d("The webview is destroyed. Ignoring action.");
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13113a(String str, AbstractC7877vt abstractC7877vt) {
        if (this.f21225h != null) {
            this.f21225h.m18167a(str, abstractC7877vt);
        }
    }

    @Override // com.google.android.gms.internal.acy, com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13112a(String str, String str2) {
        m18094d(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()).append(str).append("(").append(str2).append(");").toString());
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18107a(String str, Map<String, ?> map) {
        try {
            mo13109b(str, C3779u.m26890e().m18343a(map));
        } catch (JSONException e) {
            abr.d("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.acy, com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13111a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        mo13112a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18106a(boolean z) {
        synchronized (this.f21220c) {
            this.f21230m = z;
            m18127O();
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: b */
    public View mo18105b() {
        return this;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: b */
    public void mo18104b(int i) {
        synchronized (this.f21220c) {
            this.f21233p = i;
            if (this.f21226i != null) {
                this.f21226i.m27232a(this.f21233p);
            }
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: b */
    public void mo18103b(BinderC3649d binderC3649d) {
        synchronized (this.f21220c) {
            this.f21210D = binderC3649d;
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: b */
    public void mo18101b(String str) {
        synchronized (this.f21220c) {
            if (str == null) {
                str = "";
            }
            this.f21235r = str;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: b */
    public void mo13110b(String str, AbstractC7877vt abstractC7877vt) {
        if (this.f21225h != null) {
            this.f21225h.m18160b(str, abstractC7877vt);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: b */
    public void mo13109b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        abr.a(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        m18094d(sb.toString());
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: b */
    public void mo18100b(boolean z) {
        synchronized (this.f21220c) {
            if (this.f21226i != null) {
                this.f21226i.m27227a(this.f21225h.m18162b(), z);
            } else {
                this.f21228k = z;
            }
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: c */
    public void mo18099c() {
        m18129M();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f21222e.f14733b);
        mo18107a("onhide", hashMap);
    }

    /* renamed from: c */
    protected void m18097c(String str) {
        synchronized (this.f21220c) {
            if (!mo18078r()) {
                loadUrl(str);
            } else {
                abr.d("The webview is destroyed. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: c */
    public void mo18096c(boolean z) {
        synchronized (this.f21220c) {
            this.f21234q = z;
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: d */
    public void mo18095d() {
        if (this.f21242y == null) {
            C7794uj.m13449a(this.f21208B.m13442a(), this.f21243z, "aes2");
            this.f21242y = C7794uj.m13452a(this.f21208B.m13442a());
            this.f21208B.m13441a("native:view_show", this.f21242y);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f21222e.f14733b);
        mo18107a("onshow", hashMap);
    }

    /* renamed from: d */
    protected void m18094d(String str) {
        if (!C4696s.m23106h()) {
            String valueOf = String.valueOf(str);
            m18097c(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        if (m18132J() == null) {
            m18130L();
        }
        if (m18132J().booleanValue()) {
            m18108a(str, (ValueCallback<String>) null);
            return;
        }
        String valueOf2 = String.valueOf(str);
        m18097c(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: d */
    public void mo18093d(boolean z) {
        synchronized (this.f21220c) {
            this.f21240w = (z ? 1 : -1) + this.f21240w;
            if (this.f21240w <= 0 && this.f21226i != null) {
                this.f21226i.m27217s();
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.acy
    public void destroy() {
        synchronized (this.f21220c) {
            m18123S();
            this.f21211E.m18216b();
            if (this.f21226i != null) {
                this.f21226i.m27233a();
                this.f21226i.mo12863k();
                this.f21226i = null;
            }
            this.f21225h.m18149m();
            if (this.f21229l) {
                return;
            }
            C3779u.m26898B().m13270a(this);
            m18124R();
            this.f21229l = true;
            abr.m18409e("Initiating WebView self destruct sequence in 3...");
            this.f21225h.m18155g();
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: e */
    public void mo18092e() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C3779u.m26890e().m18314h()));
        hashMap.put("app_volume", String.valueOf(C3779u.m26890e().m18316g()));
        hashMap.put("device_volume", String.valueOf(C3779u.m26890e().m18310j(getContext())));
        mo18107a(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, hashMap);
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        synchronized (this.f21220c) {
            if (!mo18078r()) {
                super.evaluateJavascript(str, valueCallback);
                return;
            }
            abr.d("The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: f */
    public Activity mo18090f() {
        return this.f21219b.m18069a();
    }

    protected void finalize() {
        synchronized (this.f21220c) {
            if (!this.f21229l) {
                this.f21225h.m18149m();
                C3779u.m26898B().m13270a(this);
                m18124R();
            }
        }
        super.finalize();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: g */
    public Context mo18089g() {
        return this.f21219b.m18068b();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: h */
    public C3588d mo18088h() {
        return this.f21224g;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: i */
    public BinderC3649d mo18087i() {
        BinderC3649d binderC3649d;
        synchronized (this.f21220c) {
            binderC3649d = this.f21226i;
        }
        return binderC3649d;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: j */
    public BinderC3649d mo18086j() {
        BinderC3649d binderC3649d;
        synchronized (this.f21220c) {
            binderC3649d = this.f21210D;
        }
        return binderC3649d;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: k */
    public AdSizeParcel mo18085k() {
        AdSizeParcel adSizeParcel;
        synchronized (this.f21220c) {
            adSizeParcel = this.f21227j;
        }
        return adSizeParcel;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: l */
    public acz mo18084l() {
        return this.f21225h;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.acy
    public void loadData(String str, String str2, String str3) {
        synchronized (this.f21220c) {
            if (!mo18078r()) {
                super.loadData(str, str2, str3);
            } else {
                abr.d("The webview is destroyed. Ignoring action.");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.acy
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.f21220c) {
            if (!mo18078r()) {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            } else {
                abr.d("The webview is destroyed. Ignoring action.");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.acy
    public void loadUrl(String str) {
        synchronized (this.f21220c) {
            if (!mo18078r()) {
                super.loadUrl(str);
            } else {
                abr.d("The webview is destroyed. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: m */
    public boolean mo18083m() {
        boolean z;
        synchronized (this.f21220c) {
            z = this.f21228k;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: n */
    public C7667ro mo18082n() {
        return this.f21221d;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: o */
    public VersionInfoParcel mo18081o() {
        return this.f21222e;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        boolean z = true;
        synchronized (this.f21220c) {
            super.onAttachedToWindow();
            if (!mo18078r()) {
                this.f21211E.m18215c();
            }
            boolean z2 = this.f21237t;
            if (mo18084l() == null || !mo18084l().m18159c()) {
                z = z2;
            } else if (!this.f21238u) {
                ViewTreeObserver.OnGlobalLayoutListener m18158d = mo18084l().m18158d();
                if (m18158d != null) {
                    C3779u.m26897C().m18196a(mo18105b(), m18158d);
                }
                ViewTreeObserver.OnScrollChangedListener m18157e = mo18084l().m18157e();
                if (m18157e != null) {
                    C3779u.m26897C().m18195a(mo18105b(), m18157e);
                }
                this.f21238u = true;
            }
            m18091e(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        synchronized (this.f21220c) {
            if (!mo18078r()) {
                this.f21211E.m18214d();
            }
            super.onDetachedFromWindow();
            if (this.f21238u && mo18084l() != null && mo18084l().m18159c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener m18158d = mo18084l().m18158d();
                if (m18158d != null) {
                    C3779u.m26888g().mo18286a(getViewTreeObserver(), m18158d);
                }
                ViewTreeObserver.OnScrollChangedListener m18157e = mo18084l().m18157e();
                if (m18157e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(m18157e);
                }
                this.f21238u = false;
            }
        }
        m18091e(false);
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            C3779u.m26890e().m18377a(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            abr.a(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()).append("Couldn't find an Activity to view url/mimetype: ").append(str).append(" / ").append(str4).toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        if (mo18078r()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
        if (mo18084l() == null || mo18084l().m18148n() == null) {
            return;
        }
        mo18084l().m18148n().mo18144a();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (C7788uf.f25779ak.m13486c().booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if ((motionEvent.getActionMasked() == 8) && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        boolean m18133I = m18133I();
        BinderC3649d mo18087i = mo18087i();
        if (mo18087i == null || !m18133I) {
            return;
        }
        mo18087i.m27220p();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onMeasure(int i, int i2) {
        int size;
        int i3 = Integer.MAX_VALUE;
        synchronized (this.f21220c) {
            if (mo18078r()) {
                setMeasuredDimension(0, 0);
            } else if (isInEditMode() || this.f21230m || this.f21227j.f13871i) {
                super.onMeasure(i, i2);
            } else if (this.f21227j.f13872j) {
                if (C7788uf.f25814bS.m13486c().booleanValue() || !C4696s.m23108f()) {
                    super.onMeasure(i, i2);
                    return;
                }
                mo13113a("/contentHeight", m18131K());
                m18094d("(function() {  var height = -1;  if (document.body) { height = document.body.offsetHeight;}  else if (document.documentElement) {      height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  window.googleAdsJsInterface.notify(url);  })();");
                float f = this.f21219b.getResources().getDisplayMetrics().density;
                int size2 = View.MeasureSpec.getSize(i);
                switch (this.f21241x) {
                    case -1:
                        size = View.MeasureSpec.getSize(i2);
                        break;
                    default:
                        size = (int) (f * this.f21241x);
                        break;
                }
                setMeasuredDimension(size2, size);
            } else if (this.f21227j.f13867e) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.f21217K.getDefaultDisplay().getMetrics(displayMetrics);
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                int mode = View.MeasureSpec.getMode(i);
                int size3 = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size4 = View.MeasureSpec.getSize(i2);
                int i4 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size3 : Integer.MAX_VALUE;
                if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                    i3 = size4;
                }
                if (this.f21227j.f13869g > i4 || this.f21227j.f13866d > i3) {
                    float f2 = this.f21219b.getResources().getDisplayMetrics().density;
                    abr.d(new StringBuilder(103).append("Not enough space to show ad. Needs ").append((int) (this.f21227j.f13869g / f2)).append("x").append((int) (this.f21227j.f13866d / f2)).append(" dp, but only has ").append((int) (size3 / f2)).append("x").append((int) (size4 / f2)).append(" dp.").toString());
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                } else {
                    if (getVisibility() != 8) {
                        setVisibility(0);
                    }
                    setMeasuredDimension(this.f21227j.f13869g, this.f21227j.f13866d);
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.acy
    public void onPause() {
        if (mo18078r()) {
            return;
        }
        try {
            if (!C4696s.m23114a()) {
                return;
            }
            super.onPause();
        } catch (Exception e) {
            abr.b("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.acy
    public void onResume() {
        if (mo18078r()) {
            return;
        }
        try {
            if (!C4696s.m23114a()) {
                return;
            }
            super.onResume();
        } catch (Exception e) {
            abr.b("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (mo18084l().m18159c()) {
            synchronized (this.f21220c) {
                if (this.f21239v != null) {
                    this.f21239v.mo27343a(motionEvent);
                }
            }
        } else if (this.f21221d != null) {
            this.f21221d.m13787a(motionEvent);
        }
        if (mo18078r()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: p */
    public boolean mo18080p() {
        boolean z;
        synchronized (this.f21220c) {
            z = this.f21230m;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: q */
    public int mo18079q() {
        int i;
        synchronized (this.f21220c) {
            i = this.f21233p;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: r */
    public boolean mo18078r() {
        boolean z;
        synchronized (this.f21220c) {
            z = this.f21229l;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: s */
    public void mo18077s() {
        synchronized (this.f21220c) {
            abr.m18409e("Destroying WebView!");
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.adc.2
                @Override // java.lang.Runnable
                public void run() {
                    adc.super.destroy();
                }
            });
        }
    }

    @Override // android.view.View, com.google.android.gms.internal.acy
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21209C = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.acy
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof acz) {
            this.f21225h = (acz) webViewClient;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.acy
    public void stopLoading() {
        if (mo18078r()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            abr.b("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: t */
    public boolean mo18076t() {
        boolean z;
        synchronized (this.f21220c) {
            z = this.f21234q;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: u */
    public boolean mo18075u() {
        boolean z;
        synchronized (this.f21220c) {
            z = this.f21218a;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: v */
    public String mo18074v() {
        String str;
        synchronized (this.f21220c) {
            str = this.f21235r;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: w */
    public acx mo18073w() {
        return null;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: x */
    public C7799ul mo18072x() {
        return this.f21243z;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: y */
    public C7800um mo18071y() {
        return this.f21208B;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: z */
    public add mo18070z() {
        add addVar;
        synchronized (this.f21220c) {
            addVar = this.f21236s;
        }
        return addVar;
    }
}
