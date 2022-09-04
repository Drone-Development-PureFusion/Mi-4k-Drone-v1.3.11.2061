package com.xiaomi.push.service.module;

import android.content.Context;
import android.text.TextUtils;
/* renamed from: com.xiaomi.push.service.module.c */
/* loaded from: classes2.dex */
public class C10679c {

    /* renamed from: a */
    private String f33180a;

    /* renamed from: b */
    private String f33181b;

    /* renamed from: c */
    private String f33182c;

    /* renamed from: d */
    private int f33183d;

    /* renamed from: e */
    private ClassLoader f33184e;

    /* renamed from: f */
    private Object f33185f;

    public C10679c(String str, String str2, ClassLoader classLoader, String str3, int i) {
        this.f33183d = 0;
        this.f33180a = str;
        this.f33181b = str2;
        this.f33184e = classLoader;
        this.f33183d = i;
        this.f33182c = str3;
        try {
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            this.f33185f = this.f33184e.loadClass(str3).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public ClassLoader m4155a() {
        return this.f33184e;
    }

    /* renamed from: a */
    public void m4154a(Context context) {
        if (this.f33185f != null) {
            try {
                this.f33184e.loadClass(this.f33182c).getMethod("onCreate", Context.class, String.class).invoke(this.f33185f, context, this.f33181b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
