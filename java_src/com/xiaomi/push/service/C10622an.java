package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.tencent.p263mm.sdk.platformtools.Util;
import com.xiaomi.channel.commonutils.android.C10399j;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.market.sdk.C10445j;
import com.xiaomi.network.Fallback;
import com.xiaomi.network.HostFilter;
import com.xiaomi.network.HostManager;
import com.xiaomi.network.HostManagerV2;
import com.xiaomi.push.protobuf.C10568a;
import com.xiaomi.push.protobuf.C10570b;
import com.xiaomi.push.service.C10630at;
import com.xiaomi.push.thrift.EnumC10704a;
import com.xiaomi.smack.AbstractC10716a;
import com.xiaomi.smack.util.C10749d;
import com.xiaomi.stats.C10761f;
import com.xiaomi.stats.C10764h;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.xiaomi.push.service.an */
/* loaded from: classes.dex */
public class C10622an extends C10630at.AbstractC10631a implements HostManager.HostManagerFactory {

    /* renamed from: a */
    private XMPushService f33052a;

    /* renamed from: b */
    private long f33053b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.service.an$a */
    /* loaded from: classes2.dex */
    public static class C10623a implements HostManager.HttpGet {
        C10623a() {
        }

        @Override // com.xiaomi.network.HostManager.HttpGet
        /* renamed from: a */
        public String mo4358a(String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("sdkver", String.valueOf(26));
            buildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            buildUpon.appendQueryParameter(C10445j.f32457ac, C10749d.m3838a(Build.MODEL + ":" + Build.VERSION.INCREMENTAL));
            buildUpon.appendQueryParameter("mi", String.valueOf(C10399j.m5291c()));
            String builder = buildUpon.toString();
            AbstractC10404b.m5265c("fetch bucket from : " + builder);
            URL url = new URL(builder);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String m5225a = C10423d.m5225a(C10399j.m5295a(), url);
                C10764h.m3777a(url.getHost() + ":" + port, (int) (System.currentTimeMillis() - currentTimeMillis), null);
                return m5225a;
            } catch (IOException e) {
                C10764h.m3777a(url.getHost() + ":" + port, -1, e);
                throw e;
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.an$b */
    /* loaded from: classes2.dex */
    static class C10624b extends HostManagerV2 {
        protected C10624b(Context context, HostFilter hostFilter, HostManager.HttpGet httpGet, String str) {
            super(context, hostFilter, httpGet, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.network.HostManagerV2, com.xiaomi.network.HostManager
        public String getRemoteFallbackJSON(ArrayList<String> arrayList, String str, String str2) {
            try {
                if (C10761f.m3796a().m3789c()) {
                    str2 = C10630at.m4329e();
                }
                return super.getRemoteFallbackJSON(arrayList, str, str2);
            } catch (IOException e) {
                C10764h.m3780a(0, EnumC10704a.GSLB_ERR.m4077a(), 1, null, C10423d.m5213d(this.sAppContext) ? 1 : 0);
                throw e;
            }
        }
    }

    C10622an(XMPushService xMPushService) {
        this.f33052a = xMPushService;
    }

    /* renamed from: a */
    public static void m4359a(XMPushService xMPushService) {
        C10622an c10622an = new C10622an(xMPushService);
        C10630at.m4340a().m4338a(c10622an);
        synchronized (HostManager.class) {
            HostManager.setHostManagerFactory(c10622an);
            HostManager.init(xMPushService, null, new C10623a(), "0", "push", "2.2");
        }
    }

    @Override // com.xiaomi.network.HostManager.HostManagerFactory
    /* renamed from: a */
    public HostManager mo4360a(Context context, HostFilter hostFilter, HostManager.HttpGet httpGet, String str) {
        return new C10624b(context, hostFilter, httpGet, str);
    }

    @Override // com.xiaomi.push.service.C10630at.AbstractC10631a
    /* renamed from: a */
    public void mo4324a(C10568a.C10569a c10569a) {
    }

    @Override // com.xiaomi.push.service.C10630at.AbstractC10631a
    /* renamed from: a */
    public void mo3784a(C10570b.C10572b c10572b) {
        Fallback fallbacksByHost;
        boolean z;
        if (!c10572b.m4647e() || !c10572b.m4648d() || System.currentTimeMillis() - this.f33053b <= Util.MILLSECONDS_OF_HOUR) {
            return;
        }
        AbstractC10404b.m5269a("fetch bucket :" + c10572b.m4648d());
        this.f33053b = System.currentTimeMillis();
        HostManager hostManager = HostManager.getInstance();
        hostManager.clear();
        hostManager.refreshFallbacks();
        AbstractC10716a m4453h = this.f33052a.m4453h();
        if (m4453h == null || (fallbacksByHost = hostManager.getFallbacksByHost(m4453h.m3979c().m3956e())) == null) {
            return;
        }
        ArrayList<String> m4759d = fallbacksByHost.m4759d();
        Iterator<String> it2 = m4759d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = true;
                break;
            } else if (it2.next().equals(m4453h.mo3931d())) {
                z = false;
                break;
            }
        }
        if (!z || m4759d.isEmpty()) {
            return;
        }
        AbstractC10404b.m5269a("bucket changed, force reconnect");
        this.f33052a.m4499a(0, (Exception) null);
        this.f33052a.m4477a(false);
    }
}
