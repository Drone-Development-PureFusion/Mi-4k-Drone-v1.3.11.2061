package it.sephiroth.android.library.widget;

import android.content.Context;
import android.util.FloatMath;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.firebase.p253b.C9755a;
/* renamed from: it.sephiroth.android.library.widget.d */
/* loaded from: classes.dex */
public class C10939d {

    /* renamed from: f */
    private static final int f35280f = 250;

    /* renamed from: g */
    private static final int f35281g = 0;

    /* renamed from: h */
    private static final int f35282h = 1;

    /* renamed from: i */
    private static float f35283i = 8.0f;

    /* renamed from: j */
    private static float f35284j;

    /* renamed from: a */
    private int f35285a;

    /* renamed from: b */
    private final C10940a f35286b;

    /* renamed from: c */
    private final C10940a f35287c;

    /* renamed from: d */
    private Interpolator f35288d;

    /* renamed from: e */
    private final boolean f35289e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: it.sephiroth.android.library.widget.d$a */
    /* loaded from: classes2.dex */
    public static class C10940a {

        /* renamed from: A */
        private static final int f35290A = 1;

        /* renamed from: B */
        private static final int f35291B = 2;

        /* renamed from: o */
        private static final float f35292o = 2000.0f;

        /* renamed from: r */
        private static final float f35294r = 0.35f;

        /* renamed from: s */
        private static final float f35295s = 0.5f;

        /* renamed from: t */
        private static final float f35296t = 1.0f;

        /* renamed from: u */
        private static final float f35297u = 0.175f;

        /* renamed from: v */
        private static final float f35298v = 0.35000002f;

        /* renamed from: w */
        private static final int f35299w = 100;

        /* renamed from: z */
        private static final int f35302z = 0;

        /* renamed from: a */
        private int f35303a;

        /* renamed from: b */
        private int f35304b;

        /* renamed from: c */
        private int f35305c;

        /* renamed from: d */
        private int f35306d;

        /* renamed from: e */
        private float f35307e;

        /* renamed from: f */
        private float f35308f;

        /* renamed from: g */
        private long f35309g;

        /* renamed from: h */
        private int f35310h;

        /* renamed from: i */
        private int f35311i;

        /* renamed from: j */
        private int f35312j;

        /* renamed from: l */
        private int f35314l;

        /* renamed from: p */
        private float f35317p;

        /* renamed from: q */
        private static float f35293q = (float) (Math.log(0.78d) / Math.log(0.9d));

        /* renamed from: x */
        private static final float[] f35300x = new float[101];

        /* renamed from: y */
        private static final float[] f35301y = new float[101];

        /* renamed from: m */
        private float f35315m = ViewConfiguration.getScrollFriction();

        /* renamed from: n */
        private int f35316n = 0;

        /* renamed from: k */
        private boolean f35313k = true;

        static {
            float f;
            float f2;
            float f3;
            float f4;
            float f5 = 0.0f;
            int i = 0;
            float f6 = 0.0f;
            while (i < 100) {
                float f7 = i / 100.0f;
                float f8 = 1.0f;
                float f9 = f6;
                while (true) {
                    f = ((f8 - f9) / 2.0f) + f9;
                    f2 = 3.0f * f * (1.0f - f);
                    float f10 = ((((1.0f - f) * f35297u) + (f35298v * f)) * f2) + (f * f * f);
                    if (Math.abs(f10 - f7) < 1.0E-5d) {
                        break;
                    } else if (f10 > f7) {
                        f8 = f;
                    } else {
                        f9 = f;
                    }
                }
                f35300x[i] = (f * f * f) + (f2 * (((1.0f - f) * f35295s) + f));
                float f11 = 1.0f;
                while (true) {
                    f3 = ((f11 - f5) / 2.0f) + f5;
                    f4 = 3.0f * f3 * (1.0f - f3);
                    float f12 = ((((1.0f - f3) * f35295s) + f3) * f4) + (f3 * f3 * f3);
                    if (Math.abs(f12 - f7) < 1.0E-5d) {
                        break;
                    } else if (f12 > f7) {
                        f11 = f3;
                    } else {
                        f5 = f3;
                    }
                }
                f35301y[i] = (f3 * f3 * f3) + ((((1.0f - f3) * f35297u) + (f35298v * f3)) * f4);
                i++;
                f6 = f9;
            }
            float[] fArr = f35300x;
            f35301y[100] = 1.0f;
            fArr[100] = 1.0f;
        }

        C10940a(Context context) {
            this.f35317p = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        }

        /* renamed from: a */
        private void m2609a(int i, int i2, int i3, int i4) {
            int i5;
            boolean z = true;
            if (i > i2 && i < i3) {
                Log.e("OverScroller", "startAfterEdge called from a valid position");
                this.f35313k = true;
                return;
            }
            boolean z2 = i > i3;
            int i6 = z2 ? i3 : i2;
            if ((i - i6) * i4 < 0) {
                z = false;
            }
            if (z) {
                m2586g(i, i6, i4);
            } else if (m2592e(i4) > Math.abs(i5)) {
                m2608a(i, i4, z2 ? i2 : i, z2 ? i : i3, this.f35314l);
            } else {
                m2591e(i, i6, i4);
            }
        }

        /* renamed from: c */
        private static float m2599c(int i) {
            if (i > 0) {
                return -2000.0f;
            }
            return f35292o;
        }

        /* renamed from: d */
        private double m2595d(int i) {
            return Math.log((f35294r * Math.abs(i)) / (this.f35315m * this.f35317p));
        }

        /* renamed from: d */
        private void m2596d() {
            float abs = (this.f35306d * this.f35306d) / (Math.abs(this.f35308f) * 2.0f);
            float signum = Math.signum(this.f35306d);
            if (abs > this.f35314l) {
                this.f35308f = (((-signum) * this.f35306d) * this.f35306d) / (this.f35314l * 2.0f);
                abs = this.f35314l;
            }
            this.f35314l = (int) abs;
            this.f35316n = 2;
            int i = this.f35303a;
            if (this.f35306d <= 0) {
                abs = -abs;
            }
            this.f35305c = ((int) abs) + i;
            this.f35310h = -((int) ((1000.0f * this.f35306d) / this.f35308f));
        }

        /* renamed from: d */
        private void m2594d(int i, int i2, int i3) {
            float abs = Math.abs((i3 - i) / (i2 - i));
            int i4 = (int) (100.0f * abs);
            if (i4 < 100) {
                float f = i4 / 100.0f;
                float f2 = f35301y[i4];
                this.f35310h = (int) (((((abs - f) / (((i4 + 1) / 100.0f) - f)) * (f35301y[i4 + 1] - f2)) + f2) * this.f35310h);
            }
        }

        /* renamed from: e */
        private double m2592e(int i) {
            return Math.exp(m2595d(i) * (f35293q / (f35293q - 1.0d))) * this.f35315m * this.f35317p;
        }

        /* renamed from: e */
        private void m2591e(int i, int i2, int i3) {
            this.f35313k = false;
            this.f35316n = 1;
            this.f35303a = i;
            this.f35305c = i2;
            int i4 = i - i2;
            this.f35308f = m2599c(i4);
            this.f35306d = -i4;
            this.f35314l = Math.abs(i4);
            this.f35310h = (int) (Math.sqrt((i4 * (-2.0d)) / this.f35308f) * 1000.0d);
        }

        /* renamed from: f */
        private int m2589f(int i) {
            return (int) (Math.exp(m2595d(i) / (f35293q - 1.0d)) * 1000.0d);
        }

        /* renamed from: f */
        private void m2588f(int i, int i2, int i3) {
            float f = (-i3) / this.f35308f;
            float sqrt = (float) Math.sqrt((((((i3 * i3) / 2.0f) / Math.abs(this.f35308f)) + Math.abs(i2 - i)) * 2.0d) / Math.abs(this.f35308f));
            this.f35309g -= (int) ((sqrt - f) * 1000.0f);
            this.f35303a = i2;
            this.f35306d = (int) ((-this.f35308f) * sqrt);
        }

        /* renamed from: g */
        private void m2586g(int i, int i2, int i3) {
            this.f35308f = m2599c(i3 == 0 ? i - i2 : i3);
            m2588f(i, i2, i3);
            m2596d();
        }

        /* renamed from: a */
        void m2613a() {
            this.f35304b = this.f35305c;
            this.f35313k = true;
        }

        /* renamed from: a */
        void m2612a(float f) {
            this.f35315m = f;
        }

        /* renamed from: a */
        void m2611a(int i) {
            this.f35305c = i;
            this.f35313k = false;
        }

        /* renamed from: a */
        void m2610a(int i, int i2, int i3) {
            this.f35313k = false;
            this.f35303a = i;
            this.f35305c = i + i2;
            this.f35309g = AnimationUtils.currentAnimationTimeMillis();
            this.f35310h = i3;
            this.f35308f = 0.0f;
            this.f35306d = 0;
        }

        /* renamed from: a */
        void m2608a(int i, int i2, int i3, int i4, int i5) {
            this.f35314l = i5;
            this.f35313k = false;
            this.f35306d = i2;
            this.f35307e = i2;
            this.f35311i = 0;
            this.f35310h = 0;
            this.f35309g = AnimationUtils.currentAnimationTimeMillis();
            this.f35303a = i;
            this.f35304b = i;
            if (i > i4 || i < i3) {
                m2609a(i, i3, i4, i2);
                return;
            }
            this.f35316n = 0;
            double d = C9755a.f30449c;
            if (i2 != 0) {
                int m2589f = m2589f(i2);
                this.f35311i = m2589f;
                this.f35310h = m2589f;
                d = m2592e(i2);
            }
            this.f35312j = (int) (d * Math.signum(i2));
            this.f35305c = this.f35312j + i;
            if (this.f35305c < i3) {
                m2594d(this.f35303a, this.f35305c, i3);
                this.f35305c = i3;
            }
            if (this.f35305c <= i4) {
                return;
            }
            m2594d(this.f35303a, this.f35305c, i4);
            this.f35305c = i4;
        }

        /* renamed from: b */
        void m2604b(float f) {
            this.f35304b = this.f35303a + Math.round((this.f35305c - this.f35303a) * f);
        }

        /* renamed from: b */
        void m2603b(int i) {
            this.f35310h = ((int) (AnimationUtils.currentAnimationTimeMillis() - this.f35309g)) + i;
            this.f35313k = false;
        }

        /* renamed from: b */
        boolean m2605b() {
            switch (this.f35316n) {
                case 0:
                    if (this.f35310h >= this.f35311i) {
                        return false;
                    }
                    this.f35303a = this.f35305c;
                    this.f35306d = (int) this.f35307e;
                    this.f35308f = m2599c(this.f35306d);
                    this.f35309g += this.f35310h;
                    m2596d();
                    break;
                case 1:
                    return false;
                case 2:
                    this.f35309g += this.f35310h;
                    m2591e(this.f35305c, this.f35303a, 0);
                    break;
            }
            m2600c();
            return true;
        }

        /* renamed from: b */
        boolean m2602b(int i, int i2, int i3) {
            this.f35313k = true;
            this.f35305c = i;
            this.f35303a = i;
            this.f35306d = 0;
            this.f35309g = AnimationUtils.currentAnimationTimeMillis();
            this.f35310h = 0;
            if (i < i2) {
                m2591e(i, i2, 0);
            } else if (i > i3) {
                m2591e(i, i3, 0);
            }
            return !this.f35313k;
        }

        /* renamed from: c */
        void m2598c(int i, int i2, int i3) {
            if (this.f35316n == 0) {
                this.f35314l = i3;
                this.f35309g = AnimationUtils.currentAnimationTimeMillis();
                m2609a(i, i2, i2, (int) this.f35307e);
            }
        }

        /* renamed from: c */
        boolean m2600c() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f35309g;
            if (currentAnimationTimeMillis > this.f35310h) {
                return false;
            }
            double d = C9755a.f30449c;
            switch (this.f35316n) {
                case 0:
                    float f = ((float) currentAnimationTimeMillis) / this.f35311i;
                    int i = (int) (100.0f * f);
                    float f2 = 1.0f;
                    float f3 = 0.0f;
                    if (i < 100) {
                        float f4 = i / 100.0f;
                        float f5 = f35300x[i];
                        f3 = (f35300x[i + 1] - f5) / (((i + 1) / 100.0f) - f4);
                        f2 = ((f - f4) * f3) + f5;
                    }
                    this.f35307e = ((f3 * this.f35312j) / this.f35311i) * 1000.0f;
                    d = f2 * this.f35312j;
                    break;
                case 1:
                    float f6 = ((float) currentAnimationTimeMillis) / this.f35310h;
                    float f7 = f6 * f6;
                    float signum = Math.signum(this.f35306d);
                    d = this.f35314l * signum * ((3.0f * f7) - ((2.0f * f6) * f7));
                    this.f35307e = ((-f6) + f7) * signum * this.f35314l * 6.0f;
                    break;
                case 2:
                    float f8 = ((float) currentAnimationTimeMillis) / 1000.0f;
                    this.f35307e = this.f35306d + (this.f35308f * f8);
                    d = ((f8 * (this.f35308f * f8)) / 2.0f) + (this.f35306d * f8);
                    break;
            }
            this.f35304b = ((int) Math.round(d)) + this.f35303a;
            return true;
        }
    }

    static {
        f35284j = 1.0f;
        f35284j = 1.0f / m2640a(1.0f);
    }

    public C10939d(Context context) {
        this(context, null);
    }

    public C10939d(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public C10939d(Context context, Interpolator interpolator, float f, float f2) {
        this(context, interpolator, true);
    }

    public C10939d(Context context, Interpolator interpolator, float f, float f2, boolean z) {
        this(context, interpolator, z);
    }

    public C10939d(Context context, Interpolator interpolator, boolean z) {
        this.f35288d = interpolator;
        this.f35289e = z;
        this.f35286b = new C10940a(context);
        this.f35287c = new C10940a(context);
    }

    /* renamed from: a */
    public static float m2640a(float f) {
        float f2 = f35283i * f;
        return (f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : ((1.0f - ((float) Math.exp(1.0f - f2))) * (1.0f - 0.36787945f)) + 0.36787945f) * f35284j;
    }

    @Deprecated
    /* renamed from: a */
    public void m2638a(int i) {
        this.f35286b.m2603b(i);
        this.f35287c.m2603b(i);
    }

    /* renamed from: a */
    public void m2637a(int i, int i2, int i3) {
        this.f35286b.m2598c(i, i2, i3);
    }

    /* renamed from: a */
    public void m2636a(int i, int i2, int i3, int i4) {
        m2635a(i, i2, i3, i4, 250);
    }

    /* renamed from: a */
    public void m2635a(int i, int i2, int i3, int i4, int i5) {
        this.f35285a = 0;
        this.f35286b.m2610a(i, i3, i5);
        this.f35287c.m2610a(i2, i4, i5);
    }

    /* renamed from: a */
    public void m2633a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m2632a(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    /* renamed from: a */
    public void m2632a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        if (this.f35289e && !m2641a()) {
            float f = this.f35286b.f35307e;
            float f2 = this.f35287c.f35307e;
            if (Math.signum(i3) == Math.signum(f) && Math.signum(i4) == Math.signum(f2)) {
                i4 = (int) (i4 + f2);
                i11 = (int) (f + i3);
                this.f35285a = 1;
                this.f35286b.m2608a(i, i11, i5, i6, i9);
                this.f35287c.m2608a(i2, i4, i7, i8, i10);
            }
        }
        i11 = i3;
        this.f35285a = 1;
        this.f35286b.m2608a(i, i11, i5, i6, i9);
        this.f35287c.m2608a(i2, i4, i7, i8, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2631a(Interpolator interpolator) {
        this.f35288d = interpolator;
    }

    /* renamed from: a */
    public final void m2630a(boolean z) {
        this.f35286b.f35313k = this.f35287c.f35313k = z;
    }

    /* renamed from: a */
    public final boolean m2641a() {
        return this.f35286b.f35313k && this.f35287c.f35313k;
    }

    /* renamed from: a */
    public boolean m2639a(float f, float f2) {
        return !m2641a() && Math.signum(f) == Math.signum((float) (this.f35286b.f35305c - this.f35286b.f35303a)) && Math.signum(f2) == Math.signum((float) (this.f35287c.f35305c - this.f35287c.f35303a));
    }

    /* renamed from: a */
    public boolean m2634a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f35285a = 1;
        return this.f35286b.m2602b(i, i3, i4) || this.f35287c.m2602b(i2, i5, i6);
    }

    /* renamed from: b */
    public final int m2629b() {
        return this.f35286b.f35304b;
    }

    /* renamed from: b */
    public final void m2628b(float f) {
        this.f35286b.m2612a(f);
        this.f35287c.m2612a(f);
    }

    @Deprecated
    /* renamed from: b */
    public void m2627b(int i) {
        this.f35286b.m2611a(i);
    }

    /* renamed from: b */
    public void m2626b(int i, int i2, int i3) {
        this.f35287c.m2598c(i, i2, i3);
    }

    /* renamed from: c */
    public final int m2625c() {
        return this.f35287c.f35304b;
    }

    @Deprecated
    /* renamed from: c */
    public void m2624c(int i) {
        this.f35287c.m2611a(i);
    }

    /* renamed from: d */
    public float m2623d() {
        return FloatMath.sqrt((this.f35286b.f35307e * this.f35286b.f35307e) + (this.f35287c.f35307e * this.f35287c.f35307e));
    }

    /* renamed from: e */
    public final int m2622e() {
        return this.f35286b.f35303a;
    }

    /* renamed from: f */
    public final int m2621f() {
        return this.f35287c.f35303a;
    }

    /* renamed from: g */
    public final int m2620g() {
        return this.f35286b.f35305c;
    }

    /* renamed from: h */
    public final int m2619h() {
        return this.f35287c.f35305c;
    }

    @Deprecated
    /* renamed from: i */
    public final int m2618i() {
        return Math.max(this.f35286b.f35310h, this.f35287c.f35310h);
    }

    /* renamed from: j */
    public boolean m2617j() {
        if (m2641a()) {
            return false;
        }
        switch (this.f35285a) {
            case 0:
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f35286b.f35309g;
                int i = this.f35286b.f35310h;
                if (currentAnimationTimeMillis >= i) {
                    m2615l();
                    break;
                } else {
                    float f = ((float) currentAnimationTimeMillis) / i;
                    float m2640a = this.f35288d == null ? m2640a(f) : this.f35288d.getInterpolation(f);
                    this.f35286b.m2604b(m2640a);
                    this.f35287c.m2604b(m2640a);
                    break;
                }
            case 1:
                if (!this.f35286b.f35313k && !this.f35286b.m2600c() && !this.f35286b.m2605b()) {
                    this.f35286b.m2613a();
                }
                if (!this.f35287c.f35313k && !this.f35287c.m2600c() && !this.f35287c.m2605b()) {
                    this.f35287c.m2613a();
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m2616k() {
        return (!this.f35286b.f35313k && this.f35286b.f35316n != 0) || (!this.f35287c.f35313k && this.f35287c.f35316n != 0);
    }

    /* renamed from: l */
    public void m2615l() {
        this.f35286b.m2613a();
        this.f35287c.m2613a();
    }

    /* renamed from: m */
    public int m2614m() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - Math.min(this.f35286b.f35309g, this.f35287c.f35309g));
    }
}
