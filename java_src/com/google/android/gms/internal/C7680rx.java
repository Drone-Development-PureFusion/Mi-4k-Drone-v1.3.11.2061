package com.google.android.gms.internal;

import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.rx */
/* loaded from: classes2.dex */
public class C7680rx extends AbstractC7162ik<Integer, Long> {

    /* renamed from: a */
    public Long f25501a;

    /* renamed from: b */
    public Long f25502b;

    /* renamed from: c */
    public Long f25503c;

    /* renamed from: d */
    public Long f25504d;

    /* renamed from: e */
    public Long f25505e;

    /* renamed from: f */
    public Long f25506f;

    /* renamed from: g */
    public Long f25507g;

    /* renamed from: h */
    public Long f25508h;

    /* renamed from: i */
    public Long f25509i;

    /* renamed from: j */
    public Long f25510j;

    /* renamed from: k */
    public Long f25511k;

    public C7680rx() {
    }

    public C7680rx(String str) {
        mo13698a(str);
    }

    @Override // com.google.android.gms.internal.AbstractC7162ik
    /* renamed from: a */
    protected HashMap<Integer, Long> mo13699a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f25501a);
        hashMap.put(1, this.f25502b);
        hashMap.put(2, this.f25503c);
        hashMap.put(3, this.f25504d);
        hashMap.put(4, this.f25505e);
        hashMap.put(5, this.f25506f);
        hashMap.put(6, this.f25507g);
        hashMap.put(7, this.f25508h);
        hashMap.put(8, this.f25509i);
        hashMap.put(9, this.f25510j);
        hashMap.put(10, this.f25511k);
        return hashMap;
    }

    @Override // com.google.android.gms.internal.AbstractC7162ik
    /* renamed from: a */
    protected void mo13698a(String str) {
        HashMap b = b(str);
        if (b != null) {
            this.f25501a = (Long) b.get(0);
            this.f25502b = (Long) b.get(1);
            this.f25503c = (Long) b.get(2);
            this.f25504d = (Long) b.get(3);
            this.f25505e = (Long) b.get(4);
            this.f25506f = (Long) b.get(5);
            this.f25507g = (Long) b.get(6);
            this.f25508h = (Long) b.get(7);
            this.f25509i = (Long) b.get(8);
            this.f25510j = (Long) b.get(9);
            this.f25511k = (Long) b.get(10);
        }
    }
}
