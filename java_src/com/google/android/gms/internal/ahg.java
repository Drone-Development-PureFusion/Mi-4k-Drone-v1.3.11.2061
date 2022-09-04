package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.p001v4.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.C4507r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.p239g.C5286g;
import com.google.firebase.C9653a;
import com.google.firebase.C9766c;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class ahg {

    /* renamed from: a */
    public final int f21716a;

    /* renamed from: b */
    public final int f21717b;

    /* renamed from: com.google.android.gms.internal.ahg$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6337a extends ahg {

        /* renamed from: c */
        protected final SparseArray<Map<ail.C6385b<?>, aiq>> f21718c;

        /* renamed from: d */
        protected final C5286g<Void> f21719d;

        public AbstractC6337a(int i, int i2, C5286g<Void> c5286g, SparseArray<Map<ail.C6385b<?>, aiq>> sparseArray) {
            super(i, i2);
            this.f21718c = sparseArray;
            this.f21719d = c5286g;
        }

        /* renamed from: a */
        private void m17495a(RemoteException remoteException) {
            mo17491a(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        @Override // com.google.android.gms.internal.ahg
        /* renamed from: a */
        public void mo17492a(SparseArray<aix> sparseArray) {
        }

        @Override // com.google.android.gms.internal.ahg
        /* renamed from: a */
        public void mo17491a(@NonNull Status status) {
            this.f21719d.m20831a(new C4507r(status));
        }

        @Override // com.google.android.gms.internal.ahg
        /* renamed from: a */
        public final void mo17494a(C4467a.AbstractC4474c abstractC4474c) {
            try {
                mo17490b(abstractC4474c);
            } catch (DeadObjectException e) {
                m17495a(e);
                throw e;
            } catch (RemoteException e2) {
                m17495a(e2);
            }
        }

        @Override // com.google.android.gms.internal.ahg
        /* renamed from: a */
        public boolean mo17493a() {
            this.f21719d.m20831a(new C4507r(Status.f16790e));
            return true;
        }

        /* renamed from: b */
        protected abstract void mo17490b(C4467a.AbstractC4474c abstractC4474c);
    }

    /* renamed from: com.google.android.gms.internal.ahg$b */
    /* loaded from: classes2.dex */
    public static class C6338b<A extends ahl.AbstractC6343a<? extends AbstractC4502m, C4467a.AbstractC4474c>> extends ahg {

        /* renamed from: c */
        protected final A f21720c;

        public C6338b(int i, int i2, A a) {
            super(i, i2);
            this.f21720c = a;
        }

        @Override // com.google.android.gms.internal.ahg
        /* renamed from: a */
        public void mo17492a(SparseArray<aix> sparseArray) {
            aix aixVar = sparseArray.get(this.f21716a);
            if (aixVar != null) {
                aixVar.m17174a(this.f21720c);
            }
        }

        @Override // com.google.android.gms.internal.ahg
        /* renamed from: a */
        public void mo17491a(@NonNull Status status) {
            this.f21720c.mo7412c(status);
        }

        @Override // com.google.android.gms.internal.ahg
        /* renamed from: a */
        public void mo17494a(C4467a.AbstractC4474c abstractC4474c) {
            this.f21720c.m17476b(abstractC4474c);
        }

        @Override // com.google.android.gms.internal.ahg
        /* renamed from: a */
        public boolean mo17493a() {
            return this.f21720c.j();
        }
    }

    /* renamed from: com.google.android.gms.internal.ahg$c */
    /* loaded from: classes2.dex */
    public static final class C6339c extends AbstractC6337a {

        /* renamed from: e */
        public final aip<C4467a.AbstractC4474c> f21721e;

        /* renamed from: f */
        public final aiy<C4467a.AbstractC4474c> f21722f;

        public C6339c(int i, aiq aiqVar, C5286g<Void> c5286g, SparseArray<Map<ail.C6385b<?>, aiq>> sparseArray) {
            super(i, 3, c5286g, sparseArray);
            this.f21721e = aiqVar.f21950a;
            this.f21722f = aiqVar.f21951b;
        }

        @Override // com.google.android.gms.internal.ahg.AbstractC6337a, com.google.android.gms.internal.ahg
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo17492a(SparseArray sparseArray) {
            super.mo17492a(sparseArray);
        }

        @Override // com.google.android.gms.internal.ahg.AbstractC6337a, com.google.android.gms.internal.ahg
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo17491a(@NonNull Status status) {
            super.mo17491a(status);
        }

        @Override // com.google.android.gms.internal.ahg.AbstractC6337a, com.google.android.gms.internal.ahg
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo17493a() {
            return super.mo17493a();
        }

        @Override // com.google.android.gms.internal.ahg.AbstractC6337a
        /* renamed from: b */
        public void mo17490b(C4467a.AbstractC4474c abstractC4474c) {
            this.f21721e.m17199a(abstractC4474c, this.f21719d);
            Map<ail.C6385b<?>, aiq> map = this.f21718c.get(this.f21716a);
            if (map == null) {
                map = new ArrayMap<>(1);
                this.f21718c.put(this.f21716a, map);
            }
            String valueOf = String.valueOf(this.f21721e.m17200a());
            Log.d("reg", new StringBuilder(String.valueOf(valueOf).length() + 12).append("registered: ").append(valueOf).toString());
            if (this.f21721e.m17200a() != null) {
                map.put(this.f21721e.m17200a(), new aiq(this.f21721e, this.f21722f));
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ahg$d */
    /* loaded from: classes2.dex */
    public static final class C6340d<TResult> extends ahg {

        /* renamed from: e */
        private static final Status f21723e = new Status(8, "Connection to Google Play services was lost while executing the API call.");

        /* renamed from: c */
        private final aiv<C4467a.AbstractC4474c, TResult> f21724c;

        /* renamed from: d */
        private final C5286g<TResult> f21725d;

        public C6340d(int i, int i2, aiv<C4467a.AbstractC4474c, TResult> aivVar, C5286g<TResult> c5286g) {
            super(i, i2);
            this.f21725d = c5286g;
            this.f21724c = aivVar;
        }

        @Override // com.google.android.gms.internal.ahg
        /* renamed from: a */
        public void mo17491a(@NonNull Status status) {
            if (status.m24015i() == 8) {
                this.f21725d.m20831a((Exception) new C9766c(status.m24021c()));
            } else {
                this.f21725d.m20831a((Exception) new C9653a(status.m24021c()));
            }
        }

        @Override // com.google.android.gms.internal.ahg
        /* renamed from: a */
        public void mo17494a(C4467a.AbstractC4474c abstractC4474c) {
            try {
                this.f21724c.mo7416a(abstractC4474c, this.f21725d);
            } catch (DeadObjectException e) {
                mo17491a(f21723e);
                throw e;
            } catch (RemoteException e2) {
                mo17491a(f21723e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ahg$e */
    /* loaded from: classes2.dex */
    public static final class C6341e extends AbstractC6337a {

        /* renamed from: e */
        public final aiy<C4467a.AbstractC4474c> f21726e;

        public C6341e(int i, aiy<C4467a.AbstractC4474c> aiyVar, C5286g<Void> c5286g, SparseArray<Map<ail.C6385b<?>, aiq>> sparseArray) {
            super(i, 4, c5286g, sparseArray);
            this.f21726e = aiyVar;
        }

        @Override // com.google.android.gms.internal.ahg.AbstractC6337a, com.google.android.gms.internal.ahg
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo17492a(SparseArray sparseArray) {
            super.mo17492a(sparseArray);
        }

        @Override // com.google.android.gms.internal.ahg.AbstractC6337a, com.google.android.gms.internal.ahg
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo17491a(@NonNull Status status) {
            super.mo17491a(status);
        }

        @Override // com.google.android.gms.internal.ahg.AbstractC6337a, com.google.android.gms.internal.ahg
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo17493a() {
            return super.mo17493a();
        }

        @Override // com.google.android.gms.internal.ahg.AbstractC6337a
        /* renamed from: b */
        public void mo17490b(C4467a.AbstractC4474c abstractC4474c) {
            Map<ail.C6385b<?>, aiq> map = this.f21718c.get(this.f21716a);
            if (map == null || this.f21726e.m17163a() == null) {
                Log.wtf("UnregisterListenerTask", "Received call to unregister a listener without a matching registration call.", new Exception());
                this.f21719d.m20831a(new C4507r(Status.f16788c));
                return;
            }
            map.remove(this.f21726e.m17163a());
            this.f21726e.m17162a(abstractC4474c, this.f21719d);
        }
    }

    public ahg(int i, int i2) {
        this.f21716a = i;
        this.f21717b = i2;
    }

    /* renamed from: a */
    public void mo17492a(SparseArray<aix> sparseArray) {
    }

    /* renamed from: a */
    public abstract void mo17491a(@NonNull Status status);

    /* renamed from: a */
    public abstract void mo17494a(C4467a.AbstractC4474c abstractC4474c);

    /* renamed from: a */
    public boolean mo17493a() {
        return true;
    }
}
