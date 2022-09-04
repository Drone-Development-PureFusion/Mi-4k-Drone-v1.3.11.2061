package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import p005b.p006a.p007a.p029b.p055o.AbstractC0660d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class apu extends apt {

    /* renamed from: a */
    private static final Object f22759a = new Object();

    /* renamed from: o */
    private static apu f22760o;

    /* renamed from: b */
    private Context f22761b;

    /* renamed from: c */
    private apc f22762c;

    /* renamed from: d */
    private volatile apa f22763d;

    /* renamed from: l */
    private AbstractC6723a f22771l;

    /* renamed from: m */
    private apj f22772m;

    /* renamed from: e */
    private int f22764e = AbstractC0660d.f1196l;

    /* renamed from: f */
    private boolean f22765f = true;

    /* renamed from: g */
    private boolean f22766g = false;

    /* renamed from: h */
    private boolean f22767h = false;

    /* renamed from: i */
    private boolean f22768i = true;

    /* renamed from: j */
    private boolean f22769j = true;

    /* renamed from: k */
    private apd f22770k = new apd() { // from class: com.google.android.gms.internal.apu.1
        @Override // com.google.android.gms.internal.apd
        /* renamed from: a */
        public void mo16293a(boolean z) {
            apu.this.m16306a(z, apu.this.f22768i);
        }
    };

    /* renamed from: n */
    private boolean f22773n = false;

    /* renamed from: com.google.android.gms.internal.apu$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6723a {
        /* renamed from: a */
        void mo16292a();

        /* renamed from: a */
        void mo16291a(long j);

        /* renamed from: b */
        void mo16290b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.apu$b */
    /* loaded from: classes2.dex */
    public class C6724b implements AbstractC6723a {

        /* renamed from: b */
        private Handler f22777b;

        private C6724b() {
            this.f22777b = new Handler(apu.this.f22761b.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.internal.apu.b.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (1 == message.what && apu.f22759a.equals(message.obj)) {
                        apu.this.m16301d();
                        if (!apu.this.m16295h()) {
                            C6724b.this.mo16291a(apu.this.f22764e);
                        }
                    }
                    return true;
                }
            });
        }

        /* renamed from: c */
        private Message m16289c() {
            return this.f22777b.obtainMessage(1, apu.f22759a);
        }

        @Override // com.google.android.gms.internal.apu.AbstractC6723a
        /* renamed from: a */
        public void mo16292a() {
            this.f22777b.removeMessages(1, apu.f22759a);
            this.f22777b.sendMessage(m16289c());
        }

        @Override // com.google.android.gms.internal.apu.AbstractC6723a
        /* renamed from: a */
        public void mo16291a(long j) {
            this.f22777b.removeMessages(1, apu.f22759a);
            this.f22777b.sendMessageDelayed(m16289c(), j);
        }

        @Override // com.google.android.gms.internal.apu.AbstractC6723a
        /* renamed from: b */
        public void mo16290b() {
            this.f22777b.removeMessages(1, apu.f22759a);
        }
    }

    private apu() {
    }

    /* renamed from: b */
    public static apu m16305b() {
        if (f22760o == null) {
            f22760o = new apu();
        }
        return f22760o;
    }

    /* renamed from: f */
    private void m16297f() {
        this.f22772m = new apj(this);
        this.f22772m.m16384a(this.f22761b);
    }

    /* renamed from: g */
    private void m16296g() {
        this.f22771l = new C6724b();
        if (this.f22764e > 0) {
            this.f22771l.mo16291a(this.f22764e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public boolean m16295h() {
        return this.f22773n || !this.f22768i || this.f22764e <= 0;
    }

    /* renamed from: i */
    private void m16294i() {
        if (m16295h()) {
            this.f22771l.mo16290b();
            aph.m16391d("PowerSaveMode initiated.");
            return;
        }
        this.f22771l.mo16291a(this.f22764e);
        aph.m16391d("PowerSaveMode terminated.");
    }

    @Override // com.google.android.gms.internal.apt
    /* renamed from: a */
    public synchronized void mo16311a() {
        if (!m16295h()) {
            this.f22771l.mo16292a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m16310a(Context context, apa apaVar) {
        if (this.f22761b == null) {
            this.f22761b = context.getApplicationContext();
            if (this.f22763d == null) {
                this.f22763d = apaVar;
            }
        }
    }

    @Override // com.google.android.gms.internal.apt
    /* renamed from: a */
    public synchronized void mo16307a(boolean z) {
        m16306a(this.f22773n, z);
    }

    /* renamed from: a */
    synchronized void m16306a(boolean z, boolean z2) {
        boolean m16295h = m16295h();
        this.f22773n = z;
        this.f22768i = z2;
        if (m16295h() != m16295h) {
            m16294i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized apc m16303c() {
        if (this.f22762c == null) {
            if (this.f22761b == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.f22762c = new apk(this.f22770k, this.f22761b);
        }
        if (this.f22771l == null) {
            m16296g();
        }
        this.f22766g = true;
        if (this.f22765f) {
            m16301d();
            this.f22765f = false;
        }
        if (this.f22772m == null && this.f22769j) {
            m16297f();
        }
        return this.f22762c;
    }

    /* renamed from: d */
    public synchronized void m16301d() {
        if (!this.f22766g) {
            aph.m16391d("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f22765f = true;
        } else if (!this.f22767h) {
            this.f22767h = true;
            this.f22763d.mo16406a(new Runnable() { // from class: com.google.android.gms.internal.apu.2
                @Override // java.lang.Runnable
                public void run() {
                    apu.this.f22767h = false;
                    apu.this.f22762c.mo16382a();
                }
            });
        }
    }
}
