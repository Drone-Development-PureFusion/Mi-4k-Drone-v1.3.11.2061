package com.google.android.gms.contextmanager.internal;

import com.google.android.gms.awareness.fence.AbstractC4097c;
import com.google.android.gms.awareness.fence.AbstractC4098d;
import com.google.android.gms.awareness.snapshot.internal.AbstractC4137m;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.C4727c;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.contextmanager.internal.c */
/* loaded from: classes2.dex */
public class C4758c {

    /* renamed from: com.google.android.gms.contextmanager.internal.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4759a extends ahl.AbstractC6343a<AbstractC4097c, C4764d> {
        public AbstractC4759a(AbstractC4489g abstractC4489g) {
            super(C4727c.f17356d, abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4097c mo7807b(final Status status) {
            return new AbstractC4097c() { // from class: com.google.android.gms.contextmanager.internal.c.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.awareness.fence.AbstractC4097c
                /* renamed from: b */
                public AbstractC4098d mo22800b() {
                    return null;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.contextmanager.internal.c$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4761b extends ahl.AbstractC6343a<AbstractC4137m, C4764d> {
        public AbstractC4761b(AbstractC4489g abstractC4489g) {
            super(C4727c.f17356d, abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4137m mo7807b(final Status status) {
            return new AbstractC4137m() { // from class: com.google.android.gms.contextmanager.internal.c.b.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.awareness.snapshot.internal.AbstractC4137m
                /* renamed from: b */
                public Snapshot mo22801b() {
                    return null;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.contextmanager.internal.c$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4763c extends ahl.AbstractC6343a<Status, C4764d> {
        public AbstractC4763c(AbstractC4489g abstractC4489g) {
            super(C4727c.f17356d, abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }
}
