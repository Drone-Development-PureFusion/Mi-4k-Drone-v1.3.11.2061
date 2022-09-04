package com.fimi.soul.biz.p183k;

import com.fimi.soul.entity.DynamicDYZ_Entity;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.fimi.soul.biz.k.h */
/* loaded from: classes.dex */
public class C1908h {

    /* renamed from: a */
    private static List<DynamicDYZ_Entity> f5268a;

    /* renamed from: b */
    private static List<DynamicDYZ_Entity> f5269b;

    /* renamed from: c */
    private static C1908h f5270c;

    private C1908h() {
        f5269b = new CopyOnWriteArrayList();
        f5268a = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public static C1908h m33616a() {
        if (f5270c == null) {
            synchronized (C1908h.class) {
                if (f5270c == null) {
                    f5270c = new C1908h();
                }
            }
        }
        return f5270c;
    }

    /* renamed from: a */
    public void m33615a(DynamicDYZ_Entity dynamicDYZ_Entity) {
        if (!f5268a.contains(dynamicDYZ_Entity)) {
            f5268a.add(dynamicDYZ_Entity);
        }
    }

    /* renamed from: a */
    public void m33614a(List<DynamicDYZ_Entity> list) {
        f5269b.clear();
        f5269b.addAll(list);
    }

    /* renamed from: b */
    public void m33613b() {
        if (f5268a != null) {
            f5268a.clear();
        }
    }

    /* renamed from: b */
    public void m33612b(DynamicDYZ_Entity dynamicDYZ_Entity) {
        if (f5268a.contains(dynamicDYZ_Entity)) {
            f5268a.remove(dynamicDYZ_Entity);
        }
    }

    /* renamed from: b */
    public void m33611b(List<DynamicDYZ_Entity> list) {
        m33606f();
        f5268a.addAll(list);
    }

    /* renamed from: c */
    public List<DynamicDYZ_Entity> m33610c() {
        return f5268a;
    }

    /* renamed from: c */
    public void m33609c(DynamicDYZ_Entity dynamicDYZ_Entity) {
        if (!f5269b.contains(dynamicDYZ_Entity)) {
            f5269b.add(dynamicDYZ_Entity);
        }
    }

    /* renamed from: d */
    public List<DynamicDYZ_Entity> m33608d() {
        return f5269b;
    }

    /* renamed from: e */
    public void m33607e() {
        if (f5269b != null) {
            f5269b.clear();
        }
    }

    /* renamed from: f */
    public void m33606f() {
        f5268a.clear();
    }
}
