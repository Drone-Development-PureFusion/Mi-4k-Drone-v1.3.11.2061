package com.fimi.kernel.view.dialog;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.fimi.kernel.C1572R;
/* renamed from: com.fimi.kernel.view.dialog.b */
/* loaded from: classes.dex */
public class ProgressDialogC1698b extends ProgressDialog {

    /* renamed from: a */
    private String f4234a;

    public ProgressDialogC1698b(Context context) {
        super(context);
    }

    public ProgressDialogC1698b(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    public void m34406a(String str) {
        this.f4234a = str;
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1572R.layout.dialog_easyprogress);
        TextView textView = (TextView) findViewById(C1572R.C1574id.pb_easyMessage);
        if (this.f4234a != null) {
            textView.setText(this.f4234a);
        }
    }
}
