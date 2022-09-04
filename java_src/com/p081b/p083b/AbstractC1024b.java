package com.p081b.p083b;
/* renamed from: com.b.b.b */
/* loaded from: classes.dex */
public abstract class AbstractC1024b<T> extends AbstractC1026d<T, Integer> {
    public AbstractC1024b(String str) {
        super(Integer.class, str);
    }

    /* renamed from: a */
    public abstract void mo37044a(T t, int i);

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final void m37043a(T t, Integer num) {
        m37043a((AbstractC1024b<T>) t, Integer.valueOf(num.intValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p081b.p083b.AbstractC1026d
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo37036a(Object obj, Integer num) {
        m37043a((AbstractC1024b<T>) obj, num);
    }
}
