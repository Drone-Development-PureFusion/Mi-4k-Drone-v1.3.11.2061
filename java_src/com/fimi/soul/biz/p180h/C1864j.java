package com.fimi.soul.biz.p180h;

import android.content.Context;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.NetUtil;
import com.google.firebase.p253b.C9755a;
import com.google.gson.Gson;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.p286a.p287a.p320o.C11359f;
/* renamed from: com.fimi.soul.biz.h.j */
/* loaded from: classes.dex */
public class C1864j implements Cloneable {

    /* renamed from: a */
    private int f5066a;

    /* renamed from: b */
    private double f5067b;

    /* renamed from: c */
    private double f5068c;

    /* renamed from: d */
    private double f5069d;

    /* renamed from: e */
    private double f5070e;

    /* renamed from: f */
    private String f5071f;

    /* renamed from: g */
    private String f5072g;

    /* renamed from: h */
    private String f5073h;

    /* renamed from: com.fimi.soul.biz.h.j$a */
    /* loaded from: classes.dex */
    private static class C1866a {

        /* renamed from: a */
        private static final C1864j f5077a = new C1864j();

        private C1866a() {
        }
    }

    private C1864j() {
    }

    /* renamed from: a */
    public static C1864j m33867a() {
        return C1866a.f5077a;
    }

    /* renamed from: a */
    public void m33866a(double d) {
        this.f5070e = d;
    }

    /* renamed from: a */
    public void m33865a(int i) {
        if (i > this.f5066a) {
            this.f5066a = i;
        }
    }

    /* renamed from: a */
    public void m33864a(final Context context) {
        try {
            if (!C3103au.m29221b(context)) {
                return;
            }
            User m34259c = C1756a.m34259c(context);
            m33863a(m34259c.getUserID());
            if (C11359f.m1297a(m34259c.getUserID())) {
                return;
            }
            final ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("commandCode", "getRealTimeFly"));
            arrayList.add(new BasicNameValuePair("jsonStr", new Gson().toJson(clone())));
            C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.h.j.1
                @Override // java.lang.Runnable
                public void run() {
                    NetUtil.m29411a(C1756a.f4551j, arrayList, context);
                }
            });
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void m33863a(String str) {
        this.f5071f = str;
    }

    /* renamed from: b */
    public double m33862b() {
        return this.f5070e;
    }

    /* renamed from: b */
    public void m33861b(double d) {
        this.f5069d = d;
    }

    /* renamed from: b */
    public void m33860b(String str) {
        this.f5072g = str;
    }

    /* renamed from: c */
    public double m33859c() {
        return this.f5069d;
    }

    /* renamed from: c */
    public void m33858c(double d) {
        if (d > this.f5068c) {
            this.f5068c = d;
        }
    }

    /* renamed from: c */
    public void m33857c(String str) {
        this.f5073h = str;
    }

    /* renamed from: d */
    public double m33856d() {
        return this.f5068c;
    }

    /* renamed from: d */
    public void m33855d(double d) {
        if (d > this.f5067b) {
            this.f5067b = d;
        }
    }

    /* renamed from: e */
    public int m33854e() {
        return this.f5066a;
    }

    /* renamed from: f */
    public double m33853f() {
        return this.f5067b;
    }

    /* renamed from: g */
    public String m33852g() {
        return this.f5071f;
    }

    /* renamed from: h */
    public String m33851h() {
        return this.f5072g;
    }

    /* renamed from: i */
    public String m33850i() {
        return this.f5073h;
    }

    /* renamed from: j */
    public void m33849j() {
        this.f5068c = C9755a.f30449c;
        this.f5067b = C9755a.f30449c;
        this.f5066a = 0;
    }
}
