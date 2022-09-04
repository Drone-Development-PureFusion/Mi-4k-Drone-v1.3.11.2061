package com.mining.app.zxing.view;

import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
/* renamed from: com.mining.app.zxing.view.a */
/* loaded from: classes2.dex */
public final class C10053a implements ResultPointCallback {

    /* renamed from: a */
    private final ViewfinderView f31057a;

    public C10053a(ViewfinderView viewfinderView) {
        this.f31057a = viewfinderView;
    }

    @Override // com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        this.f31057a.m6373a(resultPoint);
    }
}
