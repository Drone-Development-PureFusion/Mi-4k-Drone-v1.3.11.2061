package com.p081b.p083b;
/* renamed from: com.b.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC1023a<T> extends AbstractC1026d<T, Float> {
    public AbstractC1023a(String str) {
        super(Float.class, str);
    }

    /* renamed from: a */
    public abstract void mo37046a(T t, float f);

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final void m37045a(T t, Float f) {
        mo37046a((AbstractC1023a<T>) t, f.floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p081b.p083b.AbstractC1026d
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo37036a(Object obj, Float f) {
        m37045a((AbstractC1023a<T>) obj, f);
    }
}
