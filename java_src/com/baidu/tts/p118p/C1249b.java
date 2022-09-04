package com.baidu.tts.p118p;

import android.content.Context;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* renamed from: com.baidu.tts.p.b */
/* loaded from: classes.dex */
public class C1249b {

    /* renamed from: a */
    private C1250c f3101a;

    /* renamed from: b */
    private Context f3102b;

    /* renamed from: c */
    private FutureTask<Integer> f3103c;

    public C1249b(Context context) {
        this.f3102b = context;
        this.f3101a = new C1250c(context);
    }

    /* renamed from: a */
    public void m36084a() {
        int i;
        this.f3103c = this.f3101a.m36082a();
        try {
            i = this.f3103c.get().intValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
            i = -1;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            i = -1;
        }
        LoggerProxy.m36554d("StatisticsClient", "Statistics uploade result=" + i);
    }

    /* renamed from: b */
    public void m36083b() {
        if (this.f3103c != null) {
            this.f3101a.m36079b();
        }
    }
}
