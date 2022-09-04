package p005b.p006a.p007a.p029b;

import java.util.List;
import p005b.p006a.p007a.p029b.p033d.AbstractC0421c;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p055o.C0667k;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.C0688m;
/* renamed from: b.a.a.b.b */
/* loaded from: classes.dex */
public abstract class AbstractC0404b<E> extends C0662f implements AbstractC0401a<E> {

    /* renamed from: h */
    static final int f479h = 5;

    /* renamed from: g */
    protected String f485g;

    /* renamed from: f */
    protected boolean f484f = false;

    /* renamed from: a */
    private boolean f480a = false;

    /* renamed from: b */
    private C0667k<E> f481b = new C0667k<>();

    /* renamed from: c */
    private int f482c = 0;

    /* renamed from: d */
    private int f483d = 0;

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: a */
    public void mo38483a(AbstractC0421c<E> abstractC0421c) {
        this.f481b.mo38483a(abstractC0421c);
    }

    /* renamed from: a */
    protected abstract void mo38607a(E e);

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: a_ */
    public List<AbstractC0421c<E>> mo38481a_() {
        return this.f481b.mo38481a_();
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0401a
    /* renamed from: b_ */
    public void mo38479b_(String str) {
        this.f485g = str;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: b_ */
    public boolean mo38480b_() {
        return this.f484f;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0401a
    /* renamed from: d */
    public synchronized void mo38478d(E e) {
        if (!this.f480a) {
            try {
                this.f480a = true;
                if (!this.f484f) {
                    int i = this.f482c;
                    this.f482c = i + 1;
                    if (i < 5) {
                        a((AbstractC0682g) new C0688m("Attempted to append to non started appender [" + this.f485g + "].", this));
                    }
                    this.f480a = false;
                } else if (mo38477e((AbstractC0404b<E>) e) == EnumC0668l.DENY) {
                    this.f480a = false;
                } else {
                    mo38607a((AbstractC0404b<E>) e);
                    this.f480a = false;
                }
            } catch (Exception e2) {
                int i2 = this.f483d;
                this.f483d = i2 + 1;
                if (i2 < 5) {
                    a("Appender [" + this.f485g + "] failed to append.", e2);
                }
                this.f480a = false;
            }
        }
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: e */
    public EnumC0668l mo38477e(E e) {
        return this.f481b.mo38477e(e);
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0401a
    /* renamed from: g */
    public String mo38476g() {
        return this.f485g;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0666j
    /* renamed from: h */
    public void mo38475h() {
        this.f481b.mo38475h();
    }

    /* renamed from: j */
    public void mo38474j() {
        this.f484f = true;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f484f = false;
    }

    public String toString() {
        return getClass().getName() + "[" + this.f485g + "]";
    }
}
