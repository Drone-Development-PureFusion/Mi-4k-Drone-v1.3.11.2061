package com.xiaomi.push.service.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.android.C10390b;
import com.xiaomi.channel.commonutils.android.C10393d;
import com.xiaomi.channel.commonutils.file.C10400a;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10419k;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.channel.commonutils.string.C10433d;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.service.C10612ah;
import com.xiaomi.xmpush.thrift.EnumC10806e;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.xiaomi.push.service.module.d */
/* loaded from: classes2.dex */
public class C10680d {

    /* renamed from: a */
    private static C10680d f33186a = null;

    /* renamed from: b */
    private Map<String, C10679c> f33187b = new HashMap();

    /* renamed from: c */
    private List<AbstractC10682b> f33188c = new ArrayList();

    /* renamed from: d */
    private Context f33189d;

    /* renamed from: e */
    private SharedPreferences f33190e;

    /* renamed from: f */
    private boolean f33191f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.xiaomi.push.service.module.d$a */
    /* loaded from: classes2.dex */
    public static class RunnableC10681a implements Runnable {

        /* renamed from: a */
        private String f33192a;

        /* renamed from: b */
        private String f33193b;

        /* renamed from: c */
        private String f33194c;

        /* renamed from: d */
        private boolean f33195d;

        /* renamed from: e */
        private Context f33196e;

        /* renamed from: f */
        private boolean f33197f = false;

        public RunnableC10681a(Context context, String str, String str2, String str3, boolean z) {
            this.f33192a = null;
            this.f33193b = null;
            this.f33192a = str;
            this.f33193b = str2;
            this.f33194c = str3;
            this.f33195d = z;
            this.f33196e = context.getApplicationContext();
        }

        @Override // java.lang.Runnable
        public void run() {
            File file;
            FileOutputStream fileOutputStream;
            FileOutputStream fileOutputStream2 = null;
            if (!C10423d.m5211f(this.f33196e)) {
                return;
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f33192a).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    return;
                }
                byte[] m5281b = C10400a.m5281b(httpURLConnection.getInputStream());
                if (!TextUtils.isEmpty(this.f33193b)) {
                    if (!this.f33193b.equalsIgnoreCase(C10433d.m5173a(m5281b))) {
                        m5281b = null;
                    }
                }
                if (m5281b == null) {
                    return;
                }
                try {
                    AbstractC10404b.m5266b("download apk success.");
                    try {
                        file = new File(this.f33194c + ".tmp");
                        file.delete();
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    fileOutputStream.write(m5281b);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    if (C10393d.m5316a(C10390b.m5320e(this.f33196e, file.getPath()))) {
                        AbstractC10404b.m5266b("verify signature success");
                        file.renameTo(new File(this.f33194c));
                        this.f33197f = true;
                        if (this.f33195d && !C10390b.m5326b(this.f33196e)) {
                            Process.killProcess(Process.myPid());
                        }
                    } else {
                        AbstractC10404b.m5264d("verify signature failed");
                        file.delete();
                    }
                    C10400a.m5286a((OutputStream) null);
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    C10400a.m5286a(fileOutputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    C10400a.m5286a(fileOutputStream2);
                    throw th;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.module.d$b */
    /* loaded from: classes2.dex */
    public interface AbstractC10682b {
        /* renamed from: a */
        void m4144a(C10684f c10684f);
    }

    private C10680d(Context context) {
        this.f33189d = context.getApplicationContext();
        this.f33190e = this.f33189d.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
    }

    /* renamed from: a */
    private C10679c m4151a(C10677a c10677a, DexClassLoader dexClassLoader) {
        if (dexClassLoader != null) {
            return new C10679c(c10677a.m4183e(), c10677a.m4182f(), dexClassLoader, c10677a.m4192b(), c10677a.m4197a());
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C10680d m4152a(Context context) {
        C10680d c10680d;
        synchronized (C10680d.class) {
            if (f33186a == null) {
                f33186a = new C10680d(context);
            }
            c10680d = f33186a;
        }
        return c10680d;
    }

    /* renamed from: a */
    private void m4149a(EnumC10683e enumC10683e, int i) {
        this.f33190e.edit().putInt("plugin_version_" + enumC10683e.f33200b, i).commit();
    }

    /* renamed from: a */
    private synchronized void m4148a(C10684f c10684f) {
        for (AbstractC10682b abstractC10682b : this.f33188c) {
            abstractC10682b.m4144a(c10684f);
        }
    }

    /* renamed from: b */
    private int m4146b(EnumC10683e enumC10683e) {
        return this.f33190e.getInt("plugin_version_" + enumC10683e.f33200b, 0);
    }

    /* renamed from: b */
    private List<C10684f> m4147b() {
        ArrayList arrayList = new ArrayList();
        C10612ah m4394a = C10612ah.m4394a(this.f33189d);
        C10684f c10684f = new C10684f();
        c10684f.f33201a = EnumC10683e.MODULE_CDATA;
        c10684f.f33202b = m4394a.m4397a(EnumC10806e.CollectionDataPluginVersion.m3437a(), 0);
        c10684f.f33203c = m4394a.m4396a(EnumC10806e.CollectionPluginDownloadUrl.m3437a(), "");
        c10684f.f33204d = m4394a.m4396a(EnumC10806e.CollectionPluginMd5.m3437a(), "");
        c10684f.f33205e = m4394a.m4395a(EnumC10806e.CollectionPluginForceStop.m3437a(), false);
        arrayList.add(c10684f);
        return arrayList;
    }

    /* renamed from: a */
    public C10679c m4150a(EnumC10683e enumC10683e) {
        C10419k.m5233a();
        if (enumC10683e == null) {
            return null;
        }
        m4153a();
        AbstractC10404b.m5266b("loadModule " + enumC10683e.f33200b);
        String str = enumC10683e.f33200b;
        if (this.f33187b.containsKey(str)) {
            return this.f33187b.get(str);
        }
        C10677a c10677a = new C10677a(this.f33189d, str);
        DexClassLoader m4187c = c10677a.m4187c();
        if (m4187c == null) {
            return null;
        }
        C10679c m4151a = m4151a(c10677a, m4187c);
        m4151a.m4154a(this.f33189d);
        this.f33187b.put(str, m4151a);
        AbstractC10404b.m5266b("module load success.");
        return m4151a;
    }

    /* renamed from: a */
    public synchronized void m4153a() {
        if (!this.f33191f) {
            this.f33191f = true;
            for (C10684f c10684f : m4147b()) {
                if (m4146b(c10684f.f33201a) < c10684f.f33202b && !TextUtils.isEmpty(c10684f.f33203c)) {
                    RunnableC10681a runnableC10681a = new RunnableC10681a(this.f33189d, c10684f.f33203c, c10684f.f33204d, C10677a.m4194a(this.f33189d, c10684f.f33201a.f33200b), c10684f.f33205e);
                    runnableC10681a.run();
                    if (runnableC10681a.f33197f) {
                        m4149a(c10684f.f33201a, c10684f.f33202b);
                        m4148a(c10684f);
                    }
                }
            }
            this.f33191f = false;
        }
    }
}
