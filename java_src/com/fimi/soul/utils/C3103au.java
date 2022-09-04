package com.fimi.soul.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.location.LocationManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1685x;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.module.login.LoginActivity;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.firebase.p251a.C9654a;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import p005b.p006a.p007a.p029b.p052m.p053a.C0612f;
/* renamed from: com.fimi.soul.utils.au */
/* loaded from: classes.dex */
public class C3103au {

    /* renamed from: a */
    private static Typeface f11588a = null;

    /* renamed from: b */
    private static Typeface f11589b = null;

    /* renamed from: c */
    private static MediaPlayer f11590c = null;

    /* renamed from: d */
    private static MediaPlayer f11591d = null;

    /* renamed from: e */
    private static MediaPlayer f11592e = null;

    /* renamed from: a */
    public static int m29242a(byte b) {
        return (b >> 4) & 15;
    }

    /* renamed from: a */
    public static int m29241a(int i, int i2) {
        return Math.abs(((1 << i2) & i) >> i2);
    }

    /* renamed from: a */
    public static Bitmap m29231a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* renamed from: a */
    public static Typeface m29235a(AssetManager assetManager) {
        if (f11588a == null) {
            f11588a = Typeface.createFromAsset(assetManager, "lanting.TTF");
        }
        return f11588a;
    }

    /* renamed from: a */
    public static String m29243a() {
        return Build.MODEL;
    }

    /* renamed from: a */
    public static String m29240a(long j) {
        return new SimpleDateFormat(C1756a.f4554m).format(new Date(j));
    }

    /* renamed from: a */
    public static String m29239a(Context context) {
        return "" + Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: a */
    public static String m29238a(Context context, Bitmap bitmap) {
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(Uri.parse(MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, (String) null, (String) null)), new String[]{"_data"}, null, null, null);
            if (query == null) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                query.moveToFirst();
                String string = query.getString(columnIndexOrThrow);
                if (query == null) {
                    return string;
                }
                query.close();
                return string;
            } catch (Throwable th) {
                th = th;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static String m29236a(Context context, String str) {
        String str2 = "";
        try {
            str2 = String.valueOf(context.getPackageManager().getPackageArchiveInfo(str, 2).versionName);
        } catch (Exception e) {
        }
        C1756a.m34261a("findAppVersionName version=" + str2, C3103au.class);
        return str2;
    }

    /* renamed from: a */
    public static String m29227a(String str) {
        return TextUtils.isEmpty(str) ? str : m29240a(Long.parseLong(str));
    }

    /* renamed from: a */
    public static void m29234a(AssetManager assetManager, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getClass().equals(TextView.class)) {
                    m29232a(assetManager, childAt);
                }
                m29234a(assetManager, childAt);
            }
        }
    }

    /* renamed from: a */
    public static void m29233a(AssetManager assetManager, ViewGroup viewGroup) {
        if (f11588a == null) {
            f11588a = Typeface.createFromAsset(assetManager, "lanting.TTF");
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof Button) {
                    ((Button) childAt).setTypeface(f11588a);
                } else if (childAt instanceof TextView) {
                    ((TextView) childAt).setTypeface(f11588a);
                } else if (childAt instanceof EditText) {
                    ((EditText) childAt).setTypeface(f11588a);
                } else if (childAt instanceof ViewGroup) {
                    m29233a(assetManager, (ViewGroup) childAt);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m29232a(AssetManager assetManager, View... viewArr) {
        if (f11588a == null) {
            f11588a = Typeface.createFromAsset(assetManager, "lanting.TTF");
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < viewArr.length) {
                View view = viewArr[i2];
                if (view instanceof Button) {
                    ((Button) view).setTypeface(f11588a);
                } else if (view instanceof TextView) {
                    ((TextView) view).setTypeface(f11588a);
                } else if (view instanceof EditText) {
                    ((EditText) view).setTypeface(f11588a);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m29229a(TextView textView) {
        textView.getPaint().setFakeBoldText(true);
    }

    /* renamed from: a */
    public static boolean m29237a(Context context, Class cls) {
        ComponentName resolveActivity = new Intent(context, cls).resolveActivity(context.getPackageManager());
        if (resolveActivity != null) {
            for (ActivityManager.RunningTaskInfo runningTaskInfo : ((ActivityManager) context.getSystemService("activity")).getRunningTasks(10)) {
                if (runningTaskInfo.baseActivity.equals(resolveActivity)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m29230a(Bitmap bitmap, String str) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str, false));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m29228a(File file) {
        if (file != null) {
            File file2 = new File(file.getParent() + File.separator + System.currentTimeMillis());
            file.renameTo(file2);
            return file2.delete();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m29226a(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2.getName().equals(str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m29225a(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.toLowerCase().endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m29223b(byte b) {
        return b & 15;
    }

    /* renamed from: b */
    public static Typeface m29219b(AssetManager assetManager) {
        if (f11589b == null) {
            f11589b = Typeface.createFromAsset(assetManager, "DIN Alternate Bold.ttf");
        }
        return f11589b;
    }

    /* renamed from: b */
    public static String m29224b() {
        return Build.MANUFACTURER;
    }

    /* renamed from: b */
    public static String m29222b(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    /* renamed from: b */
    public static String m29216b(String str) {
        return TextUtils.isEmpty(str) ? str : m29222b(Long.parseLong(str));
    }

    /* renamed from: b */
    public static void m29218b(AssetManager assetManager, View... viewArr) {
        if (f11589b == null) {
            f11589b = Typeface.createFromAsset(assetManager, "DIN Alternate Bold.ttf");
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < viewArr.length) {
                View view = viewArr[i2];
                if (view instanceof Button) {
                    ((Button) view).setTypeface(f11589b);
                } else if (view instanceof TextView) {
                    ((TextView) view).setTypeface(f11589b);
                } else if (view instanceof EditText) {
                    ((EditText) view).setTypeface(f11589b);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m29217b(File file) {
        if (file.isFile()) {
            m29228a(file);
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                m29228a(file);
                return;
            }
            for (File file2 : listFiles) {
                m29217b(file2);
            }
            m29228a(file);
        }
    }

    /* renamed from: b */
    public static boolean m29221b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isAvailable();
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m29220b(Context context, String str) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(50)) {
            if (runningServiceInfo.service.getClassName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static WifiDistanceFile m29211c(String str) {
        String replace;
        if (str != null) {
            HashMap hashMap = new HashMap();
            String str2 = "/media";
            WifiDistanceFile wifiDistanceFile = new WifiDistanceFile(str2);
            wifiDistanceFile.setType(0);
            wifiDistanceFile.setParentStrDir("/");
            hashMap.put(str2, wifiDistanceFile);
            String[] split = str.split("\n");
            int i = 0;
            while (i < split.length) {
                String str3 = split[i];
                C1756a.m34261a("line=" + str3, C3103au.class);
                String[] m29197g = m29197g(str3);
                if (m29197g.length <= 1 || str3.startsWith("/")) {
                    replace = "/media/:".equalsIgnoreCase(str3) ? "/media" : str3.replace(":", "");
                } else {
                    WifiDistanceFile wifiDistanceFile2 = new WifiDistanceFile(m29197g[2]);
                    wifiDistanceFile2.setSize(Long.parseLong(m29197g[1]));
                    wifiDistanceFile2.setParentStrDir(str2);
                    if (m29197g[0].startsWith(C0612f.f1063a)) {
                        wifiDistanceFile.setType(0);
                        hashMap.put(str2 + "/" + m29197g[2], wifiDistanceFile2);
                    } else {
                        wifiDistanceFile.setType(0);
                    }
                    WifiDistanceFile wifiDistanceFile3 = (WifiDistanceFile) hashMap.get(str2);
                    if (wifiDistanceFile3 != null) {
                        wifiDistanceFile3.addFile(wifiDistanceFile2);
                        wifiDistanceFile2.setParentDir(wifiDistanceFile3);
                    } else {
                        wifiDistanceFile2.setParentDir(null);
                    }
                    replace = str2;
                }
                i++;
                str2 = replace;
            }
            return wifiDistanceFile;
        }
        return null;
    }

    /* renamed from: c */
    public static String m29215c() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            return Environment.getExternalStorageDirectory().getPath();
        }
        return null;
    }

    /* renamed from: c */
    public static String m29214c(long j) {
        if (j == 0) {
            return "0.00B";
        }
        new DecimalFormat("#.00");
        return j < FimiMediaMeta.AV_CH_SIDE_RIGHT ? C1679t.m34552b(j, 2) + "B" : j < 1048576 ? C1679t.m34552b(j / 1024.0d, 2) + "KB" : j < FimiMediaMeta.AV_CH_STEREO_RIGHT ? C1679t.m34552b(j / 1048576.0d, 2) + "MB" : C1679t.m34552b(j / 1.073741824E9d, 2) + "GB";
    }

    /* renamed from: c */
    public static boolean m29213c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI");
    }

    /* renamed from: c */
    public static boolean m29212c(Context context, String str) {
        boolean z = false;
        AssetManager assets = context.getAssets();
        if (str == null) {
            return false;
        }
        try {
            String[] list = assets.list("");
            for (String str2 : list) {
                if (str2.equals(str.trim())) {
                    System.out.println(str + "文件存在！！！！");
                    z = true;
                    return true;
                }
                System.out.println(str + "不存在啦！！！！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("不存在！");
        return z;
    }

    /* renamed from: d */
    public static String m29210d() {
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: d */
    public static String m29209d(Context context) {
        String str = "";
        try {
            str = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (Exception e) {
        }
        C1756a.m34261a("findAppVersionName version=" + str, C3103au.class);
        return str;
    }

    /* renamed from: d */
    public static boolean m29208d(Context context, String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        try {
            context.getPackageManager().getApplicationInfo(str, 8192);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m29207d(String str) {
        boolean z = false;
        Process process = null;
        try {
            process = Runtime.getRuntime().exec("ping -c 1 -W 1 " + str);
            if (process.waitFor() == 0) {
                z = true;
            }
            if (process != null) {
                process.destroy();
            }
        } catch (Exception e) {
            if (process != null) {
                process.destroy();
            }
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
        return z;
    }

    /* renamed from: e */
    public static String m29205e(Context context) {
        String str = "";
        try {
            str = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception e) {
        }
        C1756a.m34261a("findAppVersionName versionCode=" + str, C3103au.class);
        return str;
    }

    /* renamed from: e */
    public static boolean m29206e() {
        try {
            return Runtime.getRuntime().exec("ping -c 1 -w 100 www.baidu.com").waitFor() == 0;
        } catch (IOException e) {
            return false;
        } catch (InterruptedException e2) {
            return false;
        } catch (UnknownHostException e3) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m29204e(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        for (int i = 0; i < runningAppProcesses.size(); i++) {
            if (runningAppProcesses.get(i).processName.equals(str)) {
                Log.i("NotificationLaunch", String.format("the %s is running, isAppAlive return true", str));
                return true;
            }
        }
        Log.i("NotificationLaunch", String.format("the %s is not running, isAppAlive return false", str));
        return false;
    }

    /* renamed from: e */
    public static boolean m29203e(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* renamed from: f */
    public static String m29201f(Context context) {
        int ipAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        return String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
    }

    /* renamed from: f */
    public static String m29200f(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new SimpleDateFormat("yyyy-MMM-dd_HH:mm:ss", Locale.ENGLISH).parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m29202f() {
        try {
            return InetAddress.getByName("192.168.100.1").isReachable(50);
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: g */
    public static String m29198g(Context context) {
        return Build.MODEL + Constants.ACCEPT_TIME_SEPARATOR_SP + ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
    }

    /* renamed from: g */
    private static String[] m29197g(String str) {
        String[] strArr = new String[3];
        String[] split = str.split(" ");
        if (split.length > 9) {
            String str2 = "";
            int i = 0;
            for (int i2 = 0; i2 < split.length; i2++) {
                if (!"".equalsIgnoreCase(split[i2])) {
                    i++;
                    if (i == 1) {
                        strArr[0] = split[i2];
                    } else if (i == 5) {
                        strArr[1] = split[i2];
                    } else if (i >= 9) {
                        str2 = "".equalsIgnoreCase(str2) ? str2 + split[i2] : str2 + " " + split[i2];
                    }
                }
            }
            strArr[2] = str2;
            return strArr;
        }
        return split;
    }

    /* renamed from: h */
    public static void m29195h(Context context) {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            C1756a.m34261a("error : ", C3103au.class);
        }
        ((AlarmManager) context.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000, PendingIntent.getActivity(context, 0, new Intent(context.getApplicationContext(), LoginActivity.class), AbstractC4808e.f17570a_));
    }

    /* renamed from: i */
    public static Boolean m29193i(Context context) {
        String[] strArr;
        String[] strArr2;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Method[] declaredMethods = connectivityManager.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                strArr = null;
                break;
            }
            Method method = declaredMethods[i];
            if (method.getName().equals("getTetheredIfaces")) {
                try {
                    strArr = (String[]) method.invoke(connectivityManager, new Object[0]);
                    break;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                }
            }
            i++;
        }
        int length2 = declaredMethods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                strArr2 = null;
                break;
            }
            Method method2 = declaredMethods[i2];
            if (method2.getName().equals("getTetherableUsbRegexs")) {
                try {
                    strArr2 = (String[]) method2.invoke(connectivityManager, new Object[0]);
                    break;
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
            i2++;
        }
        if (strArr == null) {
            return true;
        }
        if (strArr2 != null) {
            z = false;
            for (String str : strArr) {
                int length3 = strArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        break;
                    } else if (str.matches(strArr2[i3])) {
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: j */
    public static boolean m29192j(Context context) {
        String packageName = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0).topActivity.getPackageName();
        return !TextUtils.isEmpty(packageName) && packageName.equals(context.getPackageName());
    }

    /* renamed from: k */
    public static void m29191k(Context context) {
        f11590c = MediaPlayer.create(context, (int) C1704R.raw.video_record_end);
        f11590c.setVolume(1.0f, 1.0f);
        f11591d = MediaPlayer.create(context, (int) C1704R.raw.video_record_start);
        f11591d.setVolume(1.0f, 1.0f);
        f11592e = MediaPlayer.create(context, (int) C1704R.raw.camera_click);
        f11592e.setVolume(1.0f, 1.0f);
    }

    /* renamed from: l */
    public static void m29190l(Context context) {
        if (f11590c != null) {
            C1685x.m34457a(new Runnable() { // from class: com.fimi.soul.utils.au.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!C3103au.f11590c.isPlaying()) {
                        C3103au.f11590c.start();
                    }
                }
            });
        }
    }

    /* renamed from: m */
    public static void m29189m(Context context) {
        if (f11591d != null) {
            C1685x.m34457a(new Runnable() { // from class: com.fimi.soul.utils.au.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!C3103au.f11591d.isPlaying()) {
                        C3103au.f11591d.start();
                    }
                }
            });
        }
    }

    /* renamed from: n */
    public static void m29188n(Context context) {
        if (f11592e != null) {
            C1685x.m34457a(new Runnable() { // from class: com.fimi.soul.utils.au.3
                @Override // java.lang.Runnable
                public void run() {
                    if (!C3103au.f11592e.isPlaying()) {
                        C3103au.f11592e.start();
                    }
                }
            });
        }
    }

    /* renamed from: o */
    public static String m29187o(Context context) {
        return "/data/data/" + context.getPackageName() + "/databases/NoFlyZone-V1.0.0-DB.sqlite";
    }

    /* renamed from: p */
    public static boolean m29186p(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService(C9654a.C9656b.f30231p);
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    /* renamed from: q */
    public static boolean m29185q(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: r */
    public static boolean m29184r(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                    return runningAppProcessInfo.importance != 100;
                }
            }
        }
        return false;
    }

    /* renamed from: s */
    public static PackageInfo m29183s(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
