package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.wearable.internal.AbstractC9621y;
import com.google.android.gms.wearable.internal.C9505aq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.wearable.internal.z */
/* loaded from: classes2.dex */
public final class C9624z<T> {

    /* renamed from: a */
    private final Map<T, BinderC9531as<T>> f30147a = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.wearable.internal.z$a */
    /* loaded from: classes2.dex */
    public static class BinderC9625a<T> extends C9505aq.AbstractBinderC9507b<Status> {

        /* renamed from: a */
        private WeakReference<Map<T, BinderC9531as<T>>> f30148a;

        /* renamed from: b */
        private WeakReference<T> f30149b;

        BinderC9625a(Map<T, BinderC9531as<T>> map, T t, ahl.AbstractC6344b<Status> abstractC6344b) {
            super(abstractC6344b);
            this.f30148a = new WeakReference<>(map);
            this.f30149b = new WeakReference<>(t);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7646a(Status status) {
            Map<T, BinderC9531as<T>> map = this.f30148a.get();
            T t = this.f30149b.get();
            if (!status.mo7645a().m24018f() && map != null && t != null) {
                synchronized (map) {
                    BinderC9531as<T> remove = map.remove(t);
                    if (remove != null) {
                        remove.m7940a();
                    }
                }
            }
            a((BinderC9625a<T>) status);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.wearable.internal.z$b */
    /* loaded from: classes2.dex */
    public static class BinderC9626b<T> extends C9505aq.AbstractBinderC9507b<Status> {

        /* renamed from: a */
        private WeakReference<Map<T, BinderC9531as<T>>> f30150a;

        /* renamed from: b */
        private WeakReference<T> f30151b;

        BinderC9626b(Map<T, BinderC9531as<T>> map, T t, ahl.AbstractC6344b<Status> abstractC6344b) {
            super(abstractC6344b);
            this.f30150a = new WeakReference<>(map);
            this.f30151b = new WeakReference<>(t);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7646a(Status status) {
            Map<T, BinderC9531as<T>> map = this.f30150a.get();
            T t = this.f30151b.get();
            if (status.mo7645a().m24015i() == 4002 && map != null && t != null) {
                synchronized (map) {
                    BinderC9531as<T> remove = map.remove(t);
                    if (remove != null) {
                        remove.m7940a();
                    }
                }
            }
            a((BinderC9626b<T>) status);
        }
    }

    /* renamed from: a */
    public void m7649a(IBinder iBinder) {
        synchronized (this.f30147a) {
            AbstractC9621y m7698a = AbstractC9621y.AbstractBinderC9622a.m7698a(iBinder);
            C9505aq.BinderC9520o binderC9520o = new C9505aq.BinderC9520o();
            for (Map.Entry<T, BinderC9531as<T>> entry : this.f30147a.entrySet()) {
                BinderC9531as<T> value = entry.getValue();
                try {
                    m7698a.mo7689a(binderC9520o, new AddListenerRequest(value));
                    if (Log.isLoggable("WearableClient", 2)) {
                        String valueOf = String.valueOf(entry.getKey());
                        String valueOf2 = String.valueOf(value);
                        Log.d("WearableClient", new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length()).append("onPostInitHandler: added: ").append(valueOf).append("/").append(valueOf2).toString());
                    }
                } catch (RemoteException e) {
                    String valueOf3 = String.valueOf(entry.getKey());
                    String valueOf4 = String.valueOf(value);
                    Log.d("WearableClient", new StringBuilder(String.valueOf(valueOf3).length() + 32 + String.valueOf(valueOf4).length()).append("onPostInitHandler: Didn't add: ").append(valueOf3).append("/").append(valueOf4).toString());
                }
            }
        }
    }

    /* renamed from: a */
    public void m7648a(C9527ar c9527ar, ahl.AbstractC6344b<Status> abstractC6344b, T t) {
        synchronized (this.f30147a) {
            BinderC9531as<T> remove = this.f30147a.remove(t);
            if (remove == null) {
                abstractC6344b.mo7413a(new Status(4002));
                return;
            }
            remove.m7940a();
            ((AbstractC9621y) c9527ar.G()).mo7687a(new BinderC9626b(this.f30147a, t, abstractC6344b), new RemoveListenerRequest(remove));
        }
    }

    /* renamed from: a */
    public void m7647a(C9527ar c9527ar, ahl.AbstractC6344b<Status> abstractC6344b, T t, BinderC9531as<T> binderC9531as) {
        synchronized (this.f30147a) {
            if (this.f30147a.get(t) != null) {
                abstractC6344b.mo7413a(new Status(4001));
                return;
            }
            this.f30147a.put(t, binderC9531as);
            try {
                ((AbstractC9621y) c9527ar.G()).mo7689a(new BinderC9625a(this.f30147a, t, abstractC6344b), new AddListenerRequest(binderC9531as));
            } catch (RemoteException e) {
                this.f30147a.remove(t);
                throw e;
            }
        }
    }
}
