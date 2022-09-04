package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
/* renamed from: com.google.android.gms.internal.fk */
/* loaded from: classes2.dex */
public abstract class AbstractC6962fk {

    /* renamed from: a */
    private static final ThreadLocal<AbstractC6962fk> f23638a = new ThreadLocal<AbstractC6962fk>() { // from class: com.google.android.gms.internal.fk.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public AbstractC6962fk initialValue() {
            if (Build.VERSION.SDK_INT >= 16) {
                return new C6968c();
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                return new C6967b(myLooper);
            }
            throw new IllegalStateException("The current thread must have a looper!");
        }
    };

    /* renamed from: com.google.android.gms.internal.fk$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6964a {

        /* renamed from: a */
        private Runnable f23639a;

        /* renamed from: b */
        private Choreographer.FrameCallback f23640b;

        @TargetApi(16)
        /* renamed from: a */
        Choreographer.FrameCallback m15864a() {
            if (this.f23640b == null) {
                this.f23640b = new Choreographer.FrameCallback() { // from class: com.google.android.gms.internal.fk.a.1
                    @Override // android.view.Choreographer.FrameCallback
                    public void doFrame(long j) {
                        AbstractC6964a.this.mo15863a(j);
                    }
                };
            }
            return this.f23640b;
        }

        /* renamed from: a */
        public abstract void mo15863a(long j);

        /* renamed from: b */
        Runnable m15862b() {
            if (this.f23639a == null) {
                this.f23639a = new Runnable() { // from class: com.google.android.gms.internal.fk.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC6964a.this.mo15863a(System.nanoTime());
                    }
                };
            }
            return this.f23639a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.fk$b */
    /* loaded from: classes2.dex */
    public static class C6967b extends AbstractC6962fk {

        /* renamed from: a */
        private Handler f23643a;

        public C6967b(Looper looper) {
            this.f23643a = new Handler(looper);
        }

        @Override // com.google.android.gms.internal.AbstractC6962fk
        /* renamed from: a */
        public void mo15861a(AbstractC6964a abstractC6964a) {
            this.f23643a.postDelayed(abstractC6964a.m15862b(), 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(16)
    /* renamed from: com.google.android.gms.internal.fk$c */
    /* loaded from: classes2.dex */
    public static class C6968c extends AbstractC6962fk {

        /* renamed from: a */
        private Choreographer f23644a = Choreographer.getInstance();

        @Override // com.google.android.gms.internal.AbstractC6962fk
        /* renamed from: a */
        public void mo15861a(AbstractC6964a abstractC6964a) {
            this.f23644a.postFrameCallback(abstractC6964a.m15864a());
        }
    }

    /* renamed from: a */
    public static AbstractC6962fk m15866a() {
        return f23638a.get();
    }

    /* renamed from: a */
    public abstract void mo15861a(AbstractC6964a abstractC6964a);
}
