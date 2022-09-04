package p282m.framework.p284b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: m.framework.b.b */
/* loaded from: classes2.dex */
public class C10953b {

    /* renamed from: b */
    private static C10953b f35332b;

    /* renamed from: a */
    private Context f35333a;

    public C10953b(Context context) {
        this.f35333a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C10953b m2548a(Context context) {
        if (f35332b == null) {
            f35332b = new C10953b(context);
        }
        return f35332b;
    }

    /* renamed from: a */
    private boolean m2547a(PackageInfo packageInfo) {
        return ((packageInfo.applicationInfo.flags & 1) == 1) || ((packageInfo.applicationInfo.flags & 128) == 1);
    }

    /* renamed from: w */
    private boolean m2523w() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f35333a.getSystemService("phone");
        if (telephonyManager == null) {
            return false;
        }
        switch (telephonyManager.getNetworkType()) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return false;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return false;
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return true;
            case 11:
                return false;
            case 12:
                return true;
            case 13:
                return true;
            case 14:
                return true;
            case 15:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public String m2546a(String str, String str2) {
        Throwable th;
        String encodeToString;
        try {
            encodeToString = Base64.encodeToString(C10952a.m2559a(str2, str), 0);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            return encodeToString.contains("\n") ? encodeToString.replace("\n", "") : encodeToString;
        } catch (Throwable th3) {
            th = th3;
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public ArrayList<HashMap<String, String>> m2545a(boolean z) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            PackageManager packageManager = this.f35333a.getPackageManager();
            for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                if (z || !m2547a(packageInfo)) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("pkg", packageInfo.packageName);
                    hashMap.put("name", packageInfo.applicationInfo.loadLabel(packageManager).toString());
                    hashMap.put("version", packageInfo.versionName);
                    arrayList.add(hashMap);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean m2549a() {
        return false;
    }

    /* renamed from: b */
    public String m2544b() {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) this.f35333a.getSystemService("wifi");
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        String macAddress = connectionInfo.getMacAddress();
        if (macAddress == null) {
            macAddress = null;
        }
        return macAddress;
    }

    /* renamed from: c */
    public String m2543c() {
        return Build.MODEL;
    }

    /* renamed from: d */
    public String m2542d() {
        return Build.MANUFACTURER;
    }

    /* renamed from: e */
    public String m2541e() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f35333a.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        String deviceId = telephonyManager.getDeviceId();
        String str = "";
        if (deviceId != null) {
            str = new String(deviceId).replace("0", "");
        }
        if ((deviceId == null || str.length() <= 0) && Build.VERSION.SDK_INT >= 9) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                deviceId = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.serialno", "unknown");
            } catch (Throwable th) {
                th.printStackTrace();
                deviceId = null;
            }
        }
        return deviceId;
    }

    /* renamed from: f */
    public String m2540f() {
        return m2546a(String.valueOf(m2543c()) + "|" + m2539g() + "|" + m2542d() + "|" + m2537i() + "|" + m2538h(), m2532n().substring(0, 16));
    }

    /* renamed from: g */
    public String m2539g() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    /* renamed from: h */
    public String m2538h() {
        DisplayMetrics displayMetrics = this.f35333a.getResources().getDisplayMetrics();
        return this.f35333a.getResources().getConfiguration().orientation == 1 ? String.valueOf(displayMetrics.widthPixels) + "x" + displayMetrics.heightPixels : String.valueOf(displayMetrics.heightPixels) + "x" + displayMetrics.widthPixels;
    }

    /* renamed from: i */
    public String m2537i() {
        String simOperator = ((TelephonyManager) this.f35333a.getSystemService("phone")).getSimOperator();
        return TextUtils.isEmpty(simOperator) ? "-1" : simOperator;
    }

    /* renamed from: j */
    public String m2536j() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f35333a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (1 == type) {
            return "wifi";
        }
        if (type != 0) {
            return null;
        }
        String defaultHost = Proxy.getDefaultHost();
        String str = "";
        if (defaultHost != null && defaultHost.length() > 0) {
            str = " wap";
        }
        return String.valueOf(m2523w() ? "3G" : "2G") + str;
    }

    /* renamed from: k */
    public int m2535k() {
        return 1;
    }

    /* renamed from: l */
    public JSONArray m2534l() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        JSONArray jSONArray = new JSONArray();
        ActivityManager activityManager = (ActivityManager) this.f35333a.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                jSONArray.put(runningAppProcessInfo.processName);
            }
            return jSONArray;
        }
        return jSONArray;
    }

    /* renamed from: m */
    public String m2533m() {
        JSONArray m2534l = m2534l();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m2534l.length(); i++) {
            if (i > 0) {
                sb.append(C0494h.f736x);
            }
            sb.append(String.valueOf(m2534l.get(i)));
        }
        return sb.toString();
    }

    /* renamed from: n */
    public String m2532n() {
        try {
            String m2544b = m2544b();
            String m2541e = m2541e();
            return C10952a.m2556a(C10952a.m2560a(String.valueOf(m2544b) + ":" + m2541e + ":" + m2543c()));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    public String m2531o() {
        return this.f35333a.getPackageName();
    }

    /* renamed from: p */
    public String m2530p() {
        int i;
        String str = this.f35333a.getApplicationInfo().name;
        return (str == null && (i = this.f35333a.getApplicationInfo().labelRes) > 0) ? this.f35333a.getString(i) : str;
    }

    /* renamed from: q */
    public int m2529q() {
        try {
            return this.f35333a.getPackageManager().getPackageInfo(this.f35333a.getPackageName(), 0).versionCode;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    /* renamed from: r */
    public String m2528r() {
        try {
            return this.f35333a.getPackageManager().getPackageInfo(this.f35333a.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            th.printStackTrace();
            return "1.0";
        }
    }

    /* renamed from: s */
    public String m2527s() {
        return ((TelephonyManager) this.f35333a.getSystemService("phone")).getNetworkOperator();
    }

    /* renamed from: t */
    public String m2526t() {
        try {
            return ((ActivityManager) this.f35333a.getSystemService("activity")).getRunningTasks(1).get(0).topActivity.getPackageName();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: u */
    public boolean m2525u() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: v */
    public String m2524v() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }
}
