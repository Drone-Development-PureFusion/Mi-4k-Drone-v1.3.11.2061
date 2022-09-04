package com.mining.app.zxing.p257a;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
/* renamed from: com.mining.app.zxing.a.a */
/* loaded from: classes2.dex */
final class C10030a implements Camera.AutoFocusCallback {

    /* renamed from: a */
    private static final String f30926a = C10030a.class.getSimpleName();

    /* renamed from: b */
    private static final long f30927b = 1500;

    /* renamed from: c */
    private Handler f30928c;

    /* renamed from: d */
    private int f30929d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6430a(Handler handler, int i) {
        this.f30928c = handler;
        this.f30929d = i;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        if (this.f30928c == null) {
            Log.d(f30926a, "Got auto-focus callback, but no handler for it");
            return;
        }
        this.f30928c.sendMessageDelayed(this.f30928c.obtainMessage(this.f30929d, Boolean.valueOf(z)), f30927b);
        this.f30928c = null;
    }
}
