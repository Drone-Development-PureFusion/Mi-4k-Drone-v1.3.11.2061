package com.baidu.tts.p112l.p113a;

import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelInfo;
import com.baidu.tts.database.C1154a;
import com.baidu.tts.p112l.C1202a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* renamed from: com.baidu.tts.l.a.c */
/* loaded from: classes.dex */
public class CallableC1205c implements Callable<ModelBags> {

    /* renamed from: a */
    private Conditions f3043a;

    /* renamed from: b */
    private C1154a f3044b;

    /* renamed from: c */
    private C1202a f3045c;

    /* renamed from: d */
    private boolean f3046d;

    public CallableC1205c(C1154a c1154a, Conditions conditions, C1202a c1202a, boolean z) {
        this.f3043a = conditions;
        this.f3044b = c1154a;
        this.f3045c = c1202a;
        this.f3046d = z;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public ModelBags call() {
        List<Map<String, String>> m36384a = this.f3044b.m36384a(this.f3043a);
        ModelBags modelBags = new ModelBags();
        modelBags.setList(m36384a);
        if (modelBags != null && this.f3046d) {
            Iterator<ModelInfo> it2 = modelBags.getModelInfos().iterator();
            while (it2.hasNext()) {
                if (!this.f3045c.m36235b(it2.next().getServerId())) {
                    it2.remove();
                }
            }
        }
        return modelBags;
    }
}
