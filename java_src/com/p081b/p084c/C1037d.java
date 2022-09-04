package com.p081b.p084c;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.p081b.p082a.AbstractC0971a;
import java.lang.ref.WeakReference;
/* renamed from: com.b.c.d */
/* loaded from: classes.dex */
class C1037d extends AbstractC1031b {

    /* renamed from: a */
    private static final long f2383a = -1;

    /* renamed from: b */
    private final WeakReference<ViewPropertyAnimator> f2384b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1037d(View view) {
        this.f2384b = new WeakReference<>(view.animate());
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public long mo36932a() {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            return viewPropertyAnimator.getDuration();
        }
        return -1L;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36931a(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.x(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36927a(long j) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setDuration(j);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36926a(Interpolator interpolator) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setInterpolator(interpolator);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: a */
    public AbstractC1031b mo36925a(final AbstractC0971a.AbstractC0972a abstractC0972a) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            if (abstractC0972a == null) {
                viewPropertyAnimator.setListener(null);
            } else {
                viewPropertyAnimator.setListener(new Animator.AnimatorListener() { // from class: com.b.c.d.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        abstractC0972a.mo36890c(null);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        abstractC0972a.mo36891b(null);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        abstractC0972a.mo36889d(null);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        abstractC0972a.mo36892a(null);
                    }
                });
            }
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: b */
    public long mo36921b() {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            return viewPropertyAnimator.getStartDelay();
        }
        return -1L;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: b */
    public AbstractC1031b mo36920b(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.xBy(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: b */
    public AbstractC1031b mo36918b(long j) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setStartDelay(j);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: c */
    public AbstractC1031b mo36915c(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.y(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: c */
    public void mo36916c() {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.start();
        }
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: d */
    public AbstractC1031b mo36911d(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.yBy(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: d */
    public void mo36912d() {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: e */
    public AbstractC1031b mo36908e(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotation(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: f */
    public AbstractC1031b mo36907f(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationBy(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: g */
    public AbstractC1031b mo36906g(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationX(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: h */
    public AbstractC1031b mo36905h(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationXBy(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: i */
    public AbstractC1031b mo36904i(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationY(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: j */
    public AbstractC1031b mo36903j(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationYBy(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: k */
    public AbstractC1031b mo36902k(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationX(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: l */
    public AbstractC1031b mo36901l(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationXBy(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: m */
    public AbstractC1031b mo36900m(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationY(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: n */
    public AbstractC1031b mo36899n(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationYBy(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: o */
    public AbstractC1031b mo36898o(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleX(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: p */
    public AbstractC1031b mo36897p(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleXBy(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: q */
    public AbstractC1031b mo36896q(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleY(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: r */
    public AbstractC1031b mo36895r(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleYBy(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: s */
    public AbstractC1031b mo36894s(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alpha(f);
        }
        return this;
    }

    @Override // com.p081b.p084c.AbstractC1031b
    /* renamed from: t */
    public AbstractC1031b mo36893t(float f) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2384b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alphaBy(f);
        }
        return this;
    }
}
