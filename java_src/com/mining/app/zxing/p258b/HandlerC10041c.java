package com.mining.app.zxing.p258b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fimi.overseas.soul.C1704R;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import com.mining.app.zxing.activity.MipcaActivityCapture;
import com.mining.app.zxing.p257a.C10032c;
import com.mining.app.zxing.p257a.C10034e;
import java.util.Hashtable;
/* renamed from: com.mining.app.zxing.b.c */
/* loaded from: classes2.dex */
final class HandlerC10041c extends Handler {

    /* renamed from: a */
    private static final String f30995a = HandlerC10041c.class.getSimpleName();

    /* renamed from: b */
    private final MipcaActivityCapture f30996b;

    /* renamed from: c */
    private final MultiFormatReader f30997c = new MultiFormatReader();

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC10041c(MipcaActivityCapture mipcaActivityCapture, Hashtable<DecodeHintType, Object> hashtable) {
        this.f30997c.setHints(hashtable);
        this.f30996b = mipcaActivityCapture;
    }

    /* renamed from: a */
    private void m6380a(byte[] bArr, int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        Result result = null;
        byte[] bArr2 = new byte[bArr.length];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
            }
        }
        C10034e m6411a = C10032c.m6416a().m6411a(bArr2, i2, i);
        try {
            result = this.f30997c.decodeWithState(new BinaryBitmap(new HybridBinarizer(m6411a)));
        } catch (ReaderException e) {
        } finally {
            this.f30997c.reset();
        }
        if (result == null) {
            Message.obtain(this.f30996b.m6387b(), (int) C1704R.C1706id.decode_failed).sendToTarget();
            return;
        }
        Log.d(f30995a, "Found barcode (" + (System.currentTimeMillis() - currentTimeMillis) + " ms):\n" + result.toString());
        Message obtain = Message.obtain(this.f30996b.m6387b(), C1704R.C1706id.decode_succeeded, result);
        Bundle bundle = new Bundle();
        bundle.putParcelable(C10042d.f30998a, m6411a.m6392c());
        obtain.setData(bundle);
        obtain.sendToTarget();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (message.what) {
            case C1704R.C1706id.decode /* 2131755031 */:
                m6380a((byte[]) message.obj, message.arg1, message.arg2);
                return;
            case C1704R.C1706id.quit /* 2131755040 */:
                Looper.myLooper().quit();
                return;
            default:
                return;
        }
    }
}
