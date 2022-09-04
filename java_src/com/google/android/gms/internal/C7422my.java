package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.my */
/* loaded from: classes2.dex */
public class C7422my {

    /* renamed from: a */
    private int f24862a;

    /* renamed from: b */
    private long f24863b;

    /* renamed from: c */
    private Map<String, C7417mt> f24864c;

    /* renamed from: d */
    private boolean f24865d;

    public C7422my() {
        this(-1L);
    }

    public C7422my(int i, long j, Map<String, C7417mt> map, boolean z) {
        this.f24862a = i;
        this.f24863b = j;
        this.f24864c = map == null ? new HashMap<>() : map;
        this.f24865d = z;
    }

    public C7422my(long j) {
        this(0, j, null, false);
    }

    /* renamed from: a */
    public int m14530a() {
        return this.f24862a;
    }

    /* renamed from: a */
    public void m14529a(int i) {
        this.f24862a = i;
    }

    /* renamed from: a */
    public void m14528a(long j) {
        this.f24863b = j;
    }

    /* renamed from: a */
    public void m14527a(String str) {
        if (this.f24864c.get(str) == null) {
            return;
        }
        this.f24864c.remove(str);
    }

    /* renamed from: a */
    public void m14526a(String str, C7417mt c7417mt) {
        this.f24864c.put(str, c7417mt);
    }

    /* renamed from: a */
    public void m14525a(Map<String, C7417mt> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.f24864c = map;
    }

    /* renamed from: a */
    public void m14524a(boolean z) {
        this.f24865d = z;
    }

    /* renamed from: b */
    public boolean m14523b() {
        return this.f24865d;
    }

    /* renamed from: c */
    public Map<String, C7417mt> m14522c() {
        return this.f24864c;
    }

    /* renamed from: d */
    public long m14521d() {
        return this.f24863b;
    }
}
