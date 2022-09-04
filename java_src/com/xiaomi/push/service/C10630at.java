package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.google.p222a.p223a.C3386b;
import com.google.p222a.p223a.C3387c;
import com.xiaomi.channel.commonutils.android.C10399j;
import com.xiaomi.channel.commonutils.file.C10400a;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10414h;
import com.xiaomi.push.protobuf.C10568a;
import com.xiaomi.push.protobuf.C10570b;
import com.xiaomi.smack.util.C10750e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.xiaomi.push.service.at */
/* loaded from: classes.dex */
public class C10630at {

    /* renamed from: a */
    private static String f33071a;

    /* renamed from: e */
    private static C10630at f33072e = new C10630at();

    /* renamed from: b */
    private List<AbstractC10631a> f33073b = new ArrayList();

    /* renamed from: c */
    private C10568a.C10569a f33074c;

    /* renamed from: d */
    private C10414h.AbstractC10416b f33075d;

    /* renamed from: com.xiaomi.push.service.at$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10631a {
        /* renamed from: a */
        public void mo4324a(C10568a.C10569a c10569a) {
        }

        /* renamed from: a */
        public void mo3784a(C10570b.C10572b c10572b) {
        }
    }

    private C10630at() {
    }

    /* renamed from: a */
    public static C10630at m4340a() {
        return f33072e;
    }

    /* renamed from: e */
    public static synchronized String m4329e() {
        String str;
        synchronized (C10630at.class) {
            if (f33071a == null) {
                SharedPreferences sharedPreferences = C10399j.m5295a().getSharedPreferences("XMPushServiceConfig", 0);
                f33071a = sharedPreferences.getString("DeviceUUID", null);
                if (f33071a == null) {
                    f33071a = C10399j.m5293b();
                    if (f33071a != null) {
                        sharedPreferences.edit().putString("DeviceUUID", f33071a).commit();
                    }
                }
            }
            str = f33071a;
        }
        return str;
    }

    /* renamed from: f */
    private void m4328f() {
        if (this.f33074c == null) {
            m4326h();
        }
    }

    /* renamed from: g */
    private void m4327g() {
        if (this.f33075d != null) {
            return;
        }
        this.f33075d = new C10632au(this);
        C10750e.m3833a(this.f33075d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m4326h() {
        BufferedInputStream bufferedInputStream;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(C10399j.m5295a().openFileInput("XMCloudCfg"));
                try {
                    this.f33074c = C10568a.C10569a.m4700c(C3386b.m28018a(bufferedInputStream));
                    bufferedInputStream.close();
                    C10400a.m5287a(bufferedInputStream);
                } catch (Exception e) {
                    e = e;
                    AbstractC10404b.m5269a("load config failure: " + e.getMessage());
                    C10400a.m5287a(bufferedInputStream);
                    if (this.f33074c != null) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                C10400a.m5287a(bufferedInputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            bufferedInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
            C10400a.m5287a(bufferedInputStream);
            throw th;
        }
        if (this.f33074c != null) {
            this.f33074c = new C10568a.C10569a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m4325i() {
        try {
            if (this.f33074c == null) {
                return;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(C10399j.m5295a().openFileOutput("XMCloudCfg", 0));
            C3387c m27983a = C3387c.m27983a(bufferedOutputStream);
            this.f33074c.mo4529a(m27983a);
            m27983a.m27995a();
            bufferedOutputStream.close();
        } catch (Exception e) {
            AbstractC10404b.m5269a("save config failure: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4339a(C10570b.C10572b c10572b) {
        AbstractC10631a[] abstractC10631aArr;
        if (c10572b.m4643i() && c10572b.m4644h() > m4332c()) {
            m4327g();
        }
        synchronized (this) {
            abstractC10631aArr = (AbstractC10631a[]) this.f33073b.toArray(new AbstractC10631a[this.f33073b.size()]);
        }
        for (AbstractC10631a abstractC10631a : abstractC10631aArr) {
            abstractC10631a.mo3784a(c10572b);
        }
    }

    /* renamed from: a */
    public synchronized void m4338a(AbstractC10631a abstractC10631a) {
        this.f33073b.add(abstractC10631a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m4334b() {
        this.f33073b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m4332c() {
        m4328f();
        if (this.f33074c != null) {
            return this.f33074c.m4699d();
        }
        return 0;
    }

    /* renamed from: d */
    public C10568a.C10569a m4330d() {
        m4328f();
        return this.f33074c;
    }
}
