package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.BinderThread;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC4559ac;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aia;
import com.google.android.gms.signin.internal.BinderC9007b;
import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
/* loaded from: classes2.dex */
public class ahw implements ahz {

    /* renamed from: a */
    private final aia f21794a;

    /* renamed from: b */
    private final Lock f21795b;

    /* renamed from: c */
    private final Context f21796c;

    /* renamed from: d */
    private final C4648j f21797d;

    /* renamed from: e */
    private ConnectionResult f21798e;

    /* renamed from: f */
    private int f21799f;

    /* renamed from: h */
    private int f21801h;

    /* renamed from: k */
    private aok f21804k;

    /* renamed from: l */
    private int f21805l;

    /* renamed from: m */
    private boolean f21806m;

    /* renamed from: n */
    private boolean f21807n;

    /* renamed from: o */
    private AbstractC4559ac f21808o;

    /* renamed from: p */
    private boolean f21809p;

    /* renamed from: q */
    private boolean f21810q;

    /* renamed from: r */
    private final C4626s f21811r;

    /* renamed from: s */
    private final Map<C4467a<?>, Integer> f21812s;

    /* renamed from: t */
    private final C4467a.AbstractC4473b<? extends aok, aom> f21813t;

    /* renamed from: g */
    private int f21800g = 0;

    /* renamed from: i */
    private final Bundle f21802i = new Bundle();

    /* renamed from: j */
    private final Set<C4467a.C4475d> f21803j = new HashSet();

    /* renamed from: u */
    private ArrayList<Future<?>> f21814u = new ArrayList<>();

    /* renamed from: com.google.android.gms.internal.ahw$a */
    /* loaded from: classes2.dex */
    private static class C6357a implements AbstractC4600p.AbstractC4606f {

        /* renamed from: a */
        private final WeakReference<ahw> f21816a;

        /* renamed from: b */
        private final C4467a<?> f21817b;

        /* renamed from: c */
        private final int f21818c;

        public C6357a(ahw ahwVar, C4467a<?> c4467a, int i) {
            this.f21816a = new WeakReference<>(ahwVar);
            this.f21817b = c4467a;
            this.f21818c = i;
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4606f
        /* renamed from: a */
        public void mo17256a(@NonNull ConnectionResult connectionResult) {
            boolean z = false;
            ahw ahwVar = this.f21816a.get();
            if (ahwVar == null) {
                return;
            }
            if (Looper.myLooper() == ahwVar.f21794a.f21876i.mo17251c()) {
                z = true;
            }
            C4588d.m23622a(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            ahwVar.f21795b.lock();
            try {
                if (!ahwVar.m17411b(0)) {
                    return;
                }
                if (!connectionResult.m24047b()) {
                    ahwVar.m17409b(connectionResult, this.f21817b, this.f21818c);
                }
                if (ahwVar.m17403d()) {
                    ahwVar.m17401e();
                }
            } finally {
                ahwVar.f21795b.unlock();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ahw$b */
    /* loaded from: classes2.dex */
    private class C6358b extends AbstractRunnableC6365f {

        /* renamed from: c */
        private final Map<C4467a.AbstractC4477f, C6357a> f21820c;

        public C6358b(Map<C4467a.AbstractC4477f, C6357a> map) {
            super();
            this.f21820c = map;
        }

        @Override // com.google.android.gms.internal.ahw.AbstractRunnableC6365f
        @WorkerThread
        /* renamed from: a */
        public void mo17387a() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
            int i = 0;
            Iterator<C4467a.AbstractC4477f> it2 = this.f21820c.keySet().iterator();
            boolean z5 = true;
            boolean z6 = false;
            while (true) {
                if (!it2.hasNext()) {
                    z4 = z6;
                    z = false;
                    break;
                }
                C4467a.AbstractC4477f next = it2.next();
                if (!next.mo7943w()) {
                    z2 = false;
                    z3 = z6;
                } else if (this.f21820c.get(next).f21818c == 0) {
                    z = true;
                    break;
                } else {
                    z2 = z5;
                    z3 = true;
                }
                z6 = z3;
                z5 = z2;
            }
            if (z4) {
                i = ahw.this.f21797d.mo23375a(ahw.this.f21796c);
            }
            if (i != 0 && (z || z5)) {
                final ConnectionResult connectionResult = new ConnectionResult(i, null);
                ahw.this.f21794a.m17330a(new aia.AbstractC6373a(ahw.this) { // from class: com.google.android.gms.internal.ahw.b.1
                    @Override // com.google.android.gms.internal.aia.AbstractC6373a
                    /* renamed from: a */
                    public void mo17323a() {
                        ahw.this.m17405c(connectionResult);
                    }
                });
                return;
            }
            if (ahw.this.f21806m) {
                ahw.this.f21804k.mo9366h();
            }
            for (C4467a.AbstractC4477f abstractC4477f : this.f21820c.keySet()) {
                final C6357a c6357a = this.f21820c.get(abstractC4477f);
                if (!abstractC4477f.mo7943w() || i == 0) {
                    abstractC4477f.mo7977a(c6357a);
                } else {
                    ahw.this.f21794a.m17330a(new aia.AbstractC6373a(ahw.this) { // from class: com.google.android.gms.internal.ahw.b.2
                        @Override // com.google.android.gms.internal.aia.AbstractC6373a
                        /* renamed from: a */
                        public void mo17323a() {
                            c6357a.mo17256a(new ConnectionResult(16, null));
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ahw$c */
    /* loaded from: classes2.dex */
    public class C6361c extends AbstractRunnableC6365f {

        /* renamed from: c */
        private final ArrayList<C4467a.AbstractC4477f> f21826c;

        public C6361c(ArrayList<C4467a.AbstractC4477f> arrayList) {
            super();
            this.f21826c = arrayList;
        }

        @Override // com.google.android.gms.internal.ahw.AbstractRunnableC6365f
        @WorkerThread
        /* renamed from: a */
        public void mo17387a() {
            ahw.this.f21794a.f21876i.f21837f = ahw.this.m17391j();
            Iterator<C4467a.AbstractC4477f> it2 = this.f21826c.iterator();
            while (it2.hasNext()) {
                it2.next().m24006a(ahw.this.f21808o, ahw.this.f21794a.f21876i.f21837f);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ahw$d */
    /* loaded from: classes2.dex */
    private static class BinderC6362d extends BinderC9007b {

        /* renamed from: a */
        private final WeakReference<ahw> f21827a;

        BinderC6362d(ahw ahwVar) {
            this.f21827a = new WeakReference<>(ahwVar);
        }

        @Override // com.google.android.gms.signin.internal.BinderC9007b, com.google.android.gms.signin.internal.AbstractC9009d
        @BinderThread
        /* renamed from: a */
        public void mo9387a(final SignInResponse signInResponse) {
            final ahw ahwVar = this.f21827a.get();
            if (ahwVar == null) {
                return;
            }
            ahwVar.f21794a.m17330a(new aia.AbstractC6373a(ahwVar) { // from class: com.google.android.gms.internal.ahw.d.1
                @Override // com.google.android.gms.internal.aia.AbstractC6373a
                /* renamed from: a */
                public void mo17323a() {
                    ahwVar.m17413a(signInResponse);
                }
            });
        }
    }

    /* renamed from: com.google.android.gms.internal.ahw$e */
    /* loaded from: classes2.dex */
    private class C6364e implements AbstractC4489g.AbstractC4491b, AbstractC4489g.AbstractC4492c {
        private C6364e() {
        }

        @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
        /* renamed from: a */
        public void mo17285a(int i) {
        }

        @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
        /* renamed from: a */
        public void mo17281a(Bundle bundle) {
            ahw.this.f21804k.mo9368a(new BinderC6362d(ahw.this));
        }

        @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4492c
        /* renamed from: a */
        public void mo17280a(@NonNull ConnectionResult connectionResult) {
            ahw.this.f21795b.lock();
            try {
                if (ahw.this.m17410b(connectionResult)) {
                    ahw.this.m17395h();
                    ahw.this.m17401e();
                } else {
                    ahw.this.m17405c(connectionResult);
                }
            } finally {
                ahw.this.f21795b.unlock();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ahw$f */
    /* loaded from: classes2.dex */
    private abstract class AbstractRunnableC6365f implements Runnable {
        private AbstractRunnableC6365f() {
        }

        @WorkerThread
        /* renamed from: a */
        protected abstract void mo17387a();

        @Override // java.lang.Runnable
        @WorkerThread
        public void run() {
            ahw.this.f21795b.lock();
            try {
                if (Thread.interrupted()) {
                    return;
                }
                mo17387a();
            } catch (RuntimeException e) {
                ahw.this.f21794a.m17328a(e);
            } finally {
                ahw.this.f21795b.unlock();
            }
        }
    }

    public ahw(aia aiaVar, C4626s c4626s, Map<C4467a<?>, Integer> map, C4648j c4648j, C4467a.AbstractC4473b<? extends aok, aom> abstractC4473b, Lock lock, Context context) {
        this.f21794a = aiaVar;
        this.f21811r = c4626s;
        this.f21812s = map;
        this.f21797d = c4648j;
        this.f21813t = abstractC4473b;
        this.f21795b = lock;
        this.f21796c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m17413a(SignInResponse signInResponse) {
        if (!m17411b(0)) {
            return;
        }
        ConnectionResult m9399a = signInResponse.m9399a();
        if (!m9399a.m24047b()) {
            if (!m17410b(m9399a)) {
                m17405c(m9399a);
                return;
            }
            m17395h();
            m17401e();
            return;
        }
        ResolveAccountResponse m9398b = signInResponse.m9398b();
        ConnectionResult m23726b = m9398b.m23726b();
        if (!m23726b.m24047b()) {
            String valueOf = String.valueOf(m23726b);
            Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
            m17405c(m23726b);
            return;
        }
        this.f21807n = true;
        this.f21808o = m9398b.m23727a();
        this.f21809p = m9398b.m23725c();
        this.f21810q = m9398b.m23724d();
        m17401e();
    }

    /* renamed from: a */
    private void m17412a(boolean z) {
        if (this.f21804k != null) {
            if (this.f21804k.t() && z) {
                this.f21804k.mo9363y_();
            }
            this.f21804k.f();
            this.f21808o = null;
        }
    }

    /* renamed from: a */
    private boolean m17420a(int i, int i2, ConnectionResult connectionResult) {
        if (i2 != 1 || m17419a(connectionResult)) {
            return this.f21798e == null || i < this.f21799f;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m17419a(ConnectionResult connectionResult) {
        return connectionResult.m24050a() || this.f21797d.mo23369b(connectionResult.m24046c()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m17409b(ConnectionResult connectionResult, C4467a<?> c4467a, int i) {
        if (i != 2) {
            int mo9706a = c4467a.m24012a().mo9706a();
            if (m17420a(mo9706a, i, connectionResult)) {
                this.f21798e = connectionResult;
                this.f21799f = mo9706a;
            }
        }
        this.f21794a.f21871d.put(c4467a.m24009d(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m17411b(int i) {
        if (this.f21800g != i) {
            Log.w("GoogleApiClientConnecting", this.f21794a.f21876i.m17347q());
            String valueOf = String.valueOf(this);
            Log.w("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Unexpected callback in ").append(valueOf).toString());
            Log.w("GoogleApiClientConnecting", new StringBuilder(33).append("mRemainingConnections=").append(this.f21801h).toString());
            String valueOf2 = String.valueOf(m17406c(this.f21800g));
            String valueOf3 = String.valueOf(m17406c(i));
            Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf2).length() + 70 + String.valueOf(valueOf3).length()).append("GoogleApiClient connecting is in step ").append(valueOf2).append(" but received callback for step ").append(valueOf3).toString(), new Exception());
            m17405c(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m17410b(ConnectionResult connectionResult) {
        if (this.f21805l != 2) {
            return this.f21805l == 1 && !connectionResult.m24050a();
        }
        return true;
    }

    /* renamed from: c */
    private String m17406c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m17405c(ConnectionResult connectionResult) {
        m17393i();
        m17412a(!connectionResult.m24050a());
        this.f21794a.m17331a(connectionResult);
        this.f21794a.f21877j.mo17228a(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public boolean m17403d() {
        this.f21801h--;
        if (this.f21801h > 0) {
            return false;
        }
        if (this.f21801h < 0) {
            Log.w("GoogleApiClientConnecting", this.f21794a.f21876i.m17347q());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m17405c(new ConnectionResult(8, null));
            return false;
        } else if (this.f21798e == null) {
            return true;
        } else {
            this.f21794a.f21875h = this.f21799f;
            m17405c(this.f21798e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m17401e() {
        if (this.f21801h != 0) {
            return;
        }
        if (this.f21806m && !this.f21807n) {
            return;
        }
        m17399f();
    }

    /* renamed from: f */
    private void m17399f() {
        ArrayList arrayList = new ArrayList();
        this.f21800g = 1;
        this.f21801h = this.f21794a.f21870a.size();
        for (C4467a.C4475d<?> c4475d : this.f21794a.f21870a.keySet()) {
            if (!this.f21794a.f21871d.containsKey(c4475d)) {
                arrayList.add(this.f21794a.f21870a.get(c4475d));
            } else if (m17403d()) {
                m17397g();
            }
        }
        if (!arrayList.isEmpty()) {
            this.f21814u.add(aib.m17321a().submit(new C6361c(arrayList)));
        }
    }

    /* renamed from: g */
    private void m17397g() {
        this.f21794a.m17325i();
        aib.m17321a().execute(new Runnable() { // from class: com.google.android.gms.internal.ahw.1
            @Override // java.lang.Runnable
            public void run() {
                ahw.this.f21797d.m23362e(ahw.this.f21796c);
            }
        });
        if (this.f21804k != null) {
            if (this.f21809p) {
                this.f21804k.mo9370a(this.f21808o, this.f21810q);
            }
            m17412a(false);
        }
        for (C4467a.C4475d<?> c4475d : this.f21794a.f21871d.keySet()) {
            this.f21794a.f21870a.get(c4475d).mo9828f();
        }
        this.f21794a.f21877j.mo17229a(this.f21802i.isEmpty() ? null : this.f21802i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m17395h() {
        this.f21806m = false;
        this.f21794a.f21876i.f21837f = Collections.emptySet();
        for (C4467a.C4475d<?> c4475d : this.f21803j) {
            if (!this.f21794a.f21871d.containsKey(c4475d)) {
                this.f21794a.f21871d.put(c4475d, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: i */
    private void m17393i() {
        Iterator<Future<?>> it2 = this.f21814u.iterator();
        while (it2.hasNext()) {
            it2.next().cancel(true);
        }
        this.f21814u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public Set<Scope> m17391j() {
        if (this.f21811r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f21811r.m23530e());
        Map<C4467a<?>, C4626s.C4627a> m23528g = this.f21811r.m23528g();
        for (C4467a<?> c4467a : m23528g.keySet()) {
            if (!this.f21794a.f21871d.containsKey(c4467a.m24009d())) {
                hashSet.addAll(m23528g.get(c4467a).f17120a);
            }
        }
        return hashSet;
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public <A extends C4467a.AbstractC4474c, R extends AbstractC4502m, T extends ahl.AbstractC6343a<R, A>> T mo17335a(T t) {
        this.f21794a.f21876i.f21834c.add(t);
        return t;
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17339a() {
        this.f21794a.f21871d.clear();
        this.f21806m = false;
        this.f21798e = null;
        this.f21800g = 0;
        this.f21805l = 2;
        this.f21807n = false;
        this.f21809p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C4467a<?> c4467a : this.f21812s.keySet()) {
            C4467a.AbstractC4477f abstractC4477f = this.f21794a.f21870a.get(c4467a.m24009d());
            int intValue = this.f21812s.get(c4467a).intValue();
            boolean z2 = (c4467a.m24012a().mo9706a() == 1) | z;
            if (abstractC4477f.mo9364v()) {
                this.f21806m = true;
                if (intValue < this.f21805l) {
                    this.f21805l = intValue;
                }
                if (intValue != 0) {
                    this.f21803j.add(c4467a.m24009d());
                }
            }
            hashMap.put(abstractC4477f, new C6357a(this, c4467a, intValue));
            z = z2;
        }
        if (z) {
            this.f21806m = false;
        }
        if (this.f21806m) {
            this.f21811r.m23534a(Integer.valueOf(this.f21794a.f21876i.m17346r()));
            C6364e c6364e = new C6364e();
            this.f21804k = this.f21813t.mo7438a(this.f21796c, this.f21794a.f21876i.mo17251c(), this.f21811r, this.f21811r.m23524k(), c6364e, c6364e);
        }
        this.f21801h = this.f21794a.f21870a.size();
        this.f21814u.add(aib.m17321a().submit(new C6358b(hashMap)));
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17338a(int i) {
        m17405c(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17337a(Bundle bundle) {
        if (!m17411b(1)) {
            return;
        }
        if (bundle != null) {
            this.f21802i.putAll(bundle);
        }
        if (!m17403d()) {
            return;
        }
        m17397g();
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17336a(ConnectionResult connectionResult, C4467a<?> c4467a, int i) {
        if (!m17411b(1)) {
            return;
        }
        m17409b(connectionResult, c4467a, i);
        if (!m17403d()) {
            return;
        }
        m17397g();
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: b */
    public <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T mo17333b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: b */
    public boolean mo17334b() {
        m17393i();
        m17412a(true);
        this.f21794a.m17331a((ConnectionResult) null);
        return true;
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: c */
    public void mo17332c() {
    }
}
