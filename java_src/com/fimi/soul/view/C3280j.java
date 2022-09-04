package com.fimi.soul.view;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
/* renamed from: com.fimi.soul.view.j */
/* loaded from: classes2.dex */
public class C3280j extends PopupWindow {
    public C3280j(Context context) {
        super(context);
    }

    public C3280j(View view) {
        super(view);
    }

    public C3280j(View view, int i, int i2) {
        super(view, i, i2, true);
    }

    /* renamed from: a */
    public void m28522a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = {iArr[0], iArr[1]};
        super.showAtLocation(view, 51, iArr2[0], iArr2[1] - (getHeight() / 2));
    }
}
