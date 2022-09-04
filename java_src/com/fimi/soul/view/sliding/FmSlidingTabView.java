package com.fimi.soul.view.sliding;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p001v4.app.FragmentActivity;
import android.support.p001v4.view.ViewCompat;
import android.support.p001v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.C1670k;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class FmSlidingTabView extends LinearLayout {

    /* renamed from: a */
    public int f13165a;

    /* renamed from: b */
    private Context f13166b;

    /* renamed from: c */
    private Runnable f13167c;

    /* renamed from: d */
    private ViewPager.OnPageChangeListener f13168d;

    /* renamed from: e */
    private int f13169e;

    /* renamed from: f */
    private int f13170f;

    /* renamed from: g */
    private int f13171g;

    /* renamed from: h */
    private int f13172h;

    /* renamed from: i */
    private int f13173i;

    /* renamed from: j */
    private LinearLayout f13174j;

    /* renamed from: k */
    private HorizontalScrollView f13175k;

    /* renamed from: l */
    private FmViewPager f13176l;

    /* renamed from: m */
    private List<String> f13177m;

    /* renamed from: n */
    private List<Drawable> f13178n;

    /* renamed from: o */
    private ArrayList<Fragment> f13179o;

    /* renamed from: p */
    private ArrayList<TextView> f13180p;

    /* renamed from: q */
    private FmFragmentPagerAdapter f13181q;

    /* renamed from: r */
    private View.OnClickListener f13182r;

    /* loaded from: classes2.dex */
    public class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {
        public MyOnPageChangeListener() {
        }

        @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (FmSlidingTabView.this.f13168d != null) {
                FmSlidingTabView.this.f13168d.onPageScrollStateChanged(i);
            }
        }

        @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (FmSlidingTabView.this.f13168d != null) {
                FmSlidingTabView.this.f13168d.onPageScrolled(i, f, i2);
            }
        }

        @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            FmSlidingTabView.this.setCurrentItem(i);
            if (FmSlidingTabView.this.f13168d != null) {
                FmSlidingTabView.this.f13168d.onPageSelected(i);
            }
        }
    }

    public FmSlidingTabView(Fragment fragment) {
        super(fragment.getActivity());
        this.f13170f = -1;
        this.f13171g = 30;
        this.f13172h = ViewCompat.MEASURED_STATE_MASK;
        this.f13173i = ViewCompat.MEASURED_STATE_MASK;
        this.f13174j = null;
        this.f13175k = null;
        this.f13177m = null;
        this.f13178n = null;
        this.f13179o = null;
        this.f13180p = null;
        this.f13181q = null;
        this.f13182r = new View.OnClickListener() { // from class: com.fimi.soul.view.sliding.FmSlidingTabView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FmSlidingTabView.this.f13176l.setCurrentItem(((FmTabItemView) view).getIndex());
            }
        };
        this.f13166b = fragment.getActivity();
        m28333a();
        if (Build.VERSION.SDK_INT <= 17) {
            C1670k.m34698c(FmSlidingTabView.class, "AbSlidingTabView(Fragment fragment) 要求最低SDK版本17");
            return;
        }
        this.f13181q = new FmFragmentPagerAdapter(fragment.getChildFragmentManager(), this.f13179o);
        this.f13176l.setAdapter(this.f13181q);
        this.f13176l.setOnPageChangeListener(new MyOnPageChangeListener());
        this.f13176l.setOffscreenPageLimit(3);
        addView(this.f13176l, new LinearLayout.LayoutParams(-1, -1));
    }

    public FmSlidingTabView(Context context) {
        this(context, null);
    }

    public FmSlidingTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13170f = -1;
        this.f13171g = 30;
        this.f13172h = ViewCompat.MEASURED_STATE_MASK;
        this.f13173i = ViewCompat.MEASURED_STATE_MASK;
        this.f13174j = null;
        this.f13175k = null;
        this.f13177m = null;
        this.f13178n = null;
        this.f13179o = null;
        this.f13180p = null;
        this.f13181q = null;
        this.f13182r = new View.OnClickListener() { // from class: com.fimi.soul.view.sliding.FmSlidingTabView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FmSlidingTabView.this.f13176l.setCurrentItem(((FmTabItemView) view).getIndex());
            }
        };
        this.f13166b = context;
        m28333a();
        this.f13181q = new FmFragmentPagerAdapter(((FragmentActivity) this.f13166b).getFragmentManager(), this.f13179o);
        this.f13176l.setAdapter(this.f13181q);
        this.f13176l.setOnPageChangeListener(new MyOnPageChangeListener());
        this.f13176l.setOffscreenPageLimit(3);
        addView(this.f13176l, new LinearLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    private void m28328a(String str, int i) {
        m28327a(str, i, (Drawable) null);
    }

    /* renamed from: a */
    private void m28327a(String str, int i, Drawable drawable) {
        FmTabItemView fmTabItemView = new FmTabItemView(this.f13166b);
        if (this.f13170f != -1) {
            fmTabItemView.setTabBackgroundResource(this.f13170f);
        }
        if (drawable != null) {
            fmTabItemView.m28315a((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        }
        fmTabItemView.setTabTextColor(this.f13172h);
        fmTabItemView.setTabTextSize(this.f13171g);
        fmTabItemView.m28316a(i, str);
        this.f13180p.add(fmTabItemView.getTextView());
        fmTabItemView.setOnClickListener(this.f13182r);
        this.f13174j.addView(fmTabItemView, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    /* renamed from: b */
    private void m28321b(int i) {
        final View childAt = this.f13174j.getChildAt(i);
        if (this.f13167c != null) {
            removeCallbacks(this.f13167c);
        }
        this.f13167c = new Runnable() { // from class: com.fimi.soul.view.sliding.FmSlidingTabView.2
            @Override // java.lang.Runnable
            public void run() {
                FmSlidingTabView.this.f13175k.smoothScrollTo(childAt.getLeft() - ((FmSlidingTabView.this.getWidth() - childAt.getWidth()) / 2), 0);
                FmSlidingTabView.this.f13167c = null;
            }
        };
        post(this.f13167c);
    }

    /* renamed from: a */
    public void m28333a() {
        setOrientation(1);
        setBackgroundColor(Color.rgb(255, 255, 255));
        this.f13175k = new HorizontalScrollView(this.f13166b);
        this.f13175k.setHorizontalScrollBarEnabled(false);
        this.f13175k.setSmoothScrollingEnabled(true);
        this.f13174j = new LinearLayout(this.f13166b);
        this.f13174j.setOrientation(0);
        this.f13174j.setGravity(17);
        this.f13175k.addView(this.f13174j, new ViewGroup.LayoutParams(-2, -1));
        addView(this.f13175k, new ViewGroup.LayoutParams(-1, -2));
        this.f13176l = new FmViewPager(this.f13166b);
        this.f13176l.setId(1985);
        this.f13179o = new ArrayList<>();
        this.f13180p = new ArrayList<>();
        this.f13177m = new ArrayList();
        this.f13178n = new ArrayList();
        if (!(this.f13166b instanceof FragmentActivity)) {
            C1670k.m34698c(FmSlidingTabView.class, "构造AbSlidingTabView的参数context,必须是FragmentActivity的实例。");
        }
    }

    /* renamed from: a */
    public void m28332a(int i) {
        this.f13174j.removeViewAt(i);
        this.f13179o.remove(i);
        this.f13180p.remove(i);
        this.f13178n.remove(i);
        this.f13177m.remove(i);
        this.f13181q.notifyDataSetChanged();
        m28322b();
    }

    /* renamed from: a */
    public void m28331a(int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 < this.f13180p.size()) {
                this.f13180p.get(i6).setPadding(i, i2, i3, i4);
                i5 = i6 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m28326a(String str, Fragment fragment) {
        this.f13177m.add(str);
        this.f13179o.add(fragment);
        this.f13181q.notifyDataSetChanged();
        m28322b();
    }

    /* renamed from: a */
    public void m28325a(String str, Fragment fragment, Drawable drawable) {
        this.f13177m.add(str);
        this.f13179o.add(fragment);
        this.f13178n.add(drawable);
        this.f13181q.notifyDataSetChanged();
        m28322b();
    }

    /* renamed from: a */
    public void m28324a(List<String> list, List<Fragment> list2) {
        this.f13177m.addAll(list);
        this.f13179o.addAll(list2);
        this.f13181q.notifyDataSetChanged();
        m28322b();
    }

    /* renamed from: a */
    public void m28323a(List<String> list, List<Fragment> list2, List<Drawable> list3) {
        this.f13177m.addAll(list);
        this.f13179o.addAll(list2);
        this.f13178n.addAll(list3);
        this.f13181q.notifyDataSetChanged();
        m28322b();
    }

    /* renamed from: b */
    public void m28322b() {
        this.f13174j.removeAllViews();
        this.f13180p.clear();
        int count = this.f13181q.getCount();
        for (int i = 0; i < count; i++) {
            if (this.f13178n.size() > 0) {
                m28327a(this.f13177m.get(i), i, this.f13178n.get(i));
            } else {
                m28328a(this.f13177m.get(i), i);
            }
        }
        if (this.f13169e > count) {
            this.f13169e = count - 1;
        }
        setCurrentItem(this.f13169e);
        requestLayout();
    }

    /* renamed from: c */
    public void m28319c() {
        this.f13174j.removeAllViews();
        this.f13179o.clear();
        this.f13180p.clear();
        this.f13178n.clear();
        this.f13177m.clear();
        this.f13181q.notifyDataSetChanged();
        m28322b();
    }

    public ViewPager getViewPager() {
        return this.f13176l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13167c != null) {
            post(this.f13167c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f13167c != null) {
            removeCallbacks(this.f13167c);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        this.f13175k.setFillViewport(z);
        int childCount = this.f13174j.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f13165a = -1;
        } else if (childCount > 2) {
            this.f13165a = (int) (View.MeasureSpec.getSize(i) * 0.4f);
        } else {
            this.f13165a = View.MeasureSpec.getSize(i) / 2;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setCurrentItem(this.f13169e);
    }

    public void setCurrentItem(int i) {
        if (this.f13176l == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f13169e = i;
        int childCount = this.f13174j.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            FmTabItemView fmTabItemView = (FmTabItemView) this.f13174j.getChildAt(i2);
            boolean z = i2 == i;
            fmTabItemView.setSelected(z);
            if (z) {
                fmTabItemView.setTabTextColor(this.f13173i);
                m28321b(i);
            } else {
                fmTabItemView.setTabTextColor(this.f13172h);
            }
            i2++;
        }
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f13168d = onPageChangeListener;
    }

    public void setSlidingEnabled(boolean z) {
        this.f13176l.setPagingEnabled(z);
    }

    public void setTabBackgroundResource(int i) {
        this.f13170f = i;
    }

    public void setTabLayoutBackgroundResource(int i) {
        this.f13174j.setBackgroundResource(i);
    }

    public void setTabSelectColor(int i) {
        this.f13173i = i;
    }

    public void setTabTextColor(int i) {
        this.f13172h = i;
    }

    public void setTabTextSize(int i) {
        this.f13171g = i;
    }
}
