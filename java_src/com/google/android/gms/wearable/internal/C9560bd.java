package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.AbstractC9453c;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.internal.C9483ab;
/* renamed from: com.google.android.gms.wearable.internal.bd */
/* loaded from: classes2.dex */
public final class C9560bd implements AbstractC9453c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.bd$a */
    /* loaded from: classes2.dex */
    public static final class C9563a implements AbstractC9453c.AbstractC9456c {

        /* renamed from: a */
        private final Status f30095a;

        /* renamed from: b */
        private final Channel f30096b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C9563a(Status status, Channel channel) {
            this.f30095a = (Status) C4588d.m23627a(status);
            this.f30096b = channel;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f30095a;
        }

        @Override // com.google.android.gms.wearable.AbstractC9453c.AbstractC9456c
        /* renamed from: b */
        public Channel mo7867b() {
            return this.f30096b;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.bd$b */
    /* loaded from: classes2.dex */
    static final class C9564b extends AbstractC9546ba<Status> {

        /* renamed from: a */
        private final String f30097a;

        /* renamed from: b */
        private AbstractC9453c.AbstractC9454a f30098b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C9564b(AbstractC4489g abstractC4489g, AbstractC9453c.AbstractC9454a abstractC9454a, String str) {
            super(abstractC4489g);
            this.f30098b = (AbstractC9453c.AbstractC9454a) C4588d.m23627a(abstractC9454a);
            this.f30097a = str;
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            this.f30098b = null;
            return status;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C9527ar c9527ar) {
            c9527ar.m7967a(this, this.f30098b, this.f30097a);
            this.f30098b = null;
        }
    }

    /* renamed from: a */
    private static C9483ab.AbstractC9484a<AbstractC9453c.AbstractC9454a> m7872a(final IntentFilter[] intentFilterArr) {
        return new C9483ab.AbstractC9484a<AbstractC9453c.AbstractC9454a>() { // from class: com.google.android.gms.wearable.internal.bd.2
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void m7868a(C9527ar c9527ar, ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9453c.AbstractC9454a abstractC9454a, ail<AbstractC9453c.AbstractC9454a> ailVar) {
                c9527ar.m7968a(abstractC6344b, abstractC9454a, ailVar, (String) null, intentFilterArr);
            }

            @Override // com.google.android.gms.wearable.internal.C9483ab.AbstractC9484a
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo7811a(C9527ar c9527ar, ahl.AbstractC6344b abstractC6344b, AbstractC9453c.AbstractC9454a abstractC9454a, ail<AbstractC9453c.AbstractC9454a> ailVar) {
                m7868a(c9527ar, (ahl.AbstractC6344b<Status>) abstractC6344b, abstractC9454a, ailVar);
            }
        };
    }

    @Override // com.google.android.gms.wearable.AbstractC9453c
    /* renamed from: a */
    public AbstractC4494i<Status> mo7874a(AbstractC4489g abstractC4489g, AbstractC9453c.AbstractC9454a abstractC9454a) {
        C4588d.m23626a(abstractC4489g, "client is null");
        C4588d.m23626a(abstractC9454a, "listener is null");
        return C9483ab.m8028a(abstractC4489g, m7872a(new IntentFilter[]{C9504ap.m7986a(AbstractC9453c.f29844a)}), abstractC9454a);
    }

    @Override // com.google.android.gms.wearable.AbstractC9453c
    /* renamed from: a */
    public AbstractC4494i<AbstractC9453c.AbstractC9456c> mo7873a(AbstractC4489g abstractC4489g, final String str, final String str2) {
        C4588d.m23626a(abstractC4489g, "client is null");
        C4588d.m23626a(str, (Object) "nodeId is null");
        C4588d.m23626a(str2, (Object) "path is null");
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9453c.AbstractC9456c>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bd.1
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9453c.AbstractC9456c mo7807b(Status status) {
                return new C9563a(status, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7955a(this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9453c
    /* renamed from: b */
    public AbstractC4494i<Status> mo7871b(AbstractC4489g abstractC4489g, AbstractC9453c.AbstractC9454a abstractC9454a) {
        C4588d.m23626a(abstractC4489g, "client is null");
        C4588d.m23626a(abstractC9454a, "listener is null");
        return abstractC4489g.mo17255a((AbstractC4489g) new C9564b(abstractC4489g, abstractC9454a, null));
    }
}
