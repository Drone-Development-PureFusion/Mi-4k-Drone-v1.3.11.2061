package com.baidu.tts.p102f;
/* renamed from: com.baidu.tts.f.h */
/* loaded from: classes.dex */
public enum EnumC1176h {
    ZH("chinese", "ZH"),
    EN("english", "EN");
    

    /* renamed from: c */
    private final String f2898c;

    /* renamed from: d */
    private final String f2899d;

    EnumC1176h(String str, String str2) {
        this.f2898c = str;
        this.f2899d = str2;
    }

    /* renamed from: a */
    public static EnumC1176h m36315a(String str) {
        EnumC1176h[] values;
        for (EnumC1176h enumC1176h : values()) {
            if (enumC1176h.m36316a().equalsIgnoreCase(str)) {
                return enumC1176h;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String m36316a() {
        return this.f2899d;
    }
}
