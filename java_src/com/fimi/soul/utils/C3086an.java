package com.fimi.soul.utils;

import android.annotation.SuppressLint;
import java.util.LinkedList;
/* renamed from: com.fimi.soul.utils.an */
/* loaded from: classes.dex */
public class C3086an {

    /* renamed from: b */
    private int f11537b = 10;

    /* renamed from: a */
    private LinkedList f11536a = new LinkedList();

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public Object m29316a() {
        return this.f11536a.peekFirst();
    }

    /* renamed from: a */
    public void m29315a(int i) {
        this.f11537b = i;
    }

    /* renamed from: a */
    public void m29314a(Object obj) {
        if (this.f11537b <= 0) {
            this.f11536a.removeFirst();
        }
        this.f11536a.addLast(obj);
        this.f11537b--;
    }

    /* renamed from: a */
    public void m29313a(LinkedList linkedList) {
        this.f11536a = linkedList;
    }

    /* renamed from: b */
    public void m29312b() {
        this.f11536a.removeFirst();
    }

    /* renamed from: c */
    public int m29311c() {
        return this.f11536a.size();
    }

    /* renamed from: d */
    public LinkedList m29310d() {
        return this.f11536a;
    }

    /* renamed from: e */
    public int m29309e() {
        return this.f11537b;
    }
}
