package com.p120c.p121a.p129b.p132b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.p120c.p121a.p129b.p130a.C1300e;
import com.p120c.p121a.p129b.p130a.EnumC1299d;
import com.p120c.p121a.p129b.p134d.AbstractC1326b;
import com.p120c.p121a.p138c.C1352b;
import com.p120c.p121a.p138c.C1354c;
import com.p120c.p121a.p138c.C1356d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.c.a.b.b.a */
/* loaded from: classes.dex */
public class C1306a implements AbstractC1309b {

    /* renamed from: a */
    protected static final String f3285a = "Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]";

    /* renamed from: b */
    protected static final String f3286b = "Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]";

    /* renamed from: c */
    protected static final String f3287c = "Rotate image on %1$d° [%2$s]";

    /* renamed from: d */
    protected static final String f3288d = "Flip image horizontally [%s]";

    /* renamed from: e */
    protected static final String f3289e = "No stream for image [%s]";

    /* renamed from: f */
    protected static final String f3290f = "Image can't be decoded [%s]";

    /* renamed from: g */
    protected final boolean f3291g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.c.a.b.b.a$a */
    /* loaded from: classes.dex */
    public static class C1307a {

        /* renamed from: a */
        public final int f3292a;

        /* renamed from: b */
        public final boolean f3293b;

        protected C1307a() {
            this.f3292a = 0;
            this.f3293b = false;
        }

        protected C1307a(int i, boolean z) {
            this.f3292a = i;
            this.f3293b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.c.a.b.b.a$b */
    /* loaded from: classes.dex */
    public static class C1308b {

        /* renamed from: a */
        public final C1300e f3294a;

        /* renamed from: b */
        public final C1307a f3295b;

        protected C1308b(C1300e c1300e, C1307a c1307a) {
            this.f3294a = c1300e;
            this.f3295b = c1307a;
        }
    }

    public C1306a(boolean z) {
        this.f3291g = z;
    }

    /* renamed from: a */
    private boolean m35901a(String str, String str2) {
        return "image/jpeg".equalsIgnoreCase(str2) && AbstractC1326b.EnumC1327a.m35740a(str) == AbstractC1326b.EnumC1327a.FILE;
    }

    /* renamed from: a */
    protected Bitmap m35905a(Bitmap bitmap, C1310c c1310c, int i, boolean z) {
        Matrix matrix = new Matrix();
        EnumC1299d m35890e = c1310c.m35890e();
        if (m35890e == EnumC1299d.EXACTLY || m35890e == EnumC1299d.EXACTLY_STRETCHED) {
            C1300e c1300e = new C1300e(bitmap.getWidth(), bitmap.getHeight(), i);
            float m35621b = C1352b.m35621b(c1300e, c1310c.m35891d(), c1310c.m35889f(), m35890e == EnumC1299d.EXACTLY_STRETCHED);
            if (Float.compare(m35621b, 1.0f) != 0) {
                matrix.setScale(m35621b, m35621b);
                if (this.f3291g) {
                    C1356d.m35612a(f3286b, c1300e, c1300e.m35910a(m35621b), Float.valueOf(m35621b), c1310c.m35897a());
                }
            }
        }
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
            if (this.f3291g) {
                C1356d.m35612a(f3288d, c1310c.m35897a());
            }
        }
        if (i != 0) {
            matrix.postRotate(i);
            if (this.f3291g) {
                C1356d.m35612a(f3287c, Integer.valueOf(i), c1310c.m35897a());
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    @Override // com.p120c.p121a.p129b.p132b.AbstractC1309b
    /* renamed from: a */
    public Bitmap mo35898a(C1310c c1310c) {
        InputStream m35900b = m35900b(c1310c);
        if (m35900b == null) {
            C1356d.m35604d(f3289e, c1310c.m35897a());
            return null;
        }
        try {
            C1308b m35903a = m35903a(m35900b, c1310c);
            m35900b = m35899b(m35900b, c1310c);
            Bitmap decodeStream = BitmapFactory.decodeStream(m35900b, null, m35904a(m35903a.f3294a, c1310c));
            if (decodeStream != null) {
                return m35905a(decodeStream, c1310c, m35903a.f3295b.f3292a, m35903a.f3295b.f3293b);
            }
            C1356d.m35604d(f3290f, c1310c.m35897a());
            return decodeStream;
        } finally {
            C1354c.m35619a((Closeable) m35900b);
        }
    }

    /* renamed from: a */
    protected BitmapFactory.Options m35904a(C1300e c1300e, C1310c c1310c) {
        int m35623a;
        EnumC1299d m35890e = c1310c.m35890e();
        if (m35890e == EnumC1299d.NONE) {
            m35623a = 1;
        } else if (m35890e == EnumC1299d.NONE_SAFE) {
            m35623a = C1352b.m35624a(c1300e);
        } else {
            m35623a = C1352b.m35623a(c1300e, c1310c.m35891d(), c1310c.m35889f(), m35890e == EnumC1299d.IN_SAMPLE_POWER_OF_2);
        }
        if (m35623a > 1 && this.f3291g) {
            C1356d.m35612a(f3285a, c1300e, c1300e.m35909a(m35623a), Integer.valueOf(m35623a), c1310c.m35897a());
        }
        BitmapFactory.Options m35885j = c1310c.m35885j();
        m35885j.inSampleSize = m35623a;
        return m35885j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    protected C1307a m35902a(String str) {
        int i = 0;
        boolean z = true;
        try {
        } catch (IOException e) {
            C1356d.m35605c("Can't read EXIF tags from file [%s]", str);
        }
        switch (new ExifInterface(AbstractC1326b.EnumC1327a.FILE.m35738c(str)).getAttributeInt("Orientation", 1)) {
            case 1:
            default:
                z = false;
                break;
            case 2:
                break;
            case 3:
                z = false;
                i = Opcodes.GETFIELD;
                break;
            case 4:
                i = Opcodes.GETFIELD;
                break;
            case 5:
                i = 270;
                break;
            case 6:
                z = false;
                i = 90;
                break;
            case 7:
                i = 90;
                break;
            case 8:
                z = false;
                i = 270;
                break;
        }
        return new C1307a(i, z);
    }

    /* renamed from: a */
    protected C1308b m35903a(InputStream inputStream, C1310c c1310c) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        String m35895b = c1310c.m35895b();
        C1307a c1307a = (!c1310c.m35886i() || !m35901a(m35895b, options.outMimeType)) ? new C1307a() : m35902a(m35895b);
        return new C1308b(new C1300e(options.outWidth, options.outHeight, c1307a.f3292a), c1307a);
    }

    /* renamed from: b */
    protected InputStream m35900b(C1310c c1310c) {
        return c1310c.m35888g().mo35687a(c1310c.m35895b(), c1310c.m35887h());
    }

    /* renamed from: b */
    protected InputStream m35899b(InputStream inputStream, C1310c c1310c) {
        try {
            inputStream.reset();
            return inputStream;
        } catch (IOException e) {
            C1354c.m35619a((Closeable) inputStream);
            return m35900b(c1310c);
        }
    }
}
