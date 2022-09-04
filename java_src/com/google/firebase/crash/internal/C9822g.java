package com.google.firebase.crash.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.akb;
import com.google.firebase.crash.internal.AbstractC9813d;
import com.google.firebase.crash.internal.AbstractC9816e;
import com.google.firebase.crash.internal.AbstractC9819f;
/* renamed from: com.google.firebase.crash.internal.g */
/* loaded from: classes.dex */
public class C9822g {

    /* renamed from: b */
    private static C9822g f30638b;

    /* renamed from: a */
    private akb f30639a;

    /* renamed from: com.google.firebase.crash.internal.g$a */
    /* loaded from: classes.dex */
    public static class C9824a extends Exception {
        private C9824a(Throwable th) {
            super(th);
        }
    }

    private C9822g() {
    }

    /* renamed from: a */
    public static C9822g m6884a() {
        C9822g c9822g;
        synchronized (C9822g.class) {
            if (f30638b != null) {
                c9822g = f30638b;
            } else {
                f30638b = new C9822g();
                c9822g = f30638b;
            }
        }
        return c9822g;
    }

    /* renamed from: a */
    public void m6883a(Context context) {
        synchronized (C9822g.class) {
            if (this.f30639a != null) {
                return;
            }
            try {
                this.f30639a = akb.m17066a(context, akb.f22111c, "com.google.android.gms.crash");
            } catch (akb.C6444a e) {
                throw new C9824a(e);
            }
        }
    }

    /* renamed from: b */
    public AbstractC9813d m6882b() {
        C4588d.m23627a(this.f30639a);
        try {
            return AbstractC9813d.AbstractBinderC9814a.m6898a(this.f30639a.m17062a("com.google.firebase.crash.internal.api.FirebaseCrashApiImpl"));
        } catch (akb.C6444a e) {
            throw new C9824a(e);
        }
    }

    /* renamed from: c */
    public AbstractC9816e m6881c() {
        C4588d.m23627a(this.f30639a);
        try {
            return AbstractC9816e.AbstractBinderC9817a.m6892a(this.f30639a.m17062a("com.google.firebase.crash.internal.service.FirebaseCrashReceiverServiceImpl"));
        } catch (akb.C6444a e) {
            throw new C9824a(e);
        }
    }

    /* renamed from: d */
    public AbstractC9819f m6880d() {
        C4588d.m23627a(this.f30639a);
        try {
            return AbstractC9819f.AbstractBinderC9820a.m6888a(this.f30639a.m17062a("com.google.firebase.crash.internal.service.FirebaseCrashSenderServiceImpl"));
        } catch (akb.C6444a e) {
            throw new C9824a(e);
        }
    }
}
