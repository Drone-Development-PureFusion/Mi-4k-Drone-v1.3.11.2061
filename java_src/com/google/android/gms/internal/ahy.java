package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.p001v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.C4073j;
import com.google.android.gms.common.C4515b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.AbstractC4503n;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.common.internal.C4641x;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aig;
import com.google.android.gms.internal.aix;
import com.google.android.gms.internal.zzqv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
/* loaded from: classes2.dex */
public final class ahy extends AbstractC4489g implements aig.AbstractC6382a {

    /* renamed from: d */
    zzqv f21835d;

    /* renamed from: e */
    final Map<C4467a.C4475d<?>, C4467a.AbstractC4477f> f21836e;

    /* renamed from: g */
    final C4626s f21838g;

    /* renamed from: h */
    final Map<C4467a<?>, Integer> f21839h;

    /* renamed from: i */
    final C4467a.AbstractC4473b<? extends aok, aom> f21840i;

    /* renamed from: k */
    final aix f21842k;

    /* renamed from: l */
    private final Lock f21843l;

    /* renamed from: m */
    private final C4641x f21844m;

    /* renamed from: o */
    private final int f21846o;

    /* renamed from: p */
    private final Context f21847p;

    /* renamed from: q */
    private final Looper f21848q;

    /* renamed from: r */
    private volatile boolean f21849r;

    /* renamed from: u */
    private final HandlerC6370a f21852u;

    /* renamed from: v */
    private final C4515b f21853v;

    /* renamed from: x */
    private final ArrayList<aho> f21855x;

    /* renamed from: y */
    private Integer f21856y;

    /* renamed from: n */
    private aig f21845n = null;

    /* renamed from: c */
    final Queue<ahl.AbstractC6343a<?, ?>> f21834c = new LinkedList();

    /* renamed from: s */
    private long f21850s = 120000;

    /* renamed from: t */
    private long f21851t = 5000;

    /* renamed from: f */
    Set<Scope> f21837f = new HashSet();

    /* renamed from: w */
    private final aim f21854w = new aim();

    /* renamed from: j */
    Set<aiw> f21841j = null;

    /* renamed from: z */
    private final C4641x.AbstractC4642a f21857z = new C4641x.AbstractC4642a() { // from class: com.google.android.gms.internal.ahy.1
        @Override // com.google.android.gms.common.internal.C4641x.AbstractC4642a
        /* renamed from: g */
        public Bundle mo17342g() {
            return null;
        }

        @Override // com.google.android.gms.common.internal.C4641x.AbstractC4642a
        /* renamed from: t */
        public boolean mo17341t() {
            return ahy.this.mo17353j();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ahy$a */
    /* loaded from: classes2.dex */
    public final class HandlerC6370a extends Handler {
        HandlerC6370a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    ahy.this.m17343u();
                    return;
                case 2:
                    ahy.this.m17344t();
                    return;
                default:
                    Log.w("GoogleApiClientImpl", new StringBuilder(31).append("Unknown message id: ").append(message.what).toString());
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ahy$b */
    /* loaded from: classes2.dex */
    public static class C6371b extends zzqv.AbstractC8149a {

        /* renamed from: a */
        private WeakReference<ahy> f21869a;

        C6371b(ahy ahyVar) {
            this.f21869a = new WeakReference<>(ahyVar);
        }

        @Override // com.google.android.gms.internal.zzqv.AbstractC8149a
        /* renamed from: a */
        public void mo12692a() {
            ahy ahyVar = this.f21869a.get();
            if (ahyVar == null) {
                return;
            }
            ahyVar.m17344t();
        }
    }

    public ahy(Context context, Lock lock, Looper looper, C4626s c4626s, C4515b c4515b, C4467a.AbstractC4473b<? extends aok, aom> abstractC4473b, Map<C4467a<?>, Integer> map, List<AbstractC4489g.AbstractC4491b> list, List<AbstractC4489g.AbstractC4492c> list2, Map<C4467a.C4475d<?>, C4467a.AbstractC4477f> map2, int i, int i2, ArrayList<aho> arrayList) {
        this.f21856y = null;
        this.f21847p = context;
        this.f21843l = lock;
        this.f21844m = new C4641x(looper, this.f21857z);
        this.f21848q = looper;
        this.f21852u = new HandlerC6370a(looper);
        this.f21853v = c4515b;
        this.f21846o = i;
        if (this.f21846o >= 0) {
            this.f21856y = Integer.valueOf(i2);
        }
        this.f21839h = map;
        this.f21836e = map2;
        this.f21855x = arrayList;
        this.f21842k = new aix(this.f21836e);
        for (AbstractC4489g.AbstractC4491b abstractC4491b : list) {
            this.f21844m.m23415a(abstractC4491b);
        }
        for (AbstractC4489g.AbstractC4492c abstractC4492c : list2) {
            this.f21844m.m23414a(abstractC4492c);
        }
        this.f21838g = c4626s;
        this.f21840i = abstractC4473b;
    }

    /* renamed from: a */
    public static int m17374a(Iterable<C4467a.AbstractC4477f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C4467a.AbstractC4477f abstractC4477f : iterable) {
            if (abstractC4477f.mo9364v()) {
                z3 = true;
            }
            z2 = abstractC4477f.mo23561m_() ? true : z2;
        }
        if (z3) {
            return (!z2 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m17379a(final AbstractC4489g abstractC4489g, final aiu aiuVar, final boolean z) {
        ajd.f22007c.mo17135a(abstractC4489g).mo13673a(new AbstractC4503n<Status>() { // from class: com.google.android.gms.internal.ahy.4
            @Override // com.google.android.gms.common.api.AbstractC4503n
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7161a(@NonNull Status status) {
                C4073j.m25582a(ahy.this.f21847p).m25574c();
                if (status.m24018f() && ahy.this.mo17353j()) {
                    ahy.this.mo17355h();
                }
                aiuVar.b((aiu) status);
                if (z) {
                    abstractC4489g.mo17356g();
                }
            }
        });
    }

    /* renamed from: a */
    private void m17376a(@NonNull aih aihVar) {
        if (this.f21846o >= 0) {
            ahj.m17485a(aihVar).m17487a(this.f21846o);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    /* renamed from: b */
    static String m17371b(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    private void m17364c(int i) {
        if (this.f21856y == null) {
            this.f21856y = Integer.valueOf(i);
        } else if (this.f21856y.intValue() != i) {
            String valueOf = String.valueOf(m17371b(i));
            String valueOf2 = String.valueOf(m17371b(this.f21856y.intValue()));
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(valueOf2).length()).append("Cannot use sign-in mode: ").append(valueOf).append(". Mode was already set to ").append(valueOf2).toString());
        }
        if (this.f21845n != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (C4467a.AbstractC4477f abstractC4477f : this.f21836e.values()) {
            if (abstractC4477f.mo9364v()) {
                z2 = true;
            }
            z = abstractC4477f.mo23561m_() ? true : z;
        }
        switch (this.f21856y.intValue()) {
            case 1:
                if (!z2) {
                    throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                }
                if (z) {
                    throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
                break;
            case 2:
                if (z2) {
                    this.f21845n = ahq.m17447a(this.f21847p, this, this.f21843l, this.f21848q, this.f21853v, this.f21836e, this.f21838g, this.f21839h, this.f21840i, this.f21855x);
                    return;
                }
                break;
        }
        this.f21845n = new aia(this.f21847p, this, this.f21843l, this.f21848q, this.f21853v, this.f21836e, this.f21838g, this.f21839h, this.f21840i, this.f21855x, this);
    }

    /* renamed from: s */
    private void m17345s() {
        this.f21844m.m23413b();
        this.f21845n.mo17243a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m17344t() {
        this.f21843l.lock();
        try {
            if (m17351m()) {
                m17345s();
            }
        } finally {
            this.f21843l.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m17343u() {
        this.f21843l.lock();
        try {
            if (m17349o()) {
                m17345s();
            }
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public ConnectionResult mo17385a(long j, @NonNull TimeUnit timeUnit) {
        boolean z = false;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        }
        C4588d.m23622a(z, "blockingConnect must not be called on the UI thread");
        C4588d.m23626a(timeUnit, "TimeUnit must not be null");
        this.f21843l.lock();
        try {
            if (this.f21856y == null) {
                this.f21856y = Integer.valueOf(m17374a((Iterable<C4467a.AbstractC4477f>) this.f21836e.values(), false));
            } else if (this.f21856y.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m17364c(this.f21856y.intValue());
            this.f21844m.m23413b();
            return this.f21845n.mo17242a(j, timeUnit);
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    @NonNull
    /* renamed from: a */
    public <C extends C4467a.AbstractC4477f> C mo17383a(@NonNull C4467a.C4475d<C> c4475d) {
        C c = (C) this.f21836e.get(c4475d);
        C4588d.m23626a(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public <A extends C4467a.AbstractC4474c, R extends AbstractC4502m, T extends ahl.AbstractC6343a<R, A>> T mo17255a(@NonNull T t) {
        C4588d.m23618b(t.m17475g() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f21836e.containsKey(t.m17475g());
        String m24007f = t.m17474h() != null ? t.m17474h().m24007f() : "the API";
        C4588d.m23618b(containsKey, new StringBuilder(String.valueOf(m24007f).length() + 65).append("GoogleApiClient is not configured to use ").append(m24007f).append(" required for this call.").toString());
        this.f21843l.lock();
        try {
            if (this.f21845n == null) {
                this.f21834c.add(t);
            } else {
                t = (T) this.f21845n.mo17240a((aig) t);
            }
            return t;
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public <L> ail<L> mo17373a(@NonNull L l) {
        this.f21843l.lock();
        try {
            return this.f21854w.m17210a(l, this.f21848q);
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public void mo17386a(int i) {
        boolean z = true;
        this.f21843l.lock();
        if (i != 3 && i != 1 && i != 2) {
            z = false;
        }
        try {
            C4588d.m23618b(z, new StringBuilder(33).append("Illegal sign-in mode: ").append(i).toString());
            m17364c(i);
            m17345s();
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.internal.aig.AbstractC6382a
    /* renamed from: a */
    public void mo17230a(int i, boolean z) {
        if (i == 1 && !z) {
            m17350n();
        }
        this.f21842k.m17169b();
        this.f21844m.m23418a(i);
        this.f21844m.m23419a();
        if (i == 2) {
            m17345s();
        }
    }

    @Override // com.google.android.gms.internal.aig.AbstractC6382a
    /* renamed from: a */
    public void mo17229a(Bundle bundle) {
        while (!this.f21834c.isEmpty()) {
            mo17253b((ahy) this.f21834c.remove());
        }
        this.f21844m.m23417a(bundle);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public void mo17384a(@NonNull FragmentActivity fragmentActivity) {
        m17376a(new aih(fragmentActivity));
    }

    @Override // com.google.android.gms.internal.aig.AbstractC6382a
    /* renamed from: a */
    public void mo17228a(ConnectionResult connectionResult) {
        if (!this.f21853v.mo23367b(this.f21847p, connectionResult.m24046c())) {
            m17349o();
        }
        if (!m17351m()) {
            this.f21844m.m23416a(connectionResult);
            this.f21844m.m23419a();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public void mo17381a(@NonNull AbstractC4489g.AbstractC4491b abstractC4491b) {
        this.f21844m.m23415a(abstractC4491b);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public void mo17380a(@NonNull AbstractC4489g.AbstractC4492c abstractC4492c) {
        this.f21844m.m23414a(abstractC4492c);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public void mo17254a(aiw aiwVar) {
        this.f21843l.lock();
        try {
            if (this.f21841j == null) {
                this.f21841j = new HashSet();
            }
            this.f21841j.add(aiwVar);
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public boolean mo17382a(@NonNull C4467a<?> c4467a) {
        return this.f21836e.containsKey(c4467a.m24009d());
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: a */
    public boolean mo17375a(ait aitVar) {
        return this.f21845n != null && this.f21845n.mo17239a(aitVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: b */
    public Context mo17372b() {
        return this.f21847p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public <C extends C4467a.AbstractC4477f> C m17370b(C4467a.C4475d<?> c4475d) {
        C c = (C) this.f21836e.get(c4475d);
        C4588d.m23626a(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: b */
    public <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T mo17253b(@NonNull T t) {
        C4588d.m23618b(t.m17475g() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f21836e.containsKey(t.m17475g());
        String m24007f = t.m17474h() != null ? t.m17474h().m24007f() : "the API";
        C4588d.m23618b(containsKey, new StringBuilder(String.valueOf(m24007f).length() + 65).append("GoogleApiClient is not configured to use ").append(m24007f).append(" required for this call.").toString());
        this.f21843l.lock();
        try {
            if (this.f21845n == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (m17351m()) {
                this.f21834c.add(t);
                while (!this.f21834c.isEmpty()) {
                    ahl.AbstractC6343a<?, ?> remove = this.f21834c.remove();
                    this.f21842k.m17174a(remove);
                    remove.mo7412c(Status.f16788c);
                }
            } else {
                t = (T) this.f21845n.mo17236b(t);
            }
            return t;
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: b */
    public void mo17252b(aiw aiwVar) {
        this.f21843l.lock();
        try {
            if (this.f21841j == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.f21841j.remove(aiwVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!m17348p()) {
                this.f21845n.mo17232f();
            }
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: b */
    public void mo17365b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f21847p);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f21849r);
        printWriter.append(" mWorkQueue.size()=").print(this.f21834c.size());
        this.f21842k.m17170a(printWriter);
        if (this.f21845n != null) {
            this.f21845n.mo17238a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: b */
    public boolean mo17369b(@NonNull C4467a<?> c4467a) {
        C4467a.AbstractC4477f abstractC4477f = this.f21836e.get(c4467a.m24009d());
        return abstractC4477f != null && abstractC4477f.m24004t();
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: b */
    public boolean mo17368b(@NonNull AbstractC4489g.AbstractC4491b abstractC4491b) {
        return this.f21844m.m23412b(abstractC4491b);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: b */
    public boolean mo17367b(@NonNull AbstractC4489g.AbstractC4492c abstractC4492c) {
        return this.f21844m.m23411b(abstractC4492c);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: c */
    public Looper mo17251c() {
        return this.f21848q;
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    @NonNull
    /* renamed from: c */
    public ConnectionResult mo17363c(@NonNull C4467a<?> c4467a) {
        this.f21843l.lock();
        try {
            if (!mo17353j() && !m17351m()) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.f21836e.containsKey(c4467a.m24009d())) {
                throw new IllegalArgumentException(String.valueOf(c4467a.m24007f()).concat(" was never registered with GoogleApiClient"));
            }
            ConnectionResult mo17241a = this.f21845n.mo17241a(c4467a);
            if (mo17241a == null) {
                if (m17351m()) {
                    mo17241a = ConnectionResult.f16764v;
                } else {
                    Log.w("GoogleApiClientImpl", m17347q());
                    Log.wtf("GoogleApiClientImpl", String.valueOf(c4467a.m24007f()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                    mo17241a = new ConnectionResult(8, null);
                }
            }
            return mo17241a;
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: c */
    public void mo17362c(@NonNull AbstractC4489g.AbstractC4491b abstractC4491b) {
        this.f21844m.m23410c(abstractC4491b);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: c */
    public void mo17361c(@NonNull AbstractC4489g.AbstractC4492c abstractC4492c) {
        this.f21844m.m23409c(abstractC4492c);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: d */
    public void mo17359d() {
        if (this.f21845n != null) {
            this.f21845n.mo17231g();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: e */
    public void mo17358e() {
        boolean z = false;
        this.f21843l.lock();
        try {
            if (this.f21846o >= 0) {
                if (this.f21856y != null) {
                    z = true;
                }
                C4588d.m23622a(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f21856y == null) {
                this.f21856y = Integer.valueOf(m17374a((Iterable<C4467a.AbstractC4477f>) this.f21836e.values(), false));
            } else if (this.f21856y.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo17386a(this.f21856y.intValue());
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: f */
    public ConnectionResult mo17357f() {
        boolean z = true;
        C4588d.m23622a(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f21843l.lock();
        try {
            if (this.f21846o >= 0) {
                if (this.f21856y == null) {
                    z = false;
                }
                C4588d.m23622a(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f21856y == null) {
                this.f21856y = Integer.valueOf(m17374a((Iterable<C4467a.AbstractC4477f>) this.f21836e.values(), false));
            } else if (this.f21856y.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m17364c(this.f21856y.intValue());
            this.f21844m.m23413b();
            return this.f21845n.mo17237b();
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: g */
    public void mo17356g() {
        this.f21843l.lock();
        try {
            this.f21842k.m17175a();
            if (this.f21845n != null) {
                this.f21845n.mo17235c();
            }
            this.f21854w.m17211a();
            for (ahl.AbstractC6343a<?, ?> abstractC6343a : this.f21834c) {
                abstractC6343a.a((aix.AbstractC6391b) null);
                abstractC6343a.a();
            }
            this.f21834c.clear();
            if (this.f21845n == null) {
                return;
            }
            m17349o();
            this.f21844m.m23419a();
        } finally {
            this.f21843l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: h */
    public void mo17355h() {
        mo17356g();
        mo17358e();
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: i */
    public AbstractC4494i<Status> mo17354i() {
        C4588d.m23622a(mo17353j(), "GoogleApiClient is not connected yet.");
        C4588d.m23622a(this.f21856y.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        final aiu aiuVar = new aiu(this);
        if (this.f21836e.containsKey(ajd.f22005a)) {
            m17379a(this, aiuVar, false);
        } else {
            final AtomicReference atomicReference = new AtomicReference();
            AbstractC4489g m23957c = new AbstractC4489g.C4490a(this.f21847p).m23968a(ajd.f22006b).m23963a(new AbstractC4489g.AbstractC4491b() { // from class: com.google.android.gms.internal.ahy.2
                @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
                /* renamed from: a */
                public void mo17285a(int i) {
                }

                @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
                /* renamed from: a */
                public void mo17281a(Bundle bundle) {
                    ahy.this.m17379a((AbstractC4489g) atomicReference.get(), aiuVar, true);
                }
            }).m23962a(new AbstractC4489g.AbstractC4492c() { // from class: com.google.android.gms.internal.ahy.3
                @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4492c
                /* renamed from: a */
                public void mo17280a(@NonNull ConnectionResult connectionResult) {
                    aiuVar.b((aiu) new Status(8));
                }
            }).m23975a(this.f21852u).m23957c();
            atomicReference.set(m23957c);
            m23957c.mo17358e();
        }
        return aiuVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: j */
    public boolean mo17353j() {
        return this.f21845n != null && this.f21845n.mo17234d();
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g
    /* renamed from: k */
    public boolean mo17352k() {
        return this.f21845n != null && this.f21845n.mo17233e();
    }

    /* renamed from: m */
    boolean m17351m() {
        return this.f21849r;
    }

    /* renamed from: n */
    void m17350n() {
        if (m17351m()) {
            return;
        }
        this.f21849r = true;
        if (this.f21835d == null) {
            this.f21835d = this.f21853v.m23909a(this.f21847p.getApplicationContext(), new C6371b(this));
        }
        this.f21852u.sendMessageDelayed(this.f21852u.obtainMessage(1), this.f21850s);
        this.f21852u.sendMessageDelayed(this.f21852u.obtainMessage(2), this.f21851t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m17349o() {
        if (!m17351m()) {
            return false;
        }
        this.f21849r = false;
        this.f21852u.removeMessages(2);
        this.f21852u.removeMessages(1);
        if (this.f21835d != null) {
            this.f21835d.m12694a();
            this.f21835d = null;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m17348p() {
        boolean z = false;
        this.f21843l.lock();
        try {
            if (this.f21841j != null) {
                if (!this.f21841j.isEmpty()) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.f21843l.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public String m17347q() {
        StringWriter stringWriter = new StringWriter();
        mo17365b("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* renamed from: r */
    public int m17346r() {
        return System.identityHashCode(this);
    }
}
