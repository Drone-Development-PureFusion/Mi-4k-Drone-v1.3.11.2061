package com.xiaomi.mistatistic.sdk.data;
/* renamed from: com.xiaomi.mistatistic.sdk.data.e */
/* loaded from: classes2.dex */
public class C10551e extends AbstractC10547a {

    /* renamed from: b */
    private String f32709b;

    /* renamed from: c */
    private String f32710c;

    /* renamed from: d */
    private String f32711d;

    public C10551e(String str, String str2, String str3) {
        this.f32709b = str;
        this.f32710c = str2;
        this.f32711d = str3;
    }

    @Override // com.xiaomi.mistatistic.sdk.data.AbstractC10547a
    /* renamed from: a */
    public C10554h mo4780a() {
        C10554h c10554h = new C10554h();
        c10554h.f32716a = this.f32709b;
        c10554h.f32718c = this.f32710c;
        c10554h.f32717b = this.f32704a;
        c10554h.f32720e = this.f32711d;
        c10554h.f32719d = "property";
        return c10554h;
    }
}
