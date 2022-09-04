package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.RelativeLayout;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.framework.AbstractC4262h;
import com.google.android.gms.cast.framework.internal.featurehighlight.AbstractC4275b;
import com.google.android.gms.cast.framework.internal.featurehighlight.C4267a;
/* loaded from: classes2.dex */
public class afj extends RelativeLayout implements AbstractC4262h {

    /* renamed from: a */
    private final boolean f21444a;

    /* renamed from: b */
    private Activity f21445b;

    /* renamed from: c */
    private AbstractC4262h.AbstractC4264b f21446c;

    /* renamed from: d */
    private View f21447d;

    /* renamed from: e */
    private C4267a f21448e;

    /* renamed from: f */
    private String f21449f;

    /* renamed from: g */
    private boolean f21450g;

    /* renamed from: h */
    private int f21451h;

    @TargetApi(15)
    public afj(AbstractC4262h.C4263a c4263a) {
        super(c4263a.m24811b());
        this.f21445b = c4263a.m24811b();
        this.f21444a = c4263a.m24803f();
        this.f21446c = c4263a.m24806d();
        this.f21447d = c4263a.m24808c();
        this.f21449f = c4263a.m24802g();
        this.f21451h = c4263a.m24804e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m17788a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m17785c() {
        removeAllViews();
        this.f21445b = null;
        this.f21446c = null;
        this.f21447d = null;
        this.f21448e = null;
        this.f21449f = null;
        this.f21451h = 0;
        this.f21450g = false;
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4262h
    /* renamed from: a */
    public void mo17779a() {
        if (this.f21445b == null || this.f21447d == null || this.f21450g || m17788a(this.f21445b)) {
            return;
        }
        if (this.f21444a && AbstractC4262h.C4265c.m24796b(this.f21445b)) {
            m17785c();
            return;
        }
        this.f21448e = new C4267a(this.f21445b);
        if (this.f21451h != 0) {
            this.f21448e.m24791a(this.f21451h);
        }
        addView(this.f21448e);
        AbstractC4275b abstractC4275b = (AbstractC4275b) this.f21445b.getLayoutInflater().inflate(C3424R.layout.cast_help_text, (ViewGroup) this.f21448e, false);
        abstractC4275b.setText(this.f21449f, null);
        this.f21448e.m24785a(abstractC4275b);
        this.f21448e.m24789a(this.f21447d, null, true, new C4267a.AbstractC4274a() { // from class: com.google.android.gms.internal.afj.1
            @Override // com.google.android.gms.cast.framework.internal.featurehighlight.C4267a.AbstractC4274a
            /* renamed from: a */
            public void mo17781a() {
                if (!afj.this.f21450g) {
                    return;
                }
                AbstractC4262h.C4265c.m24797a(afj.this.f21445b);
                afj.this.f21448e.m24777c(new Runnable() { // from class: com.google.android.gms.internal.afj.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (afj.this.f21450g) {
                            ((ViewGroup) afj.this.f21445b.getWindow().getDecorView()).removeView(afj.this);
                            if (afj.this.f21446c != null) {
                                afj.this.f21446c.m24798a();
                            }
                            afj.this.m17785c();
                        }
                    }
                });
            }

            @Override // com.google.android.gms.cast.framework.internal.featurehighlight.C4267a.AbstractC4274a
            /* renamed from: b */
            public void mo17780b() {
                if (!afj.this.f21450g) {
                    return;
                }
                AbstractC4262h.C4265c.m24797a(afj.this.f21445b);
                afj.this.f21448e.m24780b(new Runnable() { // from class: com.google.android.gms.internal.afj.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (afj.this.f21450g) {
                            ((ViewGroup) afj.this.f21445b.getWindow().getDecorView()).removeView(afj.this);
                            if (afj.this.f21446c != null) {
                                afj.this.f21446c.m24798a();
                            }
                            afj.this.m17785c();
                        }
                    }
                });
            }
        });
        this.f21450g = true;
        ((ViewGroup) this.f21445b.getWindow().getDecorView()).addView(this);
        this.f21448e.m24784a((Runnable) null);
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4262h
    /* renamed from: b */
    public void mo17776b() {
        if (this.f21450g) {
            ((ViewGroup) this.f21445b.getWindow().getDecorView()).removeView(this);
            m17785c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        m17785c();
        super.onDetachedFromWindow();
    }
}
