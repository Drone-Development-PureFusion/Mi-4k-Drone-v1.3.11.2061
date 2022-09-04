package com.google.android.gms.p232c;

import android.os.IBinder;
import com.google.android.gms.p232c.AbstractC4170e;
import java.lang.reflect.Field;
/* renamed from: com.google.android.gms.c.f */
/* loaded from: classes.dex */
public final class BinderC4173f<T> extends AbstractC4170e.AbstractBinderC4171a {

    /* renamed from: a */
    private final T f15771a;

    private BinderC4173f(T t) {
        this.f15771a = t;
    }

    /* renamed from: a */
    public static <T> AbstractC4170e m25293a(T t) {
        return new BinderC4173f(t);
    }

    /* renamed from: a */
    public static <T> T m25294a(AbstractC4170e abstractC4170e) {
        if (abstractC4170e instanceof BinderC4173f) {
            return ((BinderC4173f) abstractC4170e).f15771a;
        }
        IBinder asBinder = abstractC4170e.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length != 1) {
            throw new IllegalArgumentException(new StringBuilder(64).append("Unexpected number of IObjectWrapper declared fields: ").append(declaredFields.length).toString());
        }
        Field field = declaredFields[0];
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
