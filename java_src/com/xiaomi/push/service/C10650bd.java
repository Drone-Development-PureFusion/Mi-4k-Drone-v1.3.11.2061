package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.protobuf.C10570b;
import com.xiaomi.smack.AbstractC10722e;
import com.xiaomi.smack.C10718b;
import java.util.Map;
/* renamed from: com.xiaomi.push.service.bd */
/* loaded from: classes.dex */
class C10650bd extends C10718b {

    /* renamed from: a */
    final /* synthetic */ XMPushService f33107a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10650bd(XMPushService xMPushService, Map map, int i, String str, AbstractC10722e abstractC10722e) {
        super(map, i, str, abstractC10722e);
        this.f33107a = xMPushService;
    }

    @Override // com.xiaomi.smack.C10718b
    /* renamed from: a */
    public byte[] mo3964a() {
        try {
            C10570b.C10572b c10572b = new C10570b.C10572b();
            c10572b.m4654a(C10630at.m4340a().m4332c());
            return c10572b.c();
        } catch (Exception e) {
            AbstractC10404b.m5269a("getOBBString err: " + e.toString());
            return null;
        }
    }
}
