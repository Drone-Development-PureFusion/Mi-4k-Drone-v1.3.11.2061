package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.AbstractC3768s;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.AbstractC3601g;
import com.google.android.gms.ads.internal.overlay.BinderC3649d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;
@aaa
/* loaded from: classes.dex */
public interface acy extends AbstractC3768s, AbstractC7741tg, AbstractC7980wy {
    /* renamed from: A */
    boolean mo18141A();

    /* renamed from: B */
    void mo18140B();

    /* renamed from: E */
    void mo18137E();

    @Nullable
    /* renamed from: F */
    View.OnClickListener mo18136F();

    /* renamed from: G */
    AbstractC3601g mo18135G();

    /* renamed from: H */
    void mo18134H();

    /* renamed from: a */
    WebView mo18122a();

    /* renamed from: a */
    void mo18121a(int i);

    /* renamed from: a */
    void mo18120a(Context context);

    /* renamed from: a */
    void mo18119a(Context context, AdSizeParcel adSizeParcel, C7801un c7801un);

    /* renamed from: a */
    void mo18117a(AdSizeParcel adSizeParcel);

    /* renamed from: a */
    void mo18116a(AbstractC3601g abstractC3601g);

    /* renamed from: a */
    void mo18115a(BinderC3649d binderC3649d);

    /* renamed from: a */
    void mo18112a(add addVar);

    /* renamed from: a */
    void mo18109a(String str);

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    void mo13112a(String str, String str2);

    /* renamed from: a */
    void mo18107a(String str, Map<String, ?> map);

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    void mo13111a(String str, JSONObject jSONObject);

    /* renamed from: a */
    void mo18106a(boolean z);

    /* renamed from: b */
    View mo18105b();

    /* renamed from: b */
    void mo18104b(int i);

    /* renamed from: b */
    void mo18103b(BinderC3649d binderC3649d);

    /* renamed from: b */
    void mo18101b(String str);

    /* renamed from: b */
    void mo18100b(boolean z);

    /* renamed from: c */
    void mo18099c();

    /* renamed from: c */
    void mo18096c(boolean z);

    /* renamed from: d */
    void mo18095d();

    /* renamed from: d */
    void mo18093d(boolean z);

    void destroy();

    /* renamed from: e */
    void mo18092e();

    /* renamed from: f */
    Activity mo18090f();

    /* renamed from: g */
    Context mo18089g();

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    /* renamed from: h */
    C3588d mo18088h();

    /* renamed from: i */
    BinderC3649d mo18087i();

    /* renamed from: j */
    BinderC3649d mo18086j();

    /* renamed from: k */
    AdSizeParcel mo18085k();

    @Nullable
    /* renamed from: l */
    acz mo18084l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, @Nullable String str5);

    void loadUrl(String str);

    /* renamed from: m */
    boolean mo18083m();

    void measure(int i, int i2);

    /* renamed from: n */
    C7667ro mo18082n();

    /* renamed from: o */
    VersionInfoParcel mo18081o();

    void onPause();

    void onResume();

    /* renamed from: p */
    boolean mo18080p();

    /* renamed from: q */
    int mo18079q();

    /* renamed from: r */
    boolean mo18078r();

    /* renamed from: s */
    void mo18077s();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    /* renamed from: t */
    boolean mo18076t();

    /* renamed from: u */
    boolean mo18075u();

    /* renamed from: v */
    String mo18074v();

    @Nullable
    /* renamed from: w */
    acx mo18073w();

    @Nullable
    /* renamed from: x */
    C7799ul mo18072x();

    /* renamed from: y */
    C7800um mo18071y();

    @Nullable
    /* renamed from: z */
    add mo18070z();
}
