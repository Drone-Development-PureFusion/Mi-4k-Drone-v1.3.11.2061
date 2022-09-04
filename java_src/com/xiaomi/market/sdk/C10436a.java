package com.xiaomi.market.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.fimi.soul.media.player.IMediaPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.p356d.AbstractC11759f;
/* renamed from: com.xiaomi.market.sdk.a */
/* loaded from: classes2.dex */
public class C10436a {
    static String COUNTRY;
    static String LANGUAGE;
    static String RELEASE;

    /* renamed from: a */
    static final int f32395a = 0;

    /* renamed from: b */
    static int f32396b;

    /* renamed from: c */
    static int f32397c;

    /* renamed from: d */
    static String f32398d;

    /* renamed from: e */
    static int f32399e;

    /* renamed from: f */
    static int f32400f;

    /* renamed from: g */
    static String f32401g;

    /* renamed from: h */
    static ArrayList f32402h;

    /* renamed from: i */
    static ArrayList f32403i;

    /* renamed from: j */
    static ArrayList f32404j;

    /* renamed from: k */
    static int f32405k;

    /* renamed from: l */
    static String f32406l;

    /* renamed from: m */
    static String f32407m;

    /* renamed from: n */
    static String f32408n;

    /* renamed from: o */
    private static final Object f32409o = new Object();

    /* renamed from: a */
    private static void m5156a() {
        String m5154b = m5154b();
        synchronized (f32409o) {
            f32404j = new ArrayList();
            if (!TextUtils.isEmpty(m5154b)) {
                String[] split = TextUtils.split(m5154b, " ");
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        f32404j.add(str);
                    }
                }
            }
            Collections.sort(f32404j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m5155a(Context context) {
        m5153b(context);
        m5151c(context);
        m5149d(context);
        m5148e(context);
        m5156a();
        m5147f(context);
        m5146g(context);
        m5145h(context);
    }

    /* renamed from: b */
    private static String m5154b() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY && egl10.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!egl10.eglChooseConfig(eglGetDisplay, new int[]{12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, eGLConfigArr, 1, iArr)) {
                return null;
            }
            EGLConfig eGLConfig = iArr[0] > 0 ? eGLConfigArr[0] : null;
            EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, null);
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 480, 12374, IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, 12344});
            if (eglCreatePbufferSurface == null || eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE) {
                return null;
            }
            egl10.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
            if (!egl10.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                return null;
            }
            String glGetString = ((GL10) eglCreateContext.getGL()).glGetString(7939);
            egl10.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
            egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
            egl10.eglTerminate(eglGetDisplay);
            if (glGetString == null) {
                return null;
            }
            return glGetString.trim();
        }
        return null;
    }

    /* renamed from: b */
    private static void m5153b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        f32397c = displayMetrics.heightPixels;
        f32396b = displayMetrics.widthPixels;
        f32398d = String.valueOf(f32397c) + AbstractC11759f.f37104a + f32396b;
        f32399e = displayMetrics.densityDpi;
    }

    /* renamed from: c */
    private static void m5151c(Context context) {
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo();
        f32400f = deviceConfigurationInfo.reqTouchScreen;
        f32401g = deviceConfigurationInfo.getGlEsVersion();
    }

    /* renamed from: c */
    static boolean m5152c() {
        return f32405k >= 13;
    }

    /* renamed from: d */
    private static void m5149d(Context context) {
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        synchronized (f32409o) {
            f32402h = new ArrayList();
            if (systemAvailableFeatures != null) {
                for (FeatureInfo featureInfo : systemAvailableFeatures) {
                    if (!TextUtils.isEmpty(featureInfo.name)) {
                        f32402h.add(featureInfo.name);
                    }
                }
            }
            Collections.sort(f32402h);
        }
    }

    /* renamed from: d */
    static boolean m5150d() {
        return f32405k >= 11;
    }

    /* renamed from: e */
    private static void m5148e(Context context) {
        String[] systemSharedLibraryNames = context.getPackageManager().getSystemSharedLibraryNames();
        synchronized (f32409o) {
            f32403i = new ArrayList();
            if (systemSharedLibraryNames != null) {
                for (String str : systemSharedLibraryNames) {
                    if (!TextUtils.isEmpty(str)) {
                        f32403i.add(str);
                    }
                }
            }
            Collections.sort(f32403i);
        }
    }

    /* renamed from: f */
    private static void m5147f(Context context) {
        RELEASE = Build.VERSION.RELEASE;
        f32406l = Build.VERSION.INCREMENTAL;
        f32405k = Build.VERSION.SDK_INT;
    }

    /* renamed from: g */
    private static void m5146g(Context context) {
        COUNTRY = Locale.getDefault().getCountry();
        LANGUAGE = Locale.getDefault().getLanguage();
    }

    /* renamed from: h */
    private static void m5145h(Context context) {
        String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        String str = TextUtils.isEmpty(deviceId) ? "" : deviceId;
        f32407m = str;
        String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        StringBuffer stringBuffer = new StringBuffer();
        if (!TextUtils.isEmpty(str)) {
            stringBuffer.append(str);
        }
        if (!TextUtils.isEmpty(macAddress)) {
            stringBuffer.append("_");
            stringBuffer.append(macAddress);
        }
        f32408n = C10437b.m5142a(stringBuffer.toString());
    }
}
