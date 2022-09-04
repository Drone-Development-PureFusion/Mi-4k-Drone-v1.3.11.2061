package it.sephiroth.android.library.p278a.p280b;

import android.annotation.TargetApi;
import android.view.View;
import it.sephiroth.android.library.p278a.C10890b;
/* renamed from: it.sephiroth.android.library.a.b.a */
/* loaded from: classes2.dex */
public class C10893a extends C10890b.C10892b {
    public C10893a(View view) {
        super(view);
    }

    @Override // it.sephiroth.android.library.p278a.C10890b.C10892b, it.sephiroth.android.library.p278a.C10890b.AbstractC10891a
    @TargetApi(14)
    public void a(int i) {
        this.f34902a.setScrollX(i);
    }

    @Override // it.sephiroth.android.library.p278a.C10890b.C10892b, it.sephiroth.android.library.p278a.C10890b.AbstractC10891a
    @TargetApi(11)
    public boolean a() {
        return this.f34902a.isHardwareAccelerated();
    }
}
