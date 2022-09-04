package com.fimi.soul.module.droneui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import com.fimi.overseas.soul.C1704R;
/* renamed from: com.fimi.soul.module.droneui.c */
/* loaded from: classes.dex */
public class C2757c {
    /* renamed from: a */
    public static ProgressDialog m30400a(Context context, int i) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.onWindowFocusChanged(false);
        progressDialog.setCancelable(false);
        progressDialog.setProgressStyle(1);
        progressDialog.setTitle(context.getResources().getString(C1704R.C1707string.updatetitle));
        progressDialog.setMax(i);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        if (!((Activity) context).isFinishing()) {
            progressDialog.show();
        }
        return progressDialog;
    }

    /* renamed from: a */
    public static ProgressDialog m30399a(Context context, int i, int i2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.onWindowFocusChanged(false);
        progressDialog.setCancelable(false);
        progressDialog.setProgressStyle(1);
        progressDialog.setTitle(context.getResources().getString(C1704R.C1707string.updatetitle));
        progressDialog.setMax(i2);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        if (!((Activity) context).isFinishing()) {
            progressDialog.show();
        }
        return progressDialog;
    }
}
