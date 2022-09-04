package p005b.p006a.p007a.p029b.p042h.p043a;

import java.io.Serializable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.a.a.b.h.a.g */
/* loaded from: classes.dex */
public class C0505g extends AbstractRunnableC0500d<AbstractC0503e> {

    /* renamed from: a */
    private final int f758a;

    public C0505g(AbstractC0508j<AbstractC0503e> abstractC0508j, Executor executor, int i) {
        super(abstractC0508j, executor);
        this.f758a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractRunnableC0500d
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public boolean mo39079a(AbstractC0503e abstractC0503e) {
        abstractC0503e.a(c_());
        abstractC0503e.mo39075a((BlockingQueue<Serializable>) new ArrayBlockingQueue(this.f758a));
        return true;
    }
}
