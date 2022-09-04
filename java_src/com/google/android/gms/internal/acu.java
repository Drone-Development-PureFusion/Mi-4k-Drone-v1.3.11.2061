package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.C3779u;
import java.lang.ref.WeakReference;
@aaa
/* loaded from: classes.dex */
class acu extends acw implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f21163a;

    public acu(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f21163a = new WeakReference<>(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.acw
    /* renamed from: a */
    protected void mo18193a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.gms.internal.acw
    /* renamed from: b */
    protected void mo18191b(ViewTreeObserver viewTreeObserver) {
        C3779u.m26888g().mo18286a(viewTreeObserver, this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f21163a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            b();
        }
    }
}
