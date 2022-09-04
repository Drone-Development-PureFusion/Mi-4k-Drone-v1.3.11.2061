package com.p120c.p121a.p129b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.p120c.p121a.p129b.C1311c;
import com.p120c.p121a.p129b.p130a.C1296b;
import com.p120c.p121a.p129b.p130a.C1300e;
import com.p120c.p121a.p129b.p130a.EnumC1299d;
import com.p120c.p121a.p129b.p130a.EnumC1301f;
import com.p120c.p121a.p129b.p130a.EnumC1303h;
import com.p120c.p121a.p129b.p132b.AbstractC1309b;
import com.p120c.p121a.p129b.p132b.C1310c;
import com.p120c.p121a.p129b.p134d.AbstractC1326b;
import com.p120c.p121a.p129b.p135e.AbstractC1333a;
import com.p120c.p121a.p129b.p136f.AbstractC1339a;
import com.p120c.p121a.p129b.p136f.AbstractC1340b;
import com.p120c.p121a.p138c.C1354c;
import com.p120c.p121a.p138c.C1356d;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.c.a.b.h */
/* loaded from: classes.dex */
public final class RunnableC1345h implements C1354c.AbstractC1355a, Runnable {

    /* renamed from: f */
    private static final String f3475f = "ImageLoader is paused. Waiting...  [%s]";

    /* renamed from: g */
    private static final String f3476g = ".. Resume loading [%s]";

    /* renamed from: h */
    private static final String f3477h = "Delay %d ms before loading...  [%s]";

    /* renamed from: i */
    private static final String f3478i = "Start display image task [%s]";

    /* renamed from: j */
    private static final String f3479j = "Image already is loading. Waiting... [%s]";

    /* renamed from: k */
    private static final String f3480k = "...Get cached bitmap from memory after waiting. [%s]";

    /* renamed from: l */
    private static final String f3481l = "Load image from network [%s]";

    /* renamed from: m */
    private static final String f3482m = "Load image from disk cache [%s]";

    /* renamed from: n */
    private static final String f3483n = "Resize image in disk cache [%s]";

    /* renamed from: o */
    private static final String f3484o = "PreProcess image before caching in memory [%s]";

    /* renamed from: p */
    private static final String f3485p = "PostProcess image before displaying [%s]";

    /* renamed from: q */
    private static final String f3486q = "Cache image in memory [%s]";

    /* renamed from: r */
    private static final String f3487r = "Cache image on disk [%s]";

    /* renamed from: s */
    private static final String f3488s = "Process image before cache on disk [%s]";

    /* renamed from: t */
    private static final String f3489t = "ImageAware is reused for another image. Task is cancelled. [%s]";

    /* renamed from: u */
    private static final String f3490u = "ImageAware was collected by GC. Task is cancelled. [%s]";

    /* renamed from: v */
    private static final String f3491v = "Task was interrupted [%s]";

    /* renamed from: w */
    private static final String f3492w = "No stream for image [%s]";

    /* renamed from: x */
    private static final String f3493x = "Pre-processor returned null [%s]";

    /* renamed from: y */
    private static final String f3494y = "Post-processor returned null [%s]";

    /* renamed from: z */
    private static final String f3495z = "Bitmap processor for disk cache returned null [%s]";

    /* renamed from: A */
    private final C1337f f3496A;

    /* renamed from: B */
    private final C1343g f3497B;

    /* renamed from: C */
    private final Handler f3498C;

    /* renamed from: D */
    private final C1328e f3499D;

    /* renamed from: E */
    private final AbstractC1326b f3500E;

    /* renamed from: F */
    private final AbstractC1326b f3501F;

    /* renamed from: G */
    private final AbstractC1326b f3502G;

    /* renamed from: H */
    private final AbstractC1309b f3503H;

    /* renamed from: I */
    private final String f3504I;

    /* renamed from: J */
    private final C1300e f3505J;

    /* renamed from: K */
    private final boolean f3506K;

    /* renamed from: L */
    private EnumC1301f f3507L = EnumC1301f.NETWORK;

    /* renamed from: a */
    final String f3508a;

    /* renamed from: b */
    final AbstractC1333a f3509b;

    /* renamed from: c */
    final C1311c f3510c;

    /* renamed from: d */
    final AbstractC1339a f3511d;

    /* renamed from: e */
    final AbstractC1340b f3512e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.c.a.b.h$a */
    /* loaded from: classes.dex */
    public class C1349a extends Exception {
        C1349a() {
        }
    }

    public RunnableC1345h(C1337f c1337f, C1343g c1343g, Handler handler) {
        this.f3496A = c1337f;
        this.f3497B = c1343g;
        this.f3498C = handler;
        this.f3499D = c1337f.f3451a;
        this.f3500E = this.f3499D.f3405p;
        this.f3501F = this.f3499D.f3408s;
        this.f3502G = this.f3499D.f3409t;
        this.f3503H = this.f3499D.f3406q;
        this.f3508a = c1343g.f3467a;
        this.f3504I = c1343g.f3468b;
        this.f3509b = c1343g.f3469c;
        this.f3505J = c1343g.f3470d;
        this.f3510c = c1343g.f3471e;
        this.f3511d = c1343g.f3472f;
        this.f3512e = c1343g.f3473g;
        this.f3506K = this.f3510c.m35845s();
    }

    /* renamed from: a */
    private Bitmap m35645a(String str) {
        return this.f3503H.mo35898a(new C1310c(this.f3504I, str, this.f3508a, this.f3505J, this.f3509b.mo35680c(), m35636h(), this.f3510c));
    }

    /* renamed from: a */
    private void m35648a(final C1296b.EnumC1297a enumC1297a, final Throwable th) {
        if (this.f3506K || m35628p() || m35634j()) {
            return;
        }
        m35646a(new Runnable() { // from class: com.c.a.b.h.2
            @Override // java.lang.Runnable
            public void run() {
                if (RunnableC1345h.this.f3510c.m35878c()) {
                    RunnableC1345h.this.f3509b.mo35683a(RunnableC1345h.this.f3510c.m35877c(RunnableC1345h.this.f3499D.f3390a));
                }
                RunnableC1345h.this.f3511d.mo35652a(RunnableC1345h.this.f3508a, RunnableC1345h.this.f3509b.mo35679d(), new C1296b(enumC1297a, th));
            }
        }, false, this.f3498C, this.f3496A);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m35646a(Runnable runnable, boolean z, Handler handler, C1337f c1337f) {
        if (z) {
            runnable.run();
        } else if (handler == null) {
            c1337f.m35670a(runnable);
        } else {
            handler.post(runnable);
        }
    }

    /* renamed from: b */
    private boolean m35644b() {
        AtomicBoolean m35661d = this.f3496A.m35661d();
        if (m35661d.get()) {
            synchronized (this.f3496A.m35660e()) {
                if (m35661d.get()) {
                    C1356d.m35612a(f3475f, this.f3504I);
                    try {
                        this.f3496A.m35660e().wait();
                        C1356d.m35612a(f3476g, this.f3504I);
                    } catch (InterruptedException e) {
                        C1356d.m35604d(f3491v, this.f3504I);
                        return true;
                    }
                }
            }
        }
        return m35634j();
    }

    /* renamed from: b */
    private boolean m35643b(int i, int i2) {
        File mo35979a = this.f3499D.f3404o.mo35979a(this.f3508a);
        if (mo35979a != null && mo35979a.exists()) {
            Bitmap mo35898a = this.f3503H.mo35898a(new C1310c(this.f3504I, AbstractC1326b.EnumC1327a.FILE.m35739b(mo35979a.getAbsolutePath()), this.f3508a, new C1300e(i, i2), EnumC1303h.FIT_INSIDE, m35636h(), new C1311c.C1313a().m35833a(this.f3510c).m35836a(EnumC1299d.IN_SAMPLE_INT).m35818d()));
            if (mo35898a != null && this.f3499D.f3395f != null) {
                C1356d.m35612a(f3488s, this.f3504I);
                mo35898a = this.f3499D.f3395f.m35650a(mo35898a);
                if (mo35898a == null) {
                    C1356d.m35604d(f3495z, this.f3504I);
                }
            }
            Bitmap bitmap = mo35898a;
            if (bitmap != null) {
                boolean mo35978a = this.f3499D.f3404o.mo35978a(this.f3508a, bitmap);
                bitmap.recycle();
                return mo35978a;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m35642c() {
        if (this.f3510c.m35871f()) {
            C1356d.m35612a(f3477h, Integer.valueOf(this.f3510c.m35859l()), this.f3504I);
            try {
                Thread.sleep(this.f3510c.m35859l());
                return m35634j();
            } catch (InterruptedException e) {
                C1356d.m35604d(f3491v, this.f3504I);
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m35641c(final int i, final int i2) {
        if (m35628p() || m35634j()) {
            return false;
        }
        if (this.f3512e != null) {
            m35646a(new Runnable() { // from class: com.c.a.b.h.1
                @Override // java.lang.Runnable
                public void run() {
                    RunnableC1345h.this.f3512e.m35655a(RunnableC1345h.this.f3508a, RunnableC1345h.this.f3509b.mo35679d(), i, i2);
                }
            }, false, this.f3498C, this.f3496A);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004b, code lost:
        if (r0.getHeight() > 0) goto L24;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap m35640d() {
        Bitmap bitmap;
        Throwable th;
        OutOfMemoryError e;
        IOException e2;
        File mo35979a;
        try {
            try {
                File mo35979a2 = this.f3499D.f3404o.mo35979a(this.f3508a);
                if (mo35979a2 == null || !mo35979a2.exists() || mo35979a2.length() <= 0) {
                    bitmap = null;
                } else {
                    C1356d.m35612a(f3482m, this.f3504I);
                    this.f3507L = EnumC1301f.DISC_CACHE;
                    m35635i();
                    bitmap = m35645a(AbstractC1326b.EnumC1327a.FILE.m35739b(mo35979a2.getAbsolutePath()));
                }
                if (bitmap != null) {
                    try {
                        if (bitmap.getWidth() > 0) {
                        }
                    } catch (IOException e3) {
                        e2 = e3;
                        C1356d.m35611a(e2);
                        m35648a(C1296b.EnumC1297a.IO_ERROR, e2);
                        return bitmap;
                    } catch (IllegalStateException e4) {
                        m35648a(C1296b.EnumC1297a.NETWORK_DENIED, (Throwable) null);
                        return bitmap;
                    } catch (OutOfMemoryError e5) {
                        e = e5;
                        C1356d.m35611a(e);
                        m35648a(C1296b.EnumC1297a.OUT_OF_MEMORY, e);
                        return bitmap;
                    } catch (Throwable th2) {
                        th = th2;
                        C1356d.m35611a(th);
                        m35648a(C1296b.EnumC1297a.UNKNOWN, th);
                        return bitmap;
                    }
                }
                C1356d.m35612a(f3481l, this.f3504I);
                this.f3507L = EnumC1301f.NETWORK;
                String str = this.f3508a;
                if (this.f3510c.m35865i() && m35639e() && (mo35979a = this.f3499D.f3404o.mo35979a(this.f3508a)) != null) {
                    str = AbstractC1326b.EnumC1327a.FILE.m35739b(mo35979a.getAbsolutePath());
                }
                m35635i();
                bitmap = m35645a(str);
                if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                    m35648a(C1296b.EnumC1297a.DECODING_ERROR, (Throwable) null);
                }
            } catch (C1349a e6) {
                throw e6;
            }
        } catch (IOException e7) {
            bitmap = null;
            e2 = e7;
        } catch (IllegalStateException e8) {
            bitmap = null;
        } catch (OutOfMemoryError e9) {
            bitmap = null;
            e = e9;
        } catch (Throwable th3) {
            bitmap = null;
            th = th3;
        }
        return bitmap;
    }

    /* renamed from: e */
    private boolean m35639e() {
        C1356d.m35612a(f3487r, this.f3504I);
        try {
            boolean m35638f = m35638f();
            if (!m35638f) {
                return m35638f;
            }
            int i = this.f3499D.f3393d;
            int i2 = this.f3499D.f3394e;
            if (i <= 0 && i2 <= 0) {
                return m35638f;
            }
            C1356d.m35612a(f3483n, this.f3504I);
            m35643b(i, i2);
            return m35638f;
        } catch (IOException e) {
            C1356d.m35611a(e);
            return false;
        }
    }

    /* renamed from: f */
    private boolean m35638f() {
        boolean z = false;
        InputStream mo35687a = m35636h().mo35687a(this.f3508a, this.f3510c.m35855n());
        if (mo35687a == null) {
            C1356d.m35604d(f3492w, this.f3504I);
        } else {
            try {
                z = this.f3499D.f3404o.mo35977a(this.f3508a, mo35687a, this);
            } finally {
                C1354c.m35619a((Closeable) mo35687a);
            }
        }
        return z;
    }

    /* renamed from: g */
    private void m35637g() {
        if (this.f3506K || m35628p()) {
            return;
        }
        m35646a(new Runnable() { // from class: com.c.a.b.h.3
            @Override // java.lang.Runnable
            public void run() {
                RunnableC1345h.this.f3511d.mo35651b(RunnableC1345h.this.f3508a, RunnableC1345h.this.f3509b.mo35679d());
            }
        }, false, this.f3498C, this.f3496A);
    }

    /* renamed from: h */
    private AbstractC1326b m35636h() {
        return this.f3496A.m35659f() ? this.f3501F : this.f3496A.m35658g() ? this.f3502G : this.f3500E;
    }

    /* renamed from: i */
    private void m35635i() {
        m35633k();
        m35631m();
    }

    /* renamed from: j */
    private boolean m35634j() {
        return m35632l() || m35630n();
    }

    /* renamed from: k */
    private void m35633k() {
        if (m35632l()) {
            throw new C1349a();
        }
    }

    /* renamed from: l */
    private boolean m35632l() {
        if (this.f3509b.mo35678e()) {
            C1356d.m35612a(f3490u, this.f3504I);
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m35631m() {
        if (m35630n()) {
            throw new C1349a();
        }
    }

    /* renamed from: n */
    private boolean m35630n() {
        if (!this.f3504I.equals(this.f3496A.m35675a(this.f3509b))) {
            C1356d.m35612a(f3489t, this.f3504I);
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private void m35629o() {
        if (m35628p()) {
            throw new C1349a();
        }
    }

    /* renamed from: p */
    private boolean m35628p() {
        if (Thread.interrupted()) {
            C1356d.m35612a(f3491v, this.f3504I);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m35649a() {
        return this.f3508a;
    }

    @Override // com.p120c.p121a.p138c.C1354c.AbstractC1355a
    /* renamed from: a */
    public boolean mo35615a(int i, int i2) {
        return this.f3506K || m35641c(i, i2);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!m35644b() && !m35642c()) {
            ReentrantLock reentrantLock = this.f3497B.f3474h;
            C1356d.m35612a(f3478i, this.f3504I);
            if (reentrantLock.isLocked()) {
                C1356d.m35612a(f3479j, this.f3504I);
            }
            reentrantLock.lock();
            try {
                m35635i();
                Bitmap mo35964a = this.f3499D.f3403n.mo35964a(this.f3504I);
                if (mo35964a == null || mo35964a.isRecycled()) {
                    mo35964a = m35640d();
                    if (mo35964a == null) {
                        return;
                    }
                    m35635i();
                    m35629o();
                    if (this.f3510c.m35875d()) {
                        C1356d.m35612a(f3484o, this.f3504I);
                        mo35964a = this.f3510c.m35853o().m35650a(mo35964a);
                        if (mo35964a == null) {
                            C1356d.m35604d(f3493x, this.f3504I);
                        }
                    }
                    if (mo35964a != null && this.f3510c.m35867h()) {
                        C1356d.m35612a(f3486q, this.f3504I);
                        this.f3499D.f3403n.mo35963a(this.f3504I, mo35964a);
                    }
                } else {
                    this.f3507L = EnumC1301f.MEMORY_CACHE;
                    C1356d.m35612a(f3480k, this.f3504I);
                }
                if (mo35964a != null && this.f3510c.m35873e()) {
                    C1356d.m35612a(f3485p, this.f3504I);
                    mo35964a = this.f3510c.m35851p().m35650a(mo35964a);
                    if (mo35964a == null) {
                        C1356d.m35604d(f3494y, this.f3504I);
                    }
                }
                m35635i();
                m35629o();
                reentrantLock.unlock();
                m35646a(new RunnableC1305b(mo35964a, this.f3497B, this.f3496A, this.f3507L), this.f3506K, this.f3498C, this.f3496A);
            } catch (C1349a e) {
                m35637g();
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
