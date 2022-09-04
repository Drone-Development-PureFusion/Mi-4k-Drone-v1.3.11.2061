package com.p120c.p121a.p122a.p123a.p124a.p125a;

import android.graphics.Bitmap;
import com.p120c.p121a.p122a.p123a.AbstractC1255a;
import com.p120c.p121a.p122a.p123a.p124a.p125a.C1257a;
import com.p120c.p121a.p122a.p123a.p126b.AbstractC1270a;
import com.p120c.p121a.p138c.C1354c;
import com.p120c.p121a.p138c.C1356d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.c.a.a.a.a.a.b */
/* loaded from: classes.dex */
public class C1264b implements AbstractC1255a {

    /* renamed from: a */
    public static final int f3176a = 32768;

    /* renamed from: b */
    public static final Bitmap.CompressFormat f3177b = Bitmap.CompressFormat.PNG;

    /* renamed from: c */
    public static final int f3178c = 100;

    /* renamed from: i */
    private static final String f3179i = " argument must be not null";

    /* renamed from: j */
    private static final String f3180j = " argument must be positive number";

    /* renamed from: d */
    protected C1257a f3181d;

    /* renamed from: e */
    protected final AbstractC1270a f3182e;

    /* renamed from: f */
    protected int f3183f;

    /* renamed from: g */
    protected Bitmap.CompressFormat f3184g;

    /* renamed from: h */
    protected int f3185h;

    /* renamed from: k */
    private File f3186k;

    public C1264b(File file, AbstractC1270a abstractC1270a, long j) {
        this(file, null, abstractC1270a, j, 0);
    }

    public C1264b(File file, File file2, AbstractC1270a abstractC1270a, long j, int i) {
        this.f3183f = 32768;
        this.f3184g = f3177b;
        this.f3185h = 100;
        if (file == null) {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("cacheMaxSize argument must be positive number");
        }
        if (i < 0) {
            throw new IllegalArgumentException("cacheMaxFileCount argument must be positive number");
        }
        if (abstractC1270a == null) {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        }
        long j2 = j == 0 ? Long.MAX_VALUE : j;
        int i2 = i == 0 ? Integer.MAX_VALUE : i;
        this.f3186k = file2;
        this.f3182e = abstractC1270a;
        m35989a(file, file2, j2, i2);
    }

    /* renamed from: a */
    private void m35989a(File file, File file2, long j, int i) {
        try {
            this.f3181d = C1257a.m36053a(file, 1, 1, j, i);
        } catch (IOException e) {
            C1356d.m35611a(e);
            if (file2 != null) {
                m35989a(file2, null, j, i);
            }
            if (this.f3181d != null) {
                return;
            }
            throw e;
        }
    }

    /* renamed from: c */
    private String m35986c(String str) {
        return this.f3182e.mo35973a(str);
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: a */
    public File mo35992a() {
        return this.f3181d.m36061a();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0029  */
    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File mo35979a(String str) {
        C1257a.C1263c c1263c;
        Throwable th;
        File file = null;
        try {
            c1263c = this.f3181d.m36050a(m35986c(str));
            if (c1263c != null) {
                try {
                    try {
                        file = c1263c.m35996a(0);
                    } catch (IOException e) {
                        e = e;
                        C1356d.m35611a(e);
                        if (c1263c != null) {
                            c1263c.close();
                        }
                        return file;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (c1263c != null) {
                        c1263c.close();
                    }
                    throw th;
                }
            }
            if (c1263c != null) {
                c1263c.close();
            }
        } catch (IOException e2) {
            e = e2;
            c1263c = null;
        } catch (Throwable th3) {
            c1263c = null;
            th = th3;
            if (c1263c != null) {
            }
            throw th;
        }
        return file;
    }

    /* renamed from: a */
    public void m35991a(int i) {
        this.f3183f = i;
    }

    /* renamed from: a */
    public void m35990a(Bitmap.CompressFormat compressFormat) {
        this.f3184g = compressFormat;
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: a */
    public boolean mo35978a(String str, Bitmap bitmap) {
        boolean z = false;
        C1257a.C1260a m36045b = this.f3181d.m36045b(m35986c(str));
        if (m36045b != null) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m36045b.m36012c(0), this.f3183f);
            try {
                z = bitmap.compress(this.f3184g, this.f3185h, bufferedOutputStream);
                if (z) {
                    m36045b.m36021a();
                } else {
                    m36045b.m36016b();
                }
            } finally {
                C1354c.m35619a(bufferedOutputStream);
            }
        }
        return z;
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: a */
    public boolean mo35977a(String str, InputStream inputStream, C1354c.AbstractC1355a abstractC1355a) {
        boolean z = false;
        C1257a.C1260a m36045b = this.f3181d.m36045b(m35986c(str));
        if (m36045b != null) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m36045b.m36012c(0), this.f3183f);
            try {
                z = C1354c.m35616a(inputStream, bufferedOutputStream, abstractC1355a, this.f3183f);
                C1354c.m35619a(bufferedOutputStream);
                if (z) {
                    m36045b.m36021a();
                } else {
                    m36045b.m36016b();
                }
            } catch (Throwable th) {
                C1354c.m35619a(bufferedOutputStream);
                m36045b.m36016b();
                throw th;
            }
        }
        return z;
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: b */
    public void mo35988b() {
        try {
            this.f3181d.close();
        } catch (IOException e) {
            C1356d.m35611a(e);
        }
        this.f3181d = null;
    }

    /* renamed from: b */
    public void m35987b(int i) {
        this.f3185h = i;
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: b */
    public boolean mo35976b(String str) {
        try {
            return this.f3181d.m36042c(m35986c(str));
        } catch (IOException e) {
            C1356d.m35611a(e);
            return false;
        }
    }

    @Override // com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: c */
    public void mo35975c() {
        try {
            this.f3181d.m36031h();
        } catch (IOException e) {
            C1356d.m35611a(e);
        }
        try {
            m35989a(this.f3181d.m36061a(), this.f3186k, this.f3181d.m36048b(), this.f3181d.m36044c());
        } catch (IOException e2) {
            C1356d.m35611a(e2);
        }
    }
}
