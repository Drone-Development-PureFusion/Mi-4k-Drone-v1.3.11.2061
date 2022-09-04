package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.push.service.C10625ao;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mipush.sdk.w */
/* loaded from: classes2.dex */
public class C10497w extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C10494u f32608a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10497w(C10494u c10494u, Handler handler) {
        super(handler);
        this.f32608a = c10494u;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Context context;
        Integer num;
        Context context2;
        Context context3;
        C10494u c10494u = this.f32608a;
        context = this.f32608a.f32599c;
        c10494u.f32603h = Integer.valueOf(C10625ao.m4356a(context).m4355b());
        num = this.f32608a.f32603h;
        if (num.intValue() != 0) {
            context2 = this.f32608a.f32599c;
            context2.getContentResolver().unregisterContentObserver(this);
            context3 = this.f32608a.f32599c;
            if (!C10423d.m5213d(context3)) {
                return;
            }
            this.f32608a.m4922d();
        }
    }
}
