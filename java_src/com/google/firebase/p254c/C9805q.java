package com.google.firebase.p254c;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7431na;
import com.google.android.gms.internal.C7438nf;
import com.google.firebase.p254c.AbstractC9785j;
import com.google.firebase.p254c.AbstractC9785j.AbstractC9791a;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
/* renamed from: com.google.firebase.c.q */
/* loaded from: classes2.dex */
class C9805q<TListenerType, TResult extends AbstractC9785j.AbstractC9791a> {

    /* renamed from: a */
    private final Queue<TListenerType> f30610a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private final HashMap<TListenerType, C7438nf> f30611b = new HashMap<>();

    /* renamed from: c */
    private AbstractC9785j<TResult> f30612c;

    /* renamed from: d */
    private int f30613d;

    /* renamed from: e */
    private AbstractC9808a<TListenerType, TResult> f30614e;

    /* renamed from: com.google.firebase.c.q$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9808a<TListenerType, TResult> {
        /* renamed from: a */
        void mo6920a(@NonNull TListenerType tlistenertype, @NonNull TResult tresult);
    }

    public C9805q(@NonNull AbstractC9785j<TResult> abstractC9785j, int i, @NonNull AbstractC9808a<TListenerType, TResult> abstractC9808a) {
        this.f30612c = abstractC9785j;
        this.f30613d = i;
        this.f30614e = abstractC9808a;
    }

    /* renamed from: a */
    public void m6924a() {
        if ((this.f30612c.m6984v() & this.f30613d) != 0) {
            final TResult m6982x = this.f30612c.m6982x();
            for (final TListenerType tlistenertype : this.f30610a) {
                C7438nf c7438nf = this.f30611b.get(tlistenertype);
                if (c7438nf != null) {
                    c7438nf.m14486a(new Runnable() { // from class: com.google.firebase.c.q.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            C9805q.this.f30614e.mo6920a(tlistenertype, m6982x);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public void m6923a(@Nullable Activity activity, @Nullable Executor executor, @NonNull final TListenerType tlistenertype) {
        boolean z;
        boolean z2 = true;
        C4588d.m23627a(tlistenertype);
        synchronized (this.f30612c.m6983w()) {
            z = (this.f30612c.m6984v() & this.f30613d) != 0;
            this.f30610a.add(tlistenertype);
            this.f30611b.put(tlistenertype, new C7438nf(executor));
            if (activity != null) {
                if (Build.VERSION.SDK_INT >= 17) {
                    if (activity.isDestroyed()) {
                        z2 = false;
                    }
                    C4588d.m23618b(z2, "Activity is already destroyed!");
                }
                C7431na.m14505a().m14504a(activity, tlistenertype, new Runnable() { // from class: com.google.firebase.c.q.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public void run() {
                        C9805q.this.m6921a((C9805q) tlistenertype);
                    }
                });
            }
        }
        if (z) {
            this.f30614e.mo6920a(tlistenertype, this.f30612c.m6982x());
        }
    }

    /* renamed from: a */
    public void m6921a(@NonNull TListenerType tlistenertype) {
        C4588d.m23627a(tlistenertype);
        synchronized (this.f30612c.m6983w()) {
            this.f30611b.remove(tlistenertype);
            this.f30610a.remove(tlistenertype);
            C7431na.m14505a().m14503a(tlistenertype);
        }
    }
}
