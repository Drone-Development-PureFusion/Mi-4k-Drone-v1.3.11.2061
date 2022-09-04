package com.tencent.open.p266c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
/* renamed from: com.tencent.open.c.a */
/* loaded from: classes2.dex */
public class C10278a extends RelativeLayout {

    /* renamed from: a */
    private static final String f31965a = C10278a.class.getName();

    /* renamed from: b */
    private Rect f31966b;

    /* renamed from: c */
    private boolean f31967c = false;

    /* renamed from: d */
    private AbstractC10279a f31968d = null;

    /* renamed from: com.tencent.open.c.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC10279a {
        void onKeyboardHidden();

        void onKeyboardShown(int i);
    }

    public C10278a(Context context) {
        super(context);
        this.f31966b = null;
        if (this.f31966b == null) {
            this.f31966b = new Rect();
        }
    }

    /* renamed from: a */
    public void m5615a(AbstractC10279a abstractC10279a) {
        this.f31968d = abstractC10279a;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        Activity activity = (Activity) getContext();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.f31966b);
        int height = (activity.getWindowManager().getDefaultDisplay().getHeight() - this.f31966b.top) - size;
        if (this.f31968d != null && size != 0) {
            if (height > 100) {
                this.f31968d.onKeyboardShown((Math.abs(this.f31966b.height()) - getPaddingBottom()) - getPaddingTop());
            } else {
                this.f31968d.onKeyboardHidden();
            }
        }
        super.onMeasure(i, i2);
    }
}
