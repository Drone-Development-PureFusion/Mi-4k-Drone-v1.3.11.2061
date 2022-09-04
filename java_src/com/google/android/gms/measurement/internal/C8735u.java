package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.measurement.internal.u */
/* loaded from: classes2.dex */
class C8735u {

    /* renamed from: a */
    final String f27942a;

    /* renamed from: b */
    final String f27943b;

    /* renamed from: c */
    final long f27944c;

    /* renamed from: d */
    final long f27945d;

    /* renamed from: e */
    final long f27946e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8735u(String str, String str2, long j, long j2, long j3) {
        boolean z = true;
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        C4588d.m23619b(j >= 0);
        C4588d.m23619b(j2 < 0 ? false : z);
        this.f27942a = str;
        this.f27943b = str2;
        this.f27944c = j;
        this.f27945d = j2;
        this.f27946e = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C8735u m10346a() {
        return new C8735u(this.f27942a, this.f27943b, this.f27944c + 1, this.f27945d + 1, this.f27946e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C8735u m10345a(long j) {
        return new C8735u(this.f27942a, this.f27943b, this.f27944c, this.f27945d, j);
    }
}
