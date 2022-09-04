package com.fimi.kernel.utils;

import android.content.Context;
import android.content.SharedPreferences;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* renamed from: com.fimi.kernel.utils.v */
/* loaded from: classes.dex */
public class C1681v {

    /* renamed from: a */
    public static final int f4142a = 0;

    /* renamed from: b */
    public static final int f4143b = 1;

    /* renamed from: d */
    private static C1681v f4144d = null;

    /* renamed from: e */
    private static final String f4145e = "miserver_preferen_";

    /* renamed from: f */
    private static final String f4146f = "bottomstateshow";

    /* renamed from: g */
    private static final String f4147g = "flight_distance";

    /* renamed from: h */
    private static final String f4148h = "flight_return_height";

    /* renamed from: i */
    private static final String f4149i = "flight_h_v_speed";

    /* renamed from: j */
    private static final String f4150j = "flight_h_v_height";

    /* renamed from: k */
    private static final String f4151k = "optical_flow_apply";

    /* renamed from: l */
    private static final String f4152l = "pip_format_dialog";

    /* renamed from: m */
    private static final String f4153m = "pip_tf_card_fault_dialog";

    /* renamed from: n */
    private static final String f4154n = "show_9_guid";

    /* renamed from: o */
    private static final String f4155o = "force_attitude_dialog_show_count";

    /* renamed from: p */
    private static final String f4156p = "foot_open";

    /* renamed from: q */
    private static final String f4157q = "emergency_stop_pulp";

    /* renamed from: r */
    private static final String f4158r = "select_device";

    /* renamed from: s */
    private static final String f4159s = "calibration_angle";

    /* renamed from: t */
    private static final String f4160t = "gimal_sensitivity";

    /* renamed from: u */
    private static final String f4161u = "open_full_screen_lead_page";

    /* renamed from: v */
    private static final String f4162v = "close_full_screen_lead_page";

    /* renamed from: c */
    private SharedPreferences f4163c;

    /* renamed from: w */
    private String f4164w;

    /* renamed from: x */
    private C1651a f4165x;

    public C1681v(Context context) {
        this.f4163c = null;
        this.f4164w = "";
        if (this.f4163c == null) {
            this.f4163c = context.getSharedPreferences("miserver_preferen_", 0);
        }
        this.f4164w = PreferenceSecretKey.getSecretKey();
    }

    /* renamed from: a */
    public static C1681v m34543a(Context context) {
        if (f4144d == null) {
            f4144d = new C1681v(context);
        }
        return f4144d;
    }

    /* renamed from: a */
    public SharedPreferences m34546a() {
        return this.f4163c;
    }

    /* renamed from: a */
    public void m34545a(int i) {
        this.f4163c.edit().putInt("cameraplaystate", i).commit();
    }

    /* renamed from: a */
    public void m34544a(long j) {
        this.f4163c.edit().putLong("play_index", j).commit();
    }

    /* renamed from: a */
    public void m34542a(String str) {
        this.f4163c.edit().putString(f4147g, str).commit();
    }

    /* renamed from: a */
    public void m34541a(String str, int i) {
        SharedPreferences.Editor edit = this.f4163c.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    /* renamed from: a */
    public void m34540a(String str, String str2) {
        try {
            this.f4163c.edit().putString(str, m34508j(str2)).commit();
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void m34539a(boolean z) {
        this.f4163c.edit().putBoolean(f4146f, z).commit();
    }

    /* renamed from: b */
    public Boolean m34538b() {
        return false;
    }

    /* renamed from: b */
    public void m34537b(int i) {
        this.f4163c.edit().putInt(f4160t, i).commit();
    }

    /* renamed from: b */
    public void m34536b(String str) {
        this.f4163c.edit().putString(f4148h, str).commit();
    }

    /* renamed from: b */
    public void m34535b(boolean z) {
        this.f4163c.edit().putBoolean(f4159s, z).commit();
    }

    /* renamed from: c */
    public int m34534c() {
        return this.f4163c.getInt("cameraplaystate", 0);
    }

    /* renamed from: c */
    public void m34533c(int i) {
        this.f4163c.edit().putInt(f4155o, i).commit();
    }

    /* renamed from: c */
    public void m34532c(String str) {
        this.f4163c.edit().putString(f4149i, str).commit();
    }

    /* renamed from: c */
    public void m34531c(boolean z) {
        this.f4163c.edit().putBoolean(f4151k, z).commit();
    }

    /* renamed from: d */
    public void m34529d(int i) {
        this.f4163c.edit().putInt(f4158r, i).commit();
    }

    /* renamed from: d */
    public void m34528d(String str) {
        this.f4163c.edit().putString(f4150j, str).commit();
    }

    /* renamed from: d */
    public void m34527d(boolean z) {
        this.f4163c.edit().putBoolean(f4152l, z).commit();
    }

    /* renamed from: d */
    public boolean m34530d() {
        return this.f4163c.getBoolean(f4146f, true);
    }

    /* renamed from: e */
    public int m34524e(String str) {
        return this.f4163c.getInt(str, 0);
    }

    /* renamed from: e */
    public void m34525e(int i) {
        this.f4163c.edit().putInt(f4157q, i).commit();
    }

    /* renamed from: e */
    public void m34523e(boolean z) {
        this.f4163c.edit().putBoolean(f4153m, z).commit();
    }

    /* renamed from: e */
    public boolean m34526e() {
        return this.f4163c.getBoolean(f4159s, true);
    }

    /* renamed from: f */
    public int m34522f() {
        return this.f4163c.getInt(f4160t, 100);
    }

    /* renamed from: f */
    public void m34521f(int i) {
        this.f4163c.edit().putInt("deviceType", i).commit();
    }

    /* renamed from: f */
    public void m34520f(String str) {
        this.f4163c.edit().putString("appNoflyZoneMd5", str).commit();
    }

    /* renamed from: f */
    public void m34519f(boolean z) {
        this.f4163c.edit().putBoolean(f4154n, z).commit();
    }

    /* renamed from: g */
    public String m34518g() {
        return this.f4163c.getString(f4147g, "500");
    }

    /* renamed from: g */
    public void m34517g(String str) {
        this.f4163c.edit().remove(str).commit();
    }

    /* renamed from: g */
    public void m34516g(boolean z) {
        this.f4163c.edit().putBoolean(f4156p, z).commit();
    }

    /* renamed from: h */
    public String m34515h() {
        return this.f4163c.getString(f4148h, C0548a.f933d);
    }

    /* renamed from: h */
    public String m34514h(String str) {
        try {
            return m34511i(this.f4163c.getString(str, ""));
        } catch (Exception e) {
            return "";
        }
    }

    /* renamed from: h */
    public void m34513h(boolean z) {
        this.f4163c.edit().putBoolean("flyZoneType", z).commit();
    }

    /* renamed from: i */
    public String m34512i() {
        return this.f4163c.getString(f4149i, "10");
    }

    /* renamed from: i */
    public String m34511i(String str) {
        try {
            return C1677r.m34604a(str, this.f4164w);
        } catch (Exception e) {
            return "";
        }
    }

    /* renamed from: i */
    public void m34510i(boolean z) {
        this.f4163c.edit().putBoolean(f4161u, z).commit();
    }

    /* renamed from: j */
    public String m34509j() {
        return this.f4163c.getString(f4150j, "120");
    }

    /* renamed from: j */
    public String m34508j(String str) {
        try {
            return C1677r.m34600b(str, this.f4164w);
        } catch (Exception e) {
            return "";
        }
    }

    /* renamed from: j */
    public void m34507j(boolean z) {
        this.f4163c.edit().putBoolean(f4162v, z).commit();
    }

    /* renamed from: k */
    public boolean m34506k() {
        return this.f4163c.getBoolean(f4151k, false);
    }

    /* renamed from: l */
    public boolean m34505l() {
        return this.f4163c.getBoolean(f4152l, true);
    }

    /* renamed from: m */
    public boolean m34504m() {
        return this.f4163c.getBoolean(f4153m, true);
    }

    /* renamed from: n */
    public boolean m34503n() {
        return this.f4163c.getBoolean(f4154n, false);
    }

    /* renamed from: o */
    public int m34502o() {
        return this.f4163c.getInt(f4155o, 0);
    }

    /* renamed from: p */
    public boolean m34501p() {
        return this.f4163c.getBoolean(f4156p, false);
    }

    /* renamed from: q */
    public long m34500q() {
        return this.f4163c.getLong("play_index", 0L);
    }

    /* renamed from: r */
    public int m34499r() {
        return this.f4163c.getInt(f4158r, 0);
    }

    /* renamed from: s */
    public int m34498s() {
        return this.f4163c.getInt(f4157q, 0);
    }

    /* renamed from: t */
    public boolean m34497t() {
        return this.f4163c.getBoolean("flyZoneType", false);
    }

    /* renamed from: u */
    public String m34496u() {
        return this.f4163c.getString("appNoflyZoneMd5", "");
    }

    /* renamed from: v */
    public int m34495v() {
        return this.f4163c.getInt("deviceType", 0);
    }

    /* renamed from: w */
    public boolean m34494w() {
        return this.f4163c.getBoolean(f4161u, false);
    }

    /* renamed from: x */
    public boolean m34493x() {
        return this.f4163c.getBoolean(f4162v, false);
    }
}
