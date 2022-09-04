package com.fimi.soul.view.wheelview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.module.p208a.C2473d;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class WheelView extends ScrollView {

    /* renamed from: a */
    public static final String f13236a = WheelView.class.getSimpleName();

    /* renamed from: c */
    public static final int f13237c = 1;

    /* renamed from: t */
    private static final int f13238t = 0;

    /* renamed from: u */
    private static final int f13239u = 1;

    /* renamed from: b */
    List<C2473d> f13240b;

    /* renamed from: e */
    int f13242e;

    /* renamed from: g */
    int f13244g;

    /* renamed from: h */
    Runnable f13245h;

    /* renamed from: k */
    int[] f13248k;

    /* renamed from: l */
    Paint f13249l;

    /* renamed from: m */
    int f13250m;

    /* renamed from: n */
    private Context f13251n;

    /* renamed from: o */
    private LinearLayout f13252o;

    /* renamed from: p */
    private int f13253p;

    /* renamed from: q */
    private int f13254q;

    /* renamed from: r */
    private int f13255r;

    /* renamed from: v */
    private float f13257v;

    /* renamed from: w */
    private AbstractC3330a f13258w;

    /* renamed from: d */
    int f13241d = 1;

    /* renamed from: f */
    int f13243f = 1;

    /* renamed from: i */
    int f13246i = 50;

    /* renamed from: j */
    int f13247j = 0;

    /* renamed from: s */
    private int f13256s = -1;

    /* renamed from: com.fimi.soul.view.wheelview.WheelView$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3330a {
        /* renamed from: a */
        void mo28279a(int i, Object obj);

        /* renamed from: h */
        void mo28278h();
    }

    public WheelView(Context context) {
        super(context);
        m28290a(context);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28290a(context);
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28290a(context);
    }

    /* renamed from: a */
    private int m28293a(float f) {
        return (int) ((this.f13251n.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    /* renamed from: a */
    private int m28289a(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        return view.getMeasuredHeight();
    }

    /* renamed from: a */
    private View m28288a(C2473d c2473d) {
        View inflate = LayoutInflater.from(this.f13251n).inflate(C1704R.layout.camera_menu_list_item, (ViewGroup) null);
        if (!c2473d.m31547d()) {
            ((TextView) inflate.findViewById(C1704R.C1706id.tv_lv_item_tag)).setText(c2473d.m31554a());
            ((TextView) inflate.findViewById(C1704R.C1706id.tv_lv_item_value)).setText(c2473d.m31551b());
            ((TextView) inflate.findViewById(C1704R.C1706id.tv_lv_item_default1)).setVisibility(8);
        } else {
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.tv_lv_item_default1);
            ((TextView) inflate.findViewById(C1704R.C1706id.tv_lv_item_tag)).setVisibility(8);
            ((TextView) inflate.findViewById(C1704R.C1706id.tv_lv_item_value)).setVisibility(8);
            textView.setText(c2473d.m31554a());
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.wheelview.WheelView.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    WheelView.this.f13258w.mo28278h();
                }
            });
        }
        if (this.f13247j == 0) {
            this.f13247j = m28289a(inflate);
            Log.d(f13236a, "itemHeight: " + this.f13247j);
            this.f13252o.setLayoutParams(new FrameLayout.LayoutParams(-1, this.f13247j * this.f13242e));
            setLayoutParams(new LinearLayout.LayoutParams(((LinearLayout.LayoutParams) getLayoutParams()).width, this.f13247j * this.f13242e));
        }
        return inflate;
    }

    /* renamed from: a */
    private void m28292a(int i) {
        int i2 = (i / this.f13247j) + this.f13241d;
        int i3 = i % this.f13247j;
        int i4 = i / this.f13247j;
        int i5 = i3 == 0 ? this.f13241d + i4 : i3 > this.f13247j / 2 ? this.f13241d + i4 + 1 : i2;
        int childCount = this.f13252o.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = this.f13252o.getChildAt(i6);
            if (childAt == null) {
                return;
            }
            TextView textView = (TextView) childAt.findViewById(C1704R.C1706id.tv_lv_item_tag);
            TextView textView2 = (TextView) childAt.findViewById(C1704R.C1706id.tv_lv_item_value);
            if (i5 == i6) {
                textView.setTextColor(this.f13253p);
                textView2.setTextColor(this.f13253p);
                if (this.f13258w != null) {
                    this.f13258w.mo28279a(i5, this.f13240b.get(i5));
                }
            } else {
                textView.setTextColor(this.f13254q);
                textView2.setTextColor(this.f13254q);
            }
        }
    }

    /* renamed from: a */
    private void m28290a(Context context) {
        this.f13251n = context;
        this.f13257v = context.getResources().getDimension(C1704R.dimen.camera_menu_line_margin);
        this.f13253p = context.getResources().getColor(C1704R.color.camera_menu_item_text_color_sel);
        this.f13254q = context.getResources().getColor(C1704R.color.camera_menu_item_text_color_def);
        Log.d(f13236a, "parent: " + getParent());
        setVerticalScrollBarEnabled(false);
        this.f13252o = new LinearLayout(context);
        this.f13252o.setOrientation(1);
        addView(this.f13252o);
        this.f13245h = new Runnable() { // from class: com.fimi.soul.view.wheelview.WheelView.1
            @Override // java.lang.Runnable
            public void run() {
                if (WheelView.this.f13244g - WheelView.this.getScrollY() != 0) {
                    WheelView.this.f13244g = WheelView.this.getScrollY();
                    WheelView.this.postDelayed(WheelView.this.f13245h, WheelView.this.f13246i);
                    return;
                }
                final int i = WheelView.this.f13244g % WheelView.this.f13247j;
                final int i2 = WheelView.this.f13244g / WheelView.this.f13247j;
                if (i == 0) {
                    WheelView.this.f13243f = i2 + WheelView.this.f13241d;
                    WheelView.this.m28281d();
                } else if (i > WheelView.this.f13247j / 2) {
                    WheelView.this.post(new Runnable() { // from class: com.fimi.soul.view.wheelview.WheelView.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            WheelView.this.smoothScrollTo(0, (WheelView.this.f13244g - i) + WheelView.this.f13247j);
                            WheelView.this.f13243f = i2 + WheelView.this.f13241d + 1;
                            WheelView.this.m28281d();
                        }
                    });
                } else {
                    WheelView.this.post(new Runnable() { // from class: com.fimi.soul.view.wheelview.WheelView.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            WheelView.this.smoothScrollTo(0, WheelView.this.f13244g - i);
                            WheelView.this.f13243f = i2 + WheelView.this.f13241d;
                            WheelView.this.m28281d();
                        }
                    });
                }
            }
        };
    }

    /* renamed from: b */
    private void m28285b() {
        this.f13242e = (this.f13241d * 2) + 1;
        for (C2473d c2473d : this.f13240b) {
            this.f13252o.addView(m28288a(c2473d));
        }
        m28292a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public int[] m28283c() {
        if (this.f13248k == null) {
            this.f13248k = new int[2];
            this.f13248k[0] = this.f13247j * this.f13241d;
            this.f13248k[1] = this.f13247j * (this.f13241d + 1);
        }
        return this.f13248k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m28281d() {
        if (this.f13258w != null) {
            this.f13258w.mo28279a(this.f13243f, this.f13240b.get(this.f13243f));
        }
    }

    private List<C2473d> getItems() {
        return this.f13240b;
    }

    /* renamed from: a */
    public void m28294a() {
        this.f13244g = getScrollY();
        postDelayed(this.f13245h, this.f13246i);
    }

    /* renamed from: a */
    public void m28291a(int i, String str) {
        View childAt;
        if (this.f13240b != null && this.f13240b.size() > 0) {
            this.f13240b.get(i).m31550b(str);
        }
        if (this.f13252o.getChildCount() <= 0 || (childAt = this.f13252o.getChildAt(i)) == null) {
            return;
        }
        ((TextView) childAt.findViewById(C1704R.C1706id.tv_lv_item_value)).setText(str);
    }

    /* renamed from: a */
    public void m28286a(String[] strArr) {
        if (this.f13240b == null || this.f13240b.size() <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= strArr.length) {
                return;
            }
            this.f13240b.get(i2 + 1).m31550b(strArr[i2]);
            View childAt = this.f13252o.getChildAt(i2 + 1);
            if (childAt == null) {
                return;
            }
            ((TextView) childAt.findViewById(C1704R.C1706id.tv_lv_item_value)).setText(strArr[i2]);
            i = i2 + 1;
        }
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        super.fling(i / 3);
    }

    public int getOffset() {
        return this.f13241d;
    }

    public AbstractC3330a getOnWheelViewListener() {
        return this.f13258w;
    }

    public int getSeletedIndex() {
        return this.f13243f - this.f13241d;
    }

    public C2473d getSeletedItem() {
        return this.f13240b.get(this.f13243f);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m28292a(i2);
        if (i2 > i4) {
            this.f13256s = 1;
        } else {
            this.f13256s = 0;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.d(f13236a, "w: " + i + ", h: " + i2 + ", oldw: " + i3 + ", oldh: " + i4);
        this.f13250m = i;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            m28294a();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f13250m == 0) {
            this.f13250m = ((Activity) this.f13251n).getWindowManager().getDefaultDisplay().getWidth();
            Log.d(f13236a, "viewWidth: " + this.f13250m);
        }
        if (this.f13249l == null) {
            this.f13249l = new Paint();
            this.f13249l.setColor(Color.parseColor("#00cc00"));
            this.f13249l.setStrokeWidth(m28293a(1.0f));
        }
        super.setBackgroundDrawable(new Drawable() { // from class: com.fimi.soul.view.wheelview.WheelView.3
            @Override // android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
                float f = WheelView.this.f13250m - WheelView.this.f13257v;
                canvas.drawLine(WheelView.this.f13257v, WheelView.this.m28283c()[0], f, WheelView.this.m28283c()[0], WheelView.this.f13249l);
                canvas.drawLine(WheelView.this.f13257v, WheelView.this.m28283c()[1], f, WheelView.this.m28283c()[1], WheelView.this.f13249l);
            }

            @Override // android.graphics.drawable.Drawable
            public int getOpacity() {
                return 0;
            }

            @Override // android.graphics.drawable.Drawable
            public void setAlpha(int i) {
            }

            @Override // android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
            }
        });
    }

    public void setItems(List<C2473d> list) {
        if (this.f13240b == null) {
            this.f13240b = new ArrayList();
        }
        this.f13240b.clear();
        this.f13240b.addAll(list);
        for (int i = 0; i < this.f13241d; i++) {
            this.f13240b.add(0, new C2473d());
            C2473d c2473d = new C2473d();
            c2473d.m31549b(true);
            c2473d.m31553a(this.f13251n.getResources().getString(C1704R.C1707string.camera_menu_redefault));
            this.f13240b.add(c2473d);
        }
        m28285b();
    }

    public void setOffset(int i) {
        this.f13241d = i;
    }

    public void setOnWheelViewListener(AbstractC3330a abstractC3330a) {
        this.f13258w = abstractC3330a;
    }

    public void setSeletion(final int i) {
        this.f13243f = this.f13241d + i;
        post(new Runnable() { // from class: com.fimi.soul.view.wheelview.WheelView.4
            @Override // java.lang.Runnable
            public void run() {
                WheelView.this.smoothScrollTo(0, i * WheelView.this.f13247j);
            }
        });
    }
}
