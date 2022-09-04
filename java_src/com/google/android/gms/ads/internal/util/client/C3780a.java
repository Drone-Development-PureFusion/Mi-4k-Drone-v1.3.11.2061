package com.google.android.gms.ads.internal.util.client;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.p001v4.internal.view.SupportMenu;
import android.support.p001v4.view.ViewCompat;
import android.support.p004v7.media.SystemMediaRouteProvider;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C3436b;
import com.google.android.gms.ads.C3455f;
import com.google.android.gms.ads.doubleclick.C3453e;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.internal.C4612q;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.aaa;
import com.xiaomi.market.sdk.C10445j;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.StringTokenizer;
import org.p286a.p287a.C11086e;
@aaa
/* renamed from: com.google.android.gms.ads.internal.util.client.a */
/* loaded from: classes.dex */
public class C3780a {

    /* renamed from: a */
    public static final Handler f14737a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static final String f14738b = AdView.class.getName();

    /* renamed from: c */
    private static final String f14739c = C3455f.class.getName();

    /* renamed from: d */
    private static final String f14740d = PublisherAdView.class.getName();

    /* renamed from: e */
    private static final String f14741e = C3453e.class.getName();

    /* renamed from: f */
    private static final String f14742f = SearchAdView.class.getName();

    /* renamed from: g */
    private static final String f14743g = C3436b.class.getName();

    /* renamed from: com.google.android.gms.ads.internal.util.client.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3783a {
        /* renamed from: a */
        void mo18306a(String str);
    }

    /* renamed from: a */
    private void m26860a(ViewGroup viewGroup, AdSizeParcel adSizeParcel, String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int m26865a = m26865a(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(adSizeParcel.f13869g - m26865a, adSizeParcel.f13866d - m26865a, 17));
        viewGroup.addView(frameLayout, adSizeParcel.f13869g, adSizeParcel.f13866d);
    }

    /* renamed from: a */
    public int m26865a(Context context, int i) {
        return m26862a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public int m26862a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    /* renamed from: a */
    public String m26866a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || m26867a()) {
            string = "emulator";
        }
        return m26858a(string);
    }

    /* renamed from: a */
    public String m26858a(String str) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    String m26857a(String str, String str2, int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        StringBuilder sb = new StringBuilder();
        int i2 = i - 1;
        if (i <= 0 || !stringTokenizer.hasMoreElements()) {
            return str;
        }
        sb.append(stringTokenizer.nextToken());
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0 || !stringTokenizer.hasMoreElements()) {
                break;
            }
            sb.append(".").append(stringTokenizer.nextToken());
            i2 = i3;
        }
        return sb.toString();
    }

    @Nullable
    /* renamed from: a */
    public String m26855a(StackTraceElement[] stackTraceElementArr, String str) {
        String str2;
        for (int i = 0; i + 1 < stackTraceElementArr.length; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f14738b.equalsIgnoreCase(className) || f14739c.equalsIgnoreCase(className) || f14740d.equalsIgnoreCase(className) || f14741e.equalsIgnoreCase(className) || f14742f.equalsIgnoreCase(className) || f14743g.equalsIgnoreCase(className))) {
                str2 = stackTraceElementArr[i + 1].getClassName();
                break;
            }
        }
        str2 = null;
        if (str != null) {
            String m26857a = m26857a(str, ".", 3);
            if (str2 != null && !str2.contains(m26857a)) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m26864a(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        m26863a(context, str, str2, bundle, z, new AbstractC3783a() { // from class: com.google.android.gms.ads.internal.util.client.a.1
            /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.ads.internal.util.client.a$1$1] */
            @Override // com.google.android.gms.ads.internal.util.client.C3780a.AbstractC3783a
            /* renamed from: a */
            public void mo18306a(final String str3) {
                new Thread() { // from class: com.google.android.gms.ads.internal.util.client.a.1.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        new C3785c().mo18306a(str3);
                    }
                }.start();
            }
        });
    }

    /* renamed from: a */
    public void m26863a(Context context, @Nullable String str, String str2, Bundle bundle, boolean z, AbstractC3783a abstractC3783a) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString(C10445j.f32457ac, Build.VERSION.RELEASE);
            bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                str = new StringBuilder(23).append(C4648j.m23370b().mo23364c(context)).append(".").append(C4612q.f17087a).toString();
            }
            bundle.putString("js", str);
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(UriUtil.HTTPS_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        abstractC3783a.mo18306a(appendQueryParameter.toString());
    }

    /* renamed from: a */
    public void m26861a(ViewGroup viewGroup, AdSizeParcel adSizeParcel, String str) {
        m26860a(viewGroup, adSizeParcel, str, ViewCompat.MEASURED_STATE_MASK, -1);
    }

    /* renamed from: a */
    public void m26859a(ViewGroup viewGroup, AdSizeParcel adSizeParcel, String str, String str2) {
        C3784b.m26840d(str2);
        m26860a(viewGroup, adSizeParcel, str, SupportMenu.CATEGORY_MASK, ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: a */
    public void m26856a(boolean z, HttpURLConnection httpURLConnection, @Nullable String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty(C11086e.f35703Y, str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public boolean m26867a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: b */
    public int m26852b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return m26851b(displayMetrics, i);
    }

    /* renamed from: b */
    public int m26851b(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    /* renamed from: b */
    public boolean m26854b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public boolean m26853b(Context context) {
        return C4648j.m23370b().mo23375a(context) == 0;
    }

    /* renamed from: c */
    public boolean m26850c(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    /* renamed from: d */
    public boolean m26849d(Context context) {
        int intValue;
        int intValue2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (C4696s.m23108f()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            intValue = displayMetrics.heightPixels;
            intValue2 = displayMetrics.widthPixels;
        } else {
            try {
                intValue = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                intValue2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception e) {
                return false;
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels == intValue && displayMetrics.widthPixels == intValue2;
    }

    /* renamed from: e */
    public int m26848e(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", SystemMediaRouteProvider.PACKAGE_NAME);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
