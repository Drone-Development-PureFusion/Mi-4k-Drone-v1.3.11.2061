package com.tencent.stat;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;
/* renamed from: com.tencent.stat.e */
/* loaded from: classes2.dex */
class C10353e extends DefaultConnectionKeepAliveStrategy {

    /* renamed from: a */
    final /* synthetic */ C10352d f32273a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10353e(C10352d c10352d) {
        this.f32273a = c10352d;
    }

    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        long keepAliveDuration = super.getKeepAliveDuration(httpResponse, httpContext);
        if (keepAliveDuration == -1) {
            return 20000L;
        }
        return keepAliveDuration;
    }
}
