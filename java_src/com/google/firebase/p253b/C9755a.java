package com.google.firebase.p253b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4503n;
import com.google.android.gms.config.internal.C4713d;
import com.google.android.gms.games.C5384f;
import com.google.android.gms.internal.AbstractC7423mz;
import com.google.android.gms.internal.C7417mt;
import com.google.android.gms.internal.C7419mv;
import com.google.android.gms.internal.C7420mw;
import com.google.android.gms.internal.C7421mx;
import com.google.android.gms.internal.C7422my;
import com.google.android.gms.internal.C7639qv;
import com.google.android.gms.internal.RunnableC7418mu;
import com.google.android.gms.internal.ajr;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.android.gms.p239g.C5286g;
import com.google.firebase.C9751b;
import com.google.firebase.p253b.C9762f;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: com.google.firebase.b.a */
/* loaded from: classes2.dex */
public class C9755a {

    /* renamed from: a */
    public static final String f30447a = "";

    /* renamed from: b */
    public static final long f30448b = 0;

    /* renamed from: c */
    public static final double f30449c = 0.0d;

    /* renamed from: d */
    public static final boolean f30450d = false;

    /* renamed from: e */
    public static final byte[] f30451e = new byte[0];

    /* renamed from: f */
    public static final int f30452f = 0;

    /* renamed from: g */
    public static final int f30453g = 1;

    /* renamed from: h */
    public static final int f30454h = 2;

    /* renamed from: i */
    public static final int f30455i = -1;

    /* renamed from: j */
    public static final int f30456j = 0;

    /* renamed from: k */
    public static final int f30457k = 1;

    /* renamed from: l */
    public static final int f30458l = 2;

    /* renamed from: m */
    private static C9755a f30459m;

    /* renamed from: n */
    private C7419mv f30460n;

    /* renamed from: o */
    private C7419mv f30461o;

    /* renamed from: p */
    private C7419mv f30462p;

    /* renamed from: q */
    private C7422my f30463q;

    /* renamed from: r */
    private final Context f30464r;

    /* renamed from: s */
    private final ReadWriteLock f30465s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.b.a$a */
    /* loaded from: classes2.dex */
    public static class ExecutorC9757a implements Executor {
        ExecutorC9757a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    C9755a(Context context) {
        this(context, null, null, null, null);
    }

    private C9755a(Context context, C7419mv c7419mv, C7419mv c7419mv2, C7419mv c7419mv3, C7422my c7422my) {
        this.f30465s = new ReentrantReadWriteLock(true);
        this.f30464r = context;
        if (c7422my != null) {
            this.f30463q = c7422my;
        } else {
            this.f30463q = new C7422my();
        }
        this.f30463q.m14528a(m7179b(this.f30464r));
        if (c7419mv != null) {
            this.f30460n = c7419mv;
        }
        if (c7419mv2 != null) {
            this.f30461o = c7419mv2;
        }
        if (c7419mv3 != null) {
            this.f30462p = c7419mv3;
        }
    }

    /* renamed from: a */
    private static long m7187a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* renamed from: a */
    private static C7419mv m7191a(AbstractC7423mz.C7424a c7424a) {
        AbstractC7423mz.C7427d[] c7427dArr;
        if (c7424a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (AbstractC7423mz.C7427d c7427d : c7424a.f24866a) {
            String str = c7427d.f24874a;
            HashMap hashMap2 = new HashMap();
            AbstractC7423mz.C7425b[] c7425bArr = c7427d.f24875b;
            for (AbstractC7423mz.C7425b c7425b : c7425bArr) {
                hashMap2.put(c7425b.f24869a, c7425b.f24870b);
            }
            hashMap.put(str, hashMap2);
        }
        return new C7419mv(hashMap, c7424a.f24867b);
    }

    /* renamed from: a */
    private static C7422my m7190a(AbstractC7423mz.C7426c c7426c) {
        if (c7426c == null) {
            return null;
        }
        C7422my c7422my = new C7422my();
        c7422my.m14529a(c7426c.f24871a);
        c7422my.m14524a(c7426c.f24872b);
        return c7422my;
    }

    /* renamed from: a */
    public static C9755a m7198a() {
        if (f30459m == null) {
            C9751b m7205d = C9751b.m7205d();
            if (m7205d != null) {
                return m7194a(m7205d.m7224a());
            }
            throw new IllegalStateException("FirebaseApp has not been initialized.");
        }
        return f30459m;
    }

    /* renamed from: a */
    public static C9755a m7194a(Context context) {
        if (f30459m == null) {
            AbstractC7423mz.C7428e m7175c = m7175c(context);
            if (m7175c == null) {
                if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                    Log.d("FirebaseRemoteConfig", "No persisted config was found. Initializing from scratch.");
                }
                f30459m = new C9755a(context);
            } else {
                if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                    Log.d("FirebaseRemoteConfig", "Initializing from persisted config.");
                }
                C7419mv m7191a = m7191a(m7175c.f24876a);
                C7419mv m7191a2 = m7191a(m7175c.f24877b);
                C7419mv m7191a3 = m7191a(m7175c.f24878c);
                C7422my m7190a = m7190a(m7175c.f24879d);
                if (m7190a != null) {
                    m7190a.m14525a(m7181a(m7175c.f24880e));
                }
                f30459m = new C9755a(context, m7191a, m7191a2, m7191a3, m7190a);
            }
        }
        return f30459m;
    }

    /* renamed from: a */
    private static Map<String, C7417mt> m7181a(AbstractC7423mz.C7429f[] c7429fArr) {
        HashMap hashMap = new HashMap();
        if (c7429fArr != null) {
            for (AbstractC7423mz.C7429f c7429f : c7429fArr) {
                hashMap.put(c7429f.f24884c, new C7417mt(c7429f.f24882a, c7429f.f24883b));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m7182a(Map<String, Object> map, String str, boolean z) {
        if (str == null) {
            return;
        }
        boolean z2 = map == null || map.isEmpty();
        HashMap hashMap = new HashMap();
        if (!z2) {
            for (String str2 : map.keySet()) {
                Object obj = map.get(str2);
                if (obj instanceof String) {
                    hashMap.put(str2, ((String) obj).getBytes(C7421mx.f24857a));
                } else if (obj instanceof Long) {
                    hashMap.put(str2, ((Long) obj).toString().getBytes(C7421mx.f24857a));
                } else if (obj instanceof Integer) {
                    hashMap.put(str2, ((Integer) obj).toString().getBytes(C7421mx.f24857a));
                } else if (obj instanceof Double) {
                    hashMap.put(str2, ((Double) obj).toString().getBytes(C7421mx.f24857a));
                } else if (obj instanceof Float) {
                    hashMap.put(str2, ((Float) obj).toString().getBytes(C7421mx.f24857a));
                } else if (obj instanceof byte[]) {
                    hashMap.put(str2, (byte[]) obj);
                } else if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("The type of a default value needs to beone of String, Long, Double, Boolean, or byte[].");
                } else {
                    hashMap.put(str2, ((Boolean) obj).toString().getBytes(C7421mx.f24857a));
                }
            }
        }
        this.f30465s.writeLock().lock();
        try {
            if (!z2) {
                if (this.f30462p == null) {
                    this.f30462p = new C7419mv(new HashMap(), System.currentTimeMillis());
                }
                this.f30462p.m14539a(hashMap, str);
                this.f30462p.m14542a(System.currentTimeMillis());
            } else if (this.f30462p == null || !this.f30462p.m14541a(str)) {
                return;
            } else {
                this.f30462p.m14539a((Map<String, byte[]>) null, str);
                this.f30462p.m14542a(System.currentTimeMillis());
            }
            if (z) {
                this.f30463q.m14527a(str);
            }
            m7166f();
        } finally {
            this.f30465s.writeLock().unlock();
        }
    }

    /* renamed from: a */
    private static byte[] m7188a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m7187a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    private long m7179b(Context context) {
        try {
            return this.f30464r.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("FirebaseRemoteConfig", new StringBuilder(String.valueOf(valueOf).length() + 25).append("Package [").append(valueOf).append("] was not found!").toString());
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AbstractC7423mz.C7428e m7175c(Context context) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        AbstractC7423mz.C7428e c7428e;
        try {
            if (context == null) {
                return null;
            }
            try {
                fileInputStream2 = context.openFileInput("persisted_config");
                try {
                    C7639qv m14009a = C7639qv.m14009a(m7188a(fileInputStream2));
                    AbstractC7423mz.C7428e c7428e2 = new AbstractC7423mz.C7428e();
                    AbstractC7423mz.C7428e c7428e3 = (AbstractC7423mz.C7428e) c7428e2.mo13816b(m14009a);
                    FileInputStream fileInputStream4 = fileInputStream2;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                            fileInputStream4 = fileInputStream2;
                        } catch (IOException e) {
                            String str = "Failed to close persisted config file.";
                            Log.e("FirebaseRemoteConfig", str, e);
                            fileInputStream4 = str;
                        }
                    }
                    c7428e = c7428e2;
                    fileInputStream = fileInputStream4;
                } catch (FileNotFoundException e2) {
                    e = e2;
                    fileInputStream3 = fileInputStream2;
                    try {
                        if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                            Log.d("FirebaseRemoteConfig", "Persisted config file was not found.", e);
                        }
                        if (fileInputStream3 != null) {
                            try {
                                fileInputStream3.close();
                            } catch (IOException e3) {
                                Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e3);
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream3;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e4) {
                                Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e4);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.e("FirebaseRemoteConfig", "Cannot initialize from persisted config.", e);
                    FileInputStream fileInputStream5 = fileInputStream2;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                            fileInputStream5 = fileInputStream2;
                        } catch (IOException e6) {
                            String str2 = "Failed to close persisted config file.";
                            Log.e("FirebaseRemoteConfig", str2, e6);
                            fileInputStream5 = str2;
                        }
                    }
                    c7428e = null;
                    fileInputStream = fileInputStream5;
                    return c7428e;
                }
            } catch (FileNotFoundException e7) {
                e = e7;
                fileInputStream3 = null;
            } catch (IOException e8) {
                e = e8;
                fileInputStream2 = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
                if (fileInputStream != null) {
                }
                throw th;
            }
            return c7428e;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: f */
    private void m7166f() {
        this.f30465s.readLock().lock();
        try {
            RunnableC7418mu runnableC7418mu = new RunnableC7418mu(this.f30464r, this.f30460n, this.f30461o, this.f30462p, this.f30463q);
            if (Build.VERSION.SDK_INT >= 11) {
                AsyncTask.SERIAL_EXECUTOR.execute(runnableC7418mu);
            } else {
                new ExecutorC9757a().execute(runnableC7418mu);
            }
        } finally {
            this.f30465s.readLock().unlock();
        }
    }

    /* renamed from: a */
    public long m7186a(String str) {
        return m7185a(str, "configns:firebase");
    }

    /* renamed from: a */
    public long m7185a(String str, String str2) {
        long j = 0;
        if (str2 != null) {
            this.f30465s.readLock().lock();
            try {
                if (this.f30461o != null && this.f30461o.m14540a(str, str2)) {
                    try {
                        j = Long.valueOf(new String(this.f30461o.m14537b(str, str2), C7421mx.f24857a)).longValue();
                    } catch (NumberFormatException e) {
                    }
                }
                if (this.f30462p != null && this.f30462p.m14540a(str, str2)) {
                    try {
                        j = Long.valueOf(new String(this.f30462p.m14537b(str, str2), C7421mx.f24857a)).longValue();
                        this.f30465s.readLock().unlock();
                    } catch (NumberFormatException e2) {
                    }
                }
                this.f30465s.readLock().unlock();
            } finally {
                this.f30465s.readLock().unlock();
            }
        }
        return j;
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m7195a(long j) {
        final C5286g c5286g = new C5286g();
        this.f30465s.readLock().lock();
        try {
            ajr.C6416a.C6417a c6417a = new ajr.C6416a.C6417a();
            c6417a.m17098a(j);
            if (this.f30463q.m14523b()) {
                c6417a.m17096a("_rcn_developer", "true");
            }
            c6417a.m17099a(m7172d());
            new C4713d(this.f30464r).m23041a(c6417a.m17100a()).mo13673a(new AbstractC4503n<ajr.AbstractC6418b>() { // from class: com.google.firebase.b.a.1
                @Override // com.google.android.gms.common.api.AbstractC4503n
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7161a(@NonNull ajr.AbstractC6418b abstractC6418b) {
                    C9755a.this.m7193a(c5286g, abstractC6418b);
                }
            });
            this.f30465s.readLock().unlock();
            return c5286g.m20832a();
        } catch (Throwable th) {
            this.f30465s.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public void m7197a(int i) {
        m7196a(i, "configns:firebase");
    }

    /* renamed from: a */
    public void m7196a(int i, String str) {
        if (str == null) {
            if (!Log.isLoggable("FirebaseRemoteConfig", 3)) {
                return;
            }
            Log.d("FirebaseRemoteConfig", "namespace cannot be null for setDefaults.");
            return;
        }
        this.f30465s.readLock().lock();
        try {
            if (this.f30463q != null && this.f30463q.m14522c() != null && this.f30463q.m14522c().get(str) != null) {
                C7417mt c7417mt = this.f30463q.m14522c().get(str);
                if (i == c7417mt.m14546a() && this.f30463q.m14521d() == c7417mt.m14545b()) {
                    if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                        Log.d("FirebaseRemoteConfig", "Skipped setting defaults from resource file as this resource file was already applied.");
                    }
                    return;
                }
            }
            this.f30465s.readLock().unlock();
            HashMap hashMap = new HashMap();
            try {
                XmlResourceParser xml = this.f30464r.getResources().getXml(i);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        str3 = xml.getName();
                    } else if (eventType == 3) {
                        if ("entry".equals(xml.getName()) && str2 != null && str4 != null) {
                            hashMap.put(str2, str4);
                            str4 = null;
                            str2 = null;
                        }
                        str3 = null;
                    } else if (eventType == 4) {
                        if ("key".equals(str3)) {
                            str2 = xml.getText();
                        } else if ("value".equals(str3)) {
                            str4 = xml.getText();
                        }
                    }
                }
                this.f30463q.m14526a(str, new C7417mt(i, this.f30463q.m14521d()));
                m7182a(hashMap, str, false);
            } catch (Exception e) {
                Log.e("FirebaseRemoteConfig", "Caught exception while parsing XML resource. Skipping setDefaults.", e);
            }
        } finally {
            this.f30465s.readLock().unlock();
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    void m7193a(C5286g<Void> c5286g, ajr.AbstractC6418b abstractC6418b) {
        if (abstractC6418b == null || abstractC6418b.mo7645a() == null) {
            this.f30463q.m14529a(1);
            c5286g.m20831a(new C9759c());
            m7166f();
            return;
        }
        int m24015i = abstractC6418b.mo7645a().m24015i();
        this.f30465s.writeLock().lock();
        try {
            switch (m24015i) {
                case -6508:
                case -6506:
                    this.f30463q.m14529a(-1);
                    if (this.f30460n != null && !this.f30460n.m14538b()) {
                        Map<String, Set<String>> mo17090c = abstractC6418b.mo17090c();
                        HashMap hashMap = new HashMap();
                        for (String str : mo17090c.keySet()) {
                            HashMap hashMap2 = new HashMap();
                            for (String str2 : mo17090c.get(str)) {
                                hashMap2.put(str2, abstractC6418b.mo17092a(str2, null, str));
                            }
                            hashMap.put(str, hashMap2);
                        }
                        this.f30460n = new C7419mv(hashMap, this.f30460n.m14536c());
                    }
                    c5286g.m20830a((C5286g<Void>) null);
                    m7166f();
                    break;
                case -6505:
                    Map<String, Set<String>> mo17090c2 = abstractC6418b.mo17090c();
                    HashMap hashMap3 = new HashMap();
                    for (String str3 : mo17090c2.keySet()) {
                        HashMap hashMap4 = new HashMap();
                        for (String str4 : mo17090c2.get(str3)) {
                            hashMap4.put(str4, abstractC6418b.mo17092a(str4, null, str3));
                        }
                        hashMap3.put(str3, hashMap4);
                    }
                    this.f30460n = new C7419mv(hashMap3, System.currentTimeMillis());
                    this.f30463q.m14529a(-1);
                    c5286g.m20830a((C5286g<Void>) null);
                    m7166f();
                    break;
                case C5384f.f19475F /* 6500 */:
                case C5384f.f19476G /* 6501 */:
                case C5384f.f19478I /* 6503 */:
                case C5384f.f19479J /* 6504 */:
                    this.f30463q.m14529a(1);
                    c5286g.m20831a(new C9759c());
                    m7166f();
                    break;
                case C5384f.f19477H /* 6502 */:
                case C5384f.f19482M /* 6507 */:
                    this.f30463q.m14529a(2);
                    c5286g.m20831a(new C9760d(abstractC6418b.mo17091b()));
                    m7166f();
                    break;
                default:
                    if (abstractC6418b.mo7645a().m24018f()) {
                        Log.w("FirebaseRemoteConfig", new StringBuilder(45).append("Unknown (successful) status code: ").append(m24015i).toString());
                    }
                    this.f30463q.m14529a(1);
                    c5286g.m20831a(new C9759c());
                    m7166f();
                    break;
            }
        } finally {
            this.f30465s.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public void m7189a(C9762f c9762f) {
        this.f30465s.writeLock().lock();
        try {
            boolean m14523b = this.f30463q.m14523b();
            boolean m7151a = c9762f == null ? false : c9762f.m7151a();
            this.f30463q.m14524a(m7151a);
            if (m14523b != m7151a) {
                m7166f();
            }
        } finally {
            this.f30465s.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public void m7184a(Map<String, Object> map) {
        m7183a(map, "configns:firebase");
    }

    /* renamed from: a */
    public void m7183a(Map<String, Object> map, String str) {
        m7182a(map, str, true);
    }

    /* renamed from: b */
    public boolean m7180b() {
        this.f30465s.writeLock().lock();
        try {
            if (this.f30460n == null) {
                return false;
            }
            if (this.f30461o != null && this.f30461o.m14536c() >= this.f30460n.m14536c()) {
                return false;
            }
            long m14536c = this.f30460n.m14536c();
            this.f30461o = this.f30460n;
            this.f30461o.m14542a(System.currentTimeMillis());
            this.f30460n = new C7419mv(null, m14536c);
            m7166f();
            this.f30465s.writeLock().unlock();
            return true;
        } finally {
            this.f30465s.writeLock().unlock();
        }
    }

    /* renamed from: b */
    public byte[] m7178b(String str) {
        return m7177b(str, "configns:firebase");
    }

    /* renamed from: b */
    public byte[] m7177b(String str, String str2) {
        byte[] bArr;
        if (str2 == null) {
            return f30451e;
        }
        this.f30465s.readLock().lock();
        try {
            if (this.f30461o != null && this.f30461o.m14540a(str, str2)) {
                bArr = this.f30461o.m14537b(str, str2);
            } else if (this.f30462p == null || !this.f30462p.m14540a(str, str2)) {
                bArr = f30451e;
                this.f30465s.readLock().unlock();
            } else {
                bArr = this.f30462p.m14537b(str, str2);
                this.f30465s.readLock().unlock();
            }
            return bArr;
        } finally {
            this.f30465s.readLock().unlock();
        }
    }

    /* renamed from: c */
    public AbstractC9761e m7176c() {
        C7420mw c7420mw = new C7420mw();
        this.f30465s.readLock().lock();
        try {
            c7420mw.m14533a(this.f30460n == null ? -1L : this.f30460n.m14536c());
            c7420mw.m14534a(this.f30463q.m14530a());
            c7420mw.m14532a(new C9762f.C9764a().m7148a(this.f30463q.m14523b()).m7150a());
            return c7420mw;
        } finally {
            this.f30465s.readLock().unlock();
        }
    }

    /* renamed from: c */
    public String m7174c(String str) {
        return m7173c(str, "configns:firebase");
    }

    /* renamed from: c */
    public String m7173c(String str, String str2) {
        String str3;
        if (str2 == null) {
            return "";
        }
        this.f30465s.readLock().lock();
        try {
            if (this.f30461o != null && this.f30461o.m14540a(str, str2)) {
                str3 = new String(this.f30461o.m14537b(str, str2), C7421mx.f24857a);
            } else if (this.f30462p == null || !this.f30462p.m14540a(str, str2)) {
                str3 = "";
                this.f30465s.readLock().unlock();
            } else {
                str3 = new String(this.f30462p.m14537b(str, str2), C7421mx.f24857a);
                this.f30465s.readLock().unlock();
            }
            return str3;
        } finally {
            this.f30465s.readLock().unlock();
        }
    }

    /* renamed from: d */
    int m7172d() {
        return 10200;
    }

    /* renamed from: d */
    public boolean m7171d(String str) {
        return m7170d(str, "configns:firebase");
    }

    /* renamed from: d */
    public boolean m7170d(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        this.f30465s.readLock().lock();
        try {
            if (this.f30461o != null && this.f30461o.m14540a(str, str2)) {
                String str3 = new String(this.f30461o.m14537b(str, str2), C7421mx.f24857a);
                if (C7421mx.f24858b.matcher(str3).matches()) {
                    return true;
                }
                if (C7421mx.f24859c.matcher(str3).matches()) {
                    return false;
                }
            }
            if (this.f30462p != null && this.f30462p.m14540a(str, str2)) {
                String str4 = new String(this.f30462p.m14537b(str, str2), C7421mx.f24857a);
                if (C7421mx.f24858b.matcher(str4).matches()) {
                    return true;
                }
                if (C7421mx.f24859c.matcher(str4).matches()) {
                    return false;
                }
            }
            return false;
        } finally {
            this.f30465s.readLock().unlock();
        }
    }

    /* renamed from: e */
    public double m7168e(String str) {
        return m7167e(str, "configns:firebase");
    }

    /* renamed from: e */
    public double m7167e(String str, String str2) {
        double d = f30449c;
        if (str2 != null) {
            this.f30465s.readLock().lock();
            try {
                if (this.f30461o != null && this.f30461o.m14540a(str, str2)) {
                    try {
                        d = Double.valueOf(new String(this.f30461o.m14537b(str, str2), C7421mx.f24857a)).doubleValue();
                    } catch (NumberFormatException e) {
                    }
                }
                if (this.f30462p != null && this.f30462p.m14540a(str, str2)) {
                    try {
                        d = Double.valueOf(new String(this.f30462p.m14537b(str, str2), C7421mx.f24857a)).doubleValue();
                        this.f30465s.readLock().unlock();
                    } catch (NumberFormatException e2) {
                    }
                }
                this.f30465s.readLock().unlock();
            } finally {
                this.f30465s.readLock().unlock();
            }
        }
        return d;
    }

    /* renamed from: e */
    public AbstractC5285f<Void> m7169e() {
        return m7195a(43200L);
    }

    /* renamed from: f */
    public AbstractC9765g m7165f(String str) {
        return m7164f(str, "configns:firebase");
    }

    /* renamed from: f */
    public AbstractC9765g m7164f(String str, String str2) {
        C7421mx c7421mx;
        if (str2 == null) {
            return new C7421mx(f30451e, 0);
        }
        this.f30465s.readLock().lock();
        try {
            if (this.f30461o != null && this.f30461o.m14540a(str, str2)) {
                c7421mx = new C7421mx(this.f30461o.m14537b(str, str2), 2);
            } else if (this.f30462p == null || !this.f30462p.m14540a(str, str2)) {
                c7421mx = new C7421mx(f30451e, 0);
                this.f30465s.readLock().unlock();
            } else {
                c7421mx = new C7421mx(this.f30462p.m14537b(str, str2), 1);
                this.f30465s.readLock().unlock();
            }
            return c7421mx;
        } finally {
            this.f30465s.readLock().unlock();
        }
    }

    /* renamed from: g */
    public Set<String> m7163g(String str) {
        return m7162g(str, "configns:firebase");
    }

    /* renamed from: g */
    public Set<String> m7162g(String str, String str2) {
        this.f30465s.readLock().lock();
        try {
            return this.f30461o == null ? new TreeSet<>() : this.f30461o.m14535c(str, str2);
        } finally {
            this.f30465s.readLock().unlock();
        }
    }
}
