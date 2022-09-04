package com.fimi.soul.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.ExifInterface;
import android.media.ThumbnailUtils;
import android.support.p001v4.view.ViewCompat;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.fimi.soul.utils.e */
/* loaded from: classes.dex */
public class C3121e {
    /* renamed from: a */
    public static int m29104a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 > i2 || i4 > i) {
            int round = Math.round(i3 / i2);
            int round2 = Math.round(i4 / i);
            return round < round2 ? round : round2;
        }
        return 1;
    }

    /* renamed from: a */
    public static Bitmap m29110a(int i, Bitmap... bitmapArr) {
        int length;
        if (i <= 0 || bitmapArr == null || bitmapArr.length == 0) {
            throw new IllegalArgumentException("Wrong parameters: columns must > 0 and bitmaps.length must > 0.");
        }
        int i2 = 0;
        int i3 = 0;
        for (Bitmap bitmap : bitmapArr) {
            if (i3 <= bitmap.getWidth()) {
                i3 = bitmap.getWidth();
            }
            if (i2 <= bitmap.getHeight()) {
                i2 = bitmap.getHeight();
            }
        }
        if (i >= bitmapArr.length) {
            length = 1;
            i = bitmapArr.length;
        } else {
            length = bitmapArr.length % i == 0 ? bitmapArr.length / i : (bitmapArr.length / i) + 1;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i * i3, length * i2, Bitmap.Config.RGB_565);
        int i4 = 0;
        while (i4 < length) {
            Bitmap bitmap2 = createBitmap;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = (i4 * i) + i5;
                if (i6 >= bitmapArr.length) {
                    break;
                }
                bitmap2 = m29106a(bitmap2, bitmapArr[i6], new PointF(i5 * i3, i4 * i2));
            }
            i4++;
            createBitmap = bitmap2;
        }
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m29109a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, height / 2, width, height / 2, matrix, false);
        Bitmap createBitmap2 = Bitmap.createBitmap(width, (height / 2) + height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawRect(0.0f, height, width, height + 4, new Paint());
        canvas.drawBitmap(createBitmap, 0.0f, height + 4, (Paint) null);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, bitmap.getHeight(), 0.0f, createBitmap2.getHeight() + 4, 1895825407, (int) ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, height, width, createBitmap2.getHeight() + 4, paint);
        return createBitmap2;
    }

    /* renamed from: a */
    public static Bitmap m29108a(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, width, height);
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m29106a(Bitmap bitmap, Bitmap bitmap2, PointF pointF) {
        if (bitmap == null || bitmap2 == null || pointF == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap2, pointF.x, pointF.y, (Paint) null);
        canvas.save(31);
        canvas.restore();
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m29103a(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m29102a(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int ceil = (int) Math.ceil(options.outWidth / i);
        int ceil2 = (int) Math.ceil(options.outHeight / i2);
        if (ceil > 1 && ceil2 > 1) {
            if (ceil > ceil2) {
                options.inSampleSize = ceil;
            } else {
                options.inSampleSize = ceil2;
            }
        }
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    public static Bitmap m29100a(byte[] bArr) {
        if (bArr.length != 0) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    /* renamed from: a */
    public static String m29107a(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, i, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    /* renamed from: a */
    public static String m29101a(String str, int i, int i2, int i3) {
        try {
            Bitmap m29102a = m29102a(str, i, i2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m29102a.compress(Bitmap.CompressFormat.PNG, i3, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m29105a(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream;
        boolean z = false;
        byte[] m29099b = m29099b(bitmap, 100);
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    fileOutputStream.write(m29099b);
                    fileOutputStream.flush();
                    z = true;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return z;
                }
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            if (fileOutputStream != null) {
            }
            throw th;
        }
        return z;
    }

    /* renamed from: b */
    public static Bitmap m29097b(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m29104a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: b */
    public static String m29098b(String str) {
        try {
            Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 1);
            if (createVideoThumbnail != null) {
                return m29107a(Bitmap.createBitmap(createVideoThumbnail, 0, 0, 80, 80), 20);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        return "";
    }

    /* renamed from: b */
    public static byte[] m29099b(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getWidth() * bitmap.getHeight() * 4);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, i, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m29096c(String str) {
        int m29095d = m29095d(str);
        if (m29095d == 0) {
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inDither = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[32768];
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        Matrix matrix = new Matrix();
        matrix.postRotate(m29095d);
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
        try {
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(str)));
            if (createBitmap == null) {
                return;
            }
            createBitmap.recycle();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static int m29095d(String str) {
        try {
            switch (new ExifInterface(str).getAttributeInt("Orientation", 1)) {
                case 3:
                    return Opcodes.GETFIELD;
                case 4:
                case 5:
                case 7:
                default:
                    return 0;
                case 6:
                    return 90;
                case 8:
                    return 270;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: f */
    public static boolean m29093f(String str) {
        File file = new File(str);
        if (!file.isFile() || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    /* renamed from: e */
    public boolean m29094e(String str) {
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        boolean z = true;
        for (int i = 0; i < listFiles.length; i++) {
            if (!listFiles[i].isFile()) {
                z = m29094e(listFiles[i].getAbsolutePath());
                if (!z) {
                    break;
                }
            } else {
                z = m29093f(listFiles[i].getAbsolutePath());
                if (!z) {
                    break;
                }
            }
        }
        if (!z) {
            return false;
        }
        return file.delete();
    }
}
