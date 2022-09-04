package com.p081b.p082a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.p081b.p082a.AbstractC0971a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: com.b.a.q */
/* loaded from: classes.dex */
public class C1015q extends AbstractC0971a {

    /* renamed from: b */
    static final int f2288b = 0;

    /* renamed from: c */
    static final int f2289c = 1;

    /* renamed from: d */
    static final int f2290d = 0;

    /* renamed from: e */
    static final int f2291e = 1;

    /* renamed from: f */
    static final int f2292f = 2;

    /* renamed from: m */
    public static final int f2293m = 1;

    /* renamed from: n */
    public static final int f2294n = 2;

    /* renamed from: o */
    public static final int f2295o = -1;

    /* renamed from: D */
    private long f2309D;

    /* renamed from: g */
    long f2318g;

    /* renamed from: k */
    C1008n[] f2322k;

    /* renamed from: l */
    HashMap<String, C1008n> f2323l;

    /* renamed from: q */
    private static ThreadLocal<HandlerC1021a> f2297q = new ThreadLocal<>();

    /* renamed from: r */
    private static final ThreadLocal<ArrayList<C1015q>> f2298r = new ThreadLocal<ArrayList<C1015q>>() { // from class: com.b.a.q.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<C1015q> initialValue() {
            return new ArrayList<>();
        }
    };

    /* renamed from: s */
    private static final ThreadLocal<ArrayList<C1015q>> f2299s = new ThreadLocal<ArrayList<C1015q>>() { // from class: com.b.a.q.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<C1015q> initialValue() {
            return new ArrayList<>();
        }
    };

    /* renamed from: t */
    private static final ThreadLocal<ArrayList<C1015q>> f2300t = new ThreadLocal<ArrayList<C1015q>>() { // from class: com.b.a.q.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<C1015q> initialValue() {
            return new ArrayList<>();
        }
    };

    /* renamed from: u */
    private static final ThreadLocal<ArrayList<C1015q>> f2301u = new ThreadLocal<ArrayList<C1015q>>() { // from class: com.b.a.q.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<C1015q> initialValue() {
            return new ArrayList<>();
        }
    };

    /* renamed from: v */
    private static final ThreadLocal<ArrayList<C1015q>> f2302v = new ThreadLocal<ArrayList<C1015q>>() { // from class: com.b.a.q.5
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ArrayList<C1015q> initialValue() {
            return new ArrayList<>();
        }
    };

    /* renamed from: w */
    private static final Interpolator f2303w = new AccelerateDecelerateInterpolator();

    /* renamed from: x */
    private static final AbstractC1014p f2304x = new C0985h();

    /* renamed from: y */
    private static final AbstractC1014p f2305y = new C0983f();

    /* renamed from: p */
    private static final long f2296p = 10;

    /* renamed from: I */
    private static long f2287I = f2296p;

    /* renamed from: h */
    long f2319h = -1;

    /* renamed from: z */
    private boolean f2324z = false;

    /* renamed from: A */
    private int f2306A = 0;

    /* renamed from: B */
    private float f2307B = 0.0f;

    /* renamed from: C */
    private boolean f2308C = false;

    /* renamed from: i */
    int f2320i = 0;

    /* renamed from: E */
    private boolean f2310E = false;

    /* renamed from: F */
    private boolean f2311F = false;

    /* renamed from: j */
    boolean f2321j = false;

    /* renamed from: G */
    private long f2312G = 300;

    /* renamed from: H */
    private long f2313H = 0;

    /* renamed from: J */
    private int f2314J = 0;

    /* renamed from: K */
    private int f2315K = 1;

    /* renamed from: L */
    private Interpolator f2316L = f2303w;

    /* renamed from: M */
    private ArrayList<AbstractC1022b> f2317M = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.b.a.q$a */
    /* loaded from: classes.dex */
    public static class HandlerC1021a extends Handler {
        private HandlerC1021a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z;
            int i;
            ArrayList arrayList = (ArrayList) C1015q.f2298r.get();
            ArrayList arrayList2 = (ArrayList) C1015q.f2300t.get();
            switch (message.what) {
                case 0:
                    ArrayList arrayList3 = (ArrayList) C1015q.f2299s.get();
                    z = arrayList.size() <= 0 && arrayList2.size() <= 0;
                    while (arrayList3.size() > 0) {
                        ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                        arrayList3.clear();
                        int size = arrayList4.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            C1015q c1015q = (C1015q) arrayList4.get(i2);
                            if (c1015q.f2313H == 0) {
                                c1015q.m37062o();
                            } else {
                                arrayList2.add(c1015q);
                            }
                        }
                    }
                    break;
                case 1:
                    z = true;
                    break;
                default:
                    return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            ArrayList arrayList5 = (ArrayList) C1015q.f2302v.get();
            ArrayList arrayList6 = (ArrayList) C1015q.f2301u.get();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C1015q c1015q2 = (C1015q) arrayList2.get(i3);
                if (c1015q2.m37066g(currentAnimationTimeMillis)) {
                    arrayList5.add(c1015q2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i4 = 0; i4 < size3; i4++) {
                    C1015q c1015q3 = (C1015q) arrayList5.get(i4);
                    c1015q3.m37062o();
                    c1015q3.f2310E = true;
                    arrayList2.remove(c1015q3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i5 = 0;
            while (i5 < size4) {
                C1015q c1015q4 = (C1015q) arrayList.get(i5);
                if (c1015q4.mo37075c(currentAnimationTimeMillis)) {
                    arrayList6.add(c1015q4);
                }
                if (arrayList.size() == size4) {
                    i = i5 + 1;
                } else {
                    size4--;
                    arrayList6.remove(c1015q4);
                    i = i5;
                }
                size4 = size4;
                i5 = i;
            }
            if (arrayList6.size() > 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6;
                    if (i7 < arrayList6.size()) {
                        ((C1015q) arrayList6.get(i7)).m37064m();
                        i6 = i7 + 1;
                    } else {
                        arrayList6.clear();
                    }
                }
            }
            if (z) {
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                sendEmptyMessageDelayed(1, Math.max(0L, C1015q.f2287I - (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
            }
        }
    }

    /* renamed from: com.b.a.q$b */
    /* loaded from: classes.dex */
    public interface AbstractC1022b {
        void onAnimationUpdate(C1015q c1015q);
    }

    /* renamed from: B */
    public static int m37109B() {
        return f2298r.get().size();
    }

    /* renamed from: C */
    public static void m37108C() {
        f2298r.get().clear();
        f2299s.get().clear();
        f2300t.get().clear();
    }

    /* renamed from: a */
    public static C1015q m37095a(AbstractC1014p abstractC1014p, Object... objArr) {
        C1015q c1015q = new C1015q();
        c1015q.mo37086a(objArr);
        c1015q.m37096a(abstractC1014p);
        return c1015q;
    }

    /* renamed from: a */
    public static C1015q m37087a(C1008n... c1008nArr) {
        C1015q c1015q = new C1015q();
        c1015q.m37077b(c1008nArr);
        return c1015q;
    }

    /* renamed from: a */
    private void m37090a(boolean z) {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        this.f2324z = z;
        this.f2306A = 0;
        this.f2320i = 0;
        this.f2311F = true;
        this.f2308C = false;
        f2299s.get().add(this);
        if (this.f2313H == 0) {
            m37070e(m37059s());
            this.f2320i = 0;
            this.f2310E = true;
            if (this.f2175a != null) {
                ArrayList arrayList = (ArrayList) this.f2175a.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC0971a.AbstractC0972a) arrayList.get(i)).mo36892a(this);
                }
            }
        }
        HandlerC1021a handlerC1021a = f2297q.get();
        if (handlerC1021a == null) {
            handlerC1021a = new HandlerC1021a();
            f2297q.set(handlerC1021a);
        }
        handlerC1021a.sendEmptyMessage(0);
    }

    /* renamed from: b */
    public static C1015q m37079b(float... fArr) {
        C1015q c1015q = new C1015q();
        c1015q.mo37089a(fArr);
        return c1015q;
    }

    /* renamed from: b */
    public static C1015q m37078b(int... iArr) {
        C1015q c1015q = new C1015q();
        c1015q.mo37088a(iArr);
        return c1015q;
    }

    /* renamed from: f */
    public static void m37068f(long j) {
        f2287I = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m37066g(long j) {
        if (!this.f2308C) {
            this.f2308C = true;
            this.f2309D = j;
        } else {
            long j2 = j - this.f2309D;
            if (j2 > this.f2313H) {
                this.f2318g = j - (j2 - this.f2313H);
                this.f2320i = 1;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m37064m() {
        f2298r.get().remove(this);
        f2299s.get().remove(this);
        f2300t.get().remove(this);
        this.f2320i = 0;
        if (this.f2310E && this.f2175a != null) {
            ArrayList arrayList = (ArrayList) this.f2175a.clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0971a.AbstractC0972a) arrayList.get(i)).mo36891b(this);
            }
        }
        this.f2310E = false;
        this.f2311F = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m37062o() {
        mo37063n();
        f2298r.get().add(this);
        if (this.f2313H <= 0 || this.f2175a == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f2175a.clone();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0971a.AbstractC0972a) arrayList.get(i)).mo36892a(this);
        }
    }

    /* renamed from: t */
    public static long m37058t() {
        return f2287I;
    }

    /* renamed from: A */
    public float m37110A() {
        return this.f2307B;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: a */
    public void mo37101a() {
        m37090a(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37100a(float f) {
        float interpolation = this.f2316L.getInterpolation(f);
        this.f2307B = interpolation;
        int length = this.f2322k.length;
        for (int i = 0; i < length; i++) {
            this.f2322k[i].mo37119a(interpolation);
        }
        if (this.f2317M != null) {
            int size = this.f2317M.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2317M.get(i2).onAnimationUpdate(this);
            }
        }
    }

    /* renamed from: a */
    public void m37099a(int i) {
        this.f2314J = i;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: a */
    public void mo37098a(long j) {
        this.f2313H = j;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: a */
    public void mo37097a(Interpolator interpolator) {
        if (interpolator != null) {
            this.f2316L = interpolator;
        } else {
            this.f2316L = new LinearInterpolator();
        }
    }

    /* renamed from: a */
    public void m37096a(AbstractC1014p abstractC1014p) {
        if (abstractC1014p == null || this.f2322k == null || this.f2322k.length <= 0) {
            return;
        }
        this.f2322k[0].m37145a(abstractC1014p);
    }

    /* renamed from: a */
    public void m37094a(AbstractC1022b abstractC1022b) {
        if (this.f2317M == null) {
            this.f2317M = new ArrayList<>();
        }
        this.f2317M.add(abstractC1022b);
    }

    /* renamed from: a */
    public void mo37089a(float... fArr) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        if (this.f2322k == null || this.f2322k.length == 0) {
            m37077b(C1008n.m37132a("", fArr));
        } else {
            this.f2322k[0].mo37122a(fArr);
        }
        this.f2321j = false;
    }

    /* renamed from: a */
    public void mo37088a(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        if (this.f2322k == null || this.f2322k.length == 0) {
            m37077b(C1008n.m37131a("", iArr));
        } else {
            this.f2322k[0].mo37117a(iArr);
        }
        this.f2321j = false;
    }

    /* renamed from: a */
    public void mo37086a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        if (this.f2322k == null || this.f2322k.length == 0) {
            m37077b(C1008n.m37134a("", (AbstractC1014p) null, objArr));
        } else {
            this.f2322k[0].m37128a(objArr);
        }
        this.f2321j = false;
    }

    /* renamed from: b */
    public Object m37080b(String str) {
        C1008n c1008n = this.f2323l.get(str);
        if (c1008n != null) {
            return c1008n.mo37116d();
        }
        return null;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: b */
    public void mo37085b() {
        if (this.f2320i != 0 || f2299s.get().contains(this) || f2300t.get().contains(this)) {
            if (this.f2310E && this.f2175a != null) {
                Iterator it2 = ((ArrayList) this.f2175a.clone()).iterator();
                while (it2.hasNext()) {
                    ((AbstractC0971a.AbstractC0972a) it2.next()).mo36890c(this);
                }
            }
            m37064m();
        }
    }

    /* renamed from: b */
    public void m37084b(int i) {
        this.f2315K = i;
    }

    /* renamed from: b */
    public void m37082b(AbstractC1022b abstractC1022b) {
        if (this.f2317M == null) {
            return;
        }
        this.f2317M.remove(abstractC1022b);
        if (this.f2317M.size() != 0) {
            return;
        }
        this.f2317M = null;
    }

    /* renamed from: b */
    public void m37077b(C1008n... c1008nArr) {
        int length = c1008nArr.length;
        this.f2322k = c1008nArr;
        this.f2323l = new HashMap<>(length);
        for (C1008n c1008n : c1008nArr) {
            this.f2323l.put(c1008n.m37124c(), c1008n);
        }
        this.f2321j = false;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: c */
    public void mo37076c() {
        if (!f2298r.get().contains(this) && !f2299s.get().contains(this)) {
            this.f2308C = false;
            m37062o();
        } else if (!this.f2321j) {
            mo37063n();
        }
        if (this.f2314J <= 0 || (this.f2314J & 1) != 1) {
            mo37100a(1.0f);
        } else {
            mo37100a(0.0f);
        }
        m37064m();
    }

    /* renamed from: c */
    boolean mo37075c(long j) {
        float f;
        boolean z = false;
        if (this.f2320i == 0) {
            this.f2320i = 1;
            if (this.f2319h < 0) {
                this.f2318g = j;
            } else {
                this.f2318g = j - this.f2319h;
                this.f2319h = -1L;
            }
        }
        switch (this.f2320i) {
            case 1:
            case 2:
                float f2 = this.f2312G > 0 ? ((float) (j - this.f2318g)) / ((float) this.f2312G) : 1.0f;
                if (f2 < 1.0f) {
                    f = f2;
                } else if (this.f2306A < this.f2314J || this.f2314J == -1) {
                    if (this.f2175a != null) {
                        int size = this.f2175a.size();
                        for (int i = 0; i < size; i++) {
                            this.f2175a.get(i).mo36889d(this);
                        }
                    }
                    if (this.f2315K == 2) {
                        this.f2324z = !this.f2324z;
                    }
                    this.f2306A += (int) f2;
                    f = f2 % 1.0f;
                    this.f2318g += this.f2312G;
                } else {
                    f = Math.min(f2, 1.0f);
                    z = true;
                }
                if (this.f2324z) {
                    f = 1.0f - f;
                }
                mo37100a(f);
                break;
        }
        return z;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: d */
    public long mo37073d() {
        return this.f2313H;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: d */
    public C1015q mo37083b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.f2312G = j;
        return this;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: e */
    public long mo37071e() {
        return this.f2312G;
    }

    /* renamed from: e */
    public void m37070e(long j) {
        mo37063n();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f2320i != 1) {
            this.f2319h = j;
            this.f2320i = 2;
        }
        this.f2318g = currentAnimationTimeMillis - j;
        mo37075c(currentAnimationTimeMillis);
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: f */
    public boolean mo37069f() {
        return this.f2320i == 1 || this.f2310E;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: g */
    public boolean mo37067g() {
        return this.f2311F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo37063n() {
        if (!this.f2321j) {
            int length = this.f2322k.length;
            for (int i = 0; i < length; i++) {
                this.f2322k[i].m37127b();
            }
            this.f2321j = true;
        }
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: q */
    public C1015q mo37065j() {
        C1015q c1015q = (C1015q) super.clone();
        if (this.f2317M != null) {
            ArrayList<AbstractC1022b> arrayList = this.f2317M;
            c1015q.f2317M = new ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c1015q.f2317M.add(arrayList.get(i));
            }
        }
        c1015q.f2319h = -1L;
        c1015q.f2324z = false;
        c1015q.f2306A = 0;
        c1015q.f2321j = false;
        c1015q.f2320i = 0;
        c1015q.f2308C = false;
        C1008n[] c1008nArr = this.f2322k;
        if (c1008nArr != null) {
            int length = c1008nArr.length;
            c1015q.f2322k = new C1008n[length];
            c1015q.f2323l = new HashMap<>(length);
            for (int i2 = 0; i2 < length; i2++) {
                C1008n clone = c1008nArr[i2].clone();
                c1015q.f2322k[i2] = clone;
                c1015q.f2323l.put(clone.m37124c(), clone);
            }
        }
        return c1015q;
    }

    /* renamed from: r */
    public C1008n[] m37060r() {
        return this.f2322k;
    }

    /* renamed from: s */
    public long m37059s() {
        if (!this.f2321j || this.f2320i == 0) {
            return 0L;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.f2318g;
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f2322k != null) {
            for (int i = 0; i < this.f2322k.length; i++) {
                str = str + "\n    " + this.f2322k[i].toString();
            }
        }
        return str;
    }

    /* renamed from: u */
    public Object m37057u() {
        if (this.f2322k == null || this.f2322k.length <= 0) {
            return null;
        }
        return this.f2322k[0].mo37116d();
    }

    /* renamed from: v */
    public int m37056v() {
        return this.f2314J;
    }

    /* renamed from: w */
    public int m37055w() {
        return this.f2315K;
    }

    /* renamed from: x */
    public void m37054x() {
        if (this.f2317M == null) {
            return;
        }
        this.f2317M.clear();
        this.f2317M = null;
    }

    /* renamed from: y */
    public Interpolator m37053y() {
        return this.f2316L;
    }

    /* renamed from: z */
    public void m37052z() {
        this.f2324z = !this.f2324z;
        if (this.f2320i != 1) {
            m37090a(true);
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f2318g = currentAnimationTimeMillis - (this.f2312G - (currentAnimationTimeMillis - this.f2318g));
    }
}
