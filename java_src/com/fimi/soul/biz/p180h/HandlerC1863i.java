package com.fimi.soul.biz.p180h;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import com.fimi.soul.module.setting.C2918f;
import com.fimi.soul.module.setting.FlyLogsActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* renamed from: com.fimi.soul.biz.h.i */
/* loaded from: classes.dex */
public class HandlerC1863i extends Handler {

    /* renamed from: a */
    private WeakReference<Activity> f5065a;

    public HandlerC1863i(Activity activity) {
        this.f5065a = new WeakReference<>(activity);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ArrayList<C2918f> m30150b;
        super.handleMessage(message);
        Activity activity = this.f5065a.get();
        if (activity == null || !(activity instanceof FlyLogsActivity)) {
            return;
        }
        FlyLogsActivity flyLogsActivity = (FlyLogsActivity) activity;
        if (message.what != 10 || (m30150b = flyLogsActivity.m30150b()) == null) {
            return;
        }
        ArrayList<C2918f> m30147c = flyLogsActivity.m30147c();
        m30147c.addAll((ArrayList) m30150b.clone());
        flyLogsActivity.m30155a().m29986a(m30147c);
        m30150b.clear();
    }
}
