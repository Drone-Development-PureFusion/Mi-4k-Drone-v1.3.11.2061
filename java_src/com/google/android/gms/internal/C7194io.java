package com.google.android.gms.internal;

import com.google.firebase.database.C9874g;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.io */
/* loaded from: classes2.dex */
public class C7194io {

    /* renamed from: a */
    private static final C7194io f24197a = new C7194io();

    /* renamed from: b */
    private final Map<C7146ic, Map<String, C7164im>> f24198b = new HashMap();

    /* renamed from: a */
    public static C7164im m15261a(C7146ic c7146ic, C7193in c7193in, C9874g c9874g) {
        return f24197a.m15257b(c7146ic, c7193in, c9874g);
    }

    /* renamed from: a */
    public static void m15262a(C7146ic c7146ic) {
        f24197a.m15255c(c7146ic);
    }

    /* renamed from: a */
    public static void m15260a(final C7164im c7164im) {
        c7164im.m15320a(new Runnable() { // from class: com.google.android.gms.internal.io.1
            @Override // java.lang.Runnable
            public void run() {
                C7164im.this.m15292h();
            }
        });
    }

    /* renamed from: b */
    private C7164im m15257b(C7146ic c7146ic, C7193in c7193in, C9874g c9874g) {
        C7164im c7164im;
        c7146ic.m15412b();
        String str = c7193in.f24193a;
        String str2 = c7193in.f24195c;
        String sb = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length()).append("https://").append(str).append("/").append(str2).toString();
        synchronized (this.f24198b) {
            if (!this.f24198b.containsKey(c7146ic)) {
                this.f24198b.put(c7146ic, new HashMap());
            }
            Map<String, C7164im> map = this.f24198b.get(c7146ic);
            if (map.containsKey(sb)) {
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
            }
            c7164im = new C7164im(c7193in, c7146ic, c9874g);
            map.put(sb, c7164im);
        }
        return c7164im;
    }

    /* renamed from: b */
    public static void m15258b(C7146ic c7146ic) {
        f24197a.m15254d(c7146ic);
    }

    /* renamed from: b */
    public static void m15256b(final C7164im c7164im) {
        c7164im.m15320a(new Runnable() { // from class: com.google.android.gms.internal.io.2
            @Override // java.lang.Runnable
            public void run() {
                C7164im.this.m15290i();
            }
        });
    }

    /* renamed from: c */
    private void m15255c(final C7146ic c7146ic) {
        AbstractC7199ip m15399m = c7146ic.m15399m();
        if (m15399m != null) {
            m15399m.mo14628a(new Runnable() { // from class: com.google.android.gms.internal.io.3
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (C7194io.this.f24198b) {
                        if (C7194io.this.f24198b.containsKey(c7146ic)) {
                            boolean z = true;
                            for (C7164im c7164im : ((Map) C7194io.this.f24198b.get(c7146ic)).values()) {
                                c7164im.m15292h();
                                z = z && !c7164im.m15296f();
                            }
                            if (z) {
                                c7146ic.m15408d();
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: d */
    private void m15254d(final C7146ic c7146ic) {
        AbstractC7199ip m15399m = c7146ic.m15399m();
        if (m15399m != null) {
            m15399m.mo14628a(new Runnable() { // from class: com.google.android.gms.internal.io.4
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (C7194io.this.f24198b) {
                        if (C7194io.this.f24198b.containsKey(c7146ic)) {
                            for (C7164im c7164im : ((Map) C7194io.this.f24198b.get(c7146ic)).values()) {
                                c7164im.m15290i();
                            }
                        }
                    }
                }
            });
        }
    }
}
