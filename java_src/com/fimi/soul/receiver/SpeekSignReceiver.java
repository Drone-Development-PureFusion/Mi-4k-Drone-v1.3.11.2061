package com.fimi.soul.receiver;

import android.content.Context;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p183k.C1903e;
import com.fimi.soul.receiver.NetworkStateReceiver;
import com.fimi.soul.service.QueryDynamicFlyZoneSetvice;
/* loaded from: classes.dex */
public class SpeekSignReceiver extends NetworkStateReceiver {
    @Override // com.fimi.soul.receiver.NetworkStateReceiver
    /* renamed from: a */
    public void mo29420a(NetworkStateReceiver.EnumC3033a enumC3033a, final Context context) {
        if (enumC3033a == NetworkStateReceiver.EnumC3033a.Wifi || enumC3033a == NetworkStateReceiver.EnumC3033a.Mobile) {
            C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.receiver.SpeekSignReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    C1648b m34869a = C1648b.m34869a(context);
                    if (!m34869a.m34858d()) {
                        m34869a.m34870a();
                    }
                }
            });
            C1903e.m33631a().m33629a(C1903e.EnumC1904a.IDEL);
            QueryDynamicFlyZoneSetvice.m29455a(context);
        }
    }
}
