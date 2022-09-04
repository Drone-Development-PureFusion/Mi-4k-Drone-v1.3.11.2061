package com.xiaomi.mistatistic.sdk.data;

import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.xiaomi.mistatistic.sdk.data.g */
/* loaded from: classes2.dex */
public class C10553g extends AbstractC10547a {

    /* renamed from: b */
    private long f32713b;

    /* renamed from: c */
    private long f32714c;

    /* renamed from: d */
    private String f32715d;

    public C10553g(long j, long j2, String str) {
        this.f32713b = j;
        this.f32714c = j2;
        this.f32715d = str;
    }

    @Override // com.xiaomi.mistatistic.sdk.data.AbstractC10547a
    /* renamed from: a */
    public C10554h mo4780a() {
        C10554h c10554h = new C10554h();
        c10554h.f32716a = m4779b();
        c10554h.f32717b = this.f32704a;
        c10554h.f32720e = this.f32713b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f32714c;
        c10554h.f32721f = this.f32715d;
        return c10554h;
    }

    /* renamed from: b */
    public String m4779b() {
        return "mistat_session";
    }
}
