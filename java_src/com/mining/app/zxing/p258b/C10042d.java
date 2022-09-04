package com.mining.app.zxing.p258b;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import com.mining.app.zxing.activity.MipcaActivityCapture;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.mining.app.zxing.b.d */
/* loaded from: classes2.dex */
public final class C10042d extends Thread {

    /* renamed from: a */
    public static final String f30998a = "barcode_bitmap";

    /* renamed from: b */
    private final MipcaActivityCapture f30999b;

    /* renamed from: d */
    private Handler f31001d;

    /* renamed from: e */
    private final CountDownLatch f31002e = new CountDownLatch(1);

    /* renamed from: c */
    private final Hashtable<DecodeHintType, Object> f31000c = new Hashtable<>(3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10042d(MipcaActivityCapture mipcaActivityCapture, Vector<BarcodeFormat> vector, String str, ResultPointCallback resultPointCallback) {
        this.f30999b = mipcaActivityCapture;
        if (vector == null || vector.isEmpty()) {
            vector = new Vector<>();
            vector.addAll(C10040b.f30991b);
        }
        this.f31000c.put(DecodeHintType.POSSIBLE_FORMATS, vector);
        if (str != null) {
            this.f31000c.put(DecodeHintType.CHARACTER_SET, str);
        }
        this.f31000c.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, resultPointCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Handler m6379a() {
        try {
            this.f31002e.await();
        } catch (InterruptedException e) {
        }
        return this.f31001d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f31001d = new HandlerC10041c(this.f30999b, this.f31000c);
        this.f31002e.countDown();
        Looper.loop();
    }
}
