package com.baidu.tts.p110j;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: com.baidu.tts.j.a */
/* loaded from: classes.dex */
public abstract class AbstractC1196a implements AbstractC1198b {

    /* renamed from: d */
    protected final Lock f3031d = new ReentrantLock();

    /* renamed from: e */
    protected final Condition f3032e = this.f3031d.newCondition();

    /* renamed from: com.baidu.tts.j.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC1197a {
        /* renamed from: a */
        void m36250a();
    }

    /* renamed from: A */
    public synchronized void m36263A() {
        mo36257h();
    }

    /* renamed from: B */
    public void m36262B() {
        Thread.currentThread().interrupt();
    }

    /* renamed from: C */
    public boolean m36261C() {
        try {
            m36260a(null);
        } catch (InterruptedException e) {
            m36262B();
        }
        return !mo36251n();
    }

    /* renamed from: a */
    public void m36260a(AbstractC1197a abstractC1197a) {
        while (mo36252m()) {
            m36259b(abstractC1197a);
        }
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: b */
    public synchronized TtsError mo36091b() {
        return mo36258g();
    }

    /* renamed from: b */
    public void m36259b(AbstractC1197a abstractC1197a) {
        try {
            this.f3031d.lock();
            if (abstractC1197a != null) {
                abstractC1197a.m36250a();
            }
            LoggerProxy.m36554d("ASafeLife", "before await");
            this.f3032e.await();
            LoggerProxy.m36554d("ASafeLife", "after await");
        } finally {
            this.f3031d.unlock();
        }
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: c */
    public synchronized void mo36090c() {
        mo36256i();
        try {
            this.f3031d.lock();
            this.f3032e.signalAll();
            this.f3031d.unlock();
        } catch (Exception e) {
            e.printStackTrace();
            this.f3031d.unlock();
        }
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: d */
    public synchronized void mo36089d() {
        mo36255j();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: e */
    public synchronized void mo36088e() {
        mo36254k();
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: f */
    public synchronized void mo36087f() {
        mo36253l();
    }

    /* renamed from: g */
    protected abstract TtsError mo36258g();

    /* renamed from: h */
    protected abstract void mo36257h();

    /* renamed from: i */
    protected abstract void mo36256i();

    /* renamed from: j */
    protected abstract void mo36255j();

    /* renamed from: k */
    protected abstract void mo36254k();

    /* renamed from: l */
    protected abstract void mo36253l();

    /* renamed from: m */
    public abstract boolean mo36252m();

    /* renamed from: n */
    public abstract boolean mo36251n();
}
