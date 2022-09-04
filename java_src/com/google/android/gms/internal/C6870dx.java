package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.internal.dx */
/* loaded from: classes2.dex */
public final class C6870dx {

    /* renamed from: a */
    private final List<C6867dw> f23088a;

    /* renamed from: b */
    private final List<C6867dw> f23089b;

    /* renamed from: c */
    private final List<C6867dw> f23090c;

    /* renamed from: d */
    private final List<C6867dw> f23091d;

    /* renamed from: com.google.android.gms.internal.dx$a */
    /* loaded from: classes2.dex */
    public static class C6872a {

        /* renamed from: a */
        private final List<C6867dw> f23092a = new ArrayList();

        /* renamed from: b */
        private final List<C6867dw> f23093b = new ArrayList();

        /* renamed from: c */
        private final List<C6867dw> f23094c = new ArrayList();

        /* renamed from: d */
        private final List<C6867dw> f23095d = new ArrayList();

        /* renamed from: a */
        public C6872a m16076a(C6867dw c6867dw) {
            this.f23092a.add(c6867dw);
            return this;
        }

        /* renamed from: a */
        public C6870dx m16077a() {
            return new C6870dx(this.f23092a, this.f23093b, this.f23094c, this.f23095d);
        }

        /* renamed from: b */
        public C6872a m16075b(C6867dw c6867dw) {
            this.f23093b.add(c6867dw);
            return this;
        }

        /* renamed from: c */
        public C6872a m16074c(C6867dw c6867dw) {
            this.f23094c.add(c6867dw);
            return this;
        }

        /* renamed from: d */
        public C6872a m16073d(C6867dw c6867dw) {
            this.f23095d.add(c6867dw);
            return this;
        }
    }

    private C6870dx(List<C6867dw> list, List<C6867dw> list2, List<C6867dw> list3, List<C6867dw> list4) {
        this.f23088a = Collections.unmodifiableList(list);
        this.f23089b = Collections.unmodifiableList(list2);
        this.f23090c = Collections.unmodifiableList(list3);
        this.f23091d = Collections.unmodifiableList(list4);
    }

    /* renamed from: a */
    public List<C6867dw> m16081a() {
        return this.f23088a;
    }

    /* renamed from: b */
    public List<C6867dw> m16080b() {
        return this.f23089b;
    }

    /* renamed from: c */
    public List<C6867dw> m16079c() {
        return this.f23090c;
    }

    /* renamed from: d */
    public List<C6867dw> m16078d() {
        return this.f23091d;
    }

    public String toString() {
        String valueOf = String.valueOf(m16081a());
        String valueOf2 = String.valueOf(m16080b());
        String valueOf3 = String.valueOf(m16079c());
        String valueOf4 = String.valueOf(m16078d());
        return new StringBuilder(String.valueOf(valueOf).length() + 71 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length()).append("Positive predicates: ").append(valueOf).append("  Negative predicates: ").append(valueOf2).append("  Add tags: ").append(valueOf3).append("  Remove tags: ").append(valueOf4).toString();
    }
}
