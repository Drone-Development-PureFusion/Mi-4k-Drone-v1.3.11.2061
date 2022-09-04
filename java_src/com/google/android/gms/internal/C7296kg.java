package com.google.android.gms.internal;

import java.util.Map;
/* renamed from: com.google.android.gms.internal.kg */
/* loaded from: classes2.dex */
public class C7296kg {

    /* renamed from: a */
    private final C7160ij f24431a;

    /* renamed from: b */
    private final C7293kf f24432b;

    public C7296kg(C7160ij c7160ij, C7293kf c7293kf) {
        this.f24431a = c7160ij;
        this.f24432b = c7293kf;
    }

    /* renamed from: a */
    public static C7296kg m14899a(C7160ij c7160ij) {
        return new C7296kg(c7160ij, C7293kf.f24417a);
    }

    /* renamed from: a */
    public static C7296kg m14898a(C7160ij c7160ij, Map<String, Object> map) {
        return new C7296kg(c7160ij, C7293kf.m14920a(map));
    }

    /* renamed from: a */
    public C7160ij m14900a() {
        return this.f24431a;
    }

    /* renamed from: b */
    public C7293kf m14897b() {
        return this.f24432b;
    }

    /* renamed from: c */
    public AbstractC7336lb m14896c() {
        return this.f24432b.m14909j();
    }

    /* renamed from: d */
    public boolean m14895d() {
        return this.f24432b.m14905n();
    }

    /* renamed from: e */
    public boolean m14894e() {
        return this.f24432b.m14906m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7296kg c7296kg = (C7296kg) obj;
        return this.f24431a.equals(c7296kg.f24431a) && this.f24432b.equals(c7296kg.f24432b);
    }

    public int hashCode() {
        return (this.f24431a.hashCode() * 31) + this.f24432b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f24431a);
        String valueOf2 = String.valueOf(this.f24432b);
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append(":").append(valueOf2).toString();
    }
}
