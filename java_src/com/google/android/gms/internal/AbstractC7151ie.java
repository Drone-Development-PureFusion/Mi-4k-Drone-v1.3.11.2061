package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7287kc;
import com.google.firebase.database.C9831c;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.google.android.gms.internal.ie */
/* loaded from: classes2.dex */
public abstract class AbstractC7151ie {

    /* renamed from: a */
    static final /* synthetic */ boolean f24066a;

    /* renamed from: c */
    private AbstractC7152if f24068c;

    /* renamed from: b */
    private AtomicBoolean f24067b = new AtomicBoolean(false);

    /* renamed from: d */
    private boolean f24069d = false;

    static {
        f24066a = !AbstractC7151ie.class.desiredAssertionStatus();
    }

    /* renamed from: a */
    public abstract AbstractC7151ie mo15135a(C7296kg c7296kg);

    /* renamed from: a */
    public abstract C7286kb mo15138a(C7285ka c7285ka, C7296kg c7296kg);

    /* renamed from: a */
    public abstract C7296kg mo15140a();

    /* renamed from: a */
    public void m15379a(AbstractC7152if abstractC7152if) {
        if (f24066a || !m15376c()) {
            if (!f24066a && this.f24068c != null) {
                throw new AssertionError();
            }
            this.f24068c = abstractC7152if;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public abstract void mo15137a(C7286kb c7286kb);

    /* renamed from: a */
    public abstract void mo15134a(C9831c c9831c);

    /* renamed from: a */
    public void m15378a(boolean z) {
        this.f24069d = z;
    }

    /* renamed from: a */
    public abstract boolean mo15139a(AbstractC7151ie abstractC7151ie);

    /* renamed from: a */
    public abstract boolean mo15136a(AbstractC7287kc.EnumC7288a enumC7288a);

    /* renamed from: b */
    public void m15377b() {
        if (!this.f24067b.compareAndSet(false, true) || this.f24068c == null) {
            return;
        }
        this.f24068c.mo15106a(this);
        this.f24068c = null;
    }

    /* renamed from: c */
    public boolean m15376c() {
        return this.f24067b.get();
    }

    /* renamed from: d */
    public boolean m15375d() {
        return this.f24069d;
    }
}
