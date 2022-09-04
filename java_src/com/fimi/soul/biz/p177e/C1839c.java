package com.fimi.soul.biz.p177e;

import com.fimi.soul.base.LoadKey;
/* renamed from: com.fimi.soul.biz.e.c */
/* loaded from: classes.dex */
public class C1839c {

    /* renamed from: a */
    private String f5004a;

    /* renamed from: com.fimi.soul.biz.e.c$a */
    /* loaded from: classes.dex */
    public static class C1841a {

        /* renamed from: a */
        private static C1839c f5005a = new C1839c();
    }

    private C1839c() {
        this.f5004a = LoadKey.getKeyToken();
    }

    /* renamed from: a */
    public static C1839c m33944a() {
        return C1841a.f5005a;
    }

    /* renamed from: b */
    public String m33943b() {
        return this.f5004a;
    }
}
