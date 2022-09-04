package p282m.framework.p285ui.widget.asyncview;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.WeakHashMap;
import p282m.framework.p283a.AbstractC10948h;
import p282m.framework.p283a.C10947g;
import p282m.framework.p284b.C10952a;
import p282m.framework.p284b.C10958f;
/* renamed from: m.framework.ui.widget.asyncview.c */
/* loaded from: classes2.dex */
public class C10961c {

    /* renamed from: a */
    private static final int f35345a = 5;

    /* renamed from: b */
    private static final int f35346b = 200;

    /* renamed from: c */
    private static final int f35347c = 40;

    /* renamed from: d */
    private static final int f35348d = 50;

    /* renamed from: e */
    private static C10961c f35349e;

    /* renamed from: g */
    private boolean f35351g;

    /* renamed from: i */
    private File f35353i;

    /* renamed from: h */
    private Vector<C10962a> f35352h = new Vector<>();

    /* renamed from: k */
    private Vector<C10962a> f35355k = new Vector<>();

    /* renamed from: j */
    private C10966d[] f35354j = new C10966d[5];

    /* renamed from: f */
    private WeakHashMap<String, Bitmap> f35350f = new WeakHashMap<>();

    /* renamed from: m.framework.ui.widget.asyncview.c$a */
    /* loaded from: classes2.dex */
    public static class C10962a {

        /* renamed from: a */
        private String f35356a;

        /* renamed from: b */
        private AbstractC10960b f35357b;

        /* renamed from: c */
        private C10966d f35358c;

        /* renamed from: d */
        private long f35359d = System.currentTimeMillis();

        /* renamed from: e */
        private Bitmap f35360e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m2461a(Bitmap bitmap) {
            this.f35360e = bitmap;
            if (this.f35357b != null) {
                this.f35357b.mo2473a(this.f35356a, this.f35360e);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("url=").append(this.f35356a);
            sb.append("time=").append(this.f35359d);
            sb.append("worker=").append(this.f35358c.getName()).append(" (").append(this.f35358c.getId()).append("");
            return sb.toString();
        }
    }

    /* renamed from: m.framework.ui.widget.asyncview.c$b */
    /* loaded from: classes2.dex */
    private static class C10963b extends Timer {

        /* renamed from: a */
        private C10961c f35361a;

        public C10963b(C10961c c10961c) {
            this.f35361a = c10961c;
            schedule(new TimerTask() { // from class: m.framework.ui.widget.asyncview.c.b.1

                /* renamed from: b */
                private int f35363b;

                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (C10963b.this.f35361a.f35351g) {
                        this.f35363b--;
                        if (this.f35363b > 0) {
                            return;
                        }
                        this.f35363b = 100;
                        C10963b.this.m2455a();
                    }
                }
            }, 0L, 200L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m2455a() {
            if (!this.f35361a.f35351g) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (i < this.f35361a.f35354j.length) {
                if (this.f35361a.f35354j[i] == null) {
                    this.f35361a.f35354j[i] = new C10966d(this.f35361a);
                    this.f35361a.f35354j[i].setName("worker " + i);
                    this.f35361a.f35354j[i].f35367c = i == 0;
                    this.f35361a.f35354j[i].start();
                } else if (currentTimeMillis - this.f35361a.f35354j[i].f35366b > 20000) {
                    this.f35361a.f35354j[i].interrupt();
                    boolean z = this.f35361a.f35354j[i].f35367c;
                    this.f35361a.f35354j[i] = new C10966d(this.f35361a);
                    this.f35361a.f35354j[i].setName("worker " + i);
                    this.f35361a.f35354j[i].f35367c = z;
                    this.f35361a.f35354j[i].start();
                }
                i++;
            }
        }
    }

    /* renamed from: m.framework.ui.widget.asyncview.c$c */
    /* loaded from: classes2.dex */
    private static class C10965c extends FilterInputStream {

        /* renamed from: a */
        InputStream f35364a;

        protected C10965c(InputStream inputStream) {
            super(inputStream);
            this.f35364a = inputStream;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) {
            long j2 = 0;
            while (j2 < j) {
                long skip = this.f35364a.skip(j - j2);
                if (skip == 0) {
                    break;
                }
                j2 += skip;
            }
            return j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m.framework.ui.widget.asyncview.c$d */
    /* loaded from: classes2.dex */
    public static class C10966d extends Thread {

        /* renamed from: a */
        private C10961c f35365a;

        /* renamed from: b */
        private long f35366b = System.currentTimeMillis();

        /* renamed from: c */
        private boolean f35367c;

        /* renamed from: d */
        private C10962a f35368d;

        public C10966d(C10961c c10961c) {
            this.f35365a = c10961c;
        }

        /* renamed from: a */
        private void m2452a() {
            int size = this.f35365a.f35352h.size();
            C10962a c10962a = size > 0 ? (C10962a) this.f35365a.f35352h.remove(size - 1) : null;
            if (c10962a == null) {
                this.f35366b = System.currentTimeMillis();
                Thread.sleep(30L);
                return;
            }
            Bitmap bitmap = (Bitmap) this.f35365a.f35350f.get(c10962a.f35356a);
            if (bitmap != null) {
                this.f35368d = c10962a;
                this.f35368d.f35358c = this;
                c10962a.m2461a(bitmap);
            } else if (new File(this.f35365a.f35353i, C10952a.m2551c(c10962a.f35356a)).exists()) {
                m2450a(c10962a);
                this.f35366b = System.currentTimeMillis();
                return;
            } else {
                if (this.f35365a.f35355k.size() > 40) {
                    while (this.f35365a.f35352h.size() > 0) {
                        this.f35365a.f35352h.remove(0);
                    }
                    this.f35365a.f35355k.remove(0);
                }
                this.f35365a.f35355k.add(c10962a);
            }
            this.f35366b = System.currentTimeMillis();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m2451a(Bitmap bitmap, File file) {
            try {
                if (file.exists()) {
                    file.delete();
                }
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                String m2478c = C10958f.m2478c(file.getAbsolutePath());
                if (m2478c != null && (m2478c.endsWith("png") || m2478c.endsWith("gif"))) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(compressFormat, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                if (!file.exists()) {
                    return;
                }
                file.delete();
            }
        }

        /* renamed from: a */
        private void m2450a(final C10962a c10962a) {
            Bitmap bitmap;
            this.f35368d = c10962a;
            this.f35368d.f35358c = this;
            final File file = new File(this.f35365a.f35353i, C10952a.m2551c(c10962a.f35356a));
            if (file.exists()) {
                bitmap = C10958f.m2479b(file.getAbsolutePath());
                if (bitmap != null) {
                    this.f35365a.f35350f.put(c10962a.f35356a, bitmap);
                    c10962a.m2461a(bitmap);
                }
                this.f35368d = null;
            } else {
                new C10947g().m2567a(c10962a.f35356a, new AbstractC10948h() { // from class: m.framework.ui.widget.asyncview.c.d.1
                    @Override // p282m.framework.p283a.AbstractC10948h
                    /* renamed from: a */
                    public void mo2442a(InputStream inputStream) {
                        Bitmap m2484a = C10958f.m2484a(new C10965c(inputStream));
                        if (m2484a == null || m2484a.isRecycled()) {
                            C10966d.this.f35368d = null;
                            return;
                        }
                        C10966d.this.m2451a(m2484a, file);
                        if (m2484a != null) {
                            C10966d.this.f35365a.f35350f.put(c10962a.f35356a, m2484a);
                            c10962a.m2461a(m2484a);
                        }
                        C10966d.this.f35368d = null;
                    }
                });
                bitmap = null;
            }
            if (bitmap != null) {
                this.f35365a.f35350f.put(c10962a.f35356a, bitmap);
                c10962a.m2461a(bitmap);
            }
            this.f35368d = null;
        }

        /* renamed from: b */
        private void m2445b() {
            int size;
            C10962a c10962a = null;
            if (this.f35365a.f35355k.size() > 0) {
                c10962a = (C10962a) this.f35365a.f35355k.remove(0);
            }
            C10962a c10962a2 = (c10962a != null || (size = this.f35365a.f35352h.size()) <= 0) ? c10962a : (C10962a) this.f35365a.f35352h.remove(size - 1);
            if (c10962a2 == null) {
                this.f35366b = System.currentTimeMillis();
                Thread.sleep(30L);
                return;
            }
            Bitmap bitmap = (Bitmap) this.f35365a.f35350f.get(c10962a2.f35356a);
            if (bitmap != null) {
                this.f35368d = c10962a2;
                this.f35368d.f35358c = this;
                c10962a2.m2461a(bitmap);
            } else {
                m2450a(c10962a2);
            }
            this.f35366b = System.currentTimeMillis();
        }

        @Override // java.lang.Thread
        public void interrupt() {
            try {
                super.interrupt();
            } catch (Throwable th) {
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.f35365a.f35351g) {
                try {
                    if (this.f35367c) {
                        m2452a();
                    } else {
                        m2445b();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private C10961c(String str) {
        this.f35353i = new File(str);
        if (!this.f35353i.exists()) {
            this.f35353i.mkdirs();
        }
        new C10963b(this);
    }

    /* renamed from: a */
    public static void m2472a() {
        if (f35349e == null) {
            throw new RuntimeException("Call BitmapProcessor.prepare(String) before start");
        }
        f35349e.f35351g = true;
    }

    /* renamed from: a */
    public static synchronized void m2471a(String str) {
        synchronized (C10961c.class) {
            if (f35349e == null) {
                f35349e = new C10961c(str);
            }
        }
    }

    /* renamed from: a */
    public static void m2470a(String str, AbstractC10960b abstractC10960b) {
        if (f35349e == null) {
            throw new RuntimeException("Call BitmapProcessor.prepare(String) before start");
        }
        if (str == null) {
            return;
        }
        C10962a c10962a = new C10962a();
        c10962a.f35356a = str;
        c10962a.f35357b = abstractC10960b;
        f35349e.f35352h.add(c10962a);
        if (f35349e.f35352h.size() > 50) {
            while (f35349e.f35352h.size() > 40) {
                f35349e.f35352h.remove(0);
            }
        }
        m2472a();
    }

    /* renamed from: b */
    public static Bitmap m2467b(String str) {
        if (f35349e == null) {
            throw new RuntimeException("Call BitmapProcessor.prepare(String) before start");
        }
        return f35349e.f35350f.get(str);
    }

    /* renamed from: b */
    public static void m2468b() {
        if (f35349e != null) {
            f35349e.f35351g = false;
            f35349e.f35352h.clear();
            for (int i = 0; i < f35349e.f35354j.length; i++) {
                if (f35349e.f35354j[i] != null) {
                    f35349e.f35354j[i].interrupt();
                }
            }
            f35349e = null;
        }
    }
}
