package com.xiaomi.smack.packet;

import android.os.Bundle;
import com.xiaomi.smack.util.C10749d;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.xiaomi.smack.packet.b */
/* loaded from: classes.dex */
public class C10732b extends AbstractC10735d {

    /* renamed from: c */
    private C10733a f33459c;

    /* renamed from: d */
    private final Map<String, String> f33460d;

    /* renamed from: com.xiaomi.smack.packet.b$a */
    /* loaded from: classes2.dex */
    public static class C10733a {

        /* renamed from: a */
        public static final C10733a f33461a = new C10733a("get");

        /* renamed from: b */
        public static final C10733a f33462b = new C10733a("set");

        /* renamed from: c */
        public static final C10733a f33463c = new C10733a("result");

        /* renamed from: d */
        public static final C10733a f33464d = new C10733a("error");

        /* renamed from: e */
        public static final C10733a f33465e = new C10733a("command");

        /* renamed from: f */
        private String f33466f;

        private C10733a(String str) {
            this.f33466f = str;
        }

        /* renamed from: a */
        public static C10733a m3911a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            if (f33461a.toString().equals(lowerCase)) {
                return f33461a;
            }
            if (f33462b.toString().equals(lowerCase)) {
                return f33462b;
            }
            if (f33464d.toString().equals(lowerCase)) {
                return f33464d;
            }
            if (f33463c.toString().equals(lowerCase)) {
                return f33463c;
            }
            if (!f33465e.toString().equals(lowerCase)) {
                return null;
            }
            return f33465e;
        }

        public String toString() {
            return this.f33466f;
        }
    }

    public C10732b() {
        this.f33459c = C10733a.f33461a;
        this.f33460d = new HashMap();
    }

    public C10732b(Bundle bundle) {
        super(bundle);
        this.f33459c = C10733a.f33461a;
        this.f33460d = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.f33459c = C10733a.m3911a(bundle.getString("ext_iq_type"));
        }
    }

    /* renamed from: a */
    public C10733a m3914a() {
        return this.f33459c;
    }

    /* renamed from: a */
    public void m3913a(C10733a c10733a) {
        if (c10733a == null) {
            this.f33459c = C10733a.f33461a;
        } else {
            this.f33459c = c10733a;
        }
    }

    /* renamed from: a */
    public synchronized void m3912a(Map<String, String> map) {
        this.f33460d.putAll(map);
    }

    @Override // com.xiaomi.smack.packet.AbstractC10735d
    /* renamed from: b */
    public Bundle mo3863b() {
        Bundle mo3863b = super.mo3863b();
        if (this.f33459c != null) {
            mo3863b.putString("ext_iq_type", this.f33459c.toString());
        }
        return mo3863b;
    }

    @Override // com.xiaomi.smack.packet.AbstractC10735d
    /* renamed from: c */
    public String mo3862c() {
        StringBuilder sb = new StringBuilder();
        sb.append("<iq ");
        if (k() != null) {
            sb.append("id=\"" + k() + "\" ");
        }
        if (m() != null) {
            sb.append("to=\"").append(C10749d.m3838a(m())).append("\" ");
        }
        if (n() != null) {
            sb.append("from=\"").append(C10749d.m3838a(n())).append("\" ");
        }
        if (l() != null) {
            sb.append("chid=\"").append(C10749d.m3838a(l())).append("\" ");
        }
        for (Map.Entry<String, String> entry : this.f33460d.entrySet()) {
            sb.append(C10749d.m3838a(entry.getKey())).append("=\"");
            sb.append(C10749d.m3838a(entry.getValue())).append("\" ");
        }
        if (this.f33459c == null) {
            sb.append("type=\"get\">");
        } else {
            sb.append("type=\"").append(m3914a()).append("\">");
        }
        String mo3841d = mo3841d();
        if (mo3841d != null) {
            sb.append(mo3841d);
        }
        sb.append(s());
        C10741h p = p();
        if (p != null) {
            sb.append(p.m3859b());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    /* renamed from: d */
    public String mo3841d() {
        return null;
    }
}
