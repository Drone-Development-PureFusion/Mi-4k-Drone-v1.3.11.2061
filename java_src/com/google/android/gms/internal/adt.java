package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC3938n;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class adt extends AbstractC3938n<adt> {

    /* renamed from: a */
    public int f21299a;

    /* renamed from: b */
    public int f21300b;

    /* renamed from: c */
    public int f21301c;

    /* renamed from: d */
    public int f21302d;

    /* renamed from: e */
    public int f21303e;

    /* renamed from: f */
    private String f21304f;

    /* renamed from: a */
    public int m17994a() {
        return this.f21299a;
    }

    /* renamed from: a */
    public void m17993a(int i) {
        this.f21299a = i;
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(adt adtVar) {
        if (this.f21299a != 0) {
            adtVar.m17993a(this.f21299a);
        }
        if (this.f21300b != 0) {
            adtVar.m17989b(this.f21300b);
        }
        if (this.f21301c != 0) {
            adtVar.m17987c(this.f21301c);
        }
        if (this.f21302d != 0) {
            adtVar.m17985d(this.f21302d);
        }
        if (this.f21303e != 0) {
            adtVar.m17983e(this.f21303e);
        }
        if (!TextUtils.isEmpty(this.f21304f)) {
            adtVar.m17991a(this.f21304f);
        }
    }

    /* renamed from: a */
    public void m17991a(String str) {
        this.f21304f = str;
    }

    /* renamed from: b */
    public int m17990b() {
        return this.f21300b;
    }

    /* renamed from: b */
    public void m17989b(int i) {
        this.f21300b = i;
    }

    /* renamed from: c */
    public int m17988c() {
        return this.f21301c;
    }

    /* renamed from: c */
    public void m17987c(int i) {
        this.f21301c = i;
    }

    /* renamed from: d */
    public int m17986d() {
        return this.f21302d;
    }

    /* renamed from: d */
    public void m17985d(int i) {
        this.f21302d = i;
    }

    /* renamed from: e */
    public int m17984e() {
        return this.f21303e;
    }

    /* renamed from: e */
    public void m17983e(int i) {
        this.f21303e = i;
    }

    /* renamed from: f */
    public String m17982f() {
        return this.f21304f;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.f21304f);
        hashMap.put("screenColors", Integer.valueOf(this.f21299a));
        hashMap.put("screenWidth", Integer.valueOf(this.f21300b));
        hashMap.put("screenHeight", Integer.valueOf(this.f21301c));
        hashMap.put("viewportWidth", Integer.valueOf(this.f21302d));
        hashMap.put("viewportHeight", Integer.valueOf(this.f21303e));
        return a((Object) hashMap);
    }
}
