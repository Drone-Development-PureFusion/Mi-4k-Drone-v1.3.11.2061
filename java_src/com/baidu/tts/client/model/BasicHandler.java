package com.baidu.tts.client.model;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p102f.EnumC1180l;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class BasicHandler<T> {

    /* renamed from: a */
    private FutureTask<T> f2622a;

    public BasicHandler(FutureTask<T> futureTask) {
        this.f2622a = futureTask;
    }

    public boolean cancel() {
        return this.f2622a.cancel(true);
    }

    public T get() {
        try {
            LoggerProxy.m36554d("BasicHandler", "before get");
            return this.f2622a.get(EnumC1180l.DEFAULT.m36312a(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            LoggerProxy.m36554d("BasicHandler", e.toString());
            return null;
        } catch (ExecutionException e2) {
            LoggerProxy.m36554d("BasicHandler", e2.getCause().toString());
            return null;
        } catch (TimeoutException e3) {
            LoggerProxy.m36554d("BasicHandler", e3.toString());
            return null;
        }
    }

    public void start() {
        new Thread(this.f2622a).start();
    }
}
