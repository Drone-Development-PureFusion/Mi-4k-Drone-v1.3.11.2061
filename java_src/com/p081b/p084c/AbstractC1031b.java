package com.p081b.p084c;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import com.p081b.p082a.AbstractC0971a;
import java.util.WeakHashMap;
/* renamed from: com.b.c.b */
/* loaded from: classes.dex */
public abstract class AbstractC1031b {

    /* renamed from: a */
    private static final WeakHashMap<View, AbstractC1031b> f2351a = new WeakHashMap<>(0);

    /* renamed from: a */
    public static AbstractC1031b m36946a(View view) {
        AbstractC1031b abstractC1031b = f2351a.get(view);
        if (abstractC1031b == null) {
            int intValue = Integer.valueOf(Build.VERSION.SDK).intValue();
            abstractC1031b = intValue >= 14 ? new C1037d(view) : intValue >= 11 ? new C1032c(view) : new C1039e(view);
            f2351a.put(view, abstractC1031b);
        }
        return abstractC1031b;
    }

    /* renamed from: a */
    public abstract long mo36932a();

    /* renamed from: a */
    public abstract AbstractC1031b mo36931a(float f);

    /* renamed from: a */
    public abstract AbstractC1031b mo36927a(long j);

    /* renamed from: a */
    public abstract AbstractC1031b mo36926a(Interpolator interpolator);

    /* renamed from: a */
    public abstract AbstractC1031b mo36925a(AbstractC0971a.AbstractC0972a abstractC0972a);

    /* renamed from: b */
    public abstract long mo36921b();

    /* renamed from: b */
    public abstract AbstractC1031b mo36920b(float f);

    /* renamed from: b */
    public abstract AbstractC1031b mo36918b(long j);

    /* renamed from: c */
    public abstract AbstractC1031b mo36915c(float f);

    /* renamed from: c */
    public abstract void mo36916c();

    /* renamed from: d */
    public abstract AbstractC1031b mo36911d(float f);

    /* renamed from: d */
    public abstract void mo36912d();

    /* renamed from: e */
    public abstract AbstractC1031b mo36908e(float f);

    /* renamed from: f */
    public abstract AbstractC1031b mo36907f(float f);

    /* renamed from: g */
    public abstract AbstractC1031b mo36906g(float f);

    /* renamed from: h */
    public abstract AbstractC1031b mo36905h(float f);

    /* renamed from: i */
    public abstract AbstractC1031b mo36904i(float f);

    /* renamed from: j */
    public abstract AbstractC1031b mo36903j(float f);

    /* renamed from: k */
    public abstract AbstractC1031b mo36902k(float f);

    /* renamed from: l */
    public abstract AbstractC1031b mo36901l(float f);

    /* renamed from: m */
    public abstract AbstractC1031b mo36900m(float f);

    /* renamed from: n */
    public abstract AbstractC1031b mo36899n(float f);

    /* renamed from: o */
    public abstract AbstractC1031b mo36898o(float f);

    /* renamed from: p */
    public abstract AbstractC1031b mo36897p(float f);

    /* renamed from: q */
    public abstract AbstractC1031b mo36896q(float f);

    /* renamed from: r */
    public abstract AbstractC1031b mo36895r(float f);

    /* renamed from: s */
    public abstract AbstractC1031b mo36894s(float f);

    /* renamed from: t */
    public abstract AbstractC1031b mo36893t(float f);
}
