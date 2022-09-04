package org.p328c;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: org.c.m */
/* loaded from: classes.dex */
public @interface AbstractC11695m {

    /* renamed from: org.c.m$a */
    /* loaded from: classes.dex */
    public static class C11696a extends Throwable {
        private static final long serialVersionUID = 1;

        private C11696a() {
        }
    }

    /* renamed from: a */
    Class<? extends Throwable> m279a() default C11696a.class;

    /* renamed from: b */
    long m278b() default 0;
}
