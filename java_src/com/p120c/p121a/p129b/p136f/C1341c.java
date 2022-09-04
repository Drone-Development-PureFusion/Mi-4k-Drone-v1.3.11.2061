package com.p120c.p121a.p129b.p136f;

import android.widget.AbsListView;
import com.p120c.p121a.p129b.C1321d;
/* renamed from: com.c.a.b.f.c */
/* loaded from: classes.dex */
public class C1341c implements AbsListView.OnScrollListener {

    /* renamed from: a */
    private C1321d f3463a;

    /* renamed from: b */
    private final boolean f3464b;

    /* renamed from: c */
    private final boolean f3465c;

    /* renamed from: d */
    private final AbsListView.OnScrollListener f3466d;

    public C1341c(C1321d c1321d, boolean z, boolean z2) {
        this(c1321d, z, z2, null);
    }

    public C1341c(C1321d c1321d, boolean z, boolean z2, AbsListView.OnScrollListener onScrollListener) {
        this.f3463a = c1321d;
        this.f3464b = z;
        this.f3465c = z2;
        this.f3466d = onScrollListener;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.f3466d != null) {
            this.f3466d.onScroll(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        switch (i) {
            case 0:
                this.f3463a.m35757j();
                break;
            case 1:
                if (this.f3464b) {
                    this.f3463a.m35758i();
                    break;
                }
                break;
            case 2:
                if (this.f3465c) {
                    this.f3463a.m35758i();
                    break;
                }
                break;
        }
        if (this.f3466d != null) {
            this.f3466d.onScrollStateChanged(absListView, i);
        }
    }
}
