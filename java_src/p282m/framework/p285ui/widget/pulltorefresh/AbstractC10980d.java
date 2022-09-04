package p282m.framework.p285ui.widget.pulltorefresh;

import android.content.Context;
import android.view.View;
/* renamed from: m.framework.ui.widget.pulltorefresh.d */
/* loaded from: classes2.dex */
public abstract class AbstractC10980d {

    /* renamed from: a */
    private Context f35401a;

    /* renamed from: b */
    private PullToRefreshView f35402b;

    public AbstractC10980d(PullToRefreshView pullToRefreshView) {
        this.f35401a = pullToRefreshView.getContext();
        this.f35402b = pullToRefreshView;
    }

    /* renamed from: a */
    public Context m2413a() {
        return this.f35401a;
    }

    /* renamed from: a */
    public abstract void m2412a(int i);

    /* renamed from: b */
    protected PullToRefreshView m2411b() {
        return this.f35402b;
    }

    /* renamed from: c */
    public void mo2375c() {
        this.f35402b.m2436a();
    }

    /* renamed from: d */
    public abstract View m2410d();

    /* renamed from: e */
    public abstract AbstractC10989i mo2373e();

    /* renamed from: f */
    public abstract boolean mo2372f();

    /* renamed from: g */
    public abstract void m2409g();

    /* renamed from: h */
    public void m2408h() {
    }
}
