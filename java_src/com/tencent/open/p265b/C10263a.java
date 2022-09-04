package com.tencent.open.p265b;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.tencent.open.p264a.C10257f;
/* renamed from: com.tencent.open.b.a */
/* loaded from: classes2.dex */
public class C10263a {

    /* renamed from: a */
    protected static final String f31926a = C10263a.class.getName();

    /* renamed from: b */
    protected static final Uri f31927b = Uri.parse("content://telephony/carriers/preferapn");

    /* renamed from: a */
    public static String m5653a(Context context) {
        int m5650d = m5650d(context);
        if (m5650d == 2) {
            return "wifi";
        }
        if (m5650d == 1) {
            return "cmwap";
        }
        if (m5650d == 4) {
            return "cmnet";
        }
        if (m5650d == 16) {
            return "uniwap";
        }
        if (m5650d == 8) {
            return "uninet";
        }
        if (m5650d == 64) {
            return "wap";
        }
        if (m5650d == 32) {
            return "net";
        }
        if (m5650d == 512) {
            return "ctwap";
        }
        if (m5650d == 256) {
            return "ctnet";
        }
        if (m5650d == 2048) {
            return "3gnet";
        }
        if (m5650d == 1024) {
            return "3gwap";
        }
        String m5652b = m5652b(context);
        return (m5652b == null || m5652b.length() == 0) ? "none" : m5652b;
    }

    /* renamed from: b */
    public static String m5652b(Context context) {
        try {
            Cursor query = context.getContentResolver().query(f31927b, null, null, null, null);
            if (query == null) {
                return null;
            }
            query.moveToFirst();
            if (query.isAfterLast()) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            String string = query.getString(query.getColumnIndex("apn"));
            if (query == null) {
                return string;
            }
            query.close();
            return string;
        } catch (SecurityException e) {
            C10257f.m5667e(f31926a, "getApn has exception: " + e.getMessage());
            return "";
        }
    }

    /* renamed from: c */
    public static String m5651c(Context context) {
        try {
            Cursor query = context.getContentResolver().query(f31927b, null, null, null, null);
            if (query == null) {
                return null;
            }
            query.moveToFirst();
            if (query.isAfterLast()) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            String string = query.getString(query.getColumnIndex("proxy"));
            if (query == null) {
                return string;
            }
            query.close();
            return string;
        } catch (SecurityException e) {
            C10257f.m5667e(f31926a, "getApnProxy has exception: " + e.getMessage());
            return "";
        }
    }

    /* renamed from: d */
    public static int m5650d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            C10257f.m5667e(f31926a, "getMProxyType has exception: " + e.getMessage());
        }
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (activeNetworkInfo.getTypeName().toUpperCase().equals("WIFI")) {
                return 2;
            }
            String lowerCase = activeNetworkInfo.getExtraInfo().toLowerCase();
            if (lowerCase.startsWith("cmwap")) {
                return 1;
            }
            if (lowerCase.startsWith("cmnet") || lowerCase.startsWith("epc.tmobile.com")) {
                return 4;
            }
            if (lowerCase.startsWith("uniwap")) {
                return 16;
            }
            if (lowerCase.startsWith("uninet")) {
                return 8;
            }
            if (lowerCase.startsWith("wap")) {
                return 64;
            }
            if (lowerCase.startsWith("net")) {
                return 32;
            }
            if (lowerCase.startsWith("ctwap")) {
                return 512;
            }
            if (lowerCase.startsWith("ctnet")) {
                return 256;
            }
            if (lowerCase.startsWith("3gwap")) {
                return 1024;
            }
            if (lowerCase.startsWith("3gnet")) {
                return 2048;
            }
            if (lowerCase.startsWith("#777")) {
                String m5651c = m5651c(context);
                if (m5651c != null) {
                    if (m5651c.length() > 0) {
                        return 512;
                    }
                }
                return 256;
            }
            return 128;
        }
        return 128;
    }

    /* renamed from: e */
    public static String m5649e(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) ? "MOBILE" : activeNetworkInfo.getTypeName();
    }
}
