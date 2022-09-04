package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.C4515b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.AbstractC4510u;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.C4507r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.common.internal.C4593i;
import com.google.android.gms.common.util.C4678a;
import com.google.android.gms.internal.ahg;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.aix;
import com.google.android.gms.p239g.C5286g;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class aic implements Handler.Callback {

    /* renamed from: d */
    private static final Object f21888d = new Object();

    /* renamed from: e */
    private static aic f21889e;

    /* renamed from: a */
    private long f21890a;

    /* renamed from: b */
    private long f21891b;

    /* renamed from: c */
    private long f21892c;

    /* renamed from: f */
    private final Context f21893f;

    /* renamed from: g */
    private final C4515b f21894g;

    /* renamed from: h */
    private int f21895h;

    /* renamed from: i */
    private final AtomicInteger f21896i;

    /* renamed from: j */
    private final SparseArray<C6377c<?>> f21897j;

    /* renamed from: k */
    private final Map<ahh<?>, C6377c<?>> f21898k;

    /* renamed from: l */
    private ahr f21899l;

    /* renamed from: m */
    private final Set<ahh<?>> f21900m;

    /* renamed from: n */
    private final Handler f21901n;

    /* renamed from: o */
    private final ReferenceQueue<AbstractC4510u<?>> f21902o;

    /* renamed from: p */
    private final SparseArray<C6375a> f21903p;

    /* renamed from: q */
    private C6376b f21904q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.aic$a */
    /* loaded from: classes2.dex */
    public final class C6375a extends PhantomReference<AbstractC4510u<?>> {

        /* renamed from: b */
        private final int f21906b;

        public C6375a(AbstractC4510u abstractC4510u, int i, ReferenceQueue<AbstractC4510u<?>> referenceQueue) {
            super(abstractC4510u, referenceQueue);
            this.f21906b = i;
        }

        /* renamed from: a */
        public void m17289a() {
            aic.this.f21901n.sendMessage(aic.this.f21901n.obtainMessage(2, this.f21906b, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.aic$b */
    /* loaded from: classes2.dex */
    public static final class C6376b extends Thread {

        /* renamed from: a */
        private final ReferenceQueue<AbstractC4510u<?>> f21907a;

        /* renamed from: b */
        private final SparseArray<C6375a> f21908b;

        /* renamed from: c */
        private final AtomicBoolean f21909c = new AtomicBoolean();

        public C6376b(ReferenceQueue<AbstractC4510u<?>> referenceQueue, SparseArray<C6375a> sparseArray) {
            super("GoogleApiCleanup");
            this.f21907a = referenceQueue;
            this.f21908b = sparseArray;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f21909c.set(true);
            Process.setThreadPriority(10);
            while (this.f21909c.get()) {
                try {
                    C6375a c6375a = (C6375a) this.f21907a.remove();
                    this.f21908b.remove(c6375a.f21906b);
                    c6375a.m17289a();
                } catch (InterruptedException e) {
                    return;
                } finally {
                    this.f21909c.set(false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.aic$c */
    /* loaded from: classes2.dex */
    public class C6377c<O extends C4467a.AbstractC4468a> implements AbstractC4489g.AbstractC4491b, AbstractC4489g.AbstractC4492c, ahp {

        /* renamed from: e */
        private final C4467a.AbstractC4477f f21912e;

        /* renamed from: f */
        private final C4467a.AbstractC4474c f21913f;

        /* renamed from: g */
        private final ahh<O> f21914g;

        /* renamed from: k */
        private boolean f21918k;

        /* renamed from: d */
        private final Queue<ahg> f21911d = new LinkedList();

        /* renamed from: h */
        private final SparseArray<aix> f21915h = new SparseArray<>();

        /* renamed from: i */
        private final Set<ahk> f21916i = new HashSet();

        /* renamed from: j */
        private final SparseArray<Map<ail.C6385b<?>, aiq>> f21917j = new SparseArray<>();

        /* renamed from: l */
        private ConnectionResult f21919l = null;

        @WorkerThread
        public C6377c(AbstractC4510u<O> abstractC4510u) {
            this.f21912e = abstractC4510u.m23939a(aic.this.f21901n.getLooper(), this, this);
            if (this.f21912e instanceof C4593i) {
                this.f21913f = ((C4593i) this.f21912e).m23603h();
            } else {
                this.f21913f = this.f21912e;
            }
            this.f21914g = abstractC4510u.m23931e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @WorkerThread
        /* renamed from: a */
        public void m17278a(Status status) {
            for (ahg ahgVar : this.f21911d) {
                ahgVar.mo17491a(status);
            }
            this.f21911d.clear();
        }

        @WorkerThread
        /* renamed from: b */
        private void m17271b(ConnectionResult connectionResult) {
            for (ahk ahkVar : this.f21916i) {
                ahkVar.m17480a((ahh<?>) this.f21914g, connectionResult);
            }
            this.f21916i.clear();
        }

        @WorkerThread
        /* renamed from: b */
        private void m17270b(ahg ahgVar) {
            ahgVar.mo17492a(this.f21915h);
            try {
                ahgVar.mo17494a(this.f21913f);
            } catch (DeadObjectException e) {
                this.f21912e.mo9828f();
                mo17285a(1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @WorkerThread
        /* renamed from: e */
        public void m17263e() {
            if (this.f21918k) {
                m17257j();
            }
        }

        @WorkerThread
        /* renamed from: f */
        private void m17261f() {
            if (this.f21918k) {
                aic.this.f21901n.removeMessages(10, this.f21914g);
                aic.this.f21901n.removeMessages(9, this.f21914g);
                this.f21918k = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @WorkerThread
        /* renamed from: g */
        public void m17260g() {
            if (this.f21918k) {
                m17261f();
                m17278a(aic.this.f21894g.mo23375a(aic.this.f21893f) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f21912e.mo9828f();
            }
        }

        /* renamed from: h */
        private void m17259h() {
            aic.this.f21901n.removeMessages(11, this.f21914g);
            aic.this.f21901n.sendMessageDelayed(aic.this.f21901n.obtainMessage(11, this.f21914g), aic.this.f21892c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public void m17258i() {
            if (!this.f21912e.m24004t() || this.f21917j.size() != 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f21915h.size()) {
                    this.f21912e.mo9828f();
                    return;
                } else if (this.f21915h.get(this.f21915h.keyAt(i2)).m17167c()) {
                    m17259h();
                    return;
                } else {
                    i = i2 + 1;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @WorkerThread
        /* renamed from: j */
        public void m17257j() {
            if (this.f21912e.m24004t() || this.f21912e.m24003u()) {
                return;
            }
            if (this.f21912e.mo7943w() && aic.this.f21895h != 0) {
                aic.this.f21895h = aic.this.f21894g.mo23375a(aic.this.f21893f);
                if (aic.this.f21895h != 0) {
                    mo17280a(new ConnectionResult(aic.this.f21895h, null));
                    return;
                }
            }
            this.f21912e.mo7977a(new C6379d(this.f21912e, this.f21914g));
        }

        @WorkerThread
        /* renamed from: a */
        public void m17286a() {
            while (this.f21912e.m24004t() && !this.f21911d.isEmpty()) {
                m17270b(this.f21911d.remove());
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
        @WorkerThread
        /* renamed from: a */
        public void mo17285a(int i) {
            m17273b();
            this.f21918k = true;
            aic.this.f21901n.sendMessageDelayed(Message.obtain(aic.this.f21901n, 9, this.f21914g), aic.this.f21890a);
            aic.this.f21901n.sendMessageDelayed(Message.obtain(aic.this.f21901n, 10, this.f21914g), aic.this.f21891b);
            aic.this.f21895h = -1;
        }

        @WorkerThread
        /* renamed from: a */
        public void m17284a(int i, @NonNull ail.C6385b<?> c6385b, @NonNull C5286g<Void> c5286g) {
            Map<ail.C6385b<?>, aiq> map = this.f21917j.get(i);
            if (map != null && map.get(c6385b) != null) {
                m17277a(new ahg.C6341e(i, map.get(c6385b).f21951b, c5286g, this.f21917j));
                return;
            }
            c5286g.m20831a(new C4507r(Status.f16788c));
            Log.wtf("GoogleApiManager", "Received call to unregister a listener without a matching registration call.", new Exception());
        }

        @WorkerThread
        /* renamed from: a */
        public void m17283a(int i, @NonNull aiq aiqVar, @NonNull C5286g<Void> c5286g) {
            m17277a(new ahg.C6339c(i, aiqVar, c5286g, this.f21917j));
        }

        @WorkerThread
        /* renamed from: a */
        public void m17282a(int i, boolean z) {
            Iterator<ahg> it2 = this.f21911d.iterator();
            while (it2.hasNext()) {
                ahg next = it2.next();
                if (next.f21716a == i && next.f21717b != 1 && next.mo17493a()) {
                    it2.remove();
                }
            }
            this.f21915h.get(i).m17175a();
            this.f21917j.delete(i);
            if (!z) {
                this.f21915h.remove(i);
                aic.this.f21903p.remove(i);
                if (this.f21915h.size() != 0 || !this.f21911d.isEmpty()) {
                    return;
                }
                m17261f();
                this.f21912e.mo9828f();
                aic.this.f21898k.remove(this.f21914g);
                synchronized (aic.f21888d) {
                    aic.this.f21900m.remove(this.f21914g);
                }
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
        @WorkerThread
        /* renamed from: a */
        public void mo17281a(@Nullable Bundle bundle) {
            m17273b();
            m17271b(ConnectionResult.f16764v);
            m17261f();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f21917j.size()) {
                    m17286a();
                    m17259h();
                    return;
                }
                for (aiq aiqVar : this.f21917j.get(this.f21917j.keyAt(i2)).values()) {
                    try {
                        aiqVar.f21950a.m17199a(this.f21913f, new C5286g<>());
                    } catch (DeadObjectException e) {
                        this.f21912e.mo9828f();
                        mo17285a(1);
                    }
                }
                i = i2 + 1;
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4492c
        @WorkerThread
        /* renamed from: a */
        public void mo17280a(@NonNull ConnectionResult connectionResult) {
            m17273b();
            aic.this.f21895h = -1;
            m17271b(connectionResult);
            int keyAt = this.f21915h.keyAt(0);
            if (this.f21911d.isEmpty()) {
                this.f21919l = connectionResult;
                return;
            }
            synchronized (aic.f21888d) {
                if (aic.m17297d(aic.this) != null && aic.this.f21900m.contains(this.f21914g)) {
                    aic.m17297d(aic.this).b(connectionResult, keyAt);
                } else if (!aic.this.m17314a(connectionResult, keyAt)) {
                    if (connectionResult.m24046c() == 18) {
                        this.f21918k = true;
                    }
                    if (this.f21918k) {
                        aic.this.f21901n.sendMessageDelayed(Message.obtain(aic.this.f21901n, 9, this.f21914g), aic.this.f21890a);
                    } else {
                        String valueOf = String.valueOf(this.f21914g.m17489a());
                        m17278a(new Status(17, new StringBuilder(String.valueOf(valueOf).length() + 38).append("API: ").append(valueOf).append(" is not available on this device.").toString()));
                    }
                }
            }
        }

        @Override // com.google.android.gms.internal.ahp
        /* renamed from: a */
        public void mo17279a(ConnectionResult connectionResult, C4467a<?> c4467a, int i) {
            mo17280a(connectionResult);
        }

        @WorkerThread
        /* renamed from: a */
        public void m17277a(ahg ahgVar) {
            if (this.f21912e.m24004t()) {
                m17270b(ahgVar);
                m17259h();
                return;
            }
            this.f21911d.add(ahgVar);
            if (this.f21919l == null || !this.f21919l.m24050a()) {
                m17257j();
            } else {
                mo17280a(this.f21919l);
            }
        }

        @WorkerThread
        /* renamed from: a */
        public void m17276a(ahk ahkVar) {
            this.f21916i.add(ahkVar);
        }

        @WorkerThread
        /* renamed from: b */
        public void m17273b() {
            this.f21919l = null;
        }

        @WorkerThread
        /* renamed from: b */
        public void m17272b(int i) {
            this.f21915h.put(i, new aix(this.f21912e));
        }

        /* renamed from: c */
        ConnectionResult m17268c() {
            return this.f21919l;
        }

        @WorkerThread
        /* renamed from: c */
        public void m17267c(final int i) {
            this.f21915h.get(i).m17172a(new aix.AbstractC6392c() { // from class: com.google.android.gms.internal.aic.c.1
                @Override // com.google.android.gms.internal.aix.AbstractC6392c
                /* renamed from: a */
                public void mo17164a() {
                    if (C6377c.this.f21911d.isEmpty()) {
                        C6377c.this.m17282a(i, false);
                    }
                }
            });
        }

        /* renamed from: d */
        boolean m17265d() {
            return this.f21912e.m24004t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.aic$d */
    /* loaded from: classes2.dex */
    public class C6379d implements AbstractC4600p.AbstractC4606f {

        /* renamed from: b */
        private final C4467a.AbstractC4477f f21923b;

        /* renamed from: c */
        private final ahh<?> f21924c;

        public C6379d(C4467a.AbstractC4477f abstractC4477f, ahh<?> ahhVar) {
            this.f21923b = abstractC4477f;
            this.f21924c = ahhVar;
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4606f
        @WorkerThread
        /* renamed from: a */
        public void mo17256a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.m24047b()) {
                this.f21923b.m24006a(null, Collections.emptySet());
            } else {
                ((C6377c) aic.this.f21898k.get(this.f21924c)).mo17280a(connectionResult);
            }
        }
    }

    private aic(Context context) {
        this(context, C4515b.m23920a());
    }

    private aic(Context context, C4515b c4515b) {
        this.f21890a = 5000L;
        this.f21891b = 120000L;
        this.f21892c = 10000L;
        this.f21895h = -1;
        this.f21896i = new AtomicInteger(1);
        this.f21897j = new SparseArray<>();
        this.f21898k = new ConcurrentHashMap(5, 0.75f, 1);
        this.f21899l = null;
        this.f21900m = new C4678a();
        this.f21902o = new ReferenceQueue<>();
        this.f21903p = new SparseArray<>();
        this.f21893f = context;
        HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
        handlerThread.start();
        this.f21901n = new Handler(handlerThread.getLooper(), this);
        this.f21894g = c4515b;
    }

    /* renamed from: a */
    private int m17313a(AbstractC4510u<?> abstractC4510u) {
        int andIncrement = this.f21896i.getAndIncrement();
        this.f21901n.sendMessage(this.f21901n.obtainMessage(6, andIncrement, 0, abstractC4510u));
        return andIncrement;
    }

    /* renamed from: a */
    public static Pair<aic, Integer> m17315a(Context context, AbstractC4510u<?> abstractC4510u) {
        Pair<aic, Integer> create;
        synchronized (f21888d) {
            if (f21889e == null) {
                f21889e = new aic(context.getApplicationContext());
            }
            create = Pair.create(f21889e, Integer.valueOf(f21889e.m17313a(abstractC4510u)));
        }
        return create;
    }

    /* renamed from: a */
    public static aic m17320a() {
        aic aicVar;
        synchronized (f21888d) {
            aicVar = f21889e;
        }
        return aicVar;
    }

    @WorkerThread
    /* renamed from: a */
    private void m17319a(int i) {
        C6377c<?> c6377c = this.f21897j.get(i);
        if (c6377c == null) {
            Log.wtf("GoogleApiManager", new StringBuilder(64).append("onCleanupLeakInternal received for unknown instance: ").append(i).toString(), new Exception());
            return;
        }
        this.f21897j.delete(i);
        c6377c.m17267c(i);
    }

    @WorkerThread
    /* renamed from: a */
    private void m17318a(int i, ail.C6385b<?> c6385b, C5286g<Void> c5286g) {
        this.f21897j.get(i).m17284a(i, c6385b, c5286g);
    }

    @WorkerThread
    /* renamed from: a */
    private void m17317a(int i, aiq aiqVar, C5286g<Void> c5286g) {
        this.f21897j.get(i).m17283a(i, aiqVar, c5286g);
    }

    @WorkerThread
    /* renamed from: a */
    private void m17312a(AbstractC4510u<?> abstractC4510u, int i) {
        ahh<?> m23931e = abstractC4510u.m23931e();
        if (!this.f21898k.containsKey(m23931e)) {
            this.f21898k.put(m23931e, new C6377c<>(abstractC4510u));
        }
        C6377c<?> c6377c = this.f21898k.get(m23931e);
        c6377c.m17272b(i);
        this.f21897j.put(i, c6377c);
        c6377c.m17257j();
        this.f21903p.put(i, new C6375a(abstractC4510u, i, this.f21902o));
        if (this.f21904q == null || !this.f21904q.f21909c.get()) {
            this.f21904q = new C6376b(this.f21902o, this.f21903p);
            this.f21904q.start();
        }
    }

    @WorkerThread
    /* renamed from: a */
    private void m17309a(ahg ahgVar) {
        this.f21897j.get(ahgVar.f21716a).m17277a(ahgVar);
    }

    @WorkerThread
    /* renamed from: b */
    private void m17303b(int i, boolean z) {
        C6377c<?> c6377c = this.f21897j.get(i);
        if (c6377c == null) {
            Log.wtf("GoogleApiManager", new StringBuilder(52).append("onRelease received for unknown instance: ").append(i).toString(), new Exception());
            return;
        }
        if (!z) {
            this.f21897j.delete(i);
        }
        c6377c.m17282a(i, z);
    }

    /* renamed from: d */
    static /* synthetic */ ahr m17297d(aic aicVar) {
        return null;
    }

    @WorkerThread
    /* renamed from: d */
    private void m17298d() {
        for (C6377c<?> c6377c : this.f21898k.values()) {
            c6377c.m17273b();
            c6377c.m17257j();
        }
    }

    /* renamed from: a */
    public void m17316a(int i, boolean z) {
        this.f21901n.sendMessage(this.f21901n.obtainMessage(8, i, z ? 1 : 2));
    }

    /* renamed from: a */
    public <O extends C4467a.AbstractC4468a> void m17311a(AbstractC4510u<O> abstractC4510u, int i, ahl.AbstractC6343a<? extends AbstractC4502m, C4467a.AbstractC4474c> abstractC6343a) {
        this.f21901n.sendMessage(this.f21901n.obtainMessage(4, new ahg.C6338b(abstractC4510u.m23930f(), i, abstractC6343a)));
    }

    /* renamed from: a */
    public <O extends C4467a.AbstractC4468a, TResult> void m17310a(AbstractC4510u<O> abstractC4510u, int i, aiv<C4467a.AbstractC4474c, TResult> aivVar, C5286g<TResult> c5286g) {
        this.f21901n.sendMessage(this.f21901n.obtainMessage(4, new ahg.C6340d(abstractC4510u.m23930f(), i, aivVar, c5286g)));
    }

    @WorkerThread
    /* renamed from: a */
    public void m17308a(ahk ahkVar) {
        for (ahh<?> ahhVar : ahkVar.m17479b()) {
            C6377c<?> c6377c = this.f21898k.get(ahhVar);
            if (c6377c == null) {
                ahkVar.a();
                return;
            } else if (c6377c.m17265d()) {
                ahkVar.m17480a(ahhVar, ConnectionResult.f16764v);
            } else if (c6377c.m17268c() != null) {
                ahkVar.m17480a(ahhVar, c6377c.m17268c());
            } else {
                c6377c.m17276a(ahkVar);
            }
        }
    }

    /* renamed from: a */
    public void m17307a(ahr ahrVar) {
        synchronized (f21888d) {
            if (ahrVar == null) {
                this.f21899l = null;
                this.f21900m.clear();
            }
        }
    }

    /* renamed from: a */
    boolean m17314a(ConnectionResult connectionResult, int i) {
        if (connectionResult.m24050a() || this.f21894g.mo23376a(connectionResult.m24046c())) {
            this.f21894g.m23910a(this.f21893f, connectionResult, i);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m17304b() {
        this.f21901n.sendMessage(this.f21901n.obtainMessage(3));
    }

    /* renamed from: b */
    public void m17302b(ConnectionResult connectionResult, int i) {
        if (!m17314a(connectionResult, i)) {
            this.f21901n.sendMessage(this.f21901n.obtainMessage(5, i, 0));
        }
    }

    @Override // android.os.Handler.Callback
    @WorkerThread
    public boolean handleMessage(Message message) {
        boolean z = false;
        switch (message.what) {
            case 1:
                m17308a((ahk) message.obj);
                break;
            case 2:
                m17319a(message.arg1);
                break;
            case 3:
                m17298d();
                break;
            case 4:
                m17309a((ahg) message.obj);
                break;
            case 5:
                if (this.f21897j.get(message.arg1) != null) {
                    this.f21897j.get(message.arg1).m17278a(new Status(17, "Error resolution was canceled by the user."));
                    break;
                }
                break;
            case 6:
                m17312a((AbstractC4510u) message.obj, message.arg1);
                break;
            case 7:
                Pair pair = (Pair) message.obj;
                m17317a(message.arg1, (aiq) pair.first, (C5286g) pair.second);
                break;
            case 8:
                int i = message.arg1;
                if (message.arg2 == 1) {
                    z = true;
                }
                m17303b(i, z);
                break;
            case 9:
                if (this.f21898k.containsKey(message.obj)) {
                    this.f21898k.get(message.obj).m17263e();
                    break;
                }
                break;
            case 10:
                if (this.f21898k.containsKey(message.obj)) {
                    this.f21898k.get(message.obj).m17260g();
                    break;
                }
                break;
            case 11:
                if (this.f21898k.containsKey(message.obj)) {
                    this.f21898k.get(message.obj).m17258i();
                    break;
                }
                break;
            case 12:
                Pair pair2 = (Pair) message.obj;
                m17318a(message.arg1, (ail.C6385b) pair2.first, (C5286g) pair2.second);
                break;
            default:
                Log.w("GoogleApiManager", new StringBuilder(31).append("Unknown message id: ").append(message.what).toString());
                return false;
        }
        return true;
    }
}
