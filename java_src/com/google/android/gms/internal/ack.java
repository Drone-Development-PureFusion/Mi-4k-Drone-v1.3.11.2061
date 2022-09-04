package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.C3779u;
@aaa
/* loaded from: classes.dex */
public final class ack {

    /* renamed from: a */
    private final View f21130a;

    /* renamed from: b */
    private Activity f21131b;

    /* renamed from: c */
    private boolean f21132c;

    /* renamed from: d */
    private boolean f21133d;

    /* renamed from: e */
    private boolean f21134e;

    /* renamed from: f */
    private ViewTreeObserver.OnGlobalLayoutListener f21135f;

    /* renamed from: g */
    private ViewTreeObserver.OnScrollChangedListener f21136g;

    public ack(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f21131b = activity;
        this.f21130a = view;
        this.f21135f = onGlobalLayoutListener;
        this.f21136g = onScrollChangedListener;
    }

    /* renamed from: e */
    private void m18213e() {
        if (!this.f21132c) {
            if (this.f21135f != null) {
                if (this.f21131b != null) {
                    C3779u.m26890e().m18381a(this.f21131b, this.f21135f);
                }
                C3779u.m26897C().m18196a(this.f21130a, this.f21135f);
            }
            if (this.f21136g != null) {
                if (this.f21131b != null) {
                    C3779u.m26890e().m18380a(this.f21131b, this.f21136g);
                }
                C3779u.m26897C().m18195a(this.f21130a, this.f21136g);
            }
            this.f21132c = true;
        }
    }

    /* renamed from: f */
    private void m18212f() {
        if (this.f21131b != null && this.f21132c) {
            if (this.f21135f != null && this.f21131b != null) {
                C3779u.m26888g().mo18289a(this.f21131b, this.f21135f);
            }
            if (this.f21136g != null && this.f21131b != null) {
                C3779u.m26890e().m18337b(this.f21131b, this.f21136g);
            }
            this.f21132c = false;
        }
    }

    /* renamed from: a */
    public void m18218a() {
        this.f21134e = true;
        if (this.f21133d) {
            m18213e();
        }
    }

    /* renamed from: a */
    public void m18217a(Activity activity) {
        this.f21131b = activity;
    }

    /* renamed from: b */
    public void m18216b() {
        this.f21134e = false;
        m18212f();
    }

    /* renamed from: c */
    public void m18215c() {
        this.f21133d = true;
        if (this.f21134e) {
            m18213e();
        }
    }

    /* renamed from: d */
    public void m18214d() {
        this.f21133d = false;
        m18212f();
    }
}
