package com.xiaomi.smack.packet;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.xiaomi.smack.packet.h */
/* loaded from: classes2.dex */
public class C10741h {

    /* renamed from: a */
    private int f33514a;

    /* renamed from: b */
    private String f33515b;

    /* renamed from: c */
    private String f33516c;

    /* renamed from: d */
    private String f33517d;

    /* renamed from: e */
    private String f33518e;

    /* renamed from: f */
    private List<C10731a> f33519f;

    /* renamed from: com.xiaomi.smack.packet.h$a */
    /* loaded from: classes2.dex */
    public static class C10742a {

        /* renamed from: a */
        public static final C10742a f33520a = new C10742a("internal-server-error");

        /* renamed from: b */
        public static final C10742a f33521b = new C10742a("forbidden");

        /* renamed from: c */
        public static final C10742a f33522c = new C10742a("bad-request");

        /* renamed from: d */
        public static final C10742a f33523d = new C10742a("conflict");

        /* renamed from: e */
        public static final C10742a f33524e = new C10742a("feature-not-implemented");

        /* renamed from: f */
        public static final C10742a f33525f = new C10742a("gone");

        /* renamed from: g */
        public static final C10742a f33526g = new C10742a("item-not-found");

        /* renamed from: h */
        public static final C10742a f33527h = new C10742a("jid-malformed");

        /* renamed from: i */
        public static final C10742a f33528i = new C10742a("not-acceptable");

        /* renamed from: j */
        public static final C10742a f33529j = new C10742a("not-allowed");

        /* renamed from: k */
        public static final C10742a f33530k = new C10742a("not-authorized");

        /* renamed from: l */
        public static final C10742a f33531l = new C10742a("payment-required");

        /* renamed from: m */
        public static final C10742a f33532m = new C10742a("recipient-unavailable");

        /* renamed from: n */
        public static final C10742a f33533n = new C10742a("redirect");

        /* renamed from: o */
        public static final C10742a f33534o = new C10742a("registration-required");

        /* renamed from: p */
        public static final C10742a f33535p = new C10742a("remote-server-error");

        /* renamed from: q */
        public static final C10742a f33536q = new C10742a("remote-server-not-found");

        /* renamed from: r */
        public static final C10742a f33537r = new C10742a("remote-server-timeout");

        /* renamed from: s */
        public static final C10742a f33538s = new C10742a("resource-constraint");

        /* renamed from: t */
        public static final C10742a f33539t = new C10742a("service-unavailable");

        /* renamed from: u */
        public static final C10742a f33540u = new C10742a("subscription-required");

        /* renamed from: v */
        public static final C10742a f33541v = new C10742a("undefined-condition");

        /* renamed from: w */
        public static final C10742a f33542w = new C10742a("unexpected-request");

        /* renamed from: x */
        public static final C10742a f33543x = new C10742a("request-timeout");

        /* renamed from: y */
        private String f33544y;

        public C10742a(String str) {
            this.f33544y = str;
        }

        public String toString() {
            return this.f33544y;
        }
    }

    public C10741h(int i, String str, String str2, String str3, String str4, List<C10731a> list) {
        this.f33519f = null;
        this.f33514a = i;
        this.f33515b = str;
        this.f33517d = str2;
        this.f33516c = str3;
        this.f33518e = str4;
        this.f33519f = list;
    }

    public C10741h(Bundle bundle) {
        this.f33519f = null;
        this.f33514a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f33515b = bundle.getString("ext_err_type");
        }
        this.f33516c = bundle.getString("ext_err_cond");
        this.f33517d = bundle.getString("ext_err_reason");
        this.f33518e = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f33519f = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                C10731a m3923a = C10731a.m3923a((Bundle) parcelable);
                if (m3923a != null) {
                    this.f33519f.add(m3923a);
                }
            }
        }
    }

    public C10741h(C10742a c10742a) {
        this.f33519f = null;
        m3860a(c10742a);
        this.f33518e = null;
    }

    /* renamed from: a */
    private void m3860a(C10742a c10742a) {
        this.f33516c = c10742a.f33544y;
    }

    /* renamed from: a */
    public Bundle m3861a() {
        Bundle bundle = new Bundle();
        if (this.f33515b != null) {
            bundle.putString("ext_err_type", this.f33515b);
        }
        bundle.putInt("ext_err_code", this.f33514a);
        if (this.f33517d != null) {
            bundle.putString("ext_err_reason", this.f33517d);
        }
        if (this.f33516c != null) {
            bundle.putString("ext_err_cond", this.f33516c);
        }
        if (this.f33518e != null) {
            bundle.putString("ext_err_msg", this.f33518e);
        }
        if (this.f33519f != null) {
            Bundle[] bundleArr = new Bundle[this.f33519f.size()];
            int i = 0;
            Iterator<C10731a> it2 = this.f33519f.iterator();
            while (true) {
                int i2 = i;
                if (!it2.hasNext()) {
                    break;
                }
                Bundle m3916e = it2.next().m3916e();
                if (m3916e != null) {
                    i = i2 + 1;
                    bundleArr[i2] = m3916e;
                } else {
                    i = i2;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* renamed from: b */
    public String m3859b() {
        StringBuilder sb = new StringBuilder();
        sb.append("<error code=\"").append(this.f33514a).append("\"");
        if (this.f33515b != null) {
            sb.append(" type=\"");
            sb.append(this.f33515b);
            sb.append("\"");
        }
        if (this.f33517d != null) {
            sb.append(" reason=\"");
            sb.append(this.f33517d);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f33516c != null) {
            sb.append("<").append(this.f33516c);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.f33518e != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.f33518e);
            sb.append("</text>");
        }
        for (C10731a c10731a : m3858c()) {
            sb.append(c10731a.mo3868d());
        }
        sb.append("</error>");
        return sb.toString();
    }

    /* renamed from: c */
    public synchronized List<C10731a> m3858c() {
        return this.f33519f == null ? Collections.emptyList() : Collections.unmodifiableList(this.f33519f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f33516c != null) {
            sb.append(this.f33516c);
        }
        sb.append("(").append(this.f33514a).append(")");
        if (this.f33518e != null) {
            sb.append(" ").append(this.f33518e);
        }
        return sb.toString();
    }
}
