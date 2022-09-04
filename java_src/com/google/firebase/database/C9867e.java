package com.google.firebase.database;

import com.google.android.gms.internal.AbstractC7344lh;
import com.google.android.gms.internal.C7142ia;
import com.google.android.gms.internal.C7149id;
import com.google.android.gms.internal.C7160ij;
import com.google.android.gms.internal.C7164im;
import com.google.android.gms.internal.C7194io;
import com.google.android.gms.internal.C7235iz;
import com.google.android.gms.internal.C7319kv;
import com.google.android.gms.internal.C7347li;
import com.google.android.gms.internal.C7350ll;
import com.google.android.gms.internal.C7389mh;
import com.google.android.gms.internal.C7391mj;
import com.google.android.gms.internal.C7392mk;
import com.google.android.gms.internal.C7394ml;
import com.google.android.gms.internal.C7395mm;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.firebase.database.C9897q;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.p356d.AbstractC11759f;
/* renamed from: com.google.firebase.database.e */
/* loaded from: classes2.dex */
public class C9867e extends C9890n {

    /* renamed from: e */
    private static C7149id f30718e;

    /* renamed from: com.google.firebase.database.e$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9872a {
        /* renamed from: a */
        void mo6745a(C9831c c9831c, C9867e c9867e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9867e(C7164im c7164im, C7160ij c7160ij) {
        super(c7164im, c7160ij);
    }

    /* renamed from: a */
    private AbstractC5285f<Void> m6770a(final AbstractC7344lh abstractC7344lh, AbstractC9872a abstractC9872a) {
        C7394ml.m14602a(n());
        final C7389mh<AbstractC5285f<Void>, AbstractC9872a> m14609a = C7392mk.m14609a(abstractC9872a);
        this.f30763a.m15320a(new Runnable() { // from class: com.google.firebase.database.e.2
            @Override // java.lang.Runnable
            public void run() {
                C9867e.this.f30763a.m15340a(C9867e.this.n().m15368a(C7319kv.m14825c()), abstractC7344lh, (AbstractC9872a) m14609a.m14615b());
            }
        });
        return m14609a.m14616a();
    }

    /* renamed from: a */
    private AbstractC5285f<Void> m6765a(Object obj, AbstractC7344lh abstractC7344lh, AbstractC9872a abstractC9872a) {
        C7394ml.m14602a(n());
        C7235iz.m15147a(n(), obj);
        Object m14590a = C7395mm.m14590a(obj);
        C7394ml.m14600a(m14590a);
        final AbstractC7344lh m14734a = C7347li.m14734a(m14590a, abstractC7344lh);
        final C7389mh<AbstractC5285f<Void>, AbstractC9872a> m14609a = C7392mk.m14609a(abstractC9872a);
        this.f30763a.m15320a(new Runnable() { // from class: com.google.firebase.database.e.1
            @Override // java.lang.Runnable
            public void run() {
                C9867e.this.f30763a.m15340a(C9867e.this.n(), m14734a, (AbstractC9872a) m14609a.m14615b());
            }
        });
        return m14609a.m14616a();
    }

    /* renamed from: a */
    static void m6771a(C7149id c7149id) {
        C7194io.m15262a(c7149id);
    }

    /* renamed from: b */
    private AbstractC5285f<Void> m6754b(Map<String, Object> map, AbstractC9872a abstractC9872a) {
        if (map == null) {
            throw new NullPointerException("Can't pass null for argument 'update' in updateChildren()");
        }
        final Map<String, Object> m14585a = C7395mm.m14585a(map);
        final C7142ia m15425b = C7142ia.m15425b(C7394ml.m14601a(n(), m14585a));
        final C7389mh<AbstractC5285f<Void>, AbstractC9872a> m14609a = C7392mk.m14609a(abstractC9872a);
        this.f30763a.m15320a(new Runnable() { // from class: com.google.firebase.database.e.3
            @Override // java.lang.Runnable
            public void run() {
                C9867e.this.f30763a.m15341a(C9867e.this.n(), m15425b, (AbstractC9872a) m14609a.m14615b(), m14585a);
            }
        });
        return m14609a.m14616a();
    }

    /* renamed from: b */
    static void m6757b(C7149id c7149id) {
        C7194io.m15258b(c7149id);
    }

    /* renamed from: d */
    public static void m6752d() {
        m6771a(m6746p());
    }

    /* renamed from: e */
    public static void m6751e() {
        m6757b(m6746p());
    }

    /* renamed from: p */
    private static synchronized C7149id m6746p() {
        C7149id c7149id;
        synchronized (C9867e.class) {
            if (f30718e == null) {
                f30718e = new C7149id();
            }
            c7149id = f30718e;
        }
        return c7149id;
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m6766a(Object obj) {
        return m6765a(obj, C7350ll.m14728a((Object) null), (AbstractC9872a) null);
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m6763a(Object obj, Object obj2) {
        return m6765a(obj, C7350ll.m14728a(obj2), (AbstractC9872a) null);
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m6760a(Map<String, Object> map) {
        return m6754b(map, (AbstractC9872a) null);
    }

    /* renamed from: a */
    public C9867e m6772a() {
        return new C9867e(this.f30763a, n().m15368a(C7319kv.m14828a(C7391mj.m14613a(this.f30763a.m15298e()))));
    }

    /* renamed from: a */
    public C9867e m6761a(String str) {
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        if (n().m15356h()) {
            C7394ml.m14597b(str);
        } else {
            C7394ml.m14599a(str);
        }
        return new C9867e(this.f30763a, n().m15370a(new C7160ij(str)));
    }

    /* renamed from: a */
    public void m6769a(AbstractC9872a abstractC9872a) {
        m6764a((Object) null, abstractC9872a);
    }

    /* renamed from: a */
    public void m6768a(C9897q.AbstractC9899a abstractC9899a) {
        m6767a(abstractC9899a, true);
    }

    /* renamed from: a */
    public void m6767a(final C9897q.AbstractC9899a abstractC9899a, final boolean z) {
        if (abstractC9899a == null) {
            throw new NullPointerException("Can't pass null for argument 'handler' in runTransaction()");
        }
        C7394ml.m14602a(n());
        this.f30763a.m15320a(new Runnable() { // from class: com.google.firebase.database.e.4
            @Override // java.lang.Runnable
            public void run() {
                C9867e.this.f30763a.m15338a(C9867e.this.n(), abstractC9899a, z);
            }
        });
    }

    /* renamed from: a */
    public void m6764a(Object obj, AbstractC9872a abstractC9872a) {
        m6765a(obj, C7350ll.m14728a((Object) null), abstractC9872a);
    }

    /* renamed from: a */
    public void m6762a(Object obj, Object obj2, AbstractC9872a abstractC9872a) {
        m6765a(obj, C7350ll.m14728a(obj2), abstractC9872a);
    }

    /* renamed from: a */
    public void m6759a(Map<String, Object> map, AbstractC9872a abstractC9872a) {
        m6754b(map, abstractC9872a);
    }

    /* renamed from: b */
    public AbstractC5285f<Void> m6758b() {
        return m6766a((Object) null);
    }

    /* renamed from: b */
    public AbstractC5285f<Void> m6756b(Object obj) {
        return m6770a(C7350ll.m14728a(obj), (AbstractC9872a) null);
    }

    /* renamed from: b */
    public void m6755b(Object obj, AbstractC9872a abstractC9872a) {
        m6770a(C7350ll.m14728a(obj), abstractC9872a);
    }

    /* renamed from: c */
    public C9885l m6753c() {
        C7394ml.m14602a(n());
        return new C9885l(this.f30763a, n());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9867e) && toString().equals(obj.toString());
    }

    /* renamed from: f */
    public C9874g m6750f() {
        return this.f30763a.m15304c();
    }

    /* renamed from: g */
    public C9867e m6749g() {
        C7160ij m15359f = n().m15359f();
        if (m15359f != null) {
            return new C9867e(this.f30763a, m15359f);
        }
        return null;
    }

    /* renamed from: h */
    public C9867e m6748h() {
        return new C9867e(this.f30763a, new C7160ij(""));
    }

    public int hashCode() {
        return toString().hashCode();
    }

    /* renamed from: i */
    public String m6747i() {
        if (n().m15356h()) {
            return null;
        }
        return n().m15357g().m14823e();
    }

    public String toString() {
        C9867e m6749g = m6749g();
        if (m6749g == null) {
            return this.f30763a.toString();
        }
        try {
            String valueOf = String.valueOf(m6749g.toString());
            String valueOf2 = String.valueOf(URLEncoder.encode(m6747i(), "UTF-8").replace(AbstractC11759f.f37105b, "%20"));
            return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("/").append(valueOf2).toString();
        } catch (UnsupportedEncodingException e) {
            String valueOf3 = String.valueOf(m6747i());
            throw new C9866d(valueOf3.length() != 0 ? "Failed to URLEncode key: ".concat(valueOf3) : new String("Failed to URLEncode key: "), e);
        }
    }
}
