package com.fimi.soul.utils;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import com.fimi.soul.base.C1756a;
/* renamed from: com.fimi.soul.utils.o */
/* loaded from: classes.dex */
public class RunnableC3131o implements Runnable {

    /* renamed from: a */
    private Handler f11674a;

    /* renamed from: b */
    private ProgressDialog f11675b;

    /* renamed from: c */
    private String f11676c;

    public RunnableC3131o(String str, Handler handler) {
        this.f11676c = str;
        this.f11674a = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        System.out.println("下载线程开启");
        new Message().what = C3080ah.m29333a(this.f11676c, C1756a.f4511D, C3129m.m29058i(), this.f11674a);
    }
}
