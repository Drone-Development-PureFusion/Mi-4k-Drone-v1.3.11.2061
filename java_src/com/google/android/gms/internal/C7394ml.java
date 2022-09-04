package com.google.android.gms.internal;

import com.google.firebase.database.C9866d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.internal.ml */
/* loaded from: classes2.dex */
public class C7394ml {

    /* renamed from: a */
    private static final Pattern f24621a = Pattern.compile("[\\[\\]\\.#$]");

    /* renamed from: b */
    private static final Pattern f24622b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    /* renamed from: a */
    public static Map<C7160ij, AbstractC7344lh> m14601a(C7160ij c7160ij, Map<String, Object> map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            C7160ij c7160ij2 = new C7160ij(entry.getKey());
            Object value = entry.getValue();
            C7235iz.m15147a(c7160ij.m15370a(c7160ij2), value);
            String m14823e = !c7160ij2.m15356h() ? c7160ij2.m15357g().m14823e() : "";
            if (m14823e.equals(".sv") || m14823e.equals(".value")) {
                String valueOf = String.valueOf(c7160ij2);
                throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(m14823e).length()).append("Path '").append(valueOf).append("' contains disallowed child name: ").append(m14823e).toString());
            } else if (m14823e.equals(".priority") && !C7350ll.m14729a(C7347li.m14735a(value))) {
                String valueOf2 = String.valueOf(c7160ij2);
                throw new C9866d(new StringBuilder(String.valueOf(valueOf2).length() + 83).append("Path '").append(valueOf2).append("' contains invalid priority (must be a string, double, ServerValue, or null).").toString());
            } else {
                m14600a(value);
                treeMap.put(c7160ij2, C7347li.m14735a(value));
            }
        }
        C7160ij c7160ij3 = null;
        Iterator it2 = treeMap.keySet().iterator();
        while (true) {
            C7160ij c7160ij4 = c7160ij3;
            if (it2.hasNext()) {
                c7160ij3 = (C7160ij) it2.next();
                C7392mk.m14607a(c7160ij4 == null || c7160ij4.compareTo(c7160ij3) < 0);
                if (c7160ij4 != null && c7160ij4.m15366b(c7160ij3)) {
                    String valueOf3 = String.valueOf(c7160ij4);
                    String valueOf4 = String.valueOf(c7160ij3);
                    throw new C9866d(new StringBuilder(String.valueOf(valueOf3).length() + 42 + String.valueOf(valueOf4).length()).append("Path '").append(valueOf3).append("' is an ancestor of '").append(valueOf4).append("' in an update.").toString());
                }
            } else {
                return treeMap;
            }
        }
    }

    /* renamed from: a */
    public static void m14602a(C7160ij c7160ij) {
        if (!m14598b(c7160ij)) {
            String valueOf = String.valueOf(c7160ij.toString());
            throw new C9866d(valueOf.length() != 0 ? "Invalid write location: ".concat(valueOf) : new String("Invalid write location: "));
        }
    }

    /* renamed from: a */
    public static void m14600a(Object obj) {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return;
            }
            for (Object obj2 : (List) obj) {
                m14600a(obj2);
            }
            return;
        }
        Map map = (Map) obj;
        if (map.containsKey(".sv")) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            m14595d((String) entry.getKey());
            m14600a(entry.getValue());
        }
    }

    /* renamed from: a */
    public static void m14599a(String str) {
        if (!m14594e(str)) {
            throw new C9866d(new StringBuilder(String.valueOf(str).length() + 101).append("Invalid Firebase Database path: ").append(str).append(". Firebase Database paths must not contain '.', '#', '$', '[', or ']'").toString());
        }
    }

    /* renamed from: b */
    public static void m14597b(String str) {
        if (str.startsWith(".info")) {
            m14599a(str.substring(5));
        } else if (str.startsWith("/.info")) {
            m14599a(str.substring(6));
        } else {
            m14599a(str);
        }
    }

    /* renamed from: b */
    private static boolean m14598b(C7160ij c7160ij) {
        C7319kv m15363d = c7160ij.m15363d();
        return m15363d == null || !m15363d.m14823e().startsWith(".");
    }

    /* renamed from: c */
    public static void m14596c(String str) {
        if (str == null || m14592g(str)) {
            return;
        }
        throw new C9866d(new StringBuilder(String.valueOf(str).length() + 68).append("Invalid key: ").append(str).append(". Keys must not contain '/', '.', '#', '$', '[', or ']'").toString());
    }

    /* renamed from: d */
    public static void m14595d(String str) {
        if (!m14593f(str)) {
            throw new C9866d(new StringBuilder(String.valueOf(str).length() + 68).append("Invalid key: ").append(str).append(". Keys must not contain '/', '.', '#', '$', '[', or ']'").toString());
        }
    }

    /* renamed from: e */
    private static boolean m14594e(String str) {
        return !f24621a.matcher(str).find();
    }

    /* renamed from: f */
    private static boolean m14593f(String str) {
        return str != null && str.length() > 0 && (str.equals(".value") || str.equals(".priority") || (!str.startsWith(".") && !f24622b.matcher(str).find()));
    }

    /* renamed from: g */
    private static boolean m14592g(String str) {
        return str.equals(".info") || !f24622b.matcher(str).find();
    }
}
