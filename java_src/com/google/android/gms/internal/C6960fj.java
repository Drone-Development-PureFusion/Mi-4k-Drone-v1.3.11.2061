package com.google.android.gms.internal;

import android.animation.Animator;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.AbstractC6962fk;
/* renamed from: com.google.android.gms.internal.fj */
/* loaded from: classes2.dex */
public class C6960fj extends C6959fi {

    /* renamed from: a */
    protected final Animator f23633a;

    /* renamed from: c */
    private final Runnable f23635c;

    /* renamed from: d */
    private AbstractC6962fk.AbstractC6964a f23636d = new AbstractC6962fk.AbstractC6964a() { // from class: com.google.android.gms.internal.fj.1
        @Override // com.google.android.gms.internal.AbstractC6962fk.AbstractC6964a
        /* renamed from: a */
        public void mo15863a(long j) {
            if (C6960fj.this.a(C6960fj.this.f23633a) || C6960fj.this.f23633a.isStarted()) {
                return;
            }
            if (C6960fj.this.f23635c != null) {
                C6960fj.this.f23635c.run();
            }
            C6960fj.this.f23633a.start();
        }
    };

    /* renamed from: b */
    private final AbstractC6962fk f23634b = AbstractC6962fk.m15866a();

    private C6960fj(Animator animator, @Nullable Runnable runnable) {
        this.f23633a = animator;
        this.f23635c = runnable;
    }

    /* renamed from: a */
    public static C6960fj m15869a(Animator animator, @Nullable Runnable runnable) {
        C6960fj c6960fj = new C6960fj(animator, runnable);
        animator.addListener(c6960fj);
        return c6960fj;
    }

    /* renamed from: b */
    public static C6960fj m15867b(Animator animator) {
        return m15869a(animator, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!a(animator)) {
            this.f23634b.mo15861a(this.f23636d);
        }
    }
}
