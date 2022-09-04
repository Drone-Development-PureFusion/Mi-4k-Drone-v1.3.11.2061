package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.net.Uri;
import android.widget.ImageView;
/* loaded from: classes2.dex */
public final class ajb extends ImageView {

    /* renamed from: a */
    private Uri f22003a;

    /* renamed from: b */
    private int f22004b;

    /* renamed from: a */
    public int m17139a() {
        return this.f22004b;
    }

    /* renamed from: a */
    public void m17138a(int i) {
        this.f22004b = i;
    }

    /* renamed from: a */
    public void m17137a(Uri uri) {
        this.f22003a = uri;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
