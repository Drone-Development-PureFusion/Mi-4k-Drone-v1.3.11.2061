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
import com.google.android.gms.internal.alf;
/* loaded from: classes2.dex */
public class akr extends akn<alf> {

    /* renamed from: a */
    public static final C4467a.C4478g<akr> f22141a = new C4467a.C4478g<>();

    /* renamed from: e */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f22142e = new C4467a<>("Fitness.API", new C6460b(), f22141a);

    /* renamed from: com.google.android.gms.internal.akr$a */
    /* loaded from: classes2.dex */
    static abstract class AbstractC6459a<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, akr> {
        public AbstractC6459a(AbstractC4489g abstractC4489g) {
            super(akr.f22142e, abstractC4489g);
        }
    }

    /* renamed from: com.google.android.gms.internal.akr$b */
    /* loaded from: classes2.dex */
    public static class C6460b extends C4467a.AbstractC4473b<akr, C4467a.AbstractC4468a.C4470b> {
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public akr mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new akr(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    }

    /* renamed from: com.google.android.gms.internal.akr$c */
    /* loaded from: classes2.dex */
    static abstract class AbstractC6461c extends AbstractC6459a<Status> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC6461c(AbstractC4489g abstractC4489g) {
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

    public akr(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 57, abstractC4491b, abstractC4492c, c4626s);
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public alf mo7440b(IBinder iBinder) {
        return alf.AbstractBinderC6491a.m16973a(iBinder);
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public String mo7443a() {
        return "com.google.android.gms.fitness.HistoryApi";
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    public String mo7441b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
    }
}
