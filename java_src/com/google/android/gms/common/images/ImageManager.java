package com.google.android.gms.common.images;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p001v4.util.LruCache;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.images.AbstractC4550b;
import com.google.android.gms.common.internal.C4598n;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.zzrv;
import com.tencent.p263mm.sdk.platformtools.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public final class ImageManager {

    /* renamed from: a */
    private static final Object f16942a = new Object();

    /* renamed from: b */
    private static HashSet<Uri> f16943b = new HashSet<>();

    /* renamed from: c */
    private static ImageManager f16944c;

    /* renamed from: d */
    private static ImageManager f16945d;

    /* renamed from: e */
    private final Context f16946e;

    /* renamed from: f */
    private final Handler f16947f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private final ExecutorService f16948g = Executors.newFixedThreadPool(4);

    /* renamed from: h */
    private final C4544c f16949h;

    /* renamed from: i */
    private final zzrv f16950i;

    /* renamed from: j */
    private final Map<AbstractC4550b, ImageReceiver> f16951j;

    /* renamed from: k */
    private final Map<Uri, ImageReceiver> f16952k;

    /* renamed from: l */
    private final Map<Uri, Long> f16953l;

    /* JADX INFO: Access modifiers changed from: private */
    @KeepName
    /* loaded from: classes2.dex */
    public final class ImageReceiver extends ResultReceiver {

        /* renamed from: b */
        private final Uri f16955b;

        /* renamed from: c */
        private final ArrayList<AbstractC4550b> f16956c = new ArrayList<>();

        ImageReceiver(Uri uri) {
            super(new Handler(Looper.getMainLooper()));
            this.f16955b = uri;
        }

        /* renamed from: a */
        public void m23775a() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", this.f16955b);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.this.f16946e.sendBroadcast(intent);
        }

        /* renamed from: a */
        public void m23773a(AbstractC4550b abstractC4550b) {
            C4598n.m23594a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f16956c.add(abstractC4550b);
        }

        /* renamed from: b */
        public void m23772b(AbstractC4550b abstractC4550b) {
            C4598n.m23594a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f16956c.remove(abstractC4550b);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            ImageManager.this.f16948g.execute(new RunnableC4545d(this.f16955b, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4542a {
        /* renamed from: a */
        void m23771a(Uri uri, Drawable drawable, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(11)
    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    /* loaded from: classes2.dex */
    public static final class C4543b {
        /* renamed from: a */
        static int m23770a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    /* loaded from: classes2.dex */
    public static final class C4544c extends LruCache<AbstractC4550b.C4551a, Bitmap> {
        public C4544c(Context context) {
            super(m23769a(context));
        }

        @TargetApi(11)
        /* renamed from: a */
        private static int m23769a(Context context) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (int) (((!((context.getApplicationInfo().flags & 1048576) != 0) || !C4696s.m23114a()) ? activityManager.getMemoryClass() : C4543b.m23770a(activityManager)) * 1048576 * 0.33f);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.support.p001v4.util.LruCache
        /* renamed from: a */
        public int sizeOf(AbstractC4550b.C4551a c4551a, Bitmap bitmap) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.support.p001v4.util.LruCache
        /* renamed from: a */
        public void entryRemoved(boolean z, AbstractC4550b.C4551a c4551a, Bitmap bitmap, Bitmap bitmap2) {
            super.entryRemoved(z, c4551a, bitmap, bitmap2);
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$d */
    /* loaded from: classes2.dex */
    private final class RunnableC4545d implements Runnable {

        /* renamed from: b */
        private final Uri f16958b;

        /* renamed from: c */
        private final ParcelFileDescriptor f16959c;

        public RunnableC4545d(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f16958b = uri;
            this.f16959c = parcelFileDescriptor;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4598n.m23591b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            boolean z = false;
            Bitmap bitmap = null;
            if (this.f16959c != null) {
                try {
                    bitmap = BitmapFactory.decodeFileDescriptor(this.f16959c.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    String valueOf = String.valueOf(this.f16958b);
                    Log.e("ImageManager", new StringBuilder(String.valueOf(valueOf).length() + 34).append("OOM while loading bitmap for uri: ").append(valueOf).toString(), e);
                    z = true;
                }
                try {
                    this.f16959c.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.f16947f.post(new RunnableC4548g(this.f16958b, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e3) {
                String valueOf2 = String.valueOf(this.f16958b);
                Log.w("ImageManager", new StringBuilder(String.valueOf(valueOf2).length() + 32).append("Latch interrupted while posting ").append(valueOf2).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.images.ImageManager$e */
    /* loaded from: classes2.dex */
    public final class RunnableC4546e implements Runnable {

        /* renamed from: b */
        private final AbstractC4550b f16961b;

        public RunnableC4546e(AbstractC4550b abstractC4550b) {
            this.f16961b = abstractC4550b;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4598n.m23594a("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f16951j.get(this.f16961b);
            if (imageReceiver != null) {
                ImageManager.this.f16951j.remove(this.f16961b);
                imageReceiver.m23772b(this.f16961b);
            }
            AbstractC4550b.C4551a c4551a = this.f16961b.f16974a;
            if (c4551a.f16981a == null) {
                this.f16961b.m23751a(ImageManager.this.f16946e, ImageManager.this.f16950i, true);
                return;
            }
            Bitmap m23786a = ImageManager.this.m23786a(c4551a);
            if (m23786a != null) {
                this.f16961b.m23754a(ImageManager.this.f16946e, m23786a, true);
                return;
            }
            Long l = (Long) ImageManager.this.f16953l.get(c4551a.f16981a);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < Util.MILLSECONDS_OF_HOUR) {
                    this.f16961b.m23751a(ImageManager.this.f16946e, ImageManager.this.f16950i, true);
                    return;
                }
                ImageManager.this.f16953l.remove(c4551a.f16981a);
            }
            this.f16961b.m23753a(ImageManager.this.f16946e, ImageManager.this.f16950i);
            ImageReceiver imageReceiver2 = (ImageReceiver) ImageManager.this.f16952k.get(c4551a.f16981a);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageReceiver(c4551a.f16981a);
                ImageManager.this.f16952k.put(c4551a.f16981a, imageReceiver2);
            }
            imageReceiver2.m23773a(this.f16961b);
            if (!(this.f16961b instanceof AbstractC4550b.C4553c)) {
                ImageManager.this.f16951j.put(this.f16961b, imageReceiver2);
            }
            synchronized (ImageManager.f16942a) {
                if (!ImageManager.f16943b.contains(c4551a.f16981a)) {
                    ImageManager.f16943b.add(c4551a.f16981a);
                    imageReceiver2.m23775a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: com.google.android.gms.common.images.ImageManager$f */
    /* loaded from: classes2.dex */
    public static final class ComponentCallbacks2C4547f implements ComponentCallbacks2 {

        /* renamed from: a */
        private final C4544c f16962a;

        public ComponentCallbacks2C4547f(C4544c c4544c) {
            this.f16962a = c4544c;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f16962a.evictAll();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i >= 60) {
                this.f16962a.evictAll();
            } else if (i < 20) {
            } else {
                this.f16962a.trimToSize(this.f16962a.size() / 2);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$g */
    /* loaded from: classes2.dex */
    private final class RunnableC4548g implements Runnable {

        /* renamed from: b */
        private final Uri f16964b;

        /* renamed from: c */
        private final Bitmap f16965c;

        /* renamed from: d */
        private final CountDownLatch f16966d;

        /* renamed from: e */
        private boolean f16967e;

        public RunnableC4548g(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f16964b = uri;
            this.f16965c = bitmap;
            this.f16967e = z;
            this.f16966d = countDownLatch;
        }

        /* renamed from: a */
        private void m23766a(ImageReceiver imageReceiver, boolean z) {
            ArrayList arrayList = imageReceiver.f16956c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC4550b abstractC4550b = (AbstractC4550b) arrayList.get(i);
                if (z) {
                    abstractC4550b.m23754a(ImageManager.this.f16946e, this.f16965c, false);
                } else {
                    ImageManager.this.f16953l.put(this.f16964b, Long.valueOf(SystemClock.elapsedRealtime()));
                    abstractC4550b.m23751a(ImageManager.this.f16946e, ImageManager.this.f16950i, false);
                }
                if (!(abstractC4550b instanceof AbstractC4550b.C4553c)) {
                    ImageManager.this.f16951j.remove(abstractC4550b);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C4598n.m23594a("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.f16965c != null;
            if (ImageManager.this.f16949h != null) {
                if (this.f16967e) {
                    ImageManager.this.f16949h.evictAll();
                    System.gc();
                    this.f16967e = false;
                    ImageManager.this.f16947f.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.f16949h.put(new AbstractC4550b.C4551a(this.f16964b), this.f16965c);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f16952k.remove(this.f16964b);
            if (imageReceiver != null) {
                m23766a(imageReceiver, z);
            }
            this.f16966d.countDown();
            synchronized (ImageManager.f16942a) {
                ImageManager.f16943b.remove(this.f16964b);
            }
        }
    }

    private ImageManager(Context context, boolean z) {
        this.f16946e = context.getApplicationContext();
        if (z) {
            this.f16949h = new C4544c(this.f16946e);
            if (C4696s.m23110d()) {
                m23782c();
            }
        } else {
            this.f16949h = null;
        }
        this.f16950i = new zzrv();
        this.f16951j = new HashMap();
        this.f16952k = new HashMap();
        this.f16953l = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m23786a(AbstractC4550b.C4551a c4551a) {
        if (this.f16949h == null) {
            return null;
        }
        return this.f16949h.get(c4551a);
    }

    /* renamed from: a */
    public static ImageManager m23795a(Context context) {
        return m23794a(context, false);
    }

    /* renamed from: a */
    public static ImageManager m23794a(Context context, boolean z) {
        if (z) {
            if (f16945d == null) {
                f16945d = new ImageManager(context, true);
            }
            return f16945d;
        }
        if (f16944c == null) {
            f16944c = new ImageManager(context, false);
        }
        return f16944c;
    }

    @TargetApi(14)
    /* renamed from: c */
    private void m23782c() {
        this.f16946e.registerComponentCallbacks(new ComponentCallbacks2C4547f(this.f16949h));
    }

    /* renamed from: a */
    public void m23793a(ImageView imageView, int i) {
        m23785a(new AbstractC4550b.C4552b(imageView, i));
    }

    /* renamed from: a */
    public void m23792a(ImageView imageView, Uri uri) {
        m23785a(new AbstractC4550b.C4552b(imageView, uri));
    }

    /* renamed from: a */
    public void m23791a(ImageView imageView, Uri uri, int i) {
        AbstractC4550b.C4552b c4552b = new AbstractC4550b.C4552b(imageView, uri);
        c4552b.m23755a(i);
        m23785a(c4552b);
    }

    /* renamed from: a */
    public void m23790a(AbstractC4542a abstractC4542a, Uri uri) {
        m23785a(new AbstractC4550b.C4553c(abstractC4542a, uri));
    }

    /* renamed from: a */
    public void m23789a(AbstractC4542a abstractC4542a, Uri uri, int i) {
        AbstractC4550b.C4553c c4553c = new AbstractC4550b.C4553c(abstractC4542a, uri);
        c4553c.m23755a(i);
        m23785a(c4553c);
    }

    /* renamed from: a */
    public void m23785a(AbstractC4550b abstractC4550b) {
        C4598n.m23594a("ImageManager.loadImage() must be called in the main thread");
        new RunnableC4546e(abstractC4550b).run();
    }
}
