package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.p225a.C3433a;
import com.google.android.gms.clearcut.C4456b;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.C4517d;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.gass.internal.C6048a;
import com.google.android.gms.internal.AbstractC6830df;
import com.google.android.gms.internal.C7669rq;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: com.google.android.gms.internal.rw */
/* loaded from: classes2.dex */
public class C7677rw {

    /* renamed from: a */
    protected Context f25482a;

    /* renamed from: b */
    protected Context f25483b;

    /* renamed from: h */
    private ExecutorService f25487h;

    /* renamed from: i */
    private DexClassLoader f25488i;

    /* renamed from: j */
    private C7669rq f25489j;

    /* renamed from: k */
    private byte[] f25490k;

    /* renamed from: q */
    private C7457np f25496q;

    /* renamed from: g */
    private static final String f25480g = C7677rw.class.getSimpleName();

    /* renamed from: d */
    protected static final Object f25479d = new Object();

    /* renamed from: s */
    private static C4648j f25481s = null;

    /* renamed from: l */
    private volatile C3433a f25491l = null;

    /* renamed from: m */
    private volatile boolean f25492m = false;

    /* renamed from: n */
    private Future f25493n = null;

    /* renamed from: o */
    private volatile AbstractC6830df.C6831a f25494o = null;

    /* renamed from: p */
    private Future f25495p = null;

    /* renamed from: r */
    private AbstractC4489g f25497r = null;

    /* renamed from: c */
    protected boolean f25484c = false;

    /* renamed from: e */
    protected boolean f25485e = false;

    /* renamed from: f */
    protected boolean f25486f = false;

    /* renamed from: t */
    private Map<Pair<String, String>, C7699sp> f25498t = new HashMap();

    private C7677rw(Context context) {
        this.f25482a = context;
        this.f25483b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C7677rw m13731a(Context context, String str, String str2, boolean z) {
        C7677rw c7677rw = new C7677rw(context);
        if (c7677rw.m13723a(str, str2, z)) {
            return c7677rw;
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    private File m13726a(String str, File file, String str2) {
        File file2 = new File(String.format("%s/%s.jar", file, str2));
        if (!file2.exists()) {
            byte[] m13776a = this.f25489j.m13776a(this.f25490k, str);
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(m13776a, 0, m13776a.length);
            fileOutputStream.close();
        }
        return file2;
    }

    /* renamed from: a */
    private void m13729a(File file) {
        if (!file.exists()) {
            Log.d(f25480g, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        } else {
            file.delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m13728a(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        fileOutputStream2 = null;
        r1 = null;
        r1 = null;
        FileInputStream fileInputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        try {
            fileInputStream = new FileInputStream(file3);
            try {
                if (fileInputStream.read(bArr) <= 0) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                        }
                    }
                    m13729a(file3);
                    return;
                }
                AbstractC6830df.C6836d c6836d = new AbstractC6830df.C6836d();
                c6836d.f23014d = Build.VERSION.SDK.getBytes();
                c6836d.f23013c = str.getBytes();
                byte[] bytes = this.f25489j.m13775a(this.f25490k, bArr).getBytes();
                c6836d.f23011a = bytes;
                c6836d.f23012b = C7352ln.m14718a(bytes);
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] m13857a = AbstractC7649rd.m13857a(c6836d);
                    fileOutputStream.write(m13857a, 0, m13857a.length);
                    fileOutputStream.close();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    m13729a(file3);
                } catch (C7669rq.C7670a e4) {
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                    m13729a(file3);
                } catch (IOException e7) {
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    m13729a(file3);
                } catch (NoSuchAlgorithmException e8) {
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    m13729a(file3);
                } catch (Throwable th) {
                    fileOutputStream2 = fileOutputStream;
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e9) {
                        }
                    }
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e10) {
                        }
                    }
                    m13729a(file3);
                    throw th;
                }
            } catch (C7669rq.C7670a e11) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
            } catch (IOException e12) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
            } catch (NoSuchAlgorithmException e13) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (C7669rq.C7670a e14) {
            fileOutputStream = null;
        } catch (IOException e15) {
            fileOutputStream = null;
        } catch (NoSuchAlgorithmException e16) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    /* renamed from: a */
    private void m13722a(boolean z) {
        this.f25492m = z;
        if (!z) {
            return;
        }
        this.f25493n = this.f25487h.submit(new Runnable() { // from class: com.google.android.gms.internal.rw.1
            @Override // java.lang.Runnable
            public void run() {
                C7677rw.this.m13702r();
            }
        });
    }

    /* renamed from: a */
    private boolean m13727a(String str) {
        try {
            File cacheDir = this.f25482a.getCacheDir();
            if (cacheDir == null && (cacheDir = this.f25482a.getDir("dex", 0)) == null) {
                throw new C7672rs();
            }
            File file = cacheDir;
            String m13762b = C7671rr.m13762b();
            File m13726a = m13726a(str, file, m13762b);
            m13719b(file, m13762b);
            try {
                this.f25488i = new DexClassLoader(m13726a.getAbsolutePath(), file.getAbsolutePath(), null, this.f25482a.getClassLoader());
                m13729a(m13726a);
                m13728a(file, m13762b);
                m13718b(String.format("%s/%s.dex", file, m13762b));
                return true;
            } catch (Throwable th) {
                m13729a(m13726a);
                m13728a(file, m13762b);
                m13718b(String.format("%s/%s.dex", file, m13762b));
                throw th;
            }
        } catch (C7669rq.C7670a e) {
            throw new C7672rs(e);
        } catch (FileNotFoundException e2) {
            throw new C7672rs(e2);
        } catch (IOException e3) {
            throw new C7672rs(e3);
        } catch (NullPointerException e4) {
            throw new C7672rs(e4);
        }
    }

    /* renamed from: a */
    private boolean m13723a(String str, String str2, boolean z) {
        this.f25487h = Executors.newCachedThreadPool();
        m13722a(z);
        m13700t();
        m13707m();
        this.f25489j = new C7669rq(null);
        try {
            this.f25490k = this.f25489j.m13778a(str);
            boolean m13727a = m13727a(str2);
            this.f25496q = new C7457np(this);
            return m13727a;
        } catch (C7669rq.C7670a e) {
            throw new C7672rs(e);
        }
    }

    /* renamed from: b */
    private void m13718b(String str) {
        m13729a(new File(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m13719b(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream2;
        FileOutputStream e = null;
        e = 0;
        e = 0;
        e = 0;
        e = 0;
        e = null;
        e = null;
        e = null;
        e = 0;
        e = null;
        e = null;
        boolean z = true;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (file3.exists()) {
            return false;
        }
        try {
            long length = file2.length();
            if (length <= 0) {
                m13729a(file2);
                z = false;
            } else {
                byte[] bArr = new byte[(int) length];
                fileInputStream = new FileInputStream(file2);
                try {
                    if (fileInputStream.read(bArr) <= 0) {
                        Log.d(f25480g, "Cannot read the cache data.");
                        m13729a(file2);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e2) {
                            }
                        }
                        z = false;
                    } else {
                        AbstractC6830df.C6836d m16160a = AbstractC6830df.C6836d.m16160a(bArr);
                        if (!str.equals(new String(m16160a.f23013c)) || !Arrays.equals(m16160a.f23012b, C7352ln.m14718a(m16160a.f23011a)) || !Arrays.equals(m16160a.f23014d, Build.VERSION.SDK.getBytes())) {
                            m13729a(file2);
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e3) {
                                }
                            }
                            z = false;
                        } else {
                            byte[] m13776a = this.f25489j.m13776a(this.f25490k, new String(m16160a.f23011a));
                            file3.createNewFile();
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                            e = 0;
                            e = 0;
                            try {
                                fileOutputStream2.write(m13776a, 0, m13776a.length);
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e4) {
                                        e = e4;
                                    }
                                }
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e5) {
                                        e = e5;
                                    }
                                }
                            } catch (C7669rq.C7670a e6) {
                                fileOutputStream = fileOutputStream2;
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e7) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e8) {
                                    }
                                }
                                return false;
                            } catch (IOException e9) {
                                fileOutputStream = fileOutputStream2;
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                }
                                if (fileOutputStream != null) {
                                }
                                return false;
                            } catch (NoSuchAlgorithmException e10) {
                                fileOutputStream = fileOutputStream2;
                                fileInputStream2 = fileInputStream;
                                if (fileInputStream2 != null) {
                                }
                                if (fileOutputStream != null) {
                                }
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                e = fileOutputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e11) {
                                    }
                                }
                                if (e != 0) {
                                    try {
                                        e.close();
                                    } catch (IOException e12) {
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                } catch (C7669rq.C7670a e13) {
                    fileOutputStream = e;
                    fileInputStream2 = fileInputStream;
                } catch (IOException e14) {
                    fileOutputStream = e;
                    fileInputStream2 = fileInputStream;
                } catch (NoSuchAlgorithmException e15) {
                    fileOutputStream = e;
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return z;
        } catch (C7669rq.C7670a e16) {
            fileOutputStream = e;
            fileInputStream2 = e;
        } catch (IOException e17) {
            fileOutputStream = e;
            fileInputStream2 = e;
        } catch (NoSuchAlgorithmException e18) {
            fileOutputStream = e;
            fileInputStream2 = e;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m13702r() {
        try {
            if (this.f25491l != null || this.f25483b == null) {
                return;
            }
            C3433a c3433a = new C3433a(this.f25483b);
            c3433a.m27874a();
            this.f25491l = c3433a;
        } catch (C4516c | C4517d | IOException e) {
            this.f25491l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m13701s() {
        if (this.f25485e) {
            try {
                this.f25494o = C6048a.m18958a(this.f25482a, this.f25482a.getPackageName(), Integer.toString(this.f25482a.getPackageManager().getPackageInfo(this.f25482a.getPackageName(), 0).versionCode));
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
    }

    /* renamed from: t */
    private void m13700t() {
        boolean z = true;
        f25481s = C4648j.m23370b();
        this.f25484c = f25481s.mo23364c(this.f25482a) > 0;
        if (f25481s.mo23375a(this.f25482a) != 0) {
            z = false;
        }
        this.f25485e = z;
        if (this.f25482a.getApplicationContext() != null) {
            this.f25497r = new AbstractC4489g.C4490a(this.f25482a).m23968a(C4456b.f16713c).m23957c();
        }
        C7788uf.m13470a(this.f25482a);
    }

    /* renamed from: a */
    public Context m13732a() {
        return this.f25482a;
    }

    /* renamed from: a */
    public Method m13725a(String str, String str2) {
        C7699sp c7699sp = this.f25498t.get(new Pair(str, str2));
        if (c7699sp == null) {
            return null;
        }
        return c7699sp.m13691a();
    }

    /* renamed from: a */
    public boolean m13724a(String str, String str2, List<Class> list) {
        if (!this.f25498t.containsKey(new Pair(str, str2))) {
            this.f25498t.put(new Pair<>(str, str2), new C7699sp(this, str, str2, list));
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Context m13721b() {
        return this.f25483b;
    }

    /* renamed from: c */
    public ExecutorService m13717c() {
        return this.f25487h;
    }

    /* renamed from: d */
    public DexClassLoader m13716d() {
        return this.f25488i;
    }

    /* renamed from: e */
    public C7669rq m13715e() {
        return this.f25489j;
    }

    /* renamed from: f */
    public byte[] m13714f() {
        return this.f25490k;
    }

    /* renamed from: g */
    public AbstractC4489g m13713g() {
        return this.f25497r;
    }

    /* renamed from: h */
    public boolean m13712h() {
        return this.f25484c;
    }

    /* renamed from: i */
    public boolean m13711i() {
        return this.f25486f;
    }

    /* renamed from: j */
    public C7457np m13710j() {
        return this.f25496q;
    }

    /* renamed from: k */
    public AbstractC6830df.C6831a m13709k() {
        return this.f25494o;
    }

    /* renamed from: l */
    public Future m13708l() {
        return this.f25495p;
    }

    /* renamed from: m */
    void m13707m() {
        if (!C7788uf.f25842bu.m13486c().booleanValue()) {
            return;
        }
        this.f25495p = this.f25487h.submit(new Runnable() { // from class: com.google.android.gms.internal.rw.2
            @Override // java.lang.Runnable
            public void run() {
                C7677rw.this.m13701s();
            }
        });
    }

    /* renamed from: n */
    public C3433a m13706n() {
        if (!this.f25492m) {
            return null;
        }
        if (this.f25491l != null) {
            return this.f25491l;
        }
        if (this.f25493n != null) {
            try {
                this.f25493n.get(2000L, TimeUnit.MILLISECONDS);
                this.f25493n = null;
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            } catch (TimeoutException e3) {
                this.f25493n.cancel(true);
            }
        }
        return this.f25491l;
    }

    /* renamed from: o */
    public void m13705o() {
        synchronized (f25479d) {
            if (this.f25486f) {
                return;
            }
            if (!this.f25485e || this.f25497r == null) {
                this.f25486f = false;
            } else {
                this.f25497r.mo17358e();
                this.f25486f = true;
            }
        }
    }

    /* renamed from: p */
    public void m13704p() {
        synchronized (f25479d) {
            if (this.f25486f && this.f25497r != null) {
                this.f25497r.mo17356g();
                this.f25486f = false;
            }
        }
    }

    /* renamed from: q */
    public int m13703q() {
        C7457np m13710j = m13710j();
        if (m13710j != null) {
            return m13710j.m14416a();
        }
        return Integer.MIN_VALUE;
    }
}
