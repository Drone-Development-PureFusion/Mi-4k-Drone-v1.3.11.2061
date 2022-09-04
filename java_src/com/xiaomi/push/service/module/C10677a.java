package com.xiaomi.push.service.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.android.C10389a;
import com.xiaomi.channel.commonutils.android.C10390b;
import com.xiaomi.channel.commonutils.android.C10392c;
import com.xiaomi.channel.commonutils.file.C10400a;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.mipush.sdk.MiPushClient;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import p070c.p072b.C0744a;
/* renamed from: com.xiaomi.push.service.module.a */
/* loaded from: classes2.dex */
class C10677a {

    /* renamed from: a */
    private Context f33167a;

    /* renamed from: b */
    private String f33168b;

    /* renamed from: c */
    private String f33169c;

    /* renamed from: d */
    private int f33170d = 0;

    /* renamed from: e */
    private int f33171e = 0;

    /* renamed from: f */
    private int f33172f = 0;

    /* renamed from: g */
    private String f33173g;

    /* renamed from: h */
    private SharedPreferences f33174h;

    public C10677a(Context context, String str) {
        boolean z = false;
        this.f33167a = context.getApplicationContext();
        this.f33168b = str;
        this.f33174h = this.f33167a.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        C0744a.m38267a(true, !TextUtils.isEmpty(this.f33168b) ? true : z);
    }

    /* renamed from: a */
    public static String m4194a(Context context, String str) {
        return m4189b(context, str) + "/" + str + ".apk";
    }

    /* renamed from: a */
    private String m4193a(String str) {
        try {
            return this.f33167a.getPackageManager().getPackageArchiveInfo(str, 16512).applicationInfo.metaData.getString("Launcher");
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    private void m4196a(int i) {
        this.f33174h.edit().putInt(this.f33168b + "_asset_app_version", i).commit();
    }

    /* renamed from: a */
    private void m4195a(long j) {
        this.f33174h.edit().putLong(this.f33168b + "_asset_modified", j).commit();
    }

    /* renamed from: b */
    private static String m4189b(Context context, String str) {
        return context.getDir(str, 0).getAbsolutePath();
    }

    /* renamed from: b */
    private void m4191b(int i) {
        this.f33174h.edit().putInt(this.f33168b + "_asset_version", i).commit();
    }

    /* renamed from: b */
    private void m4190b(long j) {
        this.f33174h.edit().putLong(this.f33168b + "_local_modified", j).commit();
    }

    /* renamed from: b */
    private void m4188b(String str) {
        this.f33174h.edit().putString(this.f33168b + "_asset_launcher", str).commit();
    }

    /* renamed from: c */
    private void m4186c(int i) {
        this.f33174h.edit().putInt(this.f33168b + "_local_version", i).commit();
    }

    /* renamed from: c */
    private void m4185c(String str) {
        this.f33174h.edit().putString(this.f33168b + "_local_launcher", str).commit();
    }

    /* renamed from: g */
    private boolean m4181g() {
        File file = new File(m4176l());
        return file.exists() && (m4169s() != file.lastModified() || m4171q() == 0);
    }

    /* renamed from: h */
    private boolean m4180h() {
        File file = new File(m4184d());
        return file.exists() && (m4168t() == file.lastModified() || m4170r() == 0);
    }

    /* renamed from: i */
    private boolean m4179i() {
        ParcelFileDescriptor parcelFileDescriptor;
        AssetFileDescriptor assetFileDescriptor;
        Exception exc;
        AssetFileDescriptor openFd;
        boolean z = false;
        File file = new File(m4176l());
        if (file.exists()) {
            AssetFileDescriptor assetFileDescriptor2 = null;
            try {
                try {
                    try {
                        openFd = this.f33167a.getAssets().openFd(this.f33168b + ".apk");
                    } catch (Exception e) {
                        assetFileDescriptor = null;
                        exc = e;
                    }
                    try {
                        if (openFd.getLength() != file.length()) {
                            z = true;
                        }
                    } catch (Exception e2) {
                        assetFileDescriptor = openFd;
                        exc = e2;
                        try {
                            exc.printStackTrace();
                            if (assetFileDescriptor != null) {
                                parcelFileDescriptor = assetFileDescriptor.getParcelFileDescriptor();
                                C10400a.m5289a(parcelFileDescriptor);
                            }
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            assetFileDescriptor2 = assetFileDescriptor;
                            if (assetFileDescriptor2 != null) {
                                C10400a.m5289a(assetFileDescriptor2.getParcelFileDescriptor());
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e3) {
                    AbstractC10404b.m5264d("no " + this.f33168b + ".apk file in assets of app");
                    if (0 != 0) {
                        parcelFileDescriptor = assetFileDescriptor2.getParcelFileDescriptor();
                    }
                }
                if (openFd != null) {
                    parcelFileDescriptor = openFd.getParcelFileDescriptor();
                    C10400a.m5289a(parcelFileDescriptor);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return z;
    }

    /* renamed from: j */
    private void m4178j() {
        String str;
        try {
            try {
                AbstractC10404b.m5266b("copyAssetFile start");
                String[] list = this.f33167a.getAssets().list("");
                if (list != null) {
                    for (String str2 : list) {
                        if (!TextUtils.isEmpty(str2) && str2.startsWith(this.f33168b)) {
                            C10392c.m5317a(this.f33167a, str2, m4176l());
                            str = "copyAssetFile end";
                            break;
                        }
                    }
                }
                str = "copyAssetFile end";
            } catch (Exception e) {
                e.printStackTrace();
                str = "copyAssetFile end";
            }
            AbstractC10404b.m5266b(str);
        } catch (Throwable th) {
            AbstractC10404b.m5266b("copyAssetFile end");
            throw th;
        }
    }

    /* renamed from: k */
    private String m4177k() {
        return m4189b(this.f33167a, this.f33168b);
    }

    /* renamed from: l */
    private String m4176l() {
        return m4177k() + "/" + this.f33168b + "_asset.apk";
    }

    /* renamed from: m */
    private String m4175m() {
        return m4177k() + "/lib/";
    }

    /* renamed from: n */
    private String m4174n() {
        return m4177k() + "/asset_lib/";
    }

    /* renamed from: o */
    private boolean m4173o() {
        try {
            return m4172p() != C10390b.m5325b(this.f33167a, this.f33167a.getPackageName());
        } catch (Exception e) {
            return true;
        }
    }

    /* renamed from: p */
    private int m4172p() {
        try {
            return this.f33174h.getInt(this.f33168b + "_asset_app_version", 0);
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: q */
    private int m4171q() {
        try {
            return this.f33174h.getInt(this.f33168b + "_asset_version", 0);
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: r */
    private int m4170r() {
        try {
            return this.f33174h.getInt(this.f33168b + "_local_version", 0);
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: s */
    private long m4169s() {
        try {
            return this.f33174h.getLong(this.f33168b + "_asset_modified", 0L);
        } catch (Exception e) {
            return 0L;
        }
    }

    /* renamed from: t */
    private long m4168t() {
        try {
            return this.f33174h.getLong(this.f33168b + "_local_modified", 0L);
        } catch (Exception e) {
            return 0L;
        }
    }

    /* renamed from: u */
    private String m4167u() {
        try {
            return this.f33174h.getString(this.f33168b + "_asset_launcher", null);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: v */
    private String m4166v() {
        try {
            return this.f33174h.getString(this.f33168b + "_local_launcher", null);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public int m4197a() {
        return this.f33170d;
    }

    /* renamed from: b */
    public String m4192b() {
        return this.f33173g;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5 A[Catch: Exception -> 0x0184, all -> 0x022e, TryCatch #1 {Exception -> 0x0184, blocks: (B:5:0x0003, B:8:0x0046, B:10:0x0054, B:12:0x005a, B:15:0x0067, B:17:0x0166, B:18:0x006d, B:19:0x0096, B:21:0x00a5, B:23:0x00ab, B:24:0x00bf, B:26:0x00f5, B:28:0x00fb, B:30:0x0107, B:31:0x011f, B:36:0x017d, B:39:0x01b3, B:41:0x01b9, B:43:0x01c5, B:44:0x01dd, B:46:0x0227, B:47:0x0174, B:50:0x004c), top: B:4:0x0003, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5 A[Catch: Exception -> 0x0184, all -> 0x022e, TryCatch #1 {Exception -> 0x0184, blocks: (B:5:0x0003, B:8:0x0046, B:10:0x0054, B:12:0x005a, B:15:0x0067, B:17:0x0166, B:18:0x006d, B:19:0x0096, B:21:0x00a5, B:23:0x00ab, B:24:0x00bf, B:26:0x00f5, B:28:0x00fb, B:30:0x0107, B:31:0x011f, B:36:0x017d, B:39:0x01b3, B:41:0x01b9, B:43:0x01c5, B:44:0x01dd, B:46:0x0227, B:47:0x0174, B:50:0x004c), top: B:4:0x0003, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b3 A[Catch: Exception -> 0x0184, all -> 0x022e, TRY_ENTER, TryCatch #1 {Exception -> 0x0184, blocks: (B:5:0x0003, B:8:0x0046, B:10:0x0054, B:12:0x005a, B:15:0x0067, B:17:0x0166, B:18:0x006d, B:19:0x0096, B:21:0x00a5, B:23:0x00ab, B:24:0x00bf, B:26:0x00f5, B:28:0x00fb, B:30:0x0107, B:31:0x011f, B:36:0x017d, B:39:0x01b3, B:41:0x01b9, B:43:0x01c5, B:44:0x01dd, B:46:0x0227, B:47:0x0174, B:50:0x004c), top: B:4:0x0003, outer: #0 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized DexClassLoader m4187c() {
        DexClassLoader dexClassLoader;
        String m4176l;
        File file;
        boolean m4179i;
        boolean z;
        File file2;
        boolean z2 = true;
        synchronized (this) {
            try {
                AbstractC10404b.m5266b("load apk " + this.f33168b);
                m4176l = m4176l();
                file = new File(m4176l);
                m4179i = m4179i();
                AbstractC10404b.m5266b("assert app size changed : " + m4179i);
                if (!file.exists() || m4179i || m4173o()) {
                    AbstractC10404b.m5266b("re-copy asset file");
                    m4178j();
                }
            } catch (Exception e) {
                AbstractC10404b.m5267a(e);
                AbstractC10404b.m5266b("load apk : " + this.f33169c + ", version : " + this.f33170d);
                AbstractC10404b.m5266b("load apk done.");
            }
            if (file.exists()) {
                AbstractC10404b.m5266b("check modify.");
                if (m4181g() || m4179i || m4173o()) {
                    AbstractC10404b.m5266b("modified.");
                    this.f33171e = C10390b.m5323c(this.f33167a, m4176l);
                    m4191b(this.f33171e);
                    m4196a(C10390b.m5325b(this.f33167a, this.f33167a.getPackageName()));
                    m4195a(file.lastModified());
                    z = true;
                    String m4184d = m4184d();
                    file2 = new File(m4184d);
                    if (file2.exists()) {
                        if (m4180h()) {
                            this.f33172f = C10390b.m5323c(this.f33167a, m4184d);
                            m4186c(this.f33172f);
                            m4190b(file2.lastModified());
                            AbstractC10404b.m5266b("asset version " + this.f33171e);
                            AbstractC10404b.m5266b("local version " + this.f33172f);
                            if (this.f33171e >= this.f33172f) {
                                if (this.f33171e > this.f33170d) {
                                    this.f33170d = this.f33171e;
                                    this.f33169c = m4176l();
                                    if (z) {
                                        this.f33173g = m4193a(this.f33169c);
                                        m4188b(this.f33173g);
                                        C10389a.m5333a(this.f33167a, this.f33169c, m4174n());
                                    } else {
                                        this.f33173g = m4167u();
                                    }
                                    dexClassLoader = new DexClassLoader(this.f33169c, this.f33167a.getDir("dex", 0).getAbsolutePath(), m4174n(), ClassLoader.getSystemClassLoader());
                                    AbstractC10404b.m5266b("load apk : " + this.f33169c + ", version : " + this.f33170d);
                                    AbstractC10404b.m5266b("load apk done.");
                                }
                                AbstractC10404b.m5266b("load apk : " + this.f33169c + ", version : " + this.f33170d);
                                AbstractC10404b.m5266b("load apk done.");
                                dexClassLoader = null;
                            } else {
                                if (this.f33172f > this.f33170d) {
                                    this.f33170d = this.f33172f;
                                    this.f33169c = m4184d();
                                    if (z2) {
                                        this.f33173g = m4193a(this.f33169c);
                                        m4185c(this.f33173g);
                                        C10389a.m5333a(this.f33167a, this.f33169c, m4175m());
                                    } else {
                                        this.f33173g = m4166v();
                                    }
                                    dexClassLoader = new DexClassLoader(this.f33169c, this.f33167a.getDir("dex", 0).getAbsolutePath(), m4175m(), ClassLoader.getSystemClassLoader());
                                    AbstractC10404b.m5266b("load apk : " + this.f33169c + ", version : " + this.f33170d);
                                    AbstractC10404b.m5266b("load apk done.");
                                }
                                AbstractC10404b.m5266b("load apk : " + this.f33169c + ", version : " + this.f33170d);
                                AbstractC10404b.m5266b("load apk done.");
                                dexClassLoader = null;
                            }
                        } else {
                            this.f33172f = m4170r();
                        }
                    }
                    z2 = false;
                    AbstractC10404b.m5266b("asset version " + this.f33171e);
                    AbstractC10404b.m5266b("local version " + this.f33172f);
                    if (this.f33171e >= this.f33172f) {
                    }
                } else {
                    AbstractC10404b.m5266b("not modified.");
                    this.f33171e = m4171q();
                }
            }
            z = false;
            String m4184d2 = m4184d();
            file2 = new File(m4184d2);
            if (file2.exists()) {
            }
            z2 = false;
            AbstractC10404b.m5266b("asset version " + this.f33171e);
            AbstractC10404b.m5266b("local version " + this.f33172f);
            if (this.f33171e >= this.f33172f) {
            }
        }
        return dexClassLoader;
    }

    /* renamed from: d */
    public String m4184d() {
        return m4194a(this.f33167a, this.f33168b);
    }

    /* renamed from: e */
    public String m4183e() {
        return this.f33168b;
    }

    /* renamed from: f */
    public String m4182f() {
        return this.f33169c;
    }
}
