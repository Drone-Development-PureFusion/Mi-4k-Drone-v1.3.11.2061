package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
@aaa
/* loaded from: classes.dex */
class acv extends acw implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private final WeakReference<ViewTreeObserver.OnScrollChangedListener> f21164a;

    public acv(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f21164a = new WeakReference<>(onScrollChangedListener);
    }

    @Override // com.google.android.gms.internal.acw
    /* renamed from: a */
    protected void mo18193a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.google.android.gms.internal.acw
    /* renamed from: b */
    protected void mo18191b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f21164a.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            b();
        }
    }
}
