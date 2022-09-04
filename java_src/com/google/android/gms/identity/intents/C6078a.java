package com.google.android.gms.identity.intents;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.amn;
/* renamed from: com.google.android.gms.identity.intents.a */
/* loaded from: classes2.dex */
public final class C6078a {

    /* renamed from: a */
    static final C4467a.C4478g<amn> f20569a = new C4467a.C4478g<>();

    /* renamed from: c */
    private static final C4467a.AbstractC4473b<amn, C6081a> f20571c = new C4467a.AbstractC4473b<amn, C6081a>() { // from class: com.google.android.gms.identity.intents.a.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public amn mo7438a(Context context, Looper looper, C4626s c4626s, C6081a c6081a, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            C4588d.m23618b(context instanceof Activity, "An Activity must be used for Address APIs");
            if (c6081a == null) {
                c6081a = new C6081a();
            }
            return new amn((Activity) context, looper, c4626s, c6081a.f20574a, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: b */
    public static final C4467a<C6081a> f20570b = new C4467a<>("Address.API", f20571c, f20569a);

    /* renamed from: com.google.android.gms.identity.intents.a$a */
    /* loaded from: classes2.dex */
    public static final class C6081a implements C4467a.AbstractC4468a.AbstractC4469a {

        /* renamed from: a */
        public final int f20574a;

        public C6081a() {
            this.f20574a = 0;
        }

        public C6081a(int i) {
            this.f20574a = i;
        }
    }

    /* renamed from: com.google.android.gms.identity.intents.a$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6082b extends ahl.AbstractC6343a<Status, amn> {
        public AbstractC6082b(AbstractC4489g abstractC4489g) {
            super(C6078a.f20570b, abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    /* renamed from: a */
    public static void m18804a(AbstractC4489g abstractC4489g, final UserAddressRequest userAddressRequest, final int i) {
        abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6082b(abstractC4489g) { // from class: com.google.android.gms.identity.intents.a.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(amn amnVar) {
                amnVar.m16775a(userAddressRequest, i);
                b((C60802) Status.f16786a);
            }
        });
    }
}
