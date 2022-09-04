package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;
import android.webkit.WebChromeClient;
@aaa
@TargetApi(14)
/* loaded from: classes.dex */
public final class adi extends adg {
    public adi(acy acyVar) {
        super(acyVar);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        a(view, i, customViewCallback);
    }
}
