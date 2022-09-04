package org.p286a.p287a.p320o;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import org.apache.http.util.VersionInfo;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: org.a.a.o.g */
/* loaded from: classes2.dex */
public class C11360g {

    /* renamed from: a */
    public static final String f36438a = "UNAVAILABLE";

    /* renamed from: b */
    public static final String f36439b = "version.properties";

    /* renamed from: c */
    public static final String f36440c = "info.module";

    /* renamed from: d */
    public static final String f36441d = "info.release";

    /* renamed from: e */
    public static final String f36442e = "info.timestamp";

    /* renamed from: f */
    private final String f36443f;

    /* renamed from: g */
    private final String f36444g;

    /* renamed from: h */
    private final String f36445h;

    /* renamed from: i */
    private final String f36446i;

    /* renamed from: j */
    private final String f36447j;

    protected C11360g(String str, String str2, String str3, String str4, String str5) {
        C11354a.m1321a(str, "Package identifier");
        this.f36443f = str;
        this.f36444g = str2 == null ? f36438a : str2;
        this.f36445h = str3 == null ? f36438a : str3;
        this.f36446i = str4 == null ? f36438a : str4;
        this.f36447j = str5 == null ? f36438a : str5;
    }

    /* renamed from: a */
    public static String m1293a(String str, String str2, Class<?> cls) {
        C11360g m1294a = m1294a(str2, cls.getClassLoader());
        return str + "/" + (m1294a != null ? m1294a.m1289c() : f36438a) + " (Java 1.5 minimum; Java/" + System.getProperty("java.version") + ")";
    }

    /* renamed from: a */
    public static C11360g m1294a(String str, ClassLoader classLoader) {
        Properties properties;
        C11354a.m1321a(str, "Package identifier");
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        try {
            InputStream resourceAsStream = classLoader.getResourceAsStream(str.replace(C0494h.f686G, '/') + "/" + f36439b);
            if (resourceAsStream != null) {
                properties = new Properties();
                properties.load(resourceAsStream);
                try {
                    resourceAsStream.close();
                } catch (IOException e) {
                }
            } else {
                properties = null;
            }
        } catch (IOException e2) {
            properties = null;
        }
        if (properties != null) {
            return m1292a(str, properties, classLoader);
        }
        return null;
    }

    /* renamed from: a */
    protected static C11360g m1292a(String str, Map<?, ?> map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        String str5 = null;
        C11354a.m1321a(str, "Package identifier");
        if (map != null) {
            String str6 = (String) map.get(f36440c);
            String str7 = (str6 == null || str6.length() >= 1) ? str6 : null;
            String str8 = (String) map.get(f36441d);
            String str9 = (str8 == null || (str8.length() >= 1 && !str8.equals("${pom.version}"))) ? str8 : null;
            String str10 = (String) map.get(f36442e);
            if (str10 == null || (str10.length() >= 1 && !str10.equals("${mvn.timestamp}"))) {
                str2 = str10;
                str3 = str9;
                str4 = str7;
            } else {
                str2 = null;
                str3 = str9;
                str4 = str7;
            }
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if (classLoader != null) {
            str5 = classLoader.toString();
        }
        return new C11360g(str, str4, str3, str2, str5);
    }

    /* renamed from: a */
    public static VersionInfo[] m1291a(String[] strArr, ClassLoader classLoader) {
        C11354a.m1321a(strArr, "Package identifier array");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            C11360g m1294a = m1294a(str, classLoader);
            if (m1294a != null) {
                arrayList.add(m1294a);
            }
        }
        return (VersionInfo[]) arrayList.toArray(new VersionInfo[arrayList.size()]);
    }

    /* renamed from: a */
    public final String m1295a() {
        return this.f36443f;
    }

    /* renamed from: b */
    public final String m1290b() {
        return this.f36444g;
    }

    /* renamed from: c */
    public final String m1289c() {
        return this.f36445h;
    }

    /* renamed from: d */
    public final String m1288d() {
        return this.f36446i;
    }

    /* renamed from: e */
    public final String m1287e() {
        return this.f36447j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f36443f.length() + 20 + this.f36444g.length() + this.f36445h.length() + this.f36446i.length() + this.f36447j.length());
        sb.append("VersionInfo(").append(this.f36443f).append(C0494h.f680A).append(this.f36444g);
        if (!f36438a.equals(this.f36445h)) {
            sb.append(C0494h.f680A).append(this.f36445h);
        }
        if (!f36438a.equals(this.f36446i)) {
            sb.append(C0494h.f680A).append(this.f36446i);
        }
        sb.append(C0494h.f732t);
        if (!f36438a.equals(this.f36447j)) {
            sb.append('@').append(this.f36447j);
        }
        return sb.toString();
    }
}
