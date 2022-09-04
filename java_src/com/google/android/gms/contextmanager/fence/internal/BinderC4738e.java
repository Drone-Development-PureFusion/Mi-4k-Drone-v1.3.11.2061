package com.google.android.gms.contextmanager.fence.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.awareness.fence.AbstractC4104i;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.contextmanager.fence.internal.AbstractC4748m;
import com.google.android.gms.contextmanager.internal.C4764d;
import com.google.android.gms.internal.C7716sx;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.e */
/* loaded from: classes2.dex */
public class BinderC4738e extends AbstractC4748m.AbstractBinderC4749a {

    /* renamed from: a */
    public static final C7716sx.AbstractC7717a<AbstractC4104i, BinderC4738e> f17397a = new C7716sx.AbstractC7717a<AbstractC4104i, BinderC4738e>() { // from class: com.google.android.gms.contextmanager.fence.internal.e.1
        @Override // com.google.android.gms.internal.C7716sx.AbstractC7717a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public BinderC4738e mo13660a(AbstractC4104i abstractC4104i, Looper looper) {
            return new BinderC4738e(abstractC4104i, looper);
        }
    };

    /* renamed from: b */
    private final AbstractC4104i f17398b;

    /* renamed from: c */
    private final Handler f17399c;

    /* renamed from: com.google.android.gms.contextmanager.fence.internal.e$a */
    /* loaded from: classes2.dex */
    private static class RunnableC4740a implements Runnable {

        /* renamed from: a */
        private final AbstractC4104i f17400a;

        /* renamed from: b */
        private final FenceTriggerInfoImpl f17401b;

        public RunnableC4740a(AbstractC4104i abstractC4104i, FenceTriggerInfoImpl fenceTriggerInfoImpl) {
            this.f17400a = (AbstractC4104i) C4588d.m23627a(abstractC4104i);
            this.f17401b = (FenceTriggerInfoImpl) C4588d.m23627a(fenceTriggerInfoImpl);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17400a.m25469a(this.f17401b.m22957c(), this.f17401b.m22958b());
        }
    }

    private BinderC4738e(AbstractC4104i abstractC4104i, Looper looper) {
        this.f17398b = (AbstractC4104i) C4588d.m23627a(abstractC4104i);
        this.f17399c = C4764d.m22812a((Looper) C4588d.m23627a(looper));
    }

    @Override // com.google.android.gms.contextmanager.fence.internal.AbstractC4748m
    /* renamed from: a */
    public void mo22900a(FenceTriggerInfoImpl fenceTriggerInfoImpl) {
        this.f17399c.post(new RunnableC4740a(this.f17398b, fenceTriggerInfoImpl));
    }
}
