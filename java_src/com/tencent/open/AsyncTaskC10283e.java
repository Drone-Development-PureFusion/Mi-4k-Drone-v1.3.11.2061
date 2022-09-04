package com.tencent.open;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import com.tencent.open.p264a.C10257f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
/* renamed from: com.tencent.open.e */
/* loaded from: classes2.dex */
public class AsyncTaskC10283e extends AsyncTask<Bitmap, Void, HashMap<String, Object>> {

    /* renamed from: a */
    private static final SimpleDateFormat f31973a = new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.CHINA);

    /* renamed from: b */
    private AbstractC10284a f31974b;

    /* renamed from: com.tencent.open.e$a */
    /* loaded from: classes2.dex */
    public interface AbstractC10284a {
        /* renamed from: a */
        void mo5602a(String str);

        /* renamed from: b */
        void mo5601b(String str);
    }

    public AsyncTaskC10283e(AbstractC10284a abstractC10284a) {
        this.f31974b = abstractC10284a;
    }

    /* renamed from: a */
    private int m5608a(BitmapFactory.Options options, int i, int i2) {
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
    private Bitmap m5609a(Bitmap bitmap) {
        int i = 1;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.toByteArray().length / 1024 > 1024) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
        options.inJustDecodeBounds = false;
        int m5608a = m5608a(options, 320, 320);
        if (m5608a > 0) {
            i = m5608a;
        }
        C10257f.m5670c("comp", "comp be=" + i);
        options.inSampleSize = i;
        return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, options);
    }

    /* renamed from: a */
    private String m5610a(long j) {
        return f31973a.format(new Date(j));
    }

    /* renamed from: a */
    public static void m5607a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    return;
                }
                file.delete();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m5611a() {
        return Environment.getExternalStorageState().equals("mounted") || new File("/mnt/sdcard-ext").isDirectory();
    }

    /* renamed from: b */
    private String m5604b() {
        return Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory().getAbsolutePath() : new File("/mnt/sdcard-ext").isDirectory() ? "/mnt/sdcard-ext" : ".";
    }

    /* renamed from: b */
    private String m5603b(Bitmap bitmap) {
        String str;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            String str2 = m5604b() + File.separator + ".AppCenterWebBuffer";
            str = str2 + File.separator + (m5610a(System.currentTimeMillis()) + ".png");
            File file = new File(str2);
            if (file.exists() || !file.mkdirs()) {
            }
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(file2);
        } catch (Exception e) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e2) {
                }
            }
        } catch (Exception e3) {
            fileOutputStream2 = fileOutputStream;
            str = "";
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                }
            }
            return str;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public HashMap<String, Object> doInBackground(Bitmap... bitmapArr) {
        String m5603b;
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            Bitmap bitmap = bitmapArr[0];
            if (bitmap != null) {
                if (bitmap.getWidth() > 320 || bitmap.getHeight() > 320) {
                    Bitmap m5609a = m5609a(bitmap);
                    m5603b = m5603b(m5609a);
                    m5609a.recycle();
                } else {
                    m5603b = m5603b(bitmap);
                }
                bitmap.recycle();
                hashMap.put("ResultType", 1);
                hashMap.put("ResultValue", m5603b);
            }
        } catch (Exception e) {
            hashMap.put("ResultType", 0);
            hashMap.put("ResultValue", e.getMessage());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(HashMap<String, Object> hashMap) {
        if (((Integer) hashMap.get("ResultType")).intValue() == 1) {
            this.f31974b.mo5602a((String) hashMap.get("ResultValue"));
        } else {
            this.f31974b.mo5601b((String) hashMap.get("ResultValue"));
        }
        super.onPostExecute(hashMap);
    }
}
