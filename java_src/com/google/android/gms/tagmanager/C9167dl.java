package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.AbstractC9069b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.dl */
/* loaded from: classes2.dex */
public class C9167dl implements AbstractC9069b {

    /* renamed from: a */
    private final Looper f28932a;

    /* renamed from: b */
    private C9020a f28933b;

    /* renamed from: c */
    private C9020a f28934c;

    /* renamed from: d */
    private Status f28935d;

    /* renamed from: e */
    private HandlerC9169b f28936e;

    /* renamed from: f */
    private AbstractC9168a f28937f;

    /* renamed from: g */
    private boolean f28938g;

    /* renamed from: h */
    private C9203f f28939h;

    /* renamed from: com.google.android.gms.tagmanager.dl$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9168a {
        /* renamed from: a */
        void mo9026a();

        /* renamed from: a */
        void mo9025a(String str);

        /* renamed from: b */
        String mo9024b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tagmanager.dl$b */
    /* loaded from: classes2.dex */
    public class HandlerC9169b extends Handler {

        /* renamed from: b */
        private final AbstractC9069b.AbstractC9070a f28941b;

        public HandlerC9169b(AbstractC9069b.AbstractC9070a abstractC9070a, Looper looper) {
            super(looper);
            this.f28941b = abstractC9070a;
        }

        /* renamed from: a */
        public void m9057a(String str) {
            sendMessage(obtainMessage(1, str));
        }

        /* renamed from: b */
        protected void m9056b(String str) {
            this.f28941b.m9294a(C9167dl.this, str);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    m9056b((String) message.obj);
                    return;
                default:
                    C9065aw.m9301a("Don't know how to handle this message.");
                    return;
            }
        }
    }

    public C9167dl(Status status) {
        this.f28935d = status;
        this.f28932a = null;
    }

    public C9167dl(C9203f c9203f, Looper looper, C9020a c9020a, AbstractC9168a abstractC9168a) {
        this.f28939h = c9203f;
        this.f28932a = looper == null ? Looper.getMainLooper() : looper;
        this.f28933b = c9020a;
        this.f28937f = abstractC9168a;
        this.f28935d = Status.f16786a;
        c9203f.m8941a(this);
    }

    /* renamed from: g */
    private void m9058g() {
        if (this.f28936e != null) {
            this.f28936e.m9057a(this.f28934c.m9341d());
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f28935d;
    }

    /* renamed from: a */
    public synchronized void m9066a(C9020a c9020a) {
        if (!this.f28938g) {
            if (c9020a == null) {
                C9065aw.m9301a("Unexpected null container.");
            } else {
                this.f28934c = c9020a;
                m9058g();
            }
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9069b
    /* renamed from: a */
    public synchronized void mo9065a(AbstractC9069b.AbstractC9070a abstractC9070a) {
        if (this.f28938g) {
            C9065aw.m9301a("ContainerHolder is released.");
        } else if (abstractC9070a == null) {
            this.f28936e = null;
        } else {
            this.f28936e = new HandlerC9169b(abstractC9070a, this.f28932a);
            if (this.f28934c != null) {
                m9058g();
            }
        }
    }

    /* renamed from: a */
    public synchronized void m9064a(String str) {
        if (!this.f28938g) {
            this.f28933b.m9333i(str);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4500k
    /* renamed from: b */
    public synchronized void mo7804b() {
        if (this.f28938g) {
            C9065aw.m9301a("Releasing a released ContainerHolder.");
        } else {
            this.f28938g = true;
            this.f28939h.m8934b(this);
            this.f28933b.m9339e();
            this.f28933b = null;
            this.f28934c = null;
            this.f28937f = null;
            this.f28936e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m9063b(String str) {
        if (this.f28938g) {
            C9065aw.m9301a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        } else {
            this.f28937f.mo9025a(str);
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9069b
    /* renamed from: c */
    public synchronized C9020a mo9062c() {
        C9020a c9020a = null;
        synchronized (this) {
            if (this.f28938g) {
                C9065aw.m9301a("ContainerHolder is released.");
            } else {
                if (this.f28934c != null) {
                    this.f28933b = this.f28934c;
                    this.f28934c = null;
                }
                c9020a = this.f28933b;
            }
        }
        return c9020a;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9069b
    /* renamed from: d */
    public synchronized void mo9061d() {
        if (this.f28938g) {
            C9065aw.m9301a("Refreshing a released ContainerHolder.");
        } else {
            this.f28937f.mo9026a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m9060e() {
        if (this.f28938g) {
            C9065aw.m9301a("getContainerId called on a released ContainerHolder.");
            return "";
        }
        return this.f28933b.m9353a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public String m9059f() {
        if (this.f28938g) {
            C9065aw.m9301a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        }
        return this.f28937f.mo9024b();
    }
}
