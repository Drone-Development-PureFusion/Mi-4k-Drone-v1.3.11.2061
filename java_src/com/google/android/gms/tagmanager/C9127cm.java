package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import p005b.p006a.p007a.p029b.p055o.AbstractC0660d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.cm */
/* loaded from: classes2.dex */
public class C9127cm extends AbstractC9126cl {

    /* renamed from: a */
    private static final Object f28842a = new Object();

    /* renamed from: n */
    private static C9127cm f28843n;

    /* renamed from: b */
    private Context f28844b;

    /* renamed from: c */
    private AbstractC9030ad f28845c;

    /* renamed from: d */
    private volatile AbstractC9027ab f28846d;

    /* renamed from: k */
    private AbstractC9130a f28853k;

    /* renamed from: l */
    private C9072bb f28854l;

    /* renamed from: e */
    private int f28847e = AbstractC0660d.f1196l;

    /* renamed from: f */
    private boolean f28848f = true;

    /* renamed from: g */
    private boolean f28849g = false;

    /* renamed from: h */
    private boolean f28850h = true;

    /* renamed from: i */
    private boolean f28851i = true;

    /* renamed from: j */
    private AbstractC9031ae f28852j = new AbstractC9031ae() { // from class: com.google.android.gms.tagmanager.cm.1
        @Override // com.google.android.gms.tagmanager.AbstractC9031ae
        /* renamed from: a */
        public void mo9167a(boolean z) {
            C9127cm.this.m9180a(z, C9127cm.this.f28850h);
        }
    };

    /* renamed from: m */
    private boolean f28855m = false;

    /* renamed from: com.google.android.gms.tagmanager.cm$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9130a {
        /* renamed from: a */
        void mo9166a();

        /* renamed from: a */
        void mo9165a(long j);

        /* renamed from: b */
        void mo9164b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tagmanager.cm$b */
    /* loaded from: classes2.dex */
    public class C9131b implements AbstractC9130a {

        /* renamed from: b */
        private Handler f28859b;

        private C9131b() {
            this.f28859b = new Handler(C9127cm.this.f28844b.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.tagmanager.cm.b.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (1 == message.what && C9127cm.f28842a.equals(message.obj)) {
                        C9127cm.this.mo9184a();
                        if (!C9127cm.this.m9169h()) {
                            C9131b.this.mo9165a(C9127cm.this.f28847e);
                        }
                    }
                    return true;
                }
            });
        }

        /* renamed from: c */
        private Message m9163c() {
            return this.f28859b.obtainMessage(1, C9127cm.f28842a);
        }

        @Override // com.google.android.gms.tagmanager.C9127cm.AbstractC9130a
        /* renamed from: a */
        public void mo9166a() {
            this.f28859b.removeMessages(1, C9127cm.f28842a);
            this.f28859b.sendMessage(m9163c());
        }

        @Override // com.google.android.gms.tagmanager.C9127cm.AbstractC9130a
        /* renamed from: a */
        public void mo9165a(long j) {
            this.f28859b.removeMessages(1, C9127cm.f28842a);
            this.f28859b.sendMessageDelayed(m9163c(), j);
        }

        @Override // com.google.android.gms.tagmanager.C9127cm.AbstractC9130a
        /* renamed from: b */
        public void mo9164b() {
            this.f28859b.removeMessages(1, C9127cm.f28842a);
        }
    }

    private C9127cm() {
    }

    /* renamed from: c */
    public static C9127cm m9177c() {
        if (f28843n == null) {
            f28843n = new C9127cm();
        }
        return f28843n;
    }

    /* renamed from: f */
    private void m9171f() {
        this.f28854l = new C9072bb(this);
        this.f28854l.m9292a(this.f28844b);
    }

    /* renamed from: g */
    private void m9170g() {
        this.f28853k = new C9131b();
        if (this.f28847e > 0) {
            this.f28853k.mo9165a(this.f28847e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public boolean m9169h() {
        return this.f28855m || !this.f28850h || this.f28847e <= 0;
    }

    /* renamed from: i */
    private void m9168i() {
        if (m9169h()) {
            this.f28853k.mo9164b();
            C9065aw.m9295e("PowerSaveMode initiated.");
            return;
        }
        this.f28853k.mo9165a(this.f28847e);
        C9065aw.m9295e("PowerSaveMode terminated.");
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9126cl
    /* renamed from: a */
    public synchronized void mo9184a() {
        if (!this.f28849g) {
            C9065aw.m9295e("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f28848f = true;
        } else {
            this.f28846d.mo9326a(new Runnable() { // from class: com.google.android.gms.tagmanager.cm.2
                @Override // java.lang.Runnable
                public void run() {
                    C9127cm.this.f28845c.mo9286a();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m9183a(Context context, AbstractC9027ab abstractC9027ab) {
        if (this.f28844b == null) {
            this.f28844b = context.getApplicationContext();
            if (this.f28846d == null) {
                this.f28846d = abstractC9027ab;
            }
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9126cl
    /* renamed from: a */
    public synchronized void mo9181a(boolean z) {
        m9180a(this.f28855m, z);
    }

    /* renamed from: a */
    synchronized void m9180a(boolean z, boolean z2) {
        boolean m9169h = m9169h();
        this.f28855m = z;
        this.f28850h = z2;
        if (m9169h() != m9169h) {
            m9168i();
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9126cl
    /* renamed from: b */
    public synchronized void mo9179b() {
        if (!m9169h()) {
            this.f28853k.mo9166a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized AbstractC9030ad m9175d() {
        if (this.f28845c == null) {
            if (this.f28844b == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.f28845c = new C9087bp(this.f28852j, this.f28844b);
        }
        if (this.f28853k == null) {
            m9170g();
        }
        this.f28849g = true;
        if (this.f28848f) {
            mo9184a();
            this.f28848f = false;
        }
        if (this.f28854l == null && this.f28851i) {
            m9171f();
        }
        return this.f28845c;
    }
}
