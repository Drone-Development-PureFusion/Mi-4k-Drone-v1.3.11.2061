package com.xiaomi.push.service;

import android.util.Base64;
import com.xiaomi.channel.commonutils.android.C10399j;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10414h;
import com.xiaomi.channel.commonutils.network.AbstractC10422c;
import com.xiaomi.network.HttpUtils;
import com.xiaomi.push.protobuf.C10568a;
import com.xiaomi.push.service.C10630at;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.au */
/* loaded from: classes2.dex */
public class C10632au extends C10414h.AbstractC10416b {

    /* renamed from: a */
    boolean f33076a = false;

    /* renamed from: b */
    final /* synthetic */ C10630at f33077b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10632au(C10630at c10630at) {
        this.f33077b = c10630at;
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
    /* renamed from: b */
    public void mo3817b() {
        try {
            C10568a.C10569a m4701b = C10568a.C10569a.m4701b(Base64.decode(HttpUtils.m4745a(C10399j.m5295a(), "http://resolver.msg.xiaomi.net/psc/?t=a", (List<AbstractC10422c>) null), 10));
            if (m4701b == null) {
                return;
            }
            this.f33077b.f33074c = m4701b;
            this.f33076a = true;
            this.f33077b.m4325i();
        } catch (Exception e) {
            AbstractC10404b.m5269a("fetch config failure: " + e.getMessage());
        }
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
    /* renamed from: c */
    public void mo4323c() {
        List list;
        List list2;
        C10630at.AbstractC10631a[] abstractC10631aArr;
        C10568a.C10569a c10569a;
        this.f33077b.f33075d = null;
        if (this.f33076a) {
            synchronized (this.f33077b) {
                list = this.f33077b.f33073b;
                list2 = this.f33077b.f33073b;
                abstractC10631aArr = (C10630at.AbstractC10631a[]) list.toArray(new C10630at.AbstractC10631a[list2.size()]);
            }
            for (C10630at.AbstractC10631a abstractC10631a : abstractC10631aArr) {
                c10569a = this.f33077b.f33074c;
                abstractC10631a.mo4324a(c10569a);
            }
        }
    }
}
