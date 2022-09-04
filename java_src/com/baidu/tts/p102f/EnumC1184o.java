package com.baidu.tts.p102f;

import java.net.InetAddress;
/* renamed from: com.baidu.tts.f.o */
/* loaded from: classes.dex */
public enum EnumC1184o {
    TTS_SERVER("http://tts.baidu.com/text2audio") { // from class: com.baidu.tts.f.o.1
        @Override // com.baidu.tts.p102f.EnumC1184o
        /* renamed from: b */
        public String mo36303b() {
            String a = a("tts.baidu.com");
            if (a != null) {
                return "http://" + a + "/text2audio";
            }
            return null;
        }
    },
    MODEL_SERVER("http://tts.baidu.com/bos/story.php?") { // from class: com.baidu.tts.f.o.2
        @Override // com.baidu.tts.p102f.EnumC1184o
        /* renamed from: b */
        public String mo36303b() {
            return null;
        }
    },
    STATISTICS_SERVER("http://upl.baidu.com/ttsdlstats.php") { // from class: com.baidu.tts.f.o.3
        @Override // com.baidu.tts.p102f.EnumC1184o
        /* renamed from: b */
        public String mo36303b() {
            return null;
        }
    };
    

    /* renamed from: d */
    private final String f3007d;

    EnumC1184o(String str) {
        this.f3007d = str;
    }

    /* renamed from: a */
    public static String m36304a(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public String m36305a() {
        return this.f3007d;
    }

    /* renamed from: b */
    public abstract String mo36303b();
}
