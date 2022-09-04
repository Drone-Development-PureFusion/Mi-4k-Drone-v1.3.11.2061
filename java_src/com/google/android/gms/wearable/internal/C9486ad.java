package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.AbstractC9635o;
import com.google.android.gms.wearable.AbstractC9636p;
import com.google.android.gms.wearable.internal.C9483ab;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.wearable.internal.ad */
/* loaded from: classes2.dex */
public final class C9486ad implements AbstractC9636p {

    /* renamed from: com.google.android.gms.wearable.internal.ad$a */
    /* loaded from: classes2.dex */
    public static class C9491a implements AbstractC9636p.AbstractC9637a {

        /* renamed from: a */
        private final Status f30019a;

        /* renamed from: b */
        private final List<AbstractC9635o> f30020b;

        public C9491a(Status status, List<AbstractC9635o> list) {
            this.f30019a = status;
            this.f30020b = list;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f30019a;
        }

        @Override // com.google.android.gms.wearable.AbstractC9636p.AbstractC9637a
        /* renamed from: b */
        public List<AbstractC9635o> mo7561b() {
            return this.f30020b;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.ad$b */
    /* loaded from: classes2.dex */
    public static class C9492b implements AbstractC9636p.AbstractC9638b {

        /* renamed from: a */
        private final Status f30021a;

        /* renamed from: b */
        private final AbstractC9635o f30022b;

        public C9492b(Status status, AbstractC9635o abstractC9635o) {
            this.f30021a = status;
            this.f30022b = abstractC9635o;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f30021a;
        }

        @Override // com.google.android.gms.wearable.AbstractC9636p.AbstractC9638b
        /* renamed from: b */
        public AbstractC9635o mo7560b() {
            return this.f30022b;
        }
    }

    /* renamed from: a */
    private static C9483ab.AbstractC9484a<AbstractC9636p.AbstractC9639c> m8023a(final IntentFilter[] intentFilterArr) {
        return new C9483ab.AbstractC9484a<AbstractC9636p.AbstractC9639c>() { // from class: com.google.android.gms.wearable.internal.ad.3
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void m8018a(C9527ar c9527ar, ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9636p.AbstractC9639c abstractC9639c, ail<AbstractC9636p.AbstractC9639c> ailVar) {
                c9527ar.m7960a(abstractC6344b, abstractC9639c, ailVar, intentFilterArr);
            }

            @Override // com.google.android.gms.wearable.internal.C9483ab.AbstractC9484a
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo7811a(C9527ar c9527ar, ahl.AbstractC6344b abstractC6344b, AbstractC9636p.AbstractC9639c abstractC9639c, ail<AbstractC9636p.AbstractC9639c> ailVar) {
                m8018a(c9527ar, (ahl.AbstractC6344b<Status>) abstractC6344b, abstractC9639c, ailVar);
            }
        };
    }

    @Override // com.google.android.gms.wearable.AbstractC9636p
    /* renamed from: a */
    public AbstractC4494i<AbstractC9636p.AbstractC9638b> mo7565a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9636p.AbstractC9638b>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.ad.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9636p.AbstractC9638b mo7807b(Status status) {
                return new C9492b(status, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7953b(this);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9636p
    /* renamed from: a */
    public AbstractC4494i<Status> mo7564a(AbstractC4489g abstractC4489g, AbstractC9636p.AbstractC9639c abstractC9639c) {
        return C9483ab.m8028a(abstractC4489g, m8023a(new IntentFilter[]{C9504ap.m7986a("com.google.android.gms.wearable.NODE_CHANGED")}), abstractC9639c);
    }

    @Override // com.google.android.gms.wearable.AbstractC9636p
    /* renamed from: b */
    public AbstractC4494i<AbstractC9636p.AbstractC9637a> mo7563b(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9636p.AbstractC9637a>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.ad.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9636p.AbstractC9637a mo7807b(Status status) {
                return new C9491a(status, new ArrayList());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7947c(this);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9636p
    /* renamed from: b */
    public AbstractC4494i<Status> mo7562b(AbstractC4489g abstractC4489g, final AbstractC9636p.AbstractC9639c abstractC9639c) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<Status>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.ad.4
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7961a(this, abstractC9639c);
            }
        });
    }
}
