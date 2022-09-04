package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TabWidget;
import android.widget.TextView;
/* loaded from: classes.dex */
public class BadgeView extends TextView {

    /* renamed from: a */
    public static final int f11891a = 1;

    /* renamed from: b */
    public static final int f11892b = 2;

    /* renamed from: c */
    public static final int f11893c = 3;

    /* renamed from: d */
    public static final int f11894d = 4;

    /* renamed from: e */
    public static final int f11895e = 5;

    /* renamed from: f */
    public static final int f11896f = 10;

    /* renamed from: g */
    private static final int f11897g = 5;

    /* renamed from: h */
    private static final int f11898h = 5;

    /* renamed from: i */
    private static final int f11899i = 8;

    /* renamed from: j */
    private static final int f11900j = 2;

    /* renamed from: k */
    private static final int f11901k = Color.parseColor("#CCFF0000");

    /* renamed from: l */
    private static final int f11902l = -1;

    /* renamed from: m */
    private static Animation f11903m;

    /* renamed from: n */
    private static Animation f11904n;

    /* renamed from: o */
    private Context f11905o;

    /* renamed from: p */
    private View f11906p;

    /* renamed from: q */
    private int f11907q;

    /* renamed from: r */
    private int f11908r;

    /* renamed from: s */
    private int f11909s;

    /* renamed from: t */
    private int f11910t;

    /* renamed from: u */
    private boolean f11911u;

    /* renamed from: v */
    private ShapeDrawable f11912v;

    /* renamed from: w */
    private int f11913w;

    public BadgeView(Context context) {
        this(context, (AttributeSet) null, 16842884);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 0);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i, View view, int i2) {
        super(context, attributeSet, i);
        m28986a(context, view, i2);
    }

    public BadgeView(Context context, View view) {
        this(context, null, 16842884, view, 0);
    }

    public BadgeView(Context context, TabWidget tabWidget, int i) {
        this(context, null, 16842884, tabWidget, i);
    }

    /* renamed from: a */
    private void m28986a(Context context, View view, int i) {
        this.f11905o = context;
        this.f11906p = view;
        this.f11913w = i;
        this.f11907q = 2;
        this.f11908r = m28973c(5);
        this.f11909s = this.f11908r;
        this.f11910t = f11901k;
        setTypeface(Typeface.DEFAULT_BOLD);
        int m28973c = m28973c(5);
        setPadding(m28973c, 0, m28973c, 0);
        setTextColor(-1);
        f11903m = new AlphaAnimation(0.0f, 1.0f);
        f11903m.setInterpolator(new DecelerateInterpolator());
        f11903m.setDuration(500L);
        f11904n = new AlphaAnimation(1.0f, 0.0f);
        f11904n.setInterpolator(new AccelerateInterpolator());
        f11904n.setDuration(500L);
        this.f11911u = false;
        if (this.f11906p != null) {
            m28985a(this.f11906p);
        } else {
            m28989a();
        }
    }

    /* renamed from: a */
    private void m28985a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewParent parent = view.getParent();
        FrameLayout frameLayout = new FrameLayout(this.f11905o);
        if (view instanceof TabWidget) {
            View childTabViewAt = ((TabWidget) view).getChildTabViewAt(this.f11913w);
            this.f11906p = childTabViewAt;
            ((ViewGroup) childTabViewAt).addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            setVisibility(8);
            frameLayout.addView(this);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int indexOfChild = viewGroup.indexOfChild(view);
        viewGroup.removeView(view);
        viewGroup.addView(frameLayout, indexOfChild, layoutParams);
        frameLayout.addView(view);
        setVisibility(8);
        frameLayout.addView(this);
        viewGroup.invalidate();
    }

    /* renamed from: a */
    private void m28981a(boolean z, Animation animation) {
        if (getBackground() == null) {
            if (this.f11912v == null) {
                this.f11912v = getDefaultBackground();
            }
            setBackgroundDrawable(this.f11912v);
        }
        m28971d();
        if (z) {
            startAnimation(animation);
        }
        setVisibility(0);
        this.f11911u = true;
    }

    /* renamed from: a */
    private void m28980a(boolean z, Animation animation, Animation animation2) {
        boolean z2 = true;
        if (this.f11911u) {
            if (!z || animation2 == null) {
                z2 = false;
            }
            m28975b(z2, animation2);
            return;
        }
        if (!z || animation == null) {
            z2 = false;
        }
        m28981a(z2, animation);
    }

    /* renamed from: b */
    private void m28975b(boolean z, Animation animation) {
        setVisibility(8);
        if (z) {
            startAnimation(animation);
        }
        this.f11911u = false;
    }

    /* renamed from: c */
    private int m28973c(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    /* renamed from: d */
    private void m28971d() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        switch (this.f11907q) {
            case 1:
                layoutParams.gravity = 51;
                layoutParams.setMargins(this.f11908r, this.f11909s, 0, 0);
                break;
            case 2:
                layoutParams.gravity = 53;
                layoutParams.setMargins(0, this.f11909s, this.f11908r, 0);
                break;
            case 3:
                layoutParams.gravity = 83;
                layoutParams.setMargins(this.f11908r, 0, 0, this.f11909s);
                break;
            case 4:
                layoutParams.gravity = 85;
                layoutParams.setMargins(0, 0, this.f11908r, this.f11909s);
                break;
            case 5:
                layoutParams.gravity = 17;
                layoutParams.setMargins(0, 0, 0, 0);
                break;
            case 10:
                layoutParams.gravity = 17;
                layoutParams.setMargins(this.f11908r, 0, 0, 0);
                break;
        }
        setLayoutParams(layoutParams);
    }

    private ShapeDrawable getDefaultBackground() {
        int m28973c = m28973c(8);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{m28973c, m28973c, m28973c, m28973c, m28973c, m28973c, m28973c, m28973c}, null, null));
        shapeDrawable.getPaint().setColor(this.f11910t);
        return shapeDrawable;
    }

    /* renamed from: a */
    public int m28988a(int i) {
        int i2 = 0;
        CharSequence text = getText();
        if (text != null) {
            try {
                i2 = Integer.parseInt(text.toString());
            } catch (NumberFormatException e) {
            }
        }
        int i3 = i2 + i;
        setText(String.valueOf(i3));
        return i3;
    }

    /* renamed from: a */
    public void m28989a() {
        m28981a(false, (Animation) null);
    }

    /* renamed from: a */
    public void m28987a(int i, int i2) {
        this.f11908r = i;
        this.f11909s = i2;
    }

    /* renamed from: a */
    public void m28984a(Animation animation) {
        m28981a(true, animation);
    }

    /* renamed from: a */
    public void m28983a(Animation animation, Animation animation2) {
        m28980a(true, animation, animation2);
    }

    /* renamed from: a */
    public void m28982a(boolean z) {
        m28981a(z, f11903m);
    }

    /* renamed from: b */
    public int m28978b(int i) {
        return m28988a(-i);
    }

    /* renamed from: b */
    public void m28979b() {
        m28975b(false, null);
    }

    /* renamed from: b */
    public void m28977b(Animation animation) {
        m28975b(true, animation);
    }

    /* renamed from: b */
    public void m28976b(boolean z) {
        m28975b(z, f11904n);
    }

    /* renamed from: c */
    public void m28974c() {
        m28980a(false, (Animation) null, (Animation) null);
    }

    /* renamed from: c */
    public void m28972c(boolean z) {
        m28980a(z, f11903m, f11904n);
    }

    public int getBadgeBackgroundColor() {
        return this.f11910t;
    }

    public int getBadgePosition() {
        return this.f11907q;
    }

    public int getHorizontalBadgeMargin() {
        return this.f11908r;
    }

    public View getTarget() {
        return this.f11906p;
    }

    public int getVerticalBadgeMargin() {
        return this.f11909s;
    }

    @Override // android.view.View
    public boolean isShown() {
        return this.f11911u;
    }

    public void setBadgeBackgroundColor(int i) {
        this.f11910t = i;
        this.f11912v = getDefaultBackground();
    }

    public void setBadgeMargin(int i) {
        this.f11908r = i;
        this.f11909s = i;
    }

    public void setBadgePosition(int i) {
        this.f11907q = i;
    }
}
