package com.facebook.common.internal;
/* loaded from: classes.dex */
public class Suppliers {
    /* renamed from: of */
    public static <T> Supplier<T> m35582of(final T t) {
        return new Supplier<T>() { // from class: com.facebook.common.internal.Suppliers.1
            /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
            @Override // com.facebook.common.internal.Supplier
            /* renamed from: get */
            public T mo40100get() {
                return t;
            }
        };
    }
}
