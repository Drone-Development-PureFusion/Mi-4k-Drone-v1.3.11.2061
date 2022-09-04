package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.xo */
/* loaded from: classes.dex */
public class C8002xo implements AbstractC7988xf {

    /* renamed from: a */
    private final AdRequestInfoParcel f26295a;

    /* renamed from: b */
    private final AbstractC8005xq f26296b;

    /* renamed from: c */
    private final Context f26297c;

    /* renamed from: e */
    private final C7990xh f26299e;

    /* renamed from: f */
    private final boolean f26300f;

    /* renamed from: g */
    private final long f26301g;

    /* renamed from: h */
    private final long f26302h;

    /* renamed from: i */
    private final C7801un f26303i;

    /* renamed from: j */
    private final boolean f26304j;

    /* renamed from: l */
    private C7993xk f26306l;

    /* renamed from: d */
    private final Object f26298d = new Object();

    /* renamed from: k */
    private boolean f26305k = false;

    /* renamed from: m */
    private List<C7996xl> f26307m = new ArrayList();

    public C8002xo(Context context, AdRequestInfoParcel adRequestInfoParcel, AbstractC8005xq abstractC8005xq, C7990xh c7990xh, boolean z, boolean z2, long j, long j2, C7801un c7801un) {
        this.f26297c = context;
        this.f26295a = adRequestInfoParcel;
        this.f26296b = abstractC8005xq;
        this.f26299e = c7990xh;
        this.f26300f = z;
        this.f26304j = z2;
        this.f26301g = j;
        this.f26302h = j2;
        this.f26303i = c7801un;
    }

    @Override // com.google.android.gms.internal.AbstractC7988xf
    /* renamed from: a */
    public C7996xl mo13059a(List<C7989xg> list) {
        abr.a("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        C7799ul m13439a = this.f26303i.m13439a();
        for (C7989xg c7989xg : list) {
            String valueOf = String.valueOf(c7989xg.f26217b);
            abr.c(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            for (String str : c7989xg.f26218c) {
                C7799ul m13439a2 = this.f26303i.m13439a();
                synchronized (this.f26298d) {
                    if (this.f26305k) {
                        return new C7996xl(-1);
                    }
                    this.f26306l = new C7993xk(this.f26297c, str, this.f26296b, this.f26299e, c7989xg, this.f26295a.f14487c, this.f26295a.f14488d, this.f26295a.f14495k, this.f26300f, this.f26304j, this.f26295a.f14510z, this.f26295a.f14498n);
                    final C7996xl m13097a = this.f26306l.m13097a(this.f26301g, this.f26302h);
                    this.f26307m.add(m13097a);
                    if (m13097a.f26271a == 0) {
                        abr.a("Adapter succeeded.");
                        this.f26303i.m13433a("mediation_network_succeed", str);
                        if (!arrayList.isEmpty()) {
                            this.f26303i.m13433a("mediation_networks_fail", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, arrayList));
                        }
                        this.f26303i.m13436a(m13439a2, "mls");
                        this.f26303i.m13436a(m13439a, "ttm");
                        return m13097a;
                    }
                    arrayList.add(str);
                    this.f26303i.m13436a(m13439a2, "mlf");
                    if (m13097a.f26273c != null) {
                        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.xo.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    m13097a.f26273c.mo12965c();
                                } catch (RemoteException e) {
                                    abr.d("Could not destroy mediation adapter.", e);
                                }
                            }
                        });
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f26303i.m13433a("mediation_networks_fail", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, arrayList));
        }
        return new C7996xl(1);
    }

    @Override // com.google.android.gms.internal.AbstractC7988xf
    /* renamed from: a */
    public void mo13060a() {
        synchronized (this.f26298d) {
            this.f26305k = true;
            if (this.f26306l != null) {
                this.f26306l.m13098a();
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7988xf
    /* renamed from: b */
    public List<C7996xl> mo13058b() {
        return this.f26307m;
    }
}
