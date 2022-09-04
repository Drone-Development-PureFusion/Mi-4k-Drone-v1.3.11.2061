package com.tencent.open.p264a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/* renamed from: com.tencent.open.a.a */
/* loaded from: classes.dex */
public class C10244a extends AbstractC10260i implements Handler.Callback {

    /* renamed from: a */
    private C10245b f31865a;

    /* renamed from: b */
    private FileWriter f31866b;

    /* renamed from: c */
    private File f31867c;

    /* renamed from: d */
    private char[] f31868d;

    /* renamed from: e */
    private volatile C10258g f31869e;

    /* renamed from: f */
    private volatile C10258g f31870f;

    /* renamed from: g */
    private volatile C10258g f31871g;

    /* renamed from: h */
    private volatile C10258g f31872h;

    /* renamed from: i */
    private volatile boolean f31873i;

    /* renamed from: j */
    private HandlerThread f31874j;

    /* renamed from: k */
    private Handler f31875k;

    public C10244a(int i, boolean z, C10259h c10259h, C10245b c10245b) {
        super(i, z, c10259h);
        this.f31873i = false;
        m5725a(c10245b);
        this.f31869e = new C10258g();
        this.f31870f = new C10258g();
        this.f31871g = this.f31869e;
        this.f31872h = this.f31870f;
        this.f31868d = new char[c10245b.m5697f()];
        c10245b.m5712b();
        m5721g();
        this.f31874j = new HandlerThread(c10245b.m5707c(), c10245b.m5694h());
        if (this.f31874j != null) {
            this.f31874j.start();
        }
        if (!this.f31874j.isAlive() || this.f31874j.getLooper() == null) {
            return;
        }
        this.f31875k = new Handler(this.f31874j.getLooper(), this);
    }

    public C10244a(C10245b c10245b) {
        this(C10249c.f31893c, true, C10259h.f31921a, c10245b);
    }

    /* renamed from: f */
    private void m5722f() {
        if (Thread.currentThread() == this.f31874j && !this.f31873i) {
            this.f31873i = true;
            m5719i();
            try {
                this.f31872h.m5665a(m5721g(), this.f31868d);
            } catch (IOException e) {
            } finally {
                this.f31872h.m5663b();
            }
            this.f31873i = false;
        }
    }

    /* renamed from: g */
    private Writer m5721g() {
        File m5718a = m5723c().m5718a();
        if (m5718a != null && !m5718a.equals(this.f31867c)) {
            this.f31867c = m5718a;
            m5720h();
            try {
                this.f31866b = new FileWriter(this.f31867c, true);
            } catch (IOException e) {
                return null;
            }
        }
        return this.f31866b;
    }

    /* renamed from: h */
    private void m5720h() {
        try {
            if (this.f31866b == null) {
                return;
            }
            this.f31866b.flush();
            this.f31866b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    private void m5719i() {
        synchronized (this) {
            if (this.f31871g == this.f31869e) {
                this.f31871g = this.f31870f;
                this.f31872h = this.f31869e;
            } else {
                this.f31871g = this.f31869e;
                this.f31872h = this.f31870f;
            }
        }
    }

    public void a() {
        if (this.f31875k.hasMessages(1024)) {
            this.f31875k.removeMessages(1024);
        }
        this.f31875k.sendEmptyMessage(1024);
    }

    @Override // com.tencent.open.p264a.AbstractC10260i
    /* renamed from: a */
    protected void mo5659a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        a(e().m5661a(i, thread, j, str, str2, th));
    }

    /* renamed from: a */
    public void m5725a(C10245b c10245b) {
        this.f31865a = c10245b;
    }

    protected void a(String str) {
        this.f31871g.m5664a(str);
        if (this.f31871g.m5666a() >= m5723c().m5697f()) {
            a();
        }
    }

    /* renamed from: b */
    public void m5724b() {
        m5720h();
        this.f31874j.quit();
    }

    /* renamed from: c */
    public C10245b m5723c() {
        return this.f31865a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1024:
                m5722f();
                return true;
            default:
                return true;
        }
    }
}
