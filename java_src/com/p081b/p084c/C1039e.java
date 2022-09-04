package com.p081b.p084c;

import android.view.View;
import android.view.animation.Interpolator;
import com.p081b.p082a.AbstractC0971a;
import com.p081b.p082a.C1015q;
import com.p081b.p084c.p085a.C1030a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.b.c.e */
/* loaded from: classes.dex */
public class C1039e extends AbstractC1031b {

    /* renamed from: l */
    private static final int f2387l = 0;

    /* renamed from: m */
    private static final int f2388m = 1;

    /* renamed from: n */
    private static final int f2389n = 2;

    /* renamed from: o */
    private static final int f2390o = 4;

    /* renamed from: p */
    private static final int f2391p = 8;

    /* renamed from: q */
    private static final int f2392q = 16;

    /* renamed from: r */
    private static final int f2393r = 32;

    /* renamed from: s */
    private static final int f2394s = 64;

    /* renamed from: t */
    private static final int f2395t = 128;

    /* renamed from: u */
    private static final int f2396u = 256;

    /* renamed from: v */
    private static final int f2397v = 512;

    /* renamed from: w */
    private static final int f2398w = 511;

    /* renamed from: b */
    private final C1030a f2400b;

    /* renamed from: c */
    private final WeakReference<View> f2401c;

    /* renamed from: d */
    private long f2402d;

    /* renamed from: h */
    private Interpolator f2406h;

    /* renamed from: e */
    private boolean f2403e = false;

    /* renamed from: f */
    private long f2404f = 0;

    /* renamed from: g */
    private boolean f2405g = false;

    /* renamed from: i */
    private boolean f2407i = false;

    /* renamed from: j */
    private AbstractC0971a.AbstractC0972a f2408j = null;

    /* renamed from: k */
    private C1041a f2409k = new C1041a();

    /* renamed from: a */
    ArrayList<C1042b> f2399a = new ArrayList<>();

    /* renamed from: x */
    private Runnable f2410x = new Runnable() { // from class: com.b.c.e.1
        @Override // java.lang.Runnable
        public void run() {
            C1039e.this.m36909e();
        }
    };

    /* renamed from: y */
    private HashMap<AbstractC0971a, C1043c> f2411y = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.b.c.e$a */
    /* loaded from: classes.dex */
    public class C1041a implements AbstractC0971a.AbstractC0972a, C1015q.AbstractC1022b {
        private C1041a() {
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: a */
        public void mo36892a(AbstractC0971a abstractC0971a) {
            if (C1039e.this.f2408j != null) {
                C1039e.this.f2408j.mo36892a(abstractC0971a);
            }
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: b */
        public void mo36891b(AbstractC0971a abstractC0971a) {
            if (C1039e.this.f2408j != null) {
                C1039e.this.f2408j.mo36891b(abstractC0971a);
            }
            C1039e.this.f2411y.remove(abstractC0971a);
            if (C1039e.this.f2411y.isEmpty()) {
                C1039e.this.f2408j = null;
            }
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: c */
        public void mo36890c(AbstractC0971a abstractC0971a) {
            if (C1039e.this.f2408j != null) {
                C1039e.this.f2408j.mo36890c(abstractC0971a);
            }
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: d */
        public void mo36889d(AbstractC0971a abstractC0971a) {
            if (C1039e.this.f2408j != null) {
                C1039e.this.f2408j.mo36889d(abstractC0971a);
            }
        }

        @Override // com.p081b.p082a.C1015q.AbstractC1022b
        public void onAnimationUpdate(C1015q c1015q) {
            View view;
            float m37110A = c1015q.m37110A();
            C1043c c1043c = (C1043c) C1039e.this.f2411y.get(c1015q);
            if ((c1043c.f2417a & 511) != 0 && (view = (View) C1039e.this.f2401c.get()) != null) {
                view.invalidate();
            }
            ArrayList<C1042b> arrayList = c1043c.f2418b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C1042b c1042b = arrayList.get(i);
                    C1039e.this.m36914c(c1042b.f2414a, c1042b.f2415b + (c1042b.f2416c * m37110A));
                }
            }
            View view2 = (View) C1039e.this.f2401c.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.b.c.e$b */
    /* loaded from: classes.dex */
    public static class C1042b {

        /* renamed from: a */
        int f2414a;

        /* renamed from: b */
        float f2415b;

        /* renamed from: c */
        float f2416c;

        C1042b(int i, float f, float f2) {
            this.f2414a = i;
            this.f2415b = f;
            this.f2416c = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.b.c.e$c */
    /* loaded from: classes.dex */
    public static class C1043c {

        /* renamed from: a */
        int f2417a;

        /* renamed from: b */
        ArrayList<C1042b> f2418b;

        C1043c(int i, ArrayList<C1042b> arrayList) {
            this.f2417a = i;
            this.f2418b = arrayList;
        }

        /* renamed from: a */
        boolean m36888a(int i) {
            if ((this.f2417a & i) != 0 && this.f2418b != null) {
                int size = this.f2418b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f2418b.get(i2).f2414a == i) {
                        this.f2418b.remove(i2);
                        this.f2417a &= i ^ (-1);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1039e(View view) {
        this.f2401c = new WeakReference<>(view);
        this.f2400b = C1030a.m37001a(view);
    }

    /* renamed from: a */
    private float m36930a(int i) {
        switch (i) {
            case 1:
                return this.f2400b.m36960k();
            case 2:
                return this.f2400b.m36956l();
            case 4:
                return this.f2400b.m36976g();
            case 8:
                return this.f2400b.m36972h();
            case 16:
                return this.f2400b.m36988d();
            case 32:
                return this.f2400b.m36984e();
            case 64:
                return this.f2400b.m36980f();
            case 128:
                return this.f2400b.m36952m();
            case 256:
                return this.f2400b.m36950n();
            case 512:
                return this.f2400b.m37007a();
            default:
                return 0.0f;
        }
    }

    /* renamed from: a */
    private void m36929a(int i, float f) {
        float m36930a = m36930a(i);
        m36928a(i, m36930a, f - m36930a);
    }

    /* renamed from: a */
    private void m36928a(int i, float f, float f2) {
        AbstractC0971a abstractC0971a;
        if (this.f2411y.size() > 0) {
            Iterator<AbstractC0971a> it2 = this.f2411y.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    abstractC0971a = null;
                    break;
                }
                abstractC0971a = it2.next();
                C1043c c1043c = this.f2411y.get(abstractC0971a);
                if (c1043c.m36888a(i) && c1043c.f2417a == 0) {
                    break;
                }
            }
            if (abstractC0971a != null) {
                abstractC0971a.mo37085b();
            }
        }
        this.f2399a.add(new C1042b(i, f, f2));
        View view = this.f2401c.get();
        if (view != null) {
            view.removeCallbacks(this.f2410x);
            view.post(this.f2410x);
        }
    }

    /* renamed from: b */
    private void m36919b(int i, float f) {
        m36928a(i, m36930a(i), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m36914c(int i, float f) {
        switch (i) {
            case 1:
                this.f2400b.m36967i(f);
                return;
            case 2:
                this.f2400b.m36963j(f);
                return;
            case 4:
                this.f2400b.m36975g(f);
                return;
            case 8:
                this.f2400b.m36971h(f);
                return;
            case 16:
                this.f2400b.m36987d(f);
                return;
            case 32:
                this.f2400b.m36983e(f);
                return;
            case 64:
                this.f2400b.m36979f(f);
                return;
            case 128:
                this.f2400b.m36959k(f);
                return;
            case 256:
                this.f2400b.m36955l(f);
                return;
            case 512:
                this.f2400b.m37006a(f);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m36909e() {
        C1015q m37079b = C1015q.m37079b(1.0f);
        ArrayList arrayList = (ArrayList) this.f2399a.clone();
        this.f2399a.clear();
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i |= ((C1042b) arrayList.get(i2)).f2414a;
        }
        this.f2411y.put(m37079b, new C1043c(i, arrayList));
        m37079b.m37094a((C1015q.AbstractC1022b) this.f2409k);
        m37079b.a((AbstractC0971a.AbstractC0972a) this.f2409k);
        if (this.f2405g) {
            m37079b.mo37098a(this.f2404f);
        }
        if (this.f2403e) {
            m37079b.mo37083b(this.f2402d);
        }
        if (this.f2407i) {
            m37079b.mo37097a(this.f2406h);
        }
        m37079b.mo37101a();
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public long mo36932a() {
        return this.f2403e ? this.f2402d : new C1015q().mo37071e();
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36931a(float f) {
        m36929a(128, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36927a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.f2403e = true;
        this.f2402d = j;
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36926a(Interpolator interpolator) {
        this.f2407i = true;
        this.f2406h = interpolator;
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36925a(AbstractC0971a.AbstractC0972a abstractC0972a) {
        this.f2408j = abstractC0972a;
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: b */
    public long mo36921b() {
        if (this.f2405g) {
            return this.f2404f;
        }
        return 0L;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: b */
    public AbstractC1031b mo36920b(float f) {
        m36919b(128, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: b */
    public AbstractC1031b mo36918b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.f2405g = true;
        this.f2404f = j;
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: c */
    public AbstractC1031b mo36915c(float f) {
        m36929a(256, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: c */
    public void mo36916c() {
        m36909e();
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: d */
    public AbstractC1031b mo36911d(float f) {
        m36919b(256, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: d */
    public void mo36912d() {
        if (this.f2411y.size() > 0) {
            for (AbstractC0971a abstractC0971a : ((HashMap) this.f2411y.clone()).keySet()) {
                abstractC0971a.mo37085b();
            }
        }
        this.f2399a.clear();
        View view = this.f2401c.get();
        if (view != null) {
            view.removeCallbacks(this.f2410x);
        }
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: e */
    public AbstractC1031b mo36908e(float f) {
        m36929a(16, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: f */
    public AbstractC1031b mo36907f(float f) {
        m36919b(16, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: g */
    public AbstractC1031b mo36906g(float f) {
        m36929a(32, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: h */
    public AbstractC1031b mo36905h(float f) {
        m36919b(32, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: i */
    public AbstractC1031b mo36904i(float f) {
        m36929a(64, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: j */
    public AbstractC1031b mo36903j(float f) {
        m36919b(64, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: k */
    public AbstractC1031b mo36902k(float f) {
        m36929a(1, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: l */
    public AbstractC1031b mo36901l(float f) {
        m36919b(1, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: m */
    public AbstractC1031b mo36900m(float f) {
        m36929a(2, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: n */
    public AbstractC1031b mo36899n(float f) {
        m36919b(2, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: o */
    public AbstractC1031b mo36898o(float f) {
        m36929a(4, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: p */
    public AbstractC1031b mo36897p(float f) {
        m36919b(4, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: q */
    public AbstractC1031b mo36896q(float f) {
        m36929a(8, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: r */
    public AbstractC1031b mo36895r(float f) {
        m36919b(8, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: s */
    public AbstractC1031b mo36894s(float f) {
        m36929a(512, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: t */
    public AbstractC1031b mo36893t(float f) {
        m36919b(512, f);
        return this;
    }
}
