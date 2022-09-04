package com.xiaomi.channel.commonutils.network;
/* renamed from: com.xiaomi.channel.commonutils.network.a */
/* loaded from: classes.dex */
public class C10420a implements AbstractC10422c {

    /* renamed from: a */
    private final String f32366a;

    /* renamed from: b */
    private final String f32367b;

    public C10420a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f32366a = str;
        this.f32367b = str2;
    }

    @Override // com.xiaomi.channel.commonutils.network.AbstractC10422c
    /* renamed from: a */
    public String mo5230a() {
        return this.f32366a;
    }

    @Override // com.xiaomi.channel.commonutils.network.AbstractC10422c
    /* renamed from: b */
    public String mo5229b() {
        return this.f32367b;
    }
}
