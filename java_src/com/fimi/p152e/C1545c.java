package com.fimi.p152e;

import android.os.SystemClock;
import android.util.Log;
import com.fimi.p140a.p141a.C1489a;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p140a.p145e.C1511f;
import com.fimi.p140a.p146f.C1516b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.fimi.e.c */
/* loaded from: classes.dex */
public class C1545c extends C1542a {

    /* renamed from: d */
    private Socket f3764d;

    /* renamed from: e */
    private C1546a f3765e;

    /* renamed from: f */
    private C1547b f3766f;

    /* renamed from: i */
    private boolean f3769i;

    /* renamed from: l */
    private byte[] f3772l;

    /* renamed from: m */
    private C1548c f3773m;

    /* renamed from: g */
    private long f3767g = SystemClock.uptimeMillis();

    /* renamed from: h */
    private long f3768h = SystemClock.uptimeMillis();

    /* renamed from: j */
    private List<C1489a> f3770j = new ArrayList();

    /* renamed from: k */
    private boolean f3771k = false;

    /* renamed from: b */
    int[] f3762b = {193, 199, 201, 202, 203, 204};

    /* renamed from: c */
    boolean f3763c = false;

    /* renamed from: com.fimi.e.c$a */
    /* loaded from: classes.dex */
    public class C1546a extends Thread {

        /* renamed from: b */
        private InputStream f3775b;

        /* renamed from: c */
        private boolean f3776c;

        public C1546a() {
        }

        /* renamed from: a */
        public void m35216a() {
            this.f3776c = true;
            interrupt();
            if (this.f3775b != null) {
                try {
                    this.f3775b.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f3775b = C1545c.this.f3764d.getInputStream();
                if (this.f3775b == null) {
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (this.f3775b != null) {
                byte[] bArr = new byte[1024];
                C1511f c1511f = new C1511f();
                while (!this.f3776c) {
                    try {
                        int read = this.f3775b.read(bArr);
                        if (read > 0) {
                            byte[] bArr2 = new byte[read];
                            System.arraycopy(bArr, 0, bArr2, 0, read);
                            String m35418a = C1516b.m35418a(bArr2);
                            for (int i = 0; i < read; i++) {
                                C1508c m35432a = c1511f.m35432a(bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
                                if (m35432a != null && m35432a.m35468c() != 48) {
                                    if (m35432a.m35468c() == 95) {
                                    }
                                    if (m35432a.m35468c() == 201) {
                                        Log.d("zhej", " return hex:" + m35418a);
                                    }
                                    C1543b.m35227b().mo28086a(m35432a.m35468c(), m35432a);
                                }
                            }
                        } else {
                            try {
                                Thread.sleep(50L);
                                C1545c.this.b(" sessionhandler read error len=" + read + " closeSession ");
                                C1545c.this.mo35221b();
                            } catch (InterruptedException e2) {
                                return;
                            }
                        }
                    } catch (IOException e3) {
                        C1545c.this.mo35221b();
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.fimi.e.c$b */
    /* loaded from: classes.dex */
    public class C1547b extends Thread {

        /* renamed from: a */
        OutputStream f3777a;

        /* renamed from: c */
        private boolean f3779c;

        /* renamed from: d */
        private int f3780d;

        public C1547b() {
        }

        /* renamed from: a */
        public void m35215a() {
            this.f3779c = true;
            interrupt();
            if (this.f3777a != null) {
                try {
                    this.f3777a.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f3777a = C1545c.this.f3764d.getOutputStream();
                if (this.f3777a == null) {
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            while (!this.f3779c) {
                try {
                    synchronized (C1545c.this.f3770j) {
                        if (C1545c.this.f3770j.size() > 0) {
                            for (C1489a c1489a : C1545c.this.f3770j) {
                                try {
                                    C1516b.m35418a(c1489a.f3555a);
                                    if (c1489a.f3556b != 8 || c1489a.f3555a[5] == 48) {
                                        this.f3777a.write(c1489a.f3555a, 0, c1489a.f3556b);
                                    } else {
                                        this.f3777a.write(c1489a.f3555a, 0, c1489a.f3556b);
                                    }
                                } catch (IOException e2) {
                                }
                            }
                            this.f3780d = 0;
                            C1545c.this.f3770j.clear();
                        } else {
                            C1545c.this.m35217e();
                        }
                    }
                    try {
                        Thread.sleep(20L);
                    } catch (InterruptedException e3) {
                        return;
                    }
                } catch (Exception e4) {
                    C1545c.this.b(" sessionhandler writethread error " + e4.toString());
                    return;
                }
            }
        }
    }

    /* renamed from: com.fimi.e.c$c */
    /* loaded from: classes.dex */
    public class C1548c extends Thread {

        /* renamed from: b */
        private boolean f3782b = true;

        public C1548c() {
        }

        /* renamed from: a */
        public void m35214a() {
            this.f3782b = false;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.f3782b) {
                try {
                    sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.f3782b) {
                    C1545c.this.m35218d();
                }
            }
        }
    }

    public C1545c(Socket socket) {
        super(socket);
        m35219c();
        this.f3764d = socket;
        a("create a session");
    }

    @Override // com.fimi.p152e.C1542a
    /* renamed from: a */
    public void mo35225a() {
        this.f3765e = new C1546a();
        this.f3765e.start();
        this.f3766f = new C1547b();
        this.f3766f.start();
        this.f3773m = new C1548c();
        this.f3773m.start();
    }

    @Override // com.fimi.p152e.C1542a
    /* renamed from: a */
    public void mo35222a(byte[] bArr, int i) {
        synchronized (this.f3770j) {
            C1489a c1489a = new C1489a();
            c1489a.f3555a = bArr;
            c1489a.f3556b = i;
            this.f3770j.add(c1489a);
            this.f3768h = SystemClock.uptimeMillis();
        }
        m35217e();
    }

    /* renamed from: a */
    public boolean m35224a(int i) {
        for (int i2 = 0; i2 < this.f3762b.length; i2++) {
            if (i == this.f3762b[i2]) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fimi.p152e.C1542a
    /* renamed from: b */
    public void mo35221b() {
        if (this.f3765e != null) {
            this.f3765e.m35216a();
        }
        if (this.f3766f != null) {
            this.f3766f.m35215a();
        }
        if (this.f3773m != null) {
            this.f3773m.m35214a();
        }
        if (this.f3764d != null) {
            try {
                this.f3764d.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        C1549d.m35208b().m35206c();
    }

    /* renamed from: c */
    public void m35219c() {
        C1508c c1508c = new C1508c();
        c1508c.m35472a(0, 4, 1, 0, 48);
        this.f3772l = c1508c.m35464f();
    }

    /* renamed from: d */
    public void m35218d() {
        mo35222a(this.f3772l, this.f3772l.length);
    }

    /* renamed from: e */
    public void m35217e() {
        synchronized (this.f3770j) {
            if (this.f3763c) {
                this.f3763c = false;
                this.f3770j.notify();
            } else {
                this.f3763c = true;
                try {
                    this.f3770j.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
