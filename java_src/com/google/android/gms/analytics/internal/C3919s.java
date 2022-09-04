package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.C3836c;
import com.google.android.gms.analytics.C3940p;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
/* renamed from: com.google.android.gms.analytics.internal.s */
/* loaded from: classes2.dex */
public class C3919s {

    /* renamed from: a */
    private final C3922v f15151a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3919s(C3922v c3922v) {
        C4588d.m23627a(c3922v);
        this.f15151a = c3922v;
    }

    /* renamed from: a */
    private static String m26152a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj == Boolean.TRUE ? "true" : "false";
        }
        return obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
    }

    /* renamed from: a */
    private void m26153a(int i, String str, Object obj, Object obj2, Object obj3) {
        C3893g c3893g = null;
        if (this.f15151a != null) {
            c3893g = this.f15151a.m26107g();
        }
        if (c3893g != null) {
            c3893g.m26291a(i, str, obj, obj2, obj3);
            return;
        }
        String m26339a = C3882ao.f15038c.m26339a();
        if (!Log.isLoggable(m26339a, i)) {
            return;
        }
        Log.println(i, m26339a, m26143c(str, obj, obj2, obj3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public static String m26143c(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String m26152a = m26152a(obj);
        String m26152a2 = m26152a(obj2);
        String m26152a3 = m26152a(obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(m26152a)) {
            sb.append(str2);
            sb.append(m26152a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(m26152a2)) {
            sb.append(str2);
            sb.append(m26152a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(m26152a3)) {
            sb.append(str2);
            sb.append(m26152a3);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public C3878ak m26155A() {
        return this.f15151a.m26096r();
    }

    /* renamed from: B */
    public boolean m26154B() {
        return Log.isLoggable(C3882ao.f15038c.m26339a(), 2);
    }

    /* renamed from: a */
    public void m26151a(String str, Object obj) {
        m26153a(2, str, obj, null, null);
    }

    /* renamed from: a */
    public void m26150a(String str, Object obj, Object obj2) {
        m26153a(2, str, obj, obj2, null);
    }

    /* renamed from: a */
    public void m26149a(String str, Object obj, Object obj2, Object obj3) {
        m26153a(3, str, obj, obj2, obj3);
    }

    /* renamed from: b */
    public void m26148b(String str, Object obj) {
        m26153a(3, str, obj, null, null);
    }

    /* renamed from: b */
    public void m26147b(String str, Object obj, Object obj2) {
        m26153a(3, str, obj, obj2, null);
    }

    /* renamed from: b */
    public void m26146b(String str, Object obj, Object obj2, Object obj3) {
        m26153a(5, str, obj, obj2, obj3);
    }

    /* renamed from: c */
    public void m26145c(String str, Object obj) {
        m26153a(4, str, obj, null, null);
    }

    /* renamed from: c */
    public void m26144c(String str, Object obj, Object obj2) {
        m26153a(5, str, obj, obj2, null);
    }

    /* renamed from: d */
    public void m26142d(String str, Object obj) {
        m26153a(5, str, obj, null, null);
    }

    /* renamed from: d */
    public void m26141d(String str, Object obj, Object obj2) {
        m26153a(6, str, obj, obj2, null);
    }

    /* renamed from: e */
    public void m26140e(String str, Object obj) {
        m26153a(6, str, obj, null, null);
    }

    /* renamed from: k */
    public C3922v m26139k() {
        return this.f15151a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void m26138l() {
        if (m26133q().m26383a()) {
            throw new IllegalStateException("Call only supported on the client side");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void m26137m() {
        this.f15151a.m26095s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public AbstractC4682e m26136n() {
        return this.f15151a.m26110d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public Context m26135o() {
        return this.f15151a.m26112b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public C3893g m26134p() {
        return this.f15151a.m26108f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public C3874ah m26133q() {
        return this.f15151a.m26109e();
    }

    /* renamed from: q */
    public void m26132q(String str) {
        m26153a(2, str, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public C3940p m26131r() {
        return this.f15151a.m26106h();
    }

    /* renamed from: r */
    public void m26130r(String str) {
        m26153a(3, str, null, null, null);
    }

    /* renamed from: s */
    public C3836c m26129s() {
        return this.f15151a.m26103k();
    }

    /* renamed from: s */
    public void m26128s(String str) {
        m26153a(4, str, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public C3911r m26127t() {
        return this.f15151a.m26105i();
    }

    /* renamed from: t */
    public void m26126t(String str) {
        m26153a(5, str, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public C3879al m26125u() {
        return this.f15151a.m26104j();
    }

    /* renamed from: u */
    public void m26124u(String str) {
        m26153a(6, str, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public C3910q m26123v() {
        return this.f15151a.m26102l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public C3897j m26122w() {
        return this.f15151a.m26101m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public C3867ad m26121x() {
        return this.f15151a.m26098p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public C3858a m26120y() {
        return this.f15151a.m26099o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public C3859aa m26119z() {
        return this.f15151a.m26097q();
    }
}
