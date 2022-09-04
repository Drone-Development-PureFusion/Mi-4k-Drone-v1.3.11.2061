package com.google.android.gms.internal;

import android.support.p001v4.util.SimpleArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4508s;
import com.google.android.gms.common.api.C4509t;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public final class ahk extends ahn<C4509t> {

    /* renamed from: a */
    private int f21736a;

    /* renamed from: b */
    private boolean f21737b;

    /* renamed from: a */
    private void m17482a(ConnectionResult connectionResult) {
        SimpleArrayMap simpleArrayMap = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < simpleArrayMap.size()) {
                m17480a((ahh) simpleArrayMap.keyAt(i2), connectionResult);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ahn
    /* renamed from: a */
    public C4509t mo7807b(Status status) {
        Object obj = null;
        synchronized (obj) {
            try {
                m17482a(new ConnectionResult(8));
                SimpleArrayMap simpleArrayMap = null;
                C4509t c4508s = simpleArrayMap.size() == 1 ? new C4508s(status, null) : new C4509t(status, null);
                return c4508s;
            } finally {
            }
        }
    }

    /* renamed from: a */
    public void m17480a(ahh<?> ahhVar, ConnectionResult connectionResult) {
        Object obj = null;
        synchronized (obj) {
            SimpleArrayMap simpleArrayMap = null;
            try {
                simpleArrayMap.put(ahhVar, connectionResult);
                this.f21736a--;
                if (!connectionResult.m24047b()) {
                    this.f21737b = true;
                }
                if (this.f21736a == 0) {
                    Status status = this.f21737b ? new Status(13) : Status.f16786a;
                    SimpleArrayMap simpleArrayMap2 = null;
                    b((ahk) (simpleArrayMap2.size() == 1 ? new C4508s(status, null) : new C4509t(status, null)));
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public Set<ahh<?>> m17479b() {
        Map map = null;
        return map.keySet();
    }
}
