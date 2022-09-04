package com.tencent.connect.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.fimi.kernel.C1576a;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.utils.AsynLoadImgBack;
import com.tencent.open.utils.Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/* renamed from: com.tencent.connect.share.a */
/* loaded from: classes2.dex */
public class C10146a {
    /* renamed from: a */
    public static final int m6057a(BitmapFactory.Options options, int i, int i2) {
        int m6054b = m6054b(options, i, i2);
        if (m6054b <= 8) {
            int i3 = 1;
            while (i3 < m6054b) {
                i3 <<= 1;
            }
            return i3;
        }
        return ((m6054b + 7) / 8) * 8;
    }

    /* renamed from: a */
    private static Bitmap m6059a(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            width = height;
        }
        float f = i / width;
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: a */
    public static final Bitmap m6056a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (options.mCancel || options.outWidth == -1 || options.outHeight == -1) {
            return null;
        }
        if (i2 <= i3) {
            i2 = i3;
        }
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        if (i2 > i) {
            options.inSampleSize = m6057a(options, -1, i * i);
        }
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile == null) {
            return null;
        }
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i4 <= i5) {
            i4 = i5;
        }
        return i4 > i ? m6059a(decodeFile, i) : decodeFile;
    }

    /* renamed from: a */
    protected static final String m6058a(Bitmap bitmap, String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        String stringBuffer = new StringBuffer(str).append(str2).toString();
        File file2 = new File(stringBuffer);
        if (file2.exists()) {
            file2.delete();
        }
        if (bitmap != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                bitmap.recycle();
                return stringBuffer;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m6061a(Context context, final String str, final AsynLoadImgBack asynLoadImgBack) {
        C10257f.m5673b("AsynScaleCompressImage", "scaleCompressImage");
        if (TextUtils.isEmpty(str)) {
            asynLoadImgBack.saved(1, null);
        } else if (!Util.hasSDCard()) {
            asynLoadImgBack.saved(2, null);
        } else {
            final Handler handler = new Handler(context.getMainLooper()) { // from class: com.tencent.connect.share.a.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    switch (message.what) {
                        case 101:
                            asynLoadImgBack.saved(0, (String) message.obj);
                            return;
                        case 102:
                            asynLoadImgBack.saved(message.arg1, null);
                            return;
                        default:
                            super.handleMessage(message);
                            return;
                    }
                }
            };
            new Thread(new Runnable() { // from class: com.tencent.connect.share.a.2
                @Override // java.lang.Runnable
                public void run() {
                    String m6058a;
                    Bitmap m6056a = C10146a.m6056a(str, 140);
                    if (m6056a != null) {
                        String str2 = Environment.getExternalStorageDirectory() + "/tmp/";
                        String str3 = "share2qq_temp" + Util.encrypt(str) + ".jpg";
                        if (!C10146a.m6053b(str, 140, 140)) {
                            C10257f.m5673b("AsynScaleCompressImage", "not out of bound,not compress!");
                            m6058a = str;
                        } else {
                            C10257f.m5673b("AsynScaleCompressImage", "out of bound,compress!");
                            m6058a = C10146a.m6058a(m6056a, str2, str3);
                        }
                        C10257f.m5673b("AsynScaleCompressImage", "-->destFilePath: " + m6058a);
                        if (m6058a != null) {
                            Message obtainMessage = handler.obtainMessage(101);
                            obtainMessage.obj = m6058a;
                            handler.sendMessage(obtainMessage);
                            return;
                        }
                    }
                    Message obtainMessage2 = handler.obtainMessage(102);
                    obtainMessage2.arg1 = 3;
                    handler.sendMessage(obtainMessage2);
                }
            }).start();
        }
    }

    /* renamed from: a */
    public static final void m6060a(Context context, final ArrayList<String> arrayList, final AsynLoadImgBack asynLoadImgBack) {
        C10257f.m5673b("AsynScaleCompressImage", "batchScaleCompressImage");
        if (arrayList == null) {
            asynLoadImgBack.saved(1, null);
            return;
        }
        final Handler handler = new Handler(context.getMainLooper()) { // from class: com.tencent.connect.share.a.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 101:
                        asynLoadImgBack.batchSaved(0, message.getData().getStringArrayList(C1576a.f3872b));
                        return;
                    default:
                        super.handleMessage(message);
                        return;
                }
            }
        };
        new Thread(new Runnable() { // from class: com.tencent.connect.share.a.4
            @Override // java.lang.Runnable
            public void run() {
                Bitmap m6056a;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= arrayList.size()) {
                        Message obtainMessage = handler.obtainMessage(101);
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList(C1576a.f3872b, arrayList);
                        obtainMessage.setData(bundle);
                        handler.sendMessage(obtainMessage);
                        return;
                    }
                    String str = (String) arrayList.get(i2);
                    if (!Util.isValidUrl(str) && Util.fileExists(str) && (m6056a = C10146a.m6056a(str, 10000)) != null) {
                        String str2 = Environment.getExternalStorageDirectory() + "/tmp/";
                        String str3 = "share2qzone_temp" + Util.encrypt(str) + ".jpg";
                        if (!C10146a.m6053b(str, 640, 10000)) {
                            C10257f.m5673b("AsynScaleCompressImage", "not out of bound,not compress!");
                        } else {
                            C10257f.m5673b("AsynScaleCompressImage", "out of bound, compress!");
                            str = C10146a.m6058a(m6056a, str2, str3);
                        }
                        if (str != null) {
                            arrayList.set(i2, str);
                        }
                    }
                    i = i2 + 1;
                }
            }
        }).start();
    }

    /* renamed from: b */
    private static int m6054b(BitmapFactory.Options options, int i, int i2) {
        double d = options.outWidth;
        double d2 = options.outHeight;
        int ceil = i2 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / i2));
        int min = i == -1 ? 128 : (int) Math.min(Math.floor(d / i), Math.floor(d2 / i));
        if (min < ceil) {
            return ceil;
        }
        if (i2 == -1 && i == -1) {
            return 1;
        }
        return i != -1 ? min : ceil;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m6053b(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (options.mCancel || options.outWidth == -1 || options.outHeight == -1) {
            return false;
        }
        int i5 = i3 > i4 ? i3 : i4;
        if (i3 >= i4) {
            i3 = i4;
        }
        C10257f.m5673b("AsynScaleCompressImage", "longSide=" + i5 + "shortSide=" + i3);
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return i5 > i2 || i3 > i;
    }
}
