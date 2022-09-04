package com.baidu.tts.p101e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Base64;
import android.util.DisplayMetrics;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.zip.GZIPOutputStream;
import org.codehaus.jackson.smile.SmileConstants;
import org.p356d.AbstractC11759f;
/* renamed from: com.baidu.tts.e.d */
/* loaded from: classes.dex */
public class C1165d {
    /* renamed from: a */
    public static long m36343a(Context context) {
        return context.getSharedPreferences("tts", 0).getLong("last_upload_stat_time", 0L);
    }

    /* renamed from: a */
    public static String m36344a() {
        return "1.0.0-20140804";
    }

    /* renamed from: a */
    public static String m36339a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return new String(Base64.encode(bArr, 0, bArr.length, 0), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m36342a(Context context, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("tts", 0).edit();
        edit.putInt("last_download_stat_period", i);
        edit.commit();
    }

    /* renamed from: a */
    public static void m36341a(Context context, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences("tts", 0).edit();
        edit.putLong("last_upload_stat_time", j);
        edit.commit();
    }

    /* renamed from: a */
    public static byte[] m36340a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static int m36337b(Context context) {
        return context.getSharedPreferences("tts", 0).getInt("last_download_stat_period", 0);
    }

    /* renamed from: b */
    public static String m36338b() {
        return "Android";
    }

    /* renamed from: b */
    private static String m36336b(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getEncoded());
            return m36333c(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (CertificateException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m36335c() {
        return "离线TTS SDK";
    }

    /* renamed from: c */
    public static String m36334c(Context context) {
        return m36328h(context);
    }

    /* renamed from: c */
    private static String m36333c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static String m36332d(Context context) {
        return m36338b() + "&" + Build.MODEL + "&" + Build.VERSION.RELEASE + "&" + Build.VERSION.SDK_INT + "&" + m36331e(context);
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: e */
    public static int m36331e(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return (activeNetworkInfo == null || !"wifi".equals(activeNetworkInfo.getTypeName().toLowerCase())) ? 3 : 1;
    }

    /* renamed from: f */
    public static String m36330f(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        return i + AbstractC11759f.f37104a + displayMetrics.heightPixels;
    }

    /* renamed from: g */
    public static String m36329g(Context context) {
        try {
            return m36336b(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    private static String m36328h(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo = null;
        try {
            packageManager = context.getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
            }
        } catch (PackageManager.NameNotFoundException e2) {
            packageManager = null;
        }
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }
}
