package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AbstractC3517af;
import com.google.android.gms.ads.internal.client.AbstractC3520ag;
import com.google.android.gms.ads.internal.client.AbstractC3532ak;
import com.google.android.gms.ads.internal.client.AbstractC3538am;
import com.google.android.gms.ads.internal.client.AbstractC3544ao;
import com.google.android.gms.ads.internal.client.AbstractC3553c;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.reward.client.AbstractC3755d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7807ur;
import com.google.android.gms.internal.AbstractC8082yy;
import com.google.android.gms.internal.AbstractC8096zd;
import com.google.android.gms.internal.C7718sy;
import com.google.android.gms.internal.C7719sz;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abu;
import com.google.android.gms.p224a.C3431d;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@aaa
/* renamed from: com.google.android.gms.ads.internal.t */
/* loaded from: classes.dex */
public class BinderC3773t extends AbstractC3532ak.AbstractBinderC3533a {

    /* renamed from: a */
    private final VersionInfoParcel f14683a;

    /* renamed from: b */
    private final AdSizeParcel f14684b;

    /* renamed from: c */
    private final Future<C7718sy> f14685c = m26908p();

    /* renamed from: d */
    private final Context f14686d;

    /* renamed from: e */
    private final C3778b f14687e;
    @Nullable

    /* renamed from: f */
    private WebView f14688f;
    @Nullable

    /* renamed from: g */
    private AbstractC3520ag f14689g;
    @Nullable

    /* renamed from: h */
    private C7718sy f14690h;

    /* renamed from: i */
    private AsyncTask<Void, Void, Void> f14691i;

    /* renamed from: com.google.android.gms.ads.internal.t$a */
    /* loaded from: classes2.dex */
    private class AsyncTaskC3777a extends AsyncTask<Void, Void, Void> {
        private AsyncTaskC3777a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                BinderC3773t.this.f14690h = (C7718sy) BinderC3773t.this.f14685c.get(C7788uf.f25873cn.m13486c().longValue(), TimeUnit.MILLISECONDS);
                return null;
            } catch (InterruptedException e) {
                e = e;
                abr.d("Failed to load ad data", e);
                return null;
            } catch (ExecutionException e2) {
                e = e2;
                abr.d("Failed to load ad data", e);
                return null;
            } catch (TimeoutException e3) {
                abr.d("Timed out waiting for ad data");
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(Void r3) {
            String m26911m = BinderC3773t.this.m26911m();
            if (BinderC3773t.this.f14688f != null) {
                BinderC3773t.this.f14688f.loadUrl(m26911m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.ads.internal.t$b */
    /* loaded from: classes2.dex */
    public static class C3778b {

        /* renamed from: a */
        private final String f14696a;

        /* renamed from: b */
        private final Map<String, String> f14697b = new TreeMap();

        /* renamed from: c */
        private String f14698c;

        /* renamed from: d */
        private String f14699d;

        public C3778b(String str) {
            this.f14696a = str;
        }

        /* renamed from: a */
        public String m26904a() {
            return this.f14699d;
        }

        /* renamed from: a */
        public void m26903a(AdRequestParcel adRequestParcel) {
            this.f14698c = adRequestParcel.f13854j.f13888o;
            Bundle bundle = adRequestParcel.f13857m != null ? adRequestParcel.f13857m.getBundle(AdMobAdapter.class.getName()) : null;
            if (bundle == null) {
                return;
            }
            String m13486c = C7788uf.f25872cm.m13486c();
            for (String str : bundle.keySet()) {
                if (m13486c.equals(str)) {
                    this.f14699d = bundle.getString(str);
                } else if (str.startsWith("csa_")) {
                    this.f14697b.put(str.substring("csa_".length()), bundle.getString(str));
                }
            }
        }

        /* renamed from: b */
        public String m26902b() {
            return this.f14698c;
        }

        /* renamed from: c */
        public String m26901c() {
            return this.f14696a;
        }

        /* renamed from: d */
        public Map<String, String> m26900d() {
            return this.f14697b;
        }
    }

    public BinderC3773t(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel) {
        this.f14686d = context;
        this.f14683a = versionInfoParcel;
        this.f14684b = adSizeParcel;
        this.f14688f = new WebView(this.f14686d);
        this.f14687e = new C3778b(str);
        m26909o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public String m26916c(String str) {
        if (this.f14690h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.f14690h.m13657b(parse, this.f14686d);
        } catch (RemoteException e) {
            abr.d("Unable to process ad data", e);
        } catch (C7719sz e2) {
            abr.d("Unable to parse ad click url", e2);
        }
        return parse.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m26914d(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f14686d.startActivity(intent);
    }

    /* renamed from: o */
    private void m26909o() {
        m26924a(0);
        this.f14688f.setVerticalScrollBarEnabled(false);
        this.f14688f.getSettings().setJavaScriptEnabled(true);
        this.f14688f.setWebViewClient(new WebViewClient() { // from class: com.google.android.gms.ads.internal.t.1
            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (BinderC3773t.this.f14689g != null) {
                    try {
                        BinderC3773t.this.f14689g.mo13230a(0);
                    } catch (RemoteException e) {
                        abr.d("Could not call AdListener.onAdFailedToLoad().", e);
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.startsWith(BinderC3773t.this.m26910n())) {
                    return false;
                }
                if (str.startsWith(C7788uf.f25868ci.m13486c())) {
                    if (BinderC3773t.this.f14689g != null) {
                        try {
                            BinderC3773t.this.f14689g.mo13230a(3);
                        } catch (RemoteException e) {
                            abr.d("Could not call AdListener.onAdFailedToLoad().", e);
                        }
                    }
                    BinderC3773t.this.m26924a(0);
                    return true;
                } else if (str.startsWith(C7788uf.f25869cj.m13486c())) {
                    if (BinderC3773t.this.f14689g != null) {
                        try {
                            BinderC3773t.this.f14689g.mo13230a(0);
                        } catch (RemoteException e2) {
                            abr.d("Could not call AdListener.onAdFailedToLoad().", e2);
                        }
                    }
                    BinderC3773t.this.m26924a(0);
                    return true;
                } else if (str.startsWith(C7788uf.f25870ck.m13486c())) {
                    if (BinderC3773t.this.f14689g != null) {
                        try {
                            BinderC3773t.this.f14689g.mo13228c();
                        } catch (RemoteException e3) {
                            abr.d("Could not call AdListener.onAdLoaded().", e3);
                        }
                    }
                    BinderC3773t.this.m26924a(BinderC3773t.this.m26918b(str));
                    return true;
                } else if (str.startsWith("gmsg://")) {
                    return true;
                } else {
                    if (BinderC3773t.this.f14689g != null) {
                        try {
                            BinderC3773t.this.f14689g.mo13229b();
                        } catch (RemoteException e4) {
                            abr.d("Could not call AdListener.onAdLeftApplication().", e4);
                        }
                    }
                    BinderC3773t.this.m26914d(BinderC3773t.this.m26916c(str));
                    return true;
                }
            }
        });
        this.f14688f.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.ads.internal.t.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (BinderC3773t.this.f14690h != null) {
                    try {
                        BinderC3773t.this.f14690h.m13658a(motionEvent);
                        return false;
                    } catch (RemoteException e) {
                        abr.d("Unable to process ad data", e);
                        return false;
                    }
                }
                return false;
            }
        });
    }

    /* renamed from: p */
    private Future<C7718sy> m26908p() {
        return abu.m18389a(new Callable<C7718sy>() { // from class: com.google.android.gms.ads.internal.t.3
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public C7718sy call() {
                return new C7718sy(BinderC3773t.this.f14683a.f14733b, BinderC3773t.this.f14686d, false);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public AbstractC4170e mo13193a() {
        C4588d.m23620b("getAdFrame must be called on the main UI thread.");
        return BinderC4173f.m25293a(this.f14688f);
    }

    /* renamed from: a */
    void m26924a(int i) {
        if (this.f14688f == null) {
            return;
        }
        this.f14688f.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13191a(AdSizeParcel adSizeParcel) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13190a(VideoOptionsParcel videoOptionsParcel) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13189a(AbstractC3517af abstractC3517af) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13188a(AbstractC3520ag abstractC3520ag) {
        this.f14689g = abstractC3520ag;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13187a(AbstractC3538am abstractC3538am) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13186a(AbstractC3544ao abstractC3544ao) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13185a(AbstractC3755d abstractC3755d) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13184a(AbstractC7807ur abstractC7807ur) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13183a(AbstractC8082yy abstractC8082yy) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13182a(AbstractC8096zd abstractC8096zd, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13181a(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13180a(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public boolean mo13192a(AdRequestParcel adRequestParcel) {
        C4588d.m23626a(this.f14688f, "This Search Ad has already been torn down");
        this.f14687e.m26903a(adRequestParcel);
        this.f14691i = new AsyncTaskC3777a().execute(new Void[0]);
        return true;
    }

    /* renamed from: b */
    int m26918b(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter(FimiMediaMeta.IJKM_KEY_HEIGHT);
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            return C3514ac.m27586a().m26865a(this.f14686d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: b */
    public void mo13179b() {
        C4588d.m23620b("destroy must be called on the main UI thread.");
        this.f14691i.cancel(true);
        this.f14685c.cancel(true);
        this.f14688f.destroy();
        this.f14688f = null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: c */
    public boolean mo13177c() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: d */
    public void mo13175d() {
        C4588d.m23620b("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: f */
    public void mo13174f() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: h */
    public void mo13173h() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: h_ */
    public void mo13172h_() {
        C4588d.m23620b("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: i */
    public AdSizeParcel mo13171i() {
        return this.f14684b;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    @Nullable
    /* renamed from: j */
    public String mo13170j() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: k */
    public boolean mo13169k() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    @Nullable
    /* renamed from: l */
    public AbstractC3553c mo13168l() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: l_ */
    public void mo13167l_() {
    }

    /* renamed from: m */
    String m26911m() {
        Uri m13659a;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(C7788uf.f25871cl.m13486c());
        builder.appendQueryParameter(C3431d.f13700b, this.f14687e.m26902b());
        builder.appendQueryParameter("pubId", this.f14687e.m26901c());
        Map<String, String> m26900d = this.f14687e.m26900d();
        for (String str : m26900d.keySet()) {
            builder.appendQueryParameter(str, m26900d.get(str));
        }
        Uri build = builder.build();
        if (this.f14690h != null) {
            try {
                m13659a = this.f14690h.m13659a(build, this.f14686d);
            } catch (RemoteException | C7719sz e) {
                abr.d("Unable to process ad data", e);
            }
            String valueOf = String.valueOf(m26910n());
            String valueOf2 = String.valueOf(m13659a.getEncodedQuery());
            return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("#").append(valueOf2).toString();
        }
        m13659a = build;
        String valueOf3 = String.valueOf(m26910n());
        String valueOf22 = String.valueOf(m13659a.getEncodedQuery());
        return new StringBuilder(String.valueOf(valueOf3).length() + 1 + String.valueOf(valueOf22).length()).append(valueOf3).append("#").append(valueOf22).toString();
    }

    /* renamed from: n */
    String m26910n() {
        String m26904a = this.f14687e.m26904a();
        String str = TextUtils.isEmpty(m26904a) ? "www.google.com" : m26904a;
        String valueOf = String.valueOf("https://");
        String m13486c = C7788uf.f25871cl.m13486c();
        return new StringBuilder(String.valueOf(valueOf).length() + 0 + String.valueOf(str).length() + String.valueOf(m13486c).length()).append(valueOf).append(str).append(m13486c).toString();
    }
}
