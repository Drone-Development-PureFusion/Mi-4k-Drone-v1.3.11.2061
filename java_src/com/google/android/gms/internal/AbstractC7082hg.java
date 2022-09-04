package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7078he;
import java.util.Comparator;
/* renamed from: com.google.android.gms.internal.hg */
/* loaded from: classes2.dex */
public abstract class AbstractC7082hg<K, V> implements AbstractC7078he<K, V> {

    /* renamed from: a */
    private final K f23862a;

    /* renamed from: b */
    private final V f23863b;

    /* renamed from: c */
    private AbstractC7078he<K, V> f23864c;

    /* renamed from: d */
    private final AbstractC7078he<K, V> f23865d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC7082hg(K k, V v, AbstractC7078he<K, V> abstractC7078he, AbstractC7078he<K, V> abstractC7078he2) {
        this.f23862a = k;
        this.f23863b = v;
        this.f23864c = abstractC7078he == null ? C7077hd.m15650a() : abstractC7078he;
        this.f23865d = abstractC7078he2 == null ? C7077hd.m15650a() : abstractC7078he2;
    }

    /* renamed from: b */
    private static AbstractC7078he.EnumC7079a m15641b(AbstractC7078he abstractC7078he) {
        return abstractC7078he.mo15649b() ? AbstractC7078he.EnumC7079a.BLACK : AbstractC7078he.EnumC7079a.RED;
    }

    /* renamed from: k */
    private AbstractC7078he<K, V> m15631k() {
        if (this.f23864c.mo15639c()) {
            return C7077hd.m15650a();
        }
        if (!mo15636f().mo15649b() && !mo15636f().mo15636f().mo15649b()) {
            this = m15630l();
        }
        return this.mo15644a(null, null, ((AbstractC7082hg) this.f23864c).m15631k(), null).m15628n();
    }

    /* renamed from: l */
    private AbstractC7082hg<K, V> m15630l() {
        AbstractC7082hg<K, V> m15625q = m15625q();
        return m15625q.mo15635g().mo15636f().mo15649b() ? m15625q.mo15644a(null, null, null, ((AbstractC7082hg) m15625q.mo15635g()).m15626p()).m15627o().m15625q() : m15625q;
    }

    /* renamed from: m */
    private AbstractC7082hg<K, V> m15629m() {
        AbstractC7082hg<K, V> m15625q = m15625q();
        return m15625q.mo15636f().mo15636f().mo15649b() ? m15625q.m15626p().m15625q() : m15625q;
    }

    /* renamed from: n */
    private AbstractC7082hg<K, V> m15628n() {
        if (this.f23865d.mo15649b() && !this.f23864c.mo15649b()) {
            this = m15627o();
        }
        if (this.f23864c.mo15649b() && ((AbstractC7082hg) this.f23864c).f23864c.mo15649b()) {
            this = this.m15626p();
        }
        return (!this.f23864c.mo15649b() || !this.f23865d.mo15649b()) ? this : this.m15625q();
    }

    /* renamed from: o */
    private AbstractC7082hg<K, V> m15627o() {
        return (AbstractC7082hg) this.f23865d.mo15645a(null, null, mo15648a(), (AbstractC7082hg) mo15645a(null, null, AbstractC7078he.EnumC7079a.RED, null, ((AbstractC7082hg) this.f23865d).f23864c), null);
    }

    /* renamed from: p */
    private AbstractC7082hg<K, V> m15626p() {
        return (AbstractC7082hg) this.f23864c.mo15645a(null, null, mo15648a(), null, (AbstractC7082hg) mo15645a(null, null, AbstractC7078he.EnumC7079a.RED, ((AbstractC7082hg) this.f23864c).f23865d, null));
    }

    /* renamed from: q */
    private AbstractC7082hg<K, V> m15625q() {
        return (AbstractC7082hg) mo15645a(null, null, m15641b(this), this.f23864c.mo15645a(null, null, m15641b(this.f23864c), null, null), this.f23865d.mo15645a(null, null, m15641b(this.f23865d), null, null));
    }

    /* renamed from: a */
    protected abstract AbstractC7078he.EnumC7079a mo15648a();

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: a */
    public AbstractC7078he<K, V> mo15643a(K k, V v, Comparator<K> comparator) {
        int compare = comparator.compare(k, this.f23862a);
        return (compare < 0 ? mo15644a(null, null, this.f23864c.mo15643a(k, v, comparator), null) : compare == 0 ? mo15644a(k, v, null, null) : mo15644a(null, null, null, this.f23865d.mo15643a(k, v, comparator))).m15628n();
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: a */
    public AbstractC7078he<K, V> mo15642a(K k, Comparator<K> comparator) {
        AbstractC7082hg<K, V> mo15644a;
        if (comparator.compare(k, this.f23862a) < 0) {
            if (!this.f23864c.mo15639c() && !this.f23864c.mo15649b() && !((AbstractC7082hg) this.f23864c).f23864c.mo15649b()) {
                this = m15630l();
            }
            mo15644a = this.mo15644a(null, null, this.f23864c.mo15642a(k, comparator), null);
        } else {
            if (this.f23864c.mo15649b()) {
                this = m15626p();
            }
            if (!this.f23865d.mo15639c() && !this.f23865d.mo15649b() && !((AbstractC7082hg) this.f23865d).f23864c.mo15649b()) {
                this = this.m15629m();
            }
            if (comparator.compare(k, this.f23862a) == 0) {
                if (this.f23865d.mo15639c()) {
                    return C7077hd.m15650a();
                }
                AbstractC7078he<K, V> mo15634h = this.f23865d.mo15634h();
                this = this.mo15644a(mo15634h.mo15638d(), mo15634h.mo15637e(), null, ((AbstractC7082hg) this.f23865d).m15631k());
            }
            mo15644a = this.mo15644a(null, null, null, this.f23865d.mo15642a(k, comparator));
        }
        return mo15644a.m15628n();
    }

    /* renamed from: a */
    protected abstract AbstractC7082hg<K, V> mo15644a(K k, V v, AbstractC7078he<K, V> abstractC7078he, AbstractC7078he<K, V> abstractC7078he2);

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: a */
    public void mo15647a(AbstractC7078he.AbstractC7080b<K, V> abstractC7080b) {
        this.f23864c.mo15647a(abstractC7080b);
        abstractC7080b.mo14811a(this.f23862a, this.f23863b);
        this.f23865d.mo15647a(abstractC7080b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15646a(AbstractC7078he<K, V> abstractC7078he) {
        this.f23864c = abstractC7078he;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: b */
    public AbstractC7082hg<K, V> mo15645a(K k, V v, AbstractC7078he.EnumC7079a enumC7079a, AbstractC7078he<K, V> abstractC7078he, AbstractC7078he<K, V> abstractC7078he2) {
        if (k == null) {
            k = this.f23862a;
        }
        if (v == null) {
            v = this.f23863b;
        }
        if (abstractC7078he == null) {
            abstractC7078he = this.f23864c;
        }
        if (abstractC7078he2 == null) {
            abstractC7078he2 = this.f23865d;
        }
        return enumC7079a == AbstractC7078he.EnumC7079a.RED ? new C7081hf(k, v, abstractC7078he, abstractC7078he2) : new C7076hc(k, v, abstractC7078he, abstractC7078he2);
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: c */
    public boolean mo15639c() {
        return false;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: d */
    public K mo15638d() {
        return this.f23862a;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: e */
    public V mo15637e() {
        return this.f23863b;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: f */
    public AbstractC7078he<K, V> mo15636f() {
        return this.f23864c;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: g */
    public AbstractC7078he<K, V> mo15635g() {
        return this.f23865d;
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: h */
    public AbstractC7078he<K, V> mo15634h() {
        return this.f23864c.mo15639c() ? this : this.f23864c.mo15634h();
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: i */
    public AbstractC7078he<K, V> mo15633i() {
        return this.f23865d.mo15639c() ? this : this.f23865d.mo15633i();
    }

    @Override // com.google.android.gms.internal.AbstractC7078he
    /* renamed from: j */
    public int mo15632j() {
        return this.f23864c.mo15632j() + 1 + this.f23865d.mo15632j();
    }
}
