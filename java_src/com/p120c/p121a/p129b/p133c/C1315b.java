package com.p120c.p121a.p129b.p133c;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import com.p120c.p121a.p129b.p130a.EnumC1301f;
import com.p120c.p121a.p129b.p135e.AbstractC1333a;
/* renamed from: com.c.a.b.c.b */
/* loaded from: classes.dex */
public class C1315b implements AbstractC1314a {

    /* renamed from: a */
    private final int f3344a;

    /* renamed from: b */
    private final boolean f3345b;

    /* renamed from: c */
    private final boolean f3346c;

    /* renamed from: d */
    private final boolean f3347d;

    public C1315b(int i) {
        this(i, true, true, true);
    }

    public C1315b(int i, boolean z, boolean z2, boolean z3) {
        this.f3344a = i;
        this.f3345b = z;
        this.f3346c = z2;
        this.f3347d = z3;
    }

    /* renamed from: a */
    public static void m35796a(View view, int i) {
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(i);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            view.startAnimation(alphaAnimation);
        }
    }

    @Override // com.p120c.p121a.p129b.p133c.AbstractC1314a
    /* renamed from: a */
    public void mo35795a(Bitmap bitmap, AbstractC1333a abstractC1333a, EnumC1301f enumC1301f) {
        abstractC1333a.mo35685a(bitmap);
        if ((!this.f3345b || enumC1301f != EnumC1301f.NETWORK) && ((!this.f3346c || enumC1301f != EnumC1301f.DISC_CACHE) && (!this.f3347d || enumC1301f != EnumC1301f.MEMORY_CACHE))) {
            return;
        }
        m35796a(abstractC1333a.mo35679d(), this.f3344a);
    }
}
