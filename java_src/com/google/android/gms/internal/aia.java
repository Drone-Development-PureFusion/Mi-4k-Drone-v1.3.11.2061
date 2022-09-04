package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
/* loaded from: classes2.dex */
public class aia implements ahp, aig {

    /* renamed from: a */
    final Map<C4467a.C4475d<?>, C4467a.AbstractC4477f> f21870a;

    /* renamed from: e */
    final C4626s f21872e;

    /* renamed from: f */
    final Map<C4467a<?>, Integer> f21873f;

    /* renamed from: g */
    final C4467a.AbstractC4473b<? extends aok, aom> f21874g;

    /* renamed from: h */
    int f21875h;

    /* renamed from: i */
    final ahy f21876i;

    /* renamed from: j */
    final aig.AbstractC6382a f21877j;

    /* renamed from: k */
    private final Lock f21878k;

    /* renamed from: l */
    private final Condition f21879l;

    /* renamed from: m */
    private final Context f21880m;

    /* renamed from: n */
    private final C4648j f21881n;

    /* renamed from: o */
    private final HandlerC6374b f21882o;

    /* renamed from: p */
    private volatile ahz f21883p;

    /* renamed from: d */
    final Map<C4467a.C4475d<?>, ConnectionResult> f21871d = new HashMap();

    /* renamed from: q */
    private ConnectionResult f21884q = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.aia$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6373a {

        /* renamed from: a */
        private final ahz f21885a;

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC6373a(ahz ahzVar) {
            this.f21885a = ahzVar;
        }

        /* renamed from: a */
        protected abstract void mo17323a();

        /* renamed from: a */
        public final void m17322a(aia aiaVar) {
            aiaVar.f21878k.lock();
            try {
                if (aiaVar.f21883p != this.f21885a) {
                    return;
                }
                mo17323a();
            } finally {
                aiaVar.f21878k.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.aia$b */
    /* loaded from: classes2.dex */
    public final class HandlerC6374b extends Handler {
        HandlerC6374b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    ((AbstractC6373a) message.obj).m17322a(aia.this);
                    return;
                case 2:
                    throw ((RuntimeException) message.obj);
                default:
                    Log.w("GACStateManager", new StringBuilder(31).append("Unknown message id: ").append(message.what).toString());
                    return;
            }
        }
    }

    public aia(Context context, ahy ahyVar, Lock lock, Looper looper, C4648j c4648j, Map<C4467a.C4475d<?>, C4467a.AbstractC4477f> map, C4626s c4626s, Map<C4467a<?>, Integer> map2, C4467a.AbstractC4473b<? extends aok, aom> abstractC4473b, ArrayList<aho> arrayList, aig.AbstractC6382a abstractC6382a) {
        this.f21880m = context;
        this.f21878k = lock;
        this.f21881n = c4648j;
        this.f21870a = map;
        this.f21872e = c4626s;
        this.f21873f = map2;
        this.f21874g = abstractC4473b;
        this.f21876i = ahyVar;
        this.f21877j = abstractC6382a;
        Iterator<aho> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().m17449a(this);
        }
        this.f21882o = new HandlerC6374b(looper);
        this.f21879l = lock.newCondition();
        this.f21883p = new ahx(this);
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: a */
    public ConnectionResult mo17242a(long j, TimeUnit timeUnit) {
        mo17243a();
        long nanos = timeUnit.toNanos(j);
        while (mo17233e()) {
            if (nanos <= 0) {
                mo17235c();
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.f21879l.awaitNanos(nanos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        return mo17234d() ? ConnectionResult.f16764v : this.f21884q != null ? this.f21884q : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.internal.aig
    @Nullable
    /* renamed from: a */
    public ConnectionResult mo17241a(@NonNull C4467a<?> c4467a) {
        C4467a.C4475d<?> m24009d = c4467a.m24009d();
        if (this.f21870a.containsKey(m24009d)) {
            if (this.f21870a.get(m24009d).m24004t()) {
                return ConnectionResult.f16764v;
            }
            if (this.f21871d.containsKey(m24009d)) {
                return this.f21871d.get(m24009d);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: a */
    public <A extends C4467a.AbstractC4474c, R extends AbstractC4502m, T extends ahl.AbstractC6343a<R, A>> T mo17240a(@NonNull T t) {
        t.l();
        return (T) this.f21883p.mo17335a((ahz) t);
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: a */
    public void mo17243a() {
        this.f21883p.mo17332c();
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
    /* renamed from: a */
    public void mo17285a(int i) {
        this.f21878k.lock();
        try {
            this.f21883p.mo17338a(i);
        } finally {
            this.f21878k.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
    /* renamed from: a */
    public void mo17281a(@Nullable Bundle bundle) {
        this.f21878k.lock();
        try {
            this.f21883p.mo17337a(bundle);
        } finally {
            this.f21878k.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m17331a(ConnectionResult connectionResult) {
        this.f21878k.lock();
        try {
            this.f21884q = connectionResult;
            this.f21883p = new ahx(this);
            this.f21883p.mo17339a();
            this.f21879l.signalAll();
        } finally {
            this.f21878k.unlock();
        }
    }

    @Override // com.google.android.gms.internal.ahp
    /* renamed from: a */
    public void mo17279a(@NonNull ConnectionResult connectionResult, @NonNull C4467a<?> c4467a, int i) {
        this.f21878k.lock();
        try {
            this.f21883p.mo17336a(connectionResult, c4467a, i);
        } finally {
            this.f21878k.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m17330a(AbstractC6373a abstractC6373a) {
        this.f21882o.sendMessage(this.f21882o.obtainMessage(1, abstractC6373a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m17328a(RuntimeException runtimeException) {
        this.f21882o.sendMessage(this.f21882o.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: a */
    public void mo17238a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f21883p);
        for (C4467a<?> c4467a : this.f21873f.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c4467a.m24007f()).println(":");
            this.f21870a.get(c4467a.m24009d()).m24005a(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: a */
    public boolean mo17239a(ait aitVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: b */
    public ConnectionResult mo17237b() {
        mo17243a();
        while (mo17233e()) {
            try {
                this.f21879l.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return mo17234d() ? ConnectionResult.f16764v : this.f21884q != null ? this.f21884q : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: b */
    public <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T mo17236b(@NonNull T t) {
        t.l();
        return (T) this.f21883p.mo17333b(t);
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: c */
    public void mo17235c() {
        if (this.f21883p.mo17334b()) {
            this.f21871d.clear();
        }
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: d */
    public boolean mo17234d() {
        return this.f21883p instanceof ahv;
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: e */
    public boolean mo17233e() {
        return this.f21883p instanceof ahw;
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: f */
    public void mo17232f() {
        if (mo17234d()) {
            ((ahv) this.f21883p).m17421d();
        }
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: g */
    public void mo17231g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m17326h() {
        this.f21878k.lock();
        try {
            this.f21883p = new ahw(this, this.f21872e, this.f21873f, this.f21881n, this.f21874g, this.f21878k, this.f21880m);
            this.f21883p.mo17339a();
            this.f21879l.signalAll();
        } finally {
            this.f21878k.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m17325i() {
        this.f21878k.lock();
        try {
            this.f21876i.m17349o();
            this.f21883p = new ahv(this);
            this.f21883p.mo17339a();
            this.f21879l.signalAll();
        } finally {
            this.f21878k.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m17324j() {
        for (C4467a.AbstractC4477f abstractC4477f : this.f21870a.values()) {
            abstractC4477f.mo9828f();
        }
    }
}
