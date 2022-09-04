package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.C8610b;
import com.google.android.gms.maps.model.C8618j;
import com.google.android.gms.maps.p247a.AbstractC8490x;
import com.google.android.gms.maps.p247a.C8486v;
/* renamed from: com.google.android.gms.maps.e */
/* loaded from: classes2.dex */
public final class C8553e {

    /* renamed from: a */
    private static boolean f27418a = false;

    private C8553e() {
    }

    /* renamed from: a */
    public static synchronized int m11488a(Context context) {
        int i = 0;
        synchronized (C8553e.class) {
            C4588d.m23626a(context, "Context is null");
            if (!f27418a) {
                try {
                    m11487a(C8486v.m11645a(context));
                    f27418a = true;
                } catch (C4516c e) {
                    i = e.f16879a;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m11487a(AbstractC8490x abstractC8490x) {
        try {
            C8499b.m11622a(abstractC8490x.mo11636a());
            C8610b.m11084a(abstractC8490x.mo11631b());
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
