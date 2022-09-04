package com.mining.app.zxing.p258b;

import android.app.Activity;
import android.content.DialogInterface;
/* renamed from: com.mining.app.zxing.b.e */
/* loaded from: classes2.dex */
public final class DialogInterface$OnCancelListenerC10043e implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener, Runnable {

    /* renamed from: a */
    private final Activity f31003a;

    public DialogInterface$OnCancelListenerC10043e(Activity activity) {
        this.f31003a = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        run();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        run();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f31003a.finish();
    }
}
