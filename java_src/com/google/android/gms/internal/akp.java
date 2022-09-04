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
import com.google.android.gms.internal.ald;
/* loaded from: classes2.dex */
public class akp extends akn<ald> {

    /* renamed from: a */
    public static final C4467a.C4478g<akp> f22137a = new C4467a.C4478g<>();

    /* renamed from: e */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f22138e = new C4467a<>("Fitness.CONFIG_API", new C6456b(), f22137a);

    /* renamed from: com.google.android.gms.internal.akp$a */
    /* loaded from: classes2.dex */
    static abstract class AbstractC6455a<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, akp> {
        public AbstractC6455a(AbstractC4489g abstractC4489g) {
            super(akp.f22138e, abstractC4489g);
        }
    }

    /* renamed from: com.google.android.gms.internal.akp$b */
    /* loaded from: classes2.dex */
    public static class C6456b extends C4467a.AbstractC4473b<akp, C4467a.AbstractC4468a.C4470b> {
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public akp mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new akp(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    }

    /* renamed from: com.google.android.gms.internal.akp$c */
    /* loaded from: classes2.dex */
    static abstract class AbstractC6457c extends AbstractC6455a<Status> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC6457c(AbstractC4489g abstractC4489g) {
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

    public akp(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 60, abstractC4491b, abstractC4492c, c4626s);
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public ald mo7440b(IBinder iBinder) {
        return ald.AbstractBinderC6487a.m16979a(iBinder);
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public String mo7443a() {
        return "com.google.android.gms.fitness.ConfigApi";
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    public String mo7441b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitConfigApi";
    }
}
