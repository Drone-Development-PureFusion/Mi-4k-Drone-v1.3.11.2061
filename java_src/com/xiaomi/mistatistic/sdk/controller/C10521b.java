package com.xiaomi.mistatistic.sdk.controller;

import android.os.Handler;
import java.util.ArrayList;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.b */
/* loaded from: classes2.dex */
public class C10521b {

    /* renamed from: a */
    private static C10521b f32668a = null;

    /* renamed from: b */
    private static C10521b f32669b = null;

    /* renamed from: c */
    private volatile Handler f32670c;

    /* renamed from: d */
    private ArrayList f32671d = new ArrayList();

    private C10521b(String str) {
        new HandlerThreadC10525f(this, str).start();
    }

    /* renamed from: a */
    public static synchronized C10521b m4859a() {
        C10521b c10521b;
        synchronized (C10521b.class) {
            if (f32668a == null) {
                f32668a = new C10521b("local_job_dispatcher");
            }
            c10521b = f32668a;
        }
        return c10521b;
    }

    /* renamed from: b */
    public static synchronized C10521b m4854b() {
        C10521b c10521b;
        synchronized (C10521b.class) {
            if (f32669b == null) {
                f32669b = new C10521b("remote_job_dispatcher");
            }
            c10521b = f32669b;
        }
        return c10521b;
    }

    /* renamed from: a */
    public void m4856a(AbstractC10524e abstractC10524e) {
        synchronized (this.f32671d) {
            if (this.f32670c == null) {
                this.f32671d.add(abstractC10524e);
            } else {
                this.f32670c.post(new RunnableC10522c(this, abstractC10524e));
            }
        }
    }

    /* renamed from: a */
    public void m4855a(AbstractC10524e abstractC10524e, long j) {
        if (this.f32670c != null) {
            this.f32670c.postDelayed(new RunnableC10523d(this, abstractC10524e), j);
        }
    }
}
