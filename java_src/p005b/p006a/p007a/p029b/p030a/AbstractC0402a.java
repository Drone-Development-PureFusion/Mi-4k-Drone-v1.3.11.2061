package p005b.p006a.p007a.p029b.p030a;

import android.os.Environment;
import p005b.p006a.p007a.p029b.p058r.C0713l;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0402a {

    /* renamed from: a */
    private static final String f474a = "assets";

    /* renamed from: a */
    public static String m39417a() {
        if (C0713l.m38418a()) {
            String externalStorageState = Environment.getExternalStorageState();
            if (!externalStorageState.equals("mounted") && !externalStorageState.equals("mounted_ro")) {
                return null;
            }
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        return "/mnt/sdcard";
    }

    /* renamed from: a */
    public static String m39416a(String str) {
        return (C0713l.m38418a() ? Environment.getDataDirectory().getAbsolutePath() : "/data") + "/data/" + str + "/files";
    }

    /* renamed from: b */
    public static String m39415b() {
        if (C0713l.m38418a()) {
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        String m38385a = C0724u.m38385a("EXTERNAL_STORAGE");
        return m38385a == null ? "/sdcard" : m38385a;
    }

    /* renamed from: b */
    public static String m39414b(String str) {
        return (C0713l.m38418a() ? Environment.getDataDirectory().getAbsolutePath() : "/data") + "/data/" + str + "/databases";
    }

    /* renamed from: c */
    public static String m39413c() {
        return f474a;
    }
}
