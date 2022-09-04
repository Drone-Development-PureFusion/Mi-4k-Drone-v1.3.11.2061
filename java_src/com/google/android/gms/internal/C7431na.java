package com.google.android.gms.internal;

import android.app.Activity;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.na */
/* loaded from: classes2.dex */
public class C7431na {

    /* renamed from: a */
    private static final C7431na f24885a = new C7431na();

    /* renamed from: b */
    private final Map<Object, C7432a> f24886b = new HashMap();

    /* renamed from: c */
    private final Object f24887c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.na$a */
    /* loaded from: classes2.dex */
    public static class C7432a {
        @NonNull

        /* renamed from: a */
        private final Activity f24888a;
        @NonNull

        /* renamed from: b */
        private final Runnable f24889b;
        @NonNull

        /* renamed from: c */
        private final Object f24890c;

        public C7432a(@NonNull Activity activity, @NonNull Runnable runnable, @NonNull Object obj) {
            this.f24888a = activity;
            this.f24889b = runnable;
            this.f24890c = obj;
        }

        @NonNull
        /* renamed from: a */
        public Activity m14502a() {
            return this.f24888a;
        }

        @NonNull
        /* renamed from: b */
        public Runnable m14501b() {
            return this.f24889b;
        }

        @NonNull
        /* renamed from: c */
        public Object m14500c() {
            return this.f24890c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7432a)) {
                return false;
            }
            C7432a c7432a = (C7432a) obj;
            return c7432a.f24890c.equals(this.f24890c) && c7432a.f24889b == this.f24889b && c7432a.f24888a == this.f24888a;
        }

        public int hashCode() {
            return this.f24890c.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.na$b */
    /* loaded from: classes2.dex */
    public static class C7433b extends aij {

        /* renamed from: a */
        private final List<C7432a> f24891a = new ArrayList();

        private C7433b(aik aikVar) {
            super(aikVar);
            this.f21940d.mo12684a("StorageOnStopCallback", this);
        }

        /* renamed from: a */
        public static C7433b m14498a(Activity activity) {
            aik b = b(new aih(activity));
            C7433b c7433b = (C7433b) b.mo12683a("StorageOnStopCallback", C7433b.class);
            return c7433b == null ? new C7433b(b) : c7433b;
        }

        @Override // com.google.android.gms.internal.aij
        @MainThread
        /* renamed from: a */
        public void mo14499a() {
            ArrayList arrayList;
            synchronized (this.f24891a) {
                arrayList = new ArrayList(this.f24891a);
                this.f24891a.clear();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C7432a c7432a = (C7432a) it2.next();
                if (c7432a != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    c7432a.m14501b().run();
                    C7431na.m14505a().m14503a(c7432a.m14500c());
                }
            }
        }

        /* renamed from: a */
        public void m14497a(C7432a c7432a) {
            synchronized (this.f24891a) {
                this.f24891a.add(c7432a);
            }
        }

        /* renamed from: b */
        public void m14496b(C7432a c7432a) {
            synchronized (this.f24891a) {
                this.f24891a.remove(c7432a);
            }
        }
    }

    private C7431na() {
    }

    @NonNull
    /* renamed from: a */
    public static C7431na m14505a() {
        return f24885a;
    }

    /* renamed from: a */
    public void m14504a(@NonNull Activity activity, @NonNull Object obj, @NonNull Runnable runnable) {
        synchronized (this.f24887c) {
            C7432a c7432a = new C7432a(activity, runnable, obj);
            C7433b.m14498a(activity).m14497a(c7432a);
            this.f24886b.put(obj, c7432a);
        }
    }

    /* renamed from: a */
    public void m14503a(@NonNull Object obj) {
        synchronized (this.f24887c) {
            C7432a c7432a = this.f24886b.get(obj);
            if (c7432a != null) {
                C7433b.m14498a(c7432a.m14502a()).m14496b(c7432a);
            }
        }
    }
}
