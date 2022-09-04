package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.fimi.soul.media.player.FimiMediaPlayer;
import java.nio.ByteBuffer;
/* renamed from: com.google.android.gms.vision.d */
/* loaded from: classes2.dex */
public class C9274d {

    /* renamed from: a */
    public static final int f29261a = 0;

    /* renamed from: b */
    public static final int f29262b = 1;

    /* renamed from: c */
    public static final int f29263c = 2;

    /* renamed from: d */
    public static final int f29264d = 3;

    /* renamed from: e */
    private C9277b f29265e;

    /* renamed from: f */
    private ByteBuffer f29266f;

    /* renamed from: g */
    private Bitmap f29267g;

    /* renamed from: com.google.android.gms.vision.d$a */
    /* loaded from: classes2.dex */
    public static class C9276a {

        /* renamed from: a */
        private C9274d f29268a = new C9274d();

        /* renamed from: a */
        public C9276a m8756a(int i) {
            this.f29268a.m8765a().f29271c = i;
            return this;
        }

        /* renamed from: a */
        public C9276a m8755a(long j) {
            this.f29268a.m8765a().f29272d = j;
            return this;
        }

        /* renamed from: a */
        public C9276a m8754a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.f29268a.f29267g = bitmap;
            C9277b m8765a = this.f29268a.m8765a();
            m8765a.f29269a = width;
            m8765a.f29270b = height;
            return this;
        }

        /* renamed from: a */
        public C9276a m8753a(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            }
            if (byteBuffer.capacity() < i * i2) {
                throw new IllegalArgumentException("Invalid image data size.");
            }
            switch (i3) {
                case 16:
                case 17:
                case FimiMediaPlayer.SDL_FCC_YV12 /* 842094169 */:
                    this.f29268a.f29266f = byteBuffer;
                    C9277b m8765a = this.f29268a.m8765a();
                    m8765a.f29269a = i;
                    m8765a.f29270b = i2;
                    m8765a.f29274f = i3;
                    return this;
                default:
                    throw new IllegalArgumentException(new StringBuilder(37).append("Unsupported image format: ").append(i3).toString());
            }
        }

        /* renamed from: a */
        public C9274d m8757a() {
            if (this.f29268a.f29266f == null && this.f29268a.f29267g == null) {
                throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
            }
            return this.f29268a;
        }

        /* renamed from: b */
        public C9276a m8752b(int i) {
            this.f29268a.m8765a().f29273e = i;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.vision.d$b */
    /* loaded from: classes2.dex */
    public static class C9277b {

        /* renamed from: a */
        private int f29269a;

        /* renamed from: b */
        private int f29270b;

        /* renamed from: c */
        private int f29271c;

        /* renamed from: d */
        private long f29272d;

        /* renamed from: e */
        private int f29273e;

        /* renamed from: f */
        private int f29274f = -1;

        public C9277b() {
        }

        public C9277b(C9277b c9277b) {
            this.f29269a = c9277b.m8751a();
            this.f29270b = c9277b.m8748b();
            this.f29271c = c9277b.m8746c();
            this.f29272d = c9277b.m8744d();
            this.f29273e = c9277b.m8742e();
        }

        /* renamed from: a */
        public int m8751a() {
            return this.f29269a;
        }

        /* renamed from: b */
        public int m8748b() {
            return this.f29270b;
        }

        /* renamed from: c */
        public int m8746c() {
            return this.f29271c;
        }

        /* renamed from: d */
        public long m8744d() {
            return this.f29272d;
        }

        /* renamed from: e */
        public int m8742e() {
            return this.f29273e;
        }

        /* renamed from: f */
        public int m8740f() {
            return this.f29274f;
        }

        /* renamed from: g */
        public void m8739g() {
            if (this.f29273e % 2 != 0) {
                int i = this.f29269a;
                this.f29269a = this.f29270b;
                this.f29270b = i;
            }
            this.f29273e = 0;
        }
    }

    private C9274d() {
        this.f29265e = new C9277b();
        this.f29266f = null;
        this.f29267g = null;
    }

    /* renamed from: d */
    private ByteBuffer m8758d() {
        int width = this.f29267g.getWidth();
        int height = this.f29267g.getHeight();
        int[] iArr = new int[width * height];
        this.f29267g.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[width * height];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) ((Color.red(iArr[i]) * 0.299f) + (Color.green(iArr[i]) * 0.587f) + (Color.blue(iArr[i]) * 0.114f));
        }
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public C9277b m8765a() {
        return this.f29265e;
    }

    /* renamed from: b */
    public ByteBuffer m8761b() {
        return this.f29267g != null ? m8758d() : this.f29266f;
    }

    /* renamed from: c */
    public Bitmap m8759c() {
        return this.f29267g;
    }
}
