package com.google.android.gms.internal;

import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.rt */
/* loaded from: classes2.dex */
public class C7673rt extends AbstractC7162ik<Integer, Object> {

    /* renamed from: a */
    public Long f25467a;

    /* renamed from: b */
    public Boolean f25468b;

    /* renamed from: c */
    public Boolean f25469c;

    public C7673rt() {
    }

    public C7673rt(String str) {
        mo13698a(str);
    }

    @Override // com.google.android.gms.internal.AbstractC7162ik
    /* renamed from: a */
    protected HashMap<Integer, Object> mo13699a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f25467a);
        hashMap.put(1, this.f25468b);
        hashMap.put(2, this.f25469c);
        return hashMap;
    }

    @Override // com.google.android.gms.internal.AbstractC7162ik
    /* renamed from: a */
    protected void mo13698a(String str) {
        HashMap b = b(str);
        if (b != null) {
            this.f25467a = (Long) b.get(0);
            this.f25468b = (Boolean) b.get(1);
            this.f25469c = (Boolean) b.get(2);
        }
    }
}
