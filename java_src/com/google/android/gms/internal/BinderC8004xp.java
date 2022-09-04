package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractC3414d;
import com.google.ads.mediation.AbstractC3419i;
import com.google.ads.mediation.AbstractC3422j;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.mediation.AbstractC3792b;
import com.google.android.gms.ads.mediation.AbstractC3816m;
import com.google.android.gms.ads.mediation.customevent.AbstractC3798a;
import com.google.android.gms.ads.mediation.customevent.C3801d;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.internal.AbstractC8005xq;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.xp */
/* loaded from: classes.dex */
public final class BinderC8004xp extends AbstractC8005xq.AbstractBinderC8006a {

    /* renamed from: a */
    private Map<Class<? extends AbstractC3816m>, AbstractC3816m> f26310a;

    /* renamed from: c */
    private <NETWORK_EXTRAS extends AbstractC3422j, SERVER_PARAMETERS extends AbstractC3419i> AbstractC8008xr m13056c(String str) {
        try {
            Class<?> cls = Class.forName(str, false, BinderC8004xp.class.getClassLoader());
            if (AbstractC3414d.class.isAssignableFrom(cls)) {
                AbstractC3414d abstractC3414d = (AbstractC3414d) cls.newInstance();
                return new BinderC8031yd(abstractC3414d, (AbstractC3422j) this.f26310a.get(abstractC3414d.mo27897b()));
            } else if (AbstractC3792b.class.isAssignableFrom(cls)) {
                return new BinderC8024xx((AbstractC3792b) cls.newInstance());
            } else {
                C3784b.m26840d(new StringBuilder(String.valueOf(str).length() + 64).append("Could not instantiate mediation adapter: ").append(str).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        } catch (Throwable th) {
            return m13055d(str);
        }
    }

    /* renamed from: d */
    private AbstractC8008xr m13055d(String str) {
        try {
            C3784b.m26846a("Reflection failed, retrying using direct instantiation");
        } catch (Throwable th) {
            C3784b.m26839d(new StringBuilder(String.valueOf(str).length() + 43).append("Could not instantiate mediation adapter: ").append(str).append(". ").toString(), th);
        }
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
            return new BinderC8024xx(new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
            return new BinderC8024xx(new AdUrlAdapter());
        }
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            return new BinderC8024xx(new CustomEventAdapter());
        }
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
            return new BinderC8031yd(customEventAdapter, (C3801d) this.f26310a.get(customEventAdapter.mo27897b()));
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.AbstractC8005xq
    /* renamed from: a */
    public AbstractC8008xr mo13053a(String str) {
        return m13056c(str);
    }

    /* renamed from: a */
    public void m13057a(Map<Class<? extends AbstractC3816m>, AbstractC3816m> map) {
        this.f26310a = map;
    }

    @Override // com.google.android.gms.internal.AbstractC8005xq
    /* renamed from: b */
    public boolean mo13052b(String str) {
        try {
            return AbstractC3798a.class.isAssignableFrom(Class.forName(str, false, BinderC8004xp.class.getClassLoader()));
        } catch (Throwable th) {
            C3784b.m26840d(new StringBuilder(String.valueOf(str).length() + 80).append("Could not load custom event implementation class: ").append(str).append(", assuming old implementation.").toString());
            return false;
        }
    }
}
