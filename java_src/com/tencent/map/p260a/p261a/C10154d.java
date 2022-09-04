package com.tencent.map.p260a.p261a;

import com.google.firebase.p253b.C9755a;
import com.tencent.map.p262b.C10183h;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tencent.map.a.a.d */
/* loaded from: classes2.dex */
public class C10154d {

    /* renamed from: A */
    private long f31328A;

    /* renamed from: a */
    public int f31329a;

    /* renamed from: b */
    public double f31330b;

    /* renamed from: c */
    public double f31331c;

    /* renamed from: d */
    public double f31332d;

    /* renamed from: e */
    public double f31333e;

    /* renamed from: f */
    public double f31334f;

    /* renamed from: g */
    public double f31335g;

    /* renamed from: h */
    public int f31336h;

    /* renamed from: i */
    public String f31337i;

    /* renamed from: j */
    public String f31338j;

    /* renamed from: k */
    public String f31339k;

    /* renamed from: l */
    public String f31340l;

    /* renamed from: m */
    public String f31341m;

    /* renamed from: n */
    public String f31342n;

    /* renamed from: o */
    public String f31343o;

    /* renamed from: p */
    public String f31344p;

    /* renamed from: q */
    public String f31345q;

    /* renamed from: r */
    public String f31346r;

    /* renamed from: s */
    public String f31347s;

    /* renamed from: t */
    public String f31348t;

    /* renamed from: u */
    public String f31349u;

    /* renamed from: v */
    public String f31350v;

    /* renamed from: w */
    public ArrayList<C10153c> f31351w;

    /* renamed from: x */
    public boolean f31352x;

    /* renamed from: y */
    public int f31353y;

    /* renamed from: z */
    public int f31354z;

    public C10154d() {
        this.f31329a = 1;
        this.f31330b = C9755a.f30449c;
        this.f31331c = C9755a.f30449c;
        this.f31332d = -1.0d;
        this.f31333e = C9755a.f30449c;
        this.f31334f = C9755a.f30449c;
        this.f31335g = C9755a.f30449c;
        this.f31336h = 0;
        this.f31337i = null;
        this.f31338j = null;
        this.f31339k = null;
        this.f31340l = null;
        this.f31341m = null;
        this.f31342n = null;
        this.f31343o = null;
        this.f31344p = null;
        this.f31345q = null;
        this.f31346r = null;
        this.f31347s = null;
        this.f31348t = null;
        this.f31349u = null;
        this.f31350v = null;
        this.f31351w = null;
        this.f31352x = false;
        this.f31353y = 0;
        this.f31354z = -1;
        this.f31328A = -1L;
        this.f31333e = C9755a.f30449c;
        this.f31332d = C9755a.f30449c;
        this.f31331c = C9755a.f30449c;
        this.f31330b = C9755a.f30449c;
        this.f31344p = null;
        this.f31343o = null;
        this.f31342n = null;
        this.f31341m = null;
        this.f31352x = false;
        this.f31328A = System.currentTimeMillis();
        this.f31353y = 0;
        this.f31354z = -1;
        this.f31351w = null;
    }

    public C10154d(C10154d c10154d) {
        this.f31329a = 1;
        this.f31330b = C9755a.f30449c;
        this.f31331c = C9755a.f30449c;
        this.f31332d = -1.0d;
        this.f31333e = C9755a.f30449c;
        this.f31334f = C9755a.f30449c;
        this.f31335g = C9755a.f30449c;
        this.f31336h = 0;
        this.f31337i = null;
        this.f31338j = null;
        this.f31339k = null;
        this.f31340l = null;
        this.f31341m = null;
        this.f31342n = null;
        this.f31343o = null;
        this.f31344p = null;
        this.f31345q = null;
        this.f31346r = null;
        this.f31347s = null;
        this.f31348t = null;
        this.f31349u = null;
        this.f31350v = null;
        this.f31351w = null;
        this.f31352x = false;
        this.f31353y = 0;
        this.f31354z = -1;
        this.f31328A = -1L;
        this.f31329a = c10154d.f31329a;
        this.f31330b = c10154d.f31330b;
        this.f31331c = c10154d.f31331c;
        this.f31332d = c10154d.f31332d;
        this.f31333e = c10154d.f31333e;
        this.f31352x = c10154d.f31352x;
        this.f31337i = c10154d.f31337i;
        this.f31336h = 0;
        this.f31338j = c10154d.f31338j;
        this.f31339k = c10154d.f31339k;
        this.f31340l = c10154d.f31340l;
        this.f31341m = c10154d.f31341m;
        this.f31342n = c10154d.f31342n;
        this.f31343o = c10154d.f31343o;
        this.f31344p = c10154d.f31344p;
        this.f31345q = c10154d.f31345q;
        this.f31346r = c10154d.f31346r;
        this.f31347s = c10154d.f31347s;
        this.f31348t = c10154d.f31348t;
        this.f31349u = c10154d.f31349u;
        this.f31350v = c10154d.f31350v;
        this.f31328A = c10154d.m6045a();
        this.f31353y = c10154d.f31353y;
        this.f31354z = c10154d.f31354z;
        this.f31351w = null;
        if (c10154d.f31351w != null) {
            this.f31351w = new ArrayList<>();
            Iterator<C10153c> it2 = c10154d.f31351w.iterator();
            while (it2.hasNext()) {
                this.f31351w.add(it2.next());
            }
        }
    }

    /* renamed from: a */
    public long m6045a() {
        return this.f31328A;
    }

    /* renamed from: a */
    public void m6044a(String str) {
        String[] split;
        this.f31340l = "Unknown";
        this.f31339k = "Unknown";
        this.f31338j = "Unknown";
        this.f31337i = "Unknown";
        if (str == null || (split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) == null) {
            return;
        }
        int length = split.length;
        if (length > 0) {
            this.f31337i = split[0];
        }
        if (length > 1) {
            this.f31338j = split[1];
        }
        if (length == 3) {
            this.f31339k = split[1];
        } else if (length > 3) {
            this.f31339k = split[2];
        }
        if (length == 3) {
            this.f31340l = split[2];
        } else if (length <= 3) {
        } else {
            this.f31340l = split[3];
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31354z).append(" ").append(this.f31353y).append(" ").append(this.f31352x ? "Mars" : "WGS84").append(" ").append(this.f31329a == 0 ? "GPS" : "Network").append("\n");
        sb.append(this.f31330b).append(" ").append(this.f31331c).append("\n");
        sb.append(this.f31332d).append(" ").append(this.f31333e).append("\n");
        sb.append(this.f31334f).append(" ").append(this.f31335g).append("\n");
        if (this.f31354z == 3 || this.f31354z == 4) {
            sb.append(this.f31337i).append(" ").append(this.f31338j).append(" ").append(this.f31339k).append(" ").append(this.f31340l).append(" ").append(this.f31341m).append(" ").append(this.f31342n).append(" ").append(this.f31343o).append(" ").append(this.f31344p).append("\n");
        }
        if (this.f31354z == 4 && this.f31351w != null) {
            sb.append(this.f31351w.size()).append("\n");
            Iterator<C10153c> it2 = this.f31351w.iterator();
            while (it2.hasNext()) {
                C10153c next = it2.next();
                sb.append(next.f31322a).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(next.f31323b).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(next.f31324c).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(next.f31325d).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(next.f31326e).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(next.f31327f).append("\n");
            }
        }
        if (this.f31354z == 7) {
            if (this.f31336h == 0) {
                sb.append(this.f31337i).append(" ").append(this.f31338j).append(" ").append(this.f31339k).append(" ").append(this.f31340l).append(" ").append(this.f31341m).append(" ").append(this.f31342n).append(" ").append(this.f31343o).append(" ").append(this.f31344p).append("\n");
            } else if (this.f31336h == 1) {
                sb.append(this.f31337i).append(" ").append(this.f31345q).append(" ").append(this.f31346r).append(" ").append(this.f31347s).append(" ").append(this.f31348t).append(" ").append(this.f31349u).append(" ").append(this.f31350v).append("\n");
            }
        }
        C10183h.m5928a(sb.toString());
        return sb.toString();
    }
}
