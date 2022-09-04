package com.xiaomi.mistatistic.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.data.C10552f;
import com.xiaomi.mistatistic.sdk.data.C10553g;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0437d;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.x */
/* loaded from: classes2.dex */
public class C10543x {

    /* renamed from: a */
    private static C10543x f32696a;

    /* renamed from: c */
    private static long f32697c = NotificationOptions.f16268b;

    /* renamed from: b */
    private Handler f32698b = new HandlerC10544y(this, Looper.getMainLooper());

    private C10543x() {
    }

    /* renamed from: a */
    public static C10543x m4794a() {
        if (f32696a == null) {
            f32696a = new C10543x();
        }
        return f32696a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m4787a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4792a(Context context, long j, long j2) {
        String m4816b = AbstractC10536q.m4816b(context.getApplicationContext());
        if (TextUtils.isEmpty(m4816b)) {
            m4816b = AbstractC0437d.f576k;
        }
        AbstractC10532m.m4825a(new C10553g(j, j2, m4816b));
        C10538s.m4808b(context.getApplicationContext(), "session_begin", 0L);
        C10538s.m4808b(AbstractC10508a.m4880a(), "last_deactivate", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4791a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC10532m.m4825a(new C10552f(str));
            C10538s.m4807b(context, "pv_path", "");
        }
    }

    /* renamed from: a */
    public void m4793a(Activity activity, String str) {
        this.f32698b.removeMessages(31415927);
        C10521b.m4859a().m4856a(new C10545z(this, activity, str));
    }

    /* renamed from: b */
    public void m4786b() {
        C10521b.m4859a().m4856a(new C10514aa(this));
        this.f32698b.sendEmptyMessageDelayed(31415927, f32697c);
    }
}
