package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
@aaa
/* loaded from: classes.dex */
abstract class acw {

    /* renamed from: a */
    private final WeakReference<View> f21165a;

    public acw(View view) {
        this.f21165a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public final void m18194a() {
        ViewTreeObserver m18190c = m18190c();
        if (m18190c != null) {
            mo18193a(m18190c);
        }
    }

    /* renamed from: a */
    protected abstract void mo18193a(ViewTreeObserver viewTreeObserver);

    /* renamed from: b */
    public final void m18192b() {
        ViewTreeObserver m18190c = m18190c();
        if (m18190c != null) {
            mo18191b(m18190c);
        }
    }

    /* renamed from: b */
    protected abstract void mo18191b(ViewTreeObserver viewTreeObserver);

    /* renamed from: c */
    protected ViewTreeObserver m18190c() {
        View view = this.f21165a.get();
        if (view == null) {
            return null;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return viewTreeObserver;
        }
        return null;
    }
}
