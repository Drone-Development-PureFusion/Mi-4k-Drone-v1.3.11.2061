package p282m.framework.p285ui.widget.slidingmenu;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;
/* renamed from: m.framework.ui.widget.slidingmenu.a */
/* loaded from: classes2.dex */
public class C10999a extends HorizontalScrollView {

    /* renamed from: a */
    private static final int f35449a = 500;

    /* renamed from: b */
    private static final int f35450b = 230;

    /* renamed from: c */
    private float f35451c = 2.14748365E9f;

    /* renamed from: d */
    private SlidingMenu f35452d;

    /* renamed from: e */
    private int f35453e;

    /* renamed from: f */
    private VelocityTracker f35454f;

    public C10999a(SlidingMenu slidingMenu) {
        super(slidingMenu.getContext());
        this.f35452d = slidingMenu;
        this.f35453e = ViewConfiguration.get(slidingMenu.getContext()).getScaledMaximumFlingVelocity();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f35451c = motionEvent.getX();
                if (this.f35452d.m2351e() && this.f35451c > this.f35452d.getMenuWidth() && motionEvent.getY() > this.f35452d.getMenuConfig().f35464i) {
                    super.onInterceptTouchEvent(motionEvent);
                    return true;
                }
                break;
            case 1:
            case 3:
                this.f35451c = 2.14748365E9f;
                break;
            case 2:
                if (!this.f35452d.m2351e() && this.f35451c > this.f35452d.getShowMenuWidth()) {
                    super.onInterceptTouchEvent(motionEvent);
                    return false;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f35452d.getMenuCover().setBackgroundColor(Color.argb((i * 230) / this.f35452d.getMenuWidth(), 0, 0, 0));
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f35454f == null) {
            this.f35454f = VelocityTracker.obtain();
        }
        this.f35454f.addMovement(motionEvent);
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                if (this.f35452d.m2351e() && this.f35451c < this.f35452d.getMenuWidth()) {
                    return false;
                }
                this.f35451c = 2.14748365E9f;
                this.f35454f.computeCurrentVelocity(1000, this.f35453e);
                float xVelocity = this.f35454f.getXVelocity();
                this.f35454f.recycle();
                this.f35454f = null;
                int scrollX = getScrollX();
                if (xVelocity - 500.0f > 0.0f) {
                    this.f35452d.m2357c();
                } else if (xVelocity + 500.0f < 0.0f) {
                    this.f35452d.m2354d();
                } else if (scrollX > this.f35452d.getMenuWidth() / 2) {
                    this.f35452d.m2354d();
                } else {
                    this.f35452d.m2357c();
                }
                return true;
            case 2:
            default:
                if (this.f35452d.m2351e() && this.f35451c < this.f35452d.getMenuWidth()) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
