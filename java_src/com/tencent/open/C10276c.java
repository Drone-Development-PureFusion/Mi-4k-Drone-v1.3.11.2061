package com.tencent.open;

import android.content.Context;
import android.location.Location;
import com.tencent.map.p260a.p261a.C10151a;
/* renamed from: com.tencent.open.c */
/* loaded from: classes2.dex */
public class C10276c {

    /* renamed from: a */
    private C10282d f31964a;

    /* renamed from: com.tencent.open.c$a */
    /* loaded from: classes2.dex */
    public interface AbstractC10277a {
        void onLocationUpdate(Location location);
    }

    /* renamed from: a */
    public void m5617a(Context context, AbstractC10277a abstractC10277a) {
        this.f31964a = new C10282d(abstractC10277a);
        C10151a.m6052a().m6051a(context, this.f31964a);
    }

    /* renamed from: a */
    public boolean m5618a() {
        return C10151a.m6052a().m6050a("OpenSdk", "WQMPF-XMH66-ISQXP-OIGMM-BNL7M");
    }

    /* renamed from: b */
    public void m5616b() {
        C10151a.m6052a().m6049b();
        this.f31964a = null;
    }
}
