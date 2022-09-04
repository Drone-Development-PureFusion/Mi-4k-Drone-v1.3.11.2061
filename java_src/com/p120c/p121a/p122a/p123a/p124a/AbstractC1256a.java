package com.p120c.p121a.p122a.p123a.p124a;

import android.graphics.Bitmap;
import com.p120c.p121a.p122a.p123a.AbstractC1255a;
import com.p120c.p121a.p122a.p123a.p126b.AbstractC1270a;
import com.p120c.p121a.p129b.C1284a;
import com.p120c.p121a.p138c.C1354c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
/* renamed from: com.c.a.a.a.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC1256a implements AbstractC1255a {

    /* renamed from: a */
    public static final int f3118a = 32768;

    /* renamed from: b */
    public static final Bitmap.CompressFormat f3119b = Bitmap.CompressFormat.PNG;

    /* renamed from: c */
    public static final int f3120c = 100;

    /* renamed from: j */
    private static final String f3121j = " argument must be not null";

    /* renamed from: k */
    private static final String f3122k = ".tmp";

    /* renamed from: d */
    protected final File f3123d;

    /* renamed from: e */
    protected final File f3124e;

    /* renamed from: f */
    protected final AbstractC1270a f3125f;

    /* renamed from: g */
    protected int f3126g;

    /* renamed from: h */
    protected Bitmap.CompressFormat f3127h;

    /* renamed from: i */
    protected int f3128i;

    public AbstractC1256a(File file) {
        this(file, null);
    }

    public AbstractC1256a(File file, File file2) {
        this(file, file2, C1284a.m35952b());
    }

    public AbstractC1256a(File file, File file2, AbstractC1270a abstractC1270a) {
        this.f3126g = 32768;
        this.f3127h = f3119b;
        this.f3128i = 100;
        if (file == null) {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        }
        if (abstractC1270a == null) {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        }
        this.f3123d = file;
        this.f3124e = file2;
        this.f3125f = abstractC1270a;
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: a */
    public File mo35992a() {
        return this.f3123d;
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: a */
    public File mo35979a(String str) {
        return m36062c(str);
    }

    /* renamed from: a */
    public void m36065a(int i) {
        this.f3126g = i;
    }

    /* renamed from: a */
    public void m36064a(Bitmap.CompressFormat compressFormat) {
        this.f3127h = compressFormat;
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: a */
    public boolean mo35978a(String str, Bitmap bitmap) {
        File m36062c = m36062c(str);
        File file = new File(m36062c.getAbsolutePath() + f3122k);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.f3126g);
        try {
            boolean compress = bitmap.compress(this.f3127h, this.f3128i, bufferedOutputStream);
            C1354c.m35619a(bufferedOutputStream);
            if (compress && !file.renameTo(m36062c)) {
                compress = false;
            }
            if (!compress) {
                file.delete();
            }
            bitmap.recycle();
            return compress;
        } catch (Throwable th) {
            C1354c.m35619a(bufferedOutputStream);
            file.delete();
            throw th;
        }
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: a */
    public boolean mo35977a(String str, InputStream inputStream, C1354c.AbstractC1355a abstractC1355a) {
        boolean z;
        BufferedOutputStream bufferedOutputStream;
        File m36062c = m36062c(str);
        File file = new File(m36062c.getAbsolutePath() + f3122k);
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.f3126g);
            z = C1354c.m35616a(inputStream, bufferedOutputStream, abstractC1355a, this.f3126g);
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        try {
            C1354c.m35619a(bufferedOutputStream);
            if (z && !file.renameTo(m36062c)) {
                z = false;
            }
            if (!z) {
                file.delete();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            if (z && !file.renameTo(m36062c)) {
                z = false;
            }
            if (!z) {
                file.delete();
            }
            throw th;
        }
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: b */
    public void mo35988b() {
    }

    /* renamed from: b */
    public void m36063b(int i) {
        this.f3128i = i;
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: b */
    public boolean mo35976b(String str) {
        return m36062c(str).delete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public File m36062c(String str) {
        String mo35973a = this.f3125f.mo35973a(str);
        File file = this.f3123d;
        if (!this.f3123d.exists() && !this.f3123d.mkdirs() && this.f3124e != null && (this.f3124e.exists() || this.f3124e.mkdirs())) {
            file = this.f3124e;
        }
        return new File(file, mo35973a);
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: c */
    public void mo35975c() {
        File[] listFiles = this.f3123d.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
    }
}
