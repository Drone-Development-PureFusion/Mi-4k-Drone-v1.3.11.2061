package com.baidu.tts.p111k;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p111k.AbstractC1199a;
import com.baidu.tts.p111k.AbstractCallableC1200b;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
/* renamed from: com.baidu.tts.k.c */
/* loaded from: classes.dex */
public class C1201c<A extends AbstractCallableC1200b<A, R>, R extends AbstractC1199a> {

    /* renamed from: a */
    private final ConcurrentMap<A, Future<R>> f3033a = new ConcurrentHashMap();

    /* renamed from: b */
    private A m36246b(A a) {
        for (A a2 : this.f3033a.keySet()) {
            if (a.compareTo(a2) == 0) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public R m36247a(A a) {
        Future<R> future;
        Future<R> future2;
        FutureTask futureTask;
        A m36246b = m36246b(a);
        Future<R> future3 = m36246b != null ? this.f3033a.get(m36246b) : null;
        try {
            if (future3 != null) {
                LoggerProxy.m36554d("Memorizer", "+ get f=" + future3);
                R r = future3.get();
                LoggerProxy.m36554d("Memorizer", "- get f=" + future3);
                if (!r.mo36249g()) {
                    LoggerProxy.m36554d("Memorizer", "arg invalid r=" + r);
                    this.f3033a.remove(m36246b);
                    future = null;
                    if (future == null || (future = this.f3033a.putIfAbsent(a, (futureTask = new FutureTask(a)))) != null) {
                        future2 = future;
                    } else {
                        LoggerProxy.m36554d("Memorizer", "+ run f=" + futureTask);
                        futureTask.run();
                        LoggerProxy.m36554d("Memorizer", "- run f=" + futureTask);
                        future2 = futureTask;
                    }
                    return (R) future2.get();
                }
            }
            return (R) future2.get();
        } catch (ExecutionException e) {
            this.f3033a.remove(a, future2);
            throw ((Exception) e.getCause());
        } catch (Exception e2) {
            this.f3033a.remove(a, future2);
            throw e2;
        }
        future = future3;
        if (future == null) {
        }
        future2 = future;
    }

    /* renamed from: a */
    public void m36248a() {
        if (this.f3033a != null) {
            this.f3033a.clear();
        }
    }
}
