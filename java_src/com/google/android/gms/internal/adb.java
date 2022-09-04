package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.AbstractC3601g;
import com.google.android.gms.ads.internal.overlay.BinderC3649d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
@aaa
/* loaded from: classes.dex */
public class adb extends FrameLayout implements acy {

    /* renamed from: a */
    private static final int f21204a = Color.argb(0, 0, 0, 0);

    /* renamed from: b */
    private final acy f21205b;

    /* renamed from: c */
    private final acx f21206c;

    public adb(acy acyVar) {
        super(acyVar.getContext());
        this.f21205b = acyVar;
        this.f21206c = new acx(acyVar.mo18089g(), this, this);
        acz mo18084l = this.f21205b.mo18084l();
        if (mo18084l != null) {
            mo18084l.m18175a(this);
        }
        addView(this.f21205b.mo18105b());
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: A */
    public boolean mo18141A() {
        return this.f21205b.mo18141A();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: B */
    public void mo18140B() {
        this.f21205b.mo18140B();
    }

    @Override // com.google.android.gms.ads.internal.AbstractC3768s
    /* renamed from: C */
    public void mo18139C() {
        this.f21205b.C();
    }

    @Override // com.google.android.gms.ads.internal.AbstractC3768s
    /* renamed from: D */
    public void mo18138D() {
        this.f21205b.D();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: E */
    public void mo18137E() {
        this.f21205b.mo18137E();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: F */
    public View.OnClickListener mo18136F() {
        return this.f21205b.mo18136F();
    }

    @Override // com.google.android.gms.internal.acy
    @Nullable
    /* renamed from: G */
    public AbstractC3601g mo18135G() {
        return this.f21205b.mo18135G();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: H */
    public void mo18134H() {
        setBackgroundColor(f21204a);
        this.f21205b.setBackgroundColor(f21204a);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public WebView mo18122a() {
        return this.f21205b.mo18122a();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18121a(int i) {
        this.f21205b.mo18121a(i);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18120a(Context context) {
        this.f21205b.mo18120a(context);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18119a(Context context, AdSizeParcel adSizeParcel, C7801un c7801un) {
        this.f21206c.m18185c();
        this.f21205b.mo18119a(context, adSizeParcel, c7801un);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18117a(AdSizeParcel adSizeParcel) {
        this.f21205b.mo18117a(adSizeParcel);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18116a(@Nullable AbstractC3601g abstractC3601g) {
        this.f21205b.mo18116a(abstractC3601g);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18115a(BinderC3649d binderC3649d) {
        this.f21205b.mo18115a(binderC3649d);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18112a(add addVar) {
        this.f21205b.mo18112a(addVar);
    }

    @Override // com.google.android.gms.internal.AbstractC7741tg
    /* renamed from: a */
    public void mo13608a(AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf, boolean z) {
        this.f21205b.a(abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf, z);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18109a(String str) {
        this.f21205b.mo18109a(str);
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13113a(String str, AbstractC7877vt abstractC7877vt) {
        this.f21205b.a(str, abstractC7877vt);
    }

    @Override // com.google.android.gms.internal.acy, com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13112a(String str, String str2) {
        this.f21205b.mo13112a(str, str2);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18107a(String str, Map<String, ?> map) {
        this.f21205b.mo18107a(str, map);
    }

    @Override // com.google.android.gms.internal.acy, com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13111a(String str, JSONObject jSONObject) {
        this.f21205b.mo13111a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: a */
    public void mo18106a(boolean z) {
        this.f21205b.mo18106a(z);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: b */
    public View mo18105b() {
        return this;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: b */
    public void mo18104b(int i) {
        this.f21205b.mo18104b(i);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: b */
    public void mo18103b(BinderC3649d binderC3649d) {
        this.f21205b.mo18103b(binderC3649d);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: b */
    public void mo18101b(String str) {
        this.f21205b.mo18101b(str);
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: b */
    public void mo13110b(String str, AbstractC7877vt abstractC7877vt) {
        this.f21205b.b(str, abstractC7877vt);
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: b */
    public void mo13109b(String str, JSONObject jSONObject) {
        this.f21205b.b(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: b */
    public void mo18100b(boolean z) {
        this.f21205b.mo18100b(z);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: c */
    public void mo18099c() {
        this.f21205b.mo18099c();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: c */
    public void mo18096c(boolean z) {
        this.f21205b.mo18096c(z);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: d */
    public void mo18095d() {
        this.f21205b.mo18095d();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: d */
    public void mo18093d(boolean z) {
        this.f21205b.mo18093d(z);
    }

    @Override // com.google.android.gms.internal.acy
    public void destroy() {
        this.f21205b.destroy();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: e */
    public void mo18092e() {
        this.f21205b.mo18092e();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: f */
    public Activity mo18090f() {
        return this.f21205b.mo18090f();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: g */
    public Context mo18089g() {
        return this.f21205b.mo18089g();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: h */
    public C3588d mo18088h() {
        return this.f21205b.mo18088h();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: i */
    public BinderC3649d mo18087i() {
        return this.f21205b.mo18087i();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: j */
    public BinderC3649d mo18086j() {
        return this.f21205b.mo18086j();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: k */
    public AdSizeParcel mo18085k() {
        return this.f21205b.mo18085k();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: l */
    public acz mo18084l() {
        return this.f21205b.mo18084l();
    }

    @Override // com.google.android.gms.internal.acy
    public void loadData(String str, String str2, String str3) {
        this.f21205b.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.acy
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f21205b.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.acy
    public void loadUrl(String str) {
        this.f21205b.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: m */
    public boolean mo18083m() {
        return this.f21205b.mo18083m();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: n */
    public C7667ro mo18082n() {
        return this.f21205b.mo18082n();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: o */
    public VersionInfoParcel mo18081o() {
        return this.f21205b.mo18081o();
    }

    @Override // com.google.android.gms.internal.acy
    public void onPause() {
        this.f21206c.m18186b();
        this.f21205b.onPause();
    }

    @Override // com.google.android.gms.internal.acy
    public void onResume() {
        this.f21205b.onResume();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: p */
    public boolean mo18080p() {
        return this.f21205b.mo18080p();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: q */
    public int mo18079q() {
        return this.f21205b.mo18079q();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: r */
    public boolean mo18078r() {
        return this.f21205b.mo18078r();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: s */
    public void mo18077s() {
        this.f21206c.m18185c();
        this.f21205b.mo18077s();
    }

    @Override // android.view.View, com.google.android.gms.internal.acy
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21205b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.acy
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f21205b.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.acy
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f21205b.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.acy
    public void setWebViewClient(WebViewClient webViewClient) {
        this.f21205b.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.acy
    public void stopLoading() {
        this.f21205b.stopLoading();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: t */
    public boolean mo18076t() {
        return this.f21205b.mo18076t();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: u */
    public boolean mo18075u() {
        return this.f21205b.mo18075u();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: v */
    public String mo18074v() {
        return this.f21205b.mo18074v();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: w */
    public acx mo18073w() {
        return this.f21206c;
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: x */
    public C7799ul mo18072x() {
        return this.f21205b.mo18072x();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: y */
    public C7800um mo18071y() {
        return this.f21205b.mo18071y();
    }

    @Override // com.google.android.gms.internal.acy
    /* renamed from: z */
    public add mo18070z() {
        return this.f21205b.mo18070z();
    }
}
