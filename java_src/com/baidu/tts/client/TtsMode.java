package com.baidu.tts.client;

import com.baidu.tts.p102f.EnumC1181m;
/* loaded from: classes.dex */
public enum TtsMode {
    ONLINE(EnumC1181m.ONLINE),
    MIX(EnumC1181m.MIX);
    

    /* renamed from: a */
    private final EnumC1181m f2619a;

    TtsMode(EnumC1181m enumC1181m) {
        this.f2619a = enumC1181m;
    }

    public String getDescription() {
        return this.f2619a.m36309b();
    }

    public int getMode() {
        return this.f2619a.m36310a();
    }

    public EnumC1181m getTtsEnum() {
        return this.f2619a;
    }
}
