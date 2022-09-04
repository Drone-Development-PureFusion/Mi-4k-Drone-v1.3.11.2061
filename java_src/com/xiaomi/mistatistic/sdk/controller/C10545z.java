package com.xiaomi.mistatistic.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.controller.z */
/* loaded from: classes2.dex */
public class C10545z implements AbstractC10524e {

    /* renamed from: a */
    final /* synthetic */ Activity f32700a;

    /* renamed from: b */
    final /* synthetic */ String f32701b;

    /* renamed from: c */
    final /* synthetic */ C10543x f32702c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10545z(C10543x c10543x, Activity activity, String str) {
        this.f32702c = c10543x;
        this.f32700a = activity;
        this.f32701b = str;
    }

    @Override // com.xiaomi.mistatistic.sdk.controller.AbstractC10524e
    /* renamed from: a */
    public void mo4784a() {
        String m4787a;
        long j;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        long m4811a = C10538s.m4811a(this.f32700a.getApplicationContext(), "session_begin", 0L);
        long m4811a2 = C10538s.m4811a(this.f32700a.getApplicationContext(), "last_deactivate", 0L);
        String m4810a = C10538s.m4810a(this.f32700a.getApplicationContext(), "pv_path", "");
        if (m4811a <= 0) {
            C10538s.m4808b(this.f32700a.getApplicationContext(), "session_begin", currentTimeMillis);
        } else if (m4811a2 <= 0) {
            C10538s.m4808b(this.f32700a.getApplicationContext(), "session_begin", currentTimeMillis);
            if (!TextUtils.isEmpty(m4810a)) {
                this.f32702c.m4791a((Context) this.f32700a, m4810a);
                m4810a = "";
            }
        }
        if (m4811a2 > 0) {
            j = C10543x.f32697c;
            if (currentTimeMillis - m4811a2 > j) {
                this.f32702c.m4792a(this.f32700a, m4811a, m4811a2);
                if (!TextUtils.isEmpty(m4810a)) {
                    this.f32702c.m4791a((Context) this.f32700a, m4810a);
                    str = "";
                } else {
                    str = m4810a;
                }
                C10538s.m4808b(this.f32700a.getApplicationContext(), "session_begin", currentTimeMillis);
                m4810a = str;
            }
        }
        String name = TextUtils.isEmpty(this.f32701b) ? this.f32700a.getClass().getName() : this.f32701b;
        String packageName = this.f32700a.getPackageName();
        if (name.startsWith(packageName)) {
            name = name.replace(packageName, "");
        }
        if (!m4810a.endsWith(name)) {
            m4787a = this.f32702c.m4787a(m4810a, name);
            C10538s.m4807b(this.f32700a.getApplicationContext(), "pv_path", m4787a);
        }
    }
}
