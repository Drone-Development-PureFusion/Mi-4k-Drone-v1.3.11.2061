package com.google.android.gms.analytics.internal;

import android.app.Activity;
import com.google.firebase.p253b.C9755a;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.analytics.internal.o */
/* loaded from: classes2.dex */
public class C3908o implements AbstractC3871af {

    /* renamed from: a */
    public String f15122a;

    /* renamed from: b */
    public double f15123b = -1.0d;

    /* renamed from: c */
    public int f15124c = -1;

    /* renamed from: d */
    public int f15125d = -1;

    /* renamed from: e */
    public int f15126e = -1;

    /* renamed from: f */
    public int f15127f = -1;

    /* renamed from: g */
    public Map<String, String> f15128g = new HashMap();

    /* renamed from: a */
    public String m26212a(Activity activity) {
        return m26211a(activity.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public String m26211a(String str) {
        String str2 = this.f15128g.get(str);
        return str2 != null ? str2 : str;
    }

    /* renamed from: a */
    public boolean m26213a() {
        return this.f15122a != null;
    }

    /* renamed from: b */
    public String m26210b() {
        return this.f15122a;
    }

    /* renamed from: c */
    public boolean m26209c() {
        return this.f15123b >= C9755a.f30449c;
    }

    /* renamed from: d */
    public double m26208d() {
        return this.f15123b;
    }

    /* renamed from: e */
    public boolean m26207e() {
        return this.f15124c >= 0;
    }

    /* renamed from: f */
    public int m26206f() {
        return this.f15124c;
    }

    /* renamed from: g */
    public boolean m26205g() {
        return this.f15125d != -1;
    }

    /* renamed from: h */
    public boolean m26204h() {
        return this.f15125d == 1;
    }

    /* renamed from: i */
    public boolean m26203i() {
        return this.f15126e != -1;
    }

    /* renamed from: j */
    public boolean m26202j() {
        return this.f15126e == 1;
    }

    /* renamed from: k */
    public boolean m26201k() {
        return this.f15127f == 1;
    }
}
