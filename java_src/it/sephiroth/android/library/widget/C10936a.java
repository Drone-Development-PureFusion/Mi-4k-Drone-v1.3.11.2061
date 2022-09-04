package it.sephiroth.android.library.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import it.sephiroth.android.library.C10884R;
/* renamed from: it.sephiroth.android.library.widget.a */
/* loaded from: classes2.dex */
public class C10936a {

    /* renamed from: L */
    private static final int f35212L = 0;

    /* renamed from: M */
    private static final int f35213M = 1;

    /* renamed from: N */
    private static final int f35214N = 2;

    /* renamed from: O */
    private static final int f35215O = 3;

    /* renamed from: P */
    private static final int f35216P = 4;

    /* renamed from: Q */
    private static final int f35217Q = 7;

    /* renamed from: R */
    private static final int f35218R = 7;

    /* renamed from: S */
    private static final float f35219S = 1.1f;

    /* renamed from: T */
    private static final int f35220T = 8;

    /* renamed from: U */
    private static final int f35221U = 16;

    /* renamed from: a */
    public static final int f35222a = 0;

    /* renamed from: b */
    public static final int f35223b = 1;

    /* renamed from: c */
    private static final String f35224c = "EdgeEffect";

    /* renamed from: d */
    private static final int f35225d = 1000;

    /* renamed from: e */
    private static final int f35226e = 167;

    /* renamed from: f */
    private static final int f35227f = 1000;

    /* renamed from: g */
    private static final float f35228g = 1.0f;

    /* renamed from: h */
    private static final float f35229h = 0.5f;

    /* renamed from: i */
    private static final float f35230i = 4.0f;

    /* renamed from: j */
    private static final float f35231j = 1.0f;

    /* renamed from: k */
    private static final float f35232k = 0.6f;

    /* renamed from: l */
    private static final int f35233l = 100;

    /* renamed from: m */
    private static final float f35234m = 0.001f;

    /* renamed from: u */
    private static final int f35235u = 300;

    /* renamed from: A */
    private float f35236A;

    /* renamed from: B */
    private float f35237B;

    /* renamed from: C */
    private float f35238C;

    /* renamed from: D */
    private float f35239D;

    /* renamed from: E */
    private float f35240E;

    /* renamed from: F */
    private float f35241F;

    /* renamed from: G */
    private float f35242G;

    /* renamed from: H */
    private float f35243H;

    /* renamed from: I */
    private long f35244I;

    /* renamed from: J */
    private float f35245J;

    /* renamed from: W */
    private float f35248W;

    /* renamed from: Y */
    private final int f35250Y;

    /* renamed from: Z */
    private final int f35251Z;

    /* renamed from: aa */
    private final int f35252aa;

    /* renamed from: ab */
    private final int f35253ab;

    /* renamed from: n */
    private final int f35254n;

    /* renamed from: o */
    private final Drawable f35255o;

    /* renamed from: p */
    private final Drawable f35256p;

    /* renamed from: q */
    private int f35257q;

    /* renamed from: r */
    private int f35258r;

    /* renamed from: s */
    private int f35259s;

    /* renamed from: t */
    private int f35260t;

    /* renamed from: v */
    private final int f35261v;

    /* renamed from: w */
    private float f35262w;

    /* renamed from: x */
    private float f35263x;

    /* renamed from: y */
    private float f35264y;

    /* renamed from: z */
    private float f35265z;

    /* renamed from: V */
    private int f35247V = 0;

    /* renamed from: X */
    private final Rect f35249X = new Rect();

    /* renamed from: K */
    private final Interpolator f35246K = new DecelerateInterpolator();

    public C10936a(Context context, int i) {
        Resources resources = context.getResources();
        this.f35255o = resources.getDrawable(C10884R.C10885drawable.hlv_overscroll_edge);
        this.f35256p = resources.getDrawable(C10884R.C10885drawable.hlv_overscroll_glow);
        this.f35254n = i;
        this.f35250Y = this.f35255o.getIntrinsicHeight();
        this.f35251Z = this.f35256p.getIntrinsicHeight();
        this.f35252aa = this.f35256p.getIntrinsicWidth();
        this.f35253ab = (int) (Math.min((((this.f35251Z * f35230i) * this.f35251Z) / this.f35252aa) * f35232k, this.f35251Z * f35230i) + f35229h);
        this.f35261v = (int) ((resources.getDisplayMetrics().density * 300.0f) + f35229h);
    }

    /* renamed from: d */
    private void m2655d() {
        float min = Math.min(((float) (AnimationUtils.currentAnimationTimeMillis() - this.f35244I)) / this.f35245J, 1.0f);
        float interpolation = this.f35246K.getInterpolation(min);
        this.f35262w = this.f35236A + ((this.f35237B - this.f35236A) * interpolation);
        this.f35263x = this.f35238C + ((this.f35239D - this.f35238C) * interpolation);
        this.f35264y = this.f35240E + ((this.f35241F - this.f35240E) * interpolation);
        this.f35265z = this.f35242G + ((this.f35243H - this.f35242G) * interpolation);
        if (min >= 0.999f) {
            switch (this.f35247V) {
                case 1:
                    this.f35247V = 4;
                    this.f35244I = AnimationUtils.currentAnimationTimeMillis();
                    this.f35245J = 1000.0f;
                    this.f35236A = this.f35262w;
                    this.f35238C = this.f35263x;
                    this.f35240E = this.f35264y;
                    this.f35242G = this.f35265z;
                    this.f35237B = 0.0f;
                    this.f35239D = 0.0f;
                    this.f35241F = 0.0f;
                    this.f35243H = 0.0f;
                    return;
                case 2:
                    this.f35247V = 3;
                    this.f35244I = AnimationUtils.currentAnimationTimeMillis();
                    this.f35245J = 1000.0f;
                    this.f35236A = this.f35262w;
                    this.f35238C = this.f35263x;
                    this.f35240E = this.f35264y;
                    this.f35242G = this.f35265z;
                    this.f35237B = 0.0f;
                    this.f35239D = 0.0f;
                    this.f35241F = 0.0f;
                    this.f35243H = 0.0f;
                    return;
                case 3:
                    this.f35247V = 0;
                    return;
                case 4:
                    this.f35263x = ((this.f35243H != 0.0f ? 1.0f / (this.f35243H * this.f35243H) : Float.MAX_VALUE) * interpolation * (this.f35239D - this.f35238C)) + this.f35238C;
                    this.f35247V = 3;
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public Rect m2659a(boolean z) {
        int i = 0;
        this.f35249X.set(0, 0, this.f35257q, this.f35253ab);
        Rect rect = this.f35249X;
        int i2 = this.f35259s;
        int i3 = this.f35260t;
        if (z) {
            i = this.f35253ab;
        }
        rect.offset(i2, i3 - i);
        return this.f35249X;
    }

    /* renamed from: a */
    public void m2663a(float f) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f35247V != 4 || ((float) (currentAnimationTimeMillis - this.f35244I)) >= this.f35245J) {
            if (this.f35247V != 1) {
                this.f35265z = 1.0f;
            }
            this.f35247V = 1;
            this.f35244I = currentAnimationTimeMillis;
            this.f35245J = 167.0f;
            this.f35248W += f;
            float abs = Math.abs(this.f35248W);
            float max = Math.max((float) f35232k, Math.min(abs, 1.0f));
            this.f35236A = max;
            this.f35262w = max;
            float max2 = Math.max((float) f35229h, Math.min(abs * 7.0f, 1.0f));
            this.f35238C = max2;
            this.f35263x = max2;
            float min = Math.min(1.0f, this.f35264y + (Math.abs(f) * f35219S));
            this.f35240E = min;
            this.f35264y = min;
            float abs2 = Math.abs(f);
            if (f > 0.0f && this.f35248W < 0.0f) {
                abs2 = -abs2;
            }
            if (this.f35248W == 0.0f) {
                this.f35265z = 0.0f;
            }
            float min2 = Math.min((float) f35230i, Math.max(0.0f, (abs2 * 7.0f) + this.f35265z));
            this.f35242G = min2;
            this.f35265z = min2;
            this.f35237B = this.f35262w;
            this.f35239D = this.f35263x;
            this.f35241F = this.f35264y;
            this.f35243H = this.f35265z;
        }
    }

    /* renamed from: a */
    public void m2662a(int i) {
        this.f35247V = 2;
        int max = Math.max(100, Math.abs(i));
        this.f35244I = AnimationUtils.currentAnimationTimeMillis();
        this.f35245J = 0.1f + (max * 0.03f);
        this.f35236A = 0.0f;
        this.f35238C = 0.0f;
        this.f35263x = 0.0f;
        this.f35240E = f35229h;
        this.f35242G = 0.0f;
        this.f35237B = Math.max(0, Math.min(max * 8, 1));
        this.f35239D = Math.max((float) f35229h, Math.min(max * 8, 1.0f));
        this.f35243H = Math.min(0.025f + ((max / 100) * max * 1.5E-4f), 1.75f);
        this.f35241F = Math.max(this.f35240E, Math.min(max * 16 * 1.0E-5f, 1.0f));
    }

    /* renamed from: a */
    public void m2661a(int i, int i2) {
        this.f35257q = i;
        this.f35258r = i2;
    }

    /* renamed from: a */
    public boolean m2664a() {
        return this.f35247V == 0;
    }

    /* renamed from: a */
    public boolean m2660a(Canvas canvas) {
        m2655d();
        this.f35256p.setAlpha((int) (Math.max(0.0f, Math.min(this.f35264y, 1.0f)) * 255.0f));
        int min = (int) Math.min((((this.f35251Z * this.f35265z) * this.f35251Z) / this.f35252aa) * f35232k, this.f35251Z * f35230i);
        if (this.f35254n == 0) {
            this.f35256p.setBounds(0, 0, this.f35257q, min);
        } else {
            this.f35256p.setBounds(0, 0, this.f35257q, min);
        }
        this.f35256p.draw(canvas);
        this.f35255o.setAlpha((int) (Math.max(0.0f, Math.min(this.f35262w, 1.0f)) * 255.0f));
        int i = (int) (this.f35250Y * this.f35263x);
        if (this.f35254n == 0) {
            this.f35255o.setBounds(0, 0, this.f35257q, i);
        } else {
            this.f35255o.setBounds(0, 0, this.f35257q, i);
        }
        this.f35255o.draw(canvas);
        if (this.f35247V == 3 && min == 0 && i == 0) {
            this.f35247V = 0;
        }
        return this.f35247V != 0;
    }

    /* renamed from: b */
    public void m2658b() {
        this.f35247V = 0;
    }

    /* renamed from: b */
    public void m2657b(int i, int i2) {
        this.f35259s = i;
        this.f35260t = i2;
    }

    /* renamed from: c */
    public void m2656c() {
        this.f35248W = 0.0f;
        if (this.f35247V == 1 || this.f35247V == 4) {
            this.f35247V = 3;
            this.f35236A = this.f35262w;
            this.f35238C = this.f35263x;
            this.f35240E = this.f35264y;
            this.f35242G = this.f35265z;
            this.f35237B = 0.0f;
            this.f35239D = 0.0f;
            this.f35241F = 0.0f;
            this.f35243H = 0.0f;
            this.f35244I = AnimationUtils.currentAnimationTimeMillis();
            this.f35245J = 1000.0f;
        }
    }
}
