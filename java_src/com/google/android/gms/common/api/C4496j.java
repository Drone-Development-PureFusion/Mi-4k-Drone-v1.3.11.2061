package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ahn;
import com.google.android.gms.internal.aio;
import com.google.android.gms.internal.aiu;
/* renamed from: com.google.android.gms.common.api.j */
/* loaded from: classes2.dex */
public final class C4496j {

    /* renamed from: com.google.android.gms.common.api.j$a */
    /* loaded from: classes2.dex */
    private static final class C4497a<R extends AbstractC4502m> extends ahn<R> {

        /* renamed from: a */
        private final R f16854a;

        public C4497a(R r) {
            super(Looper.getMainLooper());
            this.f16854a = r;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: b */
        public R mo7807b(Status status) {
            if (status.m24015i() != this.f16854a.mo7645a().m24015i()) {
                throw new UnsupportedOperationException("Creating failed results is not supported");
            }
            return this.f16854a;
        }
    }

    /* renamed from: com.google.android.gms.common.api.j$b */
    /* loaded from: classes2.dex */
    private static final class C4498b<R extends AbstractC4502m> extends ahn<R> {

        /* renamed from: a */
        private final R f16855a;

        public C4498b(AbstractC4489g abstractC4489g, R r) {
            super(abstractC4489g);
            this.f16855a = r;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: b */
        public R mo7807b(Status status) {
            return this.f16855a;
        }
    }

    /* renamed from: com.google.android.gms.common.api.j$c */
    /* loaded from: classes2.dex */
    private static final class C4499c<R extends AbstractC4502m> extends ahn<R> {
        public C4499c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: b */
        public R mo7807b(Status status) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    private C4496j() {
    }

    /* renamed from: a */
    public static <R extends AbstractC4502m> AbstractC4493h<R> m23952a(R r) {
        C4588d.m23626a(r, "Result must not be null");
        C4499c c4499c = new C4499c(null);
        c4499c.b((C4499c) r);
        return new aio(c4499c);
    }

    /* renamed from: a */
    public static AbstractC4494i<Status> m23955a() {
        aiu aiuVar = new aiu(Looper.getMainLooper());
        aiuVar.a();
        return aiuVar;
    }

    /* renamed from: a */
    public static AbstractC4494i<Status> m23954a(Status status) {
        C4588d.m23626a(status, "Result must not be null");
        aiu aiuVar = new aiu(Looper.getMainLooper());
        aiuVar.b((aiu) status);
        return aiuVar;
    }

    /* renamed from: a */
    public static AbstractC4494i<Status> m23953a(Status status, AbstractC4489g abstractC4489g) {
        C4588d.m23626a(status, "Result must not be null");
        aiu aiuVar = new aiu(abstractC4489g);
        aiuVar.b((aiu) status);
        return aiuVar;
    }

    /* renamed from: a */
    public static <R extends AbstractC4502m> AbstractC4494i<R> m23951a(R r, AbstractC4489g abstractC4489g) {
        C4588d.m23626a(r, "Result must not be null");
        C4588d.m23618b(!r.mo7645a().m24018f(), "Status code must not be SUCCESS");
        C4498b c4498b = new C4498b(abstractC4489g, r);
        c4498b.b((C4498b) r);
        return c4498b;
    }

    /* renamed from: b */
    public static <R extends AbstractC4502m> AbstractC4493h<R> m23949b(R r, AbstractC4489g abstractC4489g) {
        C4588d.m23626a(r, "Result must not be null");
        C4499c c4499c = new C4499c(abstractC4489g);
        c4499c.b((C4499c) r);
        return new aio(c4499c);
    }

    /* renamed from: b */
    public static <R extends AbstractC4502m> AbstractC4494i<R> m23950b(R r) {
        C4588d.m23626a(r, "Result must not be null");
        C4588d.m23618b(r.mo7645a().m24015i() == 16, "Status code must be CommonStatusCodes.CANCELED");
        C4497a c4497a = new C4497a(r);
        c4497a.a();
        return c4497a;
    }
}
