package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.android.C10390b;
import com.xiaomi.channel.commonutils.android.C10394e;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
/* renamed from: com.xiaomi.mipush.sdk.a */
/* loaded from: classes.dex */
public class C10469a {

    /* renamed from: a */
    private static C10469a f32541a;

    /* renamed from: b */
    private Context f32542b;

    /* renamed from: c */
    private C10470a f32543c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.xiaomi.mipush.sdk.a$a */
    /* loaded from: classes2.dex */
    public class C10470a {

        /* renamed from: a */
        public String f32544a;

        /* renamed from: b */
        public String f32545b;

        /* renamed from: c */
        public String f32546c;

        /* renamed from: d */
        public String f32547d;

        /* renamed from: e */
        public String f32548e;

        /* renamed from: f */
        public String f32549f;

        /* renamed from: g */
        public String f32550g;

        /* renamed from: h */
        public boolean f32551h;

        /* renamed from: i */
        public boolean f32552i;

        /* renamed from: j */
        public int f32553j;

        private C10470a() {
            this.f32551h = true;
            this.f32552i = false;
            this.f32553j = 1;
        }

        /* renamed from: d */
        private String m5005d() {
            return C10390b.m5327a(C10469a.this.f32542b, C10469a.this.f32542b.getPackageName());
        }

        /* renamed from: a */
        public void m5012a(int i) {
            this.f32553j = i;
        }

        /* renamed from: a */
        public void m5011a(String str, String str2) {
            this.f32546c = str;
            this.f32547d = str2;
            this.f32549f = C10394e.m5308e(C10469a.this.f32542b);
            this.f32548e = m5005d();
            this.f32551h = true;
            SharedPreferences.Editor edit = C10469a.this.m5019j().edit();
            edit.putString("regId", str);
            edit.putString("regSec", str2);
            edit.putString("devId", this.f32549f);
            edit.putString("vName", m5005d());
            edit.putBoolean("valid", true);
            edit.commit();
        }

        /* renamed from: a */
        public void m5010a(String str, String str2, String str3) {
            this.f32544a = str;
            this.f32545b = str2;
            this.f32550g = str3;
            SharedPreferences.Editor edit = C10469a.this.m5019j().edit();
            edit.putString("appId", this.f32544a);
            edit.putString("appToken", str2);
            edit.putString("regResource", str3);
            edit.commit();
        }

        /* renamed from: a */
        public void m5009a(boolean z) {
            this.f32552i = z;
        }

        /* renamed from: a */
        public boolean m5013a() {
            return m5007b(this.f32544a, this.f32545b);
        }

        /* renamed from: b */
        public void m5008b() {
            C10469a.this.m5019j().edit().clear().commit();
            this.f32544a = null;
            this.f32545b = null;
            this.f32546c = null;
            this.f32547d = null;
            this.f32549f = null;
            this.f32548e = null;
            this.f32551h = false;
            this.f32552i = false;
            this.f32553j = 1;
        }

        /* renamed from: b */
        public boolean m5007b(String str, String str2) {
            return TextUtils.equals(this.f32544a, str) && TextUtils.equals(this.f32545b, str2) && !TextUtils.isEmpty(this.f32546c) && !TextUtils.isEmpty(this.f32547d) && TextUtils.equals(this.f32549f, C10394e.m5308e(C10469a.this.f32542b));
        }

        /* renamed from: c */
        public void m5006c() {
            this.f32551h = false;
            C10469a.this.m5019j().edit().putBoolean("valid", this.f32551h).commit();
        }
    }

    private C10469a(Context context) {
        this.f32542b = context;
        m5014o();
    }

    /* renamed from: a */
    public static C10469a m5034a(Context context) {
        if (f32541a == null) {
            f32541a = new C10469a(context);
        }
        return f32541a;
    }

    /* renamed from: o */
    private void m5014o() {
        this.f32543c = new C10470a();
        SharedPreferences m5019j = m5019j();
        this.f32543c.f32544a = m5019j.getString("appId", null);
        this.f32543c.f32545b = m5019j.getString("appToken", null);
        this.f32543c.f32546c = m5019j.getString("regId", null);
        this.f32543c.f32547d = m5019j.getString("regSec", null);
        this.f32543c.f32549f = m5019j.getString("devId", null);
        if (!TextUtils.isEmpty(this.f32543c.f32549f) && this.f32543c.f32549f.startsWith("a-")) {
            this.f32543c.f32549f = C10394e.m5308e(this.f32542b);
            m5019j.edit().putString("devId", this.f32543c.f32549f).commit();
        }
        this.f32543c.f32548e = m5019j.getString("vName", null);
        this.f32543c.f32551h = m5019j.getBoolean("valid", true);
        this.f32543c.f32552i = m5019j.getBoolean("paused", false);
        this.f32543c.f32553j = m5019j.getInt("envType", 1);
        this.f32543c.f32550g = m5019j.getString("regResource", null);
    }

    /* renamed from: a */
    public void m5035a(int i) {
        this.f32543c.m5012a(i);
        m5019j().edit().putInt("envType", i).commit();
    }

    /* renamed from: a */
    public void m5032a(String str) {
        SharedPreferences.Editor edit = m5019j().edit();
        edit.putString("vName", str);
        edit.commit();
        this.f32543c.f32548e = str;
    }

    /* renamed from: a */
    public void m5030a(String str, String str2, String str3) {
        this.f32543c.m5010a(str, str2, str3);
    }

    /* renamed from: a */
    public void m5029a(boolean z) {
        this.f32543c.m5009a(z);
        m5019j().edit().putBoolean("paused", z).commit();
    }

    /* renamed from: a */
    public boolean m5036a() {
        return !TextUtils.equals(C10390b.m5327a(this.f32542b, this.f32542b.getPackageName()), this.f32543c.f32548e);
    }

    /* renamed from: a */
    public boolean m5031a(String str, String str2) {
        return this.f32543c.m5007b(str, str2);
    }

    /* renamed from: b */
    public void m5027b(String str, String str2) {
        this.f32543c.m5011a(str, str2);
    }

    /* renamed from: b */
    public boolean m5028b() {
        if (!this.f32543c.m5013a()) {
            AbstractC10404b.m5269a("Don't send message before initialization succeeded!");
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public String m5026c() {
        return this.f32543c.f32544a;
    }

    /* renamed from: d */
    public String m5025d() {
        return this.f32543c.f32545b;
    }

    /* renamed from: e */
    public String m5024e() {
        return this.f32543c.f32546c;
    }

    /* renamed from: f */
    public String m5023f() {
        return this.f32543c.f32547d;
    }

    /* renamed from: g */
    public String m5022g() {
        return this.f32543c.f32550g;
    }

    /* renamed from: h */
    public void m5021h() {
        this.f32543c.m5008b();
    }

    /* renamed from: i */
    public boolean m5020i() {
        return this.f32543c.m5013a();
    }

    /* renamed from: j */
    public SharedPreferences m5019j() {
        return this.f32542b.getSharedPreferences("mipush", 0);
    }

    /* renamed from: k */
    public void m5018k() {
        this.f32543c.m5006c();
    }

    /* renamed from: l */
    public boolean m5017l() {
        return this.f32543c.f32552i;
    }

    /* renamed from: m */
    public int m5016m() {
        return this.f32543c.f32553j;
    }

    /* renamed from: n */
    public boolean m5015n() {
        return !this.f32543c.f32551h;
    }
}
