package com.xiaomi.market.sdk;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.market.sdk.u */
/* loaded from: classes2.dex */
public class DialogInterface$OnClickListenerC10456u implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Context context2;
        C10452q c10452q;
        C10458w c10458w;
        C10458w c10458w2;
        C10452q c10452q2;
        Context context3;
        context = XiaomiUpdateAgent.mContext;
        if (C10454s.m5078l(context)) {
            c10458w2 = XiaomiUpdateAgent.f32389aK;
            if (c10458w2.f32513bj != 1) {
                StringBuilder sb = new StringBuilder("market://details?id=");
                c10452q2 = XiaomiUpdateAgent.f32390aL;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.append(c10452q2.packageName).toString()));
                intent.setClassName("com.xiaomi.market", "com.xiaomi.market.ui.AppDetailActivity");
                context3 = XiaomiUpdateAgent.mContext;
                context3.startActivity(intent);
                return;
            }
        }
        context2 = XiaomiUpdateAgent.mContext;
        C10448m m5094i = C10448m.m5094i(context2);
        c10452q = XiaomiUpdateAgent.f32390aL;
        c10458w = XiaomiUpdateAgent.f32389aK;
        m5094i.m5100a(c10452q, c10458w);
    }
}
