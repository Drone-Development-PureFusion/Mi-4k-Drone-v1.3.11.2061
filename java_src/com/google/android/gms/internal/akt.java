package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.alh;
/* loaded from: classes2.dex */
public class akt extends akn<alh> {

    /* renamed from: a */
    public static final C4467a.C4478g<akt> f22145a = new C4467a.C4478g<>();

    /* renamed from: e */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f22146e = new C4467a<>("Fitness.RECORDING_API", new C6464b(), f22145a);

    /* renamed from: com.google.android.gms.internal.akt$a */
    /* loaded from: classes2.dex */
    static abstract class AbstractC6463a<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, akt> {
        public AbstractC6463a(AbstractC4489g abstractC4489g) {
            super(akt.f22146e, abstractC4489g);
        }
    }

    /* renamed from: com.google.android.gms.internal.akt$b */
    /* loaded from: classes2.dex */
    public static class C6464b extends C4467a.AbstractC4473b<akt, C4467a.AbstractC4468a.C4470b> {
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public akt mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new akt(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    }

    /* renamed from: com.google.android.gms.internal.akt$c */
    /* loaded from: classes2.dex */
    static abstract class AbstractC6465c extends AbstractC6463a<Status> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC6465c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            C4588d.m23619b(!status.m24018f());
            return status;
        }
    }

    public akt(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 56, abstractC4491b, abstractC4492c, c4626s);
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public alh mo7440b(IBinder iBinder) {
        return alh.AbstractBinderC6495a.m16958a(iBinder);
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public String mo7443a() {
        return "com.google.android.gms.fitness.RecordingApi";
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    public String mo7441b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitRecordingApi";
    }
}
