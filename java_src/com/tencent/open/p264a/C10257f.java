package com.tencent.open.p264a;

import android.os.Environment;
import android.text.TextUtils;
import com.tencent.open.p264a.C10250d;
import com.tencent.open.utils.Global;
import java.io.File;
/* renamed from: com.tencent.open.a.f */
/* loaded from: classes.dex */
public class C10257f {

    /* renamed from: b */
    protected C10244a f31918b = new C10244a(f31916c);

    /* renamed from: a */
    public static C10257f f31915a = null;

    /* renamed from: d */
    public static final String f31917d = C10249c.f31891a;

    /* renamed from: c */
    protected static final C10245b f31916c = new C10245b(m5671c(), C10249c.f31909s, C10249c.f31903m, C10249c.f31904n, C10249c.f31898h, C10249c.f31905o, 10, C10249c.f31901k, C10249c.f31910t);

    private C10257f() {
    }

    /* renamed from: a */
    public static C10257f m5678a() {
        if (f31915a == null) {
            synchronized (C10257f.class) {
                if (f31915a == null) {
                    f31915a = new C10257f();
                }
            }
        }
        return f31915a;
    }

    /* renamed from: a */
    public static final void m5676a(String str, String str2) {
        m5678a().m5677a(1, str, str2, null);
    }

    /* renamed from: a */
    public static final void m5675a(String str, String str2, Throwable th) {
        m5678a().m5677a(2, str, str2, th);
    }

    /* renamed from: b */
    public static void m5674b() {
        synchronized (C10257f.class) {
            m5678a().m5669d();
            if (f31915a != null) {
                f31915a = null;
            }
        }
    }

    /* renamed from: b */
    public static final void m5673b(String str, String str2) {
        m5678a().m5677a(2, str, str2, null);
    }

    /* renamed from: b */
    public static final void m5672b(String str, String str2, Throwable th) {
        m5678a().m5677a(16, str, str2, th);
    }

    /* renamed from: c */
    protected static File m5671c() {
        String packageName = Global.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            packageName = "default";
        }
        String str = C10249c.f31899i + File.separator + packageName;
        C10250d.C10254d m5687b = C10250d.C10253c.m5687b();
        return m5687b != null && (m5687b.m5680c() > C10249c.f31902l ? 1 : (m5687b.m5680c() == C10249c.f31902l ? 0 : -1)) > 0 ? new File(Environment.getExternalStorageDirectory(), str) : new File(Global.getFilesDir(), str);
    }

    /* renamed from: c */
    public static final void m5670c(String str, String str2) {
        m5678a().m5677a(4, str, str2, null);
    }

    /* renamed from: d */
    public static final void m5668d(String str, String str2) {
        m5678a().m5677a(8, str, str2, null);
    }

    /* renamed from: e */
    public static final void m5667e(String str, String str2) {
        m5678a().m5677a(16, str, str2, null);
    }

    /* renamed from: a */
    protected void m5677a(int i, String str, String str2, Throwable th) {
        C10256e.f31914a.b(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
        if (!C10250d.C10251a.m5690a(C10249c.f31893c, i) || this.f31918b == null) {
            return;
        }
        this.f31918b.b(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
    }

    /* renamed from: d */
    protected void m5669d() {
        if (this.f31918b != null) {
            this.f31918b.a();
            this.f31918b.m5724b();
            this.f31918b = null;
        }
    }
}
