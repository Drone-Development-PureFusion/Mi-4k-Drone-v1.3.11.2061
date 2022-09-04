package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.q */
/* loaded from: classes2.dex */
public abstract class AbstractC10536q {
    /* renamed from: a */
    public static String m4820a(Context context, String str, List list) {
        OutputStream outputStream;
        OutputStream outputStream2;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("url");
            }
            try {
                HttpURLConnection m4819a = m4819a(context, new URL(str));
                m4819a.setConnectTimeout(10000);
                m4819a.setReadTimeout(15000);
                m4819a.setRequestMethod("POST");
                String m4817a = m4817a(list);
                if (m4817a == null) {
                    throw new IllegalArgumentException("nameValuePairs");
                }
                m4819a.setDoOutput(true);
                byte[] bytes = m4817a.getBytes();
                OutputStream outputStream3 = m4819a.getOutputStream();
                try {
                    outputStream3.write(bytes, 0, bytes.length);
                    outputStream3.flush();
                    outputStream3.close();
                    outputStream2 = null;
                    m4819a.getResponseCode();
                    bufferedReader = new BufferedReader(new InputStreamReader(new C10537r(m4819a.getInputStream())));
                } catch (IOException e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    String property = System.getProperty("line.separator");
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        stringBuffer.append(readLine);
                        stringBuffer.append(property);
                    }
                    String stringBuffer2 = stringBuffer.toString();
                    bufferedReader.close();
                    BufferedReader bufferedReader3 = null;
                    if (0 != 0) {
                        try {
                            outputStream2.close();
                        } catch (IOException e2) {
                        }
                    }
                    if (0 != 0) {
                        bufferedReader3.close();
                    }
                    return stringBuffer2;
                } catch (IOException e3) {
                    e = e3;
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    bufferedReader2 = bufferedReader;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            throw th;
                        }
                    }
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: a */
    public static String m4818a(URL url) {
        StringBuilder sb = new StringBuilder();
        sb.append(url.getProtocol()).append("://").append("10.0.0.172").append(url.getPath());
        if (!TextUtils.isEmpty(url.getQuery())) {
            sb.append(C0363a.f360a).append(url.getQuery());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4817a(List list) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            NameValuePair nameValuePair = (NameValuePair) it2.next();
            try {
                if (nameValuePair.getValue() != null) {
                    stringBuffer.append(URLEncoder.encode(nameValuePair.getName(), "UTF-8"));
                    stringBuffer.append("=");
                    stringBuffer.append(URLEncoder.encode(nameValuePair.getValue(), "UTF-8"));
                    stringBuffer.append("&");
                }
            } catch (UnsupportedEncodingException e) {
                return null;
            }
        }
        return (stringBuffer.length() > 0 ? stringBuffer.deleteCharAt(stringBuffer.length() - 1) : stringBuffer).toString();
    }

    /* renamed from: a */
    public static HttpURLConnection m4819a(Context context, URL url) {
        if (!UriUtil.HTTP_SCHEME.equals(url.getProtocol())) {
            return (HttpURLConnection) url.openConnection();
        }
        if (m4814d(context)) {
            return (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80)));
        }
        if (!m4815c(context)) {
            return (HttpURLConnection) url.openConnection();
        }
        String host = url.getHost();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(m4818a(url)).openConnection();
        httpURLConnection.addRequestProperty("X-Online-Host", host);
        return httpURLConnection;
    }

    /* renamed from: a */
    public static boolean m4821a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return false;
                }
                return 1 == activeNetworkInfo.getType();
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e2) {
            return false;
        }
    }

    /* renamed from: b */
    public static String m4816b(Context context) {
        if (m4821a(context)) {
            return "WIFI";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "";
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo == null ? "" : (activeNetworkInfo.getTypeName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + activeNetworkInfo.getSubtypeName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + activeNetworkInfo.getExtraInfo()).toLowerCase();
            } catch (Exception e) {
                return "";
            }
        } catch (Exception e2) {
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m4815c(Context context) {
        if (!"CN".equalsIgnoreCase(((TelephonyManager) context.getSystemService("phone")).getSimCountryIso())) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return false;
                }
                String extraInfo = activeNetworkInfo.getExtraInfo();
                if (!TextUtils.isEmpty(extraInfo) && extraInfo.length() >= 3 && !extraInfo.contains("ctwap")) {
                    return extraInfo.regionMatches(true, extraInfo.length() - 3, "wap", 0, 3);
                }
                return false;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e2) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m4814d(Context context) {
        if (!"CN".equalsIgnoreCase(((TelephonyManager) context.getSystemService("phone")).getSimCountryIso())) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return false;
                }
                String extraInfo = activeNetworkInfo.getExtraInfo();
                if (TextUtils.isEmpty(extraInfo) || extraInfo.length() < 3) {
                    return false;
                }
                return extraInfo.contains("ctwap");
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e2) {
            return false;
        }
    }
}
