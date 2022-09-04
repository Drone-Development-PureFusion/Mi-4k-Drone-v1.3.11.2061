package p005b.p006a.p007a.p029b.p058r;

import java.util.ArrayList;
/* renamed from: b.a.a.b.r.l */
/* loaded from: classes.dex */
public class C0713l {
    /* renamed from: a */
    public static boolean m38418a() {
        String m38374c = C0724u.m38374c("os.name");
        String m38385a = C0724u.m38385a("ANDROID_ROOT");
        String m38385a2 = C0724u.m38385a("ANDROID_DATA");
        return m38374c != null && m38374c.contains("Linux") && m38385a != null && m38385a.contains("/system") && m38385a2 != null && m38385a2.contains("/data");
    }

    /* renamed from: a */
    private static boolean m38417a(int i) {
        ArrayList<String> arrayList = new ArrayList();
        for (int i2 = 0; i2 < 5; i2++) {
            arrayList.add("1." + (i + i2));
        }
        String property = System.getProperty("java.version");
        if (property == null) {
            return false;
        }
        for (String str : arrayList) {
            if (property.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m38416b() {
        return m38417a(5);
    }

    /* renamed from: c */
    public static boolean m38415c() {
        return m38417a(6);
    }

    /* renamed from: d */
    public static boolean m38414d() {
        return m38417a(7);
    }

    /* renamed from: e */
    public static boolean m38413e() {
        return System.getProperty("os.name").startsWith("Windows");
    }
}
