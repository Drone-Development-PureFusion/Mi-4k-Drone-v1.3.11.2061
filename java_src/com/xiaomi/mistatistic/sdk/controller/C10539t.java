package com.xiaomi.mistatistic.sdk.controller;

import com.xiaomi.mistatistic.sdk.controller.p270a.C10510b;
import com.xiaomi.mistatistic.sdk.controller.p270a.C10512d;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.t */
/* loaded from: classes2.dex */
public class C10539t {

    /* renamed from: b */
    private static boolean f32691b = false;

    /* renamed from: a */
    private long f32692a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4802a(String str) {
        C10521b.m4854b().m4856a(new C10512d(str, new C10541v(this)));
    }

    /* renamed from: b */
    public static boolean m4800b() {
        return f32691b;
    }

    /* renamed from: c */
    private void m4798c() {
        C10521b.m4859a().m4856a(new C10510b(C10515ab.m4869a().m4860e(), new C10540u(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m4797d() {
        C10521b.m4859a().m4856a(new C10542w(this));
    }

    /* renamed from: a */
    public void m4806a() {
        f32691b = true;
        m4798c();
        C10515ab.m4869a().m4862c();
    }
}
