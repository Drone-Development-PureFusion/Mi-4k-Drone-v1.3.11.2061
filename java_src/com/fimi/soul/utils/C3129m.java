package com.fimi.soul.utils;

import android.os.Environment;
/* renamed from: com.fimi.soul.utils.m */
/* loaded from: classes.dex */
public class C3129m {
    /* renamed from: a */
    public static String m29070a() {
        return Environment.getExternalStorageDirectory().getPath() + "/MiDroneEn/";
    }

    /* renamed from: a */
    public static String m29069a(String str) {
        return m29065b(m29053n(), str);
    }

    /* renamed from: a */
    public static String m29068a(String str, String str2) {
        return m29053n() + "THUMB_VIDEO_" + (str2 != null ? str2.replaceAll(" ", "") : "") + "_" + str.substring(0, str.lastIndexOf(".")) + ".jpg";
    }

    /* renamed from: b */
    public static String m29067b() {
        return m29070a() + "/Parameters/";
    }

    /* renamed from: b */
    public static String m29066b(String str) {
        return m29065b(m29046u(), str);
    }

    /* renamed from: b */
    private static String m29065b(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    /* renamed from: c */
    public static String m29064c() {
        return m29070a() + "/Waypoints/";
    }

    /* renamed from: d */
    public static String m29063d() {
        return m29070a() + "/GCP/";
    }

    /* renamed from: e */
    public static String m29062e() {
        return m29070a() + "/Logs/";
    }

    /* renamed from: f */
    public static String m29061f() {
        return m29070a() + "/Maps/";
    }

    /* renamed from: g */
    public static String m29060g() {
        return m29070a() + "/CameraInfo/";
    }

    /* renamed from: h */
    public static String m29059h() {
        return m29070a() + "/LogCat/";
    }

    /* renamed from: i */
    public static String m29058i() {
        return m29070a() + "/update/";
    }

    /* renamed from: j */
    public static String m29057j() {
        return m29070a() + "/wifi/";
    }

    /* renamed from: k */
    public static String m29056k() {
        return m29070a() + "/ErrorCode/";
    }

    /* renamed from: l */
    public static String m29055l() {
        return m29070a() + "PlaneMedia/";
    }

    /* renamed from: m */
    public static String m29054m() {
        return m29070a() + "LOGDOWN/";
    }

    /* renamed from: n */
    public static String m29053n() {
        return m29055l() + "cache/";
    }

    /* renamed from: o */
    public static String m29052o() {
        return m29070a() + "rlgv/";
    }

    /* renamed from: p */
    public static String m29051p() {
        return m29070a() + "lgv";
    }

    /* renamed from: q */
    public static String m29050q() {
        return "ev";
    }

    /* renamed from: r */
    public static String m29049r() {
        return "sv";
    }

    /* renamed from: s */
    public static String m29048s() {
        return "ds";
    }

    /* renamed from: t */
    public static String m29047t() {
        return m29070a() + "/cameraprivew/";
    }

    /* renamed from: u */
    public static String m29046u() {
        return Environment.getExternalStorageDirectory().getPath() + "/DCIM/MiDrone/";
    }

    /* renamed from: v */
    public static String m29045v() {
        return m29070a() + "/firmware/";
    }

    /* renamed from: w */
    public static String m29044w() {
        return m29070a() + "/CameraCmdLog/log.txt";
    }
}
