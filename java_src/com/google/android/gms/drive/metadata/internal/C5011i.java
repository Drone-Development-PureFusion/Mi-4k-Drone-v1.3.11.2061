package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.drive.AbstractC4836f;
/* renamed from: com.google.android.gms.drive.metadata.internal.i */
/* loaded from: classes2.dex */
public class C5011i {

    /* renamed from: a */
    private String f18005a;

    private C5011i(String str) {
        this.f18005a = str.toLowerCase();
    }

    /* renamed from: a */
    public static C5011i m22119a(String str) {
        C4588d.m23619b(str == null || !str.isEmpty());
        if (str == null) {
            return null;
        }
        return new C5011i(str);
    }

    /* renamed from: a */
    public boolean m22120a() {
        return this.f18005a.equals(AbstractC4836f.f17636b_);
    }

    /* renamed from: b */
    public boolean m22118b() {
        return !m22117c() && !m22120a();
    }

    /* renamed from: c */
    public boolean m22117c() {
        return this.f18005a.startsWith("application/vnd.google-apps");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        return this.f18005a.equals(((C5011i) obj).f18005a);
    }

    public int hashCode() {
        return this.f18005a.hashCode();
    }

    public String toString() {
        return this.f18005a;
    }
}
