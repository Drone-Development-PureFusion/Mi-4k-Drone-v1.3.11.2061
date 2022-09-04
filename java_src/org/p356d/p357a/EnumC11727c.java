package org.p356d.p357a;

import org.p286a.p287a.p290c.p293c.C11053o;
/* renamed from: org.d.a.c */
/* loaded from: classes3.dex */
public enum EnumC11727c {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, C11053o.f35598a);
    

    /* renamed from: f */
    private int f37020f;

    /* renamed from: g */
    private String f37021g;

    EnumC11727c(int i, String str) {
        this.f37020f = i;
        this.f37021g = str;
    }

    /* renamed from: a */
    public int m185a() {
        return this.f37020f;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f37021g;
    }
}
