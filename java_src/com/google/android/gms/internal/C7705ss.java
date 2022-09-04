package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.ss */
/* loaded from: classes2.dex */
public class C7705ss {

    /* renamed from: a */
    public static final C7705ss f25550a = new C7705ss("@@ContextManagerNullAccount@@");

    /* renamed from: b */
    private static AbstractC7706a f25551b = null;

    /* renamed from: c */
    private final String f25552c;

    /* renamed from: com.google.android.gms.internal.ss$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7706a {
    }

    public C7705ss(String str) {
        this.f25552c = C4588d.m23625a(str);
    }

    /* renamed from: a */
    public String m13678a() {
        return this.f25552c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7705ss) {
            return TextUtils.equals(this.f25552c, ((C7705ss) obj).m13678a());
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f25552c);
    }

    public String toString() {
        return "#account#";
    }
}
