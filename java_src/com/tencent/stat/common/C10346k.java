package com.tencent.stat.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tencent.stat.StatConfig;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpHost;
import org.codehaus.jackson.smile.SmileConstants;
import org.json.JSONObject;
/* renamed from: com.tencent.stat.common.k */
/* loaded from: classes2.dex */
public class C10346k {

    /* renamed from: a */
    private static String f32254a = null;

    /* renamed from: b */
    private static String f32255b = null;

    /* renamed from: c */
    private static String f32256c = null;

    /* renamed from: d */
    private static String f32257d = null;

    /* renamed from: e */
    private static Random f32258e = null;

    /* renamed from: f */
    private static StatLogger f32259f = null;

    /* renamed from: g */
    private static String f32260g = null;

    /* renamed from: h */
    private static C10347l f32261h = null;

    /* renamed from: i */
    private static C10349n f32262i = null;

    /* renamed from: j */
    private static String f32263j = "__MTA_FIRST_ACTIVATE__";

    /* renamed from: k */
    private static int f32264k = -1;

    /* renamed from: A */
    public static String m5440A(Context context) {
        List<Sensor> sensorList;
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < sensorList.size(); i++) {
                    sb.append(sensorList.get(i).getType());
                    if (i != sensorList.size() - 1) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
                return sb.toString();
            }
        } catch (Throwable th) {
            f32259f.m5464e(th);
        }
        return "";
    }

    /* renamed from: B */
    public static WifiInfo m5439B(Context context) {
        WifiManager wifiManager;
        if (!m5430a(context, "android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) == null) {
            return null;
        }
        return wifiManager.getConnectionInfo();
    }

    /* renamed from: C */
    public static String m5438C(Context context) {
        try {
            WifiInfo m5439B = m5439B(context);
            if (m5439B != null) {
                return m5439B.getBSSID();
            }
        } catch (Throwable th) {
            f32259f.m5464e(th);
        }
        return null;
    }

    /* renamed from: D */
    public static String m5437D(Context context) {
        try {
            WifiInfo m5439B = m5439B(context);
            if (m5439B != null) {
                return m5439B.getSSID();
            }
        } catch (Throwable th) {
            f32259f.m5464e(th);
        }
        return null;
    }

    /* renamed from: E */
    public static synchronized int m5436E(Context context) {
        int i;
        synchronized (C10346k.class) {
            if (f32264k != -1) {
                i = f32264k;
            } else {
                m5435F(context);
                i = f32264k;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static void m5435F(Context context) {
        f32264k = C10351p.m5382a(context, f32263j, 1);
        f32259f.m5464e(Integer.valueOf(f32264k));
        if (f32264k == 1) {
            C10351p.m5379b(context, f32263j, 0);
        }
    }

    /* renamed from: G */
    private static long m5434G(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: a */
    public static int m5433a() {
        return m5409h().nextInt(Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static Long m5428a(String str, String str2, int i, int i2, Long l) {
        if (str == null || str2 == null) {
            return l;
        }
        if (str2.equalsIgnoreCase(".") || str2.equalsIgnoreCase("|")) {
            str2 = "\\" + str2;
        }
        String[] split = str.split(str2);
        if (split.length != i2) {
            return l;
        }
        try {
            Long l2 = 0L;
            int i3 = 0;
            while (i3 < split.length) {
                Long valueOf = Long.valueOf(i * (l2.longValue() + Long.valueOf(split[i3]).longValue()));
                i3++;
                l2 = valueOf;
            }
            return l2;
        } catch (NumberFormatException e) {
            return l;
        }
    }

    /* renamed from: a */
    public static String m5432a(long j) {
        return new SimpleDateFormat("yyyyMMdd").format(new Date(j));
    }

    /* renamed from: a */
    public static String m5429a(String str) {
        if (str == null) {
            return "0";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                int i = b & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
                if (i < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i));
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            return "0";
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006b -> B:10:0x0004). Please submit an issue!!! */
    /* renamed from: a */
    public static HttpHost m5431a(Context context) {
        HttpHost httpHost;
        if (context == null) {
            return null;
        }
        try {
        } catch (Throwable th) {
            f32259f.m5464e(th);
        }
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            httpHost = null;
        } else {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                httpHost = null;
            } else if (activeNetworkInfo.getTypeName() == null || !activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                String extraInfo = activeNetworkInfo.getExtraInfo();
                if (extraInfo == null) {
                    httpHost = null;
                } else if (extraInfo.equals("cmwap") || extraInfo.equals("3gwap") || extraInfo.equals("uniwap")) {
                    httpHost = new HttpHost("10.0.0.172", 80);
                } else {
                    if (extraInfo.equals("ctwap")) {
                        httpHost = new HttpHost("10.0.0.200", 80);
                    }
                    httpHost = null;
                }
            } else {
                httpHost = null;
            }
        }
        return httpHost;
    }

    /* renamed from: a */
    public static void m5427a(JSONObject jSONObject, String str, String str2) {
        if (str2 != null) {
            try {
                if (str2.length() <= 0) {
                    return;
                }
                jSONObject.put(str, str2);
            } catch (Throwable th) {
                f32259f.m5464e(th);
            }
        }
    }

    /* renamed from: a */
    public static boolean m5430a(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th) {
            f32259f.m5464e(th);
            return false;
        }
    }

    /* renamed from: a */
    public static byte[] m5426a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length * 2);
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayInputStream.close();
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(bArr2, 0, read);
        }
    }

    /* renamed from: b */
    public static long m5422b(String str) {
        return m5428a(str, ".", 100, 3, 0L).longValue();
    }

    /* renamed from: b */
    public static synchronized StatLogger m5425b() {
        StatLogger statLogger;
        synchronized (C10346k.class) {
            if (f32259f == null) {
                f32259f = new StatLogger("MtaSDK");
                f32259f.setDebugEnable(false);
            }
            statLogger = f32259f;
        }
        return statLogger;
    }

    /* renamed from: b */
    public static synchronized String m5424b(Context context) {
        String str;
        synchronized (C10346k.class) {
            if (f32254a == null || f32254a.trim().length() == 0) {
                f32254a = m5403l(context);
                if (f32254a == null || f32254a.trim().length() == 0) {
                    f32254a = Integer.toString(m5409h().nextInt(Integer.MAX_VALUE));
                }
                str = f32254a;
            } else {
                str = f32254a;
            }
        }
        return str;
    }

    /* renamed from: b */
    public static String m5423b(Context context, String str) {
        if (StatConfig.isEnableConcurrentProcess()) {
            if (f32260g == null) {
                f32260g = m5394u(context);
            }
            return f32260g != null ? str + "_" + f32260g : str;
        }
        return str;
    }

    /* renamed from: c */
    public static long m5421c() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis() + 86400000;
        } catch (Throwable th) {
            f32259f.m5464e(th);
            return System.currentTimeMillis() + 86400000;
        }
    }

    /* renamed from: c */
    public static synchronized String m5420c(Context context) {
        String str;
        synchronized (C10346k.class) {
            if (f32256c == null || "" == f32256c) {
                f32256c = m5412f(context);
            }
            str = f32256c;
        }
        return str;
    }

    /* renamed from: c */
    public static String m5419c(String str) {
        if (str == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(C10342g.m5444b(C10340e.m5454a(str.getBytes("UTF-8")), 0), "UTF-8");
        } catch (Throwable th) {
            f32259f.m5464e(th);
            return str;
        }
    }

    /* renamed from: d */
    public static int m5418d() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: d */
    public static DisplayMetrics m5417d(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: d */
    public static String m5416d(String str) {
        if (str == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(C10340e.m5452b(C10342g.m5446a(str.getBytes("UTF-8"), 0)), "UTF-8");
        } catch (Throwable th) {
            f32259f.m5464e(th);
            return str;
        }
    }

    /* renamed from: e */
    public static String m5415e() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return String.valueOf((statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1000000) + "/" + String.valueOf(m5413f() / 1000000);
    }

    /* renamed from: e */
    public static boolean m5414e(Context context) {
        NetworkInfo[] allNetworkInfo;
        try {
        } catch (Throwable th) {
            f32259f.m5464e(th);
        }
        if (!m5430a(context, "android.permission.ACCESS_WIFI_STATE")) {
            f32259f.warn("can not get the permission of android.permission.ACCESS_WIFI_STATE");
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager != null && (allNetworkInfo = connectivityManager.getAllNetworkInfo()) != null) {
            for (int i = 0; i < allNetworkInfo.length; i++) {
                if (allNetworkInfo[i].getTypeName().equalsIgnoreCase("WIFI") && allNetworkInfo[i].isConnected()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static long m5413f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCount() * statFs.getBlockSize();
    }

    /* renamed from: f */
    public static String m5412f(Context context) {
        if (!m5430a(context, "android.permission.ACCESS_WIFI_STATE")) {
            f32259f.m5464e("Could not get permission of android.permission.ACCESS_WIFI_STATE");
            return "";
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            return wifiManager == null ? "" : wifiManager.getConnectionInfo().getMacAddress();
        } catch (Exception e) {
            f32259f.m5465e(e);
            return "";
        }
    }

    /* renamed from: g */
    public static boolean m5410g(Context context) {
        try {
            if (!m5430a(context, "android.permission.INTERNET") || !m5430a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                f32259f.warn("can not get the permisson of android.permission.INTERNET");
            } else {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI");
                }
            }
        } catch (Throwable th) {
            f32259f.m5464e(th);
        }
        return false;
    }

    /* renamed from: h */
    private static synchronized Random m5409h() {
        Random random;
        synchronized (C10346k.class) {
            if (f32258e == null) {
                f32258e = new Random();
            }
            random = f32258e;
        }
        return random;
    }

    /* renamed from: h */
    public static boolean m5408h(Context context) {
        try {
            if (!m5430a(context, "android.permission.INTERNET") || !m5430a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                f32259f.warn("can not get the permisson of android.permission.INTERNET");
            } else {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                        return true;
                    }
                    f32259f.m5461w("Network error");
                    return false;
                }
            }
        } catch (Throwable th) {
        }
        return false;
    }

    /* renamed from: i */
    private static long m5407i() {
        long j = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            j = Integer.valueOf(bufferedReader.readLine().split("\\s+")[1]).intValue() * 1024;
            bufferedReader.close();
            return j;
        } catch (IOException e) {
            return j;
        }
    }

    /* renamed from: i */
    public static String m5406i(Context context) {
        if (f32255b != null) {
            return f32255b;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                String string = applicationInfo.metaData.getString("TA_APPKEY");
                if (string != null) {
                    f32255b = string;
                    return string;
                }
                f32259f.m5461w("Could not read APPKEY meta-data from AndroidManifest.xml");
            }
        } catch (Throwable th) {
            f32259f.m5461w("Could not read APPKEY meta-data from AndroidManifest.xml");
        }
        return null;
    }

    /* renamed from: j */
    public static String m5405j(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                Object obj = applicationInfo.metaData.get("InstallChannel");
                if (obj != null) {
                    return obj.toString();
                }
                f32259f.m5461w("Could not read InstallChannel meta-data from AndroidManifest.xml");
            }
        } catch (Throwable th) {
            f32259f.m5464e("Could not read InstallChannel meta-data from AndroidManifest.xml");
        }
        return null;
    }

    /* renamed from: k */
    public static String m5404k(Context context) {
        if (context == null) {
            return null;
        }
        return context.getClass().getName();
    }

    /* renamed from: l */
    public static String m5403l(Context context) {
        try {
            if (m5430a(context, "android.permission.READ_PHONE_STATE")) {
                String str = "";
                if (m5400o(context)) {
                    str = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                }
                if (str != null) {
                    return str;
                }
            } else {
                f32259f.m5464e("Could not get permission of android.permission.READ_PHONE_STATE");
            }
        } catch (Throwable th) {
            f32259f.m5464e(th);
        }
        return null;
    }

    /* renamed from: m */
    public static String m5402m(Context context) {
        try {
            if (!m5430a(context, "android.permission.READ_PHONE_STATE")) {
                f32259f.m5464e("Could not get permission of android.permission.READ_PHONE_STATE");
                return null;
            } else if (!m5400o(context)) {
                return null;
            } else {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                return telephonyManager != null ? telephonyManager.getSimOperator() : null;
            }
        } catch (Throwable th) {
            f32259f.m5464e(th);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:7:0x0020
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    /* renamed from: n */
    public static java.lang.String m5401n(android.content.Context r5) {
        /*
            java.lang.String r1 = ""
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L16
            r3 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L15
            java.lang.String r0 = ""
        L15:
            return r0
        L16:
            r0 = move-exception
            r4 = r0
            r0 = r1
            r1 = r4
        L1a:
            com.tencent.stat.common.StatLogger r2 = com.tencent.stat.common.C10346k.f32259f
            r2.m5464e(r1)
            goto L15
        L20:
            r1 = move-exception
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.stat.common.C10346k.m5401n(android.content.Context):java.lang.String");
    }

    /* renamed from: o */
    public static boolean m5400o(Context context) {
        return context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0;
    }

    /* renamed from: p */
    public static String m5399p(Context context) {
        try {
            if (!m5430a(context, "android.permission.INTERNET") || !m5430a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                f32259f.m5464e("can not get the permission of android.permission.ACCESS_WIFI_STATE");
            } else {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    String typeName = activeNetworkInfo.getTypeName();
                    String extraInfo = activeNetworkInfo.getExtraInfo();
                    if (typeName != null) {
                        return typeName.equalsIgnoreCase("WIFI") ? "WIFI" : typeName.equalsIgnoreCase("MOBILE") ? extraInfo == null ? "MOBILE" : extraInfo : extraInfo == null ? typeName : extraInfo;
                    }
                }
            }
        } catch (Throwable th) {
            f32259f.m5464e(th);
        }
        return null;
    }

    /* renamed from: q */
    public static Integer m5398q(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return Integer.valueOf(telephonyManager.getNetworkType());
            }
        } catch (Throwable th) {
        }
        return null;
    }

    /* renamed from: r */
    public static String m5397r(Context context) {
        String str;
        Throwable th;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        return str;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f32259f.m5464e(th);
                    return str;
                }
            }
            return "unknown";
        } catch (Throwable th3) {
            str = "";
            th = th3;
        }
    }

    /* renamed from: s */
    public static int m5396s(Context context) {
        try {
        } catch (Throwable th) {
            f32259f.m5464e(th);
        }
        return C10350o.m5384a() ? 1 : 0;
    }

    /* renamed from: t */
    public static String m5395t(Context context) {
        String path;
        String str = null;
        try {
            if (m5430a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                String externalStorageState = Environment.getExternalStorageState();
                if (externalStorageState != null && externalStorageState.equals("mounted") && (path = Environment.getExternalStorageDirectory().getPath()) != null) {
                    StatFs statFs = new StatFs(path);
                    str = String.valueOf((statFs.getBlockSize() * statFs.getAvailableBlocks()) / 1000000) + "/" + String.valueOf((statFs.getBlockCount() * statFs.getBlockSize()) / 1000000);
                }
            } else {
                f32259f.warn("can not get the permission of android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } catch (Throwable th) {
            f32259f.m5464e(th);
        }
        return str;
    }

    /* renamed from: u */
    static String m5394u(Context context) {
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        } catch (Throwable th) {
        }
        return null;
    }

    /* renamed from: v */
    public static String m5393v(Context context) {
        return m5423b(context, StatConstants.f32207a);
    }

    /* renamed from: w */
    public static synchronized Integer m5392w(Context context) {
        Integer valueOf;
        int i = 0;
        synchronized (C10346k.class) {
            int m5382a = C10351p.m5382a(context, "MTA_EVENT_INDEX", 0);
            if (m5382a < 2147483646) {
                i = m5382a;
            }
            C10351p.m5379b(context, "MTA_EVENT_INDEX", i + 1);
            valueOf = Integer.valueOf(i + 1);
        }
        return valueOf;
    }

    /* renamed from: x */
    public static String m5391x(Context context) {
        return String.valueOf(m5434G(context) / 1000000) + "/" + String.valueOf(m5407i() / 1000000);
    }

    /* renamed from: y */
    public static synchronized C10347l m5390y(Context context) {
        C10347l c10347l;
        synchronized (C10346k.class) {
            if (f32261h == null) {
                f32261h = new C10347l();
            }
            c10347l = f32261h;
        }
        return c10347l;
    }

    /* renamed from: z */
    public static JSONObject m5389z(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            m5390y(context);
            int m5387b = C10347l.m5387b();
            if (m5387b > 0) {
                jSONObject.put("fx", m5387b / 1000000);
            }
            m5390y(context);
            int m5386c = C10347l.m5386c();
            if (m5386c > 0) {
                jSONObject.put("fn", m5386c / 1000000);
            }
            m5390y(context);
            int m5388a = C10347l.m5388a();
            if (m5388a > 0) {
                jSONObject.put("n", m5388a);
            }
            m5390y(context);
            String m5385d = C10347l.m5385d();
            if (m5385d != null && m5385d.length() == 0) {
                m5390y(context);
                jSONObject.put("na", C10347l.m5385d());
            }
        } catch (Exception e) {
            f32259f.m5465e(e);
        }
        return jSONObject;
    }
}
