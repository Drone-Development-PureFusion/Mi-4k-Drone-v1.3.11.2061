package com.xiaomi.market.sdk;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.drive.AbstractC4808e;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.market.sdk.p */
/* loaded from: classes2.dex */
public class RunnableC10451p implements Runnable {

    /* renamed from: aS */
    final /* synthetic */ HandlerC10449n f32501aS;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10451p(HandlerC10449n handlerC10449n) {
        this.f32501aS = handlerC10449n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r0 == null) goto L21;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        C10448m c10448m;
        C10452q c10452q;
        C10448m c10448m2;
        C10448m c10448m3;
        Context context;
        C10448m c10448m4;
        C10452q c10452q2;
        Cursor cursor;
        C10448m c10448m5;
        Context context2;
        C10448m c10448m6;
        C10452q c10452q3;
        C10448m c10448m7;
        C10448m c10448m8;
        C10448m c10448m9;
        C10448m c10448m10;
        C10458w c10458w;
        C10448m c10448m11;
        File file;
        String absolutePath;
        C10448m c10448m12;
        C10458w c10458w2;
        C10448m c10448m13;
        Context context3;
        C10448m c10448m14;
        C10458w c10458w3;
        C10448m c10448m15;
        File file2;
        C10448m c10448m16;
        C10458w c10458w4;
        C10448m c10448m17;
        C10458w c10458w5;
        C10448m c10448m18;
        File file3;
        c10448m = this.f32501aS.f32499aR;
        c10452q = c10448m.f32493aL;
        if (c10452q != null) {
            c10448m17 = this.f32501aS.f32499aR;
            c10458w5 = c10448m17.f32492aK;
            if (c10458w5 != null) {
                c10448m18 = this.f32501aS.f32499aR;
                file3 = c10448m18.f32495aN;
            }
        }
        c10448m2 = this.f32501aS.f32499aR;
        c10448m3 = this.f32501aS.f32499aR;
        context = c10448m3.mContext;
        c10448m2.f32493aL = XiaomiUpdateAgent.m5163p(context);
        c10448m4 = this.f32501aS.f32499aR;
        c10452q2 = c10448m4.f32493aL;
        if (c10452q2 == null) {
            return;
        }
        try {
            c10448m5 = this.f32501aS.f32499aR;
            context2 = c10448m5.mContext;
            C10453r m5083j = C10453r.m5083j(context2);
            String[] strArr = C10447l.f32487aI;
            c10448m6 = this.f32501aS.f32499aR;
            c10452q3 = c10448m6.f32493aL;
            cursor = m5083j.query(C10447l.f32483aE, strArr, "package_name=?", new String[]{c10452q3.packageName}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        c10448m7 = this.f32501aS.f32499aR;
                        c10448m7.f32494aM = cursor.getLong(cursor.getColumnIndex(C10447l.f32484aF));
                        C10458w c10458w6 = new C10458w();
                        c10458w6.versionCode = cursor.getInt(cursor.getColumnIndex(C10447l.f32488aw));
                        c10458w6.f32515bl = cursor.getString(cursor.getColumnIndex(C10447l.f32489ay));
                        c10458w6.f32516bm = cursor.getString(cursor.getColumnIndex(C10447l.f32490az));
                        c10458w6.f32518bo = cursor.getString(cursor.getColumnIndex(C10447l.f32481aB));
                        c10458w6.f32519bp = cursor.getString(cursor.getColumnIndex(C10447l.f32482aC));
                        c10448m8 = this.f32501aS.f32499aR;
                        c10448m8.f32492aK = c10458w6;
                        String string = cursor.getString(cursor.getColumnIndex(C10447l.f32485aG));
                        if (TextUtils.isEmpty(string)) {
                            if (cursor == null) {
                                return;
                            }
                            cursor.close();
                            return;
                        }
                        c10448m9 = this.f32501aS.f32499aR;
                        c10448m9.f32495aN = new File(string);
                        if (cursor != null) {
                            cursor.close();
                        }
                        c10448m10 = this.f32501aS.f32499aR;
                        c10458w = c10448m10.f32492aK;
                        if (!TextUtils.isEmpty(c10458w.f32518bo)) {
                            HandlerC10449n handlerC10449n = this.f32501aS;
                            c10448m15 = this.f32501aS.f32499aR;
                            file2 = c10448m15.f32495aN;
                            String absolutePath2 = file2.getAbsolutePath();
                            c10448m16 = this.f32501aS.f32499aR;
                            c10458w4 = c10448m16.f32492aK;
                            absolutePath = handlerC10449n.m5091e(absolutePath2, c10458w4.f32519bp);
                        } else {
                            c10448m11 = this.f32501aS.f32499aR;
                            file = c10448m11.f32495aN;
                            absolutePath = file.getAbsolutePath();
                        }
                        c10448m12 = this.f32501aS.f32499aR;
                        c10458w2 = c10448m12.f32492aK;
                        if (!TextUtils.isEmpty(c10458w2.f32516bm) && !TextUtils.isEmpty(absolutePath)) {
                            String m5143a = C10437b.m5143a(new File(absolutePath));
                            c10448m14 = this.f32501aS.f32499aR;
                            c10458w3 = c10448m14.f32492aK;
                            if (!TextUtils.equals(m5143a, c10458w3.f32516bm)) {
                                return;
                            }
                        }
                        Uri parse = Uri.parse("file://" + absolutePath);
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(parse, "application/vnd.android.package-archive");
                        intent.setFlags(AbstractC4808e.f17570a_);
                        c10448m13 = this.f32501aS.f32499aR;
                        context3 = c10448m13.mContext;
                        context3.startActivity(intent);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor == null) {
                return;
            }
            cursor.close();
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }
}
