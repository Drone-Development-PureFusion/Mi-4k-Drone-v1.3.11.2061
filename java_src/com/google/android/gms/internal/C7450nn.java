package com.google.android.gms.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
/* renamed from: com.google.android.gms.internal.nn */
/* loaded from: classes2.dex */
public final class C7450nn {

    /* renamed from: a */
    private final Field f24914a;

    public C7450nn(Field field) {
        C7494op.m14330a(field);
        this.f24914a = field;
    }

    /* renamed from: a */
    public <T extends Annotation> T m14422a(Class<T> cls) {
        return (T) this.f24914a.getAnnotation(cls);
    }
}
