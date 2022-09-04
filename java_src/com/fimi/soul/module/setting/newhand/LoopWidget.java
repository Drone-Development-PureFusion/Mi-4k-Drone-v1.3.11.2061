package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.os.Handler;
import android.support.p001v4.view.PagerAdapter;
import android.support.p001v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.fimi.overseas.soul.C1704R;
import com.p120c.p121a.p122a.p123a.p126b.C1272c;
import com.p120c.p121a.p129b.C1311c;
import com.p120c.p121a.p129b.C1321d;
import com.p120c.p121a.p129b.C1328e;
import com.p120c.p121a.p129b.p130a.EnumC1302g;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class LoopWidget extends FrameLayout {

    /* renamed from: a */
    private int f10668a;

    /* renamed from: b */
    private C1321d f10669b;

    /* renamed from: c */
    private List<ImageView> f10670c;

    /* renamed from: d */
    private Context f10671d;

    /* renamed from: e */
    private ViewPager f10672e;

    /* renamed from: f */
    private boolean f10673f;

    /* renamed from: g */
    private int f10674g;

    /* renamed from: h */
    private int f10675h;

    /* renamed from: i */
    private LinearLayout f10676i;

    /* renamed from: j */
    private List<ImageView> f10677j;

    /* renamed from: k */
    private Handler f10678k;

    /* renamed from: l */
    private C1311c f10679l;

    /* renamed from: m */
    private final Runnable f10680m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.module.setting.newhand.LoopWidget$a */
    /* loaded from: classes.dex */
    public class C2950a extends PagerAdapter {
        C2950a() {
        }

        @Override // android.support.p001v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) LoopWidget.this.f10670c.get(i));
        }

        @Override // android.support.p001v4.view.PagerAdapter
        public int getCount() {
            return LoopWidget.this.f10670c.size();
        }

        @Override // android.support.p001v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            viewGroup.addView((View) LoopWidget.this.f10670c.get(i));
            return LoopWidget.this.f10670c.get(i);
        }

        @Override // android.support.p001v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.module.setting.newhand.LoopWidget$b */
    /* loaded from: classes.dex */
    public class C2951b implements ViewPager.OnPageChangeListener {
        C2951b() {
        }

        @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            switch (i) {
                case 0:
                    if (LoopWidget.this.f10672e.getCurrentItem() == 0) {
                        LoopWidget.this.f10672e.setCurrentItem(LoopWidget.this.f10668a, false);
                    } else if (LoopWidget.this.f10672e.getCurrentItem() == LoopWidget.this.f10668a + 1) {
                        LoopWidget.this.f10672e.setCurrentItem(1, false);
                    }
                    LoopWidget.this.f10674g = LoopWidget.this.f10672e.getCurrentItem();
                    LoopWidget.this.f10673f = true;
                    return;
                case 1:
                    LoopWidget.this.f10673f = false;
                    return;
                case 2:
                    LoopWidget.this.f10673f = true;
                    return;
                default:
                    return;
            }
        }

        @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < LoopWidget.this.f10677j.size()) {
                    if (i3 == i - 1) {
                        ((ImageView) LoopWidget.this.f10677j.get(i3)).setImageResource(C1704R.C1705drawable.dot_focus);
                    } else {
                        ((ImageView) LoopWidget.this.f10677j.get(i3)).setImageResource(C1704R.C1705drawable.dot_blur);
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public LoopWidget(Context context) {
        this(context, null);
    }

    public LoopWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoopWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10678k = new Handler();
        this.f10680m = new Runnable() { // from class: com.fimi.soul.module.setting.newhand.LoopWidget.1
            @Override // java.lang.Runnable
            public void run() {
                if (!LoopWidget.this.f10673f) {
                    LoopWidget.this.f10678k.postDelayed(LoopWidget.this.f10680m, 5000L);
                    return;
                }
                LoopWidget.this.f10674g = (LoopWidget.this.f10674g % (LoopWidget.this.f10668a + 1)) + 1;
                if (LoopWidget.this.f10674g == 1) {
                    LoopWidget.this.f10672e.setCurrentItem(LoopWidget.this.f10674g, false);
                    LoopWidget.this.f10678k.post(LoopWidget.this.f10680m);
                    return;
                }
                LoopWidget.this.f10672e.setCurrentItem(LoopWidget.this.f10674g);
                LoopWidget.this.f10678k.postDelayed(LoopWidget.this.f10680m, 2000L);
            }
        };
        this.f10671d = context;
        m29855a(context);
        m29856a();
    }

    /* renamed from: a */
    private void m29856a() {
        this.f10670c = new ArrayList();
        this.f10677j = new ArrayList();
        this.f10675h = C2954b.f10826ao;
    }

    /* renamed from: a */
    private void m29851a(int[] iArr) {
        this.f10668a = iArr.length;
        for (int i = 0; i < this.f10668a; i++) {
            ImageView imageView = new ImageView(this.f10671d);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = 5;
            layoutParams.rightMargin = 5;
            imageView.setImageResource(C1704R.C1705drawable.dot_blur);
            this.f10676i.addView(imageView, layoutParams);
            this.f10677j.add(imageView);
        }
        this.f10677j.get(0).setImageResource(C1704R.C1705drawable.dot_focus);
        for (int i2 = 0; i2 <= this.f10668a + 1; i2++) {
            ImageView imageView2 = new ImageView(this.f10671d);
            imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            if (i2 == 0) {
                imageView2.setImageResource(iArr[this.f10668a - 1]);
            } else if (i2 == this.f10668a + 1) {
                imageView2.setImageResource(iArr[0]);
            } else {
                imageView2.setImageResource(iArr[i2 - 1]);
            }
            this.f10670c.add(imageView2);
        }
    }

    /* renamed from: a */
    private void m29850a(String[] strArr) {
        this.f10668a = strArr.length;
        for (int i = 0; i < this.f10668a; i++) {
            ImageView imageView = new ImageView(this.f10671d);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = 5;
            layoutParams.rightMargin = 5;
            imageView.setImageResource(C1704R.C1705drawable.dot_blur);
            this.f10676i.addView(imageView, layoutParams);
            this.f10677j.add(imageView);
        }
        this.f10677j.get(0).setImageResource(C1704R.C1705drawable.dot_focus);
        for (int i2 = 0; i2 <= this.f10668a + 1; i2++) {
            ImageView imageView2 = new ImageView(this.f10671d);
            imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            if (i2 == 0) {
                this.f10669b.m35786a(strArr[this.f10668a - 1], imageView2, this.f10679l);
            } else if (i2 == this.f10668a + 1) {
                this.f10669b.m35786a(strArr[0], imageView2, this.f10679l);
            } else {
                this.f10669b.m35786a(strArr[i2 - 1], imageView2, this.f10679l);
            }
            this.f10670c.add(imageView2);
        }
    }

    /* renamed from: b */
    private void m29849b() {
        this.f10670c.clear();
        View inflate = LayoutInflater.from(this.f10671d).inflate(C1704R.layout.kanner_layout, (ViewGroup) this, true);
        this.f10672e = (ViewPager) inflate.findViewById(C1704R.C1706id.vp);
        this.f10676i = (LinearLayout) inflate.findViewById(C1704R.C1706id.ll_dot);
        this.f10676i.setVisibility(8);
        this.f10676i.removeAllViews();
    }

    /* renamed from: c */
    private void m29847c() {
        this.f10672e.setAdapter(new C2950a());
        this.f10672e.setFocusable(true);
        this.f10672e.setCurrentItem(1);
        this.f10674g = 1;
        this.f10672e.setOnPageChangeListener(new C2951b());
        m29845d();
    }

    /* renamed from: d */
    private void m29845d() {
        this.f10673f = true;
        this.f10678k.postDelayed(this.f10680m, 2000L);
    }

    /* renamed from: a */
    public void m29855a(Context context) {
        C1321d.m35794a().m35790a(new C1328e.C1330a(context).m35720b(3).m35734a().m35717b(new C1272c()).m35727a(EnumC1302g.LIFO).m35721b().m35714c());
        this.f10679l = new C1311c.C1313a().m35824b(true).m35815d(true).m35818d();
        this.f10669b = C1321d.m35794a();
    }

    public void setImagesRes(int[] iArr) {
        m29849b();
        m29851a(iArr);
        m29847c();
    }

    public void setImagesUrl(String[] strArr) {
        m29849b();
        m29850a(strArr);
        m29847c();
    }
}
