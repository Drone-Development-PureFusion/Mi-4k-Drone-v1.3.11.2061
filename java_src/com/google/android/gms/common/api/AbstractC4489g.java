package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.app.FragmentActivity;
import android.support.p001v4.util.ArrayMap;
import android.view.View;
import com.google.android.gms.common.C4515b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4593i;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahj;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aho;
import com.google.android.gms.internal.ahy;
import com.google.android.gms.internal.aih;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.ait;
import com.google.android.gms.internal.aiw;
import com.google.android.gms.internal.aoj;
import com.google.android.gms.internal.aok;
import com.google.android.gms.internal.aom;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: com.google.android.gms.common.api.g */
/* loaded from: classes.dex */
public abstract class AbstractC4489g {

    /* renamed from: a */
    public static final int f16831a = 1;

    /* renamed from: b */
    public static final int f16832b = 2;

    /* renamed from: c */
    private static final Set<AbstractC4489g> f16833c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.g$a */
    /* loaded from: classes2.dex */
    public static final class C4490a {

        /* renamed from: a */
        private Account f16834a;

        /* renamed from: b */
        private final Set<Scope> f16835b;

        /* renamed from: c */
        private final Set<Scope> f16836c;

        /* renamed from: d */
        private int f16837d;

        /* renamed from: e */
        private View f16838e;

        /* renamed from: f */
        private String f16839f;

        /* renamed from: g */
        private String f16840g;

        /* renamed from: h */
        private final Map<C4467a<?>, C4626s.C4627a> f16841h;

        /* renamed from: i */
        private final Context f16842i;

        /* renamed from: j */
        private final Map<C4467a<?>, C4467a.AbstractC4468a> f16843j;

        /* renamed from: k */
        private aih f16844k;

        /* renamed from: l */
        private int f16845l;

        /* renamed from: m */
        private AbstractC4492c f16846m;

        /* renamed from: n */
        private Looper f16847n;

        /* renamed from: o */
        private C4515b f16848o;

        /* renamed from: p */
        private C4467a.AbstractC4473b<? extends aok, aom> f16849p;

        /* renamed from: q */
        private final ArrayList<AbstractC4491b> f16850q;

        /* renamed from: r */
        private final ArrayList<AbstractC4492c> f16851r;

        public C4490a(@NonNull Context context) {
            this.f16835b = new HashSet();
            this.f16836c = new HashSet();
            this.f16841h = new ArrayMap();
            this.f16843j = new ArrayMap();
            this.f16845l = -1;
            this.f16848o = C4515b.m23920a();
            this.f16849p = aoj.f22584c;
            this.f16850q = new ArrayList<>();
            this.f16851r = new ArrayList<>();
            this.f16842i = context;
            this.f16847n = context.getMainLooper();
            this.f16839f = context.getPackageName();
            this.f16840g = context.getClass().getName();
        }

        public C4490a(@NonNull Context context, @NonNull AbstractC4491b abstractC4491b, @NonNull AbstractC4492c abstractC4492c) {
            this(context);
            C4588d.m23626a(abstractC4491b, "Must provide a connected listener");
            this.f16850q.add(abstractC4491b);
            C4588d.m23626a(abstractC4492c, "Must provide a connection failed listener");
            this.f16851r.add(abstractC4492c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        private static <C extends C4467a.AbstractC4477f, O> C m23970a(C4467a.AbstractC4473b<C, O> abstractC4473b, Object obj, Context context, Looper looper, C4626s c4626s, AbstractC4491b abstractC4491b, AbstractC4492c abstractC4492c) {
            return abstractC4473b.mo7438a(context, looper, c4626s, obj, abstractC4491b, abstractC4492c);
        }

        /* renamed from: a */
        private C4490a m23960a(@NonNull aih aihVar, int i, @Nullable AbstractC4492c abstractC4492c) {
            C4588d.m23618b(i >= 0, "clientId must be non-negative");
            this.f16845l = i;
            this.f16846m = abstractC4492c;
            this.f16844k = aihVar;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        private static <C extends C4467a.AbstractC4479h, O> C4593i m23969a(C4467a.AbstractC4480i<C, O> abstractC4480i, Object obj, Context context, Looper looper, C4626s c4626s, AbstractC4491b abstractC4491b, AbstractC4492c abstractC4492c) {
            return new C4593i(context, looper, abstractC4480i.m23997b(), abstractC4491b, abstractC4492c, c4626s, abstractC4480i.m23996b(obj));
        }

        /* renamed from: a */
        private <O extends C4467a.AbstractC4468a> void m23965a(C4467a<O> c4467a, O o, int i, Scope... scopeArr) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalArgumentException(new StringBuilder(90).append("Invalid resolution mode: '").append(i).append("', use a constant from GoogleApiClient.ResolutionMode").toString());
                }
                z = false;
            }
            HashSet hashSet = new HashSet(c4467a.m24012a().mo20498a(o));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.f16841h.put(c4467a, new C4626s.C4627a(hashSet, z));
        }

        /* renamed from: a */
        private void m23961a(AbstractC4489g abstractC4489g) {
            ahj.m17485a(this.f16844k).m17486a(this.f16845l, abstractC4489g, this.f16846m);
        }

        /* renamed from: d */
        private AbstractC4489g m23956d() {
            C4593i m23970a;
            C4467a<?> c4467a;
            C4626s m23958b = m23958b();
            C4467a<?> c4467a2 = null;
            Map<C4467a<?>, C4626s.C4627a> m23528g = m23958b.m23528g();
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayList arrayList = new ArrayList();
            C4467a<?> c4467a3 = null;
            for (C4467a<?> c4467a4 : this.f16843j.keySet()) {
                C4467a.AbstractC4468a abstractC4468a = this.f16843j.get(c4467a4);
                int i = 0;
                if (m23528g.get(c4467a4) != null) {
                    i = m23528g.get(c4467a4).f17121b ? 1 : 2;
                }
                arrayMap.put(c4467a4, Integer.valueOf(i));
                aho ahoVar = new aho(c4467a4, i);
                arrayList.add(ahoVar);
                if (c4467a4.m24008e()) {
                    C4467a.AbstractC4480i<?, ?> m24010c = c4467a4.m24010c();
                    C4467a<?> c4467a5 = m24010c.a() == 1 ? c4467a4 : c4467a3;
                    m23970a = m23969a(m24010c, abstractC4468a, this.f16842i, this.f16847n, m23958b, ahoVar, ahoVar);
                    c4467a = c4467a5;
                } else {
                    C4467a.AbstractC4473b<?, ?> m24011b = c4467a4.m24011b();
                    C4467a<?> c4467a6 = m24011b.a() == 1 ? c4467a4 : c4467a3;
                    m23970a = m23970a((C4467a.AbstractC4473b<C4467a.AbstractC4477f, O>) m24011b, (Object) abstractC4468a, this.f16842i, this.f16847n, m23958b, (AbstractC4491b) ahoVar, (AbstractC4492c) ahoVar);
                    c4467a = c4467a6;
                }
                arrayMap2.put(c4467a4.m24009d(), m23970a);
                if (!m23970a.mo23561m_()) {
                    c4467a4 = c4467a2;
                } else if (c4467a2 != null) {
                    String valueOf = String.valueOf(c4467a4.m24007f());
                    String valueOf2 = String.valueOf(c4467a2.m24007f());
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length()).append(valueOf).append(" cannot be used with ").append(valueOf2).toString());
                }
                c4467a3 = c4467a;
                c4467a2 = c4467a4;
            }
            if (c4467a2 != null) {
                if (c4467a3 != null) {
                    String valueOf3 = String.valueOf(c4467a2.m24007f());
                    String valueOf4 = String.valueOf(c4467a3.m24007f());
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf3).length() + 21 + String.valueOf(valueOf4).length()).append(valueOf3).append(" cannot be used with ").append(valueOf4).toString());
                }
                C4588d.m23621a(this.f16834a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", c4467a2.m24007f());
                C4588d.m23621a(this.f16835b.equals(this.f16836c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", c4467a2.m24007f());
            }
            return new ahy(this.f16842i, new ReentrantLock(), this.f16847n, m23958b, this.f16848o, this.f16849p, arrayMap, this.f16850q, this.f16851r, arrayMap2, this.f16845l, ahy.m17374a((Iterable<C4467a.AbstractC4477f>) arrayMap2.values(), true), arrayList);
        }

        /* renamed from: a */
        public C4490a m23977a() {
            return m23959a("<<default account>>");
        }

        /* renamed from: a */
        public C4490a m23976a(int i) {
            this.f16837d = i;
            return this;
        }

        /* renamed from: a */
        public C4490a m23975a(@NonNull Handler handler) {
            C4588d.m23626a(handler, "Handler must not be null");
            this.f16847n = handler.getLooper();
            return this;
        }

        /* renamed from: a */
        public C4490a m23974a(@NonNull FragmentActivity fragmentActivity, int i, @Nullable AbstractC4492c abstractC4492c) {
            return m23960a(new aih(fragmentActivity), i, abstractC4492c);
        }

        /* renamed from: a */
        public C4490a m23973a(@NonNull FragmentActivity fragmentActivity, @Nullable AbstractC4492c abstractC4492c) {
            return m23974a(fragmentActivity, 0, abstractC4492c);
        }

        /* renamed from: a */
        public C4490a m23972a(@NonNull View view) {
            C4588d.m23626a(view, "View must not be null");
            this.f16838e = view;
            return this;
        }

        /* renamed from: a */
        public C4490a m23971a(@NonNull Scope scope) {
            C4588d.m23626a(scope, "Scope must not be null");
            this.f16835b.add(scope);
            return this;
        }

        /* renamed from: a */
        public C4490a m23968a(@NonNull C4467a<? extends C4467a.AbstractC4468a.AbstractC4471c> c4467a) {
            C4588d.m23626a(c4467a, "Api must not be null");
            this.f16843j.put(c4467a, null);
            List<Scope> mo20498a = c4467a.m24012a().mo20498a(null);
            this.f16836c.addAll(mo20498a);
            this.f16835b.addAll(mo20498a);
            return this;
        }

        /* renamed from: a */
        public <O extends C4467a.AbstractC4468a.AbstractC4469a> C4490a m23967a(@NonNull C4467a<O> c4467a, @NonNull O o) {
            C4588d.m23626a(c4467a, "Api must not be null");
            C4588d.m23626a(o, "Null options are not permitted for this Api");
            this.f16843j.put(c4467a, o);
            List<Scope> mo20498a = c4467a.m24012a().mo20498a(o);
            this.f16836c.addAll(mo20498a);
            this.f16835b.addAll(mo20498a);
            return this;
        }

        /* renamed from: a */
        public <O extends C4467a.AbstractC4468a.AbstractC4469a> C4490a m23966a(@NonNull C4467a<O> c4467a, @NonNull O o, Scope... scopeArr) {
            C4588d.m23626a(c4467a, "Api must not be null");
            C4588d.m23626a(o, "Null options are not permitted for this Api");
            this.f16843j.put(c4467a, o);
            m23965a(c4467a, o, 1, scopeArr);
            return this;
        }

        /* renamed from: a */
        public C4490a m23964a(@NonNull C4467a<? extends C4467a.AbstractC4468a.AbstractC4471c> c4467a, Scope... scopeArr) {
            C4588d.m23626a(c4467a, "Api must not be null");
            this.f16843j.put(c4467a, null);
            m23965a(c4467a, null, 1, scopeArr);
            return this;
        }

        /* renamed from: a */
        public C4490a m23963a(@NonNull AbstractC4491b abstractC4491b) {
            C4588d.m23626a(abstractC4491b, "Listener must not be null");
            this.f16850q.add(abstractC4491b);
            return this;
        }

        /* renamed from: a */
        public C4490a m23962a(@NonNull AbstractC4492c abstractC4492c) {
            C4588d.m23626a(abstractC4492c, "Listener must not be null");
            this.f16851r.add(abstractC4492c);
            return this;
        }

        /* renamed from: a */
        public C4490a m23959a(String str) {
            this.f16834a = str == null ? null : new Account(str, "com.google");
            return this;
        }

        /* renamed from: b */
        public C4626s m23958b() {
            aom aomVar = aom.f22590a;
            if (this.f16843j.containsKey(aoj.f22588g)) {
                aomVar = (aom) this.f16843j.get(aoj.f22588g);
            }
            return new C4626s(this.f16834a, this.f16835b, this.f16841h, this.f16837d, this.f16838e, this.f16839f, this.f16840g, aomVar);
        }

        /* renamed from: c */
        public AbstractC4489g m23957c() {
            C4588d.m23618b(!this.f16843j.isEmpty(), "must call addApi() to add at least one API");
            AbstractC4489g m23956d = m23956d();
            synchronized (AbstractC4489g.f16833c) {
                AbstractC4489g.f16833c.add(m23956d);
            }
            if (this.f16845l >= 0) {
                m23961a(m23956d);
            }
            return m23956d;
        }
    }

    /* renamed from: com.google.android.gms.common.api.g$b */
    /* loaded from: classes.dex */
    public interface AbstractC4491b {

        /* renamed from: b */
        public static final int f16852b = 1;

        /* renamed from: c */
        public static final int f16853c = 2;

        /* renamed from: a */
        void mo17285a(int i);

        /* renamed from: a */
        void mo17281a(@Nullable Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.api.g$c */
    /* loaded from: classes.dex */
    public interface AbstractC4492c {
        /* renamed from: a */
        void mo17280a(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: a */
    public static Set<AbstractC4489g> m23980a() {
        Set<AbstractC4489g> set;
        synchronized (f16833c) {
            set = f16833c;
        }
        return set;
    }

    /* renamed from: a */
    public static void m23979a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (f16833c) {
            String concat = String.valueOf(str).concat("  ");
            int i = 0;
            for (AbstractC4489g abstractC4489g : f16833c) {
                printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i);
                abstractC4489g.mo17365b(concat, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    /* renamed from: a */
    public abstract ConnectionResult mo17385a(long j, @NonNull TimeUnit timeUnit);

    @NonNull
    /* renamed from: a */
    public <C extends C4467a.AbstractC4477f> C mo17383a(@NonNull C4467a.C4475d<C> c4475d) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <A extends C4467a.AbstractC4474c, R extends AbstractC4502m, T extends ahl.AbstractC6343a<R, A>> T mo17255a(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <L> ail<L> mo17373a(@NonNull L l) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo17386a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo17384a(@NonNull FragmentActivity fragmentActivity);

    /* renamed from: a */
    public abstract void mo17381a(@NonNull AbstractC4491b abstractC4491b);

    /* renamed from: a */
    public abstract void mo17380a(@NonNull AbstractC4492c abstractC4492c);

    /* renamed from: a */
    public void mo17254a(aiw aiwVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo17382a(@NonNull C4467a<?> c4467a) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo17375a(ait aitVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Context mo17372b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T mo17253b(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo17252b(aiw aiwVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract void mo17365b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract boolean mo17369b(@NonNull C4467a<?> c4467a);

    /* renamed from: b */
    public abstract boolean mo17368b(@NonNull AbstractC4491b abstractC4491b);

    /* renamed from: b */
    public abstract boolean mo17367b(@NonNull AbstractC4492c abstractC4492c);

    /* renamed from: c */
    public Looper mo17251c() {
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* renamed from: c */
    public abstract ConnectionResult mo17363c(@NonNull C4467a<?> c4467a);

    /* renamed from: c */
    public abstract void mo17362c(@NonNull AbstractC4491b abstractC4491b);

    /* renamed from: c */
    public abstract void mo17361c(@NonNull AbstractC4492c abstractC4492c);

    /* renamed from: d */
    public void mo17359d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public abstract void mo17358e();

    /* renamed from: f */
    public abstract ConnectionResult mo17357f();

    /* renamed from: g */
    public abstract void mo17356g();

    /* renamed from: h */
    public abstract void mo17355h();

    /* renamed from: i */
    public abstract AbstractC4494i<Status> mo17354i();

    /* renamed from: j */
    public abstract boolean mo17353j();

    /* renamed from: k */
    public abstract boolean mo17352k();
}
