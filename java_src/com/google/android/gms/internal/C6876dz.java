package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.internal.dz */
/* loaded from: classes2.dex */
public final class C6876dz {

    /* renamed from: a */
    private static final String f23100a = new String("");

    /* renamed from: b */
    private static final Integer f23101b = 0;

    /* renamed from: c */
    private final int f23102c;

    /* renamed from: d */
    private final Object f23103d;

    /* renamed from: e */
    private final List<Integer> f23104e;

    /* renamed from: f */
    private final boolean f23105f;

    /* renamed from: com.google.android.gms.internal.dz$a */
    /* loaded from: classes2.dex */
    public static class C6878a {

        /* renamed from: a */
        private final Integer f23106a;

        /* renamed from: b */
        private final Object f23107b;

        /* renamed from: c */
        private final List<Integer> f23108c = new ArrayList();

        /* renamed from: d */
        private boolean f23109d = false;

        public C6878a(int i, Object obj) {
            this.f23106a = Integer.valueOf(i);
            this.f23107b = obj;
        }

        /* renamed from: a */
        public C6878a m16064a(int i) {
            this.f23108c.add(Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public C6878a m16063a(boolean z) {
            this.f23109d = z;
            return this;
        }

        /* renamed from: a */
        public C6876dz m16065a() {
            C4588d.m23627a(this.f23106a);
            C4588d.m23627a(this.f23107b);
            return new C6876dz(this.f23106a, this.f23107b, this.f23108c, this.f23109d);
        }
    }

    private C6876dz(Integer num, Object obj, List<Integer> list, boolean z) {
        this.f23102c = num.intValue();
        this.f23103d = obj;
        this.f23104e = Collections.unmodifiableList(list);
        this.f23105f = z;
    }

    /* renamed from: a */
    public int m16068a() {
        return this.f23102c;
    }

    /* renamed from: b */
    public Object m16067b() {
        return this.f23103d;
    }

    /* renamed from: c */
    public List<Integer> m16066c() {
        return this.f23104e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6876dz) && ((C6876dz) obj).m16067b().equals(this.f23103d);
    }

    public int hashCode() {
        return this.f23103d.hashCode();
    }

    public String toString() {
        if (this.f23103d == null) {
            aph.m16396a("Fail to convert a null object to string");
            return f23100a;
        }
        return this.f23103d.toString();
    }
}
