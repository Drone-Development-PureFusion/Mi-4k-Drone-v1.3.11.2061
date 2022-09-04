package com.baidu.tts.p112l.p113a;

import com.baidu.tts.client.model.BasicHandler;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.LibEngineParams;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.p112l.C1202a;
import java.util.Set;
import java.util.concurrent.FutureTask;
/* renamed from: com.baidu.tts.l.a.h */
/* loaded from: classes.dex */
public class C1210h {

    /* renamed from: a */
    private C1202a f3054a;

    public C1210h(C1202a c1202a) {
        this.f3054a = c1202a;
    }

    /* renamed from: a */
    public BasicHandler<ModelBags> m36216a(Conditions conditions) {
        BasicHandler<ModelBags> basicHandler = new BasicHandler<>(new FutureTask(new CallableC1209g(conditions)));
        basicHandler.start();
        return basicHandler;
    }

    /* renamed from: a */
    public BasicHandler<ModelBags> m36215a(Conditions conditions, boolean z) {
        BasicHandler<ModelBags> basicHandler = new BasicHandler<>(new FutureTask(new CallableC1205c(this.f3054a.m36230e(), conditions, this.f3054a, z)));
        basicHandler.start();
        return basicHandler;
    }

    /* renamed from: a */
    public BasicHandler<ModelFileBags> m36214a(Set<String> set) {
        BasicHandler<ModelFileBags> basicHandler = new BasicHandler<>(new FutureTask(new CallableC1208f(set)));
        basicHandler.start();
        return basicHandler;
    }

    /* renamed from: a */
    public LibEngineParams m36217a() {
        return new LibEngineParams(EmbeddedSynthesizerEngine.bdTTSGetEngineParam());
    }

    /* renamed from: b */
    public BasicHandler<ModelBags> m36213b() {
        BasicHandler<ModelBags> basicHandler = new BasicHandler<>(new FutureTask(new CallableC1207e()));
        basicHandler.start();
        return basicHandler;
    }

    /* renamed from: b */
    public BasicHandler<ModelFileBags> m36212b(Set<String> set) {
        BasicHandler<ModelFileBags> basicHandler = new BasicHandler<>(new FutureTask(new CallableC1204b(this.f3054a.m36230e(), set)));
        basicHandler.start();
        return basicHandler;
    }
}
