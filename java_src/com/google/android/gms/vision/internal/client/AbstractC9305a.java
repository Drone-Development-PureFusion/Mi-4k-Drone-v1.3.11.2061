package com.google.android.gms.vision.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.akb;
/* renamed from: com.google.android.gms.vision.internal.client.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9305a<T> {

    /* renamed from: a */
    private final Context f29363a;

    /* renamed from: c */
    private final String f29365c;

    /* renamed from: e */
    private T f29367e;

    /* renamed from: b */
    private final Object f29364b = new Object();

    /* renamed from: d */
    private boolean f29366d = false;

    public AbstractC9305a(Context context, String str) {
        this.f29363a = context;
        this.f29365c = str;
    }

    /* renamed from: a */
    protected abstract void mo8615a();

    /* renamed from: b */
    protected abstract T mo8612b(akb akbVar, Context context);

    /* renamed from: b */
    public boolean m8666b() {
        return m8664d() != null;
    }

    /* renamed from: c */
    public void m8665c() {
        synchronized (this.f29364b) {
            if (this.f29367e == null) {
                return;
            }
            try {
                mo8615a();
            } catch (RemoteException e) {
                Log.e(this.f29365c, "Could not finalize native handle", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public T m8664d() {
        T t;
        synchronized (this.f29364b) {
            if (this.f29367e != null) {
                t = this.f29367e;
            } else {
                try {
                    this.f29367e = mo8612b(akb.m17066a(this.f29363a, akb.f22112d, "com.google.android.gms.vision.dynamite"), this.f29363a);
                } catch (RemoteException | akb.C6444a e) {
                    Log.e(this.f29365c, "Error creating remote native handle", e);
                }
                if (!this.f29366d && this.f29367e == null) {
                    Log.w(this.f29365c, "Native handle not yet available. Reverting to no-op handle.");
                    this.f29366d = true;
                } else if (this.f29366d && this.f29367e != null) {
                    Log.w(this.f29365c, "Native handle is now available.");
                }
                t = this.f29367e;
            }
        }
        return t;
    }
}
