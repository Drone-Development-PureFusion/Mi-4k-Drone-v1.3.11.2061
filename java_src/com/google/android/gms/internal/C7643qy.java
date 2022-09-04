package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7642qx;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.qy */
/* loaded from: classes2.dex */
public class C7643qy<M extends AbstractC7642qx<M>, T> {

    /* renamed from: a */
    protected final int f25375a;

    /* renamed from: b */
    protected final Class<T> f25376b;

    /* renamed from: c */
    public final int f25377c;

    /* renamed from: d */
    protected final boolean f25378d;

    private C7643qy(int i, Class<T> cls, int i2, boolean z) {
        this.f25375a = i;
        this.f25376b = cls;
        this.f25377c = i2;
        this.f25378d = z;
    }

    /* renamed from: a */
    public static <M extends AbstractC7642qx<M>, T extends AbstractC7649rd> C7643qy<M, T> m13904a(int i, Class<T> cls, long j) {
        return new C7643qy<>(i, cls, (int) j, false);
    }

    /* renamed from: b */
    private T m13896b(List<C7651rf> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C7651rf c7651rf = list.get(i);
            if (c7651rf.f25393b.length != 0) {
                m13902a(c7651rf, arrayList);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        T cast = this.f25376b.cast(Array.newInstance(this.f25376b.getComponentType(), size));
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(cast, i2, arrayList.get(i2));
        }
        return cast;
    }

    /* renamed from: c */
    private T m13893c(List<C7651rf> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.f25376b.cast(m13903a(C7639qv.m14009a(list.get(list.size() - 1).f25393b)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m13901a(Object obj) {
        return this.f25378d ? m13898b(obj) : m13895c(obj);
    }

    /* renamed from: a */
    protected Object m13903a(C7639qv c7639qv) {
        Class<?> componentType = this.f25378d ? this.f25376b.getComponentType() : this.f25376b;
        try {
            switch (this.f25375a) {
                case 10:
                    AbstractC7649rd abstractC7649rd = (AbstractC7649rd) componentType.newInstance();
                    c7639qv.m14010a(abstractC7649rd, C7652rg.m13840b(this.f25377c));
                    return abstractC7649rd;
                case 11:
                    AbstractC7649rd abstractC7649rd2 = (AbstractC7649rd) componentType.newInstance();
                    c7639qv.m14011a(abstractC7649rd2);
                    return abstractC7649rd2;
                default:
                    throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type ").append(this.f25375a).toString());
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Error reading extension field", e);
        } catch (IllegalAccessException e2) {
            String valueOf = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Error creating instance of class ").append(valueOf).toString(), e2);
        } catch (InstantiationException e3) {
            String valueOf2 = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 33).append("Error creating instance of class ").append(valueOf2).toString(), e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final T m13899a(List<C7651rf> list) {
        if (list == null) {
            return null;
        }
        return this.f25378d ? m13896b(list) : m13893c(list);
    }

    /* renamed from: a */
    protected void m13902a(C7651rf c7651rf, List<Object> list) {
        list.add(m13903a(C7639qv.m14009a(c7651rf.f25393b)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13900a(Object obj, C7640qw c7640qw) {
        if (this.f25378d) {
            m13894c(obj, c7640qw);
        } else {
            m13897b(obj, c7640qw);
        }
    }

    /* renamed from: b */
    protected int m13898b(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += m13895c(Array.get(obj, i2));
            }
        }
        return i;
    }

    /* renamed from: b */
    protected void m13897b(Object obj, C7640qw c7640qw) {
        try {
            c7640qw.m13918g(this.f25377c);
            switch (this.f25375a) {
                case 10:
                    int m13840b = C7652rg.m13840b(this.f25377c);
                    c7640qw.m13966a((AbstractC7649rd) obj);
                    c7640qw.m13924e(m13840b, 4);
                    return;
                case 11:
                    c7640qw.m13944b((AbstractC7649rd) obj);
                    return;
                default:
                    throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type ").append(this.f25375a).toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    protected int m13895c(Object obj) {
        int m13840b = C7652rg.m13840b(this.f25377c);
        switch (this.f25375a) {
            case 10:
                return C7640qw.m13949b(m13840b, (AbstractC7649rd) obj);
            case 11:
                return C7640qw.m13935c(m13840b, (AbstractC7649rd) obj);
            default:
                throw new IllegalArgumentException(new StringBuilder(24).append("Unknown type ").append(this.f25375a).toString());
        }
    }

    /* renamed from: c */
    protected void m13894c(Object obj, C7640qw c7640qw) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                m13897b(obj2, c7640qw);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7643qy)) {
            return false;
        }
        C7643qy c7643qy = (C7643qy) obj;
        return this.f25375a == c7643qy.f25375a && this.f25376b == c7643qy.f25376b && this.f25377c == c7643qy.f25377c && this.f25378d == c7643qy.f25378d;
    }

    public int hashCode() {
        return (this.f25378d ? 1 : 0) + ((((((this.f25375a + 1147) * 31) + this.f25376b.hashCode()) * 31) + this.f25377c) * 31);
    }
}
