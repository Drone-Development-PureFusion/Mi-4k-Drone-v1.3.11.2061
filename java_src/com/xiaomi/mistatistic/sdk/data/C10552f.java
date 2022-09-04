package com.xiaomi.mistatistic.sdk.data;
/* renamed from: com.xiaomi.mistatistic.sdk.data.f */
/* loaded from: classes2.dex */
public class C10552f extends AbstractC10547a {

    /* renamed from: b */
    private String f32712b;

    public C10552f(String str) {
        this.f32712b = str;
    }

    @Override // com.xiaomi.mistatistic.sdk.data.AbstractC10547a
    /* renamed from: a */
    public C10554h mo4780a() {
        C10554h c10554h = new C10554h();
        c10554h.f32716a = m4781b();
        c10554h.f32717b = this.f32704a;
        c10554h.f32720e = this.f32712b;
        return c10554h;
    }

    /* renamed from: b */
    public String m4781b() {
        return "mistat_pv";
    }
}
