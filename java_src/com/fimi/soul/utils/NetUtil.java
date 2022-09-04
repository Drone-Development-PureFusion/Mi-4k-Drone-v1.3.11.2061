package com.fimi.soul.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.p004v7.media.SystemMediaRouteProvider;
import com.fimi.kernel.utils.C1662f;
import com.fimi.kernel.utils.C1677r;
import com.fimi.kernel.utils.C1681v;
import com.fimi.soul.base.C1756a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.p286a.p287a.p299f.p302c.AbstractC11127n;
import org.p286a.p287a.p299f.p302c.C11118g;
import org.p286a.p287a.p299f.p302c.C11122i;
import org.p286a.p287a.p306i.p308b.C11200t;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* loaded from: classes.dex */
public class NetUtil {

    /* renamed from: a */
    public static String f11477a = null;

    /* renamed from: b */
    public static Header f11478b = null;

    /* renamed from: c */
    public static final String f11479c = "admin";

    /* renamed from: d */
    private static NetUtil f11480d;

    static {
        System.loadLibrary("server-jni");
    }

    /* renamed from: a */
    public static NetUtil m29414a() {
        if (f11480d == null) {
            f11480d = new NetUtil();
        }
        return f11480d;
    }

    /* renamed from: a */
    public static String m29411a(String str, List<NameValuePair> list, Context context) {
        if (m29412a(m29405b(list))) {
            str = "";
        }
        C1681v.m34543a(context);
        m29408a(list, context);
        HttpPost httpPost = new HttpPost(str);
        if (list != null) {
            try {
                if (list.size() > 0) {
                    httpPost.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        HttpClient m29407b = m29407b();
        String str2 = "";
        try {
            HttpResponse execute = m29407b.execute(httpPost);
            f11478b = execute.getFirstHeader("Content-Encoding");
            if (execute.getStatusLine().getStatusCode() == 200) {
                str2 = C1677r.m34604a(EntityUtils.toString(execute.getEntity(), "utf-8"), getNetKey());
            } else {
                C1756a.m34261a(" request  timeout ", NetUtil.class);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            m29407b.getConnectionManager().shutdown();
        }
        return str2;
    }

    /* renamed from: a */
    public static String m29410a(String str, List<NameValuePair> list, Context context, boolean z) {
        String str2;
        Exception e;
        if (!z) {
            return m29411a(str, list, context);
        }
        m29408a(list, context);
        new C1681v(context);
        if (list != null && list.size() > 0) {
            str = str + C0363a.f360a + URLEncodedUtils.format(list, "UTF-8");
        }
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        defaultHttpClient.getParams().setParameter("http.connection.timeout", 30000);
        defaultHttpClient.getParams().setParameter("http.socket.timeout", 120000);
        try {
            try {
                HttpResponse execute = defaultHttpClient.execute(new HttpGet(str));
                int statusCode = execute.getStatusLine().getStatusCode();
                f11478b = execute.getFirstHeader("Content-Encoding");
                if (statusCode == 200) {
                    List cookies = defaultHttpClient.getCookieStore().getCookies();
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= cookies.size()) {
                            break;
                        } else if ("JSESSIONID".equals(((Cookie) cookies.get(i2)).getName())) {
                            f11477a = ((Cookie) cookies.get(i2)).getValue();
                            break;
                        } else {
                            i = i2 + 1;
                        }
                    }
                    str2 = EntityUtils.toString(execute.getEntity(), "utf-8");
                    try {
                        C1756a.m34261a("data... json: " + str2, NetUtil.class);
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        return str2;
                    }
                } else {
                    str2 = "";
                }
                return str2;
            } finally {
                defaultHttpClient.getConnectionManager().shutdown();
            }
        } catch (Exception e3) {
            str2 = "";
            e = e3;
        }
    }

    /* renamed from: a */
    public static String m29409a(List<NameValuePair> list) {
        TreeMap treeMap = new TreeMap();
        StringBuffer stringBuffer = new StringBuffer();
        if (list != null && list.size() > 0) {
            for (NameValuePair nameValuePair : list) {
                treeMap.put(nameValuePair.getName(), nameValuePair.getValue());
            }
        }
        if (treeMap == null || treeMap.size() == 0) {
            return null;
        }
        for (String str : treeMap.keySet()) {
            if (treeMap.get(str) != null && treeMap.get(str) != "") {
                stringBuffer.append(str + "=" + ((String) treeMap.get(str)) + "&");
            }
        }
        try {
            return C3116az.m29131a(URLEncoder.encode(stringBuffer.toString() + "key=", "utf-8"), getServerTokenKey()).toUpperCase();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m29408a(List<NameValuePair> list, Context context) {
        list.add(new BasicNameValuePair("req", C1662f.m34784a(new Date(), C1662f.f4115e) + ((int) (Math.random() * 1000000.0d)) + "10"));
        list.add(new BasicNameValuePair("channel", SystemMediaRouteProvider.PACKAGE_NAME));
        list.add(new BasicNameValuePair("deviceID", C3103au.m29198g(context)));
        list.add(new BasicNameValuePair("visitID", C1756a.m34259c(context).getUserID().equals("") ? "0" : C1756a.m34259c(context).getUserID()));
        list.add(new BasicNameValuePair("local", C3103au.m29210d()));
        list.add(new BasicNameValuePair("appVersion", C3103au.m29209d(context)));
        list.add(new BasicNameValuePair("encrypt", "0"));
        list.add(new BasicNameValuePair("signMsg", m29409a(list)));
    }

    /* renamed from: a */
    public static boolean m29413a(Context context) {
        NetworkInfo[] allNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (allNetworkInfo = connectivityManager.getAllNetworkInfo()) != null) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.isAvailable() && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m29412a(String str) {
        boolean z = false;
        for (EnumC3135r enumC3135r : EnumC3135r.values()) {
            if (enumC3135r.toString().equals(str)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static String m29406b(String str, List<NameValuePair> list, Context context) {
        return m29411a(str, list, context);
    }

    /* renamed from: b */
    public static String m29405b(List<NameValuePair> list) {
        String str = null;
        if (list != null && list.size() > 0) {
            for (NameValuePair nameValuePair : list) {
                str = nameValuePair.getName().equals("commandCode") ? nameValuePair.getValue() : str;
            }
        }
        return str;
    }

    /* renamed from: b */
    private static HttpClient m29407b() {
        try {
            return C11200t.m1680a().m1712a(new C11118g(C11122i.m1973c().m1984a().m1981a((KeyStore) null, new AbstractC11127n() { // from class: com.fimi.soul.utils.NetUtil.1
                @Override // org.p286a.p287a.p299f.p302c.AbstractC11127n
                /* renamed from: a */
                public boolean mo1964a(X509Certificate[] x509CertificateArr, String str) {
                    return true;
                }
            }).m1976c())).m1681i();
        } catch (KeyManagementException e) {
            e.printStackTrace();
            return null;
        } catch (KeyStoreException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static native String getLogTokenKey();

    public static native String getNetKey();

    public static native String getSSL1234Key();

    public static native String getServerTokenKey();
}
