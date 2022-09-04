package com.mining.app.zxing.p258b;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import android.util.Log;
import com.fimi.overseas.soul.C1704R;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.mining.app.zxing.activity.MipcaActivityCapture;
import com.mining.app.zxing.p257a.C10032c;
import com.mining.app.zxing.view.C10053a;
import java.util.Vector;
/* renamed from: com.mining.app.zxing.b.a */
/* loaded from: classes.dex */
public final class HandlerC10038a extends Handler {

    /* renamed from: a */
    private static final String f30982a = HandlerC10038a.class.getSimpleName();

    /* renamed from: b */
    private final MipcaActivityCapture f30983b;

    /* renamed from: c */
    private final C10042d f30984c;

    /* renamed from: d */
    private EnumC10039a f30985d = EnumC10039a.SUCCESS;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mining.app.zxing.b.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC10039a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public HandlerC10038a(MipcaActivityCapture mipcaActivityCapture, Vector<BarcodeFormat> vector, String str) {
        this.f30983b = mipcaActivityCapture;
        this.f30984c = new C10042d(mipcaActivityCapture, vector, str, new C10053a(mipcaActivityCapture.m6390a()));
        this.f30984c.start();
        C10032c.m6416a().m6407c();
        m6384b();
    }

    /* renamed from: b */
    private void m6384b() {
        if (this.f30985d == EnumC10039a.SUCCESS) {
            this.f30985d = EnumC10039a.PREVIEW;
            C10032c.m6416a().m6413a(this.f30984c.m6379a(), C1704R.C1706id.decode);
            C10032c.m6416a().m6408b(this, C1704R.C1706id.auto_focus);
            this.f30983b.m6386c();
        }
    }

    /* renamed from: a */
    public void m6385a() {
        this.f30985d = EnumC10039a.DONE;
        C10032c.m6416a().m6406d();
        Message.obtain(this.f30984c.m6379a(), (int) C1704R.C1706id.quit).sendToTarget();
        try {
            this.f30984c.join();
        } catch (InterruptedException e) {
        }
        removeMessages(C1704R.C1706id.decode_succeeded);
        removeMessages(C1704R.C1706id.decode_failed);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (message.what) {
            case C1704R.C1706id.auto_focus /* 2131755016 */:
                if (this.f30985d != EnumC10039a.PREVIEW) {
                    return;
                }
                C10032c.m6416a().m6408b(this, C1704R.C1706id.auto_focus);
                return;
            case C1704R.C1706id.decode_failed /* 2131755032 */:
                this.f30985d = EnumC10039a.PREVIEW;
                C10032c.m6416a().m6413a(this.f30984c.m6379a(), C1704R.C1706id.decode);
                return;
            case C1704R.C1706id.decode_succeeded /* 2131755033 */:
                Log.d(f30982a, "Got decode succeeded message");
                this.f30985d = EnumC10039a.SUCCESS;
                Bundle data = message.getData();
                this.f30983b.m6388a((Result) message.obj, data == null ? null : (Bitmap) data.getParcelable(C10042d.f30998a));
                return;
            case C1704R.C1706id.launch_product_query /* 2131755037 */:
                Log.d(f30982a, "Got product query message");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj));
                intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                this.f30983b.startActivity(intent);
                return;
            case C1704R.C1706id.restart_preview /* 2131755041 */:
                Log.d(f30982a, "Got restart preview message");
                m6384b();
                return;
            case C1704R.C1706id.return_scan_result /* 2131755042 */:
                Log.d(f30982a, "Got return scan result message");
                this.f30983b.setResult(-1, (Intent) message.obj);
                this.f30983b.finish();
                return;
            default:
                return;
        }
    }
}
