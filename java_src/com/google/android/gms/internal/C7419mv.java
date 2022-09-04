package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/* renamed from: com.google.android.gms.internal.mv */
/* loaded from: classes2.dex */
public class C7419mv {

    /* renamed from: a */
    private Map<String, Map<String, byte[]>> f24852a;

    /* renamed from: b */
    private long f24853b;

    public C7419mv(Map<String, Map<String, byte[]>> map, long j) {
        this.f24852a = map;
        this.f24853b = j;
    }

    /* renamed from: a */
    public Map<String, Map<String, byte[]>> m14543a() {
        return this.f24852a;
    }

    /* renamed from: a */
    public void m14542a(long j) {
        this.f24853b = j;
    }

    /* renamed from: a */
    public void m14539a(Map<String, byte[]> map, String str) {
        if (this.f24852a == null) {
            this.f24852a = new HashMap();
        }
        this.f24852a.put(str, map);
    }

    /* renamed from: a */
    public boolean m14541a(String str) {
        if (str == null) {
            return false;
        }
        return m14538b() && this.f24852a.get(str) != null && !this.f24852a.get(str).isEmpty();
    }

    /* renamed from: a */
    public boolean m14540a(String str, String str2) {
        return m14538b() && m14541a(str2) && m14537b(str, str2) != null;
    }

    /* renamed from: b */
    public boolean m14538b() {
        return this.f24852a != null && !this.f24852a.isEmpty();
    }

    /* renamed from: b */
    public byte[] m14537b(String str, String str2) {
        if (str == null || !m14541a(str2)) {
            return null;
        }
        return this.f24852a.get(str2).get(str);
    }

    /* renamed from: c */
    public long m14536c() {
        return this.f24853b;
    }

    /* renamed from: c */
    public Set<String> m14535c(String str, String str2) {
        TreeSet treeSet = new TreeSet();
        if (!m14541a(str2)) {
            return treeSet;
        }
        if (str == null || str.isEmpty()) {
            return this.f24852a.get(str2).keySet();
        }
        for (String str3 : this.f24852a.get(str2).keySet()) {
            if (str3.startsWith(str)) {
                treeSet.add(str3);
            }
        }
        return treeSet;
    }
}
