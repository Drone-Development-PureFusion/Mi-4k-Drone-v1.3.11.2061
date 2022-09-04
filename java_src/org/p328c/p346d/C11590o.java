package org.p328c.p346d;

import java.util.concurrent.TimeUnit;
import org.p328c.p337b.p341d.p344c.C11534c;
import org.p328c.p347e.C11622c;
import org.p328c.p350f.p351a.AbstractC11650j;
/* renamed from: org.c.d.o */
/* loaded from: classes.dex */
public class C11590o implements AbstractC11585l {

    /* renamed from: a */
    private final long f36716a;

    /* renamed from: b */
    private final TimeUnit f36717b;

    /* renamed from: c */
    private final boolean f36718c;

    /* renamed from: org.c.d.o$a */
    /* loaded from: classes2.dex */
    public static class C11592a {

        /* renamed from: a */
        private boolean f36721a = false;

        /* renamed from: b */
        private long f36722b = 0;

        /* renamed from: c */
        private TimeUnit f36723c = TimeUnit.SECONDS;

        protected C11592a() {
        }

        /* renamed from: a */
        protected long m594a() {
            return this.f36722b;
        }

        /* renamed from: a */
        public C11592a m593a(long j, TimeUnit timeUnit) {
            this.f36722b = j;
            this.f36723c = timeUnit;
            return this;
        }

        /* renamed from: a */
        public C11592a m592a(boolean z) {
            this.f36721a = z;
            return this;
        }

        /* renamed from: b */
        protected TimeUnit m591b() {
            return this.f36723c;
        }

        /* renamed from: c */
        protected boolean m590c() {
            return this.f36721a;
        }

        /* renamed from: d */
        public C11590o m589d() {
            return new C11590o(this);
        }
    }

    @Deprecated
    public C11590o(int i) {
        this(i, TimeUnit.MILLISECONDS);
    }

    public C11590o(long j, TimeUnit timeUnit) {
        this.f36716a = j;
        this.f36717b = timeUnit;
        this.f36718c = false;
    }

    protected C11590o(C11592a c11592a) {
        this.f36716a = c11592a.m594a();
        this.f36717b = c11592a.m591b();
        this.f36718c = c11592a.m590c();
    }

    /* renamed from: a */
    public static C11592a m600a() {
        return new C11592a();
    }

    /* renamed from: a */
    public static C11590o m599a(long j) {
        return new C11590o(j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public static C11590o m595b(long j) {
        return new C11590o(j, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    protected final long m598a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f36716a, this.f36717b);
    }

    /* renamed from: a */
    protected AbstractC11650j m597a(AbstractC11650j abstractC11650j) {
        return C11534c.m855b().m851a(this.f36716a, this.f36717b).m848a(this.f36718c).m849a(abstractC11650j);
    }

    @Override // org.p328c.p346d.AbstractC11585l
    /* renamed from: a */
    public AbstractC11650j mo587a(AbstractC11650j abstractC11650j, C11622c c11622c) {
        try {
            return m597a(abstractC11650j);
        } catch (Exception e) {
            return new AbstractC11650j() { // from class: org.c.d.o.1
                @Override // org.p328c.p350f.p351a.AbstractC11650j
                /* renamed from: a */
                public void mo318a() {
                    throw new RuntimeException("Invalid parameters for Timeout", e);
                }
            };
        }
    }

    /* renamed from: b */
    protected final boolean m596b() {
        return this.f36718c;
    }
}
