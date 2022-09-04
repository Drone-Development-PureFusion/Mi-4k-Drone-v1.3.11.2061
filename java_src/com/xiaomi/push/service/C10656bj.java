package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.C10799aq;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.xiaomi.push.service.bj */
/* loaded from: classes2.dex */
class C10656bj extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ ArrayList f33116b;

    /* renamed from: c */
    final /* synthetic */ C10655bi f33117c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10656bj(C10655bi c10655bi, int i, ArrayList arrayList) {
        super(i);
        this.f33117c = c10655bi;
        this.f33116b = arrayList;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        String m4281a;
        String packageName = this.f33117c.f33115a.getPackageName();
        m4281a = this.f33117c.m4281a(packageName);
        ArrayList<C10775ae> m4320a = C10633av.m4320a(this.f33116b, packageName, m4281a);
        if (m4320a == null) {
            AbstractC10404b.m5264d("Get a null XmPushActionNotification when TinyDataHelper.transToTriftObj() in XMPushService.");
            return;
        }
        Iterator<C10775ae> it2 = m4320a.iterator();
        while (it2.hasNext()) {
            C10775ae next = it2.next();
            next.m3705a("uploadWay", "longXMPushService");
            this.f33117c.f33115a.m4478a(packageName, C10799aq.m3471a(C10601aa.m4435a(packageName, m4281a, next, EnumC10766a.Notification)), true);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "Send tiny data.";
    }
}
