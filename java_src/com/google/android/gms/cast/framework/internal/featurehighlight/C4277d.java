package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.C3424R;
import com.google.android.gms.internal.C6981fq;
/* renamed from: com.google.android.gms.cast.framework.internal.featurehighlight.d */
/* loaded from: classes2.dex */
class C4277d {

    /* renamed from: a */
    private final Rect f16217a = new Rect();

    /* renamed from: b */
    private final int f16218b;

    /* renamed from: c */
    private final int f16219c;

    /* renamed from: d */
    private final int f16220d;

    /* renamed from: e */
    private final int f16221e;

    /* renamed from: f */
    private final C4267a f16222f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4277d(C4267a c4267a) {
        this.f16222f = (C4267a) C6981fq.m15841a(c4267a);
        Resources resources = c4267a.getResources();
        this.f16218b = resources.getDimensionPixelSize(C3424R.dimen.cast_libraries_material_featurehighlight_inner_radius);
        this.f16219c = resources.getDimensionPixelOffset(C3424R.dimen.cast_libraries_material_featurehighlight_inner_margin);
        this.f16220d = resources.getDimensionPixelSize(C3424R.dimen.cast_libraries_material_featurehighlight_text_max_width);
        this.f16221e = resources.getDimensionPixelSize(C3424R.dimen.cast_libraries_material_featurehighlight_text_horizontal_offset);
    }

    /* renamed from: a */
    private int m24763a(Rect rect) {
        Drawable m24782b = this.f16222f.m24782b();
        return Math.max(this.f16218b * 2, m24782b != null ? m24782b.getBounds().height() : rect.height());
    }

    /* renamed from: a */
    private int m24760a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = i3 / 2;
        int i6 = i4 - i <= i2 - i4 ? (i4 - i5) + this.f16221e : (i4 - i5) - this.f16221e;
        return i6 - marginLayoutParams.leftMargin < i ? i + marginLayoutParams.leftMargin : (i6 + i3) + marginLayoutParams.rightMargin > i2 ? (i2 - i3) - marginLayoutParams.rightMargin : i6;
    }

    /* renamed from: a */
    private void m24761a(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.min((i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, this.f16220d), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
    }

    /* renamed from: a */
    private void m24759a(View view, Rect rect) {
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: b */
    private void m24758b(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    /* renamed from: c */
    private void m24757c(View view, int i, int i2) {
        view.layout(i, i2 - view.getMeasuredHeight(), view.getMeasuredWidth() + i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m24762a(Rect rect, Rect rect2) {
        boolean z = false;
        View m24779c = this.f16222f.m24779c();
        if (rect.isEmpty() || rect2.isEmpty()) {
            m24779c.layout(0, 0, 0, 0);
        } else {
            int centerY = rect.centerY();
            int centerX = rect.centerX();
            if (centerY < rect2.centerY()) {
                z = true;
            }
            int m24763a = m24763a(rect);
            int i = this.f16219c + (m24763a / 2) + centerY;
            if (z) {
                m24761a(m24779c, rect2.width(), rect2.bottom - i);
                m24758b(m24779c, m24760a(m24779c, rect2.left, rect2.right, m24779c.getMeasuredWidth(), centerX), i);
            } else {
                int i2 = (centerY - (m24763a / 2)) - this.f16219c;
                m24761a(m24779c, rect2.width(), i2 - rect2.top);
                m24757c(m24779c, m24760a(m24779c, rect2.left, rect2.right, m24779c.getMeasuredWidth(), centerX), i2);
            }
        }
        m24759a(m24779c, this.f16217a);
        this.f16222f.m24776d().m24751a(rect, this.f16217a);
        this.f16222f.m24773e().m24767a(rect);
    }
}
