package com.p081b.p082a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
/* renamed from: com.b.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0971a implements Cloneable {

    /* renamed from: a */
    ArrayList<AbstractC0972a> f2175a = null;

    /* renamed from: com.b.a.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0972a {
        /* renamed from: a */
        void mo36892a(AbstractC0971a abstractC0971a);

        /* renamed from: b */
        void mo36891b(AbstractC0971a abstractC0971a);

        /* renamed from: c */
        void mo36890c(AbstractC0971a abstractC0971a);

        /* renamed from: d */
        void mo36889d(AbstractC0971a abstractC0971a);
    }

    /* renamed from: a */
    public void mo37101a() {
    }

    /* renamed from: a */
    public abstract void mo37098a(long j);

    /* renamed from: a */
    public abstract void mo37097a(Interpolator interpolator);

    /* renamed from: a */
    public void m37252a(AbstractC0972a abstractC0972a) {
        if (this.f2175a == null) {
            this.f2175a = new ArrayList<>();
        }
        this.f2175a.add(abstractC0972a);
    }

    /* renamed from: a */
    public void mo37188a(Object obj) {
    }

    /* renamed from: b */
    public abstract AbstractC0971a mo37083b(long j);

    /* renamed from: b */
    public void mo37085b() {
    }

    /* renamed from: b */
    public void m37251b(AbstractC0972a abstractC0972a) {
        if (this.f2175a == null) {
            return;
        }
        this.f2175a.remove(abstractC0972a);
        if (this.f2175a.size() != 0) {
            return;
        }
        this.f2175a = null;
    }

    /* renamed from: c */
    public void mo37076c() {
    }

    /* renamed from: d */
    public abstract long mo37073d();

    /* renamed from: e */
    public abstract long mo37071e();

    /* renamed from: f */
    public abstract boolean mo37069f();

    /* renamed from: g */
    public boolean mo37067g() {
        return mo37069f();
    }

    /* renamed from: h */
    public ArrayList<AbstractC0972a> m37250h() {
        return this.f2175a;
    }

    /* renamed from: i */
    public void m37249i() {
        if (this.f2175a != null) {
            this.f2175a.clear();
            this.f2175a = null;
        }
    }

    @Override // 
    /* renamed from: j */
    public AbstractC0971a clone() {
        try {
            AbstractC0971a abstractC0971a = (AbstractC0971a) super.clone();
            if (this.f2175a != null) {
                ArrayList<AbstractC0972a> arrayList = this.f2175a;
                abstractC0971a.f2175a = new ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    abstractC0971a.f2175a.add(arrayList.get(i));
                }
            }
            return abstractC0971a;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /* renamed from: k */
    public void mo37178k() {
    }

    /* renamed from: l */
    public void mo37177l() {
    }
}
