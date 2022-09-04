package com.google.android.gms.games.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.util.C4696s;
import java.lang.ref.WeakReference;
/* renamed from: com.google.android.gms.games.internal.n */
/* loaded from: classes2.dex */
public class C5919n {

    /* renamed from: a */
    protected C5670d f20066a;

    /* renamed from: b */
    protected C5921a f20067b;

    /* renamed from: com.google.android.gms.games.internal.n$a */
    /* loaded from: classes2.dex */
    public static final class C5921a {

        /* renamed from: a */
        public IBinder f20068a;

        /* renamed from: b */
        public int f20069b;

        /* renamed from: c */
        public int f20070c;

        /* renamed from: d */
        public int f20071d;

        /* renamed from: e */
        public int f20072e;

        /* renamed from: f */
        public int f20073f;

        /* renamed from: g */
        public int f20074g;

        private C5921a(int i, IBinder iBinder) {
            this.f20070c = -1;
            this.f20071d = 0;
            this.f20072e = 0;
            this.f20073f = 0;
            this.f20074g = 0;
            this.f20069b = i;
            this.f20068a = iBinder;
        }

        /* renamed from: a */
        public Bundle m19561a() {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", this.f20069b);
            bundle.putInt("popupLocationInfo.displayId", this.f20070c);
            bundle.putInt("popupLocationInfo.left", this.f20071d);
            bundle.putInt("popupLocationInfo.top", this.f20072e);
            bundle.putInt("popupLocationInfo.right", this.f20073f);
            bundle.putInt("popupLocationInfo.bottom", this.f20074g);
            return bundle;
        }
    }

    @TargetApi(12)
    /* renamed from: com.google.android.gms.games.internal.n$b */
    /* loaded from: classes2.dex */
    private static final class View$OnAttachStateChangeListenerC5922b extends C5919n implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c */
        private WeakReference<View> f20075c;

        /* renamed from: d */
        private boolean f20076d = false;

        protected View$OnAttachStateChangeListenerC5922b(C5670d c5670d, int i) {
            super(c5670d, i);
        }

        @TargetApi(17)
        /* renamed from: b */
        private void m19557b(View view) {
            Display display;
            int i = -1;
            if (C4696s.m23108f() && (display = view.getDisplay()) != null) {
                i = display.getDisplayId();
            }
            IBinder windowToken = view.getWindowToken();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            this.f20067b.f20070c = i;
            this.f20067b.f20068a = windowToken;
            this.f20067b.f20071d = iArr[0];
            this.f20067b.f20072e = iArr[1];
            this.f20067b.f20073f = iArr[0] + width;
            this.f20067b.f20074g = iArr[1] + height;
            if (this.f20076d) {
                mo19560a();
                this.f20076d = false;
            }
        }

        @Override // com.google.android.gms.games.internal.C5919n
        /* renamed from: a */
        public void mo19560a() {
            if (this.f20067b.f20068a != null) {
                super.mo19560a();
            } else {
                this.f20076d = this.f20075c != null;
            }
        }

        @Override // com.google.android.gms.games.internal.C5919n
        /* renamed from: a */
        protected void mo19559a(int i) {
            this.f20067b = new C5921a(i, null);
        }

        @Override // com.google.android.gms.games.internal.C5919n
        @TargetApi(16)
        /* renamed from: a */
        public void mo19558a(View view) {
            this.f20066a.m20207W();
            if (this.f20075c != null) {
                View view2 = this.f20075c.get();
                Context B = this.f20066a.B();
                if (view2 == null && (B instanceof Activity)) {
                    view2 = ((Activity) B).getWindow().getDecorView();
                }
                if (view2 != null) {
                    view2.removeOnAttachStateChangeListener(this);
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    if (C4696s.m23109e()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
            }
            this.f20075c = null;
            Context B2 = this.f20066a.B();
            if (view == null && (B2 instanceof Activity)) {
                View findViewById = ((Activity) B2).findViewById(16908290);
                if (findViewById == null) {
                    findViewById = ((Activity) B2).getWindow().getDecorView();
                }
                C5906h.m19940a("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
                view = findViewById;
            }
            if (view == null) {
                C5906h.m19938b("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
                return;
            }
            m19557b(view);
            this.f20075c = new WeakReference<>(view);
            view.addOnAttachStateChangeListener(this);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view;
            if (this.f20075c == null || (view = this.f20075c.get()) == null) {
                return;
            }
            m19557b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m19557b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f20066a.m20207W();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private C5919n(C5670d c5670d, int i) {
        this.f20066a = c5670d;
        mo19559a(i);
    }

    /* renamed from: a */
    public static C5919n m19566a(C5670d c5670d, int i) {
        return C4696s.m23112b() ? new View$OnAttachStateChangeListenerC5922b(c5670d, i) : new C5919n(c5670d, i);
    }

    /* renamed from: a */
    public void mo19560a() {
        this.f20066a.m20200a(this.f20067b.f20068a, this.f20067b.m19561a());
    }

    /* renamed from: a */
    protected void mo19559a(int i) {
        this.f20067b = new C5921a(i, new Binder());
    }

    /* renamed from: a */
    public void mo19558a(View view) {
    }

    /* renamed from: b */
    public Bundle m19565b() {
        return this.f20067b.m19561a();
    }

    /* renamed from: b */
    public void m19564b(int i) {
        this.f20067b.f20069b = i;
    }

    /* renamed from: c */
    public IBinder m19563c() {
        return this.f20067b.f20068a;
    }

    /* renamed from: d */
    public C5921a m19562d() {
        return this.f20067b;
    }
}
