package com.google.firebase.database;

import com.google.android.gms.internal.C7149id;
import com.google.android.gms.internal.C7160ij;
import com.google.android.gms.internal.C7164im;
import com.google.android.gms.internal.C7193in;
import com.google.android.gms.internal.C7194io;
import com.google.android.gms.internal.C7390mi;
import com.google.android.gms.internal.C7392mk;
import com.google.android.gms.internal.C7394ml;
import com.google.firebase.C9751b;
import com.google.firebase.database.AbstractC9878j;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.firebase.database.g */
/* loaded from: classes2.dex */
public class C9874g {

    /* renamed from: a */
    private static final Map<String, C9874g> f30732a = new HashMap();

    /* renamed from: b */
    private final C9751b f30733b;

    /* renamed from: c */
    private final C7193in f30734c;

    /* renamed from: d */
    private final C7149id f30735d;

    /* renamed from: e */
    private C7164im f30736e;

    private C9874g(C9751b c9751b, C7193in c7193in, C7149id c7149id) {
        this.f30733b = c9751b;
        this.f30734c = c7193in;
        this.f30735d = c7149id;
    }

    /* renamed from: a */
    public static C9874g m6744a() {
        return m6743a(C9751b.m7205d());
    }

    /* renamed from: a */
    public static synchronized C9874g m6743a(C9751b c9751b) {
        C9874g c9874g;
        synchronized (C9874g.class) {
            if (!f30732a.containsKey(c9751b.m7212b())) {
                String m6635c = c9751b.m7208c().m6635c();
                if (m6635c == null) {
                    throw new C9866d("Failed to get FirebaseDatabase instance: FirebaseApp object has no DatabaseURL in its FirebaseOptions object.");
                }
                C7390mi m14608a = C7392mk.m14608a(m6635c);
                if (!m14608a.f24614b.m15356h()) {
                    String valueOf = String.valueOf(m14608a.f24614b.toString());
                    throw new C9866d(new StringBuilder(String.valueOf(m6635c).length() + 114 + String.valueOf(valueOf).length()).append("Configured Database URL '").append(m6635c).append("' is invalid. It should point to the root of a Firebase Database but it includes a path: ").append(valueOf).toString());
                }
                C7149id c7149id = new C7149id();
                if (!c9751b.m7204e()) {
                    c7149id.m15380c(c9751b.m7212b());
                }
                c7149id.m15383a(c9751b);
                f30732a.put(c9751b.m7212b(), new C9874g(c9751b, m14608a.f24613a, c7149id));
            }
            c9874g = f30732a.get(c9751b.m7212b());
        }
        return c9874g;
    }

    /* renamed from: c */
    private void m6735c(String str) {
        if (this.f30736e != null) {
            throw new C9866d(new StringBuilder(String.valueOf(str).length() + 77).append("Calls to ").append(str).append("() must be made before any other usage of FirebaseDatabase instance.").toString());
        }
    }

    /* renamed from: g */
    public static String m6731g() {
        return "3.0.0";
    }

    /* renamed from: h */
    private synchronized void m6730h() {
        if (this.f30736e == null) {
            this.f30736e = C7194io.m15261a(this.f30735d, this.f30734c, this);
        }
    }

    /* renamed from: a */
    public C9867e m6740a(String str) {
        m6730h();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
        }
        C7394ml.m14597b(str);
        return new C9867e(this.f30736e, new C7160ij(str));
    }

    /* renamed from: a */
    public synchronized void m6741a(AbstractC9878j.EnumC9879a enumC9879a) {
        m6735c("setLogLevel");
        this.f30735d.m15382a(enumC9879a);
    }

    /* renamed from: a */
    public synchronized void m6739a(boolean z) {
        m6735c("setPersistenceEnabled");
        this.f30735d.m15381a(z);
    }

    /* renamed from: b */
    public C9751b m6738b() {
        return this.f30733b;
    }

    /* renamed from: b */
    public C9867e m6737b(String str) {
        m6730h();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'url' in FirebaseDatabase.getReferenceFromUrl()");
        }
        C7390mi m14608a = C7392mk.m14608a(str);
        if (m14608a.f24613a.f24193a.equals(this.f30736e.m15300d().f24193a)) {
            return new C9867e(this.f30736e, m14608a.f24614b);
        }
        String valueOf = String.valueOf(m6736c().toString());
        throw new C9866d(new StringBuilder(String.valueOf(str).length() + 93 + String.valueOf(valueOf).length()).append("Invalid URL (").append(str).append(") passed to getReference().  URL was expected to match configured Database URL: ").append(valueOf).toString());
    }

    /* renamed from: c */
    public C9867e m6736c() {
        m6730h();
        return new C9867e(this.f30736e, C7160ij.m15371a());
    }

    /* renamed from: d */
    public void m6734d() {
        m6730h();
        this.f30736e.m15320a(new Runnable() { // from class: com.google.firebase.database.g.1
            @Override // java.lang.Runnable
            public void run() {
                C9874g.this.f30736e.m15294g();
            }
        });
    }

    /* renamed from: e */
    public void m6733e() {
        m6730h();
        C7194io.m15256b(this.f30736e);
    }

    /* renamed from: f */
    public void m6732f() {
        m6730h();
        C7194io.m15260a(this.f30736e);
    }
}
