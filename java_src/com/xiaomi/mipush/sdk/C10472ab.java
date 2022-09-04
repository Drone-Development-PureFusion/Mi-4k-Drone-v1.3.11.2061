package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.push.service.C10633av;
import com.xiaomi.push.service.C10636aw;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.xiaomi.mipush.sdk.ab */
/* loaded from: classes2.dex */
public class C10472ab implements C10636aw.AbstractC10638b {

    /* renamed from: a */
    private Context f32556a;

    public C10472ab(Context context) {
        this.f32556a = context;
    }

    @Override // com.xiaomi.push.service.C10636aw.AbstractC10638b
    /* renamed from: a */
    public void mo4280a(ArrayList<C10633av.C10635b> arrayList) {
        if (arrayList == null) {
            AbstractC10404b.m5264d("[MiTinyDataClient]:requests is null, MiTinyDataClient upload by long connection failed.");
            return;
        }
        ArrayList<C10775ae> m4320a = C10633av.m4320a(arrayList, this.f32556a.getPackageName(), C10469a.m5034a(this.f32556a).m5026c());
        if (m4320a == null) {
            AbstractC10404b.m5264d("Get a null XmPushActionNotification when TinyDataHelper.transToTriftObj() in MiPushClient.");
            return;
        }
        Iterator<C10775ae> it2 = m4320a.iterator();
        while (it2.hasNext()) {
            C10775ae next = it2.next();
            next.m3705a("uploadWay", "longMiTinyClient");
            C10494u.m4943a(this.f32556a).m4932a(next, EnumC10766a.Notification, true, null);
        }
    }

    @Override // com.xiaomi.push.service.C10636aw.AbstractC10638b
    /* renamed from: a */
    public boolean mo4283a(C10633av.C10635b c10635b) {
        return C10423d.m5213d(this.f32556a);
    }
}
