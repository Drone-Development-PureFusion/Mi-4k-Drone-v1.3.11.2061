package com.google.android.gms.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p001v4.util.SimpleArrayMap;
/* renamed from: com.google.android.gms.internal.fi */
/* loaded from: classes2.dex */
public class C6959fi extends AnimatorListenerAdapter {

    /* renamed from: a */
    private SimpleArrayMap<Animator, Boolean> f23632a = new SimpleArrayMap<>();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m15870a(Animator animator) {
        return this.f23632a.containsKey(animator) && this.f23632a.get(animator).booleanValue();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f23632a.put(animator, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f23632a.put(animator, false);
    }
}
