package com.fimi.kernel.view.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.p001v4.view.MarginLayoutParamsCompat;
import android.support.p001v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.kernel.C1572R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.kernel.view.percent.a */
/* loaded from: classes.dex */
public class C1700a {

    /* renamed from: a */
    private static final String f4244a = "PercentLayout";

    /* renamed from: c */
    private static final String f4245c = "^(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)%([wh]?)$";

    /* renamed from: b */
    private final ViewGroup f4246b;

    /* renamed from: com.fimi.kernel.view.percent.a$a */
    /* loaded from: classes.dex */
    public static class C1701a {

        /* renamed from: a */
        public C1702a f4247a;

        /* renamed from: b */
        public C1702a f4248b;

        /* renamed from: c */
        public C1702a f4249c;

        /* renamed from: d */
        public C1702a f4250d;

        /* renamed from: e */
        public C1702a f4251e;

        /* renamed from: f */
        public C1702a f4252f;

        /* renamed from: g */
        public C1702a f4253g;

        /* renamed from: h */
        public C1702a f4254h;

        /* renamed from: i */
        public C1702a f4255i;

        /* renamed from: j */
        public C1702a f4256j;

        /* renamed from: k */
        public C1702a f4257k;

        /* renamed from: l */
        public C1702a f4258l;

        /* renamed from: m */
        public C1702a f4259m;

        /* renamed from: n */
        public C1702a f4260n;

        /* renamed from: o */
        public C1702a f4261o;

        /* renamed from: p */
        public C1702a f4262p;

        /* renamed from: q */
        public C1702a f4263q;

        /* renamed from: r */
        final ViewGroup.MarginLayoutParams f4264r = new ViewGroup.MarginLayoutParams(0, 0);

        /* renamed from: com.fimi.kernel.view.percent.a$a$a */
        /* loaded from: classes.dex */
        public static class C1702a {

            /* renamed from: a */
            public float f4265a;

            /* renamed from: b */
            public boolean f4266b;

            public C1702a() {
                this.f4265a = -1.0f;
            }

            public C1702a(float f, boolean z) {
                this.f4265a = -1.0f;
                this.f4265a = f;
                this.f4266b = z;
            }

            public String toString() {
                return "PercentVal{percent=" + this.f4265a + ", isBaseWidth=" + this.f4266b + C0494h.f735w;
            }
        }

        /* renamed from: a */
        public void m34383a(ViewGroup.LayoutParams layoutParams) {
            layoutParams.width = this.f4264r.width;
            layoutParams.height = this.f4264r.height;
        }

        /* renamed from: a */
        public void m34382a(ViewGroup.LayoutParams layoutParams, int i, int i2) {
            this.f4264r.width = layoutParams.width;
            this.f4264r.height = layoutParams.height;
            if (this.f4247a != null) {
                layoutParams.width = (int) ((this.f4247a.f4266b ? i : i2) * this.f4247a.f4265a);
            }
            if (this.f4248b != null) {
                if (!this.f4248b.f4266b) {
                    i = i2;
                }
                layoutParams.height = (int) (i * this.f4248b.f4265a);
            }
        }

        /* renamed from: a */
        public void m34381a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            m34383a((ViewGroup.LayoutParams) marginLayoutParams);
            marginLayoutParams.leftMargin = this.f4264r.leftMargin;
            marginLayoutParams.topMargin = this.f4264r.topMargin;
            marginLayoutParams.rightMargin = this.f4264r.rightMargin;
            marginLayoutParams.bottomMargin = this.f4264r.bottomMargin;
            MarginLayoutParamsCompat.setMarginStart(marginLayoutParams, MarginLayoutParamsCompat.getMarginStart(this.f4264r));
            MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, MarginLayoutParamsCompat.getMarginEnd(this.f4264r));
        }

        /* renamed from: a */
        public void m34380a(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
            m34382a((ViewGroup.LayoutParams) marginLayoutParams, i, i2);
            this.f4264r.leftMargin = marginLayoutParams.leftMargin;
            this.f4264r.topMargin = marginLayoutParams.topMargin;
            this.f4264r.rightMargin = marginLayoutParams.rightMargin;
            this.f4264r.bottomMargin = marginLayoutParams.bottomMargin;
            MarginLayoutParamsCompat.setMarginStart(this.f4264r, MarginLayoutParamsCompat.getMarginStart(marginLayoutParams));
            MarginLayoutParamsCompat.setMarginEnd(this.f4264r, MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams));
            if (this.f4249c != null) {
                marginLayoutParams.leftMargin = (int) ((this.f4249c.f4266b ? i : i2) * this.f4249c.f4265a);
            }
            if (this.f4250d != null) {
                marginLayoutParams.topMargin = (int) ((this.f4250d.f4266b ? i : i2) * this.f4250d.f4265a);
            }
            if (this.f4251e != null) {
                marginLayoutParams.rightMargin = (int) ((this.f4251e.f4266b ? i : i2) * this.f4251e.f4265a);
            }
            if (this.f4252f != null) {
                marginLayoutParams.bottomMargin = (int) ((this.f4252f.f4266b ? i : i2) * this.f4252f.f4265a);
            }
            if (this.f4253g != null) {
                MarginLayoutParamsCompat.setMarginStart(marginLayoutParams, (int) ((this.f4253g.f4266b ? i : i2) * this.f4253g.f4265a));
            }
            if (this.f4254h != null) {
                if (!this.f4254h.f4266b) {
                    i = i2;
                }
                MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, (int) (i * this.f4254h.f4265a));
            }
            if (Log.isLoggable(C1700a.f4244a, 3)) {
                Log.d(C1700a.f4244a, "after fillMarginLayoutParams: (" + marginLayoutParams.width + ", " + marginLayoutParams.height + ")");
            }
        }

        public String toString() {
            return "PercentLayoutInfo{widthPercent=" + this.f4247a + ", heightPercent=" + this.f4248b + ", leftMarginPercent=" + this.f4249c + ", topMarginPercent=" + this.f4250d + ", rightMarginPercent=" + this.f4251e + ", bottomMarginPercent=" + this.f4252f + ", startMarginPercent=" + this.f4253g + ", endMarginPercent=" + this.f4254h + ", textSizePercent=" + this.f4255i + ", maxWidthPercent=" + this.f4256j + ", maxHeightPercent=" + this.f4257k + ", minWidthPercent=" + this.f4258l + ", minHeightPercent=" + this.f4259m + ", paddingLeftPercent=" + this.f4260n + ", paddingRightPercent=" + this.f4261o + ", paddingTopPercent=" + this.f4262p + ", paddingBottomPercent=" + this.f4263q + ", mPreservedParams=" + this.f4264r + C0494h.f735w;
        }
    }

    /* renamed from: com.fimi.kernel.view.percent.a$b */
    /* loaded from: classes.dex */
    public interface AbstractC1703b {
        /* renamed from: a */
        C1701a mo34379a();
    }

    public C1700a(ViewGroup viewGroup) {
        this.f4246b = viewGroup;
    }

    /* renamed from: a */
    private static C1701a.C1702a m34398a(TypedArray typedArray, int i, boolean z) {
        return m34392a(typedArray.getString(i), z);
    }

    /* renamed from: a */
    private static C1701a.C1702a m34392a(String str, boolean z) {
        boolean z2 = true;
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(f4245c).matcher(str);
        if (!matcher.matches()) {
            throw new RuntimeException("the value of layout_xxxPercent invalid! ==>" + str);
        }
        int length = str.length();
        String group = matcher.group(1);
        String substring = str.substring(length - 1);
        float parseFloat = Float.parseFloat(group) / 100.0f;
        if ((!z || substring.equals("h")) && !substring.equals("w")) {
            z2 = false;
        }
        return new C1701a.C1702a(parseFloat, z2);
    }

    /* renamed from: a */
    public static C1701a m34399a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1572R.styleable.PercentLayout_Layout);
        C1701a m34384e = m34384e(obtainStyledAttributes, m34386c(obtainStyledAttributes, m34389b(obtainStyledAttributes, m34385d(obtainStyledAttributes, m34397a(obtainStyledAttributes, (C1701a) null)))));
        Log.d(f4244a, "constructed: " + m34384e);
        obtainStyledAttributes.recycle();
        if (Log.isLoggable(f4244a, 3)) {
            Log.d(f4244a, "constructed: " + m34384e);
        }
        return m34384e;
    }

    /* renamed from: a */
    private static C1701a m34397a(TypedArray typedArray, C1701a c1701a) {
        C1701a.C1702a m34398a = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_widthPercent, true);
        if (m34398a != null) {
            if (Log.isLoggable(f4244a, 2)) {
                Log.v(f4244a, "percent width: " + m34398a.f4265a);
            }
            c1701a = m34394a(c1701a);
            c1701a.f4247a = m34398a;
        }
        C1701a.C1702a m34398a2 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_heightPercent, false);
        if (m34398a2 != null) {
            if (Log.isLoggable(f4244a, 2)) {
                Log.v(f4244a, "percent height: " + m34398a2.f4265a);
            }
            C1701a m34394a = m34394a(c1701a);
            m34394a.f4248b = m34398a2;
            return m34394a;
        }
        return c1701a;
    }

    @NonNull
    /* renamed from: a */
    private static C1701a m34394a(C1701a c1701a) {
        return c1701a != null ? c1701a : new C1701a();
    }

    /* renamed from: a */
    private void m34400a(int i, int i2, View view, C1701a c1701a) {
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        C1701a.C1702a c1702a = c1701a.f4260n;
        if (c1702a != null) {
            paddingLeft = (int) ((c1702a.f4266b ? i : i2) * c1702a.f4265a);
        }
        C1701a.C1702a c1702a2 = c1701a.f4261o;
        if (c1702a2 != null) {
            paddingRight = (int) ((c1702a2.f4266b ? i : i2) * c1702a2.f4265a);
        }
        C1701a.C1702a c1702a3 = c1701a.f4262p;
        if (c1702a3 != null) {
            paddingTop = (int) ((c1702a3.f4266b ? i : i2) * c1702a3.f4265a);
        }
        C1701a.C1702a c1702a4 = c1701a.f4263q;
        if (c1702a4 != null) {
            if (!c1702a4.f4266b) {
                i = i2;
            }
            paddingBottom = (int) (i * c1702a4.f4265a);
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    /* renamed from: a */
    public static void m34395a(ViewGroup.LayoutParams layoutParams, TypedArray typedArray, int i, int i2) {
        layoutParams.width = typedArray.getLayoutDimension(i, 0);
        layoutParams.height = typedArray.getLayoutDimension(i2, 0);
    }

    /* renamed from: a */
    private void m34393a(String str, int i, int i2, View view, Class cls, C1701a.C1702a c1702a) {
        if (c1702a != null) {
            Method method = cls.getMethod(str, Integer.TYPE);
            method.setAccessible(true);
            if (!c1702a.f4266b) {
                i = i2;
            }
            method.invoke(view, Integer.valueOf((int) (i * c1702a.f4265a)));
        }
    }

    /* renamed from: a */
    private static boolean m34396a(View view, C1701a c1701a) {
        return c1701a != null && c1701a.f4247a != null && c1701a.f4264r != null && (ViewCompat.getMeasuredWidthAndState(view) & ViewCompat.MEASURED_STATE_MASK) == 16777216 && c1701a.f4247a.f4265a >= 0.0f && c1701a.f4264r.width == -2;
    }

    /* renamed from: b */
    private static C1701a m34389b(TypedArray typedArray, C1701a c1701a) {
        C1701a.C1702a m34398a = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_textSizePercent, false);
        if (m34398a != null) {
            if (Log.isLoggable(f4244a, 2)) {
                Log.v(f4244a, "percent text size: " + m34398a.f4265a);
            }
            C1701a m34394a = m34394a(c1701a);
            m34394a.f4255i = m34398a;
            return m34394a;
        }
        return c1701a;
    }

    /* renamed from: b */
    private void m34390b(int i, int i2, View view, C1701a c1701a) {
        try {
            Class<?> cls = view.getClass();
            m34393a("setMaxWidth", i, i2, view, cls, c1701a.f4256j);
            m34393a("setMaxHeight", i, i2, view, cls, c1701a.f4257k);
            m34393a("setMinWidth", i, i2, view, cls, c1701a.f4258l);
            m34393a("setMinHeight", i, i2, view, cls, c1701a.f4259m);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: b */
    private static boolean m34388b(View view, C1701a c1701a) {
        return c1701a != null && c1701a.f4248b != null && c1701a.f4264r != null && (ViewCompat.getMeasuredHeightAndState(view) & ViewCompat.MEASURED_STATE_MASK) == 16777216 && c1701a.f4248b.f4265a >= 0.0f && c1701a.f4264r.height == -2;
    }

    /* renamed from: c */
    private static C1701a m34386c(TypedArray typedArray, C1701a c1701a) {
        C1701a.C1702a m34398a = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_maxWidthPercent, true);
        if (m34398a != null) {
            m34394a(c1701a);
            c1701a.f4256j = m34398a;
        }
        C1701a.C1702a m34398a2 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_maxHeightPercent, false);
        if (m34398a2 != null) {
            m34394a(c1701a);
            c1701a.f4257k = m34398a2;
        }
        C1701a.C1702a m34398a3 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_minWidthPercent, true);
        if (m34398a3 != null) {
            m34394a(c1701a);
            c1701a.f4258l = m34398a3;
        }
        C1701a.C1702a m34398a4 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_minHeightPercent, false);
        if (m34398a4 != null) {
            m34394a(c1701a);
            c1701a.f4259m = m34398a4;
        }
        return c1701a;
    }

    /* renamed from: c */
    private void m34387c(int i, int i2, View view, C1701a c1701a) {
        C1701a.C1702a c1702a = c1701a.f4255i;
        if (c1702a == null) {
            return;
        }
        if (!c1702a.f4266b) {
            i = i2;
        }
        float f = (int) (c1702a.f4265a * i);
        if (!(view instanceof TextView)) {
            return;
        }
        ((TextView) view).setTextSize(0, f);
    }

    /* renamed from: d */
    private static C1701a m34385d(TypedArray typedArray, C1701a c1701a) {
        C1701a.C1702a m34398a = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_marginPercent, true);
        if (m34398a != null) {
            if (Log.isLoggable(f4244a, 2)) {
                Log.v(f4244a, "percent margin: " + m34398a.f4265a);
            }
            c1701a = m34394a(c1701a);
            c1701a.f4249c = m34398a;
            c1701a.f4250d = m34398a;
            c1701a.f4251e = m34398a;
            c1701a.f4252f = m34398a;
        }
        C1701a.C1702a m34398a2 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_marginLeftPercent, true);
        if (m34398a2 != null) {
            if (Log.isLoggable(f4244a, 2)) {
                Log.v(f4244a, "percent left margin: " + m34398a2.f4265a);
            }
            c1701a = m34394a(c1701a);
            c1701a.f4249c = m34398a2;
        }
        C1701a.C1702a m34398a3 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_marginTopPercent, false);
        if (m34398a3 != null) {
            if (Log.isLoggable(f4244a, 2)) {
                Log.v(f4244a, "percent top margin: " + m34398a3.f4265a);
            }
            c1701a = m34394a(c1701a);
            c1701a.f4250d = m34398a3;
        }
        C1701a.C1702a m34398a4 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_marginRightPercent, true);
        if (m34398a4 != null) {
            if (Log.isLoggable(f4244a, 2)) {
                Log.v(f4244a, "percent right margin: " + m34398a4.f4265a);
            }
            c1701a = m34394a(c1701a);
            c1701a.f4251e = m34398a4;
        }
        C1701a.C1702a m34398a5 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_marginBottomPercent, false);
        if (m34398a5 != null) {
            if (Log.isLoggable(f4244a, 2)) {
                Log.v(f4244a, "percent bottom margin: " + m34398a5.f4265a);
            }
            c1701a = m34394a(c1701a);
            c1701a.f4252f = m34398a5;
        }
        C1701a.C1702a m34398a6 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_marginStartPercent, true);
        if (m34398a6 != null) {
            if (Log.isLoggable(f4244a, 2)) {
                Log.v(f4244a, "percent start margin: " + m34398a6.f4265a);
            }
            c1701a = m34394a(c1701a);
            c1701a.f4253g = m34398a6;
        }
        C1701a.C1702a m34398a7 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_marginEndPercent, true);
        if (m34398a7 != null) {
            if (Log.isLoggable(f4244a, 2)) {
                Log.v(f4244a, "percent end margin: " + m34398a7.f4265a);
            }
            C1701a m34394a = m34394a(c1701a);
            m34394a.f4254h = m34398a7;
            return m34394a;
        }
        return c1701a;
    }

    /* renamed from: e */
    private static C1701a m34384e(TypedArray typedArray, C1701a c1701a) {
        C1701a.C1702a m34398a = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_paddingPercent, true);
        if (m34398a != null) {
            c1701a = m34394a(c1701a);
            c1701a.f4260n = m34398a;
            c1701a.f4261o = m34398a;
            c1701a.f4263q = m34398a;
            c1701a.f4262p = m34398a;
        }
        C1701a.C1702a m34398a2 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_paddingLeftPercent, true);
        if (m34398a2 != null) {
            c1701a = m34394a(c1701a);
            c1701a.f4260n = m34398a2;
        }
        C1701a.C1702a m34398a3 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_paddingRightPercent, true);
        if (m34398a3 != null) {
            c1701a = m34394a(c1701a);
            c1701a.f4261o = m34398a3;
        }
        C1701a.C1702a m34398a4 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_paddingTopPercent, true);
        if (m34398a4 != null) {
            c1701a = m34394a(c1701a);
            c1701a.f4262p = m34398a4;
        }
        C1701a.C1702a m34398a5 = m34398a(typedArray, C1572R.styleable.PercentLayout_Layout_layout_paddingBottomPercent, true);
        if (m34398a5 != null) {
            C1701a m34394a = m34394a(c1701a);
            m34394a.f4263q = m34398a5;
            return m34394a;
        }
        return c1701a;
    }

    /* renamed from: a */
    public void m34402a() {
        int childCount = this.f4246b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f4246b.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (Log.isLoggable(f4244a, 3)) {
                Log.d(f4244a, "should restore " + childAt + " " + layoutParams);
            }
            if (layoutParams instanceof AbstractC1703b) {
                C1701a mo34379a = ((AbstractC1703b) layoutParams).mo34379a();
                if (Log.isLoggable(f4244a, 3)) {
                    Log.d(f4244a, "using " + mo34379a);
                }
                if (mo34379a != null) {
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        mo34379a.m34381a((ViewGroup.MarginLayoutParams) layoutParams);
                    } else {
                        mo34379a.m34383a(layoutParams);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m34401a(int i, int i2) {
        if (Log.isLoggable(f4244a, 3)) {
            Log.d(f4244a, "adjustChildren: " + this.f4246b + " widthMeasureSpec: " + View.MeasureSpec.toString(i) + " heightMeasureSpec: " + View.MeasureSpec.toString(i2));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (Log.isLoggable(f4244a, 3)) {
            Log.d(f4244a, "widthHint = " + size + " , heightHint = " + size2);
        }
        int childCount = this.f4246b.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f4246b.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (Log.isLoggable(f4244a, 3)) {
                Log.d(f4244a, "should adjust " + childAt + " " + layoutParams);
            }
            if (layoutParams instanceof AbstractC1703b) {
                C1701a mo34379a = ((AbstractC1703b) layoutParams).mo34379a();
                if (Log.isLoggable(f4244a, 3)) {
                    Log.d(f4244a, "using " + mo34379a);
                }
                if (mo34379a != null) {
                    m34387c(size, size2, childAt, mo34379a);
                    m34400a(size, size2, childAt, mo34379a);
                    m34390b(size, size2, childAt, mo34379a);
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        mo34379a.m34380a((ViewGroup.MarginLayoutParams) layoutParams, size, size2);
                    } else {
                        mo34379a.m34382a(layoutParams, size, size2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m34391b() {
        C1701a mo34379a;
        boolean z;
        int childCount = this.f4246b.getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f4246b.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof AbstractC1703b) && (mo34379a = ((AbstractC1703b) layoutParams).mo34379a()) != null) {
                if (m34396a(childAt, mo34379a)) {
                    layoutParams.width = -2;
                    z = true;
                } else {
                    z = z2;
                }
                if (m34388b(childAt, mo34379a)) {
                    layoutParams.height = -2;
                    z2 = true;
                } else {
                    z2 = z;
                }
            }
        }
        return z2;
    }
}
