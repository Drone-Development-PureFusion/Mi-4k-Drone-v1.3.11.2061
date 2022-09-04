package com.google.android.gms.internal;

import com.google.firebase.database.C9866d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.iz */
/* loaded from: classes2.dex */
public class C7235iz {

    /* renamed from: a */
    private final List<String> f24296a = new ArrayList();

    /* renamed from: b */
    private int f24297b;

    private C7235iz(C7160ij c7160ij) {
        this.f24297b = 0;
        Iterator<C7319kv> it2 = c7160ij.iterator();
        while (it2.hasNext()) {
            this.f24296a.add(it2.next().m14823e());
        }
        this.f24297b = Math.max(1, this.f24296a.size());
        for (int i = 0; i < this.f24296a.size(); i++) {
            this.f24297b = m15146a((CharSequence) this.f24296a.get(i)) + this.f24297b;
        }
        m15142b();
    }

    /* renamed from: a */
    private static int m15146a(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt <= 127) {
                i2++;
            } else if (charAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private String m15148a() {
        String remove = this.f24296a.remove(this.f24296a.size() - 1);
        this.f24297b -= m15146a((CharSequence) remove);
        if (this.f24296a.size() > 0) {
            this.f24297b--;
        }
        return remove;
    }

    /* renamed from: a */
    private static String m15143a(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < list.size()) {
                if (i2 > 0) {
                    sb.append(str);
                }
                sb.append(list.get(i2));
                i = i2 + 1;
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    public static void m15147a(C7160ij c7160ij, Object obj) {
        new C7235iz(c7160ij).m15145a(obj);
    }

    /* renamed from: a */
    private void m15145a(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    m15144a(str);
                    m15145a(map.get(str));
                    m15148a();
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                m15144a(Integer.toString(i));
                m15145a(list.get(i));
                m15148a();
            }
        }
    }

    /* renamed from: a */
    private void m15144a(String str) {
        if (this.f24296a.size() > 0) {
            this.f24297b++;
        }
        this.f24296a.add(str);
        this.f24297b += m15146a((CharSequence) str);
        m15142b();
    }

    /* renamed from: b */
    private void m15142b() {
        if (this.f24297b > 768) {
            String valueOf = String.valueOf("Data has a key path longer than 768 bytes (");
            throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append(this.f24297b).append(").").toString());
        } else if (this.f24296a.size() <= 32) {
        } else {
            String valueOf2 = String.valueOf("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
            String valueOf3 = String.valueOf(m15141c());
            throw new C9866d(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
        }
    }

    /* renamed from: c */
    private String m15141c() {
        if (this.f24296a.size() == 0) {
            return "";
        }
        String valueOf = String.valueOf(m15143a("/", this.f24296a));
        return new StringBuilder(String.valueOf(valueOf).length() + 10).append("in path '").append(valueOf).append("'").toString();
    }
}
