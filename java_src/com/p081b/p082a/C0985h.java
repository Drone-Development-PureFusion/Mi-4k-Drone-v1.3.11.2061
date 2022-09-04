package com.p081b.p082a;
/* renamed from: com.b.a.h */
/* loaded from: classes.dex */
public class C0985h implements AbstractC1014p<Integer> {
    @Override // com.p081b.p082a.AbstractC1014p
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public Integer mo37111a(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        return Integer.valueOf((int) (((num2.intValue() - intValue) * f) + intValue));
    }
}
