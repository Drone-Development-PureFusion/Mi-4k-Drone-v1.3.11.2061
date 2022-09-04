package com.baidu.tts.p102f;
/* renamed from: com.baidu.tts.f.b */
/* loaded from: classes.dex */
public enum EnumC1167b {
    BV("0") { // from class: com.baidu.tts.f.b.1
    },
    AMR("1") { // from class: com.baidu.tts.f.b.2
    },
    OPUS("2") { // from class: com.baidu.tts.f.b.3
    };
    

    /* renamed from: d */
    private final String f2783d;

    EnumC1167b(String str) {
        this.f2783d = str;
    }

    /* renamed from: a */
    public static EnumC1167b m36326a(String str) {
        EnumC1167b[] values;
        for (EnumC1167b enumC1167b : values()) {
            if (enumC1167b.m36327a().equals(str)) {
                return enumC1167b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String m36327a() {
        return this.f2783d;
    }
}
