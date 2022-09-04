package com.tencent.open.utils;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import com.baidu.tts.loopj.AsyncHttpClient;
import com.google.android.gms.analytics.p229a.C3833b;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.firebase.p251a.C9654a;
import com.p255mi.live.openlivesdk.C10024b;
import com.tencent.connect.common.Constants;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.p265b.C10263a;
import com.tencent.open.utils.HttpUtils;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.codehaus.jackson.smile.SmileConstants;
import org.json.JSONException;
import org.json.JSONObject;
import org.p286a.p287a.C11086e;
import org.p356d.AbstractC11759f;
/* loaded from: classes.dex */
public class Util {

    /* renamed from: g */
    private static String f32024g;

    /* renamed from: a */
    private static final String f32018a = C10257f.f31917d + "." + Util.class.getName();

    /* renamed from: b */
    private static String f32019b = "";

    /* renamed from: c */
    private static String f32020c = "";

    /* renamed from: d */
    private static String f32021d = "";

    /* renamed from: e */
    private static String f32022e = "";

    /* renamed from: f */
    private static int f32023f = -1;

    /* renamed from: h */
    private static boolean f32025h = true;

    /* renamed from: i */
    private static String f32026i = "0123456789ABCDEF";

    /* loaded from: classes2.dex */
    public static class Statistic {
        public long reqSize;
        public String response;
        public long rspSize;

        public Statistic(String str, int i) {
            this.response = str;
            this.reqSize = i;
            if (this.response != null) {
                this.rspSize = this.response.length();
            }
        }
    }

    /* loaded from: classes2.dex */
    private static class TBufferedOutputStream extends BufferedOutputStream {

        /* renamed from: a */
        private int f32029a = 0;

        public TBufferedOutputStream(OutputStream outputStream) {
            super(outputStream);
        }

        public int getLength() {
            return this.f32029a;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            super.write(bArr);
            this.f32029a += bArr.length;
        }
    }

    /* renamed from: a */
    private static char m5575a(int i) {
        int i2 = i & 15;
        return i2 < 10 ? (char) (i2 + 48) : (char) ((i2 - 10) + 97);
    }

    /* renamed from: a */
    private static String m5572a(HttpResponse httpResponse) {
        InputStream content = httpResponse.getEntity().getContent();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Header firstHeader = httpResponse.getFirstHeader("Content-Encoding");
        InputStream gZIPInputStream = (firstHeader == null || firstHeader.getValue().toLowerCase().indexOf(AsyncHttpClient.ENCODING_GZIP) <= -1) ? content : new GZIPInputStream(content);
        byte[] bArr = new byte[512];
        while (true) {
            int read = gZIPInputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
            }
        }
    }

    /* renamed from: a */
    private static void m5573a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1073741824);
        intent.addFlags(AbstractC4808e.f17570a_);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static boolean m5574a(Context context) {
        Signature[] signatureArr;
        boolean z = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (SystemUtils.compareVersion(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String hexString = toHexString(messageDigest.digest());
                    messageDigest.reset();
                    if (hexString.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        z = true;
                    }
                } catch (NoSuchAlgorithmException e) {
                    C10257f.m5667e(f32018a, "isQQBrowerAvailable has exception: " + e.getMessage());
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
        }
        return z;
    }

    public static boolean checkNetWork(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
        if (allNetworkInfo == null) {
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo.isConnectedOrConnecting()) {
                return true;
            }
        }
        return false;
    }

    public static Bundle composeHaboCgiReportParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.PARAM_PLATFORM, "1");
        bundle.putString("result", str);
        bundle.putString(XiaomiOAuthConstants.EXTRA_CODE_2, str2);
        bundle.putString("tmcost", str3);
        bundle.putString("rate", str4);
        bundle.putString("cmd", str5);
        bundle.putString("uin", str6);
        bundle.putString("appid", str7);
        bundle.putString("share_type", str8);
        bundle.putString(C3833b.f14897a, str9);
        bundle.putString("os_ver", Build.VERSION.RELEASE);
        bundle.putString("network", C10263a.m5653a(Global.getContext()));
        bundle.putString("apn", C10263a.m5652b(Global.getContext()));
        bundle.putString("model_name", Build.MODEL);
        bundle.putString("sdk_ver", Constants.SDK_VERSION);
        bundle.putString(C10024b.f30904g, Global.getPackageName());
        bundle.putString("app_ver", getAppVersionName(Global.getContext(), Global.getPackageName()));
        return bundle;
    }

    public static Bundle composeViaReportParams(String str, String str2, String str3, String str4, String str5, String str6) {
        return composeViaReportParams(str, str3, str4, str2, str5, str6, "", "", "", "", "", "");
    }

    public static Bundle composeViaReportParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString("report_type", str2);
        bundle.putString("act_type", str3);
        bundle.putString("via", str4);
        bundle.putString("app_id", str5);
        bundle.putString("result", str6);
        bundle.putString("type", str7);
        bundle.putString("login_status", str8);
        bundle.putString("need_user_auth", str9);
        bundle.putString("to_uin", str10);
        bundle.putString("call_source", str11);
        bundle.putString("to_type", str12);
        return bundle;
    }

    public static Bundle decodeUrl(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    bundle.putString(URLDecoder.decode(split[0]), URLDecoder.decode(split[1]));
                }
            }
        }
        return bundle;
    }

    public static JSONObject decodeUrlToJson(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    try {
                        jSONObject.put(URLDecoder.decode(split[0]), URLDecoder.decode(split[1]));
                    } catch (JSONException e) {
                        C10257f.m5667e(f32018a, "decodeUrlToJson has exception: " + e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String encodePostBody(Bundle bundle, String str) {
        Object obj;
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = bundle.size();
        int i = -1;
        for (String str2 : bundle.keySet()) {
            int i2 = i + 1;
            if (!(bundle.get(str2) instanceof String)) {
                i = i2;
            } else {
                sb.append("Content-Disposition: form-data; name=\"" + str2 + "\"\r\n\r\n" + ((String) obj));
                if (i2 < size - 1) {
                    sb.append("\r\n--" + str + "\r\n");
                }
                i = i2;
            }
        }
        return sb.toString();
    }

    public static String encodeUrl(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if ((obj instanceof String) || (obj instanceof String[])) {
                if (obj instanceof String[]) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode(str) + "=");
                    String[] stringArray = bundle.getStringArray(str);
                    if (stringArray != null) {
                        for (int i = 0; i < stringArray.length; i++) {
                            if (i == 0) {
                                sb.append(URLEncoder.encode(stringArray[i]));
                            } else {
                                sb.append(URLEncoder.encode(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP + stringArray[i]));
                            }
                        }
                    }
                } else {
                    if (z) {
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode(str) + "=" + URLEncoder.encode(bundle.getString(str)));
                }
                z = z;
            }
        }
        return sb.toString();
    }

    public static String encrypt(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(getBytesUTF8(str));
            byte[] digest = messageDigest.digest();
            if (digest == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(m5575a(b >>> 4));
                sb.append(m5575a(b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            C10257f.m5667e(f32018a, "encrypt has exception: " + e.getMessage());
            return str;
        }
    }

    public static boolean fileExists(String str) {
        File file;
        return (str == null || (file = new File(str)) == null || !file.exists()) ? false : true;
    }

    public static String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C10257f.m5667e(f32018a, "getAppVersion error" + e.getMessage());
            return "";
        }
    }

    public static String getAppVersionName(Context context, String str) {
        if (context == null) {
            return "";
        }
        getPackageInfo(context, str);
        return f32019b;
    }

    public static final String getApplicationLable(Context context) {
        CharSequence applicationLabel;
        if (context == null || (applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo())) == null) {
            return null;
        }
        return applicationLabel.toString();
    }

    public static byte[] getBytesUTF8(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static String getLocation(Context context) {
        Location lastKnownLocation;
        if (context == null) {
            return "";
        }
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService(C9654a.C9656b.f30231p);
            Criteria criteria = new Criteria();
            criteria.setCostAllowed(false);
            criteria.setAccuracy(2);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null && (lastKnownLocation = locationManager.getLastKnownLocation(bestProvider)) != null) {
                f32024g = lastKnownLocation.getLatitude() + AbstractC11759f.f37104a + lastKnownLocation.getLongitude();
                return f32024g;
            }
            return "";
        } catch (Exception e) {
            C10257f.m5672b("getLocation", "getLocation>>>", e);
        }
        return "";
    }

    public static void getPackageInfo(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            f32020c = packageInfo.versionName;
            f32019b = f32020c.substring(0, f32020c.lastIndexOf(46));
            f32022e = f32020c.substring(f32020c.lastIndexOf(46) + 1, f32020c.length());
            f32023f = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C10257f.m5667e(f32018a, "getPackageInfo has exception: " + e.getMessage());
        } catch (Exception e2) {
            C10257f.m5667e(f32018a, "getPackageInfo has exception: " + e2.getMessage());
        }
    }

    public static String getQUA3(Context context, String str) {
        if (context == null) {
            return "";
        }
        f32021d = getAppVersionName(context, str);
        return f32021d;
    }

    public static String getUserIp() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        return nextElement.getHostAddress().toString();
                    }
                }
            }
        } catch (SocketException e) {
            logd("Tencent-Util", e.toString());
        }
        return "";
    }

    public static String getVersionName(Context context, String str) {
        if (context == null) {
            return "";
        }
        getPackageInfo(context, str);
        return f32020c;
    }

    public static boolean hasSDCard() {
        File file = null;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = Environment.getExternalStorageDirectory();
        }
        return file != null;
    }

    public static String hexToString(String str) {
        if ("0x".equals(str.substring(0, 2))) {
            str = str.substring(2);
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            try {
                bArr[i] = (byte) (Integer.parseInt(str.substring(i * 2, (i * 2) + 2), 16) & 255);
            } catch (Exception e) {
                C10257f.m5667e(f32018a, "hexToString has exception: " + e.getMessage());
            }
        }
        try {
            return new String(bArr, "utf-8");
        } catch (Exception e2) {
            C10257f.m5667e(f32018a, "hexToString has exception: " + e2.getMessage());
            return str;
        }
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isMobileQQSupportShare(Context context) {
        try {
            return SystemUtils.compareVersion(context.getPackageManager().getPackageInfo("com.tencent.mobileqq", 0).versionName, "4.1") >= 0;
        } catch (PackageManager.NameNotFoundException e) {
            C10257f.m5673b("checkMobileQQ", "error");
            return false;
        }
    }

    public static boolean isNumeric(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static final boolean isValidPath(String str) {
        File file;
        return (str == null || (file = new File(str)) == null || !file.exists()) ? false : true;
    }

    public static final boolean isValidUrl(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static void logd(String str, String str2) {
        if (f32025h) {
            C10257f.m5673b(str, str2);
        }
    }

    public static boolean openBrowser(Context context, String str) {
        boolean z;
        try {
            z = m5574a(context);
        } catch (Exception e) {
            z = false;
        }
        try {
            if (z) {
                m5573a(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
            } else {
                m5573a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
            }
        } catch (Exception e2) {
            if (z) {
                try {
                    m5573a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                } catch (Exception e3) {
                    try {
                        m5573a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                    } catch (Exception e4) {
                        try {
                            m5573a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                        } catch (Exception e5) {
                            return false;
                        }
                    }
                }
            } else {
                try {
                    m5573a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                } catch (Exception e6) {
                    try {
                        m5573a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                    } catch (Exception e7) {
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }

    public static int parseIntValue(String str) {
        return parseIntValue(str, 0);
    }

    public static int parseIntValue(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return i;
        }
    }

    public static JSONObject parseJson(String str) {
        if (str.equals("false")) {
            str = "{value : false}";
        }
        if (str.equals("true")) {
            str = "{value : true}";
        }
        if (str.contains("allback(")) {
            str = str.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
        }
        if (str.contains("online[0]=")) {
            str = "{online:" + str.charAt(str.length() - 2) + "}";
        }
        return new JSONObject(str);
    }

    public static Bundle parseUrl(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle decodeUrl = decodeUrl(url.getQuery());
            decodeUrl.putAll(decodeUrl(url.getRef()));
            return decodeUrl;
        } catch (MalformedURLException e) {
            return new Bundle();
        }
    }

    public static JSONObject parseUrlToJson(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject decodeUrlToJson = decodeUrlToJson(null, url.getQuery());
            decodeUrlToJson(decodeUrlToJson, url.getRef());
            return decodeUrlToJson;
        } catch (MalformedURLException e) {
            return new JSONObject();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.tencent.open.utils.Util$1] */
    public static void reportBernoulli(final Context context, String str, long j, String str2) {
        final Bundle bundle = new Bundle();
        bundle.putString("appid_for_getting_config", str2);
        bundle.putString("strValue", str2);
        bundle.putString("nValue", str);
        bundle.putString("qver", Constants.SDK_VERSION);
        if (j != 0) {
            bundle.putLong("elt", j);
        }
        new Thread() { // from class: com.tencent.open.utils.Util.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    HttpUtils.openUrl2(context, "http://cgi.qplus.com/report/report", "GET", bundle);
                } catch (Exception e) {
                    C10257f.m5667e(Util.f32018a, "reportBernoulli has exception: " + e.getMessage());
                }
            }
        }.start();
    }

    public static void showAlert(Context context, String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.create().show();
    }

    public static final String subString(String str, int i, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "UTF-8";
        }
        try {
            if (str.getBytes(str2).length <= i) {
                return str;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                int length = str.substring(i3, i3 + 1).getBytes(str2).length;
                if (i2 + length > i) {
                    String substring = str.substring(0, i3);
                    try {
                        if (!TextUtils.isEmpty(str3)) {
                            substring = substring + str3;
                        }
                        return substring;
                    } catch (Exception e) {
                        str = str4;
                        e = e;
                        System.out.println("StructMsg sSubString error : " + e.getMessage());
                        return str;
                    }
                }
                i2 += length;
            }
            return str;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static String toHexString(String str) {
        byte[] bytesUTF8 = getBytesUTF8(str);
        StringBuilder sb = new StringBuilder(bytesUTF8.length * 2);
        for (int i = 0; i < bytesUTF8.length; i++) {
            sb.append(f32026i.charAt((bytesUTF8[i] & 240) >> 4));
            sb.append(f32026i.charAt((bytesUTF8[i] & 15) >> 0));
        }
        return sb.toString();
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            String num = Integer.toString(b & SmileConstants.BYTE_MARKER_END_OF_CONTENT, 16);
            if (num.length() == 1) {
                num = "0" + num;
            }
            sb.append(num);
        }
        return sb.toString();
    }

    public static Statistic upload(Context context, String str, Bundle bundle) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || ((activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable())) {
            Bundle bundle2 = new Bundle(bundle);
            String string = bundle2.getString("appid_for_getting_config");
            bundle2.remove("appid_for_getting_config");
            HttpClient httpClient = HttpUtils.getHttpClient(context, string, str);
            HttpPost httpPost = new HttpPost(str);
            Bundle bundle3 = new Bundle();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj instanceof byte[]) {
                    bundle3.putByteArray(str2, (byte[]) obj);
                }
            }
            httpPost.setHeader("Content-Type", "multipart/form-data; boundary=3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            httpPost.setHeader(C11086e.f35717j, "Keep-Alive");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(getBytesUTF8("--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
            byteArrayOutputStream.write(getBytesUTF8(encodePostBody(bundle2, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f")));
            if (!bundle3.isEmpty()) {
                int size = bundle3.size();
                byteArrayOutputStream.write(getBytesUTF8("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
                int i = -1;
                for (String str3 : bundle3.keySet()) {
                    i++;
                    byteArrayOutputStream.write(getBytesUTF8("Content-Disposition: form-data; name=\"" + str3 + "\"; filename=\"value.file\"\r\n"));
                    byteArrayOutputStream.write(getBytesUTF8("Content-Type: application/octet-stream\r\n\r\n"));
                    byte[] byteArray = bundle3.getByteArray(str3);
                    if (byteArray != null) {
                        byteArrayOutputStream.write(byteArray);
                    }
                    if (i < size - 1) {
                        byteArrayOutputStream.write(getBytesUTF8("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
                    }
                }
            }
            byteArrayOutputStream.write(getBytesUTF8("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f--\r\n"));
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            int length = byteArray2.length + 0;
            byteArrayOutputStream.close();
            httpPost.setEntity(new ByteArrayEntity(byteArray2));
            HttpResponse execute = httpClient.execute(httpPost);
            int statusCode = execute.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new HttpUtils.HttpStatusException(HttpUtils.HttpStatusException.ERROR_INFO + statusCode);
            }
            return new Statistic(m5572a(execute), length);
        }
        throw new HttpUtils.NetworkUnavailableException(HttpUtils.NetworkUnavailableException.ERROR_INFO);
    }
}
