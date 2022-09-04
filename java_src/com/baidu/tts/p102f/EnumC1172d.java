package com.baidu.tts.p102f;
/* renamed from: com.baidu.tts.f.d */
/* loaded from: classes.dex */
public enum EnumC1172d {
    GB18030("gb18030", "0"),
    BIG5("big5", "1"),
    UTF8("utf-8", "2"),
    GBK("gbk", "4"),
    UNICODE("unicode", "5");
    

    /* renamed from: f */
    private final String f2814f;

    /* renamed from: g */
    private final String f2815g;

    EnumC1172d(String str, String str2) {
        this.f2814f = str;
        this.f2815g = str2;
    }

    /* renamed from: a */
    public static EnumC1172d m36322a(String str) {
        EnumC1172d[] values;
        for (EnumC1172d enumC1172d : values()) {
            if (enumC1172d.m36321b().equals(str)) {
                return enumC1172d;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String m36323a() {
        return this.f2814f;
    }

    /* renamed from: b */
    public String m36321b() {
        return this.f2815g;
    }
}
