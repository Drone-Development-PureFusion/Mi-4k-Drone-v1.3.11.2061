package com.xiaomi.market.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
/* renamed from: com.xiaomi.market.sdk.n */
/* loaded from: classes2.dex */
public class HandlerC10449n extends Handler {

    /* renamed from: aR */
    final /* synthetic */ C10448m f32499aR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC10449n(C10448m c10448m, Looper looper) {
        super(looper);
        this.f32499aR = c10448m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public String m5091e(String str, String str2) {
        File file;
        C10452q c10452q;
        C10452q c10452q2;
        C10452q c10452q3;
        if (TextUtils.isEmpty(str2) || TextUtils.equals(C10437b.m5143a(new File(str)), str2)) {
            file = this.f32499aR.f32495aN;
            String absolutePath = file.getAbsolutePath();
            c10452q = this.f32499aR.f32493aL;
            if (c10452q == null) {
                return null;
            }
            c10452q2 = this.f32499aR.f32493aL;
            if (TextUtils.isEmpty(c10452q2.sourceDir)) {
                return null;
            }
            c10452q3 = this.f32499aR.f32493aL;
            Patcher.m5169a(c10452q3.sourceDir, absolutePath, str);
            return absolutePath;
        }
        return null;
    }

    /* renamed from: l */
    public void m5090l() {
        post(new RunnableC10450o(this));
    }

    /* renamed from: m */
    public void m5089m() {
        post(new RunnableC10451p(this));
    }
}
