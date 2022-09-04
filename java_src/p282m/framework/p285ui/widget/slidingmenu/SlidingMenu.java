package p282m.framework.p285ui.widget.slidingmenu;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import java.lang.reflect.Method;
import java.util.HashMap;
/* renamed from: m.framework.ui.widget.slidingmenu.SlidingMenu */
/* loaded from: classes2.dex */
public class SlidingMenu extends RelativeLayout {

    /* renamed from: a */
    private C11001c f35425a;

    /* renamed from: b */
    private HashMap<C11003e, View> f35426b;

    /* renamed from: c */
    private View.OnClickListener f35427c;

    /* renamed from: d */
    private View.OnTouchListener f35428d;

    /* renamed from: e */
    private AbstractC11000b f35429e;

    /* renamed from: f */
    private int f35430f;

    /* renamed from: g */
    private int f35431g;

    /* renamed from: h */
    private int f35432h;

    /* renamed from: i */
    private boolean f35433i;

    /* renamed from: j */
    private FrameLayout f35434j;

    /* renamed from: k */
    private LinearLayout f35435k;

    /* renamed from: l */
    private View f35436l;

    /* renamed from: m */
    private C10999a f35437m;

    /* renamed from: n */
    private LinearLayout f35438n;

    /* renamed from: o */
    private View f35439o;

    public SlidingMenu(Context context) {
        super(context);
        m2366a(context);
    }

    public SlidingMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2366a(context);
    }

    public SlidingMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2366a(context);
    }

    /* renamed from: a */
    private void m2366a(Context context) {
        this.f35425a = new C11001c();
        this.f35426b = new HashMap<>();
        this.f35427c = new View.OnClickListener() { // from class: m.framework.ui.widget.slidingmenu.SlidingMenu.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C11003e c11003e = (C11003e) view.getTag();
                if (c11003e == null || SlidingMenu.this.f35429e == null || SlidingMenu.this.f35429e.m2329b(c11003e)) {
                    return;
                }
                SlidingMenu.this.postDelayed(new Runnable() { // from class: m.framework.ui.widget.slidingmenu.SlidingMenu.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SlidingMenu.this.m2354d();
                    }
                }, 500L);
            }
        };
        this.f35428d = new View.OnTouchListener() { // from class: m.framework.ui.widget.slidingmenu.SlidingMenu.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        view.setBackgroundResource(SlidingMenu.this.f35425a.f35456a);
                        return false;
                    case 1:
                    case 3:
                        view.setBackgroundResource(SlidingMenu.this.f35425a.f35457b);
                        return false;
                    case 2:
                    default:
                        return false;
                }
            }
        };
        this.f35430f = context.getResources().getDisplayMetrics().widthPixels;
        this.f35431g = (int) (this.f35430f * this.f35425a.f35458c);
        this.f35432h = (this.f35430f - this.f35431g) / 2;
        setBackgroundResource(this.f35425a.f35459d);
        m2360b(context);
        m2356c(context);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: m.framework.ui.widget.slidingmenu.SlidingMenu.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                SlidingMenu.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                SlidingMenu.this.post(new Runnable() { // from class: m.framework.ui.widget.slidingmenu.SlidingMenu.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SlidingMenu.this.m2354d();
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private void m2365a(View view) {
        if (Build.VERSION.SDK_INT < 9) {
            return;
        }
        try {
            Method method = View.class.getMethod("setOverScrollMode", Integer.TYPE);
            method.setAccessible(true);
            method.invoke(view, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m2360b(Context context) {
        this.f35434j = new FrameLayout(context) { // from class: m.framework.ui.widget.slidingmenu.SlidingMenu.4
            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (!SlidingMenu.this.f35433i) {
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        this.f35434j.setLayoutParams(new FrameLayout.LayoutParams(this.f35431g, -1));
        addView(this.f35434j);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f35434j.addView(linearLayout);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setVerticalFadingEdgeEnabled(false);
        m2365a(scrollView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        scrollView.setLayoutParams(layoutParams);
        linearLayout.addView(scrollView);
        this.f35435k = new LinearLayout(context);
        this.f35435k.setOrientation(1);
        this.f35435k.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        scrollView.addView(this.f35435k);
        this.f35436l = new View(context);
        this.f35436l.setBackgroundColor(0);
        this.f35436l.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f35434j.addView(this.f35436l);
    }

    /* renamed from: c */
    private void m2356c(Context context) {
        this.f35437m = new C10999a(this);
        this.f35437m.setHorizontalScrollBarEnabled(false);
        this.f35437m.setHorizontalFadingEdgeEnabled(false);
        m2365a(this.f35437m);
        this.f35437m.setLayoutParams(new FrameLayout.LayoutParams(this.f35430f, -1));
        addView(this.f35437m);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(this.f35430f + this.f35431g, -1));
        this.f35437m.addView(linearLayout);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(this.f35431g, -1));
        linearLayout.addView(frameLayout);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(this.f35425a.f35466k);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 5;
        imageView.setLayoutParams(layoutParams);
        frameLayout.addView(imageView);
        this.f35438n = new LinearLayout(context) { // from class: m.framework.ui.widget.slidingmenu.SlidingMenu.5
            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return true;
            }
        };
        this.f35438n.setBackgroundResource(this.f35425a.f35465j);
        this.f35438n.setLayoutParams(new LinearLayout.LayoutParams(this.f35430f, -1));
        linearLayout.addView(this.f35438n);
    }

    /* renamed from: d */
    private void m2353d(Context context) {
        this.f35430f = context.getResources().getDisplayMetrics().widthPixels;
        this.f35431g = (int) (this.f35430f * this.f35425a.f35458c);
        this.f35432h = (this.f35430f - this.f35431g) / 2;
        setBackgroundResource(this.f35425a.f35459d);
        m2350e(context);
        m2347f(context);
    }

    /* renamed from: e */
    private void m2350e(Context context) {
        View m2342a;
        ViewGroup.LayoutParams layoutParams = this.f35434j.getLayoutParams();
        layoutParams.width = this.f35431g;
        this.f35434j.setLayoutParams(layoutParams);
        this.f35435k.setPadding(this.f35425a.f35460e, this.f35425a.f35461f, this.f35425a.f35462g, this.f35425a.f35463h);
        if (this.f35429e == null || (m2342a = this.f35429e.m2342a()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = m2342a.getLayoutParams();
        int i = -2;
        if (layoutParams2 != null) {
            i = layoutParams2.height;
        }
        m2342a.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        ((LinearLayout) this.f35434j.getChildAt(0)).addView(m2342a);
    }

    /* renamed from: f */
    private void m2348f() {
        Context context = getContext();
        this.f35435k.removeAllViews();
        int m2332b = this.f35429e.m2332b();
        for (int i = 0; i < m2332b; i++) {
            this.f35435k.addView(this.f35429e.m2339a(i, this.f35435k));
            int m2327a = this.f35429e.m2341a(i).m2327a();
            for (int i2 = 0; i2 < m2327a; i2++) {
                C11003e m2340a = this.f35429e.m2340a(i, i2);
                View m2334a = this.f35429e.m2334a(m2340a, this.f35435k);
                this.f35435k.addView(m2334a);
                this.f35435k.addView(m2346g(context));
                this.f35426b.put(m2340a, m2334a);
                m2334a.setTag(m2340a);
                m2334a.setOnClickListener(this.f35427c);
                m2334a.setOnTouchListener(this.f35428d);
            }
            int childCount = this.f35435k.getChildCount();
            if (childCount > 0) {
                this.f35435k.removeViewAt(childCount - 1);
            }
        }
    }

    /* renamed from: f */
    private void m2347f(Context context) {
        ViewGroup.LayoutParams layoutParams = this.f35437m.getLayoutParams();
        layoutParams.width = this.f35430f;
        this.f35437m.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) this.f35437m.getChildAt(0);
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        layoutParams2.width = this.f35430f + this.f35431g;
        linearLayout.setLayoutParams(layoutParams2);
        FrameLayout frameLayout = (FrameLayout) linearLayout.getChildAt(0);
        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        layoutParams3.width = this.f35431g;
        frameLayout.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.f35438n.getLayoutParams();
        layoutParams4.width = this.f35430f;
        this.f35438n.setLayoutParams(layoutParams4);
        this.f35438n.setBackgroundResource(this.f35425a.f35465j);
        ((ImageView) frameLayout.getChildAt(0)).setImageResource(this.f35425a.f35466k);
        if (!this.f35433i) {
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: m.framework.ui.widget.slidingmenu.SlidingMenu.6
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    SlidingMenu.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    SlidingMenu.this.post(new Runnable() { // from class: m.framework.ui.widget.slidingmenu.SlidingMenu.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            SlidingMenu.this.f35437m.scrollTo(SlidingMenu.this.f35431g, 0);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: g */
    private View m2346g(Context context) {
        View view = new View(context);
        view.setBackgroundResource(this.f35425a.f35467l);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 2));
        return view;
    }

    /* renamed from: a */
    View m2363a(C11003e c11003e) {
        return this.f35426b.get(c11003e);
    }

    /* renamed from: a */
    public void m2369a() {
        if (this.f35429e != null) {
            m2353d(getContext());
            m2348f();
        }
    }

    /* renamed from: a */
    public void m2368a(int i, int i2) {
        this.f35425a.f35456a = i;
        this.f35425a.f35457b = i2;
    }

    /* renamed from: a */
    public void m2367a(int i, int i2, int i3, int i4) {
        this.f35425a.f35460e = i;
        this.f35425a.f35461f = i2;
        this.f35425a.f35462g = i3;
        this.f35425a.f35463h = i4;
    }

    /* renamed from: b */
    public void m2362b() {
        if (this.f35433i) {
            m2354d();
        } else {
            m2357c();
        }
    }

    /* renamed from: b */
    public void m2361b(int i, int i2) {
        C11003e m2330b;
        if (this.f35429e == null || (m2330b = this.f35429e.m2330b(i, i2)) == null) {
            return;
        }
        this.f35429e.m2329b(m2330b);
    }

    /* renamed from: b */
    public void m2358b(C11003e c11003e) {
        if (this.f35429e == null || c11003e == null) {
            return;
        }
        this.f35429e.m2329b(c11003e);
    }

    /* renamed from: c */
    public void m2357c() {
        this.f35433i = true;
        this.f35437m.smoothScrollTo(0, 0);
        if (this.f35429e != null) {
            this.f35429e.m2333a(this.f35433i);
        }
    }

    /* renamed from: d */
    public void m2354d() {
        this.f35433i = false;
        this.f35437m.smoothScrollTo(this.f35431g, 0);
        if (this.f35429e != null) {
            this.f35429e.m2333a(this.f35433i);
        }
    }

    /* renamed from: e */
    public boolean m2351e() {
        return this.f35433i;
    }

    public View getBodyView() {
        return this.f35439o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11001c getMenuConfig() {
        return this.f35425a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View getMenuCover() {
        return this.f35436l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMenuWidth() {
        return this.f35431g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getShowMenuWidth() {
        return this.f35432h;
    }

    public void setAdapter(AbstractC11000b abstractC11000b) {
        this.f35429e = abstractC11000b;
        m2369a();
    }

    public void setBodyBackground(int i) {
        this.f35425a.f35465j = i;
    }

    public void setBodyView(View view) {
        this.f35439o = view;
        this.f35438n.removeAllViews();
        if (this.f35439o != null) {
            this.f35439o.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.f35438n.addView(this.f35439o);
        }
    }

    public void setMenuBackground(int i) {
        this.f35425a.f35459d = i;
    }

    public void setMenuDivider(int i) {
        this.f35425a.f35467l = i;
    }

    public void setMenuWeight(float f) {
        this.f35425a.f35458c = f;
    }

    public void setShadowRes(int i) {
        this.f35425a.f35466k = i;
    }

    public void setTtleHeight(int i) {
        this.f35425a.f35464i = i;
    }
}
