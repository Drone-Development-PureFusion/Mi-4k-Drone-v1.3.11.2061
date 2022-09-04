package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p004v7.media.SystemMediaRouteProvider;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.BinderC3638o;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.util.client.C3780a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.C4692o;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.android.gms.internal.C7811ut;
import com.xiaomi.market.sdk.C10445j;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.p286a.p287a.C11086e;
@aaa
/* loaded from: classes.dex */
public class abv {

    /* renamed from: a */
    public static final Handler f21039a = new abs(Looper.getMainLooper());

    /* renamed from: d */
    private String f21042d;

    /* renamed from: f */
    private C7957wx f21044f;

    /* renamed from: b */
    private final Object f21040b = new Object();

    /* renamed from: c */
    private boolean f21041c = true;

    /* renamed from: e */
    private boolean f21043e = false;

    /* renamed from: com.google.android.gms.internal.abv$a */
    /* loaded from: classes2.dex */
    private final class C6158a extends BroadcastReceiver {
        private C6158a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                abv.this.f21041c = true;
            } else if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            } else {
                abv.this.f21041c = false;
            }
        }
    }

    /* renamed from: a */
    private JSONArray m18345a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            m18342a(jSONArray, it2.next());
        }
        return jSONArray;
    }

    /* renamed from: a */
    private JSONObject m18362a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m18341a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m18342a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m18362a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(m18343a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m18345a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(m18340a((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: a */
    private void m18341a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m18362a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, m18343a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m18345a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m18345a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: a */
    private boolean m18379a(KeyguardManager keyguardManager) {
        if (keyguardManager == null) {
            return false;
        }
        return keyguardManager.inKeyguardRestrictedInputMode();
    }

    /* renamed from: a */
    private boolean m18361a(PowerManager powerManager) {
        return powerManager == null || powerManager.isScreenOn();
    }

    /* renamed from: b */
    public static void m18331b(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            abu.m18391a(runnable);
        }
    }

    /* renamed from: c */
    private Bitmap m18326c(@NonNull View view) {
        Bitmap bitmap;
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width == 0 || height == 0) {
                abr.d("Width or height of view is zero");
                bitmap = null;
            } else {
                bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(bitmap);
                view.layout(0, 0, width, height);
                view.draw(canvas);
            }
            return bitmap;
        } catch (RuntimeException e) {
            abr.b("Fail to capture the webview", e);
            return null;
        }
    }

    /* renamed from: d */
    private Bitmap m18321d(@NonNull View view) {
        Bitmap bitmap;
        RuntimeException e;
        boolean isDrawingCacheEnabled;
        try {
            isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
        } catch (RuntimeException e2) {
            bitmap = null;
            e = e2;
        }
        try {
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e3) {
            e = e3;
            abr.b("Fail to capture the web view", e);
            return bitmap;
        }
        return bitmap;
    }

    /* renamed from: m */
    private boolean m18307m(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return false;
        }
        return powerManager.isScreenOn();
    }

    /* renamed from: a */
    public Bitmap m18360a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    public DisplayMetrics m18355a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: a */
    public PopupWindow m18359a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, z);
    }

    /* renamed from: a */
    public C7957wx m18374a(Context context, VersionInfoParcel versionInfoParcel) {
        C7957wx c7957wx;
        synchronized (this.f21040b) {
            if (this.f21044f == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f21044f = new C7957wx(context, versionInfoParcel, C7788uf.f25795b.m13486c());
            }
            c7957wx = this.f21044f;
        }
        return c7957wx;
    }

    /* renamed from: a */
    public String m18375a(Context context, View view, AdSizeParcel adSizeParcel) {
        if (!C7788uf.f25775ag.m13486c().booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FimiMediaMeta.IJKM_KEY_WIDTH, adSizeParcel.f13868f);
            jSONObject2.put(FimiMediaMeta.IJKM_KEY_HEIGHT, adSizeParcel.f13865c);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", m18317f(context));
            if (!adSizeParcel.f13867e) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            abr.d("Fail to get view hierarchy json", e);
            return null;
        }
    }

    /* renamed from: a */
    public String m18373a(Context context, C7667ro c7667ro, String str, View view) {
        if (c7667ro == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (c7667ro.m13780d(parse)) {
                parse = c7667ro.m13790a(parse, context, view);
            }
            return parse.toString();
        } catch (Exception e) {
            return str;
        }
    }

    /* renamed from: a */
    public String m18372a(final Context context, String str) {
        String str2;
        synchronized (this.f21040b) {
            if (this.f21042d != null) {
                str2 = this.f21042d;
            } else if (str == null) {
                str2 = m18339b();
            } else {
                try {
                    this.f21042d = C3779u.m26888g().mo18292a(context);
                } catch (Exception e) {
                }
                if (TextUtils.isEmpty(this.f21042d)) {
                    if (!C3514ac.m27586a().m26854b()) {
                        this.f21042d = null;
                        f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.abv.2
                            @Override // java.lang.Runnable
                            public void run() {
                                synchronized (abv.this.f21040b) {
                                    abv.this.f21042d = abv.this.m18327c(context);
                                    abv.this.f21040b.notifyAll();
                                }
                            }
                        });
                        while (this.f21042d == null) {
                            try {
                                this.f21040b.wait();
                            } catch (InterruptedException e2) {
                                this.f21042d = m18339b();
                                String valueOf = String.valueOf(this.f21042d);
                                abr.d(valueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(valueOf) : new String("Interrupted, use default user agent: "));
                            }
                        }
                    } else {
                        try {
                            this.f21042d = m18327c(context);
                        } catch (Exception e3) {
                            this.f21042d = m18339b();
                        }
                    }
                }
                String valueOf2 = String.valueOf(this.f21042d);
                this.f21042d = new StringBuilder(String.valueOf(valueOf2).length() + 11 + String.valueOf(str).length()).append(valueOf2).append(" (Mobile; ").append(str).append(")").toString();
                str2 = this.f21042d;
            }
        }
        return str2;
    }

    /* renamed from: a */
    public String m18351a(acy acyVar, String str) {
        return m18373a(acyVar.getContext(), acyVar.mo18082n(), str, acyVar.mo18105b());
    }

    /* renamed from: a */
    public String m18350a(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    public String m18347a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    /* renamed from: a */
    public String m18346a(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            str = str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", str2), String.format("$1%s$2", Uri.encode(map.get(str2))));
        }
        return str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", "[^@]+"), String.format("$1%s$2", "")).replaceAll("@@", "@");
    }

    /* renamed from: a */
    public Map<String, String> m18363a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : C3779u.m26888g().mo18299a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, Integer> m18356a(View view, WindowManager windowManager) {
        DisplayMetrics m18355a = m18355a(windowManager);
        int i = m18355a.widthPixels;
        int i2 = m18355a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        return hashMap;
    }

    /* renamed from: a */
    JSONArray m18340a(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            m18342a(jSONArray, obj);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public JSONObject m18343a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m18341a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* renamed from: a */
    public void m18381a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public void m18380a(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
    }

    /* renamed from: a */
    public void m18377a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            intent.addFlags(AbstractC4808e.f17570a_);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    /* renamed from: a */
    public void m18376a(Context context, Uri uri) {
        try {
            Bundle bundle = new Bundle();
            if (C7788uf.f25851cC.m13486c().booleanValue() && C4696s.m23107g()) {
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(new Intent("android.intent.action.VIEW", uri).putExtras(bundle));
            String valueOf = String.valueOf(uri.toString());
            abr.a(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Opening ").append(valueOf).append(" in a new browser.").toString());
        } catch (ActivityNotFoundException e) {
            abr.b("No browser is found.", e);
        }
    }

    /* renamed from: a */
    public void m18371a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m18372a(context, str));
    }

    /* renamed from: a */
    public void m18370a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        m18368a(context, str, arrayList);
    }

    /* renamed from: a */
    public void m18369a(final Context context, @Nullable final String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            bundle.putString("device", C3779u.m26890e().m18320e());
            bundle.putString("eids", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, C7788uf.m13471a()));
        }
        C3514ac.m27586a().m26863a(context, str, str2, bundle, z, new C3780a.AbstractC3783a() { // from class: com.google.android.gms.internal.abv.3
            @Override // com.google.android.gms.ads.internal.util.client.C3780a.AbstractC3783a
            /* renamed from: a */
            public void mo18306a(String str3) {
                C3779u.m26890e().m18370a(context, str, str3);
            }
        });
    }

    /* renamed from: a */
    public void m18368a(Context context, String str, List<String> list) {
        for (String str2 : list) {
            Future future = (Future) new acg(context, str, str2).mo12820e();
        }
    }

    /* renamed from: a */
    public void m18367a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        m18366a(context, str, z, httpURLConnection, false);
    }

    /* renamed from: a */
    public void m18366a(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty(C11086e.f35703Y, m18372a(context, str));
        httpURLConnection.setUseCaches(z2);
    }

    /* renamed from: a */
    public void m18365a(final Context context, final List<String> list) {
        if ((context instanceof Activity) && !TextUtils.isEmpty(C7662rj.m13812a((Activity) context))) {
            if (list == null) {
                abr.m18409e("Cannot ping urls: empty list.");
            } else if (!C7811ut.m13414a(context)) {
                abr.m18409e("Cannot ping url because custom tabs is not supported");
            } else {
                final C7811ut c7811ut = new C7811ut();
                c7811ut.m13411a(new C7811ut.AbstractC7812a() { // from class: com.google.android.gms.internal.abv.1
                    @Override // com.google.android.gms.internal.C7811ut.AbstractC7812a
                    /* renamed from: a */
                    public void mo12935a() {
                        for (String str : list) {
                            String valueOf = String.valueOf(str);
                            abr.c(valueOf.length() != 0 ? "Pinging url: ".concat(valueOf) : new String("Pinging url: "));
                            c7811ut.m13413a(Uri.parse(str), null, null);
                        }
                        c7811ut.m13415a((Activity) context);
                    }

                    @Override // com.google.android.gms.internal.C7811ut.AbstractC7812a
                    /* renamed from: b */
                    public void mo12934b() {
                    }
                });
                c7811ut.m13409b((Activity) context);
            }
        }
    }

    /* renamed from: a */
    public void m18348a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f21039a.post(runnable);
        }
    }

    /* renamed from: a */
    public void m18344a(List<String> list, String str) {
        for (String str2 : list) {
            Future future = (Future) new acg(str2, str).mo12820e();
        }
    }

    /* renamed from: a */
    public boolean m18385a() {
        return this.f21041c;
    }

    /* renamed from: a */
    boolean m18384a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @TargetApi(24)
    /* renamed from: a */
    public boolean m18382a(Activity activity, Configuration configuration) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        C3780a m27586a = C3514ac.m27586a();
        int m26865a = m27586a.m26865a(activity, configuration.screenHeightDp);
        int m26865a2 = m27586a.m26865a(activity, configuration.screenWidthDp);
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", SystemMediaRouteProvider.PACKAGE_NAME);
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int intValue = C7788uf.f25858cJ.m13486c().intValue() * ((int) Math.round((displayMetrics.densityDpi / 160.0d) + 0.5d));
        return m18384a(displayMetrics.heightPixels, dimensionPixelSize + m26865a, intValue) && m18384a(displayMetrics.widthPixels, m26865a2, intValue);
    }

    /* renamed from: a */
    public boolean m18378a(Context context) {
        boolean z;
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.f13701a);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            abr.d("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
            abr.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboard"));
            z = false;
        } else {
            z = true;
        }
        if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
            abr.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboardHidden"));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
            abr.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "orientation"));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
            abr.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "screenLayout"));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
            abr.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "uiMode"));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
            abr.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", C10445j.f32462ah));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
            return z;
        }
        abr.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "smallestScreenSize"));
        return false;
    }

    /* renamed from: a */
    public boolean m18364a(PackageManager packageManager, String str, String str2) {
        return packageManager.checkPermission(str2, str) == 0;
    }

    /* renamed from: a */
    public boolean m18358a(View view, Context context) {
        KeyguardManager keyguardManager = null;
        Context applicationContext = context.getApplicationContext();
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return m18357a(view, powerManager, keyguardManager);
    }

    /* renamed from: a */
    public boolean m18357a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        return view.getVisibility() == 0 && view.isShown() && m18361a(powerManager) && (C3779u.m26890e().m18385a() || !m18379a(keyguardManager)) && (!C7788uf.f25750aH.m13486c().booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect()));
    }

    /* renamed from: a */
    public boolean m18349a(ClassLoader classLoader, Class<?> cls, String str) {
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
            return false;
        }
    }

    /* renamed from: a */
    public int[] m18383a(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? m18318f() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* renamed from: b */
    public int m18332b(@Nullable View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent != null) {
            return ((AdapterView) parent).getPositionForView(view);
        }
        return -1;
    }

    /* renamed from: b */
    public int m18330b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            abr.d(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Could not parse value:").append(valueOf).toString());
            return 0;
        }
    }

    /* renamed from: b */
    String m18339b() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            stringBuffer.append(" ").append(Build.VERSION.RELEASE);
        }
        stringBuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public String m18335b(Context context, String str) {
        try {
            return new String(C4692o.m23119a((InputStream) context.openFileInput(str), true), "UTF-8");
        } catch (IOException e) {
            abr.b("Error reading from internal storage.", e);
            return "";
        }
    }

    /* renamed from: b */
    public void m18337b(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window == null || window.getDecorView() == null || window.getDecorView().getViewTreeObserver() == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
    }

    /* renamed from: b */
    public void m18334b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e) {
            abr.b("Error writing to file in internal storage.", e);
        }
    }

    /* renamed from: b */
    public void m18333b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (C7788uf.f25754aL.m13486c().booleanValue()) {
            m18369a(context, str, str2, bundle, z);
        }
    }

    /* renamed from: b */
    public boolean m18336b(Context context) {
        if (this.f21043e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C6158a(), intentFilter);
        this.f21043e = true;
        return true;
    }

    /* renamed from: b */
    public int[] m18338b(Activity activity) {
        int[] m18383a = m18383a(activity);
        return new int[]{C3514ac.m27586a().m26852b(activity, m18383a[0]), C3514ac.m27586a().m26852b(activity, m18383a[1])};
    }

    /* renamed from: c */
    public String m18329c() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: c */
    protected String m18327c(Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }

    /* renamed from: c */
    public boolean m18325c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: c */
    public int[] m18328c(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? m18318f() : new int[]{findViewById.getTop(), findViewById.getBottom()};
    }

    /* renamed from: d */
    public AlertDialog.Builder m18322d(Context context) {
        return new AlertDialog.Builder(context);
    }

    /* renamed from: d */
    public String m18324d() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    /* renamed from: d */
    public int[] m18323d(Activity activity) {
        int[] m18328c = m18328c(activity);
        return new int[]{C3514ac.m27586a().m26852b(activity, m18328c[0]), C3514ac.m27586a().m26852b(activity, m18328c[1])};
    }

    /* renamed from: e */
    public C7774tx m18319e(Context context) {
        return new C7774tx(context);
    }

    /* renamed from: e */
    public String m18320e() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
    }

    /* renamed from: f */
    public String m18317f(Context context) {
        ActivityManager activityManager;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Exception e) {
        }
        if (activityManager == null) {
            return null;
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
        if (runningTasks != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
            return runningTaskInfo.topActivity.getClassName();
        }
        return null;
    }

    /* renamed from: f */
    protected int[] m18318f() {
        return new int[]{0, 0};
    }

    /* renamed from: g */
    public float m18316g() {
        BinderC3638o m27119a = C3779u.m26870y().m27119a();
        if (m27119a == null || !m27119a.m27262d()) {
            return 1.0f;
        }
        return m27119a.m27263c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r0.importance != 100) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1.inKeyguardRestrictedInputMode() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (m18307m(r7) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        return true;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m18315g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it2.next();
                if (Process.myPid() == next.pid) {
                    break;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003f -> B:11:0x0028). Please submit an issue!!! */
    /* renamed from: h */
    public Bitmap m18313h(Context context) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
        } catch (RuntimeException e) {
            abr.b("Fail to capture screen shot", e);
        }
        if (C7788uf.f25797bB.m13486c().booleanValue()) {
            Window window = ((Activity) context).getWindow();
            if (window != null) {
                bitmap = m18321d(window.getDecorView().getRootView());
            }
            bitmap = bitmap2;
        } else {
            bitmap = m18326c(((Activity) context).getWindow().getDecorView());
        }
        bitmap2 = bitmap;
        return bitmap2;
    }

    /* renamed from: h */
    public boolean m18314h() {
        BinderC3638o m27119a = C3779u.m26870y().m27119a();
        if (m27119a != null) {
            return m27119a.m27261e();
        }
        return false;
    }

    /* renamed from: i */
    public AudioManager m18311i(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: i */
    public Bundle m18312i() {
        Bundle bundle = new Bundle();
        try {
            if (C7788uf.f25718C.m13486c().booleanValue()) {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (C7788uf.f25719D.m13486c().booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
        } catch (Exception e) {
            abr.d("Unable to gather memory stats", e);
        }
        return bundle;
    }

    /* renamed from: j */
    public float m18310j(Context context) {
        AudioManager m18311i = m18311i(context);
        if (m18311i == null) {
            return 0.0f;
        }
        int streamMaxVolume = m18311i.getStreamMaxVolume(3);
        int streamVolume = m18311i.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    /* renamed from: k */
    public int m18309k(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    /* renamed from: l */
    public boolean m18308l(Context context) {
        try {
            context.getClassLoader().loadClass(ClientApi.class.getName());
            return false;
        } catch (ClassNotFoundException e) {
            return true;
        }
    }
}
