package com.baidu.tts.client;

import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.tools.ResourceTools;
/* loaded from: classes.dex */
public class SpeechSynthesizeBag {

    /* renamed from: a */
    private String f2614a;

    /* renamed from: b */
    private String f2615b;

    public String getText() {
        return this.f2614a;
    }

    public String getUtteranceId() {
        return this.f2615b;
    }

    public int setText(String str) {
        EnumC1182n isTextValid = ResourceTools.isTextValid(str);
        if (isTextValid == null) {
            this.f2614a = str;
            return 0;
        }
        return isTextValid.m36307b();
    }

    public void setUtteranceId(String str) {
        this.f2615b = str;
    }
}
