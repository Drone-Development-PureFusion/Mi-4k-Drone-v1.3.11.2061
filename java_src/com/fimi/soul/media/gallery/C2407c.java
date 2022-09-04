package com.fimi.soul.media.gallery;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.util.LruCache;
import com.fimi.kernel.utils.C1678s;
import com.fimi.soul.utils.C3073ab;
import it.p273a.p274a.AbstractC10866e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.fimi.soul.media.gallery.c */
/* loaded from: classes.dex */
public class C2407c {

    /* renamed from: b */
    private static C2407c f7938b = null;

    /* renamed from: d */
    private Context f7941d;

    /* renamed from: c */
    private ExecutorService f7940c = Executors.newFixedThreadPool(4);

    /* renamed from: e */
    private ArrayList<Bitmap> f7942e = new ArrayList<>();

    /* renamed from: a */
    public LruCache<String, Bitmap> f7939a = new LruCache<String, Bitmap>(((int) Runtime.getRuntime().maxMemory()) / 8) { // from class: com.fimi.soul.media.gallery.c.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.support.p001v4.util.LruCache
        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    };

    /* renamed from: com.fimi.soul.media.gallery.c$a */
    /* loaded from: classes.dex */
    public interface AbstractC2411a {
        /* renamed from: a */
        void m31608a(Bitmap bitmap, String str);
    }

    private C2407c(Context context) {
        this.f7941d = context;
    }

    /* renamed from: a */
    private int m31618a(BitmapFactory.Options options, int i, int i2) {
        if (i == 0 || i == 0) {
            return 1;
        }
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 <= i && i4 <= i) {
            return 1;
        }
        int round = Math.round(i3 / i);
        int round2 = Math.round(i4 / i);
        return round >= round2 ? round2 : round;
    }

    /* renamed from: a */
    private Bitmap m31614a(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m31618a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    public static C2407c m31619a(Context context) {
        if (f7938b == null) {
            f7938b = new C2407c(context);
        }
        return f7938b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m31613a(String str, Bitmap bitmap) {
        if (m31610b(str) != null || bitmap == null) {
            return;
        }
        this.f7942e.add(bitmap);
        this.f7939a.put(str, bitmap);
    }

    /* renamed from: b */
    private Bitmap m31610b(String str) {
        return this.f7939a.get(str);
    }

    /* renamed from: a */
    public Bitmap m31612a(final String str, Point point, final AbstractC2411a abstractC2411a) {
        Bitmap m31610b = m31610b(str);
        final Handler handler = new Handler() { // from class: com.fimi.soul.media.gallery.c.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                abstractC2411a.m31608a((Bitmap) message.obj, str);
            }
        };
        if (m31610b == null) {
            this.f7940c.execute(new Runnable() { // from class: com.fimi.soul.media.gallery.c.3
                @Override // java.lang.Runnable
                public void run() {
                    Bitmap bitmap = null;
                    if (C3073ab.m29370c(str, C2407c.this.f7941d)) {
                        bitmap = ThumbnailUtils.createVideoThumbnail(str, 1);
                    } else {
                        try {
                            bitmap = C1678s.m34591a(C2407c.this.f7941d, str, (int) AbstractC10866e.f34828G);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    Message obtainMessage = handler.obtainMessage();
                    obtainMessage.obj = bitmap;
                    handler.sendMessage(obtainMessage);
                    C2407c.this.m31613a(str, bitmap);
                }
            });
        }
        return m31610b;
    }

    /* renamed from: a */
    public Bitmap m31611a(String str, AbstractC2411a abstractC2411a) {
        return m31612a(str, (Point) null, abstractC2411a);
    }

    /* renamed from: a */
    public void m31620a() {
        if (this.f7939a == null || this.f7939a.size() <= 0) {
            return;
        }
        this.f7939a.evictAll();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f7942e.size()) {
                this.f7942e.clear();
                return;
            }
            Bitmap bitmap = this.f7942e.get(i2);
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    public synchronized void m31615a(String str) {
        Bitmap remove;
        if (str != null) {
            if (this.f7939a != null && (remove = this.f7939a.remove(str)) != null) {
                remove.recycle();
            }
        }
    }
}
