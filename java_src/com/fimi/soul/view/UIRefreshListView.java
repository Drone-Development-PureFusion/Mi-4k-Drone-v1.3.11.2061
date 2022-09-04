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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import it.p273a.p274a.AbstractC10866e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p282m.framework.p285ui.widget.asyncview.AsyncImageView;
/* loaded from: classes2.dex */
public class UIRefreshListView extends ListView implements AbsListView.OnScrollListener {

    /* renamed from: a */
    private static final String f12340a = "MM-dd HH:mm";

    /* renamed from: b */
    private static final int f12341b = 3;

    /* renamed from: c */
    private static final int f12342c = 0;

    /* renamed from: d */
    private static final int f12343d = 1;

    /* renamed from: e */
    private static final int f12344e = 2;

    /* renamed from: f */
    private static final int f12345f = 3;

    /* renamed from: g */
    private static final int f12346g = 4;

    /* renamed from: h */
    private static final int f12347h = 1;

    /* renamed from: i */
    private static final int f12348i = 2;

    /* renamed from: j */
    private static final int f12349j = 3;

    /* renamed from: A */
    private RotateAnimation f12350A;

    /* renamed from: B */
    private boolean f12351B;

    /* renamed from: C */
    private int f12352C;

    /* renamed from: D */
    private int f12353D;

    /* renamed from: E */
    private int f12354E;

    /* renamed from: F */
    private boolean f12355F;

    /* renamed from: G */
    private int f12356G;

    /* renamed from: H */
    private int f12357H;

    /* renamed from: I */
    private int f12358I;

    /* renamed from: J */
    private boolean f12359J;

    /* renamed from: K */
    private AbstractC3192c f12360K;

    /* renamed from: L */
    private AbstractC3191b f12361L;

    /* renamed from: M */
    private AbstractC3190a f12362M;

    /* renamed from: k */
    private int f12363k;

    /* renamed from: l */
    private int f12364l;

    /* renamed from: m */
    private boolean f12365m = false;

    /* renamed from: n */
    private boolean f12366n = false;

    /* renamed from: o */
    private boolean f12367o = true;

    /* renamed from: p */
    private boolean f12368p = false;

    /* renamed from: q */
    private LayoutInflater f12369q;

    /* renamed from: r */
    private LinearLayout f12370r;

    /* renamed from: s */
    private TextView f12371s;

    /* renamed from: t */
    private TextView f12372t;

    /* renamed from: u */
    private ImageView f12373u;

    /* renamed from: v */
    private ProgressBar f12374v;

    /* renamed from: w */
    private View f12375w;

    /* renamed from: x */
    private ProgressBar f12376x;

    /* renamed from: y */
    private TextView f12377y;

    /* renamed from: z */
    private RotateAnimation f12378z;

    /* renamed from: com.fimi.soul.view.UIRefreshListView$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3190a {
        /* renamed from: a */
        void m28785a(AbsListView absListView, int i);

        /* renamed from: a */
        void m28784a(AbsListView absListView, int i, int i2, int i3);
    }

    /* renamed from: com.fimi.soul.view.UIRefreshListView$b */
    /* loaded from: classes2.dex */
    public interface AbstractC3191b {
        /* renamed from: a */
        void m28783a();
    }

    /* renamed from: com.fimi.soul.view.UIRefreshListView$c */
    /* loaded from: classes2.dex */
    public interface AbstractC3192c {
        /* renamed from: a */
        void m28782a();
    }

    public UIRefreshListView(Context context) {
        super(context);
        m28807a(context);
    }

    public UIRefreshListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28807a(context);
    }

    public UIRefreshListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28807a(context);
    }

    /* renamed from: a */
    private void m28808a(int i) {
        if (i <= 0) {
            i = AbstractC10866e.f34828G;
        }
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f12378z = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f12378z.setInterpolator(linearInterpolator);
        this.f12378z.setDuration(i);
        this.f12378z.setFillAfter(true);
        this.f12350A = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f12350A.setInterpolator(linearInterpolator);
        this.f12350A.setDuration(i);
        this.f12350A.setFillAfter(true);
    }

    /* renamed from: a */
    private void m28807a(Context context) {
        setCacheColorHint(context.getResources().getColor(AsyncImageView.f35337a));
        this.f12369q = LayoutInflater.from(context);
        m28791h();
        m28790i();
        setOnScrollListener(this);
        m28808a(0);
    }

    /* renamed from: a */
    private void m28806a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* renamed from: h */
    private void m28791h() {
        this.f12370r = (LinearLayout) this.f12369q.inflate(C1704R.layout.rebound_listview_header, (ViewGroup) null);
        this.f12373u = (ImageView) this.f12370r.findViewById(C1704R.C1706id.head_arrowImageView);
        this.f12373u.setMinimumWidth(70);
        this.f12373u.setMinimumHeight(50);
        this.f12374v = (ProgressBar) this.f12370r.findViewById(C1704R.C1706id.head_progressBar);
        this.f12371s = (TextView) this.f12370r.findViewById(C1704R.C1706id.head_tipsTextView);
        this.f12372t = (TextView) this.f12370r.findViewById(C1704R.C1706id.head_lastUpdatedTextView);
        m28806a(this.f12370r);
        this.f12353D = this.f12370r.getMeasuredHeight();
        this.f12352C = this.f12370r.getMeasuredWidth();
        this.f12370r.setPadding(0, this.f12353D * (-1), 0, 0);
        this.f12370r.invalidate();
        Log.v("size", "width:" + this.f12352C + " height:" + this.f12353D);
        addHeaderView(this.f12370r, null, false);
        this.f12363k = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m28790i() {
        this.f12375w = this.f12369q.inflate(C1704R.layout.rebound_listview_footer, (ViewGroup) null);
        this.f12375w.setVisibility(0);
        this.f12376x = (ProgressBar) this.f12375w.findViewById(C1704R.C1706id.pull_to_refresh_progress);
        this.f12377y = (TextView) this.f12375w.findViewById(C1704R.C1706id.load_more);
        this.f12375w.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.UIRefreshListView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UIRefreshListView.this.f12365m) {
                    if (!UIRefreshListView.this.f12366n) {
                        if (UIRefreshListView.this.f12364l == 1) {
                            return;
                        }
                        UIRefreshListView.this.f12364l = 1;
                        UIRefreshListView.this.m28786m();
                    } else if (UIRefreshListView.this.f12364l == 1 || UIRefreshListView.this.f12363k == 2) {
                    } else {
                        UIRefreshListView.this.f12364l = 1;
                        UIRefreshListView.this.m28786m();
                    }
                }
            }
        });
        addFooterView(this.f12375w);
        if (this.f12367o) {
            this.f12364l = 3;
        } else {
            this.f12364l = 2;
        }
    }

    /* renamed from: j */
    private void m28789j() {
        if (this.f12365m) {
            switch (this.f12364l) {
                case 1:
                    if (this.f12377y.getText().equals(Integer.valueOf((int) C1704R.C1707string.refresh_doing_end_refresh))) {
                        return;
                    }
                    this.f12377y.setText(C1704R.C1707string.refresh_doing_end_refresh);
                    this.f12377y.setVisibility(0);
                    this.f12376x.setVisibility(0);
                    return;
                case 2:
                    this.f12377y.setText(C1704R.C1707string.refresh_end_click_load_more);
                    this.f12377y.setVisibility(0);
                    this.f12376x.setVisibility(8);
                    this.f12375w.setVisibility(0);
                    return;
                case 3:
                    this.f12377y.setText(C1704R.C1707string.refresh_end_load_more);
                    this.f12377y.setVisibility(0);
                    this.f12376x.setVisibility(8);
                    this.f12375w.setVisibility(0);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: k */
    private void m28788k() {
        switch (this.f12363k) {
            case 0:
                this.f12373u.setVisibility(0);
                this.f12374v.setVisibility(8);
                this.f12371s.setVisibility(0);
                this.f12372t.setVisibility(0);
                this.f12373u.clearAnimation();
                this.f12373u.startAnimation(this.f12378z);
                this.f12371s.setText(C1704R.C1707string.refresh_release_refresh);
                return;
            case 1:
                this.f12374v.setVisibility(8);
                this.f12371s.setVisibility(0);
                this.f12372t.setVisibility(0);
                this.f12373u.clearAnimation();
                this.f12373u.setVisibility(0);
                if (!this.f12355F) {
                    this.f12371s.setText(C1704R.C1707string.refresh_pull_to_refresh);
                    return;
                }
                this.f12355F = false;
                this.f12373u.clearAnimation();
                this.f12373u.startAnimation(this.f12350A);
                this.f12371s.setText(C1704R.C1707string.refresh_pull_to_refresh);
                return;
            case 2:
                this.f12370r.setPadding(0, 0, 0, 0);
                this.f12374v.setVisibility(0);
                this.f12373u.clearAnimation();
                this.f12373u.setVisibility(8);
                this.f12371s.setText(C1704R.C1707string.refresh_doing_head_refresh);
                this.f12372t.setVisibility(0);
                return;
            case 3:
                this.f12370r.setPadding(0, this.f12353D * (-1), 0, 0);
                this.f12374v.setVisibility(8);
                this.f12373u.clearAnimation();
                this.f12373u.setImageResource(C1704R.C1705drawable.uet_rebound_listview_arrow);
                this.f12371s.setText(C1704R.C1707string.refresh_pull_to_refresh);
                this.f12372t.setVisibility(0);
                return;
            default:
                return;
        }
    }

    /* renamed from: l */
    private void m28787l() {
        if (this.f12360K != null) {
            this.f12360K.m28782a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m28786m() {
        if (this.f12361L != null) {
            this.f12377y.setText(C1704R.C1707string.refresh_doing_end_refresh);
            this.f12377y.setVisibility(0);
            this.f12376x.setVisibility(0);
            this.f12361L.m28783a();
        }
    }

    /* renamed from: a */
    public boolean m28809a() {
        return this.f12365m;
    }

    /* renamed from: b */
    public boolean m28803b() {
        return this.f12366n;
    }

    /* renamed from: c */
    public boolean m28801c() {
        return this.f12367o;
    }

    /* renamed from: d */
    public boolean m28799d() {
        return this.f12368p;
    }

    /* renamed from: e */
    public void m28797e() {
        if (this.f12368p) {
            setSelection(0);
        }
        this.f12363k = 3;
        this.f12372t.setText(getResources().getString(C1704R.C1707string.refresh_refresh_lasttime) + new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA).format(new Date()));
        m28788k();
    }

    /* renamed from: f */
    public void m28795f() {
        if (this.f12367o) {
            this.f12364l = 3;
        } else {
            this.f12364l = 2;
        }
        m28789j();
    }

    /* renamed from: g */
    public void m28793g() {
        removeFooterView(this.f12375w);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f12356G = i;
        this.f12357H = (i + i2) - 2;
        this.f12358I = i3 - 2;
        if (i3 > i2) {
            this.f12359J = true;
        } else {
            this.f12359J = false;
        }
        if (this.f12362M != null) {
            this.f12362M.m28784a(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.f12365m) {
            if (this.f12357H == this.f12358I && i == 0 && this.f12364l != 1) {
                if (!this.f12367o) {
                    this.f12364l = 2;
                    m28789j();
                } else if (!this.f12366n) {
                    this.f12364l = 1;
                    m28786m();
                    m28789j();
                } else if (this.f12363k != 2) {
                    this.f12364l = 1;
                    m28786m();
                    m28789j();
                }
            }
        } else if (this.f12375w != null && this.f12375w.getVisibility() == 0) {
            System.out.println("this.removeFooterView(endRootView);...");
            this.f12375w.setVisibility(8);
            removeFooterView(this.f12375w);
        }
        if (this.f12362M != null) {
            this.f12362M.m28785a(absListView, i);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f12366n) {
            if (this.f12365m && this.f12364l == 1) {
                return super.onTouchEvent(motionEvent);
            }
            switch (motionEvent.getAction()) {
                case 0:
                    if (this.f12356G == 0 && !this.f12351B) {
                        this.f12351B = true;
                        this.f12354E = (int) motionEvent.getY();
                        break;
                    }
                    break;
                case 1:
                    if (this.f12363k != 2 && this.f12363k != 4) {
                        if (this.f12363k == 3) {
                        }
                        if (this.f12363k == 1) {
                            this.f12363k = 3;
                            m28788k();
                        }
                        if (this.f12363k == 0) {
                            this.f12363k = 2;
                            m28788k();
                            m28787l();
                        }
                    }
                    this.f12351B = false;
                    this.f12355F = false;
                    break;
                case 2:
                    int y = (int) motionEvent.getY();
                    if (!this.f12351B && this.f12356G == 0) {
                        this.f12351B = true;
                        this.f12354E = y;
                    }
                    if (this.f12363k != 2 && this.f12351B && this.f12363k != 4) {
                        if (this.f12363k == 0) {
                            setSelection(0);
                            if ((y - this.f12354E) / 3 < this.f12353D && y - this.f12354E > 0) {
                                this.f12363k = 1;
                                m28788k();
                            } else if (y - this.f12354E <= 0) {
                                this.f12363k = 3;
                                m28788k();
                            }
                        }
                        if (this.f12363k == 1) {
                            setSelection(0);
                            if ((y - this.f12354E) / 3 >= this.f12353D) {
                                this.f12363k = 0;
                                this.f12355F = true;
                                m28788k();
                            } else if (y - this.f12354E <= 0) {
                                this.f12363k = 3;
                                m28788k();
                            }
                        }
                        if (this.f12363k == 3 && y - this.f12354E > 0) {
                            this.f12363k = 1;
                            m28788k();
                        }
                        if (this.f12363k == 1) {
                            this.f12370r.setPadding(0, (this.f12353D * (-1)) + ((y - this.f12354E) / 3), 0, 0);
                        }
                        if (this.f12363k == 0) {
                            this.f12370r.setPadding(0, ((y - this.f12354E) / 3) - this.f12353D, 0, 0);
                            break;
                        }
                    }
                    break;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdapter(BaseAdapter baseAdapter) {
        this.f12372t.setText(getResources().getString(C1704R.C1707string.refresh_refresh_lasttime) + new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA).format(new Date()));
        super.setAdapter((ListAdapter) baseAdapter);
    }

    public void setAutoLoadMore(boolean z) {
        this.f12367o = z;
    }

    public void setCanLoadMore(final boolean z) {
        this.f12365m = z;
        if (this.f12375w == null) {
            m28790i();
        }
        this.f12375w.post(new Runnable() { // from class: com.fimi.soul.view.UIRefreshListView.1
            @Override // java.lang.Runnable
            public void run() {
                if (!z || UIRefreshListView.this.getFooterViewsCount() != 0) {
                    UIRefreshListView.this.m28793g();
                } else {
                    UIRefreshListView.this.m28790i();
                }
                UIRefreshListView.this.f12375w.setVisibility(z ? 0 : 8);
                UIRefreshListView.this.f12375w.setPadding(0, z ? 0 : -UIRefreshListView.this.f12375w.getHeight(), 0, 0);
            }
        });
    }

    public void setCanRefresh(boolean z) {
        this.f12366n = z;
    }

    public void setListViewOnScrollListener(AbstractC3190a abstractC3190a) {
        this.f12362M = abstractC3190a;
    }

    public void setMoveToFirstItemAfterRefresh(boolean z) {
        this.f12368p = z;
    }

    public void setOnLoadListener(AbstractC3191b abstractC3191b) {
        if (abstractC3191b != null) {
            this.f12361L = abstractC3191b;
            if (!this.f12365m || getFooterViewsCount() != 0) {
                return;
            }
            m28790i();
        }
    }

    public void setOnRefreshListener(AbstractC3192c abstractC3192c) {
        if (abstractC3192c != null) {
            this.f12360K = abstractC3192c;
        }
    }
}
