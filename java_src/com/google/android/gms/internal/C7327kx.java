package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7344lh;
import com.google.android.gms.internal.C7322kw;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
/* renamed from: com.google.android.gms.internal.kx */
/* loaded from: classes2.dex */
public class C7327kx {

    /* renamed from: a */
    private final List<C7160ij> f24499a;

    /* renamed from: b */
    private final List<String> f24500b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.kx$a */
    /* loaded from: classes2.dex */
    public static class C7329a {

        /* renamed from: d */
        private int f24505d;

        /* renamed from: h */
        private final AbstractC7331c f24509h;

        /* renamed from: a */
        private StringBuilder f24502a = null;

        /* renamed from: b */
        private Stack<C7319kv> f24503b = new Stack<>();

        /* renamed from: c */
        private int f24504c = -1;

        /* renamed from: e */
        private boolean f24506e = true;

        /* renamed from: f */
        private final List<C7160ij> f24507f = new ArrayList();

        /* renamed from: g */
        private final List<String> f24508g = new ArrayList();

        public C7329a(AbstractC7331c abstractC7331c) {
            this.f24509h = abstractC7331c;
        }

        /* renamed from: a */
        private C7160ij m14800a(int i) {
            C7319kv[] c7319kvArr = new C7319kv[i];
            for (int i2 = 0; i2 < i; i2++) {
                c7319kvArr[i2] = this.f24503b.get(i2);
            }
            return new C7160ij(c7319kvArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m14799a(C7319kv c7319kv) {
            m14789d();
            if (this.f24506e) {
                this.f24502a.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            m14794a(this.f24502a, c7319kv);
            this.f24502a.append(":(");
            if (this.f24505d == this.f24503b.size()) {
                this.f24503b.add(c7319kv);
            } else {
                this.f24503b.set(this.f24505d, c7319kv);
            }
            this.f24505d++;
            this.f24506e = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m14795a(AbstractC7339le<?> abstractC7339le) {
            m14789d();
            this.f24504c = this.f24505d;
            this.f24502a.append(abstractC7339le.a(AbstractC7344lh.EnumC7346a.V2));
            this.f24506e = true;
            if (this.f24509h.mo14784a(this)) {
                m14785g();
            }
        }

        /* renamed from: a */
        private void m14794a(StringBuilder sb, C7319kv c7319kv) {
            sb.append(C7392mk.m14604c(c7319kv.m14823e()));
        }

        /* renamed from: d */
        private void m14789d() {
            if (!m14801a()) {
                this.f24502a = new StringBuilder();
                this.f24502a.append("(");
                Iterator<C7319kv> it2 = m14800a(this.f24505d).iterator();
                while (it2.hasNext()) {
                    m14794a(this.f24502a, it2.next());
                    this.f24502a.append(":(");
                }
                this.f24506e = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m14787e() {
            this.f24505d--;
            if (m14801a()) {
                this.f24502a.append(")");
            }
            this.f24506e = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m14786f() {
            C7392mk.m14606a(this.f24505d == 0, "Can't finish hashing in the middle processing a child");
            if (m14801a()) {
                m14785g();
            }
            this.f24508g.add("");
        }

        /* renamed from: g */
        private void m14785g() {
            C7392mk.m14606a(m14801a(), "Can't end range without starting a range!");
            for (int i = 0; i < this.f24505d; i++) {
                this.f24502a.append(")");
            }
            this.f24502a.append(")");
            C7160ij m14800a = m14800a(this.f24504c);
            this.f24508g.add(C7392mk.m14605b(this.f24502a.toString()));
            this.f24507f.add(m14800a);
            this.f24502a = null;
        }

        /* renamed from: a */
        public boolean m14801a() {
            return this.f24502a != null;
        }

        /* renamed from: b */
        public int m14793b() {
            return this.f24502a.length();
        }

        /* renamed from: c */
        public C7160ij m14791c() {
            return m14800a(this.f24505d);
        }
    }

    /* renamed from: com.google.android.gms.internal.kx$b */
    /* loaded from: classes2.dex */
    private static class C7330b implements AbstractC7331c {

        /* renamed from: a */
        private final long f24510a;

        public C7330b(AbstractC7344lh abstractC7344lh) {
            this.f24510a = Math.max(512L, (long) Math.sqrt(C7387mf.m14620a(abstractC7344lh) * 100));
        }

        @Override // com.google.android.gms.internal.C7327kx.AbstractC7331c
        /* renamed from: a */
        public boolean mo14784a(C7329a c7329a) {
            return ((long) c7329a.m14793b()) > this.f24510a && (c7329a.m14791c().m15356h() || !c7329a.m14791c().m15357g().equals(C7319kv.m14825c()));
        }
    }

    /* renamed from: com.google.android.gms.internal.kx$c */
    /* loaded from: classes2.dex */
    public interface AbstractC7331c {
        /* renamed from: a */
        boolean mo14784a(C7329a c7329a);
    }

    private C7327kx(List<C7160ij> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f24499a = list;
        this.f24500b = list2;
    }

    /* renamed from: a */
    public static C7327kx m14807a(AbstractC7344lh abstractC7344lh) {
        return m14805a(abstractC7344lh, new C7330b(abstractC7344lh));
    }

    /* renamed from: a */
    public static C7327kx m14805a(AbstractC7344lh abstractC7344lh, AbstractC7331c abstractC7331c) {
        if (abstractC7344lh.mo14739b()) {
            return new C7327kx(Collections.emptyList(), Collections.singletonList(""));
        }
        C7329a c7329a = new C7329a(abstractC7331c);
        m14803b(abstractC7344lh, c7329a);
        c7329a.m14786f();
        return new C7327kx(c7329a.f24507f, c7329a.f24508g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m14803b(AbstractC7344lh abstractC7344lh, final C7329a c7329a) {
        if (abstractC7344lh.mo14743e()) {
            c7329a.m14795a((AbstractC7339le) abstractC7344lh);
        } else if (abstractC7344lh.mo14739b()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        } else {
            if (!(abstractC7344lh instanceof C7322kw)) {
                String valueOf = String.valueOf(abstractC7344lh);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Expected children node, but got: ").append(valueOf).toString());
            } else {
                ((C7322kw) abstractC7344lh).m14818a(new C7322kw.AbstractC7325a() { // from class: com.google.android.gms.internal.kx.1
                    @Override // com.google.android.gms.internal.C7322kw.AbstractC7325a
                    /* renamed from: a */
                    public void mo14802a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh2) {
                        C7329a.this.m14799a(c7319kv);
                        C7327kx.m14803b(abstractC7344lh2, C7329a.this);
                        C7329a.this.m14787e();
                    }
                }, true);
            }
        }
    }

    /* renamed from: a */
    public List<C7160ij> m14808a() {
        return Collections.unmodifiableList(this.f24499a);
    }

    /* renamed from: b */
    public List<String> m14804b() {
        return Collections.unmodifiableList(this.f24500b);
    }
}
