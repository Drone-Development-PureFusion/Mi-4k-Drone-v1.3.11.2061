package com.baidu.tts.p112l.p113a;

import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.database.C1154a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* renamed from: com.baidu.tts.l.a.b */
/* loaded from: classes.dex */
public class CallableC1204b implements Callable<ModelFileBags> {

    /* renamed from: a */
    private Set<String> f3041a;

    /* renamed from: b */
    private C1154a f3042b;

    public CallableC1204b(C1154a c1154a, Set<String> set) {
        this.f3041a = set;
        this.f3042b = c1154a;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public ModelFileBags call() {
        List<Map<String, String>> m36377a = this.f3042b.m36377a(this.f3041a);
        ModelFileBags modelFileBags = new ModelFileBags();
        modelFileBags.setList(m36377a);
        return modelFileBags;
    }
}
