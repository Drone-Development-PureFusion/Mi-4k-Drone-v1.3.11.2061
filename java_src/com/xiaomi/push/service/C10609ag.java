package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.gms.nearby.messages.Message;
import com.xiaomi.channel.commonutils.file.C10400a;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/* renamed from: com.xiaomi.push.service.ag */
/* loaded from: classes2.dex */
public class C10609ag {

    /* renamed from: com.xiaomi.push.service.ag$a */
    /* loaded from: classes2.dex */
    public static class C10610a {

        /* renamed from: a */
        byte[] f32985a;

        /* renamed from: b */
        int f32986b;

        public C10610a(byte[] bArr, int i) {
            this.f32985a = bArr;
            this.f32986b = i;
        }
    }

    /* renamed from: com.xiaomi.push.service.ag$b */
    /* loaded from: classes2.dex */
    public static class C10611b {

        /* renamed from: a */
        public Bitmap f32987a;

        /* renamed from: b */
        public long f32988b;

        public C10611b(Bitmap bitmap, long j) {
            this.f32987a = bitmap;
            this.f32988b = j;
        }
    }

    /* renamed from: a */
    private static int m4402a(Context context, InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            AbstractC10404b.m5269a("decode dimension failed for bitmap.");
            return 1;
        }
        int round = Math.round((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f);
        if (options.outWidth > round && options.outHeight > round) {
            return Math.min(options.outWidth / round, options.outHeight / round);
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C10610a m4400a(String str) {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        C10610a c10610a;
        int i = Message.f28165a;
        HttpURLConnection httpURLConnection2 = null;
        try {
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection3.setConnectTimeout(8000);
                httpURLConnection3.setReadTimeout(20000);
                httpURLConnection3.connect();
                int contentLength = httpURLConnection3.getContentLength();
                if (contentLength > 102400) {
                    AbstractC10404b.m5269a("Bitmap size is too big, max size is 102400  contentLen size is " + contentLength + " from url " + str);
                    C10400a.m5287a((InputStream) null);
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                    }
                    c10610a = null;
                } else {
                    int responseCode = httpURLConnection3.getResponseCode();
                    if (responseCode != 200) {
                        AbstractC10404b.m5269a("Invalid Http Response Code " + responseCode + " received");
                        C10400a.m5287a((InputStream) null);
                        if (httpURLConnection3 != null) {
                            httpURLConnection3.disconnect();
                        }
                        c10610a = null;
                    } else {
                        inputStream = httpURLConnection3.getInputStream();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[1024];
                            while (i > 0) {
                                int read = inputStream.read(bArr, 0, 1024);
                                if (read == -1) {
                                    break;
                                }
                                i -= read;
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                            if (i <= 0) {
                                AbstractC10404b.m5269a("length 102400 exhausted.");
                                C10610a c10610a2 = new C10610a(null, Message.f28165a);
                                C10400a.m5287a(inputStream);
                                if (httpURLConnection3 != null) {
                                    httpURLConnection3.disconnect();
                                }
                                c10610a = c10610a2;
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                C10610a c10610a3 = new C10610a(byteArray, byteArray.length);
                                C10400a.m5287a(inputStream);
                                if (httpURLConnection3 != null) {
                                    httpURLConnection3.disconnect();
                                }
                                c10610a = c10610a3;
                            }
                        } catch (IOException e) {
                            httpURLConnection = httpURLConnection3;
                            e = e;
                            try {
                                AbstractC10404b.m5267a(e);
                                C10400a.m5287a(inputStream);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection2 = httpURLConnection;
                                C10400a.m5287a(inputStream);
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            httpURLConnection2 = httpURLConnection3;
                            th = th2;
                            C10400a.m5287a(inputStream);
                            if (httpURLConnection2 != null) {
                            }
                            throw th;
                        }
                    }
                }
                return c10610a;
            } catch (IOException e2) {
                inputStream = null;
                C10610a c10610a4 = c10610a;
                e = e2;
                httpURLConnection = c10610a4;
            } catch (Throwable th3) {
                inputStream = null;
                httpURLConnection2 = c10610a;
                th = th3;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    /* renamed from: a */
    public static C10611b m4401a(Context context, String str) {
        ByteArrayInputStream byteArrayInputStream;
        C10610a m4400a;
        C10611b c10611b = new C10611b(null, 0L);
        try {
            m4400a = m4400a(str);
        } catch (Exception e) {
            e = e;
            byteArrayInputStream = null;
        } catch (Throwable th) {
            th = th;
            byteArrayInputStream = null;
            C10400a.m5287a(byteArrayInputStream);
            throw th;
        }
        if (m4400a == null) {
            C10400a.m5287a((InputStream) null);
            return c10611b;
        }
        c10611b.f32988b = m4400a.f32986b;
        byte[] bArr = m4400a.f32985a;
        if (bArr != null) {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                try {
                    int m4402a = m4402a(context, byteArrayInputStream);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = m4402a;
                    c10611b.f32987a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                } catch (Exception e2) {
                    e = e2;
                    AbstractC10404b.m5267a(e);
                    C10400a.m5287a(byteArrayInputStream);
                    return c10611b;
                }
            } catch (Throwable th2) {
                th = th2;
                C10400a.m5287a(byteArrayInputStream);
                throw th;
            }
        } else {
            byteArrayInputStream = null;
        }
        C10400a.m5287a(byteArrayInputStream);
        return c10611b;
    }

    /* renamed from: b */
    public static Bitmap m4399b(Context context, String str) {
        InputStream inputStream;
        InputStream inputStream2;
        Throwable th;
        Bitmap bitmap = null;
        Uri parse = Uri.parse(str);
        try {
            inputStream = context.getContentResolver().openInputStream(parse);
            try {
                int m4402a = m4402a(context, inputStream);
                inputStream2 = context.getContentResolver().openInputStream(parse);
                try {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = m4402a;
                        bitmap = BitmapFactory.decodeStream(inputStream2, null, options);
                        C10400a.m5287a(inputStream2);
                    } catch (IOException e) {
                        e = e;
                        AbstractC10404b.m5267a(e);
                        C10400a.m5287a(inputStream2);
                        C10400a.m5287a(inputStream);
                        return bitmap;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C10400a.m5287a(inputStream2);
                    C10400a.m5287a(inputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                inputStream2 = null;
            } catch (Throwable th3) {
                inputStream2 = null;
                th = th3;
                C10400a.m5287a(inputStream2);
                C10400a.m5287a(inputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            inputStream2 = null;
        } catch (Throwable th4) {
            inputStream = null;
            inputStream2 = null;
            th = th4;
        }
        C10400a.m5287a(inputStream);
        return bitmap;
    }
}
