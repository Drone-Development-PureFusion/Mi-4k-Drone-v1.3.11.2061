package p282m.framework.p285ui.widget.pulltorefresh;

import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
/* renamed from: m.framework.ui.widget.pulltorefresh.h */
/* loaded from: classes2.dex */
public abstract class AbstractC10987h extends AbstractC10981e {

    /* renamed from: a */
    private ScrollableListView f35418a = new ScrollableListView(a());

    /* renamed from: b */
    private C10977a f35419b = new C10977a(this);

    /* renamed from: c */
    private boolean f35420c;

    /* renamed from: d */
    private AbstractC10978b f35421d;

    public AbstractC10987h(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
        this.f35418a.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: m.framework.ui.widget.pulltorefresh.h.1

            /* renamed from: b */
            private int f35423b;

            /* renamed from: c */
            private int f35424c;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                this.f35423b = i;
                this.f35424c = i2;
                AbstractC10987h.this.mo2377a(AbstractC10987h.this.f35418a, i, i2, i3);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                AbstractC10987h.this.f35420c = i == 2;
                if (i == 0) {
                    if (AbstractC10987h.this.f35421d != null) {
                        AbstractC10987h.this.f35421d.m2415a(this.f35423b, this.f35424c);
                    } else if (AbstractC10987h.this.f35419b == null) {
                    } else {
                        AbstractC10987h.this.f35419b.notifyDataSetChanged();
                    }
                }
            }
        });
        this.f35418a.setAdapter((ListAdapter) this.f35419b);
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10981e
    /* renamed from: a */
    public void mo2377a(AbstractC10989i abstractC10989i, int i, int i2, int i3) {
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10980d
    /* renamed from: c */
    public void mo2375c() {
        super.c();
        this.f35419b.notifyDataSetChanged();
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10980d
    /* renamed from: e */
    public AbstractC10989i mo2373e() {
        return this.f35418a;
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10980d
    /* renamed from: f */
    public boolean mo2372f() {
        return this.f35418a.m2418a();
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10981e
    /* renamed from: j */
    public boolean mo2371j() {
        return this.f35420c;
    }

    /* renamed from: k */
    public ListView m2370k() {
        return this.f35418a;
    }
}
