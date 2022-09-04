package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.p001v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.C3779u;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
@aaa
@TargetApi(8)
/* loaded from: classes.dex */
public class abw {

    @TargetApi(9)
    /* renamed from: com.google.android.gms.internal.abw$a */
    /* loaded from: classes2.dex */
    public static class C6160a extends abw {
        public C6160a() {
            super();
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public int mo18302a() {
            return 6;
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public boolean mo18300a(DownloadManager.Request request) {
            request.setShowRunningNotification(true);
            return true;
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: b */
        public int mo18301b() {
            return 7;
        }
    }

    @TargetApi(11)
    /* renamed from: com.google.android.gms.internal.abw$b */
    /* loaded from: classes2.dex */
    public static class C6161b extends C6160a {
        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public acz mo18283a(acy acyVar, boolean z) {
            return new adh(acyVar, z);
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public Set<String> mo18299a(Uri uri) {
            return uri.getQueryParameterNames();
        }

        @Override // com.google.android.gms.internal.abw.C6160a, com.google.android.gms.internal.abw
        /* renamed from: a */
        public boolean mo18300a(DownloadManager.Request request) {
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            return true;
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public boolean mo18288a(final Context context, final WebSettings webSettings) {
            super.a(context, webSettings);
            return ((Boolean) acj.m18219a(new Callable<Boolean>() { // from class: com.google.android.gms.internal.abw.b.1
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public Boolean call() {
                    if (context.getCacheDir() != null) {
                        webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
                        webSettings.setAppCacheMaxSize(0L);
                        webSettings.setAppCacheEnabled(true);
                    }
                    webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                    webSettings.setDatabaseEnabled(true);
                    webSettings.setDomStorageEnabled(true);
                    webSettings.setDisplayZoomControls(false);
                    webSettings.setBuiltInZoomControls(true);
                    webSettings.setSupportZoom(true);
                    webSettings.setAllowContentAccess(false);
                    return true;
                }
            })).booleanValue();
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public boolean mo18298a(Window window) {
            window.setFlags(ViewCompat.MEASURED_STATE_TOO_SMALL, ViewCompat.MEASURED_STATE_TOO_SMALL);
            return true;
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: b */
        public boolean mo18297b(View view) {
            view.setLayerType(0, null);
            return true;
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: c */
        public WebChromeClient mo18293c(acy acyVar) {
            return new adg(acyVar);
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: c */
        public boolean mo18296c(View view) {
            view.setLayerType(1, null);
            return true;
        }
    }

    @TargetApi(14)
    /* renamed from: com.google.android.gms.internal.abw$c */
    /* loaded from: classes2.dex */
    public static class C6163c extends C6161b {
        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public String mo18294a(SslError sslError) {
            return sslError.getUrl();
        }

        @Override // com.google.android.gms.internal.abw.C6161b, com.google.android.gms.internal.abw
        /* renamed from: c */
        public WebChromeClient mo18293c(acy acyVar) {
            return new adi(acyVar);
        }
    }

    @TargetApi(17)
    /* renamed from: com.google.android.gms.internal.abw$d */
    /* loaded from: classes2.dex */
    public static class C6164d extends C6166f {
        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public Drawable mo18291a(Context context, Bitmap bitmap, boolean z, float f) {
            if (!z || f <= 0.0f || f > 25.0f) {
                return new BitmapDrawable(context.getResources(), bitmap);
            }
            try {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                RenderScript create = RenderScript.create(context);
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                create2.setRadius(f);
                create2.setInput(createFromBitmap);
                create2.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(createBitmap);
                return new BitmapDrawable(context.getResources(), createBitmap);
            } catch (RuntimeException e) {
                return new BitmapDrawable(context.getResources(), bitmap);
            }
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public String mo18292a(Context context) {
            return WebSettings.getDefaultUserAgent(context);
        }

        @Override // com.google.android.gms.internal.abw.C6166f, com.google.android.gms.internal.abw.C6161b, com.google.android.gms.internal.abw
        /* renamed from: a */
        public boolean mo18288a(Context context, WebSettings webSettings) {
            super.mo18288a(context, webSettings);
            webSettings.setMediaPlaybackRequiresUserGesture(false);
            return true;
        }
    }

    @TargetApi(18)
    /* renamed from: com.google.android.gms.internal.abw$e */
    /* loaded from: classes2.dex */
    public static class C6165e extends C6164d {
        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public boolean mo18285a(View view) {
            return super.a(view) || view.getWindowId() != null;
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: c */
        public int mo18290c() {
            return 14;
        }
    }

    @TargetApi(16)
    /* renamed from: com.google.android.gms.internal.abw$f */
    /* loaded from: classes2.dex */
    public static class C6166f extends C6163c {
        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public void mo18289a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            Window window = activity.getWindow();
            if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
                return;
            }
            mo18286a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public void mo18287a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: a */
        public void mo18286a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @Override // com.google.android.gms.internal.abw.C6161b, com.google.android.gms.internal.abw
        /* renamed from: a */
        public boolean mo18288a(Context context, WebSettings webSettings) {
            super.a(context, webSettings);
            webSettings.setAllowFileAccessFromFileURLs(false);
            webSettings.setAllowUniversalAccessFromFileURLs(false);
            return true;
        }
    }

    @TargetApi(19)
    /* renamed from: com.google.android.gms.internal.abw$g */
    /* loaded from: classes2.dex */
    public static class C6167g extends C6165e {
        @Override // com.google.android.gms.internal.abw.C6165e, com.google.android.gms.internal.abw
        /* renamed from: a */
        public boolean mo18285a(View view) {
            return view.isAttachedToWindow();
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: d */
        public ViewGroup.LayoutParams mo18284d() {
            return new ViewGroup.LayoutParams(-1, -1);
        }
    }

    @TargetApi(21)
    /* renamed from: com.google.android.gms.internal.abw$h */
    /* loaded from: classes2.dex */
    public static class C6168h extends C6167g {
        @Override // com.google.android.gms.internal.abw.C6161b, com.google.android.gms.internal.abw
        /* renamed from: a */
        public acz mo18283a(acy acyVar, boolean z) {
            return new adl(acyVar, z);
        }

        @Override // com.google.android.gms.internal.abw
        /* renamed from: b */
        public CookieManager mo18282b(Context context) {
            return CookieManager.getInstance();
        }
    }

    private abw() {
    }

    /* renamed from: a */
    public static abw m18305a(int i) {
        return i >= 21 ? new C6168h() : i >= 19 ? new C6167g() : i >= 18 ? new C6165e() : i >= 17 ? new C6164d() : i >= 16 ? new C6166f() : i >= 14 ? new C6163c() : i >= 11 ? new C6161b() : i >= 9 ? new C6160a() : new abw();
    }

    /* renamed from: a */
    public int mo18302a() {
        return 0;
    }

    /* renamed from: a */
    public Drawable mo18291a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: a */
    public acz mo18283a(acy acyVar, boolean z) {
        return new acz(acyVar, z);
    }

    /* renamed from: a */
    public String mo18292a(Context context) {
        return "";
    }

    /* renamed from: a */
    public String mo18294a(SslError sslError) {
        return "";
    }

    /* renamed from: a */
    public Set<String> mo18299a(Uri uri) {
        String encodedQuery;
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            do {
                int indexOf = encodedQuery.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                i = indexOf + 1;
            } while (i < encodedQuery.length());
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return Collections.emptySet();
    }

    /* renamed from: a */
    public void mo18289a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        mo18286a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
    }

    /* renamed from: a */
    public void mo18287a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo18286a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public boolean mo18300a(DownloadManager.Request request) {
        return false;
    }

    /* renamed from: a */
    public boolean mo18288a(Context context, WebSettings webSettings) {
        return false;
    }

    /* renamed from: a */
    public boolean mo18285a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: a */
    public boolean mo18298a(Window window) {
        return false;
    }

    /* renamed from: a */
    public boolean m18304a(acy acyVar) {
        if (acyVar == null) {
            return false;
        }
        acyVar.onPause();
        return true;
    }

    /* renamed from: b */
    public int mo18301b() {
        return 1;
    }

    /* renamed from: b */
    public CookieManager mo18282b(Context context) {
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Exception e) {
            abr.b("Failed to obtain CookieManager.", e);
            C3779u.m26886i().m18451a(e, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: b */
    public boolean mo18297b(View view) {
        return false;
    }

    /* renamed from: b */
    public boolean m18303b(acy acyVar) {
        if (acyVar == null) {
            return false;
        }
        acyVar.onResume();
        return true;
    }

    /* renamed from: c */
    public int mo18290c() {
        return 5;
    }

    /* renamed from: c */
    public WebChromeClient mo18293c(acy acyVar) {
        return null;
    }

    /* renamed from: c */
    public boolean mo18296c(View view) {
        return false;
    }

    /* renamed from: d */
    public ViewGroup.LayoutParams mo18284d() {
        return new ViewGroup.LayoutParams(-2, -2);
    }
}
