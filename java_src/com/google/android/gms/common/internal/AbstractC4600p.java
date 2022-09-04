package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.BinderThread;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4488f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC4568af;
import com.google.android.gms.common.internal.AbstractC4571ag;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.google.android.gms.common.internal.p */
/* loaded from: classes.dex */
public abstract class AbstractC4600p<T extends IInterface> {

    /* renamed from: d */
    public static final String[] f17048d = {"service_esmobile", "service_googleme"};

    /* renamed from: a */
    private int f17049a;

    /* renamed from: b */
    final Handler f17050b;

    /* renamed from: c */
    protected AtomicInteger f17051c;

    /* renamed from: e */
    private long f17052e;

    /* renamed from: f */
    private long f17053f;

    /* renamed from: g */
    private int f17054g;

    /* renamed from: h */
    private long f17055h;

    /* renamed from: i */
    private final Context f17056i;

    /* renamed from: j */
    private final Looper f17057j;

    /* renamed from: k */
    private final AbstractC4643y f17058k;

    /* renamed from: l */
    private final C4648j f17059l;

    /* renamed from: m */
    private final Object f17060m;

    /* renamed from: n */
    private final Object f17061n;

    /* renamed from: o */
    private AbstractC4571ag f17062o;

    /* renamed from: p */
    private AbstractC4606f f17063p;

    /* renamed from: q */
    private T f17064q;

    /* renamed from: r */
    private final ArrayList<AbstractC4605e<?>> f17065r;

    /* renamed from: s */
    private ServiceConnectionC4608h f17066s;

    /* renamed from: t */
    private int f17067t;

    /* renamed from: u */
    private final AbstractC4602b f17068u;

    /* renamed from: v */
    private final AbstractC4603c f17069v;

    /* renamed from: w */
    private final int f17070w;

    /* renamed from: x */
    private final String f17071x;

    /* renamed from: com.google.android.gms.common.internal.p$a */
    /* loaded from: classes2.dex */
    private abstract class AbstractC4601a extends AbstractC4605e<Boolean> {

        /* renamed from: a */
        public final int f17072a;

        /* renamed from: b */
        public final Bundle f17073b;

        @BinderThread
        protected AbstractC4601a(int i, Bundle bundle) {
            super(true);
            this.f17072a = i;
            this.f17073b = bundle;
        }

        /* renamed from: a */
        protected abstract void mo23544a(ConnectionResult connectionResult);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4605e
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo23553a(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                AbstractC4600p.this.m23569b(1, null);
                return;
            }
            switch (this.f17072a) {
                case 0:
                    if (mo23545a()) {
                        return;
                    }
                    AbstractC4600p.this.m23569b(1, null);
                    mo23544a(new ConnectionResult(8, null));
                    return;
                case 10:
                    AbstractC4600p.this.m23569b(1, null);
                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                default:
                    AbstractC4600p.this.m23569b(1, null);
                    if (this.f17073b != null) {
                        pendingIntent = (PendingIntent) this.f17073b.getParcelable("pendingIntent");
                    }
                    mo23544a(new ConnectionResult(this.f17072a, pendingIntent));
                    return;
            }
        }

        /* renamed from: a */
        protected abstract boolean mo23545a();

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4605e
        /* renamed from: b */
        protected void mo23552b() {
        }
    }

    /* renamed from: com.google.android.gms.common.internal.p$b */
    /* loaded from: classes2.dex */
    public interface AbstractC4602b {
        /* renamed from: a */
        void mo10593a(int i);

        /* renamed from: a */
        void mo10591a(@Nullable Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.p$c */
    /* loaded from: classes2.dex */
    public interface AbstractC4603c {
        /* renamed from: a */
        void mo10590a(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.p$d */
    /* loaded from: classes2.dex */
    final class HandlerC4604d extends Handler {
        public HandlerC4604d(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private void m23555a(Message message) {
            AbstractC4605e abstractC4605e = (AbstractC4605e) message.obj;
            abstractC4605e.mo23552b();
            abstractC4605e.m23550d();
        }

        /* renamed from: b */
        private boolean m23554b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 5;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            PendingIntent pendingIntent = null;
            if (AbstractC4600p.this.f17051c.get() != message.arg1) {
                if (!m23554b(message)) {
                    return;
                }
                m23555a(message);
            } else if ((message.what == 1 || message.what == 5) && !AbstractC4600p.this.m23559u()) {
                m23555a(message);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
                AbstractC4600p.this.f17063p.mo17256a(connectionResult);
                AbstractC4600p.this.mo20196a(connectionResult);
            } else if (message.what == 4) {
                AbstractC4600p.this.m23569b(4, null);
                if (AbstractC4600p.this.f17068u != null) {
                    AbstractC4600p.this.f17068u.mo10593a(message.arg2);
                }
                AbstractC4600p.this.m23581a(message.arg2);
                AbstractC4600p.this.m23580a(4, 1, (int) null);
            } else if (message.what == 2 && !AbstractC4600p.this.m23560t()) {
                m23555a(message);
            } else if (m23554b(message)) {
                ((AbstractC4605e) message.obj).m23551c();
            } else {
                Log.wtf("GmsClient", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.p$e */
    /* loaded from: classes2.dex */
    public abstract class AbstractC4605e<TListener> {

        /* renamed from: a */
        private TListener f17076a;

        /* renamed from: b */
        private boolean f17077b = false;

        public AbstractC4605e(TListener tlistener) {
            this.f17076a = tlistener;
        }

        /* renamed from: a */
        protected abstract void mo23553a(TListener tlistener);

        /* renamed from: b */
        protected abstract void mo23552b();

        /* renamed from: c */
        public void m23551c() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f17076a;
                if (this.f17077b) {
                    String valueOf = String.valueOf(this);
                    Log.w("GmsClient", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.").toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo23553a(tlistener);
                } catch (RuntimeException e) {
                    mo23552b();
                    throw e;
                }
            } else {
                mo23552b();
            }
            synchronized (this) {
                this.f17077b = true;
            }
            m23550d();
        }

        /* renamed from: d */
        public void m23550d() {
            m23549e();
            synchronized (AbstractC4600p.this.f17065r) {
                AbstractC4600p.this.f17065r.remove(this);
            }
        }

        /* renamed from: e */
        public void m23549e() {
            synchronized (this) {
                this.f17076a = null;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.p$f */
    /* loaded from: classes2.dex */
    public interface AbstractC4606f {
        /* renamed from: a */
        void mo17256a(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.p$g */
    /* loaded from: classes2.dex */
    public static final class BinderC4607g extends AbstractC4568af.AbstractBinderC4569a {

        /* renamed from: a */
        private AbstractC4600p f17079a;

        /* renamed from: b */
        private final int f17080b;

        public BinderC4607g(@NonNull AbstractC4600p abstractC4600p, int i) {
            this.f17079a = abstractC4600p;
            this.f17080b = i;
        }

        /* renamed from: a */
        private void m23548a() {
            this.f17079a = null;
        }

        @Override // com.google.android.gms.common.internal.AbstractC4568af
        @BinderThread
        /* renamed from: a */
        public void mo23547a(int i, @Nullable Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.AbstractC4568af
        @BinderThread
        /* renamed from: a */
        public void mo23546a(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
            C4588d.m23626a(this.f17079a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f17079a.mo7981a(i, iBinder, bundle, this.f17080b);
            m23548a();
        }
    }

    /* renamed from: com.google.android.gms.common.internal.p$h */
    /* loaded from: classes2.dex */
    public final class ServiceConnectionC4608h implements ServiceConnection {

        /* renamed from: b */
        private final int f17082b;

        public ServiceConnectionC4608h(int i) {
            this.f17082b = i;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C4588d.m23626a(iBinder, "Expecting a valid IBinder");
            synchronized (AbstractC4600p.this.f17061n) {
                AbstractC4600p.this.f17062o = AbstractC4571ag.AbstractBinderC4572a.m23696a(iBinder);
            }
            AbstractC4600p.this.m23579a(0, (Bundle) null, this.f17082b);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (AbstractC4600p.this.f17061n) {
                AbstractC4600p.this.f17062o = null;
            }
            AbstractC4600p.this.f17050b.sendMessage(AbstractC4600p.this.f17050b.obtainMessage(4, this.f17082b, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.p$i */
    /* loaded from: classes2.dex */
    protected class C4609i implements AbstractC4606f {
        public C4609i() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4606f
        /* renamed from: a */
        public void mo17256a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.m24047b()) {
                AbstractC4600p.this.m23577a((AbstractC4559ac) null, AbstractC4600p.this.mo23424I());
            } else if (AbstractC4600p.this.f17069v == null) {
            } else {
                AbstractC4600p.this.f17069v.mo10590a(connectionResult);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.p$j */
    /* loaded from: classes2.dex */
    public final class C4610j extends AbstractC4601a {

        /* renamed from: e */
        public final IBinder f17084e;

        @BinderThread
        public C4610j(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f17084e = iBinder;
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4601a
        /* renamed from: a */
        protected void mo23544a(ConnectionResult connectionResult) {
            if (AbstractC4600p.this.f17069v != null) {
                AbstractC4600p.this.f17069v.mo10590a(connectionResult);
            }
            AbstractC4600p.this.mo20196a(connectionResult);
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4601a
        /* renamed from: a */
        protected boolean mo23545a() {
            try {
                String interfaceDescriptor = this.f17084e.getInterfaceDescriptor();
                if (!AbstractC4600p.this.mo7441b().equals(interfaceDescriptor)) {
                    String valueOf = String.valueOf(AbstractC4600p.this.mo7441b());
                    Log.e("GmsClient", new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(valueOf).append(" vs. ").append(interfaceDescriptor).toString());
                    return false;
                }
                IInterface mo7440b = AbstractC4600p.this.mo7440b(this.f17084e);
                if (mo7440b == null || !AbstractC4600p.this.m23580a(2, 3, (int) mo7440b)) {
                    return false;
                }
                Bundle mo17342g = AbstractC4600p.this.mo17342g();
                if (AbstractC4600p.this.f17068u != null) {
                    AbstractC4600p.this.f17068u.mo10591a(mo17342g);
                }
                return true;
            } catch (RemoteException e) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.p$k */
    /* loaded from: classes2.dex */
    public final class C4611k extends AbstractC4601a {
        @BinderThread
        public C4611k(int i, Bundle bundle) {
            super(i, bundle);
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4601a
        /* renamed from: a */
        protected void mo23544a(ConnectionResult connectionResult) {
            AbstractC4600p.this.f17063p.mo17256a(connectionResult);
            AbstractC4600p.this.mo20196a(connectionResult);
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4601a
        /* renamed from: a */
        protected boolean mo23545a() {
            AbstractC4600p.this.f17063p.mo17256a(ConnectionResult.f16764v);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4600p(Context context, Looper looper, int i, AbstractC4602b abstractC4602b, AbstractC4603c abstractC4603c, String str) {
        this(context, looper, AbstractC4643y.m23408a(context), C4648j.m23370b(), i, (AbstractC4602b) C4588d.m23627a(abstractC4602b), (AbstractC4603c) C4588d.m23627a(abstractC4603c), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4600p(Context context, Looper looper, AbstractC4643y abstractC4643y, C4648j c4648j, int i, AbstractC4602b abstractC4602b, AbstractC4603c abstractC4603c, String str) {
        this.f17060m = new Object();
        this.f17061n = new Object();
        this.f17065r = new ArrayList<>();
        this.f17067t = 1;
        this.f17051c = new AtomicInteger(0);
        this.f17056i = (Context) C4588d.m23626a(context, "Context must not be null");
        this.f17057j = (Looper) C4588d.m23626a(looper, "Looper must not be null");
        this.f17058k = (AbstractC4643y) C4588d.m23626a(abstractC4643y, "Supervisor must not be null");
        this.f17059l = (C4648j) C4588d.m23626a(c4648j, "API availability must not be null");
        this.f17050b = new HandlerC4604d(looper);
        this.f17070w = i;
        this.f17068u = abstractC4602b;
        this.f17069v = abstractC4603c;
        this.f17071x = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m23580a(int i, int i2, T t) {
        boolean z;
        synchronized (this.f17060m) {
            if (this.f17067t != i) {
                z = false;
            } else {
                m23569b(i2, t);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m23569b(int i, T t) {
        boolean z = true;
        if ((i == 3) != (t != null)) {
            z = false;
        }
        C4588d.m23619b(z);
        synchronized (this.f17060m) {
            this.f17067t = i;
            this.f17064q = t;
            mo23578a(i, (int) t);
            switch (i) {
                case 1:
                    m23562i();
                    break;
                case 2:
                    m23563h();
                    break;
                case 3:
                    mo20199a((AbstractC4600p<T>) t);
                    break;
            }
        }
    }

    /* renamed from: h */
    private void m23563h() {
        if (this.f17066s != null) {
            String valueOf = String.valueOf(mo7443a());
            String valueOf2 = String.valueOf(mo7942y());
            Log.e("GmsClient", new StringBuilder(String.valueOf(valueOf).length() + 70 + String.valueOf(valueOf2).length()).append("Calling connect() while still connected, missing disconnect() for ").append(valueOf).append(" on ").append(valueOf2).toString());
            this.f17058k.mo23400b(mo7443a(), mo7942y(), this.f17066s, m23557z());
            this.f17051c.incrementAndGet();
        }
        this.f17066s = new ServiceConnectionC4608h(this.f17051c.get());
        if (!this.f17058k.mo23404a(mo7443a(), mo7942y(), this.f17066s, m23557z())) {
            String valueOf3 = String.valueOf(mo7443a());
            String valueOf4 = String.valueOf(mo7942y());
            Log.e("GmsClient", new StringBuilder(String.valueOf(valueOf3).length() + 34 + String.valueOf(valueOf4).length()).append("unable to connect to service: ").append(valueOf3).append(" on ").append(valueOf4).toString());
            m23579a(16, (Bundle) null, this.f17051c.get());
        }
    }

    /* renamed from: i */
    private void m23562i() {
        if (this.f17066s != null) {
            this.f17058k.mo23400b(mo7443a(), mo7942y(), this.f17066s, m23557z());
            this.f17066s = null;
        }
    }

    /* renamed from: A */
    public void m23587A() {
        int mo23375a = this.f17059l.mo23375a(this.f17056i);
        if (mo23375a == 0) {
            mo7977a(new C4609i());
            return;
        }
        m23569b(1, null);
        this.f17063p = new C4609i();
        this.f17050b.sendMessage(this.f17050b.obtainMessage(3, this.f17051c.get(), mo23375a));
    }

    /* renamed from: B */
    public final Context m23586B() {
        return this.f17056i;
    }

    /* renamed from: C */
    public final Looper m23585C() {
        return this.f17057j;
    }

    /* renamed from: D */
    public Account mo23425D() {
        return null;
    }

    /* renamed from: E */
    public final Account m23584E() {
        return mo23425D() != null ? mo23425D() : new Account("<<default account>>", "com.google");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public final void m23583F() {
        if (!m23560t()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: G */
    public final T m23582G() {
        T t;
        synchronized (this.f17060m) {
            if (this.f17067t == 4) {
                throw new DeadObjectException();
            }
            m23583F();
            C4588d.m23622a(this.f17064q != null, "Client is connected but service is null");
            t = this.f17064q;
        }
        return t;
    }

    /* renamed from: H */
    public boolean mo15921H() {
        return false;
    }

    /* renamed from: I */
    protected Set<Scope> mo23424I() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    /* renamed from: a */
    protected abstract String mo7443a();

    @CallSuper
    /* renamed from: a */
    protected void m23581a(int i) {
        this.f17049a = i;
        this.f17052e = System.currentTimeMillis();
    }

    /* renamed from: a */
    protected void m23579a(int i, @Nullable Bundle bundle, int i2) {
        this.f17050b.sendMessage(this.f17050b.obtainMessage(5, i2, -1, new C4611k(i, bundle)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @BinderThread
    /* renamed from: a */
    public void mo7981a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f17050b.sendMessage(this.f17050b.obtainMessage(1, i2, -1, new C4610j(i, iBinder, bundle)));
    }

    /* renamed from: a */
    void mo23578a(int i, T t) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    /* renamed from: a */
    public void mo20199a(@NonNull T t) {
        this.f17053f = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    /* renamed from: a */
    public void mo20196a(ConnectionResult connectionResult) {
        this.f17054g = connectionResult.m24046c();
        this.f17055h = System.currentTimeMillis();
    }

    @WorkerThread
    /* renamed from: a */
    public void m23577a(AbstractC4559ac abstractC4559ac, Set<Scope> set) {
        try {
            GetServiceRequest m23735a = new GetServiceRequest(this.f17070w).m23732a(this.f17056i.getPackageName()).m23735a(mo9367c());
            if (set != null) {
                m23735a.m23731a(set);
            }
            if (mo9364v()) {
                m23735a.m23736a(m23584E()).m23733a(abstractC4559ac);
            } else if (mo15921H()) {
                m23735a.m23736a(mo23425D());
            }
            synchronized (this.f17061n) {
                if (this.f17062o != null) {
                    this.f17062o.mo23683a(new BinderC4607g(this, this.f17051c.get()), m23735a);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            m23570b(1);
        } catch (RemoteException e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        }
    }

    /* renamed from: a */
    public void mo7977a(@NonNull AbstractC4606f abstractC4606f) {
        this.f17063p = (AbstractC4606f) C4588d.m23626a(abstractC4606f, "Connection progress callbacks cannot be null.");
        m23569b(2, null);
    }

    /* renamed from: a */
    public void m23576a(AbstractC4606f abstractC4606f, ConnectionResult connectionResult) {
        this.f17063p = (AbstractC4606f) C4588d.m23626a(abstractC4606f, "Connection progress callbacks cannot be null.");
        this.f17050b.sendMessage(this.f17050b.obtainMessage(3, this.f17051c.get(), connectionResult.m24046c(), connectionResult.m24045d()));
    }

    /* renamed from: a */
    public void m23571a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        synchronized (this.f17060m) {
            i = this.f17067t;
            t = this.f17064q;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("CONNECTING");
                break;
            case 3:
                printWriter.print("CONNECTED");
                break;
            case 4:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.println("null");
        } else {
            printWriter.append((CharSequence) mo7441b()).append("@").println(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f17053f > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.f17053f;
            String valueOf = String.valueOf(simpleDateFormat.format(new Date(this.f17053f)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.f17052e > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            switch (this.f17049a) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append((CharSequence) String.valueOf(this.f17049a));
                    break;
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f17052e;
            String valueOf2 = String.valueOf(simpleDateFormat.format(new Date(this.f17052e)));
            append2.println(new StringBuilder(String.valueOf(valueOf2).length() + 21).append(j2).append(" ").append(valueOf2).toString());
        }
        if (this.f17055h > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C4488f.m23981b(this.f17054g));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f17055h;
            String valueOf3 = String.valueOf(simpleDateFormat.format(new Date(this.f17055h)));
            append3.println(new StringBuilder(String.valueOf(valueOf3).length() + 21).append(j3).append(" ").append(valueOf3).toString());
        }
    }

    @Nullable
    /* renamed from: b */
    protected abstract T mo7440b(IBinder iBinder);

    @NonNull
    /* renamed from: b */
    protected abstract String mo7441b();

    /* renamed from: b */
    public void m23570b(int i) {
        this.f17050b.sendMessage(this.f17050b.obtainMessage(4, this.f17051c.get(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public Bundle mo9367c() {
        return new Bundle();
    }

    /* renamed from: e */
    public Intent mo23565e() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: f */
    public void mo9828f() {
        this.f17051c.incrementAndGet();
        synchronized (this.f17065r) {
            int size = this.f17065r.size();
            for (int i = 0; i < size; i++) {
                this.f17065r.get(i).m23549e();
            }
            this.f17065r.clear();
        }
        synchronized (this.f17061n) {
            this.f17062o = null;
        }
        m23569b(1, null);
    }

    /* renamed from: g */
    public Bundle mo17342g() {
        return null;
    }

    /* renamed from: m_ */
    public boolean mo23561m_() {
        return false;
    }

    /* renamed from: t */
    public boolean m23560t() {
        boolean z;
        synchronized (this.f17060m) {
            z = this.f17067t == 3;
        }
        return z;
    }

    /* renamed from: u */
    public boolean m23559u() {
        boolean z;
        synchronized (this.f17060m) {
            z = this.f17067t == 2;
        }
        return z;
    }

    /* renamed from: v */
    public boolean mo9364v() {
        return false;
    }

    /* renamed from: w */
    public boolean mo7943w() {
        return true;
    }

    @Nullable
    /* renamed from: x */
    public IBinder m23558x() {
        IBinder asBinder;
        synchronized (this.f17061n) {
            asBinder = this.f17062o == null ? null : this.f17062o.asBinder();
        }
        return asBinder;
    }

    /* renamed from: y */
    protected String mo7942y() {
        return "com.google.android.gms";
    }

    @Nullable
    /* renamed from: z */
    protected final String m23557z() {
        return this.f17071x == null ? this.f17056i.getClass().getName() : this.f17071x;
    }
}
