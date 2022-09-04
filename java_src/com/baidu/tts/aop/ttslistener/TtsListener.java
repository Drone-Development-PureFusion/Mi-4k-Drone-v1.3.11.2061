package com.baidu.tts.aop.ttslistener;

import com.baidu.tts.p114m.C1237h;
/* loaded from: classes.dex */
public interface TtsListener {
    void onError(C1237h c1237h);

    void onPlayFinished(C1237h c1237h);

    void onPlayProgressUpdate(C1237h c1237h);

    void onPlayStart(C1237h c1237h);

    void onSynthesizeDataArrived(C1237h c1237h);

    void onSynthesizeFinished(C1237h c1237h);

    void onSynthesizeStart(C1237h c1237h);
}
