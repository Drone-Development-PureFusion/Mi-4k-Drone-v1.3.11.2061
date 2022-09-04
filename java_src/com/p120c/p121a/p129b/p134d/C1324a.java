package com.p120c.p121a.p129b.p134d;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.p120c.p121a.p129b.p130a.C1286a;
import com.p120c.p121a.p129b.p134d.AbstractC1326b;
import com.p120c.p121a.p138c.C1354c;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.p286a.p287a.C11086e;
/* renamed from: com.c.a.b.d.a */
/* loaded from: classes.dex */
public class C1324a implements AbstractC1326b {

    /* renamed from: a */
    public static final int f3369a = 5000;

    /* renamed from: b */
    public static final int f3370b = 20000;

    /* renamed from: c */
    protected static final int f3371c = 32768;

    /* renamed from: d */
    protected static final String f3372d = "@#&=*+-_.,:!?()/~'%";

    /* renamed from: e */
    protected static final int f3373e = 5;

    /* renamed from: f */
    protected static final String f3374f = "content://com.android.contacts/";

    /* renamed from: j */
    private static final String f3375j = "UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))";

    /* renamed from: g */
    protected final Context f3376g;

    /* renamed from: h */
    protected final int f3377h;

    /* renamed from: i */
    protected final int f3378i;

    public C1324a(Context context) {
        this(context, 5000, 20000);
    }

    public C1324a(Context context, int i, int i2) {
        this.f3376g = context.getApplicationContext();
        this.f3377h = i;
        this.f3378i = i2;
    }

    @TargetApi(8)
    /* renamed from: a */
    private InputStream m35751a(String str) {
        Bitmap createVideoThumbnail;
        if (Build.VERSION.SDK_INT < 8 || (createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 2)) == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createVideoThumbnail.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: b */
    private boolean m35749b(Uri uri) {
        String type = this.f3376g.getContentResolver().getType(uri);
        return type != null && type.startsWith("video/");
    }

    /* renamed from: b */
    private boolean m35748b(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith("video/");
    }

    @TargetApi(14)
    /* renamed from: a */
    protected InputStream m35752a(Uri uri) {
        ContentResolver contentResolver = this.f3376g.getContentResolver();
        return Build.VERSION.SDK_INT >= 14 ? ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true) : ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
    }

    @Override // com.p120c.p121a.p129b.p134d.AbstractC1326b
    /* renamed from: a */
    public InputStream mo35687a(String str, Object obj) {
        switch (AbstractC1326b.EnumC1327a.m35740a(str)) {
            case HTTP:
            case HTTPS:
                return m35747b(str, obj);
            case FILE:
                return m35745d(str, obj);
            case CONTENT:
                return m35744e(str, obj);
            case ASSETS:
                return m35743f(str, obj);
            case DRAWABLE:
                return m35742g(str, obj);
            default:
                return m35741h(str, obj);
        }
    }

    /* renamed from: a */
    protected boolean m35750a(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getResponseCode() == 200;
    }

    /* renamed from: b */
    protected InputStream m35747b(String str, Object obj) {
        HttpURLConnection m35746c = m35746c(str, obj);
        for (int i = 0; m35746c.getResponseCode() / 100 == 3 && i < 5; i++) {
            m35746c = m35746c(m35746c.getHeaderField(C11086e.f35686H), obj);
        }
        try {
            InputStream inputStream = m35746c.getInputStream();
            if (m35750a(m35746c)) {
                return new C1286a(new BufferedInputStream(inputStream, 32768), m35746c.getContentLength());
            }
            C1354c.m35619a((Closeable) inputStream);
            throw new IOException("Image request failed with response code " + m35746c.getResponseCode());
        } catch (IOException e) {
            C1354c.m35618a(m35746c.getErrorStream());
            throw e;
        }
    }

    /* renamed from: c */
    protected HttpURLConnection m35746c(String str, Object obj) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Uri.encode(str, f3372d)).openConnection();
        httpURLConnection.setConnectTimeout(this.f3377h);
        httpURLConnection.setReadTimeout(this.f3378i);
        return httpURLConnection;
    }

    /* renamed from: d */
    protected InputStream m35745d(String str, Object obj) {
        String m35738c = AbstractC1326b.EnumC1327a.FILE.m35738c(str);
        return m35748b(str) ? m35751a(m35738c) : new C1286a(new BufferedInputStream(new FileInputStream(m35738c), 32768), (int) new File(m35738c).length());
    }

    /* renamed from: e */
    protected InputStream m35744e(String str, Object obj) {
        ContentResolver contentResolver = this.f3376g.getContentResolver();
        Uri parse = Uri.parse(str);
        if (m35749b(parse)) {
            Bitmap thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, Long.valueOf(parse.getLastPathSegment()).longValue(), 1, null);
            if (thumbnail != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                thumbnail.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        } else if (str.startsWith(f3374f)) {
            return m35752a(parse);
        }
        return contentResolver.openInputStream(parse);
    }

    /* renamed from: f */
    protected InputStream m35743f(String str, Object obj) {
        return this.f3376g.getAssets().open(AbstractC1326b.EnumC1327a.ASSETS.m35738c(str));
    }

    /* renamed from: g */
    protected InputStream m35742g(String str, Object obj) {
        return this.f3376g.getResources().openRawResource(Integer.parseInt(AbstractC1326b.EnumC1327a.DRAWABLE.m35738c(str)));
    }

    /* renamed from: h */
    protected InputStream m35741h(String str, Object obj) {
        throw new UnsupportedOperationException(String.format(f3375j, str));
    }
}
