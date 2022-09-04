package com.google.firebase.auth;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7041gj;
import com.google.android.gms.internal.AbstractC7049gr;
import com.google.android.gms.internal.AbstractC7414mq;
import com.google.android.gms.internal.C6984ft;
import com.google.android.gms.internal.C7008fw;
import com.google.android.gms.internal.C7010fy;
import com.google.android.gms.internal.C7018gb;
import com.google.android.gms.internal.C7043gl;
import com.google.android.gms.internal.C7045gn;
import com.google.android.gms.internal.C7046go;
import com.google.android.gms.internal.C7050gs;
import com.google.android.gms.internal.C7415mr;
import com.google.android.gms.internal.ExecutorC7051gt;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.android.gms.p239g.C5290i;
import com.google.firebase.C9751b;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public abstract class FirebaseAuth implements AbstractC7414mq {

    /* renamed from: g */
    private static Map<String, FirebaseAuth> f30343g = new ArrayMap();

    /* renamed from: h */
    private static FirebaseAuth f30344h;

    /* renamed from: a */
    private C9751b f30345a;

    /* renamed from: b */
    private List<AbstractC9715a> f30346b;

    /* renamed from: c */
    private C6984ft f30347c;

    /* renamed from: d */
    private AbstractC9739n f30348d;

    /* renamed from: e */
    private C7050gs f30349e;

    /* renamed from: f */
    private ExecutorC7051gt f30350f;

    /* renamed from: com.google.firebase.auth.FirebaseAuth$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9715a {
        /* renamed from: a */
        void m7358a(@NonNull FirebaseAuth firebaseAuth);
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$b */
    /* loaded from: classes2.dex */
    class C9716b implements AbstractC7041gj {
        C9716b() {
        }

        @Override // com.google.android.gms.internal.AbstractC7041gj
        /* renamed from: a */
        public void mo7357a(@NonNull GetTokenResponse getTokenResponse, @NonNull AbstractC9739n abstractC9739n) {
            C4588d.m23627a(getTokenResponse);
            C4588d.m23627a(abstractC9739n);
            abstractC9739n.mo7270a(getTokenResponse);
            FirebaseAuth.this.m7386a(abstractC9739n, getTokenResponse, true);
            FirebaseAuth.this.m7383a(abstractC9739n, true, true);
        }
    }

    public FirebaseAuth(C9751b c9751b) {
        this(c9751b, m7382a(c9751b), new C7050gs(c9751b.m7224a(), c9751b.m7203f(), C7010fy.m15800a()));
    }

    FirebaseAuth(C9751b c9751b, C6984ft c6984ft, C7050gs c7050gs) {
        this.f30345a = (C9751b) C4588d.m23627a(c9751b);
        this.f30347c = (C6984ft) C4588d.m23627a(c6984ft);
        this.f30349e = (C7050gs) C4588d.m23627a(c7050gs);
        this.f30346b = new CopyOnWriteArrayList();
        this.f30350f = ExecutorC7051gt.m15702a();
        m7360f();
    }

    /* renamed from: a */
    static C6984ft m7382a(C9751b c9751b) {
        return C7018gb.m15779a(c9751b.m7224a(), new C7018gb.C7020a.C7021a(c9751b.m7208c().m6640a()).m15776a());
    }

    /* renamed from: a */
    public static FirebaseAuth m7393a() {
        return m7372b(C9751b.m7205d());
    }

    /* renamed from: b */
    private static FirebaseAuth m7372b(@NonNull C9751b c9751b) {
        return m7365c(c9751b);
    }

    /* renamed from: c */
    private static synchronized FirebaseAuth m7365c(@NonNull C9751b c9751b) {
        FirebaseAuth firebaseAuth;
        synchronized (FirebaseAuth.class) {
            firebaseAuth = f30343g.get(c9751b.m7203f());
            if (firebaseAuth == null) {
                firebaseAuth = new C7045gn(c9751b);
                c9751b.m7220a(firebaseAuth);
                if (f30344h == null) {
                    f30344h = firebaseAuth;
                }
                f30343g.put(c9751b.m7203f(), firebaseAuth);
            }
        }
        return firebaseAuth;
    }

    @Keep
    public static FirebaseAuth getInstance(@NonNull C9751b c9751b) {
        return m7372b(c9751b);
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<AbstractC9727b> m7390a(@NonNull AbstractC9718a abstractC9718a) {
        C4588d.m23627a(abstractC9718a);
        if (C9728c.class.isAssignableFrom(abstractC9718a.getClass())) {
            C9728c c9728c = (C9728c) abstractC9718a;
            return this.f30347c.m15814b(this.f30345a, c9728c.m7280b(), c9728c.m7279c(), new C9716b());
        }
        return this.f30347c.m15834a(this.f30345a, abstractC9718a, new C9716b());
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<Void> m7388a(@NonNull AbstractC9739n abstractC9739n, @NonNull UserProfileChangeRequest userProfileChangeRequest) {
        C4588d.m23627a(abstractC9739n);
        C4588d.m23627a(userProfileChangeRequest);
        return this.f30347c.m15828a(this.f30345a, abstractC9739n, userProfileChangeRequest, new C9716b());
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<Void> m7387a(@NonNull AbstractC9739n abstractC9739n, @NonNull AbstractC9718a abstractC9718a) {
        C4588d.m23627a(abstractC9739n);
        C4588d.m23627a(abstractC9718a);
        if (C9728c.class.isAssignableFrom(abstractC9718a.getClass())) {
            C9728c c9728c = (C9728c) abstractC9718a;
            return this.f30347c.m15825a(this.f30345a, abstractC9739n, c9728c.m7280b(), c9728c.m7279c(), new C9716b());
        }
        return this.f30347c.m15827a(this.f30345a, abstractC9739n, abstractC9718a, new C9716b());
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<AbstractC9727b> m7385a(@NonNull AbstractC9739n abstractC9739n, @NonNull String str) {
        C4588d.m23625a(str);
        C4588d.m23627a(abstractC9739n);
        return this.f30347c.m15811d(this.f30345a, abstractC9739n, str, new C9716b());
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<C9741o> m7384a(@Nullable AbstractC9739n abstractC9739n, boolean z) {
        if (abstractC9739n == null) {
            return C5290i.m20826a((Exception) C7008fw.m15806a(new Status(17495)));
        }
        GetTokenResponse mo7256l = this.f30348d.mo7256l();
        return (!mo7256l.m7332a() || z) ? this.f30347c.m15826a(this.f30345a, abstractC9739n, mo7256l.m7330b(), new AbstractC7041gj() { // from class: com.google.firebase.auth.FirebaseAuth.3
            @Override // com.google.android.gms.internal.AbstractC7041gj
            /* renamed from: a */
            public void mo7357a(@NonNull GetTokenResponse getTokenResponse, @NonNull AbstractC9739n abstractC9739n2) {
                FirebaseAuth.this.m7386a(abstractC9739n2, getTokenResponse, true);
            }
        }) : C5290i.m20825a(new C9741o(mo7256l.m7329c()));
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<AbstractC9727b> m7381a(@NonNull String str) {
        C4588d.m23625a(str);
        return this.f30347c.m15823a(this.f30345a, str, new C9716b());
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<AbstractC9727b> m7380a(@NonNull String str, @NonNull String str2) {
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        return this.f30347c.m15814b(this.f30345a, str, str2, new C9716b());
    }

    @Override // com.google.android.gms.internal.AbstractC7414mq
    @NonNull
    /* renamed from: a */
    public AbstractC5285f<C9741o> mo7379a(boolean z) {
        return m7384a(this.f30348d, z);
    }

    /* renamed from: a */
    public void m7392a(@NonNull final AbstractC9715a abstractC9715a) {
        this.f30346b.add(abstractC9715a);
        this.f30350f.execute(new Runnable() { // from class: com.google.firebase.auth.FirebaseAuth.1
            @Override // java.lang.Runnable
            public void run() {
                abstractC9715a.m7358a(FirebaseAuth.this);
            }
        });
    }

    /* renamed from: a */
    public void m7389a(@Nullable AbstractC9739n abstractC9739n) {
        if (abstractC9739n != null) {
            String valueOf = String.valueOf(abstractC9739n.mo7233a());
            Log.d("FirebaseAuth", new StringBuilder(String.valueOf(valueOf).length() + 36).append("Notifying listeners about user ( ").append(valueOf).append(" ).").toString());
        } else {
            Log.d("FirebaseAuth", "Notifying listeners about a sign-out event.");
        }
        final C7415mr c7415mr = new C7415mr(abstractC9739n != null ? abstractC9739n.mo7255m() : null);
        this.f30350f.execute(new Runnable() { // from class: com.google.firebase.auth.FirebaseAuth.2
            @Override // java.lang.Runnable
            public void run() {
                FirebaseAuth.this.f30345a.m7219a(c7415mr);
                for (AbstractC9715a abstractC9715a : FirebaseAuth.this.f30346b) {
                    abstractC9715a.m7358a(FirebaseAuth.this);
                }
            }
        });
    }

    /* renamed from: a */
    public void m7386a(@NonNull AbstractC9739n abstractC9739n, @NonNull GetTokenResponse getTokenResponse, boolean z) {
        boolean z2 = true;
        C4588d.m23627a(abstractC9739n);
        C4588d.m23627a(getTokenResponse);
        if (this.f30348d != null) {
            String m7329c = this.f30348d.mo7256l().m7329c();
            String m7329c2 = getTokenResponse.m7329c();
            if (!this.f30348d.mo7233a().equalsIgnoreCase(abstractC9739n.mo7233a()) || m7329c == null || m7329c.equals(m7329c2)) {
                z2 = false;
            }
        }
        if (z2) {
            if (this.f30348d != null) {
                this.f30348d.mo7270a(getTokenResponse);
            }
            m7389a(this.f30348d);
        }
        if (z) {
            this.f30349e.m15713a(abstractC9739n, getTokenResponse);
        }
    }

    /* renamed from: a */
    public void m7383a(@NonNull AbstractC9739n abstractC9739n, boolean z, boolean z2) {
        C4588d.m23627a(abstractC9739n);
        if (this.f30348d == null) {
            this.f30348d = abstractC9739n;
        } else {
            this.f30348d.mo7265b(abstractC9739n.mo7259i());
            this.f30348d.mo7268a(abstractC9739n.mo7257k());
        }
        if (z) {
            this.f30349e.m15714a(this.f30348d);
        }
        if (z2) {
            m7389a(this.f30348d);
        }
    }

    @NonNull
    /* renamed from: b */
    public AbstractC5285f<Void> m7375b(@NonNull AbstractC9739n abstractC9739n) {
        C4588d.m23627a(abstractC9739n);
        return this.f30347c.m15829a(this.f30345a, abstractC9739n, new C9716b());
    }

    @NonNull
    /* renamed from: b */
    public AbstractC5285f<AbstractC9727b> m7374b(@NonNull AbstractC9739n abstractC9739n, @NonNull AbstractC9718a abstractC9718a) {
        C4588d.m23627a(abstractC9718a);
        C4588d.m23627a(abstractC9739n);
        return this.f30347c.m15817b(this.f30345a, abstractC9739n, abstractC9718a, new C9716b());
    }

    @NonNull
    /* renamed from: b */
    public AbstractC5285f<Void> m7373b(@NonNull AbstractC9739n abstractC9739n, @NonNull String str) {
        C4588d.m23627a(abstractC9739n);
        C4588d.m23625a(str);
        return this.f30347c.m15816b(this.f30345a, abstractC9739n, str, new C9716b());
    }

    @NonNull
    /* renamed from: b */
    public AbstractC5285f<AbstractC9746t> m7371b(@NonNull String str) {
        C4588d.m23625a(str);
        return this.f30347c.m15824a(this.f30345a, str);
    }

    @NonNull
    /* renamed from: b */
    public AbstractC5285f<AbstractC9727b> m7370b(@NonNull String str, @NonNull String str2) {
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        return this.f30347c.m15821a(this.f30345a, str, str2, new C9716b());
    }

    @Nullable
    /* renamed from: b */
    public AbstractC9739n m7378b() {
        return this.f30348d;
    }

    /* renamed from: b */
    public void m7377b(@NonNull AbstractC9715a abstractC9715a) {
        this.f30346b.remove(abstractC9715a);
    }

    @NonNull
    /* renamed from: c */
    public AbstractC5285f<Void> m7367c(@NonNull final AbstractC9739n abstractC9739n) {
        C4588d.m23627a(abstractC9739n);
        return this.f30347c.m15836a(abstractC9739n, new AbstractC7049gr() { // from class: com.google.firebase.auth.FirebaseAuth.4
            @Override // com.google.android.gms.internal.AbstractC7049gr
            /* renamed from: a */
            public void mo7359a() {
                if (FirebaseAuth.this.f30348d.mo7233a().equalsIgnoreCase(abstractC9739n.mo7233a())) {
                    FirebaseAuth.this.m7369c();
                }
            }
        });
    }

    @NonNull
    /* renamed from: c */
    public AbstractC5285f<Void> m7366c(@NonNull AbstractC9739n abstractC9739n, @NonNull String str) {
        C4588d.m23627a(abstractC9739n);
        C4588d.m23625a(str);
        return this.f30347c.m15813c(this.f30345a, abstractC9739n, str, new C9716b());
    }

    @NonNull
    /* renamed from: c */
    public AbstractC5285f<Void> m7364c(@NonNull String str) {
        C4588d.m23625a(str);
        return this.f30347c.m15815b(this.f30345a, str);
    }

    /* renamed from: c */
    public void m7369c() {
        if (this.f30348d != null) {
            this.f30349e.m15705c(this.f30348d);
            this.f30348d = null;
        }
        this.f30349e.m15708b();
        m7389a((AbstractC9739n) null);
    }

    @NonNull
    /* renamed from: d */
    public AbstractC5285f<AbstractC9727b> m7363d() {
        return (this.f30348d == null || !this.f30348d.mo7259i()) ? this.f30347c.m15835a(this.f30345a, new C9716b()) : C5290i.m20825a(new C7043gl((C7046go) this.f30348d));
    }

    @NonNull
    /* renamed from: d */
    public AbstractC5285f<Void> m7362d(@NonNull String str) {
        C4588d.m23625a(str);
        return this.f30347c.m15812c(this.f30345a, str);
    }

    /* renamed from: e */
    public void m7361e() {
        m7369c();
    }

    /* renamed from: f */
    protected void m7360f() {
        this.f30348d = this.f30349e.m15716a();
        if (this.f30348d != null) {
            m7383a(this.f30348d, false, true);
            GetTokenResponse m15707b = this.f30349e.m15707b(this.f30348d);
            if (m15707b == null) {
                return;
            }
            m7386a(this.f30348d, m15707b, false);
        }
    }
}
