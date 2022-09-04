package com.mining.app.zxing.p257a;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.mining.app.zxing.a.f */
/* loaded from: classes2.dex */
public final class C10035f implements Camera.PreviewCallback {

    /* renamed from: a */
    private static final String f30966a = C10035f.class.getSimpleName();

    /* renamed from: b */
    private final C10031b f30967b;

    /* renamed from: c */
    private final boolean f30968c;

    /* renamed from: d */
    private Handler f30969d;

    /* renamed from: e */
    private int f30970e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10035f(C10031b c10031b, boolean z) {
        this.f30967b = c10031b;
        this.f30968c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6391a(Handler handler, int i) {
        this.f30969d = handler;
        this.f30970e = i;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point m6429a = this.f30967b.m6429a();
        if (!this.f30968c) {
            camera.setPreviewCallback(null);
        }
        if (this.f30969d == null) {
            Log.d(f30966a, "Got preview callback, but no handler for it");
            return;
        }
        this.f30969d.obtainMessage(this.f30970e, m6429a.x, m6429a.y, bArr).sendToTarget();
        this.f30969d = null;
    }
}
