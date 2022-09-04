package com.google.android.gms.measurement.internal;

import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a */
/* loaded from: classes2.dex */
public class C8641a {

    /* renamed from: a */
    private final C8668aj f27622a;

    /* renamed from: b */
    private final String f27623b;

    /* renamed from: c */
    private String f27624c;

    /* renamed from: d */
    private String f27625d;

    /* renamed from: e */
    private String f27626e;

    /* renamed from: f */
    private String f27627f;

    /* renamed from: g */
    private long f27628g;

    /* renamed from: h */
    private long f27629h;

    /* renamed from: i */
    private long f27630i;

    /* renamed from: j */
    private String f27631j;

    /* renamed from: k */
    private long f27632k;

    /* renamed from: l */
    private String f27633l;

    /* renamed from: m */
    private long f27634m;

    /* renamed from: n */
    private long f27635n;

    /* renamed from: o */
    private boolean f27636o;

    /* renamed from: p */
    private long f27637p;

    /* renamed from: q */
    private long f27638q;

    /* renamed from: r */
    private long f27639r;

    /* renamed from: s */
    private long f27640s;

    /* renamed from: t */
    private long f27641t;

    /* renamed from: u */
    private long f27642u;

    /* renamed from: v */
    private boolean f27643v;

    /* renamed from: w */
    private long f27644w;

    /* renamed from: x */
    private long f27645x;

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public C8641a(C8668aj c8668aj, String str) {
        C4588d.m23627a(c8668aj);
        C4588d.m23625a(str);
        this.f27622a = c8668aj;
        this.f27623b = str;
        this.f27622a.m10678z();
    }

    @WorkerThread
    /* renamed from: a */
    public void m10893a() {
        this.f27622a.m10678z();
        this.f27643v = false;
    }

    @WorkerThread
    /* renamed from: a */
    public void m10892a(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27629h != j) | this.f27643v;
        this.f27629h = j;
    }

    @WorkerThread
    /* renamed from: a */
    public void m10891a(String str) {
        this.f27622a.m10678z();
        this.f27643v = (!C8723m.m10508c(this.f27624c, str)) | this.f27643v;
        this.f27624c = str;
    }

    @WorkerThread
    /* renamed from: a */
    public void m10890a(boolean z) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27636o != z) | this.f27643v;
        this.f27636o = z;
    }

    @WorkerThread
    /* renamed from: b */
    public String m10889b() {
        this.f27622a.m10678z();
        return this.f27623b;
    }

    @WorkerThread
    /* renamed from: b */
    public void m10888b(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27630i != j) | this.f27643v;
        this.f27630i = j;
    }

    @WorkerThread
    /* renamed from: b */
    public void m10887b(String str) {
        this.f27622a.m10678z();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f27643v = (!C8723m.m10508c(this.f27625d, str)) | this.f27643v;
        this.f27625d = str;
    }

    @WorkerThread
    /* renamed from: c */
    public String m10886c() {
        this.f27622a.m10678z();
        return this.f27624c;
    }

    @WorkerThread
    /* renamed from: c */
    public void m10885c(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27632k != j) | this.f27643v;
        this.f27632k = j;
    }

    @WorkerThread
    /* renamed from: c */
    public void m10884c(String str) {
        this.f27622a.m10678z();
        this.f27643v = (!C8723m.m10508c(this.f27626e, str)) | this.f27643v;
        this.f27626e = str;
    }

    @WorkerThread
    /* renamed from: d */
    public String m10883d() {
        this.f27622a.m10678z();
        return this.f27625d;
    }

    @WorkerThread
    /* renamed from: d */
    public void m10882d(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27634m != j) | this.f27643v;
        this.f27634m = j;
    }

    @WorkerThread
    /* renamed from: d */
    public void m10881d(String str) {
        this.f27622a.m10678z();
        this.f27643v = (!C8723m.m10508c(this.f27627f, str)) | this.f27643v;
        this.f27627f = str;
    }

    @WorkerThread
    /* renamed from: e */
    public String m10880e() {
        this.f27622a.m10678z();
        return this.f27626e;
    }

    @WorkerThread
    /* renamed from: e */
    public void m10879e(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27635n != j) | this.f27643v;
        this.f27635n = j;
    }

    @WorkerThread
    /* renamed from: e */
    public void m10878e(String str) {
        this.f27622a.m10678z();
        this.f27643v = (!C8723m.m10508c(this.f27631j, str)) | this.f27643v;
        this.f27631j = str;
    }

    @WorkerThread
    /* renamed from: f */
    public String m10877f() {
        this.f27622a.m10678z();
        return this.f27627f;
    }

    @WorkerThread
    /* renamed from: f */
    public void m10876f(long j) {
        boolean z = true;
        C4588d.m23619b(j >= 0);
        this.f27622a.m10678z();
        boolean z2 = this.f27643v;
        if (this.f27628g == j) {
            z = false;
        }
        this.f27643v = z2 | z;
        this.f27628g = j;
    }

    @WorkerThread
    /* renamed from: f */
    public void m10875f(String str) {
        this.f27622a.m10678z();
        this.f27643v = (!C8723m.m10508c(this.f27633l, str)) | this.f27643v;
        this.f27633l = str;
    }

    @WorkerThread
    /* renamed from: g */
    public long m10874g() {
        this.f27622a.m10678z();
        return this.f27629h;
    }

    @WorkerThread
    /* renamed from: g */
    public void m10873g(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27644w != j) | this.f27643v;
        this.f27644w = j;
    }

    @WorkerThread
    /* renamed from: h */
    public long m10872h() {
        this.f27622a.m10678z();
        return this.f27630i;
    }

    @WorkerThread
    /* renamed from: h */
    public void m10871h(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27645x != j) | this.f27643v;
        this.f27645x = j;
    }

    @WorkerThread
    /* renamed from: i */
    public String m10870i() {
        this.f27622a.m10678z();
        return this.f27631j;
    }

    @WorkerThread
    /* renamed from: i */
    public void m10869i(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27637p != j) | this.f27643v;
        this.f27637p = j;
    }

    @WorkerThread
    /* renamed from: j */
    public long m10868j() {
        this.f27622a.m10678z();
        return this.f27632k;
    }

    @WorkerThread
    /* renamed from: j */
    public void m10867j(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27638q != j) | this.f27643v;
        this.f27638q = j;
    }

    @WorkerThread
    /* renamed from: k */
    public String m10866k() {
        this.f27622a.m10678z();
        return this.f27633l;
    }

    @WorkerThread
    /* renamed from: k */
    public void m10865k(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27639r != j) | this.f27643v;
        this.f27639r = j;
    }

    @WorkerThread
    /* renamed from: l */
    public long m10864l() {
        this.f27622a.m10678z();
        return this.f27634m;
    }

    @WorkerThread
    /* renamed from: l */
    public void m10863l(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27640s != j) | this.f27643v;
        this.f27640s = j;
    }

    @WorkerThread
    /* renamed from: m */
    public long m10862m() {
        this.f27622a.m10678z();
        return this.f27635n;
    }

    @WorkerThread
    /* renamed from: m */
    public void m10861m(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27642u != j) | this.f27643v;
        this.f27642u = j;
    }

    @WorkerThread
    /* renamed from: n */
    public void m10859n(long j) {
        this.f27622a.m10678z();
        this.f27643v = (this.f27641t != j) | this.f27643v;
        this.f27641t = j;
    }

    @WorkerThread
    /* renamed from: n */
    public boolean m10860n() {
        this.f27622a.m10678z();
        return this.f27636o;
    }

    @WorkerThread
    /* renamed from: o */
    public long m10858o() {
        this.f27622a.m10678z();
        return this.f27628g;
    }

    @WorkerThread
    /* renamed from: p */
    public long m10857p() {
        this.f27622a.m10678z();
        return this.f27644w;
    }

    @WorkerThread
    /* renamed from: q */
    public long m10856q() {
        this.f27622a.m10678z();
        return this.f27645x;
    }

    @WorkerThread
    /* renamed from: r */
    public void m10855r() {
        this.f27622a.m10678z();
        long j = this.f27628g + 1;
        if (j > 2147483647L) {
            this.f27622a.m10698f().m10832z().m10831a("Bundle index overflow");
            j = 0;
        }
        this.f27643v = true;
        this.f27628g = j;
    }

    @WorkerThread
    /* renamed from: s */
    public long m10854s() {
        this.f27622a.m10678z();
        return this.f27637p;
    }

    @WorkerThread
    /* renamed from: t */
    public long m10853t() {
        this.f27622a.m10678z();
        return this.f27638q;
    }

    @WorkerThread
    /* renamed from: u */
    public long m10852u() {
        this.f27622a.m10678z();
        return this.f27639r;
    }

    @WorkerThread
    /* renamed from: v */
    public long m10851v() {
        this.f27622a.m10678z();
        return this.f27640s;
    }

    @WorkerThread
    /* renamed from: w */
    public long m10850w() {
        this.f27622a.m10678z();
        return this.f27642u;
    }

    @WorkerThread
    /* renamed from: x */
    public long m10849x() {
        this.f27622a.m10678z();
        return this.f27641t;
    }
}
