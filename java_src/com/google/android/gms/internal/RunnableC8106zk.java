package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.internal.acz;
@aaa
/* renamed from: com.google.android.gms.internal.zk */
/* loaded from: classes.dex */
public class RunnableC8106zk implements Runnable {

    /* renamed from: a */
    protected final acy f26462a;

    /* renamed from: b */
    protected boolean f26463b;

    /* renamed from: c */
    protected boolean f26464c;

    /* renamed from: d */
    private final Handler f26465d;

    /* renamed from: e */
    private final long f26466e;

    /* renamed from: f */
    private long f26467f;

    /* renamed from: g */
    private acz.AbstractC6197a f26468g;

    /* renamed from: h */
    private final int f26469h;

    /* renamed from: i */
    private final int f26470i;

    /* renamed from: com.google.android.gms.internal.zk$a */
    /* loaded from: classes2.dex */
    protected final class AsyncTaskC8107a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: b */
        private final WebView f26472b;

        /* renamed from: c */
        private Bitmap f26473c;

        public AsyncTaskC8107a(WebView webView) {
            this.f26472b = webView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public synchronized Boolean doInBackground(Void... voidArr) {
            boolean z;
            int width = this.f26473c.getWidth();
            int height = this.f26473c.getHeight();
            if (width == 0 || height == 0) {
                z = false;
            } else {
                int i = 0;
                for (int i2 = 0; i2 < width; i2 += 10) {
                    for (int i3 = 0; i3 < height; i3 += 10) {
                        if (this.f26473c.getPixel(i2, i3) != 0) {
                            i++;
                        }
                    }
                }
                z = Boolean.valueOf(((double) i) / (((double) (width * height)) / 100.0d) > 0.1d);
            }
            return z;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            RunnableC8106zk.m12812c(RunnableC8106zk.this);
            if (bool.booleanValue() || RunnableC8106zk.this.m12813c() || RunnableC8106zk.this.f26467f <= 0) {
                RunnableC8106zk.this.f26464c = bool.booleanValue();
                RunnableC8106zk.this.f26468g.mo12714a(RunnableC8106zk.this.f26462a, true);
            } else if (RunnableC8106zk.this.f26467f <= 0) {
            } else {
                if (abr.a(2)) {
                    abr.a("Ad not detected, scheduling another run.");
                }
                RunnableC8106zk.this.f26465d.postDelayed(RunnableC8106zk.this, RunnableC8106zk.this.f26466e);
            }
        }

        @Override // android.os.AsyncTask
        protected synchronized void onPreExecute() {
            this.f26473c = Bitmap.createBitmap(RunnableC8106zk.this.f26470i, RunnableC8106zk.this.f26469h, Bitmap.Config.ARGB_8888);
            this.f26472b.setVisibility(0);
            this.f26472b.measure(View.MeasureSpec.makeMeasureSpec(RunnableC8106zk.this.f26470i, 0), View.MeasureSpec.makeMeasureSpec(RunnableC8106zk.this.f26469h, 0));
            this.f26472b.layout(0, 0, RunnableC8106zk.this.f26470i, RunnableC8106zk.this.f26469h);
            this.f26472b.draw(new Canvas(this.f26473c));
            this.f26472b.invalidate();
        }
    }

    public RunnableC8106zk(acz.AbstractC6197a abstractC6197a, acy acyVar, int i, int i2) {
        this(abstractC6197a, acyVar, i, i2, 200L, 50L);
    }

    public RunnableC8106zk(acz.AbstractC6197a abstractC6197a, acy acyVar, int i, int i2, long j, long j2) {
        this.f26466e = j;
        this.f26467f = j2;
        this.f26465d = new Handler(Looper.getMainLooper());
        this.f26462a = acyVar;
        this.f26468g = abstractC6197a;
        this.f26463b = false;
        this.f26464c = false;
        this.f26469h = i2;
        this.f26470i = i;
    }

    /* renamed from: c */
    static /* synthetic */ long m12812c(RunnableC8106zk runnableC8106zk) {
        long j = runnableC8106zk.f26467f - 1;
        runnableC8106zk.f26467f = j;
        return j;
    }

    /* renamed from: a */
    public void m12819a() {
        this.f26465d.postDelayed(this, this.f26466e);
    }

    /* renamed from: a */
    public void m12818a(AdResponseParcel adResponseParcel) {
        m12817a(adResponseParcel, new adk(this, this.f26462a, adResponseParcel.f14581q));
    }

    /* renamed from: a */
    public void m12817a(AdResponseParcel adResponseParcel, adk adkVar) {
        this.f26462a.setWebViewClient(adkVar);
        this.f26462a.loadDataWithBaseURL(TextUtils.isEmpty(adResponseParcel.f14566b) ? null : C3779u.m26890e().m18347a(adResponseParcel.f14566b), adResponseParcel.f14567c, "text/html", "UTF-8", null);
    }

    /* renamed from: b */
    public synchronized void m12815b() {
        this.f26463b = true;
    }

    /* renamed from: c */
    public synchronized boolean m12813c() {
        return this.f26463b;
    }

    /* renamed from: d */
    public boolean m12811d() {
        return this.f26464c;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f26462a == null || m12813c()) {
            this.f26468g.mo12714a(this.f26462a, true);
        } else {
            new AsyncTaskC8107a(this.f26462a.mo18122a()).execute(new Void[0]);
        }
    }
}
