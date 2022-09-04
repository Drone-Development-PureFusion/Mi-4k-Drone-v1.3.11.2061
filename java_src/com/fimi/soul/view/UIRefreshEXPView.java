package com.fimi.soul.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import it.p273a.p274a.AbstractC10866e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p282m.framework.p285ui.widget.asyncview.AsyncImageView;
/* loaded from: classes2.dex */
public class UIRefreshEXPView extends ExpandableListView implements AbsListView.OnScrollListener {

    /* renamed from: a */
    private static final String f12298a = "MM-dd HH:mm";

    /* renamed from: b */
    private static final int f12299b = 3;

    /* renamed from: c */
    private static final int f12300c = 0;

    /* renamed from: d */
    private static final int f12301d = 1;

    /* renamed from: e */
    private static final int f12302e = 2;

    /* renamed from: f */
    private static final int f12303f = 3;

    /* renamed from: g */
    private static final int f12304g = 4;

    /* renamed from: h */
    private static final int f12305h = 1;

    /* renamed from: i */
    private static final int f12306i = 2;

    /* renamed from: j */
    private static final int f12307j = 3;

    /* renamed from: A */
    private RotateAnimation f12308A;

    /* renamed from: B */
    private boolean f12309B;

    /* renamed from: C */
    private int f12310C;

    /* renamed from: D */
    private int f12311D;

    /* renamed from: E */
    private int f12312E;

    /* renamed from: F */
    private boolean f12313F;

    /* renamed from: G */
    private int f12314G;

    /* renamed from: H */
    private int f12315H;

    /* renamed from: I */
    private int f12316I;

    /* renamed from: J */
    private boolean f12317J;

    /* renamed from: K */
    private AbstractC3187c f12318K;

    /* renamed from: L */
    private AbstractC3186b f12319L;

    /* renamed from: M */
    private AbstractC3185a f12320M;

    /* renamed from: k */
    private int f12321k;

    /* renamed from: l */
    private int f12322l;

    /* renamed from: m */
    private boolean f12323m = false;

    /* renamed from: n */
    private boolean f12324n = false;

    /* renamed from: o */
    private boolean f12325o = true;

    /* renamed from: p */
    private boolean f12326p = false;

    /* renamed from: q */
    private LayoutInflater f12327q;

    /* renamed from: r */
    private LinearLayout f12328r;

    /* renamed from: s */
    private TextView f12329s;

    /* renamed from: t */
    private TextView f12330t;

    /* renamed from: u */
    private ImageView f12331u;

    /* renamed from: v */
    private ProgressBar f12332v;

    /* renamed from: w */
    private View f12333w;

    /* renamed from: x */
    private ProgressBar f12334x;

    /* renamed from: y */
    private TextView f12335y;

    /* renamed from: z */
    private RotateAnimation f12336z;

    /* renamed from: com.fimi.soul.view.UIRefreshEXPView$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3185a {
        /* renamed from: a */
        void m28813a(AbsListView absListView, int i);

        /* renamed from: a */
        void m28812a(AbsListView absListView, int i, int i2, int i3);
    }

    /* renamed from: com.fimi.soul.view.UIRefreshEXPView$b */
    /* loaded from: classes2.dex */
    public interface AbstractC3186b {
        /* renamed from: a */
        void m28811a();
    }

    /* renamed from: com.fimi.soul.view.UIRefreshEXPView$c */
    /* loaded from: classes2.dex */
    public interface AbstractC3187c {
        /* renamed from: a */
        void m28810a();
    }

    public UIRefreshEXPView(Context context) {
        super(context);
        m28835a(context);
    }

    public UIRefreshEXPView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28835a(context);
    }

    public UIRefreshEXPView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28835a(context);
    }

    /* renamed from: a */
    private void m28836a(int i) {
        if (i <= 0) {
            i = AbstractC10866e.f34828G;
        }
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f12336z = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f12336z.setInterpolator(linearInterpolator);
        this.f12336z.setDuration(i);
        this.f12336z.setFillAfter(true);
        this.f12308A = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f12308A.setInterpolator(linearInterpolator);
        this.f12308A.setDuration(i);
        this.f12308A.setFillAfter(true);
    }

    /* renamed from: a */
    private void m28835a(Context context) {
        setCacheColorHint(context.getResources().getColor(AsyncImageView.f35337a));
        this.f12327q = LayoutInflater.from(context);
        m28819h();
        m28818i();
        setOnScrollListener(this);
        m28836a(0);
    }

    /* renamed from: a */
    private void m28834a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* renamed from: h */
    private void m28819h() {
        this.f12328r = (LinearLayout) this.f12327q.inflate(C1704R.layout.rebound_listview_header, (ViewGroup) null);
        this.f12331u = (ImageView) this.f12328r.findViewById(C1704R.C1706id.head_arrowImageView);
        this.f12331u.setMinimumWidth(70);
        this.f12331u.setMinimumHeight(50);
        this.f12332v = (ProgressBar) this.f12328r.findViewById(C1704R.C1706id.head_progressBar);
        this.f12329s = (TextView) this.f12328r.findViewById(C1704R.C1706id.head_tipsTextView);
        this.f12330t = (TextView) this.f12328r.findViewById(C1704R.C1706id.head_lastUpdatedTextView);
        m28834a(this.f12328r);
        this.f12311D = this.f12328r.getMeasuredHeight();
        this.f12310C = this.f12328r.getMeasuredWidth();
        this.f12328r.setPadding(0, this.f12311D * (-1), 0, 0);
        this.f12328r.invalidate();
        Log.v("size", "width:" + this.f12310C + " height:" + this.f12311D);
        addHeaderView(this.f12328r, null, false);
        this.f12321k = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m28818i() {
        this.f12333w = this.f12327q.inflate(C1704R.layout.rebound_listview_footer, (ViewGroup) null);
        this.f12333w.setVisibility(0);
        this.f12334x = (ProgressBar) this.f12333w.findViewById(C1704R.C1706id.pull_to_refresh_progress);
        this.f12335y = (TextView) this.f12333w.findViewById(C1704R.C1706id.load_more);
        this.f12333w.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.UIRefreshEXPView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UIRefreshEXPView.this.f12323m) {
                    if (!UIRefreshEXPView.this.f12324n) {
                        if (UIRefreshEXPView.this.f12322l == 1) {
                            return;
                        }
                        UIRefreshEXPView.this.f12322l = 1;
                        UIRefreshEXPView.this.m28814m();
                    } else if (UIRefreshEXPView.this.f12322l == 1 || UIRefreshEXPView.this.f12321k == 2) {
                    } else {
                        UIRefreshEXPView.this.f12322l = 1;
                        UIRefreshEXPView.this.m28814m();
                    }
                }
            }
        });
        addFooterView(this.f12333w);
        if (this.f12325o) {
            this.f12322l = 3;
        } else {
            this.f12322l = 2;
        }
    }

    /* renamed from: j */
    private void m28817j() {
        if (this.f12323m) {
            switch (this.f12322l) {
                case 1:
                    if (this.f12335y.getText().equals(Integer.valueOf((int) C1704R.C1707string.refresh_doing_end_refresh))) {
                        return;
                    }
                    this.f12335y.setText(C1704R.C1707string.refresh_doing_end_refresh);
                    this.f12335y.setVisibility(0);
                    this.f12334x.setVisibility(0);
                    return;
                case 2:
                    this.f12335y.setText(C1704R.C1707string.refresh_end_click_load_more);
                    this.f12335y.setVisibility(0);
                    this.f12334x.setVisibility(8);
                    this.f12333w.setVisibility(0);
                    return;
                case 3:
                    this.f12335y.setText(C1704R.C1707string.refresh_end_load_more);
                    this.f12335y.setVisibility(0);
                    this.f12334x.setVisibility(8);
                    this.f12333w.setVisibility(0);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: k */
    private void m28816k() {
        switch (this.f12321k) {
            case 0:
                this.f12331u.setVisibility(0);
                this.f12332v.setVisibility(8);
                this.f12329s.setVisibility(0);
                this.f12330t.setVisibility(0);
                this.f12331u.clearAnimation();
                this.f12331u.startAnimation(this.f12336z);
                this.f12329s.setText(C1704R.C1707string.refresh_release_refresh);
                return;
            case 1:
                this.f12332v.setVisibility(8);
                this.f12329s.setVisibility(0);
                this.f12330t.setVisibility(0);
                this.f12331u.clearAnimation();
                this.f12331u.setVisibility(0);
                if (!this.f12313F) {
                    this.f12329s.setText(C1704R.C1707string.refresh_pull_to_refresh);
                    return;
                }
                this.f12313F = false;
                this.f12331u.clearAnimation();
                this.f12331u.startAnimation(this.f12308A);
                this.f12329s.setText(C1704R.C1707string.refresh_pull_to_refresh);
                return;
            case 2:
                this.f12328r.setPadding(0, 0, 0, 0);
                this.f12332v.setVisibility(0);
                this.f12331u.clearAnimation();
                this.f12331u.setVisibility(8);
                this.f12329s.setText(C1704R.C1707string.refresh_doing_head_refresh);
                this.f12330t.setVisibility(0);
                return;
            case 3:
                this.f12328r.setPadding(0, this.f12311D * (-1), 0, 0);
                this.f12332v.setVisibility(8);
                this.f12331u.clearAnimation();
                this.f12331u.setImageResource(C1704R.C1705drawable.uet_rebound_listview_arrow);
                this.f12329s.setText(C1704R.C1707string.refresh_pull_to_refresh);
                this.f12330t.setVisibility(0);
                return;
            default:
                return;
        }
    }

    /* renamed from: l */
    private void m28815l() {
        if (this.f12318K != null) {
            this.f12318K.m28810a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m28814m() {
        if (this.f12319L != null) {
            this.f12335y.setText(C1704R.C1707string.refresh_doing_end_refresh);
            this.f12335y.setVisibility(0);
            this.f12334x.setVisibility(0);
            this.f12319L.m28811a();
        }
    }

    /* renamed from: a */
    public boolean m28837a() {
        return this.f12323m;
    }

    /* renamed from: b */
    public boolean m28831b() {
        return this.f12324n;
    }

    /* renamed from: c */
    public boolean m28829c() {
        return this.f12325o;
    }

    /* renamed from: d */
    public boolean m28827d() {
        return this.f12326p;
    }

    /* renamed from: e */
    public void m28825e() {
        if (this.f12326p) {
            setSelection(0);
        }
        this.f12321k = 3;
        this.f12330t.setText(getResources().getString(C1704R.C1707string.refresh_refresh_lasttime) + new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA).format(new Date()));
        m28816k();
    }

    /* renamed from: f */
    public void m28823f() {
        if (this.f12325o) {
            this.f12322l = 3;
        } else {
            this.f12322l = 2;
        }
        m28817j();
    }

    /* renamed from: g */
    public void m28821g() {
        removeFooterView(this.f12333w);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f12314G = i;
        this.f12315H = (i + i2) - 2;
        this.f12316I = i3 - 2;
        if (i3 > i2) {
            this.f12317J = true;
        } else {
            this.f12317J = false;
        }
        if (this.f12320M != null) {
            this.f12320M.m28812a(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.f12323m) {
            if (this.f12315H == this.f12316I && i == 0 && this.f12322l != 1) {
                if (!this.f12325o) {
                    this.f12322l = 2;
                    m28817j();
                } else if (!this.f12324n) {
                    this.f12322l = 1;
                    m28814m();
                    m28817j();
                } else if (this.f12321k != 2) {
                    this.f12322l = 1;
                    m28814m();
                    m28817j();
                }
            }
        } else if (this.f12333w != null && this.f12333w.getVisibility() == 0) {
            System.out.println("this.removeFooterView(endRootView);...");
            this.f12333w.setVisibility(8);
            removeFooterView(this.f12333w);
        }
        if (this.f12320M != null) {
            this.f12320M.m28813a(absListView, i);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f12324n) {
            if (this.f12323m && this.f12322l == 1) {
                return super.onTouchEvent(motionEvent);
            }
            switch (motionEvent.getAction()) {
                case 0:
                    if (this.f12314G == 0 && !this.f12309B) {
                        this.f12309B = true;
                        this.f12312E = (int) motionEvent.getY();
                        break;
                    }
                    break;
                case 1:
                    if (this.f12321k != 2 && this.f12321k != 4) {
                        if (this.f12321k == 3) {
                        }
                        if (this.f12321k == 1) {
                            this.f12321k = 3;
                            m28816k();
                        }
                        if (this.f12321k == 0) {
                            this.f12321k = 2;
                            m28816k();
                            m28815l();
                        }
                    }
                    this.f12309B = false;
                    this.f12313F = false;
                    break;
                case 2:
                    int y = (int) motionEvent.getY();
                    if (!this.f12309B && this.f12314G == 0) {
                        this.f12309B = true;
                        this.f12312E = y;
                    }
                    if (this.f12321k != 2 && this.f12309B && this.f12321k != 4) {
                        if (this.f12321k == 0) {
                            setSelection(0);
                            if ((y - this.f12312E) / 3 < this.f12311D && y - this.f12312E > 0) {
                                this.f12321k = 1;
                                m28816k();
                            } else if (y - this.f12312E <= 0) {
                                this.f12321k = 3;
                                m28816k();
                            }
                        }
                        if (this.f12321k == 1) {
                            setSelection(0);
                            if ((y - this.f12312E) / 3 >= this.f12311D) {
                                this.f12321k = 0;
                                this.f12313F = true;
                                m28816k();
                            } else if (y - this.f12312E <= 0) {
                                this.f12321k = 3;
                                m28816k();
                            }
                        }
                        if (this.f12321k == 3 && y - this.f12312E > 0) {
                            this.f12321k = 1;
                            m28816k();
                        }
                        if (this.f12321k == 1) {
                            this.f12328r.setPadding(0, (this.f12311D * (-1)) + ((y - this.f12312E) / 3), 0, 0);
                        }
                        if (this.f12321k == 0) {
                            this.f12328r.setPadding(0, ((y - this.f12312E) / 3) - this.f12311D, 0, 0);
                            break;
                        }
                    }
                    break;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdapter(BaseAdapter baseAdapter) {
        this.f12330t.setText(getResources().getString(C1704R.C1707string.refresh_refresh_lasttime) + new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA).format(new Date()));
        super.setAdapter((ListAdapter) baseAdapter);
    }

    public void setAutoLoadMore(boolean z) {
        this.f12325o = z;
    }

    public void setCanLoadMore(final boolean z) {
        this.f12323m = z;
        if (this.f12333w == null) {
            m28818i();
        }
        this.f12333w.post(new Runnable() { // from class: com.fimi.soul.view.UIRefreshEXPView.1
            @Override // java.lang.Runnable
            public void run() {
                if (!z || UIRefreshEXPView.this.getFooterViewsCount() != 0) {
                    UIRefreshEXPView.this.m28821g();
                } else {
                    UIRefreshEXPView.this.m28818i();
                }
                UIRefreshEXPView.this.f12333w.setVisibility(z ? 0 : 8);
                UIRefreshEXPView.this.f12333w.setPadding(0, z ? 0 : -UIRefreshEXPView.this.f12333w.getHeight(), 0, 0);
            }
        });
    }

    public void setCanRefresh(boolean z) {
        this.f12324n = z;
    }

    public void setListViewOnScrollListener(AbstractC3185a abstractC3185a) {
        this.f12320M = abstractC3185a;
    }

    public void setMoveToFirstItemAfterRefresh(boolean z) {
        this.f12326p = z;
    }

    public void setOnLoadListener(AbstractC3186b abstractC3186b) {
        if (abstractC3186b != null) {
            this.f12319L = abstractC3186b;
            if (!this.f12323m || getFooterViewsCount() != 0) {
                return;
            }
            m28818i();
        }
    }

    public void setOnRefreshListener(AbstractC3187c abstractC3187c) {
        if (abstractC3187c != null) {
            this.f12318K = abstractC3187c;
        }
    }
}
