package p005b.p006a.p007a.p029b;

import java.util.List;
import p005b.p006a.p007a.p029b.p033d.AbstractC0421c;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p055o.C0667k;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.C0688m;
/* renamed from: b.a.a.b.q */
/* loaded from: classes.dex */
public abstract class AbstractC0689q<E> extends C0662f implements AbstractC0401a<E> {

    /* renamed from: l */
    static final int f1228l = 3;

    /* renamed from: k */
    protected String f1234k;

    /* renamed from: j */
    protected boolean f1233j = false;

    /* renamed from: a */
    private ThreadLocal<Boolean> f1229a = new ThreadLocal<>();

    /* renamed from: b */
    private C0667k<E> f1230b = new C0667k<>();

    /* renamed from: c */
    private int f1231c = 0;

    /* renamed from: d */
    private int f1232d = 0;

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: a */
    public void mo38483a(AbstractC0421c<E> abstractC0421c) {
        this.f1230b.mo38483a(abstractC0421c);
    }

    /* renamed from: a */
    protected abstract void mo38482a(E e);

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: a_ */
    public List<AbstractC0421c<E>> mo38481a_() {
        return this.f1230b.mo38481a_();
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0401a
    /* renamed from: b_ */
    public void mo38479b_(String str) {
        this.f1234k = str;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: b_ */
    public boolean mo38480b_() {
        return this.f1233j;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0401a
    /* renamed from: d */
    public void mo38478d(E e) {
        try {
            if (Boolean.TRUE.equals(this.f1229a.get())) {
                return;
            }
            this.f1229a.set(Boolean.TRUE);
            if (this.f1233j) {
                if (mo38477e((AbstractC0689q<E>) e) == EnumC0668l.DENY) {
                    return;
                }
                mo38482a((AbstractC0689q<E>) e);
                return;
            }
            int i = this.f1231c;
            this.f1231c = i + 1;
            if (i < 3) {
                a((AbstractC0682g) new C0688m("Attempted to append to non started appender [" + this.f1234k + "].", this));
            }
        } catch (Exception e2) {
            int i2 = this.f1232d;
            this.f1232d = i2 + 1;
            if (i2 < 3) {
                a("Appender [" + this.f1234k + "] failed to append.", e2);
            }
        } finally {
            this.f1229a.set(Boolean.FALSE);
        }
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: e */
    public EnumC0668l mo38477e(E e) {
        return this.f1230b.mo38477e(e);
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0401a
    /* renamed from: g */
    public String mo38476g() {
        return this.f1234k;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: h */
    public void mo38475h() {
        this.f1230b.mo38475h();
    }

    /* renamed from: j */
    public void mo38474j() {
        this.f1233j = true;
    }

    /* renamed from: k */
    public void mo38473k() {
        this.f1233j = false;
    }

    public String toString() {
        return getClass().getName() + "[" + this.f1234k + "]";
    }
}
