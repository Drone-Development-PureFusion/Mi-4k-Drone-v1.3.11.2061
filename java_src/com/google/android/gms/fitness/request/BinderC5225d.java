package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.AbstractC5209ag;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.fitness.request.d */
/* loaded from: classes2.dex */
public class BinderC5225d extends AbstractC5209ag.AbstractBinderC5210a {

    /* renamed from: a */
    private final AbstractC5202a f19076a;

    /* renamed from: com.google.android.gms.fitness.request.d$a */
    /* loaded from: classes2.dex */
    public static class C5227a {

        /* renamed from: a */
        private static final C5227a f19077a = new C5227a();

        /* renamed from: b */
        private final Map<AbstractC5202a, BinderC5225d> f19078b = new HashMap();

        private C5227a() {
        }

        /* renamed from: a */
        public static C5227a m21036a() {
            return f19077a;
        }

        /* renamed from: a */
        public BinderC5225d m21035a(AbstractC5202a abstractC5202a) {
            BinderC5225d binderC5225d;
            synchronized (this.f19078b) {
                binderC5225d = this.f19078b.get(abstractC5202a);
                if (binderC5225d == null) {
                    binderC5225d = new BinderC5225d(abstractC5202a);
                    this.f19078b.put(abstractC5202a, binderC5225d);
                }
            }
            return binderC5225d;
        }

        /* renamed from: b */
        public BinderC5225d m21034b(AbstractC5202a abstractC5202a) {
            BinderC5225d binderC5225d;
            synchronized (this.f19078b) {
                binderC5225d = this.f19078b.get(abstractC5202a);
                if (binderC5225d == null) {
                    binderC5225d = new BinderC5225d(abstractC5202a);
                }
            }
            return binderC5225d;
        }
    }

    private BinderC5225d(AbstractC5202a abstractC5202a) {
        this.f19076a = (AbstractC5202a) C4588d.m23627a(abstractC5202a);
    }

    @Override // com.google.android.gms.fitness.request.AbstractC5209ag
    /* renamed from: a */
    public void mo21038a() {
        this.f19076a.m21108a();
    }

    @Override // com.google.android.gms.fitness.request.AbstractC5209ag
    /* renamed from: a */
    public void mo21037a(BleDevice bleDevice) {
        this.f19076a.m21107a(bleDevice);
    }
}
