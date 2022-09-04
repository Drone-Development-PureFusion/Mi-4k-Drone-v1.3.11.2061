package com.fimi.soul.biz.p177e;

import com.fimi.soul.drone.p195d.p196a.C2196c;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.e.a */
/* loaded from: classes.dex */
public class C1834a {

    /* renamed from: a */
    public static C1834a f4985a;

    /* renamed from: b */
    private volatile HashMap<Integer, C2196c> f4986b = new HashMap<>();

    /* renamed from: a */
    public static C1834a m33964a() {
        if (f4985a == null) {
            synchronized (C1834a.class) {
                if (f4985a == null) {
                    f4985a = new C1834a();
                }
            }
        }
        return f4985a;
    }

    /* renamed from: a */
    public void m33963a(HashMap<Integer, C2196c> hashMap) {
        this.f4986b = hashMap;
    }

    /* renamed from: b */
    public HashMap<Integer, C2196c> m33962b() {
        return this.f4986b;
    }
}
