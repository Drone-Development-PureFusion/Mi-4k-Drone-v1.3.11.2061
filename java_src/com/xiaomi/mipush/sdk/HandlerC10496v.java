package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mipush.sdk.v */
/* loaded from: classes2.dex */
public class HandlerC10496v extends Handler {

    /* renamed from: a */
    final /* synthetic */ C10494u f32607a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC10496v(C10494u c10494u, Looper looper) {
        super(looper);
        this.f32607a = c10494u;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        String str = (String) message.obj;
        int i = message.arg1;
        synchronized (C10489p.class) {
            context = this.f32607a.f32599c;
            if (C10489p.m4970a(context).m4965e(str)) {
                context2 = this.f32607a.f32599c;
                if (C10489p.m4970a(context2).m4967c(str) < 10) {
                    if (1 == i) {
                        context6 = this.f32607a.f32599c;
                        if ("disable_syncing".equals(C10489p.m4970a(context6).m4971a())) {
                            this.f32607a.m4935a(str, true);
                            context5 = this.f32607a.f32599c;
                            C10489p.m4970a(context5).m4968b(str);
                        }
                    }
                    if (i == 0) {
                        context4 = this.f32607a.f32599c;
                        if ("enable_syncing".equals(C10489p.m4970a(context4).m4971a())) {
                            this.f32607a.m4935a(str, false);
                        }
                    }
                    context5 = this.f32607a.f32599c;
                    C10489p.m4970a(context5).m4968b(str);
                } else {
                    context3 = this.f32607a.f32599c;
                    C10489p.m4970a(context3).m4966d(str);
                }
            }
        }
    }
}
