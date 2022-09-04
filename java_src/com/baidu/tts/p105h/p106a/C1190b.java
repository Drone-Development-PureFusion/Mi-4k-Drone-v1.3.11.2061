package com.baidu.tts.p105h.p106a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.p102f.EnumC1182n;
/* renamed from: com.baidu.tts.h.a.b */
/* loaded from: classes.dex */
public class C1190b extends AbstractC1189a {
    public C1190b(EnumC1182n enumC1182n) {
        super(enumC1182n);
    }

    /* renamed from: a */
    public int m36301a(TtsError ttsError) {
        return this.f3010a.m36307b();
    }

    /* renamed from: b */
    public String m36300b(TtsError ttsError) {
        int code = ttsError.getCode();
        String message = ttsError.getMessage();
        Throwable throwable = ttsError.getThrowable();
        String str = "(" + this.f3010a.m36307b() + ")" + this.f3010a.m36306c();
        if (message != null) {
            str = str + "[(" + code + ")" + message + "]";
        } else if (code != 0) {
            str = str + "[(" + code + ")]";
        }
        if (throwable != null) {
            return str + "[(cause)" + throwable.toString() + "]";
        }
        return str;
    }
}
