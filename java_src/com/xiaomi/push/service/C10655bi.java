package com.xiaomi.push.service;

import com.xiaomi.push.service.C10633av;
import com.xiaomi.push.service.C10636aw;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.bi */
/* loaded from: classes.dex */
public class C10655bi implements C10636aw.AbstractC10638b {

    /* renamed from: a */
    final /* synthetic */ XMPushService f33115a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10655bi(XMPushService xMPushService) {
        this.f33115a = xMPushService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m4281a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f33115a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    @Override // com.xiaomi.push.service.C10636aw.AbstractC10638b
    /* renamed from: a */
    public void mo4280a(ArrayList<C10633av.C10635b> arrayList) {
        this.f33115a.m4494a(new C10656bj(this, 4, arrayList));
    }

    @Override // com.xiaomi.push.service.C10636aw.AbstractC10638b
    /* renamed from: a */
    public boolean mo4283a(C10633av.C10635b c10635b) {
        return m4281a(this.f33115a.getPackageName()) != null;
    }
}
