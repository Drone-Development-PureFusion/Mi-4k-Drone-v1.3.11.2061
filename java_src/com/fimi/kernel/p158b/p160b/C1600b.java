package com.fimi.kernel.p158b.p160b;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.utils.C1663g;
import com.fimi.kernel.utils.C1678s;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.kernel.b.b.b */
/* loaded from: classes.dex */
public class C1600b {

    /* renamed from: b */
    private static ExecutorService f3944b = Executors.newCachedThreadPool();

    /* renamed from: c */
    private static final int f3945c = 1;

    /* renamed from: d */
    private static final int f3946d = 1;

    /* renamed from: e */
    private static final int f3947e = 2;

    /* renamed from: f */
    private static final int f3948f = 3;

    /* renamed from: a */
    float f3949a;

    /* renamed from: g */
    private AbstractC1607e f3950g;

    /* renamed from: h */
    private AbstractC1606d f3951h;

    /* renamed from: i */
    private AbstractC1606d f3952i;

    /* renamed from: j */
    private long f3953j;

    /* renamed from: k */
    private long f3954k;

    /* renamed from: l */
    private long f3955l;

    /* renamed from: m */
    private long f3956m;

    /* renamed from: n */
    private String f3957n;

    /* renamed from: o */
    private String f3958o;

    /* renamed from: p */
    private String f3959p;

    /* renamed from: q */
    private List<C1614d> f3960q;

    /* renamed from: r */
    private List<RunnableC1604c> f3961r;

    /* renamed from: s */
    private Context f3962s;

    /* renamed from: t */
    private HandlerC1608f f3963t;

    /* renamed from: u */
    private EnumC1602a f3964u;

    /* renamed from: v */
    private Object f3965v;

    /* renamed from: w */
    private Bitmap f3966w;

    /* renamed from: x */
    private String f3967x;

    /* renamed from: y */
    private long f3968y;

    /* renamed from: com.fimi.kernel.b.b.b$a */
    /* loaded from: classes.dex */
    public enum EnumC1602a {
        Error,
        Pause,
        Wait,
        Downloading,
        Completed
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.kernel.b.b.b$b */
    /* loaded from: classes.dex */
    public class C1603b extends Thread {

        /* renamed from: a */
        Boolean f3976a;

        /* renamed from: b */
        Boolean f3977b = true;

        public C1603b() {
            this.f3976a = false;
            this.f3976a = true;
        }

        public C1603b(long j) {
            this.f3976a = false;
            C1600b.this.f3953j = j;
            this.f3976a = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Message message = new Message();
            message.what = 1;
            if (this.f3976a.booleanValue()) {
                this.f3977b = Boolean.valueOf(C1600b.this.m35004q());
            } else {
                this.f3977b = Boolean.valueOf(C1600b.this.m35002r());
            }
            if (this.f3977b.booleanValue()) {
                long j = C1600b.this.f3953j / 1;
                C1600b.this.f3960q = new ArrayList();
                for (int i = 0; i < 1; i++) {
                    C1600b.this.f3960q.add(new C1614d(i, i * j, (i + 1) * j, 0L, C1600b.this.f3958o));
                }
                C1617f m34967a = C1617f.m34967a(C1600b.this.f3962s);
                m34967a.m34963a(C1600b.this.f3960q);
                m34967a.m34965a(C1600b.this);
                C1600b.this.f3954k = 0L;
                message.arg1 = 1;
            } else {
                message.arg1 = 0;
            }
            if (C1600b.this.f3963t != null) {
                C1600b.this.f3963t.sendMessage(message);
            }
        }
    }

    /* renamed from: com.fimi.kernel.b.b.b$c */
    /* loaded from: classes.dex */
    private class RunnableC1604c implements Runnable {

        /* renamed from: b */
        private boolean f3980b = false;

        /* renamed from: c */
        private C1614d f3981c;

        public RunnableC1604c(C1614d c1614d) {
            this.f3981c = c1614d;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            InputStream inputStream;
            int i;
            HttpURLConnection httpURLConnection2 = null;
            InputStream inputStream2 = null;
            long m34974e = this.f3981c.m34974e();
            try {
                long m34977c = this.f3981c.m34977c();
                long m34975d = this.f3981c.m34975d();
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(this.f3981c.m34983a()).openConnection();
                try {
                    try {
                        httpURLConnection3.setConnectTimeout(3000);
                        httpURLConnection3.setReadTimeout(3000);
                        httpURLConnection3.setRequestMethod("GET");
                        httpURLConnection3.setRequestProperty("Range", "bytes=" + (m34977c + m34974e) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + m34975d);
                        RandomAccessFile randomAccessFile = new RandomAccessFile(C1600b.this.m35022h(), "rwd");
                        randomAccessFile.seek(m34977c + m34974e);
                        InputStream inputStream3 = httpURLConnection3.getInputStream();
                        try {
                            byte[] bArr = new byte[5120];
                            int i2 = 0;
                            long j = 0;
                            long j2 = m34974e;
                            while (true) {
                                int i3 = i2;
                                int read = inputStream3.read(bArr);
                                if (read != -1 && !this.f3980b) {
                                    randomAccessFile.write(bArr, 0, read);
                                    j2 += read;
                                    this.f3981c.m34976c(j2);
                                    synchronized (C1600b.this.f3960q) {
                                        i = 0;
                                        for (C1614d c1614d : C1600b.this.f3960q) {
                                            i = (int) (i + c1614d.m34974e());
                                        }
                                    }
                                    C1600b.this.f3954k = i;
                                    C1600b.this.f3949a = (float) ((System.currentTimeMillis() - C1600b.this.f3968y) / 1000);
                                    if (C1600b.this.f3949a >= 1.0f) {
                                        C1600b.this.f3968y = System.currentTimeMillis();
                                        C1600b.this.f3956m = ((float) (C1600b.this.f3954k - C1600b.this.f3955l)) / C1600b.this.f3949a;
                                        C1600b.this.f3955l = C1600b.this.f3954k;
                                        C1685x.m34457a(new Runnable() { // from class: com.fimi.kernel.b.b.b.c.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                C1617f.m34967a(C1600b.this.f3962s).m34968a(RunnableC1604c.this.f3981c.m34979b(), RunnableC1604c.this.f3981c.m34974e(), RunnableC1604c.this.f3981c.m34983a());
                                            }
                                        });
                                    }
                                    Message obtain = Message.obtain();
                                    obtain.what = 2;
                                    obtain.arg1 = read;
                                    if (C1600b.this.f3954k >= C1600b.this.f3953j) {
                                        try {
                                            if (C1600b.this.f3966w == null) {
                                                if (C1663g.m34736g(C1600b.this.f3957n)) {
                                                    C1600b.this.f3966w = ThumbnailUtils.createVideoThumbnail(C1600b.this.f3957n, 1);
                                                    C1600b.this.f3967x = C1678s.m34592a(C1600b.this.f3962s, C1600b.this.f3957n);
                                                } else {
                                                    C1600b.this.f3966w = C1678s.m34591a(C1600b.this.f3962s, C1600b.this.f3957n, 160);
                                                }
                                            }
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                        C1617f.m34967a(C1600b.this.f3962s).m34957d(C1600b.this.f3958o);
                                        C1600b.this.f3962s.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(C1600b.this.m35022h()))));
                                    }
                                    i2 = (int) (C1600b.this.f3954k / (C1600b.this.f3953j / 100));
                                    if (C1600b.this.f3963t != null && (i3 != i2 || j != C1600b.this.f3956m || C1600b.this.f3954k >= C1600b.this.f3953j)) {
                                        C1600b.this.f3963t.sendMessage(obtain);
                                    }
                                    j = C1600b.this.f3956m;
                                    if (C1600b.this.f3964u != EnumC1602a.Pause) {
                                    }
                                }
                                try {
                                    httpURLConnection3.disconnect();
                                    inputStream3.close();
                                    return;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            }
                        } catch (Exception e3) {
                            inputStream = inputStream3;
                            httpURLConnection = httpURLConnection3;
                            e = e3;
                            try {
                                e.printStackTrace();
                                Log.d("Good", "DOWNLOADING ERROR " + e + ",id" + this.f3981c.m34979b());
                                Message obtain2 = Message.obtain();
                                C1600b.this.f3964u = EnumC1602a.Error;
                                obtain2.what = 3;
                                if (C1600b.this.f3963t != null) {
                                    C1600b.this.f3963t.sendMessage(obtain2);
                                }
                                try {
                                    httpURLConnection.disconnect();
                                    inputStream.close();
                                } catch (Exception e4) {
                                    e4.printStackTrace();
                                }
                            } catch (Throwable th) {
                                th = th;
                                InputStream inputStream4 = inputStream;
                                httpURLConnection2 = httpURLConnection;
                                inputStream2 = inputStream4;
                                try {
                                    httpURLConnection2.disconnect();
                                    inputStream2.close();
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        httpURLConnection2 = httpURLConnection3;
                        th = th2;
                        httpURLConnection2.disconnect();
                        inputStream2.close();
                        throw th;
                    }
                } catch (Exception e6) {
                    inputStream = null;
                    httpURLConnection = httpURLConnection3;
                    e = e6;
                }
            } catch (Exception e7) {
                e = e7;
                httpURLConnection = null;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: com.fimi.kernel.b.b.b$d */
    /* loaded from: classes.dex */
    public interface AbstractC1606d {
        /* renamed from: a */
        void mo31727a(EnumC1602a enumC1602a, C1600b c1600b);
    }

    /* renamed from: com.fimi.kernel.b.b.b$e */
    /* loaded from: classes.dex */
    public interface AbstractC1607e {
        /* renamed from: a */
        void mo34956a(C1600b c1600b);
    }

    /* renamed from: com.fimi.kernel.b.b.b$f */
    /* loaded from: classes.dex */
    private class HandlerC1608f extends Handler {
        private HandlerC1608f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                C1600b c1600b = null;
                if (message.arg1 == 1) {
                    c1600b = C1600b.this;
                }
                C1600b.this.f3950g.mo34956a(c1600b);
            }
            if (message.what == 2) {
                if (C1600b.this.f3954k >= C1600b.this.f3953j) {
                    C1600b.this.f3964u = EnumC1602a.Completed;
                }
                if (C1600b.this.f3952i != null) {
                    C1600b.this.f3952i.mo31727a(C1600b.this.f3964u, C1600b.this);
                }
                if (C1600b.this.f3951h != null) {
                    C1600b.this.f3951h.mo31727a(C1600b.this.f3964u, C1600b.this);
                }
            }
            if (message.what != 3 || C1600b.this.f3951h == null) {
                return;
            }
            C1600b.this.f3951h.mo31727a(C1600b.this.f3964u, C1600b.this);
        }
    }

    private C1600b() {
        this.f3955l = this.f3954k;
        this.f3956m = 0L;
        this.f3961r = new ArrayList();
        this.f3964u = EnumC1602a.Wait;
        this.f3968y = System.currentTimeMillis();
        this.f3949a = 1.0f;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.f3963t = new HandlerC1608f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C1600b(String str, String str2) {
        this();
        this.f3957n = str2;
        this.f3958o = str;
    }

    /* renamed from: a */
    protected static C1600b m35055a(Context context, String str) {
        C1600b m34961b = C1617f.m34967a(context).m34961b(str);
        if (m34961b != null) {
            m34961b.f3962s = context;
            m34961b.f3960q = C1617f.m34967a(context).m34959c(m34961b.m35012m());
            long j = 0;
            long j2 = 0;
            for (C1614d c1614d : m34961b.f3960q) {
                j2 += c1614d.m34974e();
                j = (c1614d.m34975d() - c1614d.m34977c()) + j;
            }
            m34961b.f3954k = j2;
            m34961b.f3953j = j;
        }
        return m34961b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static C1600b m35054a(Context context, String str, long j, Boolean bool, String str2, AbstractC1607e abstractC1607e) {
        if (abstractC1607e == null || context == null) {
            return null;
        }
        C1600b m35055a = m35055a(context, str);
        if (m35055a != null) {
            m35055a.f3959p = str.substring(str.lastIndexOf("/") + 1);
            m35055a.f3962s = context;
            abstractC1607e.mo34956a(m35055a);
            return m35055a;
        }
        C1600b c1600b = new C1600b();
        c1600b.f3962s = context;
        c1600b.f3958o = str;
        c1600b.f3957n = str2;
        c1600b.f3959p = str.substring(str.lastIndexOf("/") + 1);
        c1600b.f3950g = abstractC1607e;
        if (bool.booleanValue()) {
            c1600b.m35006p();
            return c1600b;
        }
        c1600b.m35043a(Long.valueOf(j));
        return c1600b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static C1600b m35053a(Context context, String str, String str2, long j, Boolean bool, String str3, AbstractC1607e abstractC1607e) {
        if (abstractC1607e == null || context == null) {
            return null;
        }
        C1600b c1600b = new C1600b();
        c1600b.f3962s = context;
        c1600b.f3958o = str;
        c1600b.f3957n = str3;
        c1600b.f3959p = str.substring(str.lastIndexOf("/") + 1);
        c1600b.f3950g = abstractC1607e;
        if (C1663g.m34736g(str3)) {
            c1600b.f3967x = str2;
        }
        if (bool.booleanValue()) {
            c1600b.m35006p();
            return c1600b;
        }
        c1600b.m35043a(Long.valueOf(j));
        return c1600b;
    }

    /* renamed from: a */
    private void m35043a(Long l) {
        new C1603b(l.longValue()).start();
    }

    /* renamed from: b */
    protected static void m35039b(Context context, String str, long j, Boolean bool, String str2, AbstractC1607e abstractC1607e) {
        if (abstractC1607e == null || context == null) {
            return;
        }
        C1600b m35055a = m35055a(context, str);
        if (m35055a != null) {
            m35055a.f3962s = context;
            abstractC1607e.mo34956a(m35055a);
            return;
        }
        C1600b c1600b = new C1600b();
        c1600b.f3962s = context;
        c1600b.f3958o = str;
        c1600b.f3957n = str2;
        c1600b.f3959p = str.substring(str.lastIndexOf("/") + 1);
        c1600b.f3950g = abstractC1607e;
        if (bool.booleanValue()) {
            c1600b.m35006p();
        } else {
            c1600b.m35043a(Long.valueOf(j));
        }
    }

    /* renamed from: p */
    private void m35006p() {
        new C1603b().start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public boolean m35004q() {
        File file = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f3958o).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            this.f3953j = httpURLConnection.getContentLength();
            Log.d("Good", "获取文件大小" + this.f3958o + ":" + this.f3953j);
            file = C1663g.m34737f(this.f3957n);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            randomAccessFile.setLength(FimiMediaMeta.AV_CH_SIDE_RIGHT);
            randomAccessFile.close();
            httpURLConnection.disconnect();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("Good", "File 获取文件错误" + e);
            if (file != null) {
                file.delete();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public boolean m35002r() {
        File file = null;
        try {
            file = C1663g.m34737f(this.f3957n);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            randomAccessFile.setLength(FimiMediaMeta.AV_CH_SIDE_RIGHT);
            randomAccessFile.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("Good", "File 获取文件错误" + e);
            if (file != null) {
                file.delete();
            }
            return false;
        }
    }

    /* renamed from: a */
    public String m35056a() {
        return this.f3967x;
    }

    /* renamed from: a */
    public void m35052a(Handler handler) {
        handler.post(new Runnable() { // from class: com.fimi.kernel.b.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                C1600b.this.f3963t = new HandlerC1608f();
            }
        });
    }

    /* renamed from: a */
    public void m35051a(AbstractC1606d abstractC1606d) {
        this.f3951h = abstractC1606d;
    }

    /* renamed from: a */
    public void m35050a(C1600b c1600b) {
        if (c1600b == null || c1600b.f3961r == null || c1600b.f3961r.size() <= 0) {
            return;
        }
        for (int size = this.f3961r.size() - 1; size >= 0; size--) {
            this.f3961r.get(size).f3980b = true;
        }
        this.f3961r.clear();
    }

    /* renamed from: a */
    public void m35042a(Object obj) {
        this.f3965v = obj;
    }

    /* renamed from: a */
    public void m35041a(String str) {
        this.f3967x = str;
    }

    /* renamed from: b */
    public String m35040b() {
        return this.f3959p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m35038b(AbstractC1606d abstractC1606d) {
        this.f3952i = abstractC1606d;
    }

    /* renamed from: c */
    public void m35035c() {
        if (this.f3960q != null) {
            if (this.f3964u == EnumC1602a.Downloading) {
                return;
            }
            this.f3964u = EnumC1602a.Downloading;
            for (C1614d c1614d : this.f3960q) {
                if (c1614d.m34977c() + c1614d.m34974e() < c1614d.m34975d()) {
                    RunnableC1604c runnableC1604c = new RunnableC1604c(c1614d);
                    f3944b.execute(runnableC1604c);
                    this.f3961r.add(runnableC1604c);
                }
            }
        }
        if (this.f3964u == EnumC1602a.Error) {
            Log.d("Good", "重新初始化任务信息");
            m35006p();
        }
    }

    /* renamed from: d */
    public void m35032d() {
        this.f3964u = EnumC1602a.Wait;
    }

    /* renamed from: e */
    public void m35029e() {
        this.f3964u = EnumC1602a.Pause;
    }

    /* renamed from: f */
    public void m35026f() {
        this.f3964u = EnumC1602a.Completed;
    }

    /* renamed from: g */
    public EnumC1602a m35024g() {
        return this.f3964u;
    }

    /* renamed from: h */
    public String m35022h() {
        return this.f3957n;
    }

    /* renamed from: i */
    public long m35020i() {
        return this.f3953j;
    }

    /* renamed from: j */
    public Object m35018j() {
        return this.f3965v;
    }

    /* renamed from: k */
    public long m35016k() {
        return this.f3954k;
    }

    /* renamed from: l */
    public long m35014l() {
        return this.f3956m;
    }

    /* renamed from: m */
    public String m35012m() {
        return this.f3958o;
    }

    /* renamed from: n */
    public Bitmap m35010n() {
        return this.f3966w;
    }

    /* renamed from: o */
    public AbstractC1606d m35008o() {
        return this.f3951h;
    }

    public String toString() {
        return "DownloadTaskInfo{fileSize=" + this.f3953j + ", complete=" + this.f3954k + ", urlstring='" + this.f3958o + C0494h.f738z + C0494h.f735w;
    }
}
