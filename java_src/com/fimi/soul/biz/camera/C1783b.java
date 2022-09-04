package com.fimi.soul.biz.camera;

import android.util.Log;
import com.fimi.kernel.C1642c;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.biz.camera.entity.X11SystemConfigOption;
import com.fimi.soul.biz.camera.p172a.C1781b;
import com.fimi.soul.biz.camera.p173b.AbstractC1787a;
import com.fimi.soul.biz.camera.p173b.AbstractC1789c;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.utils.C3129m;
import java.io.File;
import java.text.SimpleDateFormat;
/* renamed from: com.fimi.soul.biz.camera.b */
/* loaded from: classes.dex */
public class C1783b {

    /* renamed from: b */
    private static C1783b f4645b = new C1783b();

    /* renamed from: d */
    private static final String f4646d = "SP_KEY_IsDownloadAndDelete";

    /* renamed from: e */
    private static final String f4647e = "SP_KEY_IsTakePhotoByAPI";

    /* renamed from: a */
    private EnumC1786b f4648a = EnumC1786b.X11;

    /* renamed from: f */
    private AbstractC1779a[] f4650f = new AbstractC1779a[EnumC1786b.values().length];

    /* renamed from: c */
    private AbstractC1789c f4649c = new C1781b();

    /* renamed from: com.fimi.soul.biz.camera.b$a */
    /* loaded from: classes.dex */
    public enum EnumC1785a {
        Thumbnail,
        Video,
        Image,
        Other
    }

    /* renamed from: com.fimi.soul.biz.camera.b$b */
    /* loaded from: classes.dex */
    public enum EnumC1786b {
        X11,
        Ant,
        GoPro
    }

    private C1783b() {
    }

    /* renamed from: a */
    public static synchronized C1783b m34166a() {
        C1783b c1783b;
        synchronized (C1783b.class) {
            if (f4645b == null) {
                f4645b = new C1783b();
            }
            c1783b = f4645b;
        }
        return c1783b;
    }

    /* renamed from: a */
    public static String m34164a(X11FileInfo x11FileInfo) {
        return String.format("THUMB_%s", x11FileInfo.getName());
    }

    /* renamed from: a */
    public static String m34160a(String str) {
        return String.format("http://%s/%s", C1831e.m33977a(), str);
    }

    /* renamed from: a */
    public static String m34159a(String str, String str2) {
        return String.format("%s", str);
    }

    /* renamed from: a */
    public static void m34165a(DroidPlannerApp droidPlannerApp) {
        droidPlannerApp.f4493a.mo32908a(((C1827d) m34166a().m34150d()).m33986x());
    }

    /* renamed from: a */
    private static void m34163a(X11SystemConfig x11SystemConfig, String str, int i, String[] strArr) {
        m34162a(x11SystemConfig, str, i, strArr, strArr);
    }

    /* renamed from: a */
    private static void m34162a(X11SystemConfig x11SystemConfig, String str, int i, String[] strArr, String[] strArr2) {
        X11SystemConfigOption x11SystemConfigOption = new X11SystemConfigOption();
        x11SystemConfigOption.setType(str);
        x11SystemConfigOption.setOptions(strArr2);
        x11SystemConfigOption.setOptionsText(strArr);
        x11SystemConfigOption.setDefaultOption(strArr2[i]);
        x11SystemConfig.getSystemConfigOptions().put(str, x11SystemConfigOption);
    }

    /* renamed from: a */
    public static boolean m34161a(WifiDistanceFile wifiDistanceFile) {
        return m34151c(m34156b(wifiDistanceFile));
    }

    /* renamed from: b */
    public static String m34156b(WifiDistanceFile wifiDistanceFile) {
        String[] split = wifiDistanceFile.getName().split("\\.");
        try {
            Log.d("Good", "count" + split.length + "");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMddhhmmss");
            Log.d("Good", "date:" + wifiDistanceFile.getDateString());
            String format = String.format("%s_%s.%s", simpleDateFormat2.format(simpleDateFormat.parse(wifiDistanceFile.getDateString())), split[0], split[1]);
            Log.d("Good", "target file download:" + format);
            return format;
        } catch (Exception e) {
            return wifiDistanceFile.getName();
        }
    }

    /* renamed from: b */
    public static boolean m34155b(String str) {
        return new File(m34147e(str)).exists();
    }

    /* renamed from: c */
    public static String m34152c(WifiDistanceFile wifiDistanceFile) {
        return String.format("%s%s", C3129m.m29046u(), m34156b(wifiDistanceFile));
    }

    /* renamed from: c */
    public static boolean m34151c(String str) {
        File file = new File(m34149d(str));
        return file.exists() && file.length() > 0;
    }

    /* renamed from: d */
    public static String m34149d(String str) {
        return String.format("%s%s", C3129m.m29046u(), str);
    }

    /* renamed from: e */
    public static String m34147e(String str) {
        return String.format("%s%s", C3129m.m29053n(), str);
    }

    /* renamed from: f */
    public static EnumC1785a m34145f(String str) {
        if (str.toUpperCase().contains("THUMB_")) {
            return EnumC1785a.Thumbnail;
        }
        if (str.toLowerCase().contains(".mp4")) {
            return EnumC1785a.Video;
        }
        if (!str.toLowerCase().contains(".jpg")) {
            return null;
        }
        return EnumC1785a.Image;
    }

    /* renamed from: a */
    public void m34158a(boolean z) {
        C1642c.m34887c().mo34876a(f4647e, z);
    }

    /* renamed from: b */
    public void m34154b(boolean z) {
        C1642c.m34887c().mo34876a(f4646d, z);
    }

    /* renamed from: b */
    public boolean m34157b() {
        return C1642c.m34887c().mo34872d(f4647e);
    }

    /* renamed from: c */
    public boolean m34153c() {
        return C1642c.m34887c().mo34872d(f4646d);
    }

    /* renamed from: d */
    public AbstractC1787a m34150d() {
        int ordinal = this.f4648a.ordinal();
        switch (this.f4648a) {
            case X11:
                if (this.f4650f[ordinal] == null) {
                    this.f4650f[ordinal] = new C1827d(m34148e());
                    break;
                }
                break;
        }
        return this.f4650f[ordinal];
    }

    /* renamed from: e */
    public AbstractC1789c m34148e() {
        return this.f4649c;
    }

    /* renamed from: f */
    public EnumC1786b m34146f() {
        return this.f4648a;
    }
}
