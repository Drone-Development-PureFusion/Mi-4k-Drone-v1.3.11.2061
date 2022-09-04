package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.location.AbstractC8226k;
import com.google.android.gms.location.AbstractC8227l;
import com.google.android.gms.location.AbstractC8341w;
import com.google.android.gms.location.AbstractC8344x;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.location.internal.k */
/* loaded from: classes2.dex */
public class C8210k {

    /* renamed from: a */
    private final AbstractC8222p<AbstractC8204i> f26809a;

    /* renamed from: b */
    private final Context f26810b;

    /* renamed from: c */
    private ContentProviderClient f26811c = null;

    /* renamed from: d */
    private boolean f26812d = false;

    /* renamed from: e */
    private Map<AbstractC8227l, BinderC8214c> f26813e = new HashMap();

    /* renamed from: f */
    private Map<AbstractC8226k, BinderC8211a> f26814f = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.location.internal.k$a */
    /* loaded from: classes2.dex */
    public static class BinderC8211a extends AbstractC8341w.AbstractBinderC8342a {

        /* renamed from: a */
        private Handler f26815a;

        BinderC8211a(final AbstractC8226k abstractC8226k, Looper looper) {
            if (looper == null) {
                looper = Looper.myLooper();
                C4588d.m23622a(looper != null, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            this.f26815a = new Handler(looper) { // from class: com.google.android.gms.location.internal.k.a.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    switch (message.what) {
                        case 0:
                            abstractC8226k.m12377a((LocationResult) message.obj);
                            return;
                        case 1:
                            abstractC8226k.m12378a((LocationAvailability) message.obj);
                            return;
                        default:
                            return;
                    }
                }
            };
        }

        /* renamed from: a */
        private synchronized void m12419a(int i, Object obj) {
            if (this.f26815a == null) {
                Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
            } else {
                Message obtain = Message.obtain();
                obtain.what = i;
                obtain.obj = obj;
                this.f26815a.sendMessage(obtain);
            }
        }

        /* renamed from: a */
        public synchronized void m12420a() {
            this.f26815a = null;
        }

        @Override // com.google.android.gms.location.AbstractC8341w
        /* renamed from: a */
        public void mo12025a(LocationAvailability locationAvailability) {
            m12419a(1, locationAvailability);
        }

        @Override // com.google.android.gms.location.AbstractC8341w
        /* renamed from: a */
        public void mo12024a(LocationResult locationResult) {
            m12419a(0, locationResult);
        }
    }

    /* renamed from: com.google.android.gms.location.internal.k$b */
    /* loaded from: classes2.dex */
    private static class HandlerC8213b extends Handler {

        /* renamed from: a */
        private final AbstractC8227l f26818a;

        public HandlerC8213b(AbstractC8227l abstractC8227l) {
            this.f26818a = abstractC8227l;
        }

        public HandlerC8213b(AbstractC8227l abstractC8227l, Looper looper) {
            super(looper);
            this.f26818a = abstractC8227l;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f26818a.mo12376b(new Location((Location) message.obj));
                    return;
                default:
                    Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.location.internal.k$c */
    /* loaded from: classes2.dex */
    public static class BinderC8214c extends AbstractC8344x.AbstractBinderC8345a {

        /* renamed from: a */
        private Handler f26819a;

        BinderC8214c(AbstractC8227l abstractC8227l, Looper looper) {
            if (looper == null) {
                C4588d.m23622a(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            this.f26819a = looper == null ? new HandlerC8213b(abstractC8227l) : new HandlerC8213b(abstractC8227l, looper);
        }

        /* renamed from: a */
        public synchronized void m12418a() {
            this.f26819a = null;
        }

        @Override // com.google.android.gms.location.AbstractC8344x
        /* renamed from: a */
        public synchronized void mo12022a(Location location) {
            if (this.f26819a == null) {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
            } else {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = location;
                this.f26819a.sendMessage(obtain);
            }
        }
    }

    public C8210k(Context context, AbstractC8222p<AbstractC8204i> abstractC8222p) {
        this.f26810b = context;
        this.f26809a = abstractC8222p;
    }

    /* renamed from: a */
    private BinderC8211a m12428a(AbstractC8226k abstractC8226k, Looper looper) {
        BinderC8211a binderC8211a;
        synchronized (this.f26814f) {
            binderC8211a = this.f26814f.get(abstractC8226k);
            if (binderC8211a == null) {
                binderC8211a = new BinderC8211a(abstractC8226k, looper);
            }
            this.f26814f.put(abstractC8226k, binderC8211a);
        }
        return binderC8211a;
    }

    /* renamed from: a */
    private BinderC8214c m12426a(AbstractC8227l abstractC8227l, Looper looper) {
        BinderC8214c binderC8214c;
        synchronized (this.f26813e) {
            binderC8214c = this.f26813e.get(abstractC8227l);
            if (binderC8214c == null) {
                binderC8214c = new BinderC8214c(abstractC8227l, looper);
            }
            this.f26813e.put(abstractC8227l, binderC8214c);
        }
        return binderC8214c;
    }

    /* renamed from: a */
    public Location m12435a() {
        this.f26809a.mo12386a();
        try {
            return this.f26809a.mo12385c().mo12442b(this.f26810b.getPackageName());
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public void m12434a(PendingIntent pendingIntent, AbstractC8198g abstractC8198g) {
        this.f26809a.mo12386a();
        this.f26809a.mo12385c().mo12452a(LocationRequestUpdateData.m12544a(pendingIntent, abstractC8198g));
    }

    /* renamed from: a */
    public void m12433a(Location location) {
        this.f26809a.mo12386a();
        this.f26809a.mo12385c().mo12465a(location);
    }

    /* renamed from: a */
    public void m12432a(LocationRequest locationRequest, PendingIntent pendingIntent, AbstractC8198g abstractC8198g) {
        this.f26809a.mo12386a();
        this.f26809a.mo12385c().mo12452a(LocationRequestUpdateData.m12543a(LocationRequestInternal.m12547a(locationRequest), pendingIntent, abstractC8198g));
    }

    /* renamed from: a */
    public void m12431a(LocationRequest locationRequest, AbstractC8227l abstractC8227l, Looper looper, AbstractC8198g abstractC8198g) {
        this.f26809a.mo12386a();
        this.f26809a.mo12385c().mo12452a(LocationRequestUpdateData.m12541a(LocationRequestInternal.m12547a(locationRequest), m12426a(abstractC8227l, looper), abstractC8198g));
    }

    /* renamed from: a */
    public void m12430a(LocationRequestInternal locationRequestInternal, AbstractC8226k abstractC8226k, Looper looper, AbstractC8198g abstractC8198g) {
        this.f26809a.mo12386a();
        this.f26809a.mo12385c().mo12452a(LocationRequestUpdateData.m12542a(locationRequestInternal, m12428a(abstractC8226k, looper), abstractC8198g));
    }

    /* renamed from: a */
    public void m12429a(AbstractC8198g abstractC8198g) {
        this.f26809a.mo12386a();
        this.f26809a.mo12385c().mo12451a(abstractC8198g);
    }

    /* renamed from: a */
    public void m12427a(AbstractC8226k abstractC8226k, AbstractC8198g abstractC8198g) {
        this.f26809a.mo12386a();
        C4588d.m23626a(abstractC8226k, "Invalid null callback");
        synchronized (this.f26814f) {
            BinderC8211a remove = this.f26814f.remove(abstractC8226k);
            if (remove != null) {
                remove.m12420a();
                this.f26809a.mo12385c().mo12452a(LocationRequestUpdateData.m12540a(remove, abstractC8198g));
            }
        }
    }

    /* renamed from: a */
    public void m12425a(AbstractC8227l abstractC8227l, AbstractC8198g abstractC8198g) {
        this.f26809a.mo12386a();
        C4588d.m23626a(abstractC8227l, "Invalid null listener");
        synchronized (this.f26813e) {
            BinderC8214c remove = this.f26813e.remove(abstractC8227l);
            if (remove != null) {
                remove.m12418a();
                this.f26809a.mo12385c().mo12452a(LocationRequestUpdateData.m12539a(remove, abstractC8198g));
            }
        }
    }

    /* renamed from: a */
    public void m12424a(boolean z) {
        this.f26809a.mo12386a();
        this.f26809a.mo12385c().mo12446a(z);
        this.f26812d = z;
    }

    /* renamed from: b */
    public LocationAvailability m12423b() {
        this.f26809a.mo12386a();
        try {
            return this.f26809a.mo12385c().mo12440c(this.f26810b.getPackageName());
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public void m12422c() {
        try {
            synchronized (this.f26813e) {
                for (BinderC8214c binderC8214c : this.f26813e.values()) {
                    if (binderC8214c != null) {
                        this.f26809a.mo12385c().mo12452a(LocationRequestUpdateData.m12539a(binderC8214c, (AbstractC8198g) null));
                    }
                }
                this.f26813e.clear();
            }
            synchronized (this.f26814f) {
                for (BinderC8211a binderC8211a : this.f26814f.values()) {
                    if (binderC8211a != null) {
                        this.f26809a.mo12385c().mo12452a(LocationRequestUpdateData.m12540a(binderC8211a, (AbstractC8198g) null));
                    }
                }
                this.f26814f.clear();
            }
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    public void m12421d() {
        if (this.f26812d) {
            try {
                m12424a(false);
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
