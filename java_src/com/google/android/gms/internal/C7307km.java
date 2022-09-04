package com.google.android.gms.internal;

import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.km */
/* loaded from: classes2.dex */
public class C7307km extends AbstractC7162ik<Integer, Object> {

    /* renamed from: a */
    public String f24456a;

    /* renamed from: b */
    public long f24457b;

    /* renamed from: c */
    public String f24458c;

    /* renamed from: d */
    public String f24459d;

    /* renamed from: e */
    public String f24460e;

    public C7307km() {
        this.f24456a = "E";
        this.f24457b = -1L;
        this.f24458c = "E";
        this.f24459d = "E";
        this.f24460e = "E";
    }

    public C7307km(String str) {
        this();
        mo13698a(str);
    }

    @Override // com.google.android.gms.internal.AbstractC7162ik
    /* renamed from: a */
    protected HashMap<Integer, Object> mo13699a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f24456a);
        hashMap.put(4, this.f24460e);
        hashMap.put(3, this.f24459d);
        hashMap.put(2, this.f24458c);
        hashMap.put(1, Long.valueOf(this.f24457b));
        return hashMap;
    }

    @Override // com.google.android.gms.internal.AbstractC7162ik
    /* renamed from: a */
    protected void mo13698a(String str) {
        HashMap b = b(str);
        if (b != null) {
            this.f24456a = b.get(0) == null ? "E" : (String) b.get(0);
            this.f24457b = b.get(1) == null ? -1L : ((Long) b.get(1)).longValue();
            this.f24458c = b.get(2) == null ? "E" : (String) b.get(2);
            this.f24459d = b.get(3) == null ? "E" : (String) b.get(3);
            this.f24460e = b.get(4) == null ? "E" : (String) b.get(4);
        }
    }
}
