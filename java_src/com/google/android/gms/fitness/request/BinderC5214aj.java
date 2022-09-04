package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.fitness.data.AbstractC5167y;
import com.google.android.gms.fitness.data.DataPoint;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.fitness.request.aj */
/* loaded from: classes2.dex */
public class BinderC5214aj extends AbstractC5167y.AbstractBinderC5168a {

    /* renamed from: a */
    private final AbstractC5221b f19054a;

    /* renamed from: com.google.android.gms.fitness.request.aj$a */
    /* loaded from: classes2.dex */
    public static class C5216a {

        /* renamed from: a */
        private static final C5216a f19055a = new C5216a();

        /* renamed from: b */
        private final Map<AbstractC5221b, BinderC5214aj> f19056b = new HashMap();

        private C5216a() {
        }

        /* renamed from: a */
        public static C5216a m21080a() {
            return f19055a;
        }

        /* renamed from: a */
        public BinderC5214aj m21079a(AbstractC5221b abstractC5221b) {
            BinderC5214aj binderC5214aj;
            synchronized (this.f19056b) {
                binderC5214aj = this.f19056b.get(abstractC5221b);
                if (binderC5214aj == null) {
                    binderC5214aj = new BinderC5214aj(abstractC5221b);
                    this.f19056b.put(abstractC5221b, binderC5214aj);
                }
            }
            return binderC5214aj;
        }

        /* renamed from: b */
        public BinderC5214aj m21078b(AbstractC5221b abstractC5221b) {
            BinderC5214aj binderC5214aj;
            synchronized (this.f19056b) {
                binderC5214aj = this.f19056b.get(abstractC5221b);
            }
            return binderC5214aj;
        }

        /* renamed from: c */
        public BinderC5214aj m21077c(AbstractC5221b abstractC5221b) {
            BinderC5214aj remove;
            synchronized (this.f19056b) {
                remove = this.f19056b.remove(abstractC5221b);
                if (remove == null) {
                    remove = new BinderC5214aj(abstractC5221b);
                }
            }
            return remove;
        }
    }

    private BinderC5214aj(AbstractC5221b abstractC5221b) {
        this.f19054a = (AbstractC5221b) C4588d.m23627a(abstractC5221b);
    }

    @Override // com.google.android.gms.fitness.data.AbstractC5167y
    /* renamed from: a */
    public void mo21081a(DataPoint dataPoint) {
        this.f19054a.m21064a(dataPoint);
    }
}
