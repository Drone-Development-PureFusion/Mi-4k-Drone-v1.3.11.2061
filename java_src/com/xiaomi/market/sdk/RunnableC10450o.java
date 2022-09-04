package com.xiaomi.market.sdk;

import android.app.DownloadManager;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.market.sdk.o */
/* loaded from: classes2.dex */
public class RunnableC10450o implements Runnable {

    /* renamed from: aS */
    final /* synthetic */ HandlerC10449n f32500aS;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10450o(HandlerC10449n handlerC10449n) {
        this.f32500aS = handlerC10449n;
    }

    @Override // java.lang.Runnable
    public void run() {
        C10448m c10448m;
        DownloadManager downloadManager;
        C10448m c10448m2;
        C10458w c10458w;
        C10448m c10448m3;
        C10458w c10458w2;
        C10448m c10448m4;
        C10458w c10458w3;
        String m5120c;
        C10448m c10448m5;
        Context context;
        C10448m c10448m6;
        C10448m c10448m7;
        C10452q c10452q;
        C10448m c10448m8;
        C10458w c10458w4;
        C10448m c10448m9;
        File file;
        C10448m c10448m10;
        File file2;
        C10448m c10448m11;
        C10452q c10452q2;
        C10448m c10448m12;
        C10448m c10448m13;
        DownloadManager downloadManager2;
        C10448m c10448m14;
        C10452q c10452q3;
        C10448m c10448m15;
        long j;
        C10448m c10448m16;
        C10458w c10458w5;
        C10448m c10448m17;
        C10458w c10458w6;
        C10448m c10448m18;
        C10458w c10458w7;
        C10448m c10448m19;
        C10458w c10458w8;
        C10448m c10448m20;
        C10458w c10458w9;
        C10448m c10448m21;
        File file3;
        C10448m c10448m22;
        Context context2;
        C10448m c10448m23;
        File file4;
        C10448m c10448m24;
        C10458w c10458w10;
        C10448m c10448m25;
        C10458w c10458w11;
        C10448m c10448m26;
        Context context3;
        C10448m c10448m27;
        Context context4;
        if (!C10454s.m5080f(true)) {
            c10448m26 = this.f32500aS.f32499aR;
            context3 = c10448m26.mContext;
            c10448m27 = this.f32500aS.f32499aR;
            context4 = c10448m27.mContext;
            Toast.makeText(context3, C10454s.m5081b(context4.getPackageName(), "string", "xiaomi_external_storage_unavailable"), 0).show();
            return;
        }
        c10448m = this.f32500aS.f32499aR;
        downloadManager = c10448m.f32496aO;
        if (downloadManager == null) {
            return;
        }
        c10448m2 = this.f32500aS.f32499aR;
        c10458w = c10448m2.f32492aK;
        if (TextUtils.isEmpty(c10458w.f32518bo)) {
            c10448m24 = this.f32500aS.f32499aR;
            c10458w10 = c10448m24.f32492aK;
            String str = c10458w10.f32512bi;
            c10448m25 = this.f32500aS.f32499aR;
            c10458w11 = c10448m25.f32492aK;
            m5120c = C10438c.m5120c(str, c10458w11.f32515bl);
        } else {
            c10448m3 = this.f32500aS.f32499aR;
            c10458w2 = c10448m3.f32492aK;
            String str2 = c10458w2.f32512bi;
            c10448m4 = this.f32500aS.f32499aR;
            c10458w3 = c10448m4.f32492aK;
            m5120c = C10438c.m5120c(str2, c10458w3.f32518bo);
        }
        Uri parse = Uri.parse(m5120c);
        c10448m5 = this.f32500aS.f32499aR;
        context = c10448m5.mContext;
        File file5 = new File(String.valueOf(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath()) + "/updates");
        if (file5 != null && !file5.exists()) {
            file5.mkdirs();
        }
        c10448m6 = this.f32500aS.f32499aR;
        StringBuilder append = new StringBuilder(String.valueOf(file5.getAbsolutePath())).append("/");
        c10448m7 = this.f32500aS.f32499aR;
        c10452q = c10448m7.f32493aL;
        StringBuilder append2 = append.append(c10452q.packageName);
        c10448m8 = this.f32500aS.f32499aR;
        c10458w4 = c10448m8.f32492aK;
        c10448m6.f32495aN = new File(append2.append(c10458w4.versionCode).toString());
        c10448m9 = this.f32500aS.f32499aR;
        file = c10448m9.f32495aN;
        if (file.exists()) {
            c10448m23 = this.f32500aS.f32499aR;
            file4 = c10448m23.f32495aN;
            file4.delete();
        }
        StringBuilder sb = new StringBuilder("file://");
        c10448m10 = this.f32500aS.f32499aR;
        file2 = c10448m10.f32495aN;
        Uri parse2 = Uri.parse(sb.append(file2.getAbsolutePath()).toString());
        DownloadManager.Request request = new DownloadManager.Request(parse);
        request.setMimeType("application/apk-ota");
        c10448m11 = this.f32500aS.f32499aR;
        c10452q2 = c10448m11.f32493aL;
        request.setTitle(c10452q2.f32502aT);
        request.setDestinationUri(parse2);
        c10448m12 = this.f32500aS.f32499aR;
        c10448m13 = this.f32500aS.f32499aR;
        downloadManager2 = c10448m13.f32496aO;
        c10448m12.f32494aM = downloadManager2.enqueue(request);
        ContentValues contentValues = new ContentValues();
        c10448m14 = this.f32500aS.f32499aR;
        c10452q3 = c10448m14.f32493aL;
        contentValues.put(C10447l.PACKAGE_NAME, c10452q3.packageName);
        c10448m15 = this.f32500aS.f32499aR;
        j = c10448m15.f32494aM;
        contentValues.put(C10447l.f32484aF, Long.valueOf(j));
        c10448m16 = this.f32500aS.f32499aR;
        c10458w5 = c10448m16.f32492aK;
        contentValues.put(C10447l.f32488aw, Integer.valueOf(c10458w5.versionCode));
        c10448m17 = this.f32500aS.f32499aR;
        c10458w6 = c10448m17.f32492aK;
        contentValues.put(C10447l.f32489ay, c10458w6.f32515bl);
        c10448m18 = this.f32500aS.f32499aR;
        c10458w7 = c10448m18.f32492aK;
        contentValues.put(C10447l.f32490az, c10458w7.f32516bm);
        c10448m19 = this.f32500aS.f32499aR;
        c10458w8 = c10448m19.f32492aK;
        contentValues.put(C10447l.f32481aB, c10458w8.f32518bo);
        c10448m20 = this.f32500aS.f32499aR;
        c10458w9 = c10448m20.f32492aK;
        contentValues.put(C10447l.f32482aC, c10458w9.f32519bp);
        c10448m21 = this.f32500aS.f32499aR;
        file3 = c10448m21.f32495aN;
        contentValues.put(C10447l.f32485aG, file3.getAbsolutePath());
        c10448m22 = this.f32500aS.f32499aR;
        context2 = c10448m22.mContext;
        C10453r.m5083j(context2).m5086a(contentValues);
    }
}
