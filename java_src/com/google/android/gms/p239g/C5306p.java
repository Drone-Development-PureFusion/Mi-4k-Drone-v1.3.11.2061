package com.google.android.gms.p239g;

import android.support.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;
/* renamed from: com.google.android.gms.g.p */
/* loaded from: classes2.dex */
class C5306p<TResult> {

    /* renamed from: a */
    private final Object f19193a = new Object();

    /* renamed from: b */
    private Queue<AbstractC5305o<TResult>> f19194b;

    /* renamed from: c */
    private boolean f19195c;

    /* renamed from: a */
    public void m20804a(@NonNull AbstractC5285f<TResult> abstractC5285f) {
        AbstractC5305o<TResult> poll;
        synchronized (this.f19193a) {
            if (this.f19194b == null || this.f19195c) {
                return;
            }
            this.f19195c = true;
            while (true) {
                synchronized (this.f19193a) {
                    poll = this.f19194b.poll();
                    if (poll == null) {
                        this.f19195c = false;
                        return;
                    }
                }
                poll.mo20805a(abstractC5285f);
            }
        }
    }

    /* renamed from: a */
    public void m20803a(@NonNull AbstractC5305o<TResult> abstractC5305o) {
        synchronized (this.f19193a) {
            if (this.f19194b == null) {
                this.f19194b = new ArrayDeque();
            }
            this.f19194b.add(abstractC5305o);
        }
    }
}
