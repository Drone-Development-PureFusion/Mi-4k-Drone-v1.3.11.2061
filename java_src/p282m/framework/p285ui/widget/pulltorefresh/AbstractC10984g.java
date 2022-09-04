package p282m.framework.p285ui.widget.pulltorefresh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import p282m.framework.p285ui.widget.pulltorefresh.GroupListView;
/* renamed from: m.framework.ui.widget.pulltorefresh.g */
/* loaded from: classes2.dex */
public abstract class AbstractC10984g extends AbstractC10980d {

    /* renamed from: a */
    private ScrollableGroupListView f35410a = new ScrollableGroupListView(a());

    /* renamed from: b */
    private GroupListView.AbstractC10971a f35411b = new GroupListView.AbstractC10971a() { // from class: m.framework.ui.widget.pulltorefresh.g.2
        @Override // p282m.framework.p285ui.widget.pulltorefresh.GroupListView.AbstractC10971a
        /* renamed from: a */
        public int mo2385a() {
            return AbstractC10984g.this.m2388i();
        }

        @Override // p282m.framework.p285ui.widget.pulltorefresh.GroupListView.AbstractC10971a
        /* renamed from: a */
        public View mo2382a(int i, int i2, View view, ViewGroup viewGroup) {
            return AbstractC10984g.this.m2397a(i, i2, view, viewGroup);
        }

        @Override // p282m.framework.p285ui.widget.pulltorefresh.GroupListView.AbstractC10971a
        /* renamed from: a */
        public View mo2381a(int i, View view, ViewGroup viewGroup) {
            return AbstractC10984g.this.m2396a(i, view, viewGroup);
        }

        @Override // p282m.framework.p285ui.widget.pulltorefresh.GroupListView.AbstractC10971a
        /* renamed from: a */
        public Object mo2383a(int i, int i2) {
            return AbstractC10984g.this.m2398a(i, i2);
        }

        @Override // p282m.framework.p285ui.widget.pulltorefresh.GroupListView.AbstractC10971a
        /* renamed from: a */
        public String mo2384a(int i) {
            return AbstractC10984g.this.m2392b(i);
        }

        @Override // p282m.framework.p285ui.widget.pulltorefresh.GroupListView.AbstractC10971a
        /* renamed from: b */
        public int mo2380b(int i) {
            return AbstractC10984g.this.m2390c(i);
        }
    };

    /* renamed from: c */
    private boolean f35412c;

    /* renamed from: d */
    private AbstractC10978b f35413d;

    public AbstractC10984g(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
        this.f35410a.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: m.framework.ui.widget.pulltorefresh.g.1

            /* renamed from: b */
            private int f35415b;

            /* renamed from: c */
            private int f35416c;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                this.f35415b = i;
                this.f35416c = i2;
                AbstractC10984g.this.m2393a(AbstractC10984g.this.f35410a, i, i2, i3);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                AbstractC10984g.this.f35412c = i == 2;
                if (i == 0) {
                    if (AbstractC10984g.this.f35413d != null) {
                        AbstractC10984g.this.f35413d.m2415a(this.f35415b, this.f35416c);
                    } else if (AbstractC10984g.this.f35411b == null) {
                    } else {
                        AbstractC10984g.this.f35411b.m2437b();
                    }
                }
            }
        });
        this.f35410a.setAdapter(this.f35411b);
    }

    /* renamed from: a */
    public abstract View m2397a(int i, int i2, View view, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract View m2396a(int i, View view, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract Object m2398a(int i, int i2);

    /* renamed from: a */
    public void m2393a(AbstractC10989i abstractC10989i, int i, int i2, int i3) {
    }

    /* renamed from: b */
    public abstract String m2392b(int i);

    /* renamed from: c */
    public abstract int m2390c(int i);

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10980d
    /* renamed from: c */
    public void mo2375c() {
        super.mo2375c();
        this.f35411b.m2437b();
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10980d
    /* renamed from: e */
    public AbstractC10989i mo2373e() {
        return this.f35410a;
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10980d
    /* renamed from: f */
    public boolean mo2372f() {
        return this.f35410a.m2421a();
    }

    /* renamed from: i */
    public abstract int m2388i();

    /* renamed from: j */
    public GroupListView m2387j() {
        return this.f35410a;
    }

    /* renamed from: k */
    public boolean m2386k() {
        return this.f35412c;
    }
}
