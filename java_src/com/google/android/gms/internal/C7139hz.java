package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7287kc;
import com.google.firebase.database.AbstractC9827a;
import com.google.firebase.database.C9831c;
import com.google.firebase.database.C9902s;
/* renamed from: com.google.android.gms.internal.hz */
/* loaded from: classes2.dex */
public class C7139hz extends AbstractC7151ie {

    /* renamed from: b */
    private final C7164im f24033b;

    /* renamed from: c */
    private final AbstractC9827a f24034c;

    /* renamed from: d */
    private final C7296kg f24035d;

    public C7139hz(C7164im c7164im, AbstractC9827a abstractC9827a, C7296kg c7296kg) {
        this.f24033b = c7164im;
        this.f24034c = abstractC9827a;
        this.f24035d = c7296kg;
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public AbstractC7151ie mo15135a(C7296kg c7296kg) {
        return new C7139hz(this.f24033b, this.f24034c, c7296kg);
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public C7286kb mo15138a(C7285ka c7285ka, C7296kg c7296kg) {
        return new C7286kb(c7285ka.m14945b(), this, C9902s.m6641a(C9902s.m6643a(this.f24033b, c7296kg.m14900a().m15368a(c7285ka.m14952a())), c7285ka.m14942c()), c7285ka.m14940d() != null ? c7285ka.m14940d().m14823e() : null);
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public C7296kg mo15140a() {
        return this.f24035d;
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public void mo15137a(C7286kb c7286kb) {
        if (c()) {
            return;
        }
        switch (c7286kb.m14935e()) {
            case CHILD_ADDED:
                this.f24034c.m6878a(c7286kb.m14937c(), c7286kb.m14936d());
                return;
            case CHILD_CHANGED:
                this.f24034c.m6876b(c7286kb.m14937c(), c7286kb.m14936d());
                return;
            case CHILD_MOVED:
                this.f24034c.m6875c(c7286kb.m14937c(), c7286kb.m14936d());
                return;
            case CHILD_REMOVED:
                this.f24034c.m6879a(c7286kb.m14937c());
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public void mo15134a(C9831c c9831c) {
        this.f24034c.m6877a(c9831c);
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public boolean mo15139a(AbstractC7151ie abstractC7151ie) {
        return (abstractC7151ie instanceof C7139hz) && ((C7139hz) abstractC7151ie).f24034c.equals(this.f24034c);
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public boolean mo15136a(AbstractC7287kc.EnumC7288a enumC7288a) {
        return enumC7288a != AbstractC7287kc.EnumC7288a.VALUE;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7139hz) && ((C7139hz) obj).f24034c.equals(this.f24034c) && ((C7139hz) obj).f24033b.equals(this.f24033b) && ((C7139hz) obj).f24035d.equals(this.f24035d);
    }

    public int hashCode() {
        return (((this.f24034c.hashCode() * 31) + this.f24033b.hashCode()) * 31) + this.f24035d.hashCode();
    }

    public String toString() {
        return "ChildEventRegistration";
    }
}
