package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.analytics.internal.c */
/* loaded from: classes2.dex */
public class C3887c {

    /* renamed from: a */
    private final Map<String, String> f15071a;

    /* renamed from: b */
    private final List<Command> f15072b;

    /* renamed from: c */
    private final long f15073c;

    /* renamed from: d */
    private final long f15074d;

    /* renamed from: e */
    private final int f15075e;

    /* renamed from: f */
    private final boolean f15076f;

    /* renamed from: g */
    private final String f15077g;

    public C3887c(C3919s c3919s, Map<String, String> map, long j, boolean z) {
        this(c3919s, map, j, z, 0L, 0, null);
    }

    public C3887c(C3919s c3919s, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(c3919s, map, j, z, j2, i, null);
    }

    public C3887c(C3919s c3919s, Map<String, String> map, long j, boolean z, long j2, int i, List<Command> list) {
        String m26315a;
        String m26315a2;
        C4588d.m23627a(c3919s);
        C4588d.m23627a(map);
        this.f15074d = j;
        this.f15076f = z;
        this.f15073c = j2;
        this.f15075e = i;
        this.f15072b = list != null ? list : Collections.emptyList();
        this.f15077g = m26312a(list);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (m26314a(entry.getKey()) && (m26315a2 = m26315a(c3919s, entry.getKey())) != null) {
                hashMap.put(m26315a2, m26310b(c3919s, entry.getValue()));
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            if (!m26314a(entry2.getKey()) && (m26315a = m26315a(c3919s, entry2.getKey())) != null) {
                hashMap.put(m26315a, m26310b(c3919s, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.f15077g)) {
            C3909p.m26192a(hashMap, "_v", this.f15077g);
            if (this.f15077g.equals("ma4.0.0") || this.f15077g.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.f15071a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static C3887c m26316a(C3919s c3919s, C3887c c3887c, Map<String, String> map) {
        return new C3887c(c3919s, map, c3887c.m26308d(), c3887c.m26306f(), c3887c.m26309c(), c3887c.m26317a(), c3887c.m26307e());
    }

    /* renamed from: a */
    private static String m26315a(C3919s c3919s, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            c3919s.m26144c("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (!TextUtils.isEmpty(obj2)) {
            return obj2;
        }
        return null;
    }

    /* renamed from: a */
    private String m26313a(String str, String str2) {
        C4588d.m23625a(str);
        C4588d.m23618b(!str.startsWith("&"), "Short param name required");
        String str3 = this.f15071a.get(str);
        return str3 != null ? str3 : str2;
    }

    /* renamed from: a */
    private static String m26312a(List<Command> list) {
        String str;
        if (list != null) {
            for (Command command : list) {
                if ("appendVersion".equals(command.m26455a())) {
                    str = command.m26453b();
                    break;
                }
            }
        }
        str = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    private static boolean m26314a(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    /* renamed from: b */
    private static String m26310b(C3919s c3919s, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length > 8192) {
            String substring = obj2.substring(0, 8192);
            c3919s.m26144c("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
            return substring;
        }
        return obj2;
    }

    /* renamed from: a */
    public int m26317a() {
        return this.f15075e;
    }

    /* renamed from: b */
    public Map<String, String> m26311b() {
        return this.f15071a;
    }

    /* renamed from: c */
    public long m26309c() {
        return this.f15073c;
    }

    /* renamed from: d */
    public long m26308d() {
        return this.f15074d;
    }

    /* renamed from: e */
    public List<Command> m26307e() {
        return this.f15072b;
    }

    /* renamed from: f */
    public boolean m26306f() {
        return this.f15076f;
    }

    /* renamed from: g */
    public long m26305g() {
        return C3909p.m26188b(m26313a("_s", "0"));
    }

    /* renamed from: h */
    public String m26304h() {
        return m26313a("_m", "");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ht=").append(this.f15074d);
        if (this.f15073c != 0) {
            stringBuffer.append(", dbId=").append(this.f15073c);
        }
        if (this.f15075e != 0) {
            stringBuffer.append(", appUID=").append(this.f15075e);
        }
        ArrayList<String> arrayList = new ArrayList(this.f15071a.keySet());
        Collections.sort(arrayList);
        for (String str : arrayList) {
            stringBuffer.append(", ");
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append(this.f15071a.get(str));
        }
        return stringBuffer.toString();
    }
}
