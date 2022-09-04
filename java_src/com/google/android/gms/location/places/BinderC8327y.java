package com.google.android.gms.location.places;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.awareness.snapshot.internal.C4120j;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4698u;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.location.places.internal.AbstractC8269i;
import com.google.android.gms.location.places.personalized.C8304e;
/* renamed from: com.google.android.gms.location.places.y */
/* loaded from: classes2.dex */
public class BinderC8327y extends AbstractC8269i.AbstractBinderC8270a {

    /* renamed from: a */
    private static final String f27215a = BinderC8327y.class.getSimpleName();

    /* renamed from: b */
    private final AbstractC8331d f27216b;

    /* renamed from: c */
    private final AbstractC8328a f27217c;

    /* renamed from: d */
    private final AbstractC8332e f27218d;

    /* renamed from: e */
    private final AbstractC8333f f27219e;

    /* renamed from: f */
    private final AbstractC8330c f27220f;

    /* renamed from: com.google.android.gms.location.places.y$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8328a<A extends C4467a.AbstractC4477f> extends AbstractC8329b<C8238b, A> {
        public AbstractC8328a(C4467a c4467a, AbstractC4489g abstractC4489g) {
            super(c4467a, abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public C8238b mo7807b(Status status) {
            return new C8238b(DataHolder.m23889b(status.m24015i()));
        }
    }

    /* renamed from: com.google.android.gms.location.places.y$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8329b<R extends AbstractC4502m, A extends C4467a.AbstractC4477f> extends ahl.AbstractC6343a<R, A> {
        public AbstractC8329b(C4467a c4467a, AbstractC4489g abstractC4489g) {
            super(c4467a, abstractC4489g);
        }
    }

    /* renamed from: com.google.android.gms.location.places.y$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8330c<A extends C4467a.AbstractC4477f> extends AbstractC8329b<C8241e, A> {
        public AbstractC8330c(C4467a c4467a, AbstractC4489g abstractC4489g) {
            super(c4467a, abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public C8241e mo7807b(Status status) {
            return new C8241e(DataHolder.m23889b(status.m24015i()));
        }
    }

    /* renamed from: com.google.android.gms.location.places.y$d */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8331d<A extends C4467a.AbstractC4477f> extends AbstractC8329b<C8244h, A> {
        public AbstractC8331d(C4467a c4467a, AbstractC4489g abstractC4489g) {
            super(c4467a, abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public C8244h mo7807b(Status status) {
            return new C8244h(DataHolder.m23889b(status.m24015i()), 100);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.location.places.y$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC8332e<A extends C4467a.AbstractC4477f> extends AbstractC8329b<C8304e, A> {
    }

    /* renamed from: com.google.android.gms.location.places.y$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8333f<A extends C4467a.AbstractC4477f> extends AbstractC8329b<Status, A> {
        public AbstractC8333f(C4467a c4467a, AbstractC4489g abstractC4489g) {
            super(c4467a, abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    public BinderC8327y(AbstractC8328a abstractC8328a) {
        this.f27216b = null;
        this.f27217c = abstractC8328a;
        this.f27218d = null;
        this.f27219e = null;
        this.f27220f = null;
    }

    public BinderC8327y(AbstractC8330c abstractC8330c) {
        this.f27216b = null;
        this.f27217c = null;
        this.f27218d = null;
        this.f27219e = null;
        this.f27220f = abstractC8330c;
    }

    public BinderC8327y(AbstractC8331d abstractC8331d) {
        this.f27216b = abstractC8331d;
        this.f27217c = null;
        this.f27218d = null;
        this.f27219e = null;
        this.f27220f = null;
    }

    public BinderC8327y(AbstractC8333f abstractC8333f) {
        this.f27216b = null;
        this.f27217c = null;
        this.f27218d = null;
        this.f27219e = abstractC8333f;
        this.f27220f = null;
    }

    @Override // com.google.android.gms.location.places.internal.AbstractC8269i
    /* renamed from: a */
    public void mo12054a(Status status) {
        this.f27219e.b((AbstractC8333f) status);
    }

    @Override // com.google.android.gms.location.places.internal.AbstractC8269i
    /* renamed from: a */
    public void mo12053a(DataHolder dataHolder) {
        C4588d.m23622a(this.f27216b != null, "placeEstimator cannot be null");
        if (dataHolder != null) {
            Bundle m23881f = dataHolder.m23881f();
            this.f27216b.b((AbstractC8331d) new C8244h(dataHolder, m23881f == null ? 100 : C8244h.m12321a(m23881f)));
            return;
        }
        if (Log.isLoggable(f27215a, 6)) {
            String str = f27215a;
            String valueOf = String.valueOf(C4698u.m23097a());
            Log.e(str, valueOf.length() != 0 ? "onPlaceEstimated received null DataHolder: ".concat(valueOf) : new String("onPlaceEstimated received null DataHolder: "));
        }
        this.f27216b.c(Status.f16788c);
    }

    @Override // com.google.android.gms.location.places.internal.AbstractC8269i
    /* renamed from: b */
    public void mo12052b(DataHolder dataHolder) {
        if (dataHolder != null) {
            this.f27217c.b((AbstractC8328a) new C8238b(dataHolder));
            return;
        }
        if (Log.isLoggable(f27215a, 6)) {
            String str = f27215a;
            String valueOf = String.valueOf(C4698u.m23097a());
            Log.e(str, valueOf.length() != 0 ? "onAutocompletePrediction received null DataHolder: ".concat(valueOf) : new String("onAutocompletePrediction received null DataHolder: "));
        }
        this.f27217c.c(Status.f16788c);
    }

    @Override // com.google.android.gms.location.places.internal.AbstractC8269i
    /* renamed from: c */
    public void mo12051c(DataHolder dataHolder) {
        C4120j.C41348 c41348 = null;
        if (dataHolder != null) {
            c41348.b((C4120j.C41348) new C8304e(dataHolder));
            return;
        }
        if (Log.isLoggable(f27215a, 6)) {
            String str = f27215a;
            String valueOf = String.valueOf(C4698u.m23097a());
            Log.e(str, valueOf.length() != 0 ? "onPlaceUserDataFetched received null DataHolder: ".concat(valueOf) : new String("onPlaceUserDataFetched received null DataHolder: "));
        }
        c41348.c(Status.f16788c);
    }

    @Override // com.google.android.gms.location.places.internal.AbstractC8269i
    /* renamed from: d */
    public void mo12050d(DataHolder dataHolder) {
        this.f27220f.b((AbstractC8330c) new C8241e(dataHolder));
    }
}
