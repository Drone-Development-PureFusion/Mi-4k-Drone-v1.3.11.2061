package com.google.android.gms.internal;

import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.rv */
/* loaded from: classes2.dex */
public class C7676rv extends AbstractC7162ik<Integer, Long> {

    /* renamed from: a */
    public Long f25477a;

    /* renamed from: b */
    public Long f25478b;

    public C7676rv() {
    }

    public C7676rv(String str) {
        mo13698a(str);
    }

    @Override // com.google.android.gms.internal.AbstractC7162ik
    /* renamed from: a */
    protected HashMap<Integer, Long> mo13699a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f25477a);
        hashMap.put(1, this.f25478b);
        return hashMap;
    }

    @Override // com.google.android.gms.internal.AbstractC7162ik
    /* renamed from: a */
    protected void mo13698a(String str) {
        HashMap b = b(str);
        if (b != null) {
            this.f25477a = (Long) b.get(0);
            this.f25478b = (Long) b.get(1);
        }
    }
}
