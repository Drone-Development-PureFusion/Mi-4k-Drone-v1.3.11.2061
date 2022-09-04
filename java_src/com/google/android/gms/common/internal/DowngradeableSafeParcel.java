package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0437d;
/* loaded from: classes2.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: a */
    private static final Object f16990a = new Object();

    /* renamed from: b */
    private static ClassLoader f16991b = null;

    /* renamed from: c */
    private static Integer f16992c = null;

    /* renamed from: d */
    private boolean f16993d = false;

    /* renamed from: a */
    private static boolean m23741a(Class<?> cls) {
        try {
            return SafeParcelable.NULL.equals(cls.getField(AbstractC0437d.f576k).get(null));
        } catch (IllegalAccessException e) {
            return false;
        } catch (NoSuchFieldException e2) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j_ */
    public static boolean m23740j_(String str) {
        ClassLoader m23739p_ = m23739p_();
        if (m23739p_ == null) {
            return true;
        }
        try {
            return m23741a(m23739p_.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: p_ */
    protected static ClassLoader m23739p_() {
        synchronized (f16990a) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q_ */
    public static Integer m23738q_() {
        synchronized (f16990a) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r_ */
    public boolean m23737r_() {
        return false;
    }
}
