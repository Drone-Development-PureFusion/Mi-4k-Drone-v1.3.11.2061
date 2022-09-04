package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.android.AbstractC10397h;
import com.xiaomi.channel.commonutils.misc.C10410f;
import com.xiaomi.push.service.C10673k;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import com.xiaomi.xmpush.thrift.EnumC10821o;
import java.util.HashMap;
/* renamed from: com.xiaomi.mipush.sdk.aa */
/* loaded from: classes2.dex */
public class C10471aa extends C10410f.AbstractRunnableC10411a {

    /* renamed from: a */
    private Context f32555a;

    public C10471aa(Context context) {
        this.f32555a = context;
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10410f.AbstractRunnableC10411a
    /* renamed from: a */
    public int mo4276a() {
        return 13;
    }

    @Override // java.lang.Runnable
    public void run() {
        C10775ae c10775ae = new C10775ae(MiPushClient.generatePacketID(), false);
        C10469a m5034a = C10469a.m5034a(this.f32555a);
        c10775ae.m3695c(EnumC10821o.SyncMIID.f34418N);
        c10775ae.m3698b(m5034a.m5026c());
        c10775ae.m3693d(this.f32555a.getPackageName());
        HashMap hashMap = new HashMap();
        AbstractC10397h.m5298a(hashMap, Constants.EXTRA_KEY_MIID, C10673k.m4213a(this.f32555a).m4206c());
        c10775ae.f33732h = hashMap;
        C10494u.m4943a(this.f32555a).m4932a(c10775ae, EnumC10766a.Notification, true, null);
    }
}
