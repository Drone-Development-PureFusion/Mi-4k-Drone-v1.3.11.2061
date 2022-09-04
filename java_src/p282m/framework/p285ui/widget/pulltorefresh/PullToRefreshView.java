package p282m.framework.p285ui.widget.pulltorefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
/* renamed from: m.framework.ui.widget.pulltorefresh.PullToRefreshView */
/* loaded from: classes2.dex */
public class PullToRefreshView extends RelativeLayout {

    /* renamed from: a */
    private static final long f35379a = 1000;

    /* renamed from: b */
    private AbstractC10980d f35380b;

    /* renamed from: c */
    private View f35381c;

    /* renamed from: d */
    private View f35382d;

    /* renamed from: e */
    private int f35383e;

    /* renamed from: f */
    private int f35384f;

    /* renamed from: g */
    private float f35385g;

    /* renamed from: h */
    private boolean f35386h;

    /* renamed from: i */
    private boolean f35387i;

    /* renamed from: j */
    private Runnable f35388j;

    /* renamed from: k */
    private long f35389k;

    public PullToRefreshView(Context context) {
        super(context);
        m2429d();
    }

    public PullToRefreshView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2429d();
    }

    public PullToRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2429d();
    }

    /* renamed from: a */
    private MotionEvent m2435a(MotionEvent motionEvent) {
        return MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
    }

    /* renamed from: d */
    private void m2429d() {
        this.f35388j = new Runnable() { // from class: m.framework.ui.widget.pulltorefresh.PullToRefreshView.1
            @Override // java.lang.Runnable
            public void run() {
                PullToRefreshView.this.m2426g();
                PullToRefreshView.this.m2427f();
            }
        };
    }

    /* renamed from: e */
    private void m2428e() {
        this.f35389k = System.currentTimeMillis();
        this.f35386h = true;
        if (this.f35380b != null) {
            this.f35380b.m2409g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m2427f() {
        this.f35386h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m2426g() {
        this.f35384f = 0;
        scrollTo(0, 0);
        if (this.f35380b != null) {
            this.f35380b.m2408h();
        }
    }

    /* renamed from: h */
    private boolean m2425h() {
        return !this.f35387i && this.f35380b.mo2372f();
    }

    /* renamed from: a */
    public void m2436a() {
        long currentTimeMillis = System.currentTimeMillis() - this.f35389k;
        if (currentTimeMillis < 1000) {
            postDelayed(this.f35388j, 1000 - currentTimeMillis);
        } else {
            post(this.f35388j);
        }
    }

    /* renamed from: a */
    public void m2433a(boolean z) {
        this.f35384f = this.f35383e;
        scrollTo(0, -this.f35384f);
        if (z) {
            m2428e();
        }
    }

    /* renamed from: b */
    public void m2432b() {
        this.f35387i = true;
    }

    /* renamed from: c */
    public void m2430c() {
        this.f35387i = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f35385g = motionEvent.getY();
                break;
            case 1:
            case 3:
                if (this.f35386h) {
                    this.f35384f = this.f35383e;
                    scrollTo(0, -this.f35384f);
                    break;
                } else if (this.f35384f <= this.f35383e) {
                    if (this.f35384f != 0) {
                        m2426g();
                        if (this.f35380b != null) {
                            this.f35380b.m2412a(0);
                            break;
                        }
                    }
                } else {
                    this.f35384f = this.f35383e;
                    scrollTo(0, -this.f35384f);
                    if (this.f35380b != null) {
                        this.f35380b.m2412a(100);
                    }
                    m2428e();
                    motionEvent = m2435a(motionEvent);
                    break;
                }
                break;
            case 2:
                float y = motionEvent.getY();
                if (this.f35386h || m2425h()) {
                    this.f35384f = (int) (this.f35384f + ((y - this.f35385g) / 2.0f));
                    if (this.f35384f > 0) {
                        scrollTo(0, -this.f35384f);
                        if (!this.f35386h && this.f35380b != null) {
                            this.f35380b.m2412a((this.f35384f * 100) / this.f35383e);
                        }
                        motionEvent = m2435a(motionEvent);
                    } else {
                        this.f35384f = 0;
                        scrollTo(0, 0);
                    }
                }
                this.f35385g = y;
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setAdapter(AbstractC10980d abstractC10980d) {
        this.f35380b = abstractC10980d;
        removeAllViews();
        this.f35382d = (View) abstractC10980d.mo2373e();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(11, -1);
        layoutParams.addRule(10, -1);
        addView(this.f35382d, layoutParams);
        this.f35381c = abstractC10980d.m2410d();
        this.f35381c.measure(0, 0);
        this.f35383e = this.f35381c.getMeasuredHeight();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, this.f35383e);
        layoutParams2.addRule(9, -1);
        layoutParams2.addRule(11, -1);
        layoutParams2.addRule(10, -1);
        layoutParams2.topMargin = -this.f35383e;
        addView(this.f35381c, layoutParams2);
    }
}
