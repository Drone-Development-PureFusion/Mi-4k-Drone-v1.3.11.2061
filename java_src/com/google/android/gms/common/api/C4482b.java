package com.google.android.gms.common.api;

import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.internal.ahn;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.common.api.b */
/* loaded from: classes2.dex */
public final class C4482b extends ahn<C4485c> {

    /* renamed from: a */
    private int f16802a;

    /* renamed from: b */
    private boolean f16803b;

    /* renamed from: c */
    private boolean f16804c;

    /* renamed from: d */
    private final AbstractC4494i<?>[] f16805d;

    /* renamed from: e */
    private final Object f16806e;

    /* renamed from: com.google.android.gms.common.api.b$a */
    /* loaded from: classes2.dex */
    public static final class C4484a {

        /* renamed from: a */
        private List<AbstractC4494i<?>> f16808a = new ArrayList();

        /* renamed from: b */
        private AbstractC4489g f16809b;

        public C4484a(AbstractC4489g abstractC4489g) {
            this.f16809b = abstractC4489g;
        }

        /* renamed from: a */
        public C4482b m23985a() {
            return new C4482b(this.f16808a, this.f16809b);
        }

        /* renamed from: a */
        public <R extends AbstractC4502m> C4486d<R> m23984a(AbstractC4494i<R> abstractC4494i) {
            C4486d<R> c4486d = new C4486d<>(this.f16808a.size());
            this.f16808a.add(abstractC4494i);
            return c4486d;
        }
    }

    private C4482b(List<AbstractC4494i<?>> list, AbstractC4489g abstractC4489g) {
        super(abstractC4489g);
        this.f16806e = new Object();
        this.f16802a = list.size();
        this.f16805d = new AbstractC4494i[this.f16802a];
        if (list.isEmpty()) {
            b((C4482b) new C4485c(Status.f16786a, this.f16805d));
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return;
            }
            AbstractC4494i<?> abstractC4494i = list.get(i2);
            this.f16805d[i2] = abstractC4494i;
            abstractC4494i.mo17197a(new AbstractC4494i.AbstractC4495a() { // from class: com.google.android.gms.common.api.b.1
                @Override // com.google.android.gms.common.api.AbstractC4494i.AbstractC4495a
                /* renamed from: a */
                public void mo17524a(Status status) {
                    synchronized (C4482b.this.f16806e) {
                        if (C4482b.this.e()) {
                            return;
                        }
                        if (status.m24017g()) {
                            C4482b.this.f16804c = true;
                        } else if (!status.m24018f()) {
                            C4482b.this.f16803b = true;
                        }
                        C4482b.m23992b(C4482b.this);
                        if (C4482b.this.f16802a == 0) {
                            if (C4482b.this.f16804c) {
                                C4482b.super.mo13676a();
                            } else {
                                C4482b.this.b((C4482b) new C4485c(C4482b.this.f16803b ? new Status(13) : Status.f16786a, C4482b.this.f16805d));
                            }
                        }
                    }
                }
            });
            i = i2 + 1;
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m23992b(C4482b c4482b) {
        int i = c4482b.f16802a;
        c4482b.f16802a = i - 1;
        return i;
    }

    @Override // com.google.android.gms.internal.ahn
    /* renamed from: a */
    public C4485c mo7807b(Status status) {
        return new C4485c(status, this.f16805d);
    }

    @Override // com.google.android.gms.internal.ahn, com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public void mo13676a() {
        super.mo13676a();
        for (AbstractC4494i<?> abstractC4494i : this.f16805d) {
            abstractC4494i.mo13676a();
        }
    }
}
