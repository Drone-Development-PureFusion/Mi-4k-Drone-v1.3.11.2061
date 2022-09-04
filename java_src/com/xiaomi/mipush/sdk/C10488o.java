package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.misc.C10410f;
import com.xiaomi.push.service.C10612ah;
import com.xiaomi.push.service.C10613ai;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.C10799aq;
import com.xiaomi.xmpush.thrift.C10826r;
import com.xiaomi.xmpush.thrift.C10839y;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import com.xiaomi.xmpush.thrift.EnumC10807f;
import com.xiaomi.xmpush.thrift.EnumC10821o;
/* renamed from: com.xiaomi.mipush.sdk.o */
/* loaded from: classes2.dex */
public class C10488o extends C10410f.AbstractRunnableC10411a {

    /* renamed from: a */
    private Context f32585a;

    public C10488o(Context context) {
        this.f32585a = context;
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10410f.AbstractRunnableC10411a
    /* renamed from: a */
    public int mo4276a() {
        return 2;
    }

    @Override // java.lang.Runnable
    public void run() {
        C10612ah m4394a = C10612ah.m4394a(this.f32585a);
        C10839y c10839y = new C10839y();
        c10839y.m3179a(C10613ai.m4387a(m4394a, EnumC10807f.MISC_CONFIG));
        c10839y.m3175b(C10613ai.m4387a(m4394a, EnumC10807f.PLUGIN_CONFIG));
        C10775ae c10775ae = new C10775ae("-1", false);
        c10775ae.m3695c(EnumC10821o.DailyCheckClientConfig.f34418N);
        c10775ae.m3701a(C10799aq.m3471a(c10839y));
        C10494u.m4943a(this.f32585a).m4934a((C10494u) c10775ae, EnumC10766a.Notification, (C10826r) null);
    }
}
