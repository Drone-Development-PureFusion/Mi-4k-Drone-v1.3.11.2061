package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.CallSuper;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes.dex */
public abstract class Task implements Parcelable {

    /* renamed from: c */
    public static final int f20508c = 0;

    /* renamed from: d */
    public static final int f20509d = 1;

    /* renamed from: e */
    public static final int f20510e = 2;

    /* renamed from: f */
    public static final int f20511f = 10240;

    /* renamed from: g */
    protected static final long f20512g = -1;

    /* renamed from: a */
    private final String f20513a;

    /* renamed from: b */
    private final String f20514b;

    /* renamed from: h */
    private final boolean f20515h;

    /* renamed from: i */
    private final boolean f20516i;

    /* renamed from: j */
    private final int f20517j;

    /* renamed from: k */
    private final boolean f20518k;

    /* renamed from: l */
    private final C6075g f20519l;

    /* renamed from: m */
    private final Bundle f20520m;

    /* renamed from: com.google.android.gms.gcm.Task$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6064a {

        /* renamed from: a */
        protected int f20521a;

        /* renamed from: b */
        protected String f20522b;

        /* renamed from: c */
        protected String f20523c;

        /* renamed from: d */
        protected boolean f20524d;

        /* renamed from: e */
        protected boolean f20525e;

        /* renamed from: f */
        protected boolean f20526f;

        /* renamed from: g */
        protected C6075g f20527g = C6075g.f20561a;

        /* renamed from: h */
        protected Bundle f20528h;

        /* JADX INFO: Access modifiers changed from: protected */
        @CallSuper
        /* renamed from: a */
        public void mo18875a() {
            C4588d.m23618b(this.f20522b != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
            C6065a.m18861a(this.f20523c);
            Task.m18885a(this.f20527g);
            if (this.f20525e) {
                Task.m18883b(this.f20528h);
            }
        }

        /* renamed from: b */
        public abstract AbstractC6064a mo18874b(int i);

        /* renamed from: b */
        public abstract AbstractC6064a mo18873b(Bundle bundle);

        /* renamed from: b */
        public abstract AbstractC6064a mo18872b(Class<? extends GcmTaskService> cls);

        /* renamed from: b */
        public abstract AbstractC6064a mo18871b(String str);

        /* renamed from: c */
        public abstract Task mo18870c();

        /* renamed from: d */
        public abstract AbstractC6064a mo18869d(boolean z);

        /* renamed from: e */
        public abstract AbstractC6064a mo18868e(boolean z);

        /* renamed from: f */
        public abstract AbstractC6064a mo18867f(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public Task(Parcel parcel) {
        boolean z = true;
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.f20513a = parcel.readString();
        this.f20514b = parcel.readString();
        this.f20515h = parcel.readInt() == 1;
        this.f20516i = parcel.readInt() != 1 ? false : z;
        this.f20517j = 2;
        this.f20518k = false;
        this.f20519l = C6075g.f20561a;
        this.f20520m = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task(AbstractC6064a abstractC6064a) {
        this.f20513a = abstractC6064a.f20522b;
        this.f20514b = abstractC6064a.f20523c;
        this.f20515h = abstractC6064a.f20524d;
        this.f20516i = abstractC6064a.f20525e;
        this.f20517j = abstractC6064a.f20521a;
        this.f20518k = abstractC6064a.f20526f;
        this.f20520m = abstractC6064a.f20528h;
        this.f20519l = abstractC6064a.f20527g != null ? abstractC6064a.f20527g : C6075g.f20561a;
    }

    /* renamed from: a */
    public static void m18885a(C6075g c6075g) {
        if (c6075g != null) {
            int m18813a = c6075g.m18813a();
            if (m18813a != 1 && m18813a != 0) {
                throw new IllegalArgumentException(new StringBuilder(45).append("Must provide a valid RetryPolicy: ").append(m18813a).toString());
            }
            int m18811b = c6075g.m18811b();
            int m18810c = c6075g.m18810c();
            if (m18813a == 0 && m18811b < 0) {
                throw new IllegalArgumentException(new StringBuilder(52).append("InitialBackoffSeconds can't be negative: ").append(m18811b).toString());
            }
            if (m18813a == 1 && m18811b < 10) {
                throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
            }
            if (m18810c >= m18811b) {
                return;
            }
            throw new IllegalArgumentException(new StringBuilder(77).append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ").append(c6075g.m18810c()).toString());
        }
    }

    /* renamed from: a */
    private static boolean m18884a(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean);
    }

    /* renamed from: b */
    public static void m18883b(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            if (dataSize > 10240) {
                obtain.recycle();
                String valueOf = String.valueOf("Extras exceeding maximum size(10240 bytes): ");
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(dataSize).toString());
            }
            obtain.recycle();
            for (String str : bundle.keySet()) {
                if (!m18884a(bundle.get(str))) {
                    throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean. ");
                }
            }
        }
    }

    /* renamed from: a */
    public void mo18886a(Bundle bundle) {
        bundle.putString("tag", this.f20514b);
        bundle.putBoolean("update_current", this.f20515h);
        bundle.putBoolean("persisted", this.f20516i);
        bundle.putString("service", this.f20513a);
        bundle.putInt("requiredNetwork", this.f20517j);
        bundle.putBoolean("requiresCharging", this.f20518k);
        bundle.putBundle("retryStrategy", this.f20519l.m18812a(new Bundle()));
        bundle.putBundle("extras", this.f20520m);
    }

    /* renamed from: c */
    public String m18882c() {
        return this.f20513a;
    }

    /* renamed from: d */
    public String m18881d() {
        return this.f20514b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean m18880e() {
        return this.f20515h;
    }

    /* renamed from: f */
    public boolean m18879f() {
        return this.f20516i;
    }

    /* renamed from: g */
    public int m18878g() {
        return this.f20517j;
    }

    /* renamed from: h */
    public boolean m18877h() {
        return this.f20518k;
    }

    /* renamed from: i */
    public Bundle m18876i() {
        return this.f20520m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.f20513a);
        parcel.writeString(this.f20514b);
        parcel.writeInt(this.f20515h ? 1 : 0);
        if (!this.f20516i) {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }
}
