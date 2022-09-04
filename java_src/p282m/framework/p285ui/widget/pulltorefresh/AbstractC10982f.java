package p282m.framework.p285ui.widget.pulltorefresh;

import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ListAdapter;
/* renamed from: m.framework.ui.widget.pulltorefresh.f */
/* loaded from: classes2.dex */
public abstract class AbstractC10982f extends AbstractC10981e {

    /* renamed from: a */
    private ScrollableGridView f35403a = new ScrollableGridView(a());

    /* renamed from: b */
    private C10977a f35404b = new C10977a(this);

    /* renamed from: c */
    private boolean f35405c;

    /* renamed from: d */
    private AbstractC10978b f35406d;

    public AbstractC10982f(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
        this.f35403a.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: m.framework.ui.widget.pulltorefresh.f.1

            /* renamed from: b */
            private int f35408b;

            /* renamed from: c */
            private int f35409c;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                this.f35408b = i;
                this.f35409c = i2;
                AbstractC10982f.this.mo2377a(AbstractC10982f.this.f35403a, i, i2, i3);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                AbstractC10982f.this.f35405c = i == 2;
                if (i == 0) {
                    if (AbstractC10982f.this.f35406d != null) {
                        AbstractC10982f.this.f35406d.m2415a(this.f35408b, this.f35409c);
                    } else if (AbstractC10982f.this.f35404b == null) {
                    } else {
                        AbstractC10982f.this.f35404b.notifyDataSetChanged();
                    }
                }
            }
        });
        this.f35403a.setAdapter((ListAdapter) this.f35404b);
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10981e
    /* renamed from: a */
    public void mo2377a(AbstractC10989i abstractC10989i, int i, int i2, int i3) {
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10980d
    /* renamed from: c */
    public void mo2375c() {
        super.c();
        this.f35404b.notifyDataSetChanged();
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10980d
    /* renamed from: e */
    public AbstractC10989i mo2373e() {
        return this.f35403a;
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10980d
    /* renamed from: f */
    public boolean mo2372f() {
        return this.f35403a.m2424a();
    }

    @Override // p282m.framework.p285ui.widget.pulltorefresh.AbstractC10981e
    /* renamed from: j */
    public boolean mo2371j() {
        return this.f35405c;
    }

    /* renamed from: k */
    public GridView m2399k() {
        return this.f35403a;
    }
}
