package com.baidu.tts.aop.tts;

import android.content.Context;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1181m;
import com.baidu.tts.p110j.AbstractC1198b;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1238i;
import com.baidu.tts.p114m.C1239j;
/* loaded from: classes.dex */
public interface ITts extends AbstractC1198b {
    AuthInfo auth(EnumC1181m enumC1181m);

    int freeCustomResource(C1234e c1234e);

    EnumC1181m getMode();

    TtsListener getTtsListener();

    C1239j getTtsParams();

    int loadCustomResource(C1234e c1234e);

    int loadEnglishModel(C1235f c1235f);

    int loadModel(C1236g c1236g);

    int setAudioStreamType(int i);

    void setContext(Context context);

    void setMode(EnumC1181m enumC1181m);

    int setParam(EnumC1175g enumC1175g, String str);

    int setStereoVolume(float f, float f2);

    void setTtsListener(TtsListener ttsListener);

    void speak(C1238i c1238i);

    void synthesize(C1238i c1238i);
}
