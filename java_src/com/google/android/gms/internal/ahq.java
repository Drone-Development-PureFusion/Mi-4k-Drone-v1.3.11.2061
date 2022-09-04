package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ahq implements aig {

    /* renamed from: a */
    private final Context f21769a;

    /* renamed from: b */
    private final ahy f21770b;

    /* renamed from: c */
    private final Looper f21771c;

    /* renamed from: d */
    private final aia f21772d;

    /* renamed from: e */
    private final aia f21773e;

    /* renamed from: f */
    private final Map<C4467a.C4475d<?>, aia> f21774f;

    /* renamed from: h */
    private final C4467a.AbstractC4477f f21776h;

    /* renamed from: i */
    private Bundle f21777i;

    /* renamed from: m */
    private final Lock f21781m;

    /* renamed from: g */
    private final Set<ait> f21775g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: j */
    private ConnectionResult f21778j = null;

    /* renamed from: k */
    private ConnectionResult f21779k = null;

    /* renamed from: l */
    private boolean f21780l = false;

    /* renamed from: n */
    private int f21782n = 0;

    /* renamed from: com.google.android.gms.internal.ahq$a */
    /* loaded from: classes2.dex */
    private class C6352a implements aig.AbstractC6382a {
        private C6352a() {
        }

        @Override // com.google.android.gms.internal.aig.AbstractC6382a
        /* renamed from: a */
        public void mo17230a(int i, boolean z) {
            ahq.this.f21781m.lock();
            try {
                if (ahq.this.f21780l || ahq.this.f21779k == null || !ahq.this.f21779k.m24047b()) {
                    ahq.this.f21780l = false;
                    ahq.this.m17448a(i, z);
                    return;
                }
                ahq.this.f21780l = true;
                ahq.this.f21773e.mo17285a(i);
            } finally {
                ahq.this.f21781m.unlock();
            }
        }

        @Override // com.google.android.gms.internal.aig.AbstractC6382a
        /* renamed from: a */
        public void mo17229a(@Nullable Bundle bundle) {
            ahq.this.f21781m.lock();
            try {
                ahq.this.m17446a(bundle);
                ahq.this.f21778j = ConnectionResult.f16764v;
                ahq.this.m17429j();
            } finally {
                ahq.this.f21781m.unlock();
            }
        }

        @Override // com.google.android.gms.internal.aig.AbstractC6382a
        /* renamed from: a */
        public void mo17228a(@NonNull ConnectionResult connectionResult) {
            ahq.this.f21781m.lock();
            try {
                ahq.this.f21778j = connectionResult;
                ahq.this.m17429j();
            } finally {
                ahq.this.f21781m.unlock();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ahq$b */
    /* loaded from: classes2.dex */
    private class C6353b implements aig.AbstractC6382a {
        private C6353b() {
        }

        @Override // com.google.android.gms.internal.aig.AbstractC6382a
        /* renamed from: a */
        public void mo17230a(int i, boolean z) {
            ahq.this.f21781m.lock();
            try {
                if (ahq.this.f21780l) {
                    ahq.this.f21780l = false;
                    ahq.this.m17448a(i, z);
                    return;
                }
                ahq.this.f21780l = true;
                ahq.this.f21772d.mo17285a(i);
            } finally {
                ahq.this.f21781m.unlock();
            }
        }

        @Override // com.google.android.gms.internal.aig.AbstractC6382a
        /* renamed from: a */
        public void mo17229a(@Nullable Bundle bundle) {
            ahq.this.f21781m.lock();
            try {
                ahq.this.f21779k = ConnectionResult.f16764v;
                ahq.this.m17429j();
            } finally {
                ahq.this.f21781m.unlock();
            }
        }

        @Override // com.google.android.gms.internal.aig.AbstractC6382a
        /* renamed from: a */
        public void mo17228a(@NonNull ConnectionResult connectionResult) {
            ahq.this.f21781m.lock();
            try {
                ahq.this.f21779k = connectionResult;
                ahq.this.m17429j();
            } finally {
                ahq.this.f21781m.unlock();
            }
        }
    }

    private ahq(Context context, ahy ahyVar, Lock lock, Looper looper, C4648j c4648j, Map<C4467a.C4475d<?>, C4467a.AbstractC4477f> map, Map<C4467a.C4475d<?>, C4467a.AbstractC4477f> map2, C4626s c4626s, C4467a.AbstractC4473b<? extends aok, aom> abstractC4473b, C4467a.AbstractC4477f abstractC4477f, ArrayList<aho> arrayList, ArrayList<aho> arrayList2, Map<C4467a<?>, Integer> map3, Map<C4467a<?>, Integer> map4) {
        this.f21769a = context;
        this.f21770b = ahyVar;
        this.f21781m = lock;
        this.f21771c = looper;
        this.f21776h = abstractC4477f;
        this.f21772d = new aia(context, this.f21770b, lock, looper, c4648j, map2, null, map4, null, arrayList2, new C6352a());
        this.f21773e = new aia(context, this.f21770b, lock, looper, c4648j, map, c4626s, map3, abstractC4473b, arrayList, new C6353b());
        ArrayMap arrayMap = new ArrayMap();
        for (C4467a.C4475d<?> c4475d : map2.keySet()) {
            arrayMap.put(c4475d, this.f21772d);
        }
        for (C4467a.C4475d<?> c4475d2 : map.keySet()) {
            arrayMap.put(c4475d2, this.f21773e);
        }
        this.f21774f = Collections.unmodifiableMap(arrayMap);
    }

    /* renamed from: a */
    public static ahq m17447a(Context context, ahy ahyVar, Lock lock, Looper looper, C4648j c4648j, Map<C4467a.C4475d<?>, C4467a.AbstractC4477f> map, C4626s c4626s, Map<C4467a<?>, Integer> map2, C4467a.AbstractC4473b<? extends aok, aom> abstractC4473b, ArrayList<aho> arrayList) {
        C4467a.AbstractC4477f abstractC4477f = null;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        for (Map.Entry<C4467a.C4475d<?>, C4467a.AbstractC4477f> entry : map.entrySet()) {
            C4467a.AbstractC4477f value = entry.getValue();
            if (value.mo23561m_()) {
                abstractC4477f = value;
            }
            if (value.mo9364v()) {
                arrayMap.put(entry.getKey(), value);
            } else {
                arrayMap2.put(entry.getKey(), value);
            }
        }
        C4588d.m23622a(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (C4467a<?> c4467a : map2.keySet()) {
            C4467a.C4475d<?> m24009d = c4467a.m24009d();
            if (arrayMap.containsKey(m24009d)) {
                arrayMap3.put(c4467a, map2.get(c4467a));
            } else if (!arrayMap2.containsKey(m24009d)) {
                throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
            } else {
                arrayMap4.put(c4467a, map2.get(c4467a));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<aho> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aho next = it2.next();
            if (arrayMap3.containsKey(next.f21766a)) {
                arrayList2.add(next);
            } else if (!arrayMap4.containsKey(next.f21766a)) {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
            } else {
                arrayList3.add(next);
            }
        }
        return new ahq(context, ahyVar, lock, looper, c4648j, arrayMap, arrayMap2, c4626s, abstractC4473b, abstractC4477f, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m17448a(int i, boolean z) {
        this.f21770b.mo17230a(i, z);
        this.f21779k = null;
        this.f21778j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m17446a(Bundle bundle) {
        if (this.f21777i == null) {
            this.f21777i = bundle;
        } else if (bundle == null) {
        } else {
            this.f21777i.putAll(bundle);
        }
    }

    /* renamed from: a */
    private void m17445a(ConnectionResult connectionResult) {
        switch (this.f21782n) {
            case 2:
                this.f21770b.mo17228a(connectionResult);
            case 1:
                m17427l();
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        this.f21782n = 0;
    }

    /* renamed from: b */
    private static boolean m17439b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.m24047b();
    }

    /* renamed from: c */
    private boolean m17436c(ahl.AbstractC6343a<? extends AbstractC4502m, ? extends C4467a.AbstractC4474c> abstractC6343a) {
        C4467a.C4475d<? extends C4467a.AbstractC4474c> m17475g = abstractC6343a.m17475g();
        C4588d.m23618b(this.f21774f.containsKey(m17475g), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f21774f.get(m17475g).equals(this.f21773e);
    }

    /* renamed from: i */
    private void m17430i() {
        this.f21779k = null;
        this.f21778j = null;
        this.f21772d.mo17243a();
        this.f21773e.mo17243a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m17429j() {
        if (m17439b(this.f21778j)) {
            if (m17439b(this.f21779k) || m17426m()) {
                m17428k();
            } else if (this.f21779k == null) {
            } else {
                if (this.f21782n == 1) {
                    m17427l();
                    return;
                }
                m17445a(this.f21779k);
                this.f21772d.mo17235c();
            }
        } else if (this.f21778j != null && m17439b(this.f21779k)) {
            this.f21773e.mo17235c();
            m17445a(this.f21778j);
        } else if (this.f21778j == null || this.f21779k == null) {
        } else {
            ConnectionResult connectionResult = this.f21778j;
            if (this.f21773e.f21875h < this.f21772d.f21875h) {
                connectionResult = this.f21779k;
            }
            m17445a(connectionResult);
        }
    }

    /* renamed from: k */
    private void m17428k() {
        switch (this.f21782n) {
            case 2:
                this.f21770b.mo17229a(this.f21777i);
            case 1:
                m17427l();
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                break;
        }
        this.f21782n = 0;
    }

    /* renamed from: l */
    private void m17427l() {
        for (ait aitVar : this.f21775g) {
            aitVar.mo17193b();
        }
        this.f21775g.clear();
    }

    /* renamed from: m */
    private boolean m17426m() {
        return this.f21779k != null && this.f21779k.m24046c() == 4;
    }

    @Nullable
    /* renamed from: n */
    private PendingIntent m17425n() {
        if (this.f21776h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f21769a, this.f21770b.m17346r(), this.f21776h.mo23565e(), 134217728);
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: a */
    public ConnectionResult mo17242a(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.aig
    @Nullable
    /* renamed from: a */
    public ConnectionResult mo17241a(@NonNull C4467a<?> c4467a) {
        return this.f21774f.get(c4467a.m24009d()).equals(this.f21773e) ? m17426m() ? new ConnectionResult(4, m17425n()) : this.f21773e.mo17241a(c4467a) : this.f21772d.mo17241a(c4467a);
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: a */
    public <A extends C4467a.AbstractC4474c, R extends AbstractC4502m, T extends ahl.AbstractC6343a<R, A>> T mo17240a(@NonNull T t) {
        if (m17436c((ahl.AbstractC6343a<? extends AbstractC4502m, ? extends C4467a.AbstractC4474c>) t)) {
            if (!m17426m()) {
                return (T) this.f21773e.mo17240a((aia) t);
            }
            t.mo7412c(new Status(4, null, m17425n()));
            return t;
        }
        return (T) this.f21772d.mo17240a((aia) t);
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: a */
    public void mo17243a() {
        this.f21782n = 2;
        this.f21780l = false;
        m17430i();
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: a */
    public void mo17238a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f21773e.mo17238a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f21772d.mo17238a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: a */
    public boolean mo17239a(ait aitVar) {
        this.f21781m.lock();
        try {
            if ((!mo17233e() && !mo17234d()) || m17431h()) {
                this.f21781m.unlock();
                return false;
            }
            this.f21775g.add(aitVar);
            if (this.f21782n == 0) {
                this.f21782n = 1;
            }
            this.f21779k = null;
            this.f21773e.mo17243a();
            return true;
        } finally {
            this.f21781m.unlock();
        }
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: b */
    public ConnectionResult mo17237b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: b */
    public <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T mo17236b(@NonNull T t) {
        if (m17436c((ahl.AbstractC6343a<? extends AbstractC4502m, ? extends C4467a.AbstractC4474c>) t)) {
            if (!m17426m()) {
                return (T) this.f21773e.mo17236b((aia) t);
            }
            t.mo7412c(new Status(4, null, m17425n()));
            return t;
        }
        return (T) this.f21772d.mo17236b((aia) t);
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: c */
    public void mo17235c() {
        this.f21779k = null;
        this.f21778j = null;
        this.f21782n = 0;
        this.f21772d.mo17235c();
        this.f21773e.mo17235c();
        m17427l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r2.f21782n == 1) goto L12;
     */
    @Override // com.google.android.gms.internal.aig
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo17234d() {
        boolean z = true;
        this.f21781m.lock();
        try {
            if (this.f21772d.mo17234d()) {
                if (!m17431h() && !m17426m()) {
                }
                return z;
            }
            z = false;
            return z;
        } finally {
            this.f21781m.unlock();
        }
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: e */
    public boolean mo17233e() {
        this.f21781m.lock();
        try {
            return this.f21782n == 2;
        } finally {
            this.f21781m.unlock();
        }
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: f */
    public void mo17232f() {
        this.f21772d.mo17232f();
        this.f21773e.mo17232f();
    }

    @Override // com.google.android.gms.internal.aig
    /* renamed from: g */
    public void mo17231g() {
        this.f21781m.lock();
        try {
            boolean mo17233e = mo17233e();
            this.f21773e.mo17235c();
            this.f21779k = new ConnectionResult(4);
            if (mo17233e) {
                new Handler(this.f21771c).post(new Runnable() { // from class: com.google.android.gms.internal.ahq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ahq.this.f21781m.lock();
                        try {
                            ahq.this.m17429j();
                        } finally {
                            ahq.this.f21781m.unlock();
                        }
                    }
                });
            } else {
                m17427l();
            }
        } finally {
            this.f21781m.unlock();
        }
    }

    /* renamed from: h */
    public boolean m17431h() {
        return this.f21773e.mo17234d();
    }
}
