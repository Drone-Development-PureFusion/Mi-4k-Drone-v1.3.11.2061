package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.pe */
/* loaded from: classes2.dex */
public final class C7543pe implements AbstractC7489ok {

    /* renamed from: a */
    private final C7500os f25059a;

    public C7543pe(C7500os c7500os) {
        this.f25059a = c7500os;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC7488oj<?> m14260a(C7500os c7500os, C7459nr c7459nr, C7597po<?> c7597po, AbstractC7490ol abstractC7490ol) {
        Class<?> m14335a = abstractC7490ol.m14335a();
        if (AbstractC7488oj.class.isAssignableFrom(m14335a)) {
            return (AbstractC7488oj) c7500os.m14306a(C7597po.m14167b(m14335a)).mo14275a();
        }
        if (!AbstractC7489ok.class.isAssignableFrom(m14335a)) {
            throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
        }
        return ((AbstractC7489ok) c7500os.m14306a(C7597po.m14167b(m14335a)).mo14275a()).mo14182a(c7459nr, c7597po);
    }

    @Override // com.google.android.gms.internal.AbstractC7489ok
    /* renamed from: a */
    public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
        AbstractC7490ol abstractC7490ol = (AbstractC7490ol) c7597po.m14171a().getAnnotation(AbstractC7490ol.class);
        if (abstractC7490ol == null) {
            return null;
        }
        return (AbstractC7488oj<T>) m14260a(this.f25059a, c7459nr, c7597po, abstractC7490ol);
    }
}
