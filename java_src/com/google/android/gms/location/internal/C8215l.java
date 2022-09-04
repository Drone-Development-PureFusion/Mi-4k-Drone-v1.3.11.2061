package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.location.AbstractC8226k;
import com.google.android.gms.location.AbstractC8227l;
import com.google.android.gms.location.C8233p;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.internal.AbstractC8201h;
import com.google.android.gms.location.internal.AbstractC8207j;
import java.util.List;
/* renamed from: com.google.android.gms.location.internal.l */
/* loaded from: classes2.dex */
public class C8215l extends C8176b {

    /* renamed from: e */
    private final C8210k f26820e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.location.internal.l$a */
    /* loaded from: classes2.dex */
    public static final class BinderC8216a extends AbstractC8201h.AbstractBinderC8202a {

        /* renamed from: a */
        private ahl.AbstractC6344b<Status> f26821a;

        public BinderC8216a(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f26821a = abstractC6344b;
        }

        @Override // com.google.android.gms.location.internal.AbstractC8201h
        /* renamed from: a */
        public void mo12399a(int i, PendingIntent pendingIntent) {
            Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
        }

        @Override // com.google.android.gms.location.internal.AbstractC8201h
        /* renamed from: a */
        public void mo12398a(int i, String[] strArr) {
            if (this.f26821a == null) {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            }
            this.f26821a.mo7413a(C8233p.m12369b(C8233p.m12370a(i)));
            this.f26821a = null;
        }

        @Override // com.google.android.gms.location.internal.AbstractC8201h
        /* renamed from: b */
        public void mo12397b(int i, String[] strArr) {
            Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.location.internal.l$b */
    /* loaded from: classes2.dex */
    public static final class BinderC8217b extends AbstractC8201h.AbstractBinderC8202a {

        /* renamed from: a */
        private ahl.AbstractC6344b<Status> f26822a;

        public BinderC8217b(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f26822a = abstractC6344b;
        }

        /* renamed from: a */
        private void m12400a(int i) {
            if (this.f26822a == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
                return;
            }
            this.f26822a.mo7413a(C8233p.m12369b(C8233p.m12370a(i)));
            this.f26822a = null;
        }

        @Override // com.google.android.gms.location.internal.AbstractC8201h
        /* renamed from: a */
        public void mo12399a(int i, PendingIntent pendingIntent) {
            m12400a(i);
        }

        @Override // com.google.android.gms.location.internal.AbstractC8201h
        /* renamed from: a */
        public void mo12398a(int i, String[] strArr) {
            Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
        }

        @Override // com.google.android.gms.location.internal.AbstractC8201h
        /* renamed from: b */
        public void mo12397b(int i, String[] strArr) {
            m12400a(i);
        }
    }

    /* renamed from: com.google.android.gms.location.internal.l$c */
    /* loaded from: classes2.dex */
    private static final class BinderC8218c extends AbstractC8207j.AbstractBinderC8208a {

        /* renamed from: a */
        private ahl.AbstractC6344b<LocationSettingsResult> f26823a;

        public BinderC8218c(ahl.AbstractC6344b<LocationSettingsResult> abstractC6344b) {
            C4588d.m23618b(abstractC6344b != null, "listener can't be null.");
            this.f26823a = abstractC6344b;
        }

        @Override // com.google.android.gms.location.internal.AbstractC8207j
        /* renamed from: a */
        public void mo12396a(LocationSettingsResult locationSettingsResult) {
            this.f26823a.mo7413a(locationSettingsResult);
            this.f26823a = null;
        }
    }

    public C8215l(Context context, Looper looper, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, String str) {
        this(context, looper, abstractC4491b, abstractC4492c, str, C4626s.m23536a(context));
    }

    public C8215l(Context context, Looper looper, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, String str, C4626s c4626s) {
        super(context, looper, abstractC4491b, abstractC4492c, str, c4626s);
        this.f26820e = new C8210k(context, this.f26769a);
    }

    /* renamed from: a */
    public void m12417a(long j, PendingIntent pendingIntent) {
        F();
        C4588d.m23627a(pendingIntent);
        C4588d.m23618b(j >= 0, "detectionIntervalMillis must be >= 0");
        ((AbstractC8204i) G()).mo12469a(j, true, pendingIntent);
    }

    /* renamed from: a */
    public void m12416a(PendingIntent pendingIntent) {
        F();
        C4588d.m23627a(pendingIntent);
        ((AbstractC8204i) G()).mo12468a(pendingIntent);
    }

    /* renamed from: a */
    public void m12415a(PendingIntent pendingIntent, ahl.AbstractC6344b<Status> abstractC6344b) {
        F();
        C4588d.m23626a(pendingIntent, "PendingIntent must be specified.");
        C4588d.m23626a(abstractC6344b, "ResultHolder not provided.");
        ((AbstractC8204i) G()).mo12466a(pendingIntent, new BinderC8217b(abstractC6344b), B().getPackageName());
    }

    /* renamed from: a */
    public void m12414a(PendingIntent pendingIntent, AbstractC8198g abstractC8198g) {
        this.f26820e.m12434a(pendingIntent, abstractC8198g);
    }

    /* renamed from: a */
    public void m12413a(Location location) {
        this.f26820e.m12433a(location);
    }

    /* renamed from: a */
    public void m12412a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, ahl.AbstractC6344b<Status> abstractC6344b) {
        F();
        C4588d.m23626a(geofencingRequest, "geofencingRequest can't be null.");
        C4588d.m23626a(pendingIntent, "PendingIntent must be specified.");
        C4588d.m23626a(abstractC6344b, "ResultHolder not provided.");
        ((AbstractC8204i) G()).mo12460a(geofencingRequest, pendingIntent, new BinderC8216a(abstractC6344b));
    }

    /* renamed from: a */
    public void m12411a(LocationRequest locationRequest, PendingIntent pendingIntent, AbstractC8198g abstractC8198g) {
        this.f26820e.m12432a(locationRequest, pendingIntent, abstractC8198g);
    }

    /* renamed from: a */
    public void m12410a(LocationRequest locationRequest, AbstractC8227l abstractC8227l, Looper looper, AbstractC8198g abstractC8198g) {
        synchronized (this.f26820e) {
            this.f26820e.m12431a(locationRequest, abstractC8227l, looper, abstractC8198g);
        }
    }

    /* renamed from: a */
    public void m12409a(LocationSettingsRequest locationSettingsRequest, ahl.AbstractC6344b<LocationSettingsResult> abstractC6344b, String str) {
        boolean z = true;
        F();
        C4588d.m23618b(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        if (abstractC6344b == null) {
            z = false;
        }
        C4588d.m23618b(z, "listener can't be null.");
        ((AbstractC8204i) G()).mo12455a(locationSettingsRequest, new BinderC8218c(abstractC6344b), str);
    }

    /* renamed from: a */
    public void m12408a(LocationRequestInternal locationRequestInternal, AbstractC8226k abstractC8226k, Looper looper, AbstractC8198g abstractC8198g) {
        synchronized (this.f26820e) {
            this.f26820e.m12430a(locationRequestInternal, abstractC8226k, looper, abstractC8198g);
        }
    }

    /* renamed from: a */
    public void m12407a(AbstractC8198g abstractC8198g) {
        this.f26820e.m12429a(abstractC8198g);
    }

    /* renamed from: a */
    public void m12406a(AbstractC8226k abstractC8226k, AbstractC8198g abstractC8198g) {
        this.f26820e.m12427a(abstractC8226k, abstractC8198g);
    }

    /* renamed from: a */
    public void m12405a(AbstractC8227l abstractC8227l, AbstractC8198g abstractC8198g) {
        this.f26820e.m12425a(abstractC8227l, abstractC8198g);
    }

    /* renamed from: a */
    public void m12404a(List<String> list, ahl.AbstractC6344b<Status> abstractC6344b) {
        F();
        C4588d.m23618b(list != null && list.size() > 0, "geofenceRequestIds can't be null nor empty.");
        C4588d.m23626a(abstractC6344b, "ResultHolder not provided.");
        ((AbstractC8204i) G()).mo12445a((String[]) list.toArray(new String[0]), new BinderC8217b(abstractC6344b), B().getPackageName());
    }

    /* renamed from: a */
    public void m12403a(boolean z) {
        this.f26820e.m12424a(z);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: f */
    public void mo9828f() {
        synchronized (this.f26820e) {
            if (t()) {
                try {
                    this.f26820e.m12422c();
                    this.f26820e.m12421d();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.f();
        }
    }

    /* renamed from: h */
    public Location m12402h() {
        return this.f26820e.m12435a();
    }

    /* renamed from: i */
    public LocationAvailability m12401i() {
        return this.f26820e.m12423b();
    }
}
