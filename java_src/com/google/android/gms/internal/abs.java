package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.C3779u;
@aaa
/* loaded from: classes.dex */
public class abs extends Handler {
    public abs(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            C3779u.m26886i().m18451a(e, "AdMobHandler.handleMessage");
        }
    }
}
