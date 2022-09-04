package org.p328c.p350f.p351a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
/* renamed from: org.c.f.a.b */
/* loaded from: classes.dex */
public class C11641b extends AbstractC11642c<C11641b> {

    /* renamed from: a */
    private final Field f36784a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11641b(Field field) {
        if (field == null) {
            throw new NullPointerException("FrameworkField cannot be created without an underlying field.");
        }
        this.f36784a = field;
    }

    /* renamed from: a */
    public Object m461a(Object obj) {
        return this.f36784a.get(obj);
    }

    @Override // org.p328c.p350f.p351a.AbstractC11640a
    /* renamed from: a */
    public <T extends Annotation> T mo424a(Class<T> cls) {
        return (T) this.f36784a.getAnnotation(cls);
    }

    @Override // org.p328c.p350f.p351a.AbstractC11642c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public boolean mo453a(C11641b c11641b) {
        return c11641b.mo450b().equals(mo450b());
    }

    @Override // org.p328c.p350f.p351a.AbstractC11640a
    /* renamed from: a */
    public Annotation[] mo425a() {
        return this.f36784a.getAnnotations();
    }

    @Override // org.p328c.p350f.p351a.AbstractC11642c
    /* renamed from: b */
    public String mo450b() {
        return m459d().getName();
    }

    @Override // org.p328c.p350f.p351a.AbstractC11642c
    /* renamed from: c */
    protected int mo446c() {
        return this.f36784a.getModifiers();
    }

    /* renamed from: d */
    public Field m459d() {
        return this.f36784a;
    }

    @Override // org.p328c.p350f.p351a.AbstractC11642c
    /* renamed from: e */
    public Class<?> mo444e() {
        return this.f36784a.getType();
    }

    @Override // org.p328c.p350f.p351a.AbstractC11642c
    /* renamed from: f */
    public Class<?> mo443f() {
        return this.f36784a.getDeclaringClass();
    }

    public String toString() {
        return this.f36784a.toString();
    }
}
