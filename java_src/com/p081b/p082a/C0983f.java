package com.p081b.p082a;
/* renamed from: com.b.a.f */
/* loaded from: classes.dex */
public class C0983f implements AbstractC1014p<Number> {
    @Override // com.p081b.p082a.AbstractC1014p
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public Float mo37111a(float f, Number number, Number number2) {
        float floatValue = number.floatValue();
        return Float.valueOf(floatValue + ((number2.floatValue() - floatValue) * f));
    }
}
