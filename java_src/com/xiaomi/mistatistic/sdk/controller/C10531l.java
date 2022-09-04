package com.xiaomi.mistatistic.sdk.controller;

import java.io.IOException;
import java.util.List;
import org.json.JSONException;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.l */
/* loaded from: classes2.dex */
class C10531l implements AbstractC10524e {

    /* renamed from: a */
    final /* synthetic */ HandlerC10530k f32686a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10531l(HandlerC10530k handlerC10530k) {
        this.f32686a = handlerC10530k;
    }

    @Override // com.xiaomi.mistatistic.sdk.controller.AbstractC10524e
    /* renamed from: a */
    public void mo4784a() {
        boolean m4826f;
        List list;
        List list2;
        if (this.f32686a.f32685a.m4829c()) {
            try {
                List m4831b = this.f32686a.f32685a.m4831b();
                m4826f = this.f32686a.f32685a.m4826f();
                if (!m4826f) {
                    return;
                }
                list = this.f32686a.f32685a.f32683d;
                synchronized (list) {
                    list2 = this.f32686a.f32685a.f32683d;
                    list2.removeAll(m4831b);
                }
            } catch (IOException e) {
                new C10534o().m4822a("", e);
            } catch (JSONException e2) {
                new C10534o().m4822a("", e2);
            }
        }
    }
}
