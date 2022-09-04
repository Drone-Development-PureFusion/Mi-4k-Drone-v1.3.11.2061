package com.fimi.p155h;

import java.util.HashMap;
import java.util.Map;
/* renamed from: com.fimi.h.d */
/* loaded from: classes.dex */
public class C1567d {

    /* renamed from: a */
    private static C1567d f3864a = new C1567d();

    /* renamed from: b */
    private Map<Integer, C1565b> f3865b = new HashMap();

    /* renamed from: a */
    public static C1567d m35115a() {
        return f3864a;
    }

    /* renamed from: a */
    public C1565b m35114a(int i) {
        return this.f3865b.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m35113a(C1565b c1565b) {
        this.f3865b.put(Integer.valueOf(c1565b.m35140a()), c1565b);
    }

    /* renamed from: b */
    public void m35112b() {
        this.f3865b.clear();
    }
}
