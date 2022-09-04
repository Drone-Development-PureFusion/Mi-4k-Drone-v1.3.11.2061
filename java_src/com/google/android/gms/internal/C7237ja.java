package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7287kc;
import com.google.firebase.database.AbstractC9901r;
import com.google.firebase.database.C9831c;
import com.google.firebase.database.C9902s;
/* renamed from: com.google.android.gms.internal.ja */
/* loaded from: classes2.dex */
public class C7237ja extends AbstractC7151ie {

    /* renamed from: b */
    private final C7164im f24298b;

    /* renamed from: c */
    private final AbstractC9901r f24299c;

    /* renamed from: d */
    private final C7296kg f24300d;

    public C7237ja(C7164im c7164im, AbstractC9901r abstractC9901r, C7296kg c7296kg) {
        this.f24298b = c7164im;
        this.f24299c = abstractC9901r;
        this.f24300d = c7296kg;
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public AbstractC7151ie mo15135a(C7296kg c7296kg) {
        return new C7237ja(this.f24298b, this.f24299c, c7296kg);
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public C7286kb mo15138a(C7285ka c7285ka, C7296kg c7296kg) {
        return new C7286kb(AbstractC7287kc.EnumC7288a.VALUE, this, C9902s.m6641a(C9902s.m6643a(this.f24298b, c7296kg.m14900a()), c7285ka.m14942c()), null);
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public C7296kg mo15140a() {
        return this.f24300d;
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public void mo15137a(C7286kb c7286kb) {
        if (c()) {
            return;
        }
        this.f24299c.mo6645a(c7286kb.m14937c());
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public void mo15134a(C9831c c9831c) {
        this.f24299c.mo6644a(c9831c);
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public boolean mo15139a(AbstractC7151ie abstractC7151ie) {
        return (abstractC7151ie instanceof C7237ja) && ((C7237ja) abstractC7151ie).f24299c.equals(this.f24299c);
    }

    @Override // com.google.android.gms.internal.AbstractC7151ie
    /* renamed from: a */
    public boolean mo15136a(AbstractC7287kc.EnumC7288a enumC7288a) {
        return enumC7288a == AbstractC7287kc.EnumC7288a.VALUE;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7237ja) && ((C7237ja) obj).f24299c.equals(this.f24299c) && ((C7237ja) obj).f24298b.equals(this.f24298b) && ((C7237ja) obj).f24300d.equals(this.f24300d);
    }

    public int hashCode() {
        return (((this.f24299c.hashCode() * 31) + this.f24298b.hashCode()) * 31) + this.f24300d.hashCode();
    }

    public String toString() {
        return "ValueEventRegistration";
    }
}
