package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.AbstractC4512w;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class aix {

    /* renamed from: b */
    private static final ahn<?>[] f21966b = new ahn[0];

    /* renamed from: a */
    final Set<ahn<?>> f21967a;

    /* renamed from: c */
    private final AbstractC6391b f21968c;

    /* renamed from: d */
    private final Map<C4467a.C4475d<?>, C4467a.AbstractC4477f> f21969d;

    /* renamed from: e */
    private final C4467a.AbstractC4477f f21970e;

    /* renamed from: f */
    private AbstractC6392c f21971f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.aix$a */
    /* loaded from: classes2.dex */
    public static class C6390a implements IBinder.DeathRecipient, AbstractC6391b {

        /* renamed from: a */
        private final WeakReference<ahn<?>> f21973a;

        /* renamed from: b */
        private final WeakReference<AbstractC4512w> f21974b;

        /* renamed from: c */
        private final WeakReference<IBinder> f21975c;

        private C6390a(ahn<?> ahnVar, AbstractC4512w abstractC4512w, IBinder iBinder) {
            this.f21974b = new WeakReference<>(abstractC4512w);
            this.f21973a = new WeakReference<>(ahnVar);
            this.f21975c = new WeakReference<>(iBinder);
        }

        /* renamed from: a */
        private void m17166a() {
            ahn<?> ahnVar = this.f21973a.get();
            AbstractC4512w abstractC4512w = this.f21974b.get();
            if (abstractC4512w != null && ahnVar != null) {
                abstractC4512w.m23927a(ahnVar.mo17194f().intValue());
            }
            IBinder iBinder = this.f21975c.get();
            if (iBinder != null) {
                iBinder.unlinkToDeath(this, 0);
            }
        }

        @Override // com.google.android.gms.internal.aix.AbstractC6391b
        /* renamed from: a */
        public void mo17165a(ahn<?> ahnVar) {
            m17166a();
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m17166a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.aix$b */
    /* loaded from: classes2.dex */
    public interface AbstractC6391b {
        /* renamed from: a */
        void mo17165a(ahn<?> ahnVar);
    }

    /* renamed from: com.google.android.gms.internal.aix$c */
    /* loaded from: classes2.dex */
    interface AbstractC6392c {
        /* renamed from: a */
        void mo17164a();
    }

    public aix(C4467a.AbstractC4477f abstractC4477f) {
        this.f21967a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.f21968c = new AbstractC6391b() { // from class: com.google.android.gms.internal.aix.1
            @Override // com.google.android.gms.internal.aix.AbstractC6391b
            /* renamed from: a */
            public void mo17165a(ahn<?> ahnVar) {
                aix.this.f21967a.remove(ahnVar);
                if (ahnVar.mo17194f() != null && aix.m17171a(aix.this) != null) {
                    aix.m17171a(aix.this).m23927a(ahnVar.mo17194f().intValue());
                }
                if (aix.this.f21971f == null || !aix.this.f21967a.isEmpty()) {
                    return;
                }
                aix.this.f21971f.mo17164a();
            }
        };
        this.f21971f = null;
        this.f21969d = null;
        this.f21970e = abstractC4477f;
    }

    public aix(Map<C4467a.C4475d<?>, C4467a.AbstractC4477f> map) {
        this.f21967a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.f21968c = new AbstractC6391b() { // from class: com.google.android.gms.internal.aix.1
            @Override // com.google.android.gms.internal.aix.AbstractC6391b
            /* renamed from: a */
            public void mo17165a(ahn<?> ahnVar) {
                aix.this.f21967a.remove(ahnVar);
                if (ahnVar.mo17194f() != null && aix.m17171a(aix.this) != null) {
                    aix.m17171a(aix.this).m23927a(ahnVar.mo17194f().intValue());
                }
                if (aix.this.f21971f == null || !aix.this.f21967a.isEmpty()) {
                    return;
                }
                aix.this.f21971f.mo17164a();
            }
        };
        this.f21971f = null;
        this.f21969d = map;
        this.f21970e = null;
    }

    /* renamed from: a */
    static /* synthetic */ AbstractC4512w m17171a(aix aixVar) {
        return null;
    }

    /* renamed from: a */
    private static void m17173a(ahn<?> ahnVar, AbstractC4512w abstractC4512w, IBinder iBinder) {
        if (ahnVar.m17460i()) {
            ahnVar.m17466a((AbstractC6391b) new C6390a(ahnVar, abstractC4512w, iBinder));
        } else if (iBinder == null || !iBinder.isBinderAlive()) {
            ahnVar.m17466a((AbstractC6391b) null);
            ahnVar.mo13676a();
            abstractC4512w.m23927a(ahnVar.mo17194f().intValue());
        } else {
            C6390a c6390a = new C6390a(ahnVar, abstractC4512w, iBinder);
            ahnVar.m17466a((AbstractC6391b) c6390a);
            try {
                iBinder.linkToDeath(c6390a, 0);
            } catch (RemoteException e) {
                ahnVar.mo13676a();
                abstractC4512w.m23927a(ahnVar.mo17194f().intValue());
            }
        }
    }

    /* renamed from: a */
    public void m17175a() {
        ahn[] ahnVarArr;
        IBinder iBinder;
        for (ahn ahnVar : (ahn[]) this.f21967a.toArray(f21966b)) {
            ahnVar.m17466a((AbstractC6391b) null);
            if (ahnVar.mo17194f() != null) {
                ahnVar.m17458k();
                if (this.f21970e != null) {
                    iBinder = this.f21970e.m24002x();
                } else if (this.f21969d != null) {
                    iBinder = this.f21969d.get(((ahl.AbstractC6343a) ahnVar).m17475g()).m24002x();
                } else {
                    Log.wtf("UnconsumedApiCalls", "Could not get service broker binder", new Exception());
                    iBinder = null;
                }
                m17173a(ahnVar, null, iBinder);
                this.f21967a.remove(ahnVar);
            } else if (ahnVar.m17459j()) {
                this.f21967a.remove(ahnVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m17174a(ahn<? extends AbstractC4502m> ahnVar) {
        this.f21967a.add(ahnVar);
        ahnVar.m17466a(this.f21968c);
    }

    /* renamed from: a */
    public void m17172a(AbstractC6392c abstractC6392c) {
        if (this.f21967a.isEmpty()) {
            abstractC6392c.mo17164a();
        }
        this.f21971f = abstractC6392c;
    }

    /* renamed from: a */
    public void m17170a(PrintWriter printWriter) {
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f21967a.size());
    }

    /* renamed from: b */
    public void m17169b() {
        for (ahn ahnVar : (ahn[]) this.f21967a.toArray(f21966b)) {
            ahnVar.m17461d(new Status(8, "The connection to Google Play services was lost"));
        }
    }

    /* renamed from: c */
    public boolean m17167c() {
        for (ahn ahnVar : (ahn[]) this.f21967a.toArray(f21966b)) {
            if (!ahnVar.m17460i()) {
                return true;
            }
        }
        return false;
    }
}
