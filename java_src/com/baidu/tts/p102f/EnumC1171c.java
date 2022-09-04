package com.baidu.tts.p102f;

import com.fimi.soul.utils.C3134q;
/* renamed from: com.baidu.tts.f.c */
/* loaded from: classes.dex */
public enum EnumC1171c {
    BV_16K("16K", "0"),
    AMR_6K6("6K6", "0"),
    AMR_8K85("16K", "1"),
    AMR_12K65("16K", "2"),
    AMR_14K25("16K", "3"),
    AMR_15K85("16K", "4"),
    AMR_18K25("16K", "5"),
    AMR_19K85("16K", "6"),
    AMR_23K05("16K", C3134q.f11824l),
    AMR_23K85("16K", C3134q.f11825m),
    OPUS_8K("16K", "0"),
    OPUS_16K("16K", "1"),
    OPUS_18K("16K", "2"),
    OPUS_20K("16K", "3"),
    OPUS_24K("16K", "4"),
    OPUS_32K("16K", "5"),
    MP3_8K("16K", "0"),
    MP3_11K("16K", "1"),
    MP3_16K("16K", "2"),
    MP3_24K("16K", "3"),
    MP3_32K("16K", "4");
    

    /* renamed from: v */
    private final String f2806v;

    /* renamed from: w */
    private final String f2807w;

    EnumC1171c(String str, String str2) {
        this.f2806v = str;
        this.f2807w = str2;
    }

    /* renamed from: a */
    public static EnumC1171c m36324a(String str) {
        EnumC1171c[] values;
        for (EnumC1171c enumC1171c : values()) {
            if (enumC1171c.m36325a().equals(str)) {
                return enumC1171c;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String m36325a() {
        return this.f2807w;
    }
}
