package com.p081b.p084c;

import android.view.View;
import android.view.animation.Interpolator;
import com.p081b.p082a.AbstractC0971a;
import com.p081b.p082a.C1015q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.b.c.c */
/* loaded from: classes.dex */
public class C1032c extends AbstractC1031b {

    /* renamed from: k */
    private static final int f2352k = 0;

    /* renamed from: l */
    private static final int f2353l = 1;

    /* renamed from: m */
    private static final int f2354m = 2;

    /* renamed from: n */
    private static final int f2355n = 4;

    /* renamed from: o */
    private static final int f2356o = 8;

    /* renamed from: p */
    private static final int f2357p = 16;

    /* renamed from: q */
    private static final int f2358q = 32;

    /* renamed from: r */
    private static final int f2359r = 64;

    /* renamed from: s */
    private static final int f2360s = 128;

    /* renamed from: t */
    private static final int f2361t = 256;

    /* renamed from: u */
    private static final int f2362u = 512;

    /* renamed from: v */
    private static final int f2363v = 511;

    /* renamed from: b */
    private final WeakReference<View> f2365b;

    /* renamed from: c */
    private long f2366c;

    /* renamed from: g */
    private Interpolator f2370g;

    /* renamed from: d */
    private boolean f2367d = false;

    /* renamed from: e */
    private long f2368e = 0;

    /* renamed from: f */
    private boolean f2369f = false;

    /* renamed from: h */
    private boolean f2371h = false;

    /* renamed from: i */
    private AbstractC0971a.AbstractC0972a f2372i = null;

    /* renamed from: j */
    private C1034a f2373j = new C1034a();

    /* renamed from: a */
    ArrayList<C1035b> f2364a = new ArrayList<>();

    /* renamed from: w */
    private Runnable f2374w = new Runnable() { // from class: com.b.c.c.1
        @Override // java.lang.Runnable
        public void run() {
            C1032c.this.m36934e();
        }
    };

    /* renamed from: x */
    private HashMap<AbstractC0971a, C1036c> f2375x = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.b.c.c$a */
    /* loaded from: classes.dex */
    public class C1034a implements AbstractC0971a.AbstractC0972a, C1015q.AbstractC1022b {
        private C1034a() {
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: a */
        public void mo36892a(AbstractC0971a abstractC0971a) {
            if (C1032c.this.f2372i != null) {
                C1032c.this.f2372i.mo36892a(abstractC0971a);
            }
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: b */
        public void mo36891b(AbstractC0971a abstractC0971a) {
            if (C1032c.this.f2372i != null) {
                C1032c.this.f2372i.mo36891b(abstractC0971a);
            }
            C1032c.this.f2375x.remove(abstractC0971a);
            if (C1032c.this.f2375x.isEmpty()) {
                C1032c.this.f2372i = null;
            }
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: c */
        public void mo36890c(AbstractC0971a abstractC0971a) {
            if (C1032c.this.f2372i != null) {
                C1032c.this.f2372i.mo36890c(abstractC0971a);
            }
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: d */
        public void mo36889d(AbstractC0971a abstractC0971a) {
            if (C1032c.this.f2372i != null) {
                C1032c.this.f2372i.mo36889d(abstractC0971a);
            }
        }

        @Override // com.p081b.p082a.C1015q.AbstractC1022b
        public void onAnimationUpdate(C1015q c1015q) {
            View view;
            float m37110A = c1015q.m37110A();
            C1036c c1036c = (C1036c) C1032c.this.f2375x.get(c1015q);
            if ((c1036c.f2381a & 511) != 0 && (view = (View) C1032c.this.f2365b.get()) != null) {
                view.invalidate();
            }
            ArrayList<C1035b> arrayList = c1036c.f2382b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C1035b c1035b = arrayList.get(i);
                    C1032c.this.m36937c(c1035b.f2378a, c1035b.f2379b + (c1035b.f2380c * m37110A));
                }
            }
            View view2 = (View) C1032c.this.f2365b.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.b.c.c$b */
    /* loaded from: classes.dex */
    public static class C1035b {

        /* renamed from: a */
        int f2378a;

        /* renamed from: b */
        float f2379b;

        /* renamed from: c */
        float f2380c;

        C1035b(int i, float f, float f2) {
            this.f2378a = i;
            this.f2379b = f;
            this.f2380c = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.b.c.c$c */
    /* loaded from: classes.dex */
    public static class C1036c {

        /* renamed from: a */
        int f2381a;

        /* renamed from: b */
        ArrayList<C1035b> f2382b;

        C1036c(int i, ArrayList<C1035b> arrayList) {
            this.f2381a = i;
            this.f2382b = arrayList;
        }

        /* renamed from: a */
        boolean m36933a(int i) {
            if ((this.f2381a & i) != 0 && this.f2382b != null) {
                int size = this.f2382b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f2382b.get(i2).f2378a == i) {
                        this.f2382b.remove(i2);
                        this.f2381a &= i ^ (-1);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1032c(View view) {
        this.f2365b = new WeakReference<>(view);
    }

    /* renamed from: a */
    private float m36945a(int i) {
        View view = this.f2365b.get();
        if (view != null) {
            switch (i) {
                case 1:
                    return view.getTranslationX();
                case 2:
                    return view.getTranslationY();
                case 4:
                    return view.getScaleX();
                case 8:
                    return view.getScaleY();
                case 16:
                    return view.getRotation();
                case 32:
                    return view.getRotationX();
                case 64:
                    return view.getRotationY();
                case 128:
                    return view.getX();
                case 256:
                    return view.getY();
                case 512:
                    return view.getAlpha();
            }
        }
        return 0.0f;
    }

    /* renamed from: a */
    private void m36944a(int i, float f) {
        float m36945a = m36945a(i);
        m36943a(i, m36945a, f - m36945a);
    }

    /* renamed from: a */
    private void m36943a(int i, float f, float f2) {
        AbstractC0971a abstractC0971a;
        if (this.f2375x.size() > 0) {
            Iterator<AbstractC0971a> it2 = this.f2375x.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    abstractC0971a = null;
                    break;
                }
                abstractC0971a = it2.next();
                C1036c c1036c = this.f2375x.get(abstractC0971a);
                if (c1036c.m36933a(i) && c1036c.f2381a == 0) {
                    break;
                }
            }
            if (abstractC0971a != null) {
                abstractC0971a.mo37085b();
            }
        }
        this.f2364a.add(new C1035b(i, f, f2));
        View view = this.f2365b.get();
        if (view != null) {
            view.removeCallbacks(this.f2374w);
            view.post(this.f2374w);
        }
    }

    /* renamed from: b */
    private void m36939b(int i, float f) {
        m36943a(i, m36945a(i), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m36937c(int i, float f) {
        View view = this.f2365b.get();
        if (view != null) {
            switch (i) {
                case 1:
                    view.setTranslationX(f);
                    return;
                case 2:
                    view.setTranslationY(f);
                    return;
                case 4:
                    view.setScaleX(f);
                    return;
                case 8:
                    view.setScaleY(f);
                    return;
                case 16:
                    view.setRotation(f);
                    return;
                case 32:
                    view.setRotationX(f);
                    return;
                case 64:
                    view.setRotationY(f);
                    return;
                case 128:
                    view.setX(f);
                    return;
                case 256:
                    view.setY(f);
                    return;
                case 512:
                    view.setAlpha(f);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m36934e() {
        C1015q m37079b = C1015q.m37079b(1.0f);
        ArrayList arrayList = (ArrayList) this.f2364a.clone();
        this.f2364a.clear();
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i |= ((C1035b) arrayList.get(i2)).f2378a;
        }
        this.f2375x.put(m37079b, new C1036c(i, arrayList));
        m37079b.m37094a((C1015q.AbstractC1022b) this.f2373j);
        m37079b.a((AbstractC0971a.AbstractC0972a) this.f2373j);
        if (this.f2369f) {
            m37079b.mo37098a(this.f2368e);
        }
        if (this.f2367d) {
            m37079b.mo37083b(this.f2366c);
        }
        if (this.f2371h) {
            m37079b.mo37097a(this.f2370g);
        }
        m37079b.mo37101a();
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public long mo36932a() {
        return this.f2367d ? this.f2366c : new C1015q().mo37071e();
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36931a(float f) {
        m36944a(128, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36927a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.f2367d = true;
        this.f2366c = j;
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36926a(Interpolator interpolator) {
        this.f2371h = true;
        this.f2370g = interpolator;
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36925a(AbstractC0971a.AbstractC0972a abstractC0972a) {
        this.f2372i = abstractC0972a;
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: b */
    public long mo36921b() {
        if (this.f2369f) {
            return this.f2368e;
        }
        return 0L;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: b */
    public AbstractC1031b mo36920b(float f) {
        m36939b(128, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: b */
    public AbstractC1031b mo36918b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.f2369f = true;
        this.f2368e = j;
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: c */
    public AbstractC1031b mo36915c(float f) {
        m36944a(256, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: c */
    public void mo36916c() {
        m36934e();
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: d */
    public AbstractC1031b mo36911d(float f) {
        m36939b(256, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: d */
    public void mo36912d() {
        if (this.f2375x.size() > 0) {
            for (AbstractC0971a abstractC0971a : ((HashMap) this.f2375x.clone()).keySet()) {
                abstractC0971a.mo37085b();
            }
        }
        this.f2364a.clear();
        View view = this.f2365b.get();
        if (view != null) {
            view.removeCallbacks(this.f2374w);
        }
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: e */
    public AbstractC1031b mo36908e(float f) {
        m36944a(16, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: f */
    public AbstractC1031b mo36907f(float f) {
        m36939b(16, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: g */
    public AbstractC1031b mo36906g(float f) {
        m36944a(32, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: h */
    public AbstractC1031b mo36905h(float f) {
        m36939b(32, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: i */
    public AbstractC1031b mo36904i(float f) {
        m36944a(64, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: j */
    public AbstractC1031b mo36903j(float f) {
        m36939b(64, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: k */
    public AbstractC1031b mo36902k(float f) {
        m36944a(1, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: l */
    public AbstractC1031b mo36901l(float f) {
        m36939b(1, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: m */
    public AbstractC1031b mo36900m(float f) {
        m36944a(2, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: n */
    public AbstractC1031b mo36899n(float f) {
        m36939b(2, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: o */
    public AbstractC1031b mo36898o(float f) {
        m36944a(4, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: p */
    public AbstractC1031b mo36897p(float f) {
        m36939b(4, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: q */
    public AbstractC1031b mo36896q(float f) {
        m36944a(8, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: r */
    public AbstractC1031b mo36895r(float f) {
        m36939b(8, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: s */
    public AbstractC1031b mo36894s(float f) {
        m36944a(512, f);
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: t */
    public AbstractC1031b mo36893t(float f) {
        m36939b(512, f);
        return this;
    }
}
